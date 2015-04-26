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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.sourcepit.antlr4.astpath.AstPathParser.IndexContext;
import org.sourcepit.antlr4.astpath.AstPathParser.NameContext;
import org.sourcepit.antlr4.astpath.AstPathParser.QueryContext;
import org.sourcepit.antlr4.astpath.AstPathParser.SegmentContext;

public class AstPath {
   private static final class QueryBuilder extends AstPathBaseListener {
      private final Stack<Object> stack = new Stack<>();

      private Query query;

      @Override
      public void enterQuery(QueryContext ctx) {
         stack.push(new Query());
      }

      @Override
      public void enterSegment(SegmentContext ctx) {
         stack.push(new Segment());
      }

      @Override
      public void exitName(NameContext ctx) {
         final Segment segment = (Segment) stack.peek();
         segment.setName(ctx.getText());
      }

      @Override
      public void enterIndex(IndexContext ctx) {
         stack.push(new Index());
      }

      @Override
      public void exitIndex(IndexContext ctx) {
         final Index index = (Index) stack.pop();
         index.setIndex(Integer.valueOf(ctx.IndexNumeral().getText()).intValue());
         final Segment segment = (Segment) stack.peek();
         segment.setIndex(index);
      }

      @Override
      public void exitSegment(SegmentContext ctx) {
         final Segment segment = (Segment) stack.pop();
         final Object parent = stack.peek();
         if (parent instanceof Segment) {
            ((Segment) parent).setNext(segment);
         }
         else {
            ((Query) parent).setFirst(segment);
         }
      }

      @Override
      public void exitQuery(QueryContext ctx) {
         query = (Query) stack.pop();
      }

      public Query getQuery() {
         return query;
      }
   }

   private final static class AstQueryExecutor {

      public List<RuleContext> execute(RuleContext ruleContext, Query query, String[] ruleNames) {
         final Segment first = query.getFirst();
         if (isMatch(first, ruleContext, ruleNames)) {
            final List<RuleContext> parents = Collections.singletonList(ruleContext);
            final Segment next = first.getNext();
            if (next == null) {
               return parents;
            }
            return exec(ruleNames, parents, next);
         }
         return Collections.emptyList();
      }

      private List<RuleContext> exec(String[] ruleNames, List<RuleContext> parents, Segment subQuery) {
         final String ruleName = subQuery.getName();
         final int index = subQuery.getIndex() == null ? 0 : subQuery.getIndex().getIndex();

         final List<RuleContext> matches = new ArrayList<>();
         for (RuleContext parent : parents) {
            collectChilds(ruleNames, parent, ruleName, index, matches);
         }

         final Segment next = subQuery.getNext();
         if (next == null) {
            return matches;
         }
         return exec(ruleNames, matches, next);

      }

      private void collectChilds(String[] ruleNames, RuleContext ruleContext, String ruleName, int index,
         List<RuleContext> childs) {
         final int childCount = ruleContext.getChildCount();
         for (int i = 0; i < childCount; i++) {
            final ParseTree child = ruleContext.getChild(i);
            if (child instanceof RuleNode) {
               final RuleContext childContext = ((RuleNode) child).getRuleContext();
               final int ruleIndex = childContext.getRuleIndex();
               if (ruleName.equals(ruleNames[ruleIndex])) {
                  childs.add(childContext);
               }
            }
         }
      }

      private static boolean isMatch(Segment segment, RuleContext ruleContext, String[] ruleNames) {
         final int ruleIndex = ruleContext.getRuleIndex();
         final String ruleName = ruleNames[ruleIndex];
         return segment.getName().equals(ruleName);
      }
   }

   public static Query parse(String query) {
      final QueryBuilder queryBuilder = new QueryBuilder();
      final AstPathParser parser = createParser(query);
      parser.addParseListener(queryBuilder);
      parser.query();
      return queryBuilder.getQuery();
   }

   static AstPathParser createParser(String query) {
      try (BufferedReader r = new BufferedReader(new StringReader(query))) {
         final CommonTokenStream tokenStream = new CommonTokenStream(new AstPathLexer(new ANTLRInputStream(r)));
         final AstPathParser parser = new AstPathParser(tokenStream);
         parser.setErrorHandler(new BailErrorStrategy());
         return parser;
      }
      catch (IOException e) {
         throw new IllegalStateException(e);
      }
   }

   public static List<RuleContext> execute(RuleContext ruleContext, Query query, String[] ruleNames) {
      return new AstQueryExecutor().execute(ruleContext, query, ruleNames);
   }
}
