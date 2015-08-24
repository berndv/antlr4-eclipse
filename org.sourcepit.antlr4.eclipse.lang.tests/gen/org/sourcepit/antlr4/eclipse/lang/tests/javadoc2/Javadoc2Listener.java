// Generated from Javadoc2.g4 by ANTLR 4.5

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

package org.sourcepit.antlr4.eclipse.lang.tests.javadoc2;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Javadoc2Parser}.
 */
public interface Javadoc2Listener extends ParseTreeListener {
   /**
    * Enter a parse tree produced by {@link Javadoc2Parser#javadoc}.
    * 
    * @param ctx the parse tree
    */
   void enterJavadoc(Javadoc2Parser.JavadocContext ctx);

   /**
    * Exit a parse tree produced by {@link Javadoc2Parser#javadoc}.
    * 
    * @param ctx the parse tree
    */
   void exitJavadoc(Javadoc2Parser.JavadocContext ctx);

   /**
    * Enter a parse tree produced by {@link Javadoc2Parser#text}.
    * 
    * @param ctx the parse tree
    */
   void enterText(Javadoc2Parser.TextContext ctx);

   /**
    * Exit a parse tree produced by {@link Javadoc2Parser#text}.
    * 
    * @param ctx the parse tree
    */
   void exitText(Javadoc2Parser.TextContext ctx);
}