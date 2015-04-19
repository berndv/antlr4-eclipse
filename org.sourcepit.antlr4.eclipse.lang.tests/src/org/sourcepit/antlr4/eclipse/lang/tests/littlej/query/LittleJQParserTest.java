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

package org.sourcepit.antlr4.eclipse.lang.tests.littlej.query;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.query.LittleJQParser.QueryContext;

public class LittleJQParserTest {

   @Test
   public void test() throws IOException {
      final QueryContext query;
      try (BufferedReader r = new BufferedReader(new StringReader("/CompilationUnit/ClassBody"))) {
         final CommonTokenStream tokenStream = new CommonTokenStream(new LittleJQLexer(new ANTLRInputStream(r)));
         query = new LittleJQParser(tokenStream).query();
      }

      query.accept(new AbstractParseTreeVisitor<Void>() {

         private int depth;

         @Override
         public Void visit(ParseTree tree) {
            return super.visit(tree);
         }

         @Override
         public Void visitChildren(RuleNode node) {
            System.out.println(getPrefix() + node.getClass().getSimpleName());
            depth++;
            Void result = super.visitChildren(node);
            depth--;
            return result;
         }

         private String getPrefix() {
            final StringBuilder prefix = new StringBuilder();
            for (int i = 0; i < depth; i++) {
               prefix.append("|  ");
            }

            if (prefix.length() != 0) {
               prefix.deleteCharAt(prefix.length() - 1);
               prefix.deleteCharAt(prefix.length() - 1);
               prefix.append("- ");
            }

            return prefix.toString();
         }

         @Override
         public Void visitTerminal(TerminalNode node) {
            System.out.println(getPrefix() + (node.getClass().getSimpleName()) + ": " + node.toString());
            return super.visitTerminal(node);
         }

         @Override
         public Void visitErrorNode(ErrorNode node) {
            System.out.println(getPrefix() + (node.getClass().getSimpleName()));
            return super.visitErrorNode(node);
         }
      });

   }
}
