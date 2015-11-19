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

import java.io.IOException;
import java.io.StringReader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sourcepit.ltk.antlr4.ANTLRv4Lexer;
import org.sourcepit.ltk.antlr4.ANTLRv4Parser;

public final class AntlrHarness {
   private AntlrHarness() {
      super();
   }

   public static class ParseRes {
      public ParseTree tree;
      public BufferedTokenStream tokenStream;
   }

   public static ParseRes parse(String grammar) {
      final ANTLRInputStream input;
      try {
         input = new ANTLRInputStream(new StringReader(grammar));
      }
      catch (IOException e) {
         throw new IllegalStateException(e);
      }
      final CommonTokenStream tokenStream = new CommonTokenStream(new ANTLRv4Lexer(input));
      final ANTLRv4Parser parser = new ANTLRv4Parser(tokenStream);

      final ParseRes res = new ParseRes();
      res.tree = parser.grammarSpec();
      res.tokenStream = tokenStream;
      return res;
   }
}
