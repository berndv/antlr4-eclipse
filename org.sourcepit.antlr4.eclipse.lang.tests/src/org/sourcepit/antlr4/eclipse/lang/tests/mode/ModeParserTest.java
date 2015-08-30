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

package org.sourcepit.antlr4.eclipse.lang.tests.mode;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.tests.jd.ModeLexer;
import org.sourcepit.antlr4.eclipse.lang.tests.jd.ModeParser;
import org.sourcepit.antlr4.eclipse.lang.tests.jd.ModeParser.JavadocContext;

public class ModeParserTest {

   @Test
   public void test() {
      StringBuilder jdoc = new StringBuilder();
      jdoc.append("/**\n");
      jdoc.append(" * H@llo @lf<br>\n");
      jdoc.append(" * {@code wie}<br>\n");
      jdoc.append(" * gehts?<br>\n");
      jdoc.append(" * @see {@code me}\n");
      jdoc.append(" * @author Bernd\n");
      jdoc.append(" */");

      final CommonTokenStream tokenStream = new CommonTokenStream(new ModeLexer(new ANTLRInputStream(jdoc.toString())));

      final ModeParser parser = new ModeParser(tokenStream);

      JavadocContext javadoc = parser.javadoc();
      final String stringTree = javadoc.toStringTree(parser);
      System.out.println(stringTree);
   }

}
