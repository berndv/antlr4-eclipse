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

package org.sourcepit.ltk.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;

public class Rule implements AstNode {

   private final Rule parent;

   private final List<AstNode> children;

   private final Class<? extends RuleContext> type;

   private final Terminal origin;

   public Rule(Rule parent, List<AstNode> children, Class<? extends RuleContext> type, Terminal origin) {
      this.parent = parent;
      this.children = Collections.unmodifiableList(children);
      this.type = type;
      this.origin = origin;
   }

   @Override
   public boolean isRoot() {
      return parent == null;
   }

   @Override
   public boolean isRule() {
      return true;
   }

   @Override
   public boolean isTerminal() {
      return false;
   }

   @Override
   public Rule getParent() {
      return parent;
   }

   @Override
   public List<AstNode> getChildren() {
      return children;
   }

   public List<AstNode> getVisibleChildren() {
      final List<AstNode> visibleChildren = new ArrayList<>();
      for (AstNode child : getChildren()) {
         if (child.isRule() || ((Terminal) child).getChannel() == Token.DEFAULT_CHANNEL) {
            visibleChildren.add(child);
         }
      }
      return visibleChildren;
   }

   public Class<? extends RuleContext> getType() {
      return type;
   }

   @Override
   public boolean isNestedLanguage() {
      return origin != null;
   }

   @Override
   public Terminal getOrigin() {
      return origin;
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


}
