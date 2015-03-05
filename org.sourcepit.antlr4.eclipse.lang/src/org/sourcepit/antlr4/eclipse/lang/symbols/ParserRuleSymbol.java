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

import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.ParserRuleSpecContext;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class ParserRuleSymbol extends AbstractRuleSymbol {
   private final ParserRuleSpecContext context;

   public ParserRuleSymbol(GlobalScope enclosingScope, ParserRuleSpecContext context) {
      super(enclosingScope);
      this.context = context;
   }

   @Override
   public ParserRuleSpecContext getContext() {
      return context;
   }

}