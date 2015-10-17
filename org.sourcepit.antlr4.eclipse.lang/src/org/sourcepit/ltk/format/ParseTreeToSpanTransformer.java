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
import java.util.Iterator;
import java.util.List;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.RuleNode;
import org.apache.commons.lang.ObjectUtils;
import org.sourcepit.ltk.format.SpanBuildingParseTreeListener.ParseResult;

public class ParseTreeToSpanTransformer {

   public Span transform(BufferedTokenStream lexer, RuleNode node) {
      final SpanBuildingParseTreeListener spanBuilder = new SpanBuildingParseTreeListener(lexer) {
         @Override
         protected ParseResult parseHiddenToken(BufferedTokenStream tokenStream, ParseTree parent, Token hiddenToken) {
            return ParseTreeToSpanTransformer.this.parseHiddenToken(tokenStream, parent, hiddenToken);
         }
      };
      new ParseTreeWalker().walk(spanBuilder, node);
      final CompositeSpan span = spanBuilder.getRoot();
      return fillContexts(reduce(aggregate(span)));
   }

   protected ParseResult parseHiddenToken(BufferedTokenStream tokenStream, ParseTree parent, Token hiddenToken) {
      return null;
   }

   private CompositeSpan aggregate(CompositeSpan compositeSpan) {
      final List<Span> spans = compositeSpan.spans;
      if (spans.size() > 1) {
         Iterator<Span> it = spans.iterator();
         List<Span> processed = new ArrayList<>();
         Span prev = it.next();
         while (it.hasNext()) {
            Span next = it.next();
            Span aggregate = aggregate(prev, next);
            if (aggregate == null) {
               processed.add(prev);
               prev = next;
            }
            else {
               prev = aggregate;
            }
            next = null;
         }
         processed.add(prev);
         compositeSpan.spans = processed;
      }

      for (Span span : compositeSpan.spans) {
         if (span instanceof CompositeSpan) {
            aggregate((CompositeSpan) span);
         }
      }

      return compositeSpan;
   }

   private Span aggregate(Span prev, Span next) {
      if (prev instanceof TokenSpan && next instanceof TokenSpan) {
         return aggregate((TokenSpan) prev, (TokenSpan) next);
      }
      return null;
   }

   protected TokenSpan aggregate(TokenSpan prev, TokenSpan next) {
      prev.tokens.addAll(next.tokens);
      return prev;
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
}
