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

package org.sourcepit.antlr4.eclipse.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.CommentParser.CommentContext;
import org.sourcepit.antlr4.eclipse.lang.CommentParser.CommentTextContext;
import org.sourcepit.antlr4.eclipse.lang.CommentParser.DocCommentContext;
import org.sourcepit.antlr4.eclipse.lang.CommentParser.LineCommentContext;

public class CommentParserTest {

   @Test
   public void testDocComment() {
      StringBuilder jdoc = new StringBuilder();
      jdoc.append("/**\n");
      jdoc.append(" * Hallo wie\n");
      jdoc.append(" * gehts?\n");
      jdoc.append(" */");

      CommentParser parser = new CommentParser(
         new CommonTokenStream(new CommentLexer(new ANTLRInputStream(jdoc.toString()))));

      final CommentContext comment = parser.comment();

      final List<ParseTree> nodes = getNodes(comment);

      assertEquals(8, nodes.size());

      Iterator<ParseTree> it = nodes.iterator();

      assertNode(CommentContext.class, "[]", it.next());
      assertNode(DocCommentContext.class, "[10]", it.next());
      assertNode(TerminalNode.class, "/**", it.next());
      assertNode(CommentTextContext.class, "[16 10]", it.next());
      assertNode(TerminalNode.class, "Hallo", it.next());
      assertNode(TerminalNode.class, "wie", it.next());
      assertNode(TerminalNode.class, "gehts?", it.next());
      assertNode(TerminalNode.class, " */", it.next());

   }

   @Test
   public void testLineComment() {
      StringBuilder jdoc = new StringBuilder();
      jdoc.append("// Hallo wie gehts?\n");
   
      CommentParser parser = new CommentParser(
         new CommonTokenStream(new CommentLexer(new ANTLRInputStream(jdoc.toString()))));
   
      final CommentContext comment = parser.comment();
   
      final List<ParseTree> nodes = getNodes(comment);
   
      assertEquals(7, nodes.size());
   
      Iterator<ParseTree> it = nodes.iterator();
   
      assertNode(CommentContext.class, "[]", it.next());
      assertNode(LineCommentContext.class, "[12]", it.next());
      assertNode(TerminalNode.class, "// ", it.next());
      assertNode(CommentTextContext.class, "[28 12]", it.next());
      assertNode(TerminalNode.class, "Hallo", it.next());
      assertNode(TerminalNode.class, "wie", it.next());
      assertNode(TerminalNode.class, "gehts?", it.next());
   }

   private List<ParseTree> getNodes(final RuleNode root) {
      final List<ParseTree> nodes = new ArrayList<>();
      root.accept(new AbstractParseTreeVisitor<Void>() {
         @Override
         public Void visit(ParseTree tree) {
            nodes.add(tree);
            return super.visit(tree);
         }

         @Override
         public Void visitChildren(RuleNode node) {
            nodes.add(node);
            return super.visitChildren(node);
         }

         @Override
         public Void visitTerminal(TerminalNode node) {
            nodes.add(node);
            return super.visitTerminal(node);
         }

         @Override
         public Void visitErrorNode(ErrorNode node) {
            nodes.add(node);
            return super.visitErrorNode(node);
         }
      });
      return nodes;
   }

   private void assertNode(Class<? extends ParseTree> type, String text, ParseTree node) {
      assertTrue(String.format("%s is not assignable from %s", type, node.getClass()),
         type.isAssignableFrom(node.getClass()));
      assertEquals(text, node.toString());
   }

}
