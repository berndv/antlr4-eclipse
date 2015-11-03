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

import org.junit.Before;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.AntlrParserDelegate;
import org.sourcepit.ltk.parser.ParseNode;
import org.sourcepit.ltk.parser.ParseTreeBuilder;

public class SourceFormatterTest {

   private SourceFormatter formatter;

   @Before
   public void setUp() {
      formatter = new SourceFormatter(new AntlrRendererFactory());
   }

   private String format(ParseNode parseTree) throws IOException {
      final StringBuilder out = new StringBuilder();
      formatter.format(parseTree, out, EOL.LF);
      return out.toString();
   }

   private ParseNode parse(String grammar) {
      return new ParseTreeBuilder(new AntlrParserDelegate()).build(grammar);
   }

   @Test
   public void testGrammarDecl() throws IOException {
      ParseNode parseTree = parse("grammar Foo;");
      String fmtString = format(parseTree);
      assertEquals("grammar Foo;", fmtString);
   }

   @Test
   public void testGrammarDeclWithComment() throws IOException {
      ParseNode parseTree = parse("/* Hallo */ grammar Foo;");
      String fmtString = format(parseTree);
      assertEquals("/* Hallo */ grammar Foo;", fmtString);
   }

   @Test
   public void testGrammarDeclWithDocComment() throws IOException {
      ParseNode parseTree = parse("/** Hallo */ grammar Foo;");
      String fmtString = format(parseTree);
      assertEquals("/** Hallo */\ngrammar Foo;", fmtString);
   }

   @Test
   public void testGrammarDeclWithComments() throws IOException {
      ParseNode parseTree = parse("/* Hallo */ grammar /* wie gehts? */ Foo;");
      String fmtString = format(parseTree);
      assertEquals("/* Hallo */ grammar /* wie gehts? */ Foo;", fmtString);
   }

   @Test
   public void testGrammarDeclWithCommentsWithoutBlanks() throws IOException {
      ParseNode parseTree = parse("/*Hallo*/grammar/*wie gehts?*/Foo;");
      String fmtString = format(parseTree);
      assertEquals("/* Hallo */grammar/* wie gehts? */Foo;", fmtString);
   }

}
