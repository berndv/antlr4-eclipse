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

import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.sourcepit.ltk.antlr4.ANTLRv4Lexer;
import org.sourcepit.ltk.antlr4.ANTLRv4Parser;
import org.sourcepit.ltk.antlr4.ANTLRv4Parser.LexerAltListContext;
import org.sourcepit.ltk.antlr4.ANTLRv4Parser.LexerRuleBlockContext;
import org.sourcepit.ltk.antlr4.ANTLRv4Parser.RuleAltListContext;
import org.sourcepit.ltk.antlr4.ANTLRv4Parser.RuleBlockContext;
import org.sourcepit.ltk.antlr4.ParserUtils;
import org.sourcepit.ltk.jcomment.CommentLexer;
import org.sourcepit.ltk.jcomment.CommentParser;
import org.sourcepit.ltk.parser.ParseResult;
import org.sourcepit.ltk.parser.ParserDelegate;
import org.sourcepit.ltk.parser.TokenUtils;

public class AntlrParserDelegate implements ParserDelegate {

   @Override
   public ParseResult parse(String input, Class<? extends ParserRuleContext> ruleType) {
      final CharStream charStream = new ANTLRInputStream(input);
      final Lexer lexer = new ANTLRv4Lexer(charStream);
      final BufferedTokenStream tokenStream = new CommonTokenStream(lexer);
      final ANTLRv4Parser parser = new ANTLRv4Parser(tokenStream);
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
      if (ANTLRv4Lexer.class == sourceType) {
         if (ANTLRv4Lexer.BLOCK_COMMENT == token.getType() || ANTLRv4Lexer.LINE_COMMENT == token.getType()) {
            final CharStream charStream = new ANTLRInputStream(token.getText());
            final Lexer lexer = new CommentLexer(charStream);
            final BufferedTokenStream tokenStream = new CommonTokenStream(lexer);
            final CommentParser parser = new CommentParser(tokenStream);
            try {
               return new ParseResult(lexer, tokenStream, parser, parser.comment());
            }
            catch (RecognitionException e) {
               return new ParseResult(lexer, tokenStream, parser, e);
            }
         }
      }
      return null;
   }

   @Override
   public int getLen(RuleNode parent, Token token, List<Token> hiddenTokensToRight, TokenStream tokenStream) {

      // parser rule

      // Put all the following whitespace (especially comments) to the next rule (labeledAlt)
      if (parent instanceof RuleBlockContext && token.getType() == ANTLRv4Lexer.COLON) {
         return 0;
      }

      // Fetch all the following whitespace (especially comments) when we stand on the last token before the ; in a rule
      // block
      final int nextTokenIdx = token.getTokenIndex() + hiddenTokensToRight.size() + 1;
      if (nextTokenIdx < tokenStream.size()) {
         final Token nextToken = tokenStream.get(nextTokenIdx);
         if (nextToken.getType() == ANTLRv4Lexer.SEMI) {
            ParseTree p = parent.getParent();
            while (p != null && !(p instanceof RuleBlockContext || p instanceof LexerRuleBlockContext)) {
               p = p.getParent();
            }
            if (p instanceof RuleBlockContext) {
               final RuleBlockContext ruleBlock = (RuleBlockContext) p;
               if (ruleBlock.SEMI().getSymbol().getTokenIndex() == nextTokenIdx) {
                  return hiddenTokensToRight.size();
               }
            }
            if (p instanceof LexerRuleBlockContext) {
               final LexerRuleBlockContext ruleBlock = (LexerRuleBlockContext) p;
               if (ruleBlock.SEMI().getSymbol().getTokenIndex() == nextTokenIdx) {
                  return hiddenTokensToRight.size();
               }
            }
         }
      }

      if (parent instanceof RuleBlockContext && token.getType() == ANTLRv4Lexer.SEMI) {
         return 0;
      }

      // Put all the following whitespace (especially comments) to the next rule (labeledAlt)
      if (parent instanceof RuleAltListContext && token.getType() == ANTLRv4Lexer.OR) {
         return 0;
      }


      // lexer rule
      if (parent instanceof LexerRuleBlockContext && token.getType() == ANTLRv4Lexer.COLON) {
         return 0;
      }

      if (parent instanceof LexerRuleBlockContext && token.getType() == ANTLRv4Lexer.SEMI) {
         return 0;
      }

      // Put all the following whitespace (especially comments) to the next rule (labeledAlt)
      if (parent instanceof LexerAltListContext && token.getType() == ANTLRv4Lexer.OR) {
         return 0;
      }


      int len = 0;
      for (org.antlr.v4.runtime.Token hiddenToken : hiddenTokensToRight) {
         final String text = hiddenToken.getText();
         if (TokenUtils.isWs(text)) {
            len++;
         }
         else {
            if (hiddenToken.getCharPositionInLine() > token.getCharPositionInLine()) {
               len++;
            }
            else {
               break;
            }
         }
      }
      return len;
   }
}
