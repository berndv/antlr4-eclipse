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

import org.sourcepit.ltk.parser.ParseNode;

/**
 * @param <Context>
 * 
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public interface Scope<Context extends ParseNode> {
   Scope<?> getEnclosingScope();

   List<Scope<?>> getNestedScopes();

   Context getContext();

   void define(Symbol symbol);

   <S extends Symbol> S resolve(String name, Class<S> symbolType);
}
