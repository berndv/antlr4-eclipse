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

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class AntlrSourceViewerConfiguration extends TextSourceViewerConfiguration {

   private final ColorManager colorManager;

   public AntlrSourceViewerConfiguration(IPreferenceStore preferenceStore, ColorManager colorManager) {
      super(preferenceStore);
      this.colorManager = colorManager;
   }

   @Override
   public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
      ContentAssistant assistant = new ContentAssistant();
      assistant.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));

      IContentAssistProcessor javaProcessor = new AntlrContentAssistProcessor();
      assistant.setContentAssistProcessor(javaProcessor, IDocument.DEFAULT_CONTENT_TYPE);

      return assistant;
   }

   @Override
   public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
      PresentationReconciler reconciler = new PresentationReconciler();
      reconciler.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));
      reconciler.setDamager(new DefaultDamagerRepairer(new AntlrTokenScanner(colorManager)),
         IDocument.DEFAULT_CONTENT_TYPE);
      reconciler.setRepairer(new DefaultDamagerRepairer(new AntlrTokenScanner(colorManager)),
         IDocument.DEFAULT_CONTENT_TYPE);
      return reconciler;
   }
}
