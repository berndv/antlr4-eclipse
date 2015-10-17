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

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.GrammarDeclContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.GrammarSpecContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.IdContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.LexerRuleContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.ParserRuleSpecContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4ParserBaseListener;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class ANTLRv4ScopeBuildingListener extends ANTLRv4ParserBaseListener {

   private final Stack<Scope<?>> currentScope = new Stack<>();
   private final ParseTreeProperty<Scope<?>> nodeToScopeMap = new ParseTreeProperty<>();

   private GrammarSymbol globalScope;

   public GrammarSymbol getGlobalScope() {
      return globalScope;
   }

   @SuppressWarnings("unchecked")
   <S extends Scope<?>> S getCurrentScope() {
      return (S) currentScope.peek();
   }

   public ParseTreeProperty<Scope<?>> getNodeToScopeMap() {
      return nodeToScopeMap;
   }

   @Override
   public void enterGrammarSpec(GrammarSpecContext ctx) {
      currentScope.push(new GrammarSymbol(ctx));
   }

   @Override
   public void enterId(IdContext ctx) {
      if (ctx.getParent() instanceof GrammarDeclContext) {
         final GrammarSymbol symbol = (GrammarSymbol) currentScope.peek();
         symbol.setName(ctx);
      }
   }

   @Override
   public void enterParserRuleSpec(ParserRuleSpecContext ctx) {
      currentScope.push(new ParserRuleSymbol((GrammarSymbol) currentScope.peek(), ctx));
   }

   @Override
   public void exitParserRuleSpec(ParserRuleSpecContext ctx) {
      final ParserRuleSymbol ruleScope = (ParserRuleSymbol) currentScope.pop();
      GrammarSymbol enclosingScope = ruleScope.getEnclosingScope();
      enclosingScope.getNestedScopes().add(ruleScope);
      enclosingScope.define(ruleScope);
      nodeToScopeMap.put(ctx, ruleScope);
   }

   @Override
   public void enterLexerRule(LexerRuleContext ctx) {
      super.enterLexerRule(ctx);
      currentScope.push(new LexerRuleSymbol(getCurrentScope(), ctx));
   }

   @Override
   public void exitLexerRule(LexerRuleContext ctx) {
      final LexerRuleSymbol ruleScope = (LexerRuleSymbol) currentScope.pop();
      final GrammarSymbol enclosingScope = ruleScope.getEnclosingScope();
      enclosingScope.getNestedScopes().add(ruleScope);
      enclosingScope.define(ruleScope);
      nodeToScopeMap.put(ctx, ruleScope);
   }

   @Override
   public void visitTerminal(TerminalNode node) {
      final Token token = node.getSymbol();
      final int tokenType = token.getType();
      if (tokenType == ANTLRv4Lexer.RULE_REF) {
         if (node.getParent() instanceof ParserRuleSpecContext) {
            final ParserRuleSymbol symbol = (ParserRuleSymbol) currentScope.peek();
            symbol.setName(node);
         }
      }
      else if (tokenType == ANTLRv4Lexer.TOKEN_REF) {
         if (node.getParent() instanceof LexerRuleContext) {
            final LexerRuleSymbol symbol = (LexerRuleSymbol) currentScope.peek();
            symbol.setName(node);
         }
      }
   }

   @Override
   public void exitGrammarSpec(GrammarSpecContext ctx) {
      globalScope = (GrammarSymbol) currentScope.pop();
      nodeToScopeMap.put(ctx, globalScope);
   }
}
