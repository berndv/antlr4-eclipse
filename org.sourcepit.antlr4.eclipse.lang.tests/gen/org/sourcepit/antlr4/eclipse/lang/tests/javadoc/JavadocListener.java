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

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavadocParser}.
 */
public interface JavadocListener extends ParseTreeListener {
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
    * Enter a parse tree produced by {@link JavadocParser#javadocStart}.
    * 
    * @param ctx the parse tree
    */
   void enterJavadocStart(JavadocParser.JavadocStartContext ctx);

   /**
    * Exit a parse tree produced by {@link JavadocParser#javadocStart}.
    * 
    * @param ctx the parse tree
    */
   void exitJavadocStart(JavadocParser.JavadocStartContext ctx);

   /**
    * Enter a parse tree produced by {@link JavadocParser#javadocEnd}.
    * 
    * @param ctx the parse tree
    */
   void enterJavadocEnd(JavadocParser.JavadocEndContext ctx);

   /**
    * Exit a parse tree produced by {@link JavadocParser#javadocEnd}.
    * 
    * @param ctx the parse tree
    */
   void exitJavadocEnd(JavadocParser.JavadocEndContext ctx);

   /**
    * Enter a parse tree produced by {@link JavadocParser#mainDescription}.
    * 
    * @param ctx the parse tree
    */
   void enterMainDescription(JavadocParser.MainDescriptionContext ctx);

   /**
    * Exit a parse tree produced by {@link JavadocParser#mainDescription}.
    * 
    * @param ctx the parse tree
    */
   void exitMainDescription(JavadocParser.MainDescriptionContext ctx);

   /**
    * Enter a parse tree produced by {@link JavadocParser#line}.
    * 
    * @param ctx the parse tree
    */
   void enterLine(JavadocParser.LineContext ctx);

   /**
    * Exit a parse tree produced by {@link JavadocParser#line}.
    * 
    * @param ctx the parse tree
    */
   void exitLine(JavadocParser.LineContext ctx);

   /**
    * Enter a parse tree produced by {@link JavadocParser#prefix}.
    * 
    * @param ctx the parse tree
    */
   void enterPrefix(JavadocParser.PrefixContext ctx);

   /**
    * Exit a parse tree produced by {@link JavadocParser#prefix}.
    * 
    * @param ctx the parse tree
    */
   void exitPrefix(JavadocParser.PrefixContext ctx);

   /**
    * Enter a parse tree produced by {@link JavadocParser#text}.
    * 
    * @param ctx the parse tree
    */
   void enterText(JavadocParser.TextContext ctx);

   /**
    * Exit a parse tree produced by {@link JavadocParser#text}.
    * 
    * @param ctx the parse tree
    */
   void exitText(JavadocParser.TextContext ctx);

   /**
    * Enter a parse tree produced by {@link JavadocParser#tagSection}.
    * 
    * @param ctx the parse tree
    */
   void enterTagSection(JavadocParser.TagSectionContext ctx);

   /**
    * Exit a parse tree produced by {@link JavadocParser#tagSection}.
    * 
    * @param ctx the parse tree
    */
   void exitTagSection(JavadocParser.TagSectionContext ctx);

   /**
    * Enter a parse tree produced by {@link JavadocParser#tag}.
    * 
    * @param ctx the parse tree
    */
   void enterTag(JavadocParser.TagContext ctx);

   /**
    * Exit a parse tree produced by {@link JavadocParser#tag}.
    * 
    * @param ctx the parse tree
    */
   void exitTag(JavadocParser.TagContext ctx);

   /**
    * Enter a parse tree produced by {@link JavadocParser#tagName}.
    * 
    * @param ctx the parse tree
    */
   void enterTagName(JavadocParser.TagNameContext ctx);

   /**
    * Exit a parse tree produced by {@link JavadocParser#tagName}.
    * 
    * @param ctx the parse tree
    */
   void exitTagName(JavadocParser.TagNameContext ctx);
}