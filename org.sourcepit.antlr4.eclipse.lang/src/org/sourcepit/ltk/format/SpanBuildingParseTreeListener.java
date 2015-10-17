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

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.sourcepit.antlr4.eclipse.lang.TokenUtils;

public class SpanBuildingParseTreeListener implements ParseTreeListener {

   private final Stack<BufferedTokenStream> tokenStreamStack = new Stack<>();
   private final Stack<CompositeSpan> spanStack = new Stack<>();
   private CompositeSpan root;

   private List<Token> nextHidden;

   public SpanBuildingParseTreeListener(BufferedTokenStream tokenStream) {
      tokenStreamStack.push(tokenStream);
      nextHidden = TokenUtils.getHiddenTokensToRight(tokenStream, -1);
   }

   public CompositeSpan getRoot() {
      return root;
   }

   @Override
   public void enterEveryRule(ParserRuleContext ctx) {
      final CompositeSpan compositeSpan = new CompositeSpan();
      compositeSpan.context = new LinkedList<>();
      compositeSpan.context.add(ctx);
      spanStack.push(compositeSpan);
   }

   @Override
   public void visitTerminal(TerminalNode node) {
      final Token token = node.getSymbol();

      if (node.getSymbol().getChannel() == Token.DEFAULT_CHANNEL) {
         final List<Token> hiddenTokens = nextHidden;
         final BufferedTokenStream tokenStream = tokenStreamStack.peek();
         nextHidden = TokenUtils.getHiddenTokensToRight(tokenStream, token.getTokenIndex());
         if (!hiddenTokens.isEmpty()) {
            handleHiddenTokens(tokenStream, node.getParent(), hiddenTokens);
         }
      }

      final TokenSpan tokenSpan = new TokenSpan();

      final TokenRef tokenRef = new TokenRef();
      tokenRef.tokenStream = tokenStreamStack.peek();
      tokenRef.token = token;
      tokenSpan.tokens.add(tokenRef);
      attachToParent(tokenSpan);
   }

   private void handleHiddenTokens(BufferedTokenStream tokenStream, ParseTree parent, final List<Token> hiddenTokens) {
      for (Token hiddenToken : hiddenTokens) {
         final ParseResult result = parseHiddenToken(tokenStream, parent, hiddenToken);
         if (result != null) {
            tokenStreamStack.push(result.tokenStream);
            new ParseTreeWalker().walk(this, result.node);
            tokenStreamStack.pop();
         }
      }
   }

   public static final class ParseResult {
      public BufferedTokenStream tokenStream;
      public ParseTree node;
   }

   protected ParseResult parseHiddenToken(BufferedTokenStream tokenStream, ParseTree parent, Token hiddenToken) {
      return null;
   }

   @Override
   public void visitErrorNode(ErrorNode node) {
   }

   @Override
   public void exitEveryRule(ParserRuleContext ctx) {
      final CompositeSpan compositeSpan = spanStack.pop();
      if (spanStack.isEmpty()) {
         root = compositeSpan;
      }
      else {
         attachToParent(compositeSpan);
      }
   }

   private void attachToParent(final Span span) {
      final CompositeSpan parent = spanStack.peek();
      span.parent = parent;
      parent.spans.add(span);
   }

}
