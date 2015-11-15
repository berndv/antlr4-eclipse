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
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.ActionContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.DelegateGrammarsContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.GrammarSpecContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.LexerRuleContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.OptionsSpecContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.ParserRuleSpecContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.TokensSpecContext;
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
      return parser().build(grammar, GrammarSpecContext.class);
   }

   private ParseTreeBuilder parser() {
      return new ParseTreeBuilder(new AntlrParserDelegate());
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

   @Test
   public void testOptionsSpec() throws Exception {
      final ParseNode parseTree = parser().build("options{a=foo.bar;b=bar.foo;}", OptionsSpecContext.class);
      String format = format(parseTree);
      assertEquals("options {\n    a = foo.bar;\n    b = bar.foo;\n}", format);
   }

   @Test
   public void testOptionsSpecWithComment() throws Exception {
      final ParseNode parseTree = parser().build("options{a=foo.bar;\n/*\n Hallo */\nb=bar.foo;}",
         OptionsSpecContext.class);
      String format = format(parseTree);
      assertEquals("options {\n    a = foo.bar;\n    /*\n     * Hallo\n     */\n    b = bar.foo;\n}", format);
   }

   @Test
   public void testDelegateGrammars() throws Exception {
      final ParseNode parseTree = parser().build("import foo, bar=foobar;", DelegateGrammarsContext.class);
      String format = format(parseTree);
      assertEquals("import foo, bar = foobar;", format);
   }

   @Test
   public void testTokensSpec() throws Exception {
      final ParseNode parseTree = parser().build("tokens{foo,bar,fobar,}", TokensSpecContext.class);
      String format = format(parseTree);
      assertEquals("tokens {\n    foo,\n    bar,\n    fobar,\n}", format);
   }

   @Test
   public void testTokensSpecWithComment() throws Exception {
      final ParseNode parseTree = parser().build("/*\n Hallo */\ntokens{foo,bar,\n/*\n Hallo */\nfobar,}",
         TokensSpecContext.class);
      String format = format(parseTree);
      assertEquals("/*\n * Hallo\n */\ntokens {\n    foo,\n    bar,\n    /*\n     * Hallo\n     */\n    fobar,\n}",
         format);
   }

   @Test
   public void testAction() throws Exception {
      final ParseNode parseTree = parser().build("@parser::foo{}", ActionContext.class);
      String format = format(parseTree);
      assertEquals("@parser::foo {}", format);
   }

   @Test
   public void testActionWithComment() throws Exception {
      final ParseNode parseTree = parser().build("/*\n Hallo */@parser::\n/*\n Hallo */\nfoo/*Hallo*/{}",
         ActionContext.class);
      String format = format(parseTree);
      assertEquals("/*\n * Hallo\n */@parser::\n/*\n * Hallo\n */\nfoo/* Hallo */{}", format);
   }

   @Test
   public void testParserRuleSpec() throws Exception {
      final ParseNode parseTree = parser().build("public foo : FOO | BAR ;", ParserRuleSpecContext.class);
      String format = format(parseTree);
      assertEquals("public foo\n    : FOO\n    | BAR\n    ;", format);
   }

   @Test
   public void testParserRuleSpecWithComment() throws Exception {
      final ParseNode parseTree = parser().build("public foo : /*\n Hallo */\nFOO | /* Hallo */ BAR /*\n Hallo */\n ;",
         ParserRuleSpecContext.class);
      String format = format(parseTree);

      final StringBuilder sb = new StringBuilder();
      sb.append("public foo\n");
      sb.append("    : /*\n");
      sb.append("       * Hallo\n");
      sb.append("       */\n");
      sb.append("      FOO\n");
      sb.append("    | /* Hallo */ BAR /*\n");
      sb.append("       * Hallo\n");
      sb.append("       */\n");
      sb.append("    ;");

      assertEquals(sb.toString(), format);
   }

   @Test
   public void testLexerRule() throws Exception {
      final ParseNode parseTree = parser().build("fragment FOO : 'FOO' | 'BAR' ;", LexerRuleContext.class);
      String format = format(parseTree);
      assertEquals("fragment FOO\n    : \'FOO'\n    | 'BAR'\n    ;", format);
   }

   @Test
   public void testLexerRuleWithComment() throws Exception {
      final ParseNode parseTree = parser().build(
         "fragment FOO : /*\n Hallo */\n'FOO' | /*\n Hallo */ 'BAR'\n /*\n Hallo */\n ;", LexerRuleContext.class);
      String format = format(parseTree);

      final StringBuilder sb = new StringBuilder();
      sb.append("fragment FOO\n");
      sb.append("    : /*\n");
      sb.append("       * Hallo\n");
      sb.append("       */\n");
      sb.append("      'FOO'\n");
      sb.append("    | /*\n");
      sb.append("       * Hallo\n");
      sb.append("       */ 'BAR'\n");
      sb.append("      /*\n");
      sb.append("       * Hallo\n");
      sb.append("       */\n");
      sb.append("    ;");

      assertEquals(sb.toString(), format);
   }

   @Test
   public void testLexerRuleWithLineComment() throws Exception {

      final StringBuilder in = new StringBuilder();
      in.append("// Hallo, wie gehts?\n");
      in.append("FOO \n");
      in.append(": // Hallo, wie gehts?\n");
      in.append("'FOO' // Hallo, wie gehts?\n");
      in.append("| // Hallo, wie gehts?\n");
      in.append("'BAR'// Hallo, wie gehts?\n");
      in.append("// Hallo, wie gehts?\n");
      in.append("    ;");

      final ParseNode parseTree = parser().build(in.toString(), LexerRuleContext.class);
      String format = format(parseTree);

      final StringBuilder sb = new StringBuilder();
      sb.append("// Hallo, wie gehts?\n");
      sb.append("FOO\n");
      sb.append("    : // Hallo, wie gehts?\n");
      sb.append("      'FOO' // Hallo, wie gehts?\n");
      sb.append("    | // Hallo, wie gehts?\n");
      sb.append("      'BAR'// Hallo, wie gehts?\n");
      sb.append("      // Hallo, wie gehts?\n");
      sb.append("    ;");

      assertEquals(sb.toString(), format);
   }

   @Test
   public void testNlBetweenRules() throws Exception {
      final String inputGrammar = getContent("SourceFormatterTest_testNlBetweenRules_input.g4");
      String formattedGrammar = format(parse(inputGrammar));
      final String expectedGrammar = getContent("SourceFormatterTest_testNlBetweenRules_expected.g4").replace("\r\n",
         "\n");
      assertEquals(expectedGrammar, formattedGrammar);
   }

   @Test
   public void testLexerMode() throws Exception {
      final String inputGrammar = getContent("SourceFormatterTest_testLexerMode_input.g4");
      String formattedGrammar = format(parse(inputGrammar));
      final String expectedGrammar = getContent("SourceFormatterTest_testLexerMode_expected.g4").replace("\r\n",
         "\n");
      assertEquals(expectedGrammar, formattedGrammar);
   }

   private String getContent(String resourceName) throws IOException {
      final InputStream in = getClass().getResourceAsStream(resourceName);
      try {
         return IOUtils.toString(in, "UTF-8");
      }
      finally {
         IOUtils.closeQuietly(in);
      }
   }
}
