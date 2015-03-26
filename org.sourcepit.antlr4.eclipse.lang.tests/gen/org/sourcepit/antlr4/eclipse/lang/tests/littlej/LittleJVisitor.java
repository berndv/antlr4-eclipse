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

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LittleJParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *           operations with no return type.
 */
public interface LittleJVisitor<T> extends ParseTreeVisitor<T> {
   /**
    * Visit a parse tree produced by {@link LittleJParser#compilationUnit}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitCompilationUnit(LittleJParser.CompilationUnitContext ctx);

   /**
    * Visit a parse tree produced by {@link LittleJParser#classBody}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitClassBody(LittleJParser.ClassBodyContext ctx);

   /**
    * Visit a parse tree produced by {@link LittleJParser#classBodyDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitClassBodyDeclaration(LittleJParser.ClassBodyDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link LittleJParser#memberDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMemberDeclaration(LittleJParser.MemberDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link LittleJParser#methodDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMethodDeclaration(LittleJParser.MethodDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link LittleJParser#methodBody}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMethodBody(LittleJParser.MethodBodyContext ctx);

   /**
    * Visit a parse tree produced by {@link LittleJParser#methodBodyDeclaration}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMethodBodyDeclaration(LittleJParser.MethodBodyDeclarationContext ctx);

   /**
    * Visit a parse tree produced by {@link LittleJParser#statement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitStatement(LittleJParser.StatementContext ctx);

   /**
    * Visit a parse tree produced by {@link LittleJParser#ifStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitIfStatement(LittleJParser.IfStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link LittleJParser#doWhileStatement}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitDoWhileStatement(LittleJParser.DoWhileStatementContext ctx);

   /**
    * Visit a parse tree produced by {@link LittleJParser#expression}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitExpression(LittleJParser.ExpressionContext ctx);

   /**
    * Visit a parse tree produced by {@link LittleJParser#block}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitBlock(LittleJParser.BlockContext ctx);

   /**
    * Visit a parse tree produced by {@link LittleJParser#typeName}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitTypeName(LittleJParser.TypeNameContext ctx);

   /**
    * Visit a parse tree produced by {@link LittleJParser#fieldName}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitFieldName(LittleJParser.FieldNameContext ctx);

   /**
    * Visit a parse tree produced by {@link LittleJParser#methodName}.
    * 
    * @param ctx the parse tree
    * @return the visitor result
    */
   T visitMethodName(LittleJParser.MethodNameContext ctx);
}