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

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ModeParser}.
 */
public interface ModeParserListener extends ParseTreeListener {
   /**
    * Enter a parse tree produced by {@link ModeParser#javadoc}.
    * 
    * @param ctx the parse tree
    */
   void enterJavadoc(ModeParser.JavadocContext ctx);

   /**
    * Exit a parse tree produced by {@link ModeParser#javadoc}.
    * 
    * @param ctx the parse tree
    */
   void exitJavadoc(ModeParser.JavadocContext ctx);

   /**
    * Enter a parse tree produced by {@link ModeParser#mainDescription}.
    * 
    * @param ctx the parse tree
    */
   void enterMainDescription(ModeParser.MainDescriptionContext ctx);

   /**
    * Exit a parse tree produced by {@link ModeParser#mainDescription}.
    * 
    * @param ctx the parse tree
    */
   void exitMainDescription(ModeParser.MainDescriptionContext ctx);

   /**
    * Enter a parse tree produced by {@link ModeParser#tagSection}.
    * 
    * @param ctx the parse tree
    */
   void enterTagSection(ModeParser.TagSectionContext ctx);

   /**
    * Exit a parse tree produced by {@link ModeParser#tagSection}.
    * 
    * @param ctx the parse tree
    */
   void exitTagSection(ModeParser.TagSectionContext ctx);

   /**
    * Enter a parse tree produced by {@link ModeParser#javadocBlockTag}.
    * 
    * @param ctx the parse tree
    */
   void enterJavadocBlockTag(ModeParser.JavadocBlockTagContext ctx);

   /**
    * Exit a parse tree produced by {@link ModeParser#javadocBlockTag}.
    * 
    * @param ctx the parse tree
    */
   void exitJavadocBlockTag(ModeParser.JavadocBlockTagContext ctx);

   /**
    * Enter a parse tree produced by {@link ModeParser#javadocText}.
    * 
    * @param ctx the parse tree
    */
   void enterJavadocText(ModeParser.JavadocTextContext ctx);

   /**
    * Exit a parse tree produced by {@link ModeParser#javadocText}.
    * 
    * @param ctx the parse tree
    */
   void exitJavadocText(ModeParser.JavadocTextContext ctx);

   /**
    * Enter a parse tree produced by {@link ModeParser#javadocInlineTag}.
    * 
    * @param ctx the parse tree
    */
   void enterJavadocInlineTag(ModeParser.JavadocInlineTagContext ctx);

   /**
    * Exit a parse tree produced by {@link ModeParser#javadocInlineTag}.
    * 
    * @param ctx the parse tree
    */
   void exitJavadocInlineTag(ModeParser.JavadocInlineTagContext ctx);

   /**
    * Enter a parse tree produced by {@link ModeParser#javadocHtmlTag}.
    * 
    * @param ctx the parse tree
    */
   void enterJavadocHtmlTag(ModeParser.JavadocHtmlTagContext ctx);

   /**
    * Exit a parse tree produced by {@link ModeParser#javadocHtmlTag}.
    * 
    * @param ctx the parse tree
    */
   void exitJavadocHtmlTag(ModeParser.JavadocHtmlTagContext ctx);

   /**
    * Enter a parse tree produced by {@link ModeParser#javadocHtmlAttribute}.
    * 
    * @param ctx the parse tree
    */
   void enterJavadocHtmlAttribute(ModeParser.JavadocHtmlAttributeContext ctx);

   /**
    * Exit a parse tree produced by {@link ModeParser#javadocHtmlAttribute}.
    * 
    * @param ctx the parse tree
    */
   void exitJavadocHtmlAttribute(ModeParser.JavadocHtmlAttributeContext ctx);

   /**
    * Enter a parse tree produced by {@link ModeParser#javadocHtmlAttributeValue}.
    * 
    * @param ctx the parse tree
    */
   void enterJavadocHtmlAttributeValue(ModeParser.JavadocHtmlAttributeValueContext ctx);

   /**
    * Exit a parse tree produced by {@link ModeParser#javadocHtmlAttributeValue}.
    * 
    * @param ctx the parse tree
    */
   void exitJavadocHtmlAttributeValue(ModeParser.JavadocHtmlAttributeValueContext ctx);
}