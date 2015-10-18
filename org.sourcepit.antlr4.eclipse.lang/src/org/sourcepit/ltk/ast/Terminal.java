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

import java.util.Collections;
import java.util.List;

public class Terminal implements AstNode {

   private final Rule parent;

   private final TerminalType type;

   private final int offset, length;

   private final int channel;

   private final String token;

   private final Terminal origin;

   public Terminal(Rule parent, TerminalType type, int offset, int channel, String token, Terminal origin) {
      this.parent = parent;
      this.type = type;
      this.offset = offset;
      this.length = token.length();
      this.channel = channel;
      this.token = token;
      this.origin = origin;
   }

   @Override
   public boolean isRoot() {
      return parent == null;
   }

   @Override
   public boolean isRule() {
      return false;
   }

   @Override
   public boolean isTerminal() {
      return true;
   }

   @Override
   public Rule getParent() {
      return parent;
   }

   @Override
   public List<AstNode> getChildren() {
      return Collections.emptyList();
   }

   @Override
   public List<AstNode> getVisibleChildren() {
      return Collections.emptyList();
   }

   public TerminalType getType() {
      return type;
   }

   public int getOffset() {
      return offset;
   }

   public int getLength() {
      return length;
   }

   public int getChannel() {
      return channel;
   }

   public String getToken() {
      return token;
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
      StringBuilder builder = new StringBuilder();
      builder.append("Terminal [type=");
      builder.append(type);
      builder.append(", offset=");
      builder.append(offset);
      builder.append(", length=");
      builder.append(length);
      builder.append(", channel=");
      builder.append(channel);
      builder.append(", token='");
      builder.append(token.replaceAll("\n", "\\\\n").replaceAll("\r", "\\\\r"));
      builder.append("'");
      if (isNestedLanguage()) {
         builder.append(", nestedLanguage=");
         builder.append(isNestedLanguage());
      }
      builder.append("]");
      return builder.toString();
   }

}
