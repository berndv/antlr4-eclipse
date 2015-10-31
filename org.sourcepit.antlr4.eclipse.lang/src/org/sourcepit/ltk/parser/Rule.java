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

package org.sourcepit.ltk.parser;

import static org.sourcepit.antlr4.eclipse.lang.ParseNodeUtils.isRuleOfType;
import static org.sourcepit.antlr4.eclipse.lang.ParseNodeUtils.isTerminalOfType;

import java.util.List;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuleContext;

public class Rule extends AbstractParseNode {

   private final Class<? extends RuleContext> type;

   public Rule(Rule parent, List<ParseNode> children, Class<? extends RuleContext> type, Terminal origin) {
      super(parent, children, origin);
      this.type = type;
   }

   @Override
   public boolean isRule() {
      return true;
   }

   @Override
   public Rule asRule() {
      return this;
   }

   @Override
   public boolean isTerminal() {
      return false;
   }

   @Override
   public Terminal asTerminal() {
      return null;
   }

   public Class<? extends RuleContext> getType() {
      return type;
   }

   @Override
   public boolean accept(ParseTreeVisitor visitor) {
      boolean accept = visitor.enter(this);
      if (accept) {
         for (ParseNode child : getChildren()) {
            accept = child.accept(visitor);
            if (!accept) {
               break;
            }
         }
      }
      visitor.leave(this);
      return accept;
   }

   @Override
   public String toString() {
      final StringBuilder builder = new StringBuilder();
      builder.append("Rule [type=");
      final String typeName = type.getSimpleName();
      if (typeName.endsWith("Context")) {
         builder.append(typeName.substring(0, typeName.length() - 7));
      }
      else {
         builder.append(typeName);
      }
      if (isNestedLanguage()) {
         builder.append(", nestedLanguage=");
         builder.append(isNestedLanguage());
      }
      builder.append("]");
      return builder.toString();
   }

   public static boolean isType(Rule rule, Class<? extends RuleContext> type) {
      return rule != null && rule.getType() == type;
   }

   @SafeVarargs
   public static boolean isType(Rule rule, Class<? extends RuleContext>... types) {
      if (rule != null) {
         for (Class<? extends RuleContext> type : types) {
            if (rule.getType() == type) {
               return true;
            }
         }
      }
      return false;
   }

   public Terminal getTerminal(Class<? extends Lexer> sourceType, int tokenType) {
      for (ParseNode child : getChildren()) {
         if (isTerminalOfType(child, sourceType, tokenType)) {
            return child.asTerminal();
         }
      }
      return null;
   }

   public Rule getRule(Class<? extends RuleContext> type) {
      for (ParseNode child : getChildren()) {
         if (isRuleOfType(child, type)) {
            return child.asRule();
         }
      }
      return null;
   }
}
