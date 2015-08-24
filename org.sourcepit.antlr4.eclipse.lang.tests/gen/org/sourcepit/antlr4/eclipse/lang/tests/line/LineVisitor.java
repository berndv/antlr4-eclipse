// Generated from Line.g4 by ANTLR 4.5

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

package org.sourcepit.antlr4.eclipse.lang.tests.line;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LineParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *           operations with no return type.
 */
public interface LineVisitor<T> extends ParseTreeVisitor<T> {
   /**
    * Visit a parse tree produced by {@link LineParser#javadoc}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadoc(LineParser.JavadocContext ctx);

   /**
    * Visit a parse tree produced by {@link LineParser#javadocStart}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadocStart(LineParser.JavadocStartContext ctx);

   /**
    * Visit a parse tree produced by {@link LineParser#javadocEnd}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadocEnd(LineParser.JavadocEndContext ctx);

   /**
    * Visit a parse tree produced by {@link LineParser#mainDescription}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMainDescription(LineParser.MainDescriptionContext ctx);

   /**
    * Visit a parse tree produced by {@link LineParser#line}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitLine(LineParser.LineContext ctx);

   /**
    * Visit a parse tree produced by {@link LineParser#prefix}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPrefix(LineParser.PrefixContext ctx);

   /**
    * Visit a parse tree produced by {@link LineParser#text}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitText(LineParser.TextContext ctx);
}