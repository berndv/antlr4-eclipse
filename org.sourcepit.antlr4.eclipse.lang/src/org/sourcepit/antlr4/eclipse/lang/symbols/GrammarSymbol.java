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

import org.antlr.v4.runtime.tree.ParseTree;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.GrammarSpecContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.IdContext;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class GrammarSymbol extends Symbol<IdContext> implements Scope<GrammarSpecContext> {

   private final ScopeImpl<Scope<?>, GrammarSpecContext> scopeImpl;

   public GrammarSymbol(GrammarSpecContext context) {
      scopeImpl = new ScopeImpl<Scope<?>, GrammarSpecContext>(null, context);
   }

   @Override
   public Scope<?> getEnclosingScope() {
      return scopeImpl.getEnclosingScope();
   }

   @Override
   public List<Scope<?>> getNestedScopes() {
      return scopeImpl.getNestedScopes();
   }

   public GrammarSpecContext getContext() {
      return scopeImpl.getContext();
   }

   @Override
   public <N extends ParseTree, S extends Symbol<N>> void define(S symbol) {
      scopeImpl.define(symbol);
   }

   @Override
   public <N extends ParseTree, S extends Symbol<N>> S resolve(String name, Class<S> symbolType) {
      return scopeImpl.resolve(name, symbolType);
   }
}
