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

import org.sourcepit.ltk.ast.Rule;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class GrammarSymbol extends Symbol implements Scope<Rule> {

   private final ScopeImpl<Scope<?>, Rule> scopeImpl;

   public GrammarSymbol(Rule context) {
      scopeImpl = new ScopeImpl<Scope<?>, Rule>(null, context);
   }

   @Override
   public Scope<?> getEnclosingScope() {
      return scopeImpl.getEnclosingScope();
   }

   @Override
   public List<Scope<?>> getNestedScopes() {
      return scopeImpl.getNestedScopes();
   }

   public Rule getContext() {
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
