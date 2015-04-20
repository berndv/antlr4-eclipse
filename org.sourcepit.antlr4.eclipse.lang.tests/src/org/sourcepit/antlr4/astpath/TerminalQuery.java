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

package org.sourcepit.antlr4.astpath;
public class TerminalQuery {
   private String tokenAttribute;
   private String attributeValue;

   public String getTokenAttribute() {
      return tokenAttribute;
   }

   public void setTokenAttribute(String tokenAttribute) {
      this.tokenAttribute = tokenAttribute;
   }

   public String getAttributeValue() {
      return attributeValue;
   }

   public void setAttributeValue(String attributeValue) {
      this.attributeValue = attributeValue;
   }

   @Override
   public String toString() {
      final StringBuilder builder = new StringBuilder();
      builder.append("TerminalQuery [tokenAttribute=");
      builder.append(tokenAttribute);
      builder.append(", attributeValue=");
      builder.append(attributeValue);
      builder.append("]");
      return builder.toString();
   }

}
