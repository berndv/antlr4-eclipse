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

package org.sourcepit.antlr4.eclipse.lang.tests.littlej.query;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.query.LittleJQParser.QueryContext;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.query.LittleJQParser.QuerySegmentContext;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.query.LittleJQParser.SegmentNameContext;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.query.LittleJQParser.SegmentQueryContext;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.query.LittleJQParser.SegmentQueryExpressionContext;
import org.sourcepit.antlr4.eclipse.lang.tests.littlej.query.LittleJQParser.SegmentQueryTypeContext;

public class Query {
   private final List<QuerySegment> segments = new ArrayList<QuerySegment>();

   public List<QuerySegment> getSegments() {
      return segments;
   }

   public static Query parse(String query) {

      final Query[] result = new Query[1];

      try (BufferedReader r = new BufferedReader(new StringReader(query))) {
         final CommonTokenStream tokenStream = new CommonTokenStream(new LittleJQLexer(new ANTLRInputStream(r)));
         final LittleJQParser parser = new LittleJQParser(tokenStream);
         parser.addParseListener(new LittleJQBaseListener() {

            private final Stack<Object> stack = new Stack<>();

            @Override
            public void enterQuery(QueryContext ctx) {
               stack.push(new Query());
            }

            @Override
            public void enterQuerySegment(QuerySegmentContext ctx) {
               stack.push(new QuerySegment());
            }

            @Override
            public void enterSegmentName(SegmentNameContext ctx) {
               final QuerySegment segment = (QuerySegment) stack.peek();
               segment.setName(ctx.getStart().getText());
            }

            @Override
            public void enterSegmentQuery(SegmentQueryContext ctx) {
               stack.push(new QuerySegmentQuery());
            }

            @Override
            public void enterSegmentQueryType(SegmentQueryTypeContext ctx) {
               final QuerySegmentQuery expression = (QuerySegmentQuery) stack.peek();
               expression.setType(ctx.getStart().getText());
            }

            @Override
            public void enterSegmentQueryExpression(SegmentQueryExpressionContext ctx) {
               final QuerySegmentQuery expression = (QuerySegmentQuery) stack.peek();
               String expr = ctx.getStart().getText();
               expr = expr.substring(1, expr.length() - 1).replace("\\'", "'");
               expr = expr.replace("\\\\", "\\");
               expression.setExpression(expr);
            }

            @Override
            public void exitSegmentQuery(SegmentQueryContext ctx) {
               final QuerySegmentQuery expression = (QuerySegmentQuery) stack.pop();
               final QuerySegment querySegment = (QuerySegment) stack.peek();
               querySegment.setExpression(expression);
            }

            @Override
            public void exitQuerySegment(QuerySegmentContext ctx) {
               final QuerySegment segment = (QuerySegment) stack.pop();
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
