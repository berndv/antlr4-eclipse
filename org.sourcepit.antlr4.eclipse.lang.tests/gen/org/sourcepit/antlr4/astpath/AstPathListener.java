// Generated from AstPath.g4 by ANTLR 4.5

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

package org.sourcepit.antlr4.astpath;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AstPathParser}.
 */
public interface AstPathListener extends ParseTreeListener {
   /**
    * Enter a parse tree produced by {@link AstPathParser#query}.
    * 
    * @param ctx the parse tree
    */
   void enterQuery(AstPathParser.QueryContext ctx);

   /**
    * Exit a parse tree produced by {@link AstPathParser#query}.
    * 
    * @param ctx the parse tree
    */
   void exitQuery(AstPathParser.QueryContext ctx);

   /**
    * Enter a parse tree produced by {@link AstPathParser#segment}.
    * 
    * @param ctx the parse tree
    */
   void enterSegment(AstPathParser.SegmentContext ctx);

   /**
    * Exit a parse tree produced by {@link AstPathParser#segment}.
    * 
    * @param ctx the parse tree
    */
   void exitSegment(AstPathParser.SegmentContext ctx);

   /**
    * Enter a parse tree produced by {@link AstPathParser#index}.
    * 
    * @param ctx the parse tree
    */
   void enterIndex(AstPathParser.IndexContext ctx);

   /**
    * Exit a parse tree produced by {@link AstPathParser#index}.
    * 
    * @param ctx the parse tree
    */
   void exitIndex(AstPathParser.IndexContext ctx);

   /**
    * Enter a parse tree produced by {@link AstPathParser#name}.
    * 
    * @param ctx the parse tree
    */
   void enterName(AstPathParser.NameContext ctx);

   /**
    * Exit a parse tree produced by {@link AstPathParser#name}.
    * 
    * @param ctx the parse tree
    */
   void exitName(AstPathParser.NameContext ctx);
}