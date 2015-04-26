// Generated from LittleJ.g4 by ANTLR 4.5

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

package org.sourcepit.antlr4.eclipse.lang.tests.littlej;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link LittleJVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *           operations with no return type.
 */
public class LittleJBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements LittleJVisitor<T> {
   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitCompilationUnit(LittleJParser.CompilationUnitContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitPackageDeclaration(LittleJParser.PackageDeclarationContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitImportDeclaration(LittleJParser.ImportDeclarationContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitSingleTypeImportDeclaration(LittleJParser.SingleTypeImportDeclarationContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitTypeImportOnDemandDeclaration(LittleJParser.TypeImportOnDemandDeclarationContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitSingleStaticImportDeclaration(LittleJParser.SingleStaticImportDeclarationContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitStaticImportOnDemandDeclaration(LittleJParser.StaticImportOnDemandDeclarationContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitClassDeclaration(LittleJParser.ClassDeclarationContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitClassBody(LittleJParser.ClassBodyContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitClassBodyDeclaration(LittleJParser.ClassBodyDeclarationContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitMemberDeclaration(LittleJParser.MemberDeclarationContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitMethodDeclaration(LittleJParser.MethodDeclarationContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitMethodBody(LittleJParser.MethodBodyContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitMethodBodyDeclaration(LittleJParser.MethodBodyDeclarationContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitStatement(LittleJParser.StatementContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitIfStatement(LittleJParser.IfStatementContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitDoWhileStatement(LittleJParser.DoWhileStatementContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitExpression(LittleJParser.ExpressionContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitBlock(LittleJParser.BlockContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitPackageOrTypeName(LittleJParser.PackageOrTypeNameContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitTypeName(LittleJParser.TypeNameContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitFieldName(LittleJParser.FieldNameContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitMethodName(LittleJParser.MethodNameContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    *
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitQualifiedName(LittleJParser.QualifiedNameContext ctx) {
      return visitChildren(ctx);
   }
}