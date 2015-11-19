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

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import org.sourcepit.ltk.antlr4.ANTLRv4Lexer;
import org.sourcepit.ltk.antlr4.ANTLRv4Parser;
import org.sourcepit.ltk.antlr4.ANTLRv4Parser.GrammarSpecContext;

public class ParseTreeIterableTest {

   @Test
   public void test() {
      final ANTLRInputStream input;
      try {
         input = new ANTLRInputStream(new StringReader("grammar Foo;foo:FOO;bar:BAR;"));
      }
      catch (IOException e) {
         throw new IllegalStateException(e);
      }
      final CommonTokenStream tokenStream = new CommonTokenStream(new ANTLRv4Lexer(input));
      final ANTLRv4Parser parser = new ANTLRv4Parser(tokenStream);

      GrammarSpecContext grammarSpec = parser.grammarSpec();

      final List<ParseTree> expected = new ArrayList<ParseTree>();
      collect(expected, grammarSpec);

      final List<ParseTree> actual = new ArrayList<ParseTree>();
      for (ParseTree parseTree : new ParseTreeIterable(grammarSpec)) {
         actual.add(parseTree);
      }

      assertEquals(expected, actual);
   }

   private static void collect(Collection<ParseTree> collection, ParseTree tree) {
      collection.add(tree);

      for (int i = 0; i < tree.getChildCount(); i++) {
         collect(collection, tree.getChild(i));
      }
   }

}
