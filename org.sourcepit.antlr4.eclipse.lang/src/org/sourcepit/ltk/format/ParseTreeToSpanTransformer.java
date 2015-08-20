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

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang.ObjectUtils;

public class ParseTreeToSpanTransformer {
   public Span transform(RuleNode node) {
      CompositeSpan result = (CompositeSpan) node.accept(new AbstractParseTreeVisitor<Span>() {

         private Stack<RuleNode> currentNode = new Stack<>();

         @Override
         protected Span defaultResult() {
            CompositeSpan compositeSpan = new CompositeSpan();
            compositeSpan.context = new ArrayList<>(3);
            compositeSpan.context.add(currentNode.peek());
            return compositeSpan;
         }

         @Override
         public Span visitChildren(RuleNode node) {
            currentNode.push(node);
            Span res = super.visitChildren(node);
            currentNode.pop();
            return res;
         }

         @Override
         public Span visitTerminal(TerminalNode node) {
            Token token = new Token();
            token.element = node;
            TokenSpan tokenSpan = new TokenSpan();
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
         while (!ObjectUtils.equals(ctx, parentCtx)) {
            span.context.add(ctx);
            if (ctx == null) {
               System.out.println();
            }
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
