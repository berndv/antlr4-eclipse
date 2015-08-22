// Generated from JDoc.g4 by ANTLR 4.5

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

package org.sourcepit.antlr4.eclipse.lang.tests.jdoc;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JDocParser}.
 */
public interface JDocListener extends ParseTreeListener {
   /**
    * Enter a parse tree produced by {@link JDocParser#javaDoc}.
    * 
    * @param ctx the parse tree
    */
   void enterJavaDoc(JDocParser.JavaDocContext ctx);

   /**
    * Exit a parse tree produced by {@link JDocParser#javaDoc}.
    * 
    * @param ctx the parse tree
    */
   void exitJavaDoc(JDocParser.JavaDocContext ctx);

   /**
    * Enter a parse tree produced by {@link JDocParser#line}.
    * 
    * @param ctx the parse tree
    */
   void enterLine(JDocParser.LineContext ctx);

   /**
    * Exit a parse tree produced by {@link JDocParser#line}.
    * 
    * @param ctx the parse tree
    */
   void exitLine(JDocParser.LineContext ctx);

   /**
    * Enter a parse tree produced by {@link JDocParser#content}.
    * 
    * @param ctx the parse tree
    */
   void enterContent(JDocParser.ContentContext ctx);

   /**
    * Exit a parse tree produced by {@link JDocParser#content}.
    * 
    * @param ctx the parse tree
    */
   void exitContent(JDocParser.ContentContext ctx);

   /**
    * Enter a parse tree produced by {@link JDocParser#linePrefix}.
    * 
    * @param ctx the parse tree
    */
   void enterLinePrefix(JDocParser.LinePrefixContext ctx);

   /**
    * Exit a parse tree produced by {@link JDocParser#linePrefix}.
    * 
    * @param ctx the parse tree
    */
   void exitLinePrefix(JDocParser.LinePrefixContext ctx);

   /**
    * Enter a parse tree produced by {@link JDocParser#text}.
    * 
    * @param ctx the parse tree
    */
   void enterText(JDocParser.TextContext ctx);

   /**
    * Exit a parse tree produced by {@link JDocParser#text}.
    * 
    * @param ctx the parse tree
    */
   void exitText(JDocParser.TextContext ctx);

   /**
    * Enter a parse tree produced by {@link JDocParser#at}.
    * 
    * @param ctx the parse tree
    */
   void enterAt(JDocParser.AtContext ctx);

   /**
    * Exit a parse tree produced by {@link JDocParser#at}.
    * 
    * @param ctx the parse tree
    */
   void exitAt(JDocParser.AtContext ctx);

   /**
    * Enter a parse tree produced by {@link JDocParser#html}.
    * 
    * @param ctx the parse tree
    */
   void enterHtml(JDocParser.HtmlContext ctx);

   /**
    * Exit a parse tree produced by {@link JDocParser#html}.
    * 
    * @param ctx the parse tree
    */
   void exitHtml(JDocParser.HtmlContext ctx);

   /**
    * Enter a parse tree produced by {@link JDocParser#nl}.
    * 
    * @param ctx the parse tree
    */
   void enterNl(JDocParser.NlContext ctx);

   /**
    * Exit a parse tree produced by {@link JDocParser#nl}.
    * 
    * @param ctx the parse tree
    */
   void exitNl(JDocParser.NlContext ctx);
}