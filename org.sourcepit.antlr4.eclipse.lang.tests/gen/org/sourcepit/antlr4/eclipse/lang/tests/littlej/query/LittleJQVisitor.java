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

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LittleJQParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *           operations with no return type.
 */
public interface LittleJQVisitor<T> extends ParseTreeVisitor<T> {
   /**
    * Visit a parse tree produced by {@link LittleJQParser#query}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitQuery(LittleJQParser.QueryContext ctx);

   /**
    * Visit a parse tree produced by {@link LittleJQParser#querySegment}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitQuerySegment(LittleJQParser.QuerySegmentContext ctx);

   /**
    * Visit a parse tree produced by {@link LittleJQParser#segmentName}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitSegmentName(LittleJQParser.SegmentNameContext ctx);

   /**
    * Visit a parse tree produced by {@link LittleJQParser#segmentQuery}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitSegmentQuery(LittleJQParser.SegmentQueryContext ctx);

   /**
    * Visit a parse tree produced by {@link LittleJQParser#segmentQueryType}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitSegmentQueryType(LittleJQParser.SegmentQueryTypeContext ctx);

   /**
    * Visit a parse tree produced by {@link LittleJQParser#segmentQueryExpression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitSegmentQueryExpression(LittleJQParser.SegmentQueryExpressionContext ctx);
}