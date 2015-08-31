// Generated from JavadocParser.g4 by ANTLR 4.5.1

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
public interface JavadocParserVisitor<T> extends ParseTreeVisitor<T> {
   /**
    * Visit a parse tree produced by {@link JavadocParser#javadoc}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadoc(JavadocParser.JavadocContext ctx);

   /**
    * Visit a parse tree produced by {@link JavadocParser#javadocDescription}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadocDescription(JavadocParser.JavadocDescriptionContext ctx);

   /**
    * Visit a parse tree produced by {@link JavadocParser#javadocTagSection}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadocTagSection(JavadocParser.JavadocTagSectionContext ctx);

   /**
    * Visit a parse tree produced by {@link JavadocParser#javadocBlockTag}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadocBlockTag(JavadocParser.JavadocBlockTagContext ctx);

   /**
    * Visit a parse tree produced by {@link JavadocParser#javadocInlineTag}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadocInlineTag(JavadocParser.JavadocInlineTagContext ctx);

   /**
    * Visit a parse tree produced by {@link JavadocParser#javadocHtmlTag}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadocHtmlTag(JavadocParser.JavadocHtmlTagContext ctx);

   /**
    * Visit a parse tree produced by {@link JavadocParser#javadocHtmlAttribute}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadocHtmlAttribute(JavadocParser.JavadocHtmlAttributeContext ctx);

   /**
    * Visit a parse tree produced by {@link JavadocParser#javadocHtmlAttributeValue}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadocHtmlAttributeValue(JavadocParser.JavadocHtmlAttributeValueContext ctx);
}