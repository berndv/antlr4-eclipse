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

import static java.lang.String.format;
import static org.junit.Assert.assertEquals;

import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer;
import org.sourcepit.antlr4.eclipse.lang.CommentLexer;
import org.sourcepit.antlr4.eclipse.lang.CommentParser;
import org.sourcepit.antlr4.eclipse.lang.CommentParser.CommentContext;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.LittleJLexer;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.LittleJParser;
import org.sourcepit.ltk.format.SpanBuildingParseTreeListener.ParseResult;

public class ParseTreeToSpanTransformerTest {

   @Test
   public void testImportDeclaration() throws Exception {

      String content = "import foo.bar";

      final CommonTokenStream tokenStream = new CommonTokenStream(new LittleJLexer(new ANTLRInputStream(content)));
      final LittleJParser parser = new LittleJParser(tokenStream);

      RuleNode node = parser.importDeclaration();

      Span result = new ParseTreeToSpanTransformer().transform(tokenStream, node);

      StringBuilder actual = new StringBuilder();
      print(0, result, actual);

      StringBuilder expected = new StringBuilder();
      expected.append("CompositeSpan -> [SingleTypeImportDeclarationContext, ImportDeclarationContext]\n");
      expected.append("  TokenSpan -> []\n");
      expected.append("    import\n");
      expected.append("  TokenSpan -> [QualifiedNameContext, TypeNameContext]\n");
      expected.append("    foo\n");
      expected.append("    .\n");
      expected.append("    bar\n");

      assertEquals(expected.toString(), actual.toString());
   }

   @Test
   public void testClassDeclaration() throws Exception {

      String content = "class foo {foo.Bar bar;bar.Foo foo;}";

      final CommonTokenStream tokenStream = new CommonTokenStream(new LittleJLexer(new ANTLRInputStream(content)));
      final LittleJParser parser = new LittleJParser(tokenStream);

      RuleNode node = parser.classDeclaration();

      Span result = new ParseTreeToSpanTransformer().transform(tokenStream, node);

      StringBuilder actual = new StringBuilder();
      print(0, result, actual);

      StringBuilder expected = new StringBuilder();
      expected.append("CompositeSpan -> [ClassDeclarationContext]\n");
      expected.append("  TokenSpan -> []\n");
      expected.append("    class\n");
      expected.append("    foo\n");
      expected.append("  CompositeSpan -> [ClassBodyContext]\n");
      expected.append("    TokenSpan -> []\n");
      expected.append("      {\n");
      expected.append("    CompositeSpan -> [MemberDeclarationContext, ClassBodyDeclarationContext]\n");
      expected.append("      TokenSpan -> [QualifiedNameContext, TypeNameContext]\n");
      expected.append("        foo\n");
      expected.append("        .\n");
      expected.append("        Bar\n");
      expected.append("      TokenSpan -> [FieldNameContext]\n");
      expected.append("        bar\n");
      expected.append("      TokenSpan -> []\n");
      expected.append("        ;\n");
      expected.append("    CompositeSpan -> [MemberDeclarationContext, ClassBodyDeclarationContext]\n");
      expected.append("      TokenSpan -> [QualifiedNameContext, TypeNameContext]\n");
      expected.append("        bar\n");
      expected.append("        .\n");
      expected.append("        Foo\n");
      expected.append("      TokenSpan -> [FieldNameContext]\n");
      expected.append("        foo\n");
      expected.append("      TokenSpan -> []\n");
      expected.append("        ;\n");
      expected.append("    TokenSpan -> []\n");
      expected.append("      }\n");

      assertEquals(expected.toString(), actual.toString());
   }

   @Test
   public void testClassBody() throws Exception {

      String content = "{foo bar;}";

      final CommonTokenStream tokenStream = new CommonTokenStream(new LittleJLexer(new ANTLRInputStream(content)));
      final LittleJParser parser = new LittleJParser(tokenStream);

      RuleNode node = parser.classBody();

      Span result = new ParseTreeToSpanTransformer().transform(tokenStream, node);

      StringBuilder actual = new StringBuilder();
      print(0, result, actual);

      StringBuilder expected = new StringBuilder();
      expected.append("CompositeSpan -> [ClassBodyContext]\n");
      expected.append("  TokenSpan -> []\n");
      expected.append("    {\n");
      expected.append("  CompositeSpan -> [MemberDeclarationContext, ClassBodyDeclarationContext]\n");
      expected.append("    TokenSpan -> [QualifiedNameContext, TypeNameContext]\n");
      expected.append("      foo\n");
      expected.append("    TokenSpan -> [FieldNameContext]\n");
      expected.append("      bar\n");
      expected.append("    TokenSpan -> []\n");
      expected.append("      ;\n");
      expected.append("  TokenSpan -> []\n");
      expected.append("    }\n");

      assertEquals(expected.toString(), actual.toString());
   }

   @Test
   public void testIfStatement() throws Exception {

      String content = "if (foo==bar) {}";

      final CommonTokenStream tokenStream = new CommonTokenStream(new LittleJLexer(new ANTLRInputStream(content)));
      final LittleJParser parser = new LittleJParser(tokenStream);

      RuleNode node = parser.ifStatement();

      Span result = new ParseTreeToSpanTransformer().transform(tokenStream, node);

      StringBuilder actual = new StringBuilder();
      print(0, result, actual);

      StringBuilder expected = new StringBuilder();
      expected.append("CompositeSpan -> [IfStatementContext]\n");
      expected.append("  TokenSpan -> []\n");
      expected.append("    if\n");
      expected.append("    (\n");
      expected.append("  TokenSpan -> [ExpressionContext]\n");
      expected.append("    foo\n");
      expected.append("    ==\n");
      expected.append("    bar\n");
      expected.append("  TokenSpan -> []\n");
      expected.append("    )\n");
      expected.append("  TokenSpan -> [BlockContext]\n");
      expected.append("    {\n");
      expected.append("    }\n");

      assertEquals(expected.toString(), actual.toString());
   }

   @Test
   public void testDoc() throws Exception {

      String content = "  /** \n   * hallo wie gehts? */ class Foo {} /* und aus */";

      final CommonTokenStream tokenStream = new CommonTokenStream(new LittleJLexer(new ANTLRInputStream(content)));
      final LittleJParser parser = new LittleJParser(tokenStream);

      RuleNode node = parser.compilationUnit();

      Span result = new ParseTreeToSpanTransformer() {
         @Override
         protected ParseResult parseHiddenToken(BufferedTokenStream tokenStream, ParseTree parent, Token hiddenToken) {
            switch (hiddenToken.getType()) {
               case LittleJLexer.COMMENT :
               case LittleJLexer.LINE_COMMENT :
                  final CommonTokenStream ts = new CommonTokenStream(
                     new CommentLexer(new ANTLRInputStream(hiddenToken.getText())));
                  final CommentContext comment = new CommentParser(ts).comment();
                  final ParseResult result = new ParseResult();
                  result.tokenStream = ts;
                  result.node = comment;
                  return result;
               default :
                  return null;
            }
         };
      }.transform(tokenStream, node);

      StringBuilder actual = new StringBuilder();
      print(0, result, actual);

      StringBuilder expected = new StringBuilder();
      expected.append("CompositeSpan -> [CompilationUnitContext]\n");
      expected.append("  CompositeSpan -> [ClassDeclarationContext]\n");
      expected.append("    CompositeSpan -> [DocCommentContext, CommentContext]\n");
      expected.append("      TokenSpan -> []\n");
      expected.append("        /** \n");
      expected.append("      TokenSpan -> [CommentTextContext]\n");
      expected.append("        hallo\n");
      expected.append("        wie\n");
      expected.append("        gehts?\n");
      expected.append("      TokenSpan -> []\n");
      expected.append("         */\n");
      expected.append("    TokenSpan -> []\n");
      expected.append("      class\n");
      expected.append("      Foo\n");
      expected.append("    TokenSpan -> [ClassBodyContext]\n");
      expected.append("      {\n");
      expected.append("      }\n");
      expected.append("  CompositeSpan -> [BlockCommentContext, CommentContext]\n");
      expected.append("    TokenSpan -> []\n");
      expected.append("      /* \n");
      expected.append("    TokenSpan -> [CommentTextContext]\n");
      expected.append("      und\n");
      expected.append("      aus\n");
      expected.append("    TokenSpan -> []\n");
      expected.append("       */\n");
      expected.append("  TokenSpan -> []\n");
      expected.append("    <EOF>\n");


      assertEquals(expected.toString(), actual.toString());
   }


   @Test
   public void testHidden() throws Exception {

      String content = "\n/** hallo */\nclass Foo{ }\n/* und aus */\n";

      final CommonTokenStream tokenStream = new CommonTokenStream(new LittleJLexer(new ANTLRInputStream(content)));
      final LittleJParser parser = new LittleJParser(tokenStream);

      RuleNode node = parser.compilationUnit();

      Span result = new ParseTreeToSpanTransformer() {
         @Override
         protected ParseResult parseHiddenToken(BufferedTokenStream tokenStream, ParseTree parent, Token hiddenToken) {
            if (LittleJLexer.WS == hiddenToken.getChannel()) {
               return null;
            }
            final TerminalNodeImpl node = new TerminalNodeImpl(hiddenToken);
            node.parent = parent;
            final ParseResult res = new ParseResult();
            res.tokenStream = tokenStream;
            res.node = node;
            return res;
         };

         @Override
         protected TokenSpan aggregate(TokenSpan prev, TokenSpan next) {
            if (isComment(prev) || isComment(next)) {
               return null;
            }
            return super.aggregate(prev, next);
         }

         boolean isComment(TokenSpan tokenSpan) {
            final TokenRef tokenRef = tokenSpan.tokens.get(tokenSpan.tokens.size() - 1);
            return tokenRef.isToken(LittleJLexer.class, LittleJLexer.COMMENT);
         }


      }.transform(tokenStream, node);

      StringBuilder actual = new StringBuilder();

      print(0, result, actual);

      StringBuilder expected = new StringBuilder();
      expected.append("CompositeSpan -> [CompilationUnitContext]\n");
      expected.append("  CompositeSpan -> [ClassDeclarationContext]\n");
      expected.append("    TokenSpan -> []\n");
      expected.append("      /** hallo */\n");
      expected.append("    TokenSpan -> []\n");
      expected.append("      class\n");
      expected.append("      Foo\n");
      expected.append("    TokenSpan -> [ClassBodyContext]\n");
      expected.append("      {\n");
      expected.append("      }\n");
      expected.append("  TokenSpan -> []\n");
      expected.append("    /* und aus */\n");
      expected.append("  TokenSpan -> []\n");
      expected.append("    <EOF>\n");

      assertEquals(expected.toString(), actual.toString());
   }

   private void print(int depth, Span span, Appendable out) throws IOException {
      String type = span.getClass().getSimpleName();

      List<String> elems = new ArrayList<>();
      List<RuleNode> context = span.context;
      if (context != null) {
         for (RuleNode ruleNode : context) {
            elems.add(ruleNode.getClass().getSimpleName());
         }
      }

      out.append(format("%s%s -> %s\n", indent(depth), type, elems));

      if (span instanceof CompositeSpan) {
         for (Span childSpan : ((CompositeSpan) span).spans) {
            print(depth + 1, childSpan, out);
         }
      }
      else if (span instanceof TokenSpan) {
         for (TokenRef tokenRef : ((TokenSpan) span).tokens) {
            Token token = tokenRef.token;
            String text = token.getText();
            out.append(format("%s%s\n", indent(depth + 1), text));
         }
      }

   }

   private String indent(int depth) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < depth; i++) {
         sb.append("  ");
      }
      String indent = sb.toString();
      return indent;
   }

}
