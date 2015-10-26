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

import java.util.Collections;

public class Terminal extends AbstractParseNode {

   private final Token token;

   public Terminal(Rule parent, Token token, Terminal origin) {
      super(parent, Collections.<ParseNode> emptyList(), origin);
      this.token = token;
   }

   @Override
   public boolean isRule() {
      return false;
   }

   @Override
   public Rule asRule() {
      return null;
   }

   @Override
   public boolean isTerminal() {
      return true;
   }

   @Override
   public Terminal asTerminal() {
      return this;
   }

   public Token getToken() {
      return token;
   }

   @Override
   public boolean accept(ParseTreeVisitor visitor) {
      return visitor.visit(this);
   }

   @Override
   public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("Terminal [token=");
      builder.append(token);
      if (isNestedLanguage()) {
         builder.append(", nestedLanguage=");
         builder.append(isNestedLanguage());
      }
      builder.append("]");
      return builder.toString();
   }

}
