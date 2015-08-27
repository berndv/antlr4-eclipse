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

package org.sourcepit.antlr4.eclipse.lang.tests.mode;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.tests.jd.ModeLexer;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class ModeLexerTest {

   @Test
   public void test() {

      StringBuilder jdoc = new StringBuilder();
      jdoc.append(" /**** \n   @Hallo wie gehts? */ ");

      ModeLexer lexer = new ModeLexer(new ANTLRInputStream(jdoc.toString()));
      Token token = lexer.nextToken();
      while (token.getType() != Token.EOF) {
         System.out.println(token);
         token = lexer.nextToken();
      }
   }

}
