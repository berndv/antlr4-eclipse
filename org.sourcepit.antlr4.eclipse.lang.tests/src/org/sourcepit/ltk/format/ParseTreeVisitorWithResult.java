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

package org.sourcepit.ltk.format;

import org.sourcepit.ltk.parser.ParseTreeVisitor;
import org.sourcepit.ltk.parser.Rule;
import org.sourcepit.ltk.parser.Terminal;

public class ParseTreeVisitorWithResult<T> implements ParseTreeVisitor {

   private T result, defaultResult;

   public ParseTreeVisitorWithResult(T defaultResult) {
      this.defaultResult = defaultResult;
   }

   protected void setResult(T result) {
      this.result = result;
   }

   public T getResult() {
      return result == null ? defaultResult : result;
   }

   @Override
   public boolean enter(Rule rule) {
      return result == null;
   }

   @Override
   public boolean visit(Terminal terminal) {
      return result == null;
   }

   @Override
   public void leave(Rule rule) {
   }

}