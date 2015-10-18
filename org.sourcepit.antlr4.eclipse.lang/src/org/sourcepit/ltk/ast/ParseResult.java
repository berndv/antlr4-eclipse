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

package org.sourcepit.ltk.ast;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;

public class ParseResult {
   private final Lexer lexer;
   private final BufferedTokenStream tokenStream;
   private final Parser parser;
   private final ParseTree parseTree;
   private final RecognitionException exception;

   public ParseResult(Lexer lexer, BufferedTokenStream tokenStream, Parser parser, ParseTree parseTree) {
      this(lexer, tokenStream, parser, parseTree, null);
   }

   public ParseResult(Lexer lexer, BufferedTokenStream tokenStream, Parser parser, RecognitionException exception) {
      this(lexer, tokenStream, parser, null, exception);
   }

   private ParseResult(Lexer lexer, BufferedTokenStream tokenStream, Parser parser, ParseTree parseTree,
      RecognitionException exception) {
      this.lexer = lexer;
      this.tokenStream = tokenStream;
      this.parser = parser;
      this.parseTree = parseTree;
      this.exception = exception;
   }

   public Lexer getLexer() {
      return lexer;
   }

   public BufferedTokenStream getTokenStream() {
      return tokenStream;
   }

   public Parser getParser() {
      return parser;
   }

   public ParseTree getParseTree() {
      return parseTree;
   }

   public RecognitionException getException() {
      return exception;
   }

}