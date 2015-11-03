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

package org.sourcepit.ltk.format;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sourcepit.antlr4.eclipse.lang.CommentLexer;
import org.sourcepit.antlr4.eclipse.lang.CommentParser;
import org.sourcepit.antlr4.eclipse.lang.ParserUtils;
import org.sourcepit.ltk.parser.ParseResult;
import org.sourcepit.ltk.parser.ParserDelegate;

public class CommentParserDelegate implements ParserDelegate {
   @Override
   public ParseResult parse(String input, Class<? extends ParserRuleContext> ruleType) {
      final CharStream charStream = new ANTLRInputStream(input);
      final Lexer lexer = new CommentLexer(charStream);
      final BufferedTokenStream tokenStream = new CommonTokenStream(lexer);
      final CommentParser parser = new CommentParser(tokenStream);
      try {
         final ParseTree parseTree = ParserUtils.parse(parser, ruleType);
         return new ParseResult(lexer, tokenStream, parser, parseTree);
      }
      catch (RecognitionException e) {
         return new ParseResult(lexer, tokenStream, parser, e);
      }
   }

   @Override
   public ParseResult parseNestedLanguage(Class<? extends Lexer> sourceType, Token token) {
      return null;
   }
}