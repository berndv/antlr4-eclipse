// Generated from ModeParser.g4 by ANTLR 4.5

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

package org.sourcepit.antlr4.eclipse.lang.tests.jd;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ModeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *           operations with no return type.
 */
public interface ModeParserVisitor<T> extends ParseTreeVisitor<T> {
   /**
    * Visit a parse tree produced by {@link ModeParser#javadoc}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadoc(ModeParser.JavadocContext ctx);

   /**
    * Visit a parse tree produced by {@link ModeParser#mainDescription}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMainDescription(ModeParser.MainDescriptionContext ctx);

   /**
    * Visit a parse tree produced by {@link ModeParser#tagSection}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTagSection(ModeParser.TagSectionContext ctx);

   /**
    * Visit a parse tree produced by {@link ModeParser#javadocBlockTag}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadocBlockTag(ModeParser.JavadocBlockTagContext ctx);

   /**
    * Visit a parse tree produced by {@link ModeParser#javadocText}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadocText(ModeParser.JavadocTextContext ctx);

   /**
    * Visit a parse tree produced by {@link ModeParser#javadocInlineTag}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadocInlineTag(ModeParser.JavadocInlineTagContext ctx);

   /**
    * Visit a parse tree produced by {@link ModeParser#javadocHtmlTag}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadocHtmlTag(ModeParser.JavadocHtmlTagContext ctx);

   /**
    * Visit a parse tree produced by {@link ModeParser#javadocHtmlAttribute}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadocHtmlAttribute(ModeParser.JavadocHtmlAttributeContext ctx);

   /**
    * Visit a parse tree produced by {@link ModeParser#javadocHtmlAttributeValue}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitJavadocHtmlAttributeValue(ModeParser.JavadocHtmlAttributeValueContext ctx);
}