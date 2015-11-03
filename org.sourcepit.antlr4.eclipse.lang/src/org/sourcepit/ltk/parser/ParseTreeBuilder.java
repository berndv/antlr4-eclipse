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

package org.sourcepit.ltk.parser;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

public class ParseTreeBuilder {

   private final ParserDelegate parserDelegeate;

   private final LinkedList<Terminal> terminals = new LinkedList<>();
   private final Stack<ParseResult> parseResultStack = new Stack<>();
   private final Stack<Integer> offsetStack = new Stack<>();

   public ParseTreeBuilder(ParserDelegate parserDelegeate) {
      this.parserDelegeate = parserDelegeate;
   }

   public ParseNode build(String input, Class<? extends ParserRuleContext> ruleType) {
      offsetStack.push(Integer.valueOf(0));
      try {
         return handleParseResult(null, null, parserDelegeate.parse(input, ruleType));
      }
      finally {
         offsetStack.pop();
      }
   }

   private ParseNode handleParseResult(Terminal origin, Rule parent, ParseResult parseResult) {
      if (parseResult.getException() == null) {
         parseResultStack.push(parseResult);
         try {
            final ParseTree parseTree = parseResult.getParseTree();
            if (parseTree instanceof RuleNode) {
               return handleRuleNode(origin, parent, (RuleNode) parseTree);
            }
            else {
               return handleTerminalNode(origin, parent, (TerminalNode) parseTree);
            }
         }
         finally {
            parseResultStack.pop();
         }
      }
      else {
         throw parseResult.getException();
      }
   }

   private Rule handleRuleNode(Terminal origin, Rule parent, RuleNode ruleNode) {
      final RuleContext ruleContext = ruleNode.getRuleContext();
      final List<ParseNode> children = new ArrayList<>();
      final Rule rule = new Rule(parent, children, ruleContext.getClass(), origin);
      for (int i = 0; i < ruleNode.getChildCount(); i++) {
         final ParseTree child = ruleNode.getChild(i);
         if (child instanceof RuleNode) {
            children.add(handleRuleNode(null, rule, (RuleNode) child));
         }
         else {
            final TerminalNode terminalNode = (TerminalNode) child;
            final ParseResult parseResult = parseResultStack.peek();
            final BufferedTokenStream tokenStream = parseResult.getTokenStream();
            final org.antlr.v4.runtime.Token token = terminalNode.getSymbol();

            final List<org.antlr.v4.runtime.Token> hiddenTokensToLeft = tokenStream
               .getHiddenTokensToLeft(token.getTokenIndex());
            if (hiddenTokensToLeft != null && !hiddenTokensToLeft.isEmpty()) {
               int prevTokenIdx = hiddenTokensToLeft.get(0).getTokenIndex() - 1;
               int startIdx;
               if (prevTokenIdx < 0) {
                  startIdx = 0;
               }
               else {
                  startIdx = getLen(tokenStream.get(prevTokenIdx), hiddenTokensToLeft);
               }
               for (int j = startIdx; j < hiddenTokensToLeft.size(); j++) {
                  final TerminalNodeImpl dummy = new TerminalNodeImpl(hiddenTokensToLeft.get(j));
                  dummy.parent = ruleNode;
                  children.add(handleTerminalNode(null, rule, dummy));
               }
            }

            if (terminalNode.getSymbol().getType() != Lexer.EOF) {
               children.add(handleTerminalNode(null, rule, terminalNode));
            }

            final List<org.antlr.v4.runtime.Token> hiddenTokensToRight = tokenStream
               .getHiddenTokensToRight(token.getTokenIndex());
            if (hiddenTokensToRight != null) {
               for (int j = 0; j < getLen(token, hiddenTokensToRight); j++) {
                  final TerminalNodeImpl dummy = new TerminalNodeImpl(hiddenTokensToRight.get(j));
                  dummy.parent = ruleNode;
                  children.add(handleTerminalNode(null, rule, dummy));
               }
            }
         }
      }
      return rule;
   }

   // TODO: Move to parserDelegeate
   private int getLen(org.antlr.v4.runtime.Token token, List<org.antlr.v4.runtime.Token> hiddenTokensToRight) {
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

   private ParseNode handleTerminalNode(Terminal origin, Rule parent, TerminalNode terminalNode) {
      final ParseResult parseResult = parseResultStack.peek();
      final Class<? extends Lexer> sourceType = parseResult.getLexer().getClass();
      final org.antlr.v4.runtime.Token antlrToken = terminalNode.getSymbol();

      final int tokenType = antlrToken.getType();
      final int offset = offsetStack.peek().intValue() + antlrToken.getStartIndex();
      final int channel = antlrToken.getChannel();
      final String text = antlrToken.getText();
      final TokenType type = new TokenType(sourceType, tokenType);
      final Token token = new Token(type, channel, offset, text);

      final Terminal previous = terminals.isEmpty() ? null : terminals.getLast();
      final Terminal terminal = new Terminal(previous, parent, token, origin);

      final ParseResult nestedParseResult = parserDelegeate.parseNestedLanguage(sourceType, antlrToken);
      if (nestedParseResult == null) {
         terminals.add(terminal);
         return terminal;
      }
      else {
         offsetStack.push(Integer.valueOf(antlrToken.getStartIndex()));
         try {
            return handleParseResult(terminal, parent, nestedParseResult);
         }
         finally {
            offsetStack.pop();
         }
      }
   }

}
