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

package org.sourcepit.antlr4.astpath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.sourcepit.antlr4.astpath.AstPathParser.IndexQueryContext;
import org.sourcepit.antlr4.astpath.AstPathParser.QueryContext;
import org.sourcepit.antlr4.astpath.AstPathParser.SegmentContext;
import org.sourcepit.antlr4.astpath.AstPathParser.SegmentNameContext;
import org.sourcepit.antlr4.astpath.AstPathParser.TerminalQueryContext;
import org.sourcepit.antlr4.astpath.AstPathParser.TokenAttributeContext;
import org.sourcepit.antlr4.astpath.AstPathParser.TokenExpressionContext;

public class AstPath {
   public static Query parse(String query) {
      final Query[] result = new Query[1];

      try (BufferedReader r = new BufferedReader(new StringReader(query))) {
         final CommonTokenStream tokenStream = new CommonTokenStream(new AstPathLexer(new ANTLRInputStream(r)));
         final AstPathParser parser = new AstPathParser(tokenStream);
         parser.addParseListener(new AstPathBaseListener() {

            private final Stack<Object> stack = new Stack<>();

            @Override
            public void enterQuery(QueryContext ctx) {
               stack.push(new Query());
            }

            @Override
            public void enterSegment(SegmentContext ctx) {
               stack.push(new Segment());
            }

            @Override
            public void enterSegmentName(SegmentNameContext ctx) {
               final Segment segment = (Segment) stack.peek();
               segment.setName(ctx.getStart().getText());
            }

            @Override
            public void enterIndexQuery(IndexQueryContext ctx) {
               final IndexQuery indexQuery = new IndexQuery();
               indexQuery.setIndex(Integer.valueOf(ctx.IndexNumeral().getSymbol().getText()).intValue());
               stack.push(indexQuery);
            }

            @Override
            public void exitIndexQuery(IndexQueryContext ctx) {
               final IndexQuery indexQuery = (IndexQuery) stack.pop();
               final Segment segment = (Segment) stack.peek();
               segment.setIndexQuery(indexQuery);
            }

            @Override
            public void enterTerminalQuery(TerminalQueryContext ctx) {
               stack.push(new TerminalQuery());
            }

            @Override
            public void enterTokenAttribute(TokenAttributeContext ctx) {
               final TerminalQuery terminalQuery = (TerminalQuery) stack.peek();
               terminalQuery.setTokenAttribute(ctx.getStart().getText());
            }

            @Override
            public void exitTokenExpression(TokenExpressionContext ctx) {
               final TerminalQuery terminalQuery = (TerminalQuery) stack.peek();
               String expr = ctx.getChild(3).getText();
               expr = expr.substring(1, expr.length() - 1).replace("\\'", "'");
               expr = expr.replace("\\\\", "\\");
               terminalQuery.setAttributeValue(expr);
            }

            @Override
            public void exitTerminalQuery(TerminalQueryContext ctx) {
               final TerminalQuery terminalQuery = (TerminalQuery) stack.pop();
               final Segment segment = (Segment) stack.peek();
               segment.setTerminalQuery(terminalQuery);
            }

            @Override
            public void exitSegment(SegmentContext ctx) {
               final Segment segment = (Segment) stack.pop();
               final Query query = (Query) stack.peek();
               query.getSegments().add(segment);
            }

            @Override
            public void exitQuery(QueryContext ctx) {
               result[0] = (Query) stack.pop();
            }
         });
         parser.query();
      }
      catch (IOException e) {
         throw new IllegalStateException(e);
      }

      return result[0];
   }
}
