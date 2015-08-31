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

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavadocParser}.
 */
public interface JavadocParserListener extends ParseTreeListener {
   /**
    * Enter a parse tree produced by {@link JavadocParser#javadoc}.
    * 
    * @param ctx the parse tree
    */
   void enterJavadoc(JavadocParser.JavadocContext ctx);

   /**
    * Exit a parse tree produced by {@link JavadocParser#javadoc}.
    * 
    * @param ctx the parse tree
    */
   void exitJavadoc(JavadocParser.JavadocContext ctx);

   /**
    * Enter a parse tree produced by {@link JavadocParser#javadocDescription}.
    * 
    * @param ctx the parse tree
    */
   void enterJavadocDescription(JavadocParser.JavadocDescriptionContext ctx);

   /**
    * Exit a parse tree produced by {@link JavadocParser#javadocDescription}.
    * 
    * @param ctx the parse tree
    */
   void exitJavadocDescription(JavadocParser.JavadocDescriptionContext ctx);

   /**
    * Enter a parse tree produced by {@link JavadocParser#javadocTagSection}.
    * 
    * @param ctx the parse tree
    */
   void enterJavadocTagSection(JavadocParser.JavadocTagSectionContext ctx);

   /**
    * Exit a parse tree produced by {@link JavadocParser#javadocTagSection}.
    * 
    * @param ctx the parse tree
    */
   void exitJavadocTagSection(JavadocParser.JavadocTagSectionContext ctx);

   /**
    * Enter a parse tree produced by {@link JavadocParser#javadocBlockTag}.
    * 
    * @param ctx the parse tree
    */
   void enterJavadocBlockTag(JavadocParser.JavadocBlockTagContext ctx);

   /**
    * Exit a parse tree produced by {@link JavadocParser#javadocBlockTag}.
    * 
    * @param ctx the parse tree
    */
   void exitJavadocBlockTag(JavadocParser.JavadocBlockTagContext ctx);

   /**
    * Enter a parse tree produced by {@link JavadocParser#javadocInlineTag}.
    * 
    * @param ctx the parse tree
    */
   void enterJavadocInlineTag(JavadocParser.JavadocInlineTagContext ctx);

   /**
    * Exit a parse tree produced by {@link JavadocParser#javadocInlineTag}.
    * 
    * @param ctx the parse tree
    */
   void exitJavadocInlineTag(JavadocParser.JavadocInlineTagContext ctx);

   /**
    * Enter a parse tree produced by {@link JavadocParser#javadocHtmlTag}.
    * 
    * @param ctx the parse tree
    */
   void enterJavadocHtmlTag(JavadocParser.JavadocHtmlTagContext ctx);

   /**
    * Exit a parse tree produced by {@link JavadocParser#javadocHtmlTag}.
    * 
    * @param ctx the parse tree
    */
   void exitJavadocHtmlTag(JavadocParser.JavadocHtmlTagContext ctx);

   /**
    * Enter a parse tree produced by {@link JavadocParser#javadocHtmlAttribute}.
    * 
    * @param ctx the parse tree
    */
   void enterJavadocHtmlAttribute(JavadocParser.JavadocHtmlAttributeContext ctx);

   /**
    * Exit a parse tree produced by {@link JavadocParser#javadocHtmlAttribute}.
    * 
    * @param ctx the parse tree
    */
   void exitJavadocHtmlAttribute(JavadocParser.JavadocHtmlAttributeContext ctx);

   /**
    * Enter a parse tree produced by {@link JavadocParser#javadocHtmlAttributeValue}.
    * 
    * @param ctx the parse tree
    */
   void enterJavadocHtmlAttributeValue(JavadocParser.JavadocHtmlAttributeValueContext ctx);

   /**
    * Exit a parse tree produced by {@link JavadocParser#javadocHtmlAttributeValue}.
    * 
    * @param ctx the parse tree
    */
   void exitJavadocHtmlAttributeValue(JavadocParser.JavadocHtmlAttributeValueContext ctx);
}