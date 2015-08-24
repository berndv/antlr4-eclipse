// Generated from Pred.g4 by ANTLR 4.5

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
	
package org.sourcepit.antlr4.eclipse.lang.tests.pred;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PredParser}.
 */
public interface PredListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PredParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PredParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PredParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PredParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PredParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(PredParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PredParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(PredParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PredParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PredParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PredParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PredParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PredParser#enumDecl}.
	 * @param ctx the parse tree
	 */
	void enterEnumDecl(PredParser.EnumDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PredParser#enumDecl}.
	 * @param ctx the parse tree
	 */
	void exitEnumDecl(PredParser.EnumDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PredParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(PredParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PredParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(PredParser.IdContext ctx);
}