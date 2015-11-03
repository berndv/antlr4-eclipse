/*
 * Copyright 2015 Bernd Vogt and others.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sourcepit.antlr4.eclipse.ui;

import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.GrammarSpecContext;
import org.sourcepit.antlr4.eclipse.lang.AntlrParserDelegate;
import org.sourcepit.antlr4.eclipse.lang.symbols.GrammarSymbol;
import org.sourcepit.antlr4.eclipse.lang.symbols.GrammarSymbolBuilder;
import org.sourcepit.antlr4.eclipse.lang.symbols.Scope;
import org.sourcepit.ltk.parser.ParseNode;
import org.sourcepit.ltk.parser.ParseTreeBuilder;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class AntlrSymbolsContentProvider implements ITreeContentProvider, IDocumentListener {

   private IDocument document;
   private Viewer viewer;

   @Override
   public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

      this.viewer = viewer;
      releaseDocument(document);
      document = (IDocument) newInput;
      if (document != null) {
         document.addDocumentListener(this);
      }
   }

   private void releaseDocument(IDocument document) {
      if (document != null) {
         document.removeDocumentListener(this);
         document = null;
      }
   }

   @Override
   public Object[] getElements(Object inputElement) {
      final ParseNode ast = new ParseTreeBuilder(new AntlrParserDelegate()).build(document.get(),
         GrammarSpecContext.class);

      final GrammarSymbolBuilder visitor = new GrammarSymbolBuilder();
      ast.accept(visitor);

      final GrammarSymbol globalScope = visitor.getGlobalScope();
      return globalScope == null ? null : new Object[] { globalScope };
   }

   @Override
   public Object[] getChildren(Object parentElement) {
      if (parentElement instanceof Scope) {
         return ((Scope<?>) parentElement).getNestedScopes().toArray();
      }
      return null;
   }

   @Override
   public Object getParent(Object element) {
      return null;
   }

   @Override
   public boolean hasChildren(Object element) {
      return element instanceof Scope && !((Scope<?>) element).getNestedScopes().isEmpty();
   }

   @Override
   public void dispose() {
      releaseDocument(document);
      viewer = null;
   }

   @Override
   public void documentAboutToBeChanged(DocumentEvent event) {
   }

   @Override
   public void documentChanged(DocumentEvent event) {
      viewer.getControl().getDisplay().asyncExec(new Runnable() {
         @Override
         public void run() {
            if (viewer != null && !viewer.getControl().isDisposed()) {
               viewer.setInput(document); // set input respects auto expand level
            }
         }
      });
   }
}
