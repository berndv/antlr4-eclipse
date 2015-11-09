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

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.CommentParser.CommentContext;
import org.sourcepit.ltk.parser.ParseNode;
import org.sourcepit.ltk.parser.ParseTreeBuilder;

public class CommentFormatterTest {
   @Test
   public void testSingleLine() throws Exception {
      String formatted = format("/* Hallo wie gehts? */");
      assertEquals("/* Hallo wie gehts? */", formatted);
   }

   @Test
   public void testSingleLineWithoutWs() throws Exception {
      String formatted = format("/*Hallo wie gehts?*/");
      assertEquals("/* Hallo wie gehts? */", formatted);
   }

   @Test
   public void testWithNl() throws Exception {
      String formatted = format("/* Hallo wie\n gehts? */");
      assertEquals("/*\n * Hallo wie\n * gehts?\n */", formatted);
   }

   @Test
   public void testWithNl2() throws Exception {
      String formatted = format("/*\n * Hallo wie\n * gehts?\n */");
      assertEquals("/*\n * Hallo wie\n * gehts?\n */", formatted);
   }

   @Test
   public void testCommentsWithLeadingWs() throws Exception {

      StringBuilder sb = new StringBuilder();
      sb.append("/*\n");
      sb.append(" * Hallo\n");
      sb.append(" *\n");
      sb.append(" * 1. du\n");
      sb.append(" *    Ei\n");
      sb.append(" */");

      String formatted = format(sb.toString());
      assertEquals(sb.toString(), formatted);
   }


   @Test
   public void testLineComment() throws Exception {
      assertEquals("// Hallo, wie gehts?", format("//Hallo, wie gehts?    \n"));
   }


   private String format(String comment) throws IOException {
      final ParseNode parseTree = parse(comment);
      final StringBuilder out = new StringBuilder();
      new SourceFormatter(new CommentRendererFactory()).format(parseTree, out, EOL.LF);
      return out.toString();
   }

   private ParseNode parse(String comment) {
      return new ParseTreeBuilder(new CommentParserDelegate()).build(comment, CommentContext.class);
   }
}
