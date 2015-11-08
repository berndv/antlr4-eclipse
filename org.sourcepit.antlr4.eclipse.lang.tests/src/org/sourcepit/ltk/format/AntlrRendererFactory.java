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

import static org.sourcepit.antlr4.eclipse.lang.CommentLexer.BlockCommentEnd;
import static org.sourcepit.antlr4.eclipse.lang.ParseNodeUtils.isRuleOfType;
import static org.sourcepit.antlr4.eclipse.lang.ParseNodeUtils.isTerminalOfType;
import static org.sourcepit.antlr4.eclipse.lang.TerminalUtils.isWs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.ActionContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.GrammarDeclContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.IdContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.LabeledAltContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.LexerAltContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.LexerAltListContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.LexerRuleBlockContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.LexerRuleContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.OptionContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.OptionValueContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.OptionsSpecBodyContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.ParserRuleSpecContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.RuleAltListContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.RuleBlockContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.TokenContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.TokensSpecBodyContext;
import org.sourcepit.antlr4.eclipse.lang.CommentLexer;
import org.sourcepit.antlr4.eclipse.lang.CommentParser.CommentContext;
import org.sourcepit.ltk.parser.ParseNode;
import org.sourcepit.ltk.parser.Rule;
import org.sourcepit.ltk.parser.Terminal;

public class AntlrRendererFactory extends CommentRendererFactory implements RendererFactory {

   @Override
   public boolean isPartiallyRendered(ParseNode node) {
      return super.isPartiallyRendered(node);
   }

   private final class BlankRenderer implements Renderer {
      @Override
      public void render(LineCounter lines, ParseNode node, Appendable out) throws IOException {
         if (!lines.isPrevCharWs()) {
            final Terminal terminal;
            if (node.isRule()) {
               terminal = getFirstTerminal(node);
            }
            else {
               terminal = node.asTerminal();
            }
            if (!isPrevBlockCommentEnd(terminal)) {
               out.append(' ');
            }
         }
      }

      private boolean isPrevBlockCommentEnd(Terminal terminal) {
         final Terminal previous = terminal.getPrevious();
         return previous != null && previous.getToken().getType().is(CommentLexer.class, BlockCommentEnd);
      }
   }

   private final class NewLineRenderer implements Renderer {
      @Override
      public void render(LineCounter lines, ParseNode node, Appendable out) throws IOException {
         if (!lines.isNewLine()) {
            out.append('\n');
         }
      }
   }

   interface ParseNodeFilter {
      boolean select(ParseNode child);
   }

   public static List<ParseNode> getChildren(ParseNode node, ParseNodeFilter filter) {
      List<ParseNode> result = new ArrayList<>();
      for (ParseNode child : node.getChildren()) {
         if (filter.select(child)) {
            result.add(child);
         }
      }
      return result;
   }

   @Override
   public Renderer createPreRenderer(ParseNode node) {
      Renderer renderer = super.createPreRenderer(node);
      if (renderer != null) {
         return renderer;
      }

      if (isRuleOfType(node, GrammarDeclContext.class)) {
         return new NewLineRenderer();
      }

      if (isRuleOfType(node, CommentContext.class)) {
         return new Renderer() {
            @Override
            public void render(LineCounter lines, ParseNode node, Appendable out) throws IOException {
               if (!lines.isPrevCharWs()) {

                  // && isPrevWs(node.asRule().getOrigin())) {

                  final Terminal previous = node.asRule().getOrigin().getPrevious();

                  if (previous != null && isWs(previous)) {
                     if (previous.getToken().getText().contains("\n")) {
                        out.append('\n');
                     }
                     else {
                        out.append(' ');
                     }
                  }

               }
            }

            private boolean isPrevWs(Terminal terminal) {
               final Terminal previous = terminal.getPrevious();
               return previous != null && isWs(previous);
            }
         };
      }

      if (isRuleOfType(node, OptionContext.class)) {
         return new NewLineRenderer();
      }

      if (isRuleOfType(node, TokenContext.class)) {
         return new NewLineRenderer();
      }

      if (isTerminalOfType(node, ANTLRv4Lexer.class, ANTLRv4Lexer.GRAMMAR)) {
         return new BlankRenderer();
      }

      if (isTerminalOfType(node, ANTLRv4Lexer.class, ANTLRv4Lexer.ASSIGN)) {
         return new BlankRenderer();
      }

      if (isTerminalOfType(node, ANTLRv4Lexer.class, ANTLRv4Lexer.ACTION)) {
         final Rule parent = node.getParent();
         if (parent != null) {
            if (isRuleOfType(parent, ActionContext.class)) {
               return new BlankRenderer();
            }
         }
      }

      // parser rule
      if (isTerminalOfType(node, ANTLRv4Lexer.class, ANTLRv4Lexer.RULE_REF)) {
         if (isRuleOfType(node.getParent(), ParserRuleSpecContext.class)) {
            return new BlankRenderer();
         }
      }

      if (isTerminalOfType(node, ANTLRv4Lexer.class, ANTLRv4Lexer.COLON)) {
         if (isRuleOfType(node.getParent(), RuleBlockContext.class)) {
            return new NewLineRenderer();
         }
      }

      if (isTerminalOfType(node, ANTLRv4Lexer.class, ANTLRv4Lexer.OR)) {
         if (isRuleOfType(node.getParent(), RuleAltListContext.class)) {
            return new NewLineRenderer();
         }
      }

      if (isTerminalOfType(node, ANTLRv4Lexer.class, ANTLRv4Lexer.SEMI)) {
         if (isRuleOfType(node.getParent(), RuleBlockContext.class)) {
            return new NewLineRenderer();
         }
      }

      if (isRuleOfType(node, LabeledAltContext.class)) {
         return new BlankRenderer();
      }

      // lexer rule
      if (isTerminalOfType(node, ANTLRv4Lexer.class, ANTLRv4Lexer.TOKEN_REF)) {
         if (isRuleOfType(node.getParent(), LexerRuleContext.class)) {
            return new BlankRenderer();
         }
      }

      if (isTerminalOfType(node, ANTLRv4Lexer.class, ANTLRv4Lexer.COLON)) {
         if (isRuleOfType(node.getParent(), LexerRuleBlockContext.class)) {
            return new NewLineRenderer();
         }
      }

      if (isTerminalOfType(node, ANTLRv4Lexer.class, ANTLRv4Lexer.OR)) {
         if (isRuleOfType(node.getParent(), LexerAltListContext.class)) {
            return new NewLineRenderer();
         }
      }

      if (isTerminalOfType(node, ANTLRv4Lexer.class, ANTLRv4Lexer.SEMI)) {
         if (isRuleOfType(node.getParent(), LexerRuleBlockContext.class)) {
            return new NewLineRenderer();
         }
      }

      if (isRuleOfType(node, LexerAltContext.class)) {
         return new BlankRenderer();
      }

      if (isRuleOfType(node, IdContext.class)) {
         final Rule parent = node.getParent();
         if (parent != null) {
            if (isRuleOfType(parent, OptionContext.class) || isRuleOfType(parent, OptionValueContext.class)
               || isRuleOfType(parent, ActionContext.class)) {
               return null;
            }
         }
         return new BlankRenderer();
      }

      return null;
   }

   @Override
   public Renderer createPostRenderer(ParseNode node) {
      Renderer renderer = super.createPostRenderer(node);
      if (renderer != null) {
         return renderer;
      }

      if (isTerminalOfType(node, ANTLRv4Lexer.class, ANTLRv4Lexer.DOC_COMMENT)) {
         return new NewLineRenderer();
      }

      if (isTerminalOfType(node, ANTLRv4Lexer.class, ANTLRv4Lexer.ASSIGN)) {
         return new BlankRenderer();
      }

      if (isRuleOfType(node, OptionsSpecBodyContext.class)) {
         return new NewLineRenderer();
      }

      if (isRuleOfType(node, TokensSpecBodyContext.class)) {
         return new NewLineRenderer();
      }

      if (isRuleOfType(node, CommentContext.class)) {
         return new Renderer() {
            @Override
            public void render(LineCounter lines, ParseNode node, Appendable out) throws IOException {
               final Terminal terminal = getNextTerminal(node.asRule());
               if (terminal != null && isWs(terminal)) {
                  final List<ParseNode> siblings = terminal.getParent().getChildren();
                  int indexOf = siblings.indexOf(terminal);
                  if (indexOf < siblings.size() - 1) {
                     if (terminal.getToken().getText().contains("\n")) {
                        out.append('\n');
                     }
                     else {
                        out.append(' ');
                     }
                  }
               }
            }
         };
      }

      return null;
   }

   private Terminal getNextTerminal(Rule rule) {

      Rule parent = rule.getParent();
      if (parent == null) {
         return null;
      }

      final List<ParseNode> children = parent.getChildren();

      int idx = children.indexOf(rule) + 1;
      if (idx > 0) {
         for (; idx < children.size(); idx++) {
            final ParseNode child = children.get(idx);
            if (child.isTerminal()) {
               return child.asTerminal();
            }
            else {
               final Terminal terminal = getFirstTerminal(child.asRule());
               if (terminal != null) {
                  return terminal;
               }
            }
         }
      }

      return getNextTerminal(parent);
   }

   private static Terminal getFirstTerminal(ParseNode node) {
      final ParseTreeVisitorWithResult<Terminal> visitor = new ParseTreeVisitorWithResult<Terminal>(null) {
         @Override
         public boolean visit(Terminal terminal) {
            setResult(terminal);
            return false;
         }
      };
      node.accept(visitor);
      return visitor.getResult();
   }

   @Override
   public Renderer createMainRenderer(ParseNode node) {
      Renderer renderer = super.createMainRenderer(node);
      if (renderer != null) {
         return renderer;
      }

      if (isTerminalOfType(node, ANTLRv4Lexer.class, ANTLRv4Lexer.OPTIONS)) {
         return new Renderer() {
            @Override
            public void render(LineCounter lines, ParseNode node, Appendable out) throws IOException {
               out.append("options {");
            }
         };
      }

      if (isTerminalOfType(node, ANTLRv4Lexer.class, ANTLRv4Lexer.TOKENS)) {
         return new Renderer() {
            @Override
            public void render(LineCounter lines, ParseNode node, Appendable out) throws IOException {
               out.append("tokens {");
            }
         };
      }

      if (node.isTerminal() && node.asTerminal().getToken().getType().getTokenId() > 0) {
         return new TerminalRenderer();
      }
      return null;
   }

   @Override
   public Renderer createIndentationRenderer(ParseNode node) {
      Renderer renderer = super.createIndentationRenderer(node);
      if (renderer != null) {
         return renderer;
      }

      if (isRuleOfType(node, OptionsSpecBodyContext.class)) {
         return new Renderer() {
            @Override
            public void render(LineCounter lines, ParseNode node, Appendable out) throws IOException {
               out.append("    ");
            }
         };
      }

      if (isRuleOfType(node, TokensSpecBodyContext.class)) {
         return new Renderer() {
            @Override
            public void render(LineCounter lines, ParseNode node, Appendable out) throws IOException {
               out.append("    ");
            }
         };
      }

      // parser rule
      if (isRuleOfType(node, RuleBlockContext.class)) {
         return new Renderer() {
            @Override
            public void render(LineCounter lines, ParseNode node, Appendable out) throws IOException {
               out.append("    ");
            }
         };
      }

      if (isRuleOfType(node, LabeledAltContext.class)) {
         return new Renderer() {
            @Override
            public void render(LineCounter lines, ParseNode node, Appendable out) throws IOException {
               out.append("  ");
            }
         };
      }

      // lexer rule
      if (isRuleOfType(node, LexerRuleBlockContext.class)) {
         return new Renderer() {
            @Override
            public void render(LineCounter lines, ParseNode node, Appendable out) throws IOException {
               out.append("    ");
            }
         };
      }

      if (isRuleOfType(node, LexerAltContext.class)) {
         return new Renderer() {
            @Override
            public void render(LineCounter lines, ParseNode node, Appendable out) throws IOException {
               out.append("  ");
            }
         };
      }

      return null;
   }
}