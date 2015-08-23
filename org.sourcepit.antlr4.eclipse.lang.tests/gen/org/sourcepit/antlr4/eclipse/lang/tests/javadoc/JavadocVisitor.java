// Generated from Javadoc.g4 by ANTLR 4.5

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

package org.sourcepit.antlr4.eclipse.lang.tests.javadoc;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavadocParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *           operations with no return type.
 */
public interface JavadocVisitor<T> extends ParseTreeVisitor<T> {
   /**
    * Visit a parse tree produced by {@link JavadocParser#javadoc}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadoc(JavadocParser.JavadocContext ctx);

   /**
    * Visit a parse tree produced by {@link JavadocParser#javadocStart}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadocStart(JavadocParser.JavadocStartContext ctx);

   /**
    * Visit a parse tree produced by {@link JavadocParser#javadocEnd}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadocEnd(JavadocParser.JavadocEndContext ctx);

   /**
    * Visit a parse tree produced by {@link JavadocParser#mainDescription}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMainDescription(JavadocParser.MainDescriptionContext ctx);

   /**
    * Visit a parse tree produced by {@link JavadocParser#line}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitLine(JavadocParser.LineContext ctx);

   /**
    * Visit a parse tree produced by {@link JavadocParser#prefix}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitPrefix(JavadocParser.PrefixContext ctx);

   /**
    * Visit a parse tree produced by {@link JavadocParser#text}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitText(JavadocParser.TextContext ctx);

   /**
    * Visit a parse tree produced by {@link JavadocParser#tagSection}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTagSection(JavadocParser.TagSectionContext ctx);

   /**
    * Visit a parse tree produced by {@link JavadocParser#tag}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTag(JavadocParser.TagContext ctx);

   /**
    * Visit a parse tree produced by {@link JavadocParser#tagName}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTagName(JavadocParser.TagNameContext ctx);
}