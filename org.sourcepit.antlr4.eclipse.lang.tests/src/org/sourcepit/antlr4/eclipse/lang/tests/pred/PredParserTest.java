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

package org.sourcepit.antlr4.eclipse.lang.tests.pred;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.tests.pred.PredParser.ProgContext;

public class PredParserTest {

   @Test
   public void test() {
      StringBuilder jdoc = new StringBuilder();

      jdoc.append("enum = 0;");

      final CommonTokenStream tokenStream = new CommonTokenStream(new PredLexer(new ANTLRInputStream(jdoc.toString())));

      PredParser.java5 = false;

      final PredParser parser = new PredParser(tokenStream);

      ProgContext javadoc = parser.prog();

      final String stringTree = javadoc.toStringTree(parser);
      System.out.println(stringTree);
   }

}
