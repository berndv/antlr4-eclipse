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

package org.sourcepit.antlr4.eclipse.lang.tests.javadoc2;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.tests.javadoc2.Javadoc2Parser.JavadocContext;

/**
 * @ author Bernd Vogt <bernd.vogt@sourcepit.org>
 * 
 * hui
 * 
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class JavadocParserTest {

   @Test
   public void testSingleLine() {

      StringBuilder jdoc = new StringBuilder();
      jdoc.append("/** hui \n");
      jdoc.append(" *** * \n");
      jdoc.append("      na was geht \n");
      jdoc.append(" **/");

      Javadoc2Lexer lexer = newLexer(jdoc);


      Token t = lexer.nextToken();

      while (t.getType() != Token.EOF) {
         System.out.println(t);
         t = lexer.nextToken();
      }

      CommonTokenStream tokenStream = new CommonTokenStream(newLexer(jdoc));

      Javadoc2Parser parser = new Javadoc2Parser(tokenStream);

      JavadocContext javadoc = parser.javadoc();
      String stringTree = javadoc.toStringTree(parser);
      System.out.println(stringTree);
   }

   private Javadoc2Lexer newLexer(StringBuilder jdoc) {
      return new Javadoc2Lexer(new ANTLRInputStream(jdoc.toString()));
   }


}
