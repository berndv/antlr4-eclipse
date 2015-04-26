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

package org.sourcepit.antlr4.astpath;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.LittleJLexer;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.LittleJParser;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.LittleJParser.CompilationUnitContext;

public class AstPathTest {
   @Test
   public void testParseÊmpty() {
      try {
         AstPath.parse("");
         fail();
      }
      catch (ParseCancellationException e) {
      }
      try {
         AstPath.parse("/");
         fail();
      }
      catch (ParseCancellationException e) {
      }
   }

   @Test
   public void testParseQuery() {
      final Query query = AstPath.parse("/CompilationUnit/ClassBody");

      Segment segment = query.getFirst();
      assertEquals("CompilationUnit", segment.getName());

      segment = segment.getNext();
      assertEquals("ClassBody", segment.getName());

      segment = segment.getNext();
      assertNull(segment);
   }

   @Test
   public void testParseQueryWithIndex() {
      final Query query = AstPath.parse("/hans/ foo[ 42 ]/bar ");

      Segment segment = query.getFirst();
      assertEquals("hans", segment.getName());

      segment = segment.getNext();
      assertEquals("foo", segment.getName());
      Index index = segment.getIndex();
      assertEquals(42, index.getIndex());

      segment = segment.getNext();
      assertEquals("bar", segment.getName());

      segment = segment.getNext();
      assertNull(segment);
   }

   @Test
   public void testExecQuery() throws Exception {

      String str = "";
      str += "package org.sourcepit.foo\n";
      str += "import org.sourcepit.bar.*\n";
      str += "import org.sourcepit.acme.*\n";
      str += "class Foo {}\n";

      System.out.println(str);


      LittleJParser parser = createParser(str);
      final CompilationUnitContext compilationUnit = parser.compilationUnit();

      Query query = AstPath.parse("/compilationUnit/importDeclaration");

      List<RuleContext> matches = AstPath.execute(compilationUnit, query, parser.getRuleNames());

      System.out.println();
   }

   static LittleJParser createParser(String query) {
      try (BufferedReader r = new BufferedReader(new StringReader(query))) {
         final CommonTokenStream tokenStream = new CommonTokenStream(new LittleJLexer(new ANTLRInputStream(r)));
         final LittleJParser parser = new LittleJParser(tokenStream);
         parser.setErrorHandler(new BailErrorStrategy());
         return parser;
      }
      catch (IOException e) {
         throw new IllegalStateException(e);
      }
   }
}
