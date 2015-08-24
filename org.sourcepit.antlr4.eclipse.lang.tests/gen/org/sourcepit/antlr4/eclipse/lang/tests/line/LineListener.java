// Generated from Line.g4 by ANTLR 4.5

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
	
package org.sourcepit.antlr4.eclipse.lang.tests.line;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LineParser}.
 */
public interface LineListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LineParser#javadoc}.
	 * @param ctx the parse tree
	 */
	void enterJavadoc(LineParser.JavadocContext ctx);
	/**
	 * Exit a parse tree produced by {@link LineParser#javadoc}.
	 * @param ctx the parse tree
	 */
	void exitJavadoc(LineParser.JavadocContext ctx);
	/**
	 * Enter a parse tree produced by {@link LineParser#javadocStart}.
	 * @param ctx the parse tree
	 */
	void enterJavadocStart(LineParser.JavadocStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LineParser#javadocStart}.
	 * @param ctx the parse tree
	 */
	void exitJavadocStart(LineParser.JavadocStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link LineParser#javadocEnd}.
	 * @param ctx the parse tree
	 */
	void enterJavadocEnd(LineParser.JavadocEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link LineParser#javadocEnd}.
	 * @param ctx the parse tree
	 */
	void exitJavadocEnd(LineParser.JavadocEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link LineParser#mainDescription}.
	 * @param ctx the parse tree
	 */
	void enterMainDescription(LineParser.MainDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LineParser#mainDescription}.
	 * @param ctx the parse tree
	 */
	void exitMainDescription(LineParser.MainDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LineParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(LineParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LineParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(LineParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LineParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(LineParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link LineParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(LineParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link LineParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(LineParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link LineParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(LineParser.TextContext ctx);
}