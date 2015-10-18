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

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.sourcepit.antlr4.eclipse.lang.symbols.AbstractRuleSymbol;
import org.sourcepit.antlr4.eclipse.lang.symbols.GrammarSymbol;
import org.sourcepit.antlr4.eclipse.lang.symbols.LexerRuleSymbol;
import org.sourcepit.antlr4.eclipse.lang.symbols.ParserRuleSymbol;
import org.sourcepit.ltk.ast.Terminal;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class AntlrSymbolsLabelProvider extends LabelProvider {
   @Override
   public String getText(Object element) {
      if (element instanceof AbstractRuleSymbol) {
         final AbstractRuleSymbol<?> ruleSymbol = (AbstractRuleSymbol<?>) element;
         final Terminal name = ruleSymbol.getName();
         return name.getToken();
      }
      else if (element instanceof GrammarSymbol) {
         final GrammarSymbol grammarSymbol = (GrammarSymbol) element;
         final Terminal name = grammarSymbol.getName();
         return name.getToken();
      }

      return super.getText(element);
   }

   @Override
   public Image getImage(Object element) {
      if (element instanceof ParserRuleSymbol) {
         return Activator.getDefault().getImage("icons/parser-rule.png");
      }
      if (element instanceof LexerRuleSymbol) {
         return Activator.getDefault().getImage("icons/lexer-rule.png");
      }
      if (element instanceof GrammarSymbol) {
         return Activator.getDefault().getImage("icons/antlr-red.png");
      }
      return super.getImage(element);
   }
}
