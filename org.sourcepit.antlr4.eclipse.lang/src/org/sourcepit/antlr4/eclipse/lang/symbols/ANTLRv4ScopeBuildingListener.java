/*
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

package org.sourcepit.antlr4.eclipse.lang.symbols;

import java.util.Stack;

import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.GrammarSpecContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.LexerRuleContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.ParserRuleSpecContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4ParserBaseListener;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class ANTLRv4ScopeBuildingListener extends ANTLRv4ParserBaseListener {

   private final Stack<Scope> currentScope = new Stack<>();

   private GlobalScope globalScope;

   public GlobalScope getGlobalScope() {
      return globalScope;
   }

   @Override
   public void enterGrammarSpec(GrammarSpecContext ctx) {
      super.enterGrammarSpec(ctx);
      currentScope.push(new GlobalScope(ctx));
   }

   @Override
   public void enterParserRuleSpec(ParserRuleSpecContext ctx) {
      super.enterParserRuleSpec(ctx);
      currentScope.push(new ParserRuleSymbol((GlobalScope) currentScope.peek(), ctx));
   }

   @Override
   public void exitParserRuleSpec(ParserRuleSpecContext ctx) {
      final ParserRuleSymbol ruleScope = (ParserRuleSymbol) currentScope.pop();
      ruleScope.getEnclosingScope().getNestedScopes().add(ruleScope);
      super.exitParserRuleSpec(ctx);
   }

   @Override
   public void enterLexerRule(LexerRuleContext ctx) {
      super.enterLexerRule(ctx);
      currentScope.push(new LexerRuleSymbol((GlobalScope) currentScope.peek(), ctx));
   }

   @Override
   public void exitLexerRule(LexerRuleContext ctx) {
      final LexerRuleSymbol ruleScope = (LexerRuleSymbol) currentScope.pop();
      ruleScope.getEnclosingScope().getNestedScopes().add(ruleScope);
      super.exitLexerRule(ctx);
   }

   @Override
   public void exitGrammarSpec(GrammarSpecContext ctx) {
      globalScope = (GlobalScope) currentScope.pop();
      super.exitGrammarSpec(ctx);
   }
}
