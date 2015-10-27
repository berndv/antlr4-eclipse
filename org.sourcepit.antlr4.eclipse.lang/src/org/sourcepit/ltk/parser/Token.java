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

import org.antlr.v4.runtime.Lexer;

public final class Token {

   public final static int DEFAULT_CHANNEL = org.antlr.v4.runtime.Token.DEFAULT_CHANNEL;

   private final TokenType type;

   private final int offset, length;

   private final int channel;

   private final String text;

   public Token(TokenType type, int channel, int offset, String text) {
      this.type = type;
      this.offset = offset;
      this.length = text.length();
      this.channel = channel;
      this.text = text;
   }

   public TokenType getType() {
      return type;
   }

   public int getChannel() {
      return channel;
   }

   public int getOffset() {
      return offset;
   }

   public int getLength() {
      return length;
   }

   public String getText() {
      return text;
   }

   public boolean isDefaultChannel() {
      return getChannel() == DEFAULT_CHANNEL;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + channel;
      result = prime * result + length;
      result = prime * result + offset;
      result = prime * result + ((text == null) ? 0 : text.hashCode());
      result = prime * result + ((type == null) ? 0 : type.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Token other = (Token) obj;
      if (channel != other.channel) {
         return false;
      }
      if (length != other.length) {
         return false;
      }
      if (offset != other.offset) {
         return false;
      }
      if (text == null) {
         if (other.text != null) {
            return false;
         }
      }
      else if (!text.equals(other.text)) {
         return false;
      }
      if (type == null) {
         if (other.type != null) {
            return false;
         }
      }
      else if (!type.equals(other.type)) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("Token [type=");
      builder.append(type);
      builder.append(", offset=");
      builder.append(offset);
      builder.append(", length=");
      builder.append(length);
      builder.append(", channel=");
      builder.append(channel);
      builder.append(", text=");
      builder.append(text.replaceAll("\n", "\\\\n").replaceAll("\r", "\\\\r"));
      builder.append("]");
      return builder.toString();
   }

   public boolean isType(Token token, Class<? extends Lexer> sourceType, int tokenType) {
      return token != null && token.getType().is(sourceType, tokenType);
   }
}
