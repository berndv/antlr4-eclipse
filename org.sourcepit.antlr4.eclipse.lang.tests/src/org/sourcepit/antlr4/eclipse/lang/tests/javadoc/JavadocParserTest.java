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
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.tests.javadoc.JavadocParser.JavadocContext;

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
      jdoc.append("/** Hallo wie gehts? */");

      final CommonTokenStream tokenStream = new CommonTokenStream(
         new JavadocLexer(new ANTLRInputStream(jdoc.toString())));

      final JavadocParser parser = new JavadocParser(tokenStream);

      JavadocContext javadoc = parser.javadoc();
      final String stringTree = javadoc.toStringTree(parser);
      System.out.println(stringTree);
      assertEquals(
         "(javadoc (javadocStart /**  ) (mainDescription (line (text Hallo   wie   gehts?  ))) (javadocEnd */))",
         stringTree);
   }

   @Test
   public void testMultiLine() {

      StringBuilder jdoc = new StringBuilder();
      jdoc.append("/**\n");
      jdoc.append(" * Hallo\n");
      jdoc.append(" * \n");
      jdoc.append(" \n");
      jdoc.append("\n");
      jdoc.append(" * Wie Gehts?\n");
      jdoc.append(" */");

      final CommonTokenStream tokenStream = new CommonTokenStream(
         new JavadocLexer(new ANTLRInputStream(jdoc.toString())));

      final JavadocParser parser = new JavadocParser(tokenStream);

      JavadocContext javadoc = parser.javadoc();
      final String stringTree = javadoc.toStringTree(parser);
      System.out.println(stringTree);
      assertEquals(
         "(javadoc (javadocStart /** \\n) (mainDescription (line (prefix   *  ) (text Hallo) \\n) (line (prefix   *  ) \\n) (line   \\n) (line \\n) (line (prefix   *  ) (text Wie   Gehts?) \\n)) (javadocEnd   */))",
         stringTree);
   }

   @Test
   public void testMultiLinePreficedWithStar() {

      StringBuilder jdoc = new StringBuilder();
      jdoc.append("/**\n");
      jdoc.append(" * * Hallo\n");
      jdoc.append(" */");

      final CommonTokenStream tokenStream = new CommonTokenStream(
         new JavadocLexer(new ANTLRInputStream(jdoc.toString())));

      final JavadocParser parser = new JavadocParser(tokenStream);

      JavadocContext javadoc = parser.javadoc();
      final String stringTree = javadoc.toStringTree(parser);
      System.out.println(stringTree);
      assertEquals(
         "(javadoc (javadocStart /** \\n) (mainDescription (line (prefix   *  ) (text *   Hallo) \\n)) (javadocEnd   */))",
         stringTree);
   }

   @Test
   public void testTagSection() {

      StringBuilder jdoc = new StringBuilder();
      jdoc.append("/**\n");
      jdoc.append(" * @author foo\n");
      jdoc.append(" */");

      final CommonTokenStream tokenStream = new CommonTokenStream(
         new JavadocLexer(new ANTLRInputStream(jdoc.toString())));

      final JavadocParser parser = new JavadocParser(tokenStream);

      JavadocContext javadoc = parser.javadoc();
      final String stringTree = javadoc.toStringTree(parser);
      System.out.println(stringTree);
      assertEquals(
         "(javadoc (javadocStart /** \\n) (tagSection (tag (prefix   *  ) @ (tagName author)   (line (text foo) \\n))) (javadocEnd   */))",
         stringTree);
   }

}
