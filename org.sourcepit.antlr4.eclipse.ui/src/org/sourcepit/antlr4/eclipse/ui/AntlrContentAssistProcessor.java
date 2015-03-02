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

import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class AntlrContentAssistProcessor implements IContentAssistProcessor {

   @Override
   public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
      return new ICompletionProposal[] { new CompletionProposal("Hallo", offset, "Hallo".length(), 0) };
   }

   @Override
   public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
      return null;
   }

   @Override
   public char[] getCompletionProposalAutoActivationCharacters() {
      return null;
   }

   @Override
   public char[] getContextInformationAutoActivationCharacters() {
      return null;
   }

   @Override
   public String getErrorMessage() {
      return null;
   }

   @Override
   public IContextInformationValidator getContextInformationValidator() {
      return null;
   }

}
