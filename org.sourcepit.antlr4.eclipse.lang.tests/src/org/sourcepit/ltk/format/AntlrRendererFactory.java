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

package org.sourcepit.ltk.format;

import static org.sourcepit.ltk.parser.Rule.isType;

import java.io.IOException;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuleContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.GrammarTypeContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.LexerRuleContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.ParserRuleSpecContext;
import org.sourcepit.antlr4.eclipse.lang.CommentParser.BlockCommentContext;
import org.sourcepit.antlr4.eclipse.lang.CommentParser.DocCommentContext;
import org.sourcepit.ltk.parser.ParseTree;
import org.sourcepit.ltk.parser.Rule;
import org.sourcepit.ltk.parser.Terminal;

public class AntlrRendererFactory implements RendererFactory {
   public class TerminalRenderer implements Renderer {
      @Override
      public void render(LineCounter lines, ParseTree node, Appendable out) throws IOException {
         out.append(node.asTerminal().getToken());
      }
   }

   @Override
   public Renderer createPreRenderer(ParseTree node) {
      if (node.isTerminal()) {
         if (isType(node.getParent(), GrammarTypeContext.class)) {
            System.out.println();
         }

         if (isFirstTerminalOfIn(node.asTerminal(), ANTLRv4Lexer.class, GrammarTypeContext.class)) {
            return new Renderer() {
               @Override
               public void render(LineCounter lines, ParseTree node, Appendable out) throws IOException {
                  // if (lines.getCurrentLineNumber() > 1 || !lines.isNewLine()) {
                  out.append('\n');
                  // }
               }
            };
         }

      }
      else
         if (isType(node.asRule(), BlockCommentContext.class, DocCommentContext.class, ParserRuleSpecContext.class,
            LexerRuleContext.class)) {
         return new Renderer() {
            @Override
            public void render(LineCounter lines, ParseTree node, Appendable out) throws IOException {
               // if (lines.getCurrentLineNumber() > 1 || !lines.isNewLine()) {
               out.append('\n');
               // }
            }
         };
      }
      return null;
   }

   private boolean isFirstTerminalOfIn(Terminal terminal, Class<? extends Lexer> sourceType,
      Class<? extends RuleContext> parentType) {
      final Rule parent = terminal.getParent();
      if (isType(parent, parentType)) {
         for (ParseTree child : parent.getVisibleChildren()) {
            if (child.isTerminal() && child.asTerminal().getType().getSourceType() == sourceType) {
               return child.equals(terminal);
            }
         }
      }
      return false;
   }

   @Override
   public Renderer createPostRenderer(ParseTree node) {
      // TODO: git_user_name Auto-generated method stub
      return null;
   }

   @Override
   public Renderer createMainRenderer(ParseTree node) {
      if (node.isTerminal() && node.asTerminal().getType().getTokenType() > 0) {
         return new TerminalRenderer();
      }
      return null;
   }

   @Override
   public Renderer createIndentationRenderer(ParseTree node) {
      // TODO: git_user_name Auto-generated method stub
      return null;
   }
}