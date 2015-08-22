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

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JDocParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *           operations with no return type.
 */
public interface JDocVisitor<T> extends ParseTreeVisitor<T> {
   /**
    * Visit a parse tree produced by {@link JDocParser#javaDoc}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavaDoc(JDocParser.JavaDocContext ctx);

   /**
    * Visit a parse tree produced by {@link JDocParser#line}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitLine(JDocParser.LineContext ctx);

   /**
    * Visit a parse tree produced by {@link JDocParser#content}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitContent(JDocParser.ContentContext ctx);

   /**
    * Visit a parse tree produced by {@link JDocParser#linePrefix}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitLinePrefix(JDocParser.LinePrefixContext ctx);

   /**
    * Visit a parse tree produced by {@link JDocParser#text}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitText(JDocParser.TextContext ctx);

   /**
    * Visit a parse tree produced by {@link JDocParser#at}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitAt(JDocParser.AtContext ctx);

   /**
    * Visit a parse tree produced by {@link JDocParser#html}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitHtml(JDocParser.HtmlContext ctx);

   /**
    * Visit a parse tree produced by {@link JDocParser#nl}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitNl(JDocParser.NlContext ctx);
}