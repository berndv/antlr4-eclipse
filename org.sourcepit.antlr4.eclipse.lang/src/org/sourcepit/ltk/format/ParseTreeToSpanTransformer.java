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

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang.ObjectUtils;
import org.sourcepit.antlr4.eclipse.lang.CommentLexer;
import org.sourcepit.antlr4.eclipse.lang.CommentParser;
import org.sourcepit.antlr4.eclipse.lang.CommentParser.CommentContext;

public class ParseTreeToSpanTransformer {
   public Span transform(BufferedTokenStream lexer, RuleNode node) {

      final Stack<CompositeSpan> currentSpan = new Stack<>();

      CompositeSpan result = (CompositeSpan) node.accept(new AbstractParseTreeVisitor<Span>() {

         @Override
         protected Span defaultResult() {
            return currentSpan.peek();
         }

         @Override
         public Span visitChildren(RuleNode node) {
            final CompositeSpan compositeSpan = new CompositeSpan();
            compositeSpan.context = new ArrayList<>(3);
            compositeSpan.context.add(node);
            currentSpan.push(compositeSpan);
            Span res = super.visitChildren(node);
            currentSpan.pop();
            return res;
         }

         @Override
         public Span visitTerminal(TerminalNode node) {
            final TokenSpan tokenSpan = new TokenSpan();

            final List<org.antlr.v4.runtime.Token> hiddenTokens = lexer
               .getHiddenTokensToLeft(node.getSymbol().getTokenIndex());
            if (hiddenTokens != null) {
               for (org.antlr.v4.runtime.Token hiddenToken : hiddenTokens) {
                  // final Token token = new Token();

                  System.out.println(hiddenToken.getType());

                  switch (hiddenToken.getType()) {
                     case 19 :
                     case 18 :
                        CommonTokenStream tokenStream = new CommonTokenStream(
                           new CommentLexer(new ANTLRInputStream(hiddenToken.getText())));
                        CommentParser parser = new CommentParser(tokenStream);
                        final CommentContext comment = parser.comment();

                        Span transform = transform(tokenStream, comment);
                        CompositeSpan parent = currentSpan.peek();
                        parent.spans.add(transform);
                        transform.parent = parent;
                        break;
                     default :
                        break;
                  }

                  // final TerminalNodeImpl terminalNode = new TerminalNodeImpl(hiddenToken);
                  // terminalNode.parent = node.getParent();
                  // token.element = terminalNode;
                  // token.parent = tokenSpan;
                  // tokenSpan.tokens.add(token);
               }
            }

            final Token token = new Token();
            token.element = node;
            token.parent = tokenSpan;
            tokenSpan.tokens.add(token);

            return tokenSpan;
         }

         @Override
         protected Span aggregateResult(Span aggregate, Span nextResult) {
            if (aggregate instanceof CompositeSpan) {
               CompositeSpan compositeSpan = (CompositeSpan) aggregate;
               if (!compositeSpan.spans.isEmpty() && nextResult instanceof TokenSpan) {
                  Span last = compositeSpan.spans.get(compositeSpan.spans.size() - 1);
                  if (last instanceof TokenSpan) {
                     aggregateResult((TokenSpan) last, (TokenSpan) nextResult);
                     return compositeSpan;
                  }
               }
               compositeSpan.spans.add(nextResult);
               nextResult.parent = compositeSpan;
               return compositeSpan;
            }


            throw new IllegalStateException(
               aggregate.getClass().getSimpleName() + " " + nextResult.getClass().getSimpleName());
         }

         private TokenSpan aggregateResult(TokenSpan aggregate, TokenSpan nextResult) {
            for (Token token : nextResult.tokens) {
               aggregate.tokens.add(token);
               token.parent = aggregate;
            }
            return aggregate;
         }


      });
      return fillContexts(reduce(result));
   }

   private Span fillContexts(Span span) {

      RuleNode ctx = getFirstContext(span);
      if (ctx != null) {
         final RuleNode parentCtx = span.parent == null ? null : getFirstContext(span.parent);
         ctx = (RuleNode) ctx.getParent();
         while (ctx != null && !ObjectUtils.equals(ctx, parentCtx)) {
            span.context.add(ctx);
            ctx = (RuleNode) ctx.getParent();
         }
      }

      if (span instanceof CompositeSpan) {
         for (Span childSpan : ((CompositeSpan) span).spans) {
            fillContexts(childSpan);
         }
      }

      return span;
   }

   private RuleNode getFirstContext(Span span) {
      final List<RuleNode> context = span.context;
      if (context == null) {
         return null;
      }
      if (context.isEmpty()) {
         return null;
      }
      return context.get(0);
   }

   private Span reduce(CompositeSpan span) {
      for (Span childSpan : new ArrayList<>(span.spans)) {
         if (childSpan instanceof CompositeSpan) {
            reduce((CompositeSpan) childSpan);
         }
      }

      final CompositeSpan parent = span.parent;
      if (parent == null) {
         if (span.spans.size() == 1) {
            final Span next = span.spans.get(0);
            next.parent = null;
            return next;
         }
         return span;
      }
      else if (span.spans.size() == 1) {
         int idx = parent.spans.indexOf(span);
         final Span next = span.spans.get(0);
         parent.spans.set(idx, next);
         next.parent = parent;
         if (next.context == null) {
            next.context = span.context;
         }
      }

      return null;

   }
}
