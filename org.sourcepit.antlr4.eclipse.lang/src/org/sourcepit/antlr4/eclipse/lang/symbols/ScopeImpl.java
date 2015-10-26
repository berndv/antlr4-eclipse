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

import java.util.ArrayList;
import java.util.List;

import org.sourcepit.ltk.parser.ParseNode;

/**
 * @param <EnclosingScope>
 * @param <Context>
 * 
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
class ScopeImpl<EnclosingScope extends Scope<?>, Context extends ParseNode> implements Scope<Context> {

   private final EnclosingScope enclosingScope;
   private final List<Scope<?>> nestedScopes = new ArrayList<>();
   private final Context context;

   private final List<Symbol> symbols = new ArrayList<>();

   public ScopeImpl(EnclosingScope enclosingScope, Context context) {
      this.enclosingScope = enclosingScope;
      this.context = context;
   }

   @Override
   public EnclosingScope getEnclosingScope() {
      return enclosingScope;
   }

   @Override
   public List<Scope<?>> getNestedScopes() {
      return nestedScopes;
   }

   @Override
   public Context getContext() {
      return context;
   }

   @Override
   public void define(Symbol symbol) {
      symbols.add(symbol);
   }

   @Override
   @SuppressWarnings("unchecked")
   public <S extends Symbol> S resolve(String name, Class<S> symbolType) {
      for (Symbol symbol : this.symbols) {
         if (name.equals(symbol.getName().getText())) {
            if (symbolType.isAssignableFrom(symbol.getClass())) {
               return (S) symbol;
            }
         }
      }
      return enclosingScope == null ? null : enclosingScope.resolve(name, symbolType);
   }

}
