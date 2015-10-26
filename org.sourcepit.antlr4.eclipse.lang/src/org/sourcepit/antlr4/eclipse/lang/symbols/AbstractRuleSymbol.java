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

import java.util.List;

import org.sourcepit.ltk.parser.Rule;

/**
 * @param <Context>
 * 
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class AbstractRuleSymbol<Context extends Rule> extends Symbol implements Scope<Context> {
   private final ScopeImpl<GrammarSymbol, Context> scopeImpl;

   public AbstractRuleSymbol(GrammarSymbol enclosingScope, Context context) {
      scopeImpl = new ScopeImpl<GrammarSymbol, Context>(enclosingScope, context);
   }

   @Override
   public GrammarSymbol getEnclosingScope() {
      return scopeImpl.getEnclosingScope();
   }

   @Override
   public List<Scope<?>> getNestedScopes() {
      return scopeImpl.getNestedScopes();
   }

   @Override
   public Context getContext() {
      return scopeImpl.getContext();
   }

   @Override
   public void define(Symbol symbol) {
      scopeImpl.define(symbol);
   }

   @Override
   public <S extends Symbol> S resolve(String name, Class<S> symbolType) {
      return scopeImpl.resolve(name, symbolType);
   }

}
