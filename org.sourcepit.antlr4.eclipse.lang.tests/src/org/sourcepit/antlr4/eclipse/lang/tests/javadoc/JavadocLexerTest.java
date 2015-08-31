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

package org.sourcepit.antlr4.eclipse.lang.tests.javadoc;

import static org.junit.Assert.assertEquals;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class JavadocLexerTest {

   @Test
   public void test() {

      StringBuilder jdoc = new StringBuilder();
      jdoc.append(" /**** \n   @Hallo wie gehts? */ ");

      JavadocLexer lexer = new JavadocLexer(new ANTLRInputStream(jdoc.toString()));
      Token token = lexer.nextToken();
      while (token.getType() != Token.EOF) {
         System.out.println(token);
         token = lexer.nextToken();
      }
   }

   @Test
   public void test2() {

      StringBuilder jdoc = new StringBuilder();
      jdoc.append("/**\n");
      jdoc.append(" * Hallo <br\n");
      jdoc.append(" * n>\n");
      jdoc.append(" */");

      JavadocLexer lexer = new JavadocLexer(new ANTLRInputStream(jdoc.toString()));
      Token token = lexer.nextToken();
      while (token.getType() != Token.EOF) {
         System.out.println(token);
         token = lexer.nextToken();
      }
   }

   @Test
   public void test3() {

      StringBuilder jdoc = new StringBuilder();
      jdoc.append("/**\n");
      jdoc.append(" * <!br /><a href=\n");
      jdoc.append(" * \"foo\" >\n");
      jdoc.append(" */");

      JavadocLexer lexer = new JavadocLexer(new ANTLRInputStream(jdoc.toString()));
      Token token = lexer.nextToken();
      while (token.getType() != Token.EOF) {
         System.out.println(token);
         token = lexer.nextToken();
      }
   }

   @Test
   public void test4() {

      StringBuilder jdoc = new StringBuilder();
      jdoc.append("/**\n");
      jdoc.append(" * Hallo {@code foo#bar}\n");
      jdoc.append(" */");

      JavadocLexer lexer = new JavadocLexer(new ANTLRInputStream(jdoc.toString()));
      Token token = lexer.nextToken();
      while (token.getType() != Token.EOF) {
         System.out.println(token);
         token = lexer.nextToken();
      }
   }

   @Test
   public void test5() {

      StringBuilder jdoc = new StringBuilder();
      jdoc.append("/**Hallo {@code wie}gehts?*/");

      JavadocLexer lexer = new JavadocLexer(new ANTLRInputStream(jdoc.toString()));
      Token token = lexer.nextToken();
      while (token.getType() != Token.EOF) {
         System.out.println(token);
         token = lexer.nextToken();
      }
   }

   @Test
   public void testChars() throws Exception {

      assertEquals('\t', '\u0009');
      assertEquals('\r', /* '\u000D' */'\r');
      assertEquals('\n', /* '\u000A' */'\n');
      assertEquals('\f', '\u000C');
      assertEquals(' ', '\u0020');

   }

   // public static boolean isLetter(int codePoint) {
   // return ((((1 << Character.UPPERCASE_LETTER) | (1 << Character.LOWERCASE_LETTER)
   // | (1 << Character.TITLECASE_LETTER) | (1 << Character.MODIFIER_LETTER)
   // | (1 << Character.OTHER_LETTER)) >> getType(codePoint)) & 1) != 0;
   // }

}
