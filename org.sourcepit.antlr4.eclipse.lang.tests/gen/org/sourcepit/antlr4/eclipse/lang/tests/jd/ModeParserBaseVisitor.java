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

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link ModeParserVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *           operations with no return type.
 */
public class ModeParserBaseVisitor<T> extends AbstractParseTreeVisitor<T>implements ModeParserVisitor<T> {
   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitJavadoc(ModeParser.JavadocContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitMainDescription(ModeParser.MainDescriptionContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitTagSection(ModeParser.TagSectionContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitJavadocBlockTag(ModeParser.JavadocBlockTagContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitJavadocText(ModeParser.JavadocTextContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitJavadocInlineTag(ModeParser.JavadocInlineTagContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitJavadocHtmlTag(ModeParser.JavadocHtmlTagContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitJavadocHtmlAttribute(ModeParser.JavadocHtmlAttributeContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling
    * {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitJavadocHtmlAttributeValue(ModeParser.JavadocHtmlAttributeValueContext ctx) {
      return visitChildren(ctx);
   }
}