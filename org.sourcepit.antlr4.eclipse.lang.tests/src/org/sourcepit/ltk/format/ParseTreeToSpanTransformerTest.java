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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.RuleNode;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.LittleJLexer;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.LittleJParser;

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

      String content = "  /** \n   * hallo */ class Foo {} /* und aus */";

      final CommonTokenStream tokenStream = new CommonTokenStream(new LittleJLexer(new ANTLRInputStream(content)));
      final LittleJParser parser = new LittleJParser(tokenStream);

      RuleNode node = parser.compilationUnit();

      Span result = new ParseTreeToSpanTransformer().transform(tokenStream, node);

      StringBuilder actual = new StringBuilder();
      print(0, result, actual);

      StringBuilder expected = new StringBuilder();
      expected.append("CompositeSpan -> [CompilationUnitContext]\n");
      expected.append("  CompositeSpan -> [ClassDeclarationContext]\n");
      expected.append("    TokenSpan -> []\n");
      expected.append("      /** \n");
      expected.append("   * hallo */\n");
      expected.append("      class\n");
      expected.append("      Foo\n");
      expected.append("    TokenSpan -> [ClassBodyContext]\n");
      expected.append("      {\n");
      expected.append("      }\n");
      expected.append("  TokenSpan -> []\n");
      expected.append("    /* und aus */\n");
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
         for (Token token : ((TokenSpan) span).tokens) {
            out.append(format("%s%s\n", indent(depth + 1), token.element));
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
