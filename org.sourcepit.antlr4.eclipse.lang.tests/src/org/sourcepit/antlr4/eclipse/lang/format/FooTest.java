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

package org.sourcepit.antlr4.eclipse.lang.format;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.LittleJLexer;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.LittleJParser;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.LittleJParser.CompilationUnitContext;

public class FooTest {

   @Test
   public void test() throws IOException {

      final CompilationUnitContext compilationUnit;
      try (BufferedReader r = new BufferedReader(
         new InputStreamReader(getClass().getResourceAsStream("FooTest_testFoo.lj"), "UTF-8"))) {
         final CommonTokenStream tokenStream = new CommonTokenStream(new LittleJLexer(new ANTLRInputStream(r)));
         compilationUnit = new LittleJParser(tokenStream).compilationUnit();
      }

      compilationUnit.accept(new AbstractParseTreeVisitor<Void>() {

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

      String query = "/CompilationUnit/ClassBody";

      select(compilationUnit, query);

   }

   private Object select(CompilationUnitContext compilationUnit, String query) {

      parseQuery(query);


      return null;
   }

   @Test
   public void testParseQuery() throws Exception {

      List<String> result = parseQuery("hallo");
      assertEquals(1, result.size());
      assertEquals("hallo", result.get(0));

      result = parseQuery("/hans/foo[@symbol = 'hallo \\'schnucki\\' \\/hui']/bar");
      assertEquals(3, result.size());

      assertEquals("hans", result.get(0));
      assertEquals("foo[@symbol = hallo 'schnucki' /hui]", result.get(1));
      assertEquals("bar", result.get(2));

   }

   private List<String> parseQuery(String query) {

      final List<String> result = new ArrayList<String>();

      StringBuilder sb = new StringBuilder();

      boolean escape = false;
      boolean insertNext = false;

      final char[] chars = query.toCharArray();
      for (int i = 0; i < chars.length; i++) {
         char c = chars[i];

         if (sb == null) {
            sb = new StringBuilder();
         }

         if (insertNext) {
            sb.append(c);
            insertNext = false;
         }
         else {
            if (escape && c == '\\') {
               insertNext = true;
               continue;
            }

            if (c == '\'') {

               if (escape) {
                  escape = false;
               }
               else {
                  escape = true;
               }
               continue;
            }

            if (c == '/') {
               result.add(sb.toString());
               sb = null;
            }
            else {
               sb.append(c);
            }

         }
      }

      if (sb != null) {
         result.add(sb.toString());
      }

      return result;
   }
}
