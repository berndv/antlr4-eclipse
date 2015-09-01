// Generated from CommentParser.g4 by ANTLR 4.5.1

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

package org.sourcepit.antlr4.eclipse.lang;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommentParser}.
 */
public interface CommentParserListener extends ParseTreeListener {
   /**
    * Enter a parse tree produced by {@link CommentParser#comment}.
    * 
    * @param ctx the parse tree
    */
   void enterComment(CommentParser.CommentContext ctx);

   /**
    * Exit a parse tree produced by {@link CommentParser#comment}.
    * 
    * @param ctx the parse tree
    */
   void exitComment(CommentParser.CommentContext ctx);

   /**
    * Enter a parse tree produced by {@link CommentParser#docComment}.
    * 
    * @param ctx the parse tree
    */
   void enterDocComment(CommentParser.DocCommentContext ctx);

   /**
    * Exit a parse tree produced by {@link CommentParser#docComment}.
    * 
    * @param ctx the parse tree
    */
   void exitDocComment(CommentParser.DocCommentContext ctx);

   /**
    * Enter a parse tree produced by {@link CommentParser#blockComment}.
    * 
    * @param ctx the parse tree
    */
   void enterBlockComment(CommentParser.BlockCommentContext ctx);

   /**
    * Exit a parse tree produced by {@link CommentParser#blockComment}.
    * 
    * @param ctx the parse tree
    */
   void exitBlockComment(CommentParser.BlockCommentContext ctx);

   /**
    * Enter a parse tree produced by {@link CommentParser#lineComment}.
    * 
    * @param ctx the parse tree
    */
   void enterLineComment(CommentParser.LineCommentContext ctx);

   /**
    * Exit a parse tree produced by {@link CommentParser#lineComment}.
    * 
    * @param ctx the parse tree
    */
   void exitLineComment(CommentParser.LineCommentContext ctx);

   /**
    * Enter a parse tree produced by {@link CommentParser#commentText}.
    * 
    * @param ctx the parse tree
    */
   void enterCommentText(CommentParser.CommentTextContext ctx);

   /**
    * Exit a parse tree produced by {@link CommentParser#commentText}.
    * 
    * @param ctx the parse tree
    */
   void exitCommentText(CommentParser.CommentTextContext ctx);
}