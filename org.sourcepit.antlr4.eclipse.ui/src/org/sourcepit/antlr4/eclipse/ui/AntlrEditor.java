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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.sourcepit.antlr4.eclipse.lang.symbols.Symbol;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class AntlrEditor extends TextEditor {

   private final ColorManager colorManager;

   private AntlrOutlinePage outlinePage;

   public AntlrEditor() {
      this.colorManager = new ColorManager();
      setSourceViewerConfiguration(new AntlrSourceViewerConfiguration(Activator.getDefault().getPreferenceStore(),
         colorManager));
   }

   @Override
   protected void initializeKeyBindingScopes() {
      setKeyBindingScopes(new String[] { "org.sourcepit.antlr4.editGrammarsScope" });
   }

   @Override
   protected void initializeEditor() {
      super.initializeEditor();
      setEditorContextMenuId("#AntlrEditorContext"); //$NON-NLS-1$
      setRulerContextMenuId("#AntlrRulerContext"); //$NON-NLS-1$
   }

   @Override
   public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
      if (IContentOutlinePage.class.equals(adapter)) {
         if (outlinePage == null) {
            outlinePage = new AntlrOutlinePage();
            outlinePage.addSelectionChangedListener(new ISelectionChangedListener() {
               @Override
               public void selectionChanged(SelectionChangedEvent event) {
                  final ISelection selection = event.getSelection();
                  outlineSelectionChanged((IStructuredSelection) selection);
               }
            });
            final IEditorInput editorInput = getEditorInput();
            if (editorInput != null) {
               final IDocument document = getDocumentProvider().getDocument(editorInput);
               outlinePage.setInput(document);
            }
         }
         return outlinePage;
      }
      return super.getAdapter(adapter);
   }

   @Override
   protected void doSetInput(IEditorInput input) throws CoreException {
      super.doSetInput(input);
      if (outlinePage != null) {
         final IDocument document = getDocumentProvider().getDocument(input);
         outlinePage.setInput(document);
      }
   }

   private void outlineSelectionChanged(IStructuredSelection selection) {
      final Object firstElement = selection.getFirstElement();
      if (firstElement instanceof Symbol<?>) {
         final Symbol<?> symbol = (Symbol<?>) firstElement;
         final ITextSelection textSelection = OpenDeclarationHandler.toTextSelection(symbol);
         getSelectionProvider().setSelection(textSelection);
      }
   }

   @Override
   public void dispose() {
      super.dispose();
      colorManager.dispose();
   }
}
