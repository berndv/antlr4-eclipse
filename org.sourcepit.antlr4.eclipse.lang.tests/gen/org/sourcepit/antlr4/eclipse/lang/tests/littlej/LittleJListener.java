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

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LittleJParser}.
 */
public interface LittleJListener extends ParseTreeListener {
   /**
    * Enter a parse tree produced by {@link LittleJParser#compilationUnit}.
    * 
    * @param ctx the parse tree
    */
   void enterCompilationUnit(LittleJParser.CompilationUnitContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#compilationUnit}.
    * 
    * @param ctx the parse tree
    */
   void exitCompilationUnit(LittleJParser.CompilationUnitContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#packageDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterPackageDeclaration(LittleJParser.PackageDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#packageDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitPackageDeclaration(LittleJParser.PackageDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#importDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterImportDeclaration(LittleJParser.ImportDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#importDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitImportDeclaration(LittleJParser.ImportDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#singleTypeImportDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterSingleTypeImportDeclaration(LittleJParser.SingleTypeImportDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#singleTypeImportDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitSingleTypeImportDeclaration(LittleJParser.SingleTypeImportDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#typeImportOnDemandDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeImportOnDemandDeclaration(LittleJParser.TypeImportOnDemandDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#typeImportOnDemandDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeImportOnDemandDeclaration(LittleJParser.TypeImportOnDemandDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#singleStaticImportDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterSingleStaticImportDeclaration(LittleJParser.SingleStaticImportDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#singleStaticImportDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitSingleStaticImportDeclaration(LittleJParser.SingleStaticImportDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#staticImportOnDemandDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterStaticImportOnDemandDeclaration(LittleJParser.StaticImportOnDemandDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#staticImportOnDemandDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitStaticImportOnDemandDeclaration(LittleJParser.StaticImportOnDemandDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#classDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterClassDeclaration(LittleJParser.ClassDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#classDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitClassDeclaration(LittleJParser.ClassDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#classBody}.
    * 
    * @param ctx the parse tree
    */
   void enterClassBody(LittleJParser.ClassBodyContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#classBody}.
    * 
    * @param ctx the parse tree
    */
   void exitClassBody(LittleJParser.ClassBodyContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#classBodyDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterClassBodyDeclaration(LittleJParser.ClassBodyDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#classBodyDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitClassBodyDeclaration(LittleJParser.ClassBodyDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#memberDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterMemberDeclaration(LittleJParser.MemberDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#memberDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitMemberDeclaration(LittleJParser.MemberDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#methodDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterMethodDeclaration(LittleJParser.MethodDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#methodDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitMethodDeclaration(LittleJParser.MethodDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#methodBody}.
    * 
    * @param ctx the parse tree
    */
   void enterMethodBody(LittleJParser.MethodBodyContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#methodBody}.
    * 
    * @param ctx the parse tree
    */
   void exitMethodBody(LittleJParser.MethodBodyContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#methodBodyDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterMethodBodyDeclaration(LittleJParser.MethodBodyDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#methodBodyDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitMethodBodyDeclaration(LittleJParser.MethodBodyDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#statement}.
    * 
    * @param ctx the parse tree
    */
   void enterStatement(LittleJParser.StatementContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#statement}.
    * 
    * @param ctx the parse tree
    */
   void exitStatement(LittleJParser.StatementContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#ifStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterIfStatement(LittleJParser.IfStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#ifStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitIfStatement(LittleJParser.IfStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#doWhileStatement}.
    * 
    * @param ctx the parse tree
    */
   void enterDoWhileStatement(LittleJParser.DoWhileStatementContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#doWhileStatement}.
    * 
    * @param ctx the parse tree
    */
   void exitDoWhileStatement(LittleJParser.DoWhileStatementContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#expression}.
    * 
    * @param ctx the parse tree
    */
   void enterExpression(LittleJParser.ExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#expression}.
    * 
    * @param ctx the parse tree
    */
   void exitExpression(LittleJParser.ExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#block}.
    * 
    * @param ctx the parse tree
    */
   void enterBlock(LittleJParser.BlockContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#block}.
    * 
    * @param ctx the parse tree
    */
   void exitBlock(LittleJParser.BlockContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#packageOrTypeName}.
    * 
    * @param ctx the parse tree
    */
   void enterPackageOrTypeName(LittleJParser.PackageOrTypeNameContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#packageOrTypeName}.
    * 
    * @param ctx the parse tree
    */
   void exitPackageOrTypeName(LittleJParser.PackageOrTypeNameContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#typeName}.
    * 
    * @param ctx the parse tree
    */
   void enterTypeName(LittleJParser.TypeNameContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#typeName}.
    * 
    * @param ctx the parse tree
    */
   void exitTypeName(LittleJParser.TypeNameContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#fieldName}.
    * 
    * @param ctx the parse tree
    */
   void enterFieldName(LittleJParser.FieldNameContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#fieldName}.
    * 
    * @param ctx the parse tree
    */
   void exitFieldName(LittleJParser.FieldNameContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#methodName}.
    * 
    * @param ctx the parse tree
    */
   void enterMethodName(LittleJParser.MethodNameContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#methodName}.
    * 
    * @param ctx the parse tree
    */
   void exitMethodName(LittleJParser.MethodNameContext ctx);

   /**
    * Enter a parse tree produced by {@link LittleJParser#qualifiedName}.
    * 
    * @param ctx the parse tree
    */
   void enterQualifiedName(LittleJParser.QualifiedNameContext ctx);

   /**
    * Exit a parse tree produced by {@link LittleJParser#qualifiedName}.
    * 
    * @param ctx the parse tree
    */
   void exitQualifiedName(LittleJParser.QualifiedNameContext ctx);
}