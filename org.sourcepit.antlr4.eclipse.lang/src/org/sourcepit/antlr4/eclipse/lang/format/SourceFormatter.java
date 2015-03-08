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

package org.sourcepit.antlr4.eclipse.lang.format;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.LabeledAltContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.RuleBlockContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.RuleSpecContext;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class SourceFormatter {

   public void format(ParserRuleContext ast, BufferedTokenStream tokenStream) {
      final StructuredWriter writer = new StructuredWriter();
      ParseTreeWalker.DEFAULT.walk(new ParseTreeListener() {

         @Override
         public void enterEveryRule(ParserRuleContext ctx) {
            if (isBlock(ctx)) {
               writer.startBlock(ctx);
            }
            else if (isBlockBody(ctx)) {
               writer.startBlockConent(ctx);
            }
            else {
               writer.startSpan(ctx);
            }
         }

         @Override
         public void exitEveryRule(ParserRuleContext ctx) {
            if (isBlock(ctx)) {
               writer.endBlock(ctx);
            }
            else if (isBlockBody(ctx)) {
               writer.endBlockConent(ctx);
            }
            else {
               writer.endSpan(ctx);
            }
         }

         @Override
         public void visitTerminal(TerminalNode node) {
            writer.write(node);
         }

         @Override
         public void visitErrorNode(ErrorNode node) {
            writer.write(node);
         }
      }, ast);

      System.out.println(writer);
   }

   private boolean isBlock(ParserRuleContext ctx) {
      if (ctx instanceof LabeledAltContext) {
         return true;
      }
      if (ctx instanceof RuleSpecContext) {
         return true;
      }
      return false;
   }

   private boolean isBlockBody(ParserRuleContext ctx) {
      if (ctx instanceof RuleBlockContext) {
         return true;
      }
      return false;
   }

}
