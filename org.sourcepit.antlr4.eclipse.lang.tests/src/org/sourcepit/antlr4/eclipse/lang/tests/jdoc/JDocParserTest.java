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

package org.sourcepit.antlr4.eclipse.lang.tests.jdoc;

import static org.junit.Assert.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.tests.jdoc.JDocParser.JavaDocContext;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.LittleJLexer;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.LittleJParser;

/**
 * * h@ui <b>df < / b>
 **** @2dsd          Bernd Vogt <bernd.vogt@sourcepit.org>
 * @author Bernd <foo@dd.de>
 */
public class JDocParserTest {
//   @Test
//   public void test2() {
//      String content = "/** Ha\nl lo \n*/\n";
//
//
//      JDocLexer lexer = new JDocLexer(new ANTLRInputStream(content));
//
//      Token nextToken = lexer.nextToken();
//      while (nextToken.getType() != Token.EOF) {
//         System.out.println(nextToken);
//         nextToken = lexer.nextToken();
//      }
//
//   }
   
   @Test
   public void testHallo() {
      String content = "/**Hallo*/";
      
      JDocLexer lexer = new JDocLexer(new ANTLRInputStream(content));

      Token nextToken = lexer.nextToken();
      while (nextToken.getType() != Token.EOF) {
         System.out.println(nextToken);
         nextToken = lexer.nextToken();
      }

      final CommonTokenStream tokenStream = new CommonTokenStream(new JDocLexer(new ANTLRInputStream(content)));

      final JDocParser parser = new JDocParser(tokenStream);

      JavaDocContext javaDoc = parser.javaDoc();
      System.out.println(javaDoc.toStringTree(parser));
   }
   
   @Test
   public void testHallo2() {
      String content = "/** ** */";
      
      StringBuilder jdoc = new StringBuilder();
      jdoc.append("/**");
      
      JDocLexer lexer = new JDocLexer(new ANTLRInputStream(content));

      Token nextToken = lexer.nextToken();
      while (nextToken.getType() != Token.EOF) {
         System.out.println(nextToken);
         nextToken = lexer.nextToken();
      }

      final CommonTokenStream tokenStream = new CommonTokenStream(new JDocLexer(new ANTLRInputStream(content)));

      final JDocParser parser = new JDocParser(tokenStream);

      JavaDocContext javaDoc = parser.javaDoc();
      System.out.println(javaDoc.toStringTree(parser));
   }

   @Test
   public void test() {
      String content = "/**\n\nH@l/*lo du\n* * <b> @ie <i>gehts</i>?</b>\n ***** hu @2uthor Bernd\n\n **** @author Bernd\n*/";
      
      JDocLexer lexer = new JDocLexer(new ANTLRInputStream(content));

      Token nextToken = lexer.nextToken();
      while (nextToken.getType() != Token.EOF) {
         System.out.println(nextToken);
         nextToken = lexer.nextToken();
      }


      final CommonTokenStream tokenStream = new CommonTokenStream(new JDocLexer(new ANTLRInputStream(content)));


      final JDocParser parser = new JDocParser(tokenStream);

      JavaDocContext javaDoc = parser.javaDoc();
      System.out.println(javaDoc.toStringTree(parser));
   }

}
