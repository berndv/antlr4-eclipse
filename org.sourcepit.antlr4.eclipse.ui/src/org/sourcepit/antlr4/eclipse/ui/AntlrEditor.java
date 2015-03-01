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

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.IDocumentProvider;


public class AntlrEditor extends TextEditor {
   public AntlrEditor() {
      setSourceViewerConfiguration(new AntlrSourceViewerConfiguration(Activator.getDefault().getPreferenceStore()));
   }

   @Override
   public void init(IEditorSite site, IEditorInput input) throws PartInitException {
      // TODO: git_user_name Auto-generated method stub
      super.init(site, input);

      IDocumentProvider documentProvider = getDocumentProvider();
      System.out.println(documentProvider);
   }
}
