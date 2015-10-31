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

package org.sourcepit.antlr4.eclipse.lang;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuleContext;
import org.sourcepit.ltk.parser.ParseNode;

public final class ParseNodeUtils {
   private ParseNodeUtils() {
      super();
   }

   public static boolean isTerminalOfType(ParseNode node, Class<? extends Lexer> sourceType, int tokenType) {
      return node.isTerminal() && node.asTerminal().getToken().getType().is(sourceType, tokenType);
   }

   public static boolean isRuleOfType(ParseNode node, Class<? extends RuleContext> type) {
      return node.isRule() && node.asRule().getType() == type;
   }
}
