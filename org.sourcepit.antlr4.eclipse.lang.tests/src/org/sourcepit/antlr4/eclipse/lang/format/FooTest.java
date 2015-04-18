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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.LittleJLexer;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.LittleJParser;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.LittleJParser.CompilationUnitContext;

public class FooTest {

   @Test
   public void test() throws IOException {

      final CompilationUnitContext compilationUnit;
      try (BufferedReader r = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(
         "FooTest_testFoo.lj"), "UTF-8"))) {

         // String ln = r.readLine();
         // while (ln != null) {
         // System.out.println(ln);
         // ln = r.readLine();
         // }
         final CommonTokenStream tokenStream = new CommonTokenStream(new LittleJLexer(new ANTLRInputStream(r)));
         compilationUnit = new LittleJParser(tokenStream).compilationUnit();
      }
      System.out.println(compilationUnit);

   }
}
