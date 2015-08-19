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
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.LittleJLexer;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.LittleJParser;

public class FormatTest {
   @Test
   public void testFormat() throws Exception {

      String content = "import foo.bar";

      final CommonTokenStream tokenStream = new CommonTokenStream(new LittleJLexer(new ANTLRInputStream(content)));
      final LittleJParser parser = new LittleJParser(tokenStream);

      CompositeSpan root = new CompositeSpan();

      RuleNode node = parser.importDeclaration();


      CompositeSpan result = transform(node);

      System.out.println(result);
   }

   private CompositeSpan transform(RuleNode node) {
      CompositeSpan result = (CompositeSpan) node.accept(new AbstractParseTreeVisitor<Span>() {

         Stack<RuleNode> currentNode = new Stack<>();

         @Override
         protected Span defaultResult() {
            CompositeSpan compositeSpan = new CompositeSpan();
            compositeSpan.element = currentNode.peek();
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
            tokenSpan.element = node;
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
                     aggregateResult((TokenSpan) last, (TokenSpan) nextResult).element = currentNode.peek();
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
      reduce(result);
      return result;
   }

   void reduce(CompositeSpan span) {
      for (Span childSpan : new ArrayList<>(span.spans)) {
         if (childSpan instanceof CompositeSpan) {
            reduce((CompositeSpan) childSpan);
         }
      }

      if (skip(span)) {
         CompositeSpan parent = span.parent;
         int idx = parent.spans.indexOf(span);

         if (span.spans.size() == 1) {
            Span next = span.spans.get(0);
            parent.spans.set(idx, next);
            next.parent = parent;
            next.element = span.element;
         }
         else {
            parent.spans.remove(idx);
            for (Span next : span.spans) {
               parent.spans.add(idx, next);
               next.parent = parent;
               idx++;
            }
         }
      }
   }

   private boolean skip(CompositeSpan span) {
      if (span.spans.size() > 1) {
         for (Span childSpan : span.spans) {
            if (childSpan instanceof CompositeSpan) {
               return false;
            }
         }
      }
      return span.parent != null;
   }
}
