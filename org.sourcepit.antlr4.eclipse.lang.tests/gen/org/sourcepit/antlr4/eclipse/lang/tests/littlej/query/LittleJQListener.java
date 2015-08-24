// Generated from LittleJQ.g4 by ANTLR 4.5

/**
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

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LittleJQParser}.
 */
public interface LittleJQListener extends ParseTreeListener {
   /**
    * Enter a parse tree produced by {@link LittleJQParser#query}.
    * 
    * @param ctx the parse tree
    */
   void enterQuery(LittleJQParser.QueryContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJQParser#query}.
    * 
    * @param ctx the parse tree
    */
   void exitQuery(LittleJQParser.QueryContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJQParser#querySegment}.
    * 
    * @param ctx the parse tree
    */
   void enterQuerySegment(LittleJQParser.QuerySegmentContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJQParser#querySegment}.
    * 
    * @param ctx the parse tree
    */
   void exitQuerySegment(LittleJQParser.QuerySegmentContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJQParser#segmentName}.
    * 
    * @param ctx the parse tree
    */
   void enterSegmentName(LittleJQParser.SegmentNameContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJQParser#segmentName}.
    * 
    * @param ctx the parse tree
    */
   void exitSegmentName(LittleJQParser.SegmentNameContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJQParser#segmentQuery}.
    * 
    * @param ctx the parse tree
    */
   void enterSegmentQuery(LittleJQParser.SegmentQueryContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJQParser#segmentQuery}.
    * 
    * @param ctx the parse tree
    */
   void exitSegmentQuery(LittleJQParser.SegmentQueryContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJQParser#segmentQueryType}.
    * 
    * @param ctx the parse tree
    */
   void enterSegmentQueryType(LittleJQParser.SegmentQueryTypeContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJQParser#segmentQueryType}.
    * 
    * @param ctx the parse tree
    */
   void exitSegmentQueryType(LittleJQParser.SegmentQueryTypeContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJQParser#segmentQueryExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterSegmentQueryExpression(LittleJQParser.SegmentQueryExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJQParser#segmentQueryExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitSegmentQueryExpression(LittleJQParser.SegmentQueryExpressionContext ctx);
}