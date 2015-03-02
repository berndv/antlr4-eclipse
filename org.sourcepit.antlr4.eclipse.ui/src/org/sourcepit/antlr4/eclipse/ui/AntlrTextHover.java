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
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.eclipse.jface.text.DefaultInformationControl;
import org.eclipse.jface.text.DefaultTextHover;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextHoverExtension;
import org.eclipse.jface.text.ITextHoverExtension2;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.editors.text.EditorsUI;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.GrammarSpecContext;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class AntlrTextHover extends DefaultTextHover implements ITextHover, ITextHoverExtension, ITextHoverExtension2 {

   public AntlrTextHover(ISourceViewer sourceViewer) {
      super(sourceViewer);
   }

   @Override
   public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
      return getHoverInfo2(textViewer, hoverRegion);
   }

   @Override
   public IInformationControlCreator getHoverControlCreator() {
      return new IInformationControlCreator() {
         public IInformationControl createInformationControl(Shell parent) {
            return new DefaultInformationControl(parent, EditorsUI.getTooltipAffordanceString());
         }
      };
   }

   @Override
   public String getHoverInfo2(ITextViewer textViewer, final IRegion hoverRegion) {

      final IDocument document = textViewer.getDocument();

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
            final int offset = node.getSymbol().getStartIndex();
            if (offset >= hoverRegion.getOffset()) {
               if (node.getSymbol().getText().length() <= hoverRegion.getLength()) {
                  return node;
               }
            }
            return super.visitTerminal(node);
         }

         @Override
         protected boolean shouldVisitNextChild(RuleNode node, TerminalNode currentResult) {
            return currentResult == null;
         }
      });

      return node == null ? null : node.toString();
   }

}
