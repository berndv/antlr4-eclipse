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

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.GrammarDeclContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.GrammarSpecContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.IdContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.LexerRuleContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.ParserRuleSpecContext;
import org.sourcepit.ltk.ast.AstNode;
import org.sourcepit.ltk.ast.AstVisitor;
import org.sourcepit.ltk.ast.Rule;
import org.sourcepit.ltk.ast.Terminal;
import org.sourcepit.ltk.ast.TerminalType;

public class GrammarSymbolBuilder implements AstVisitor {

   private final Stack<Scope<?>> currentScope = new Stack<>();

   private GrammarSymbol globalScope;
   private Map<AstNode, Scope<?>> nodeToScopeMap = new HashMap<AstNode, Scope<?>>();

   public GrammarSymbol getGlobalScope() {
      return globalScope;
   }

   public Map<AstNode, Scope<?>> getNodeToScopeMap() {
      return nodeToScopeMap;
   }

   @Override
   public boolean enter(Rule rule) {
      if (rule.getType() == GrammarSpecContext.class) {
         currentScope.push(new GrammarSymbol(rule));
      }
      else if (rule.getType() == ParserRuleSpecContext.class) {
         currentScope.push(new ParserRuleSymbol((GrammarSymbol) currentScope.peek(), rule));
      }
      else if (rule.getType() == LexerRuleContext.class) {
         final GrammarSymbol parentScope = (GrammarSymbol) currentScope.peek();
         currentScope.push(new LexerRuleSymbol(parentScope, rule));
      }
      return true;
   }

   @Override
   public boolean visit(Terminal terminal) {
      final TerminalType type = terminal.getType();
      if (type.is(ANTLRv4Lexer.class, ANTLRv4Lexer.RULE_REF) || type.is(ANTLRv4Lexer.class, ANTLRv4Lexer.TOKEN_REF)) {
         final Rule parent = terminal.getParent();
         if (parent.getType() == ParserRuleSpecContext.class) {
            final ParserRuleSymbol symbol = (ParserRuleSymbol) currentScope.peek();
            symbol.setName(terminal);
         }
         if (parent.getType() == LexerRuleContext.class) {
            final LexerRuleSymbol symbol = (LexerRuleSymbol) currentScope.peek();
            symbol.setName(terminal);
         }
         if (parent.getType() == IdContext.class && parent.getParent().getType() == GrammarDeclContext.class) {
            final GrammarSymbol symbol = (GrammarSymbol) currentScope.peek();
            symbol.setName(terminal);
         }
      }
      return true;
   }

   @Override
   public void leave(Rule rule) {
      if (rule.getType() == GrammarSpecContext.class) {
         globalScope = (GrammarSymbol) currentScope.pop();
         nodeToScopeMap.put(rule, globalScope);
      }
      else if (rule.getType() == ParserRuleSpecContext.class) {
         final ParserRuleSymbol ruleScope = (ParserRuleSymbol) currentScope.pop();
         GrammarSymbol enclosingScope = ruleScope.getEnclosingScope();
         enclosingScope.getNestedScopes().add(ruleScope);
         enclosingScope.define(ruleScope);
         nodeToScopeMap.put(rule, ruleScope);
      }
      else if (rule.getType() == LexerRuleContext.class) {
         final LexerRuleSymbol ruleScope = (LexerRuleSymbol) currentScope.pop();
         final GrammarSymbol enclosingScope = ruleScope.getEnclosingScope();
         enclosingScope.getNestedScopes().add(ruleScope);
         enclosingScope.define(ruleScope);
         nodeToScopeMap.put(rule, ruleScope);
      }
   }

}
