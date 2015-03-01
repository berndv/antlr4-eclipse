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
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

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
   public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
      if (IContentOutlinePage.class.equals(adapter)) {
         if (outlinePage == null) {
            outlinePage = new AntlrOutlinePage();
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

   @Override
   public void dispose() {
      super.dispose();
      colorManager.dispose();
   }
}
