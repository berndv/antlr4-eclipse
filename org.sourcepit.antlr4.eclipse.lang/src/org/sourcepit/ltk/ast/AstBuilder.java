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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

public class AstBuilder {

   private final ParserDelegate parserDelegeate;

   private final Stack<ParseResult> parseResultStack = new Stack<>();
   private final Stack<Integer> offsetStack = new Stack<>();

   public AstBuilder(ParserDelegate parserDelegeate) {
      this.parserDelegeate = parserDelegeate;
   }

   public AstNode build(String input) {
      offsetStack.push(Integer.valueOf(0));
      try {
         return handleParseResult(null, null, parserDelegeate.parse(input));
      }
      finally {
         offsetStack.pop();
      }
   }

   private AstNode handleParseResult(Terminal origin, Rule parent, ParseResult parseResult) {
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
      final List<AstNode> children = new ArrayList<>();
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
            final Token token = terminalNode.getSymbol();
            final List<Token> hiddenTokensToLeft = tokenStream.getHiddenTokensToLeft(token.getTokenIndex());
            if (hiddenTokensToLeft != null) {
               for (Token hiddenToken : hiddenTokensToLeft) {
                  final TerminalNodeImpl dummy = new TerminalNodeImpl(hiddenToken);
                  dummy.parent = ruleNode;
                  children.add(handleTerminalNode(null, rule, dummy));
               }
            }
            children.add(handleTerminalNode(null, rule, terminalNode));
         }
      }
      return rule;
   }

   private AstNode handleTerminalNode(Terminal origin, Rule parent, TerminalNode terminalNode) {
      final ParseResult parseResult = parseResultStack.peek();
      final Class<? extends Lexer> sourceType = parseResult.getLexer().getClass();
      final Token token = terminalNode.getSymbol();

      final int tokenType = token.getType();
      final int offset = offsetStack.peek().intValue() + token.getStartIndex();
      final int channel = token.getChannel();
      final String text = token.getText();
      final TerminalType type = new TerminalType(sourceType, tokenType);
      final Terminal terminal = new Terminal(parent, type, offset, channel, text, origin);

      final ParseResult nestedParseResult = parserDelegeate.parseNestedLanguage(sourceType, token);
      if (nestedParseResult == null) {
         return terminal;
      }
      else {
         offsetStack.push(Integer.valueOf(token.getStartIndex()));
         try {
            return handleParseResult(terminal, parent, nestedParseResult);
         }
         finally {
            offsetStack.pop();
         }
      }
   }

}
