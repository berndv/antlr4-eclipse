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

package org.sourcepit.antlr4.eclipse.lang.tests.line;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.tests.javadoc.JavadocLexer;
import org.sourcepit.antlr4.eclipse.lang.tests.line.LineParser.JavadocContext;

public class LineParserTest {

   @Test
   public void test() {
      StringBuilder jdoc = new StringBuilder();
      jdoc.append("/**\n\n\n");
      jdoc.append(" * \n");
      jdoc.append(" \n");
      jdoc.append("\n");
      jdoc.append(" * Wie Gehts?\n");
      jdoc.append(" */");

      final CommonTokenStream tokenStream = new CommonTokenStream(
         new JavadocLexer(new ANTLRInputStream(jdoc.toString())));

      final LineParser parser = new LineParser(tokenStream);

      JavadocContext javadoc = parser.javadoc();
      final String stringTree = javadoc.toStringTree(parser);
      System.out.println(stringTree);
   }

}
