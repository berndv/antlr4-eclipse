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

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.texteditor.ITextEditor;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.GrammarSpecContext;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class OpenDeclarationHandler extends AbstractHandler {

   @Override
   public Object execute(ExecutionEvent event) throws ExecutionException {
      final ITextEditor activeEditor = (ITextEditor) HandlerUtil.getActiveEditorChecked(event);

      final ITextSelection selection = (ITextSelection) activeEditor.getSite().getSelectionProvider().getSelection();


      final IDocument document = activeEditor.getDocumentProvider().getDocument(activeEditor.getEditorInput());
      final int selectionOffset = selection.getOffset();
      final int selectionLength = selection.getLength();

      final TerminalNode node = findFirstNodeTouchedByRange(document, selectionOffset, selectionLength);
      if (node != null) {
         System.out.println(node.getParent().getClass());
      }

      return null;
   }

   private TerminalNode findFirstNodeTouchedByRange(final IDocument document, final int selectionOffset,
      final int selectionLength) {
      final ANTLRInputStream input;
      try {
         input = new ANTLRInputStream(new DocumentRangeReader(document, 0, document.getLength()));
      }
      catch (IOException e) {
         throw new IllegalStateException(e);
      }
      final ANTLRv4Parser parser = new ANTLRv4Parser(new CommonTokenStream(new ANTLRv4Lexer(input)));

      GrammarSpecContext root = parser.grammarSpec();

      TerminalNode node = root.accept(new AbstractParseTreeVisitor<TerminalNode>() {
         @Override
         public TerminalNode visitTerminal(TerminalNode node) {
            if (isTouchedByRange(node.getSymbol(), selectionOffset, selectionLength)) {
               return node;
            }
            return super.visitTerminal(node);
         }

         private boolean isTouchedByRange(Token token, int selectionOffset, int selectionLength) {
            final int nodeOffset = token.getStartIndex();
            if (nodeOffset >= selectionOffset && nodeOffset <= selectionOffset + selectionLength) {
               return true;
            }
            if (selectionOffset >= nodeOffset && selectionOffset <= nodeOffset + token.getText().length()) {
               return true;
            }
            return false;
         }

         @Override
         protected boolean shouldVisitNextChild(RuleNode node, TerminalNode currentResult) {
            return currentResult == null;
         }
      });

      return node;
   }

}
