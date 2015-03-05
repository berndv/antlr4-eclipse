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

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.part.Page;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class AntlrOutlinePage extends Page implements IContentOutlinePage {

   private ListenerList selectionChangedListeners = new ListenerList(ListenerList.IDENTITY);

   private TreeViewer outlineViewer;

   private IDocument document;

   @Override
   public void createControl(Composite parent) {
      outlineViewer = new TreeViewer(parent);
      outlineViewer.setContentProvider(new AntlrSymbolsContentProvider());
      outlineViewer.setLabelProvider(new AntlrSymbolsLabelProvider());
      final Object[] listeners = selectionChangedListeners.getListeners();
      for (int i = 0; i < listeners.length; i++) {
         selectionChangedListeners.remove(listeners[i]);
         outlineViewer.addSelectionChangedListener((ISelectionChangedListener) listeners[i]);
      }
      outlineViewer.setAutoExpandLevel(2);
      outlineViewer.setInput(document);
   }

   public void setInput(IDocument document) {
      this.document = document;
      if (outlineViewer != null) {
         outlineViewer.setInput(document);
      }
   }

   @Override
   public void dispose() {
      super.dispose();

      selectionChangedListeners.clear();
      selectionChangedListeners = null;

      outlineViewer = null;

      document = null;
   }

   @Override
   public Control getControl() {
      return outlineViewer == null ? null : outlineViewer.getControl();
   }

   @Override
   public void setFocus() {
      final Control control = getControl();
      if (control != null) {
         control.setFocus();
      }
   }

   @Override
   public void addSelectionChangedListener(ISelectionChangedListener listener) {
      if (outlineViewer != null) {
         outlineViewer.addSelectionChangedListener(listener);
      }
      else {
         selectionChangedListeners.add(listener);
      }
   }

   @Override
   public void removeSelectionChangedListener(ISelectionChangedListener listener) {
      if (outlineViewer != null) {
         outlineViewer.removeSelectionChangedListener(listener);
      }
      else {
         selectionChangedListeners.remove(listener);
      }
   }

   @Override
   public void setSelection(ISelection selection) {
      if (outlineViewer != null) {
         outlineViewer.setSelection(selection);
      }
   }

   @Override
   public ISelection getSelection() {
      return outlineViewer == null ? StructuredSelection.EMPTY : outlineViewer.getSelection();
   }
}
