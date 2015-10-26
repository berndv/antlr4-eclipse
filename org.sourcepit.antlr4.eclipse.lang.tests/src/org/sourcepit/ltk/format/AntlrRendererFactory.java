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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.GrammarTypeContext;
import org.sourcepit.antlr4.eclipse.lang.CommentLexer;
import org.sourcepit.ltk.parser.ParseNode;
import org.sourcepit.ltk.parser.Rule;
import org.sourcepit.ltk.parser.Terminal;
import org.sourcepit.ltk.parser.Token;

public class AntlrRendererFactory implements RendererFactory {
   private final class NewLineRenderer implements Renderer {
      @Override
      public void render(LineCounter lines, ParseNode node, Appendable out) throws IOException {
         if (!lines.isNewLine()) {
            out.append('\n');
         }
      }
   }

   private final class SelectVisibleOfCurrentLang implements ParseNodeFilter {
      @Override
      public boolean select(ParseNode child) {
         final Terminal terminal = child.isTerminal() ? child.asTerminal() : child.getOrigin();
         return terminal == null || terminal.getToken().isDefaultChannel();
      }
   }

   public class TerminalRenderer implements Renderer {
      @Override
      public void render(LineCounter lines, ParseNode node, Appendable out) throws IOException {
         out.append(node.asTerminal().getToken().getText());
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
      if (node.isTerminal()) {
         final Renderer renderer = createPreRenderer(node.getParent(), node.asTerminal());
         if (renderer != null) {
            return renderer;
         }
      }
      return null;
   }

   private Renderer createPreRenderer(Rule parent, Terminal terminal) {
      final Token token = terminal.getToken();

      if (token.getType().is(CommentLexer.class, CommentLexer.BlockCommentStart)) {

         final String previousWs = getPreviousWs(terminal);

         if (previousWs.contains("\n")) {
            return new NewLineRenderer();
         }

         if (!previousWs.isEmpty()) {
            return new Renderer() {
               @Override
               public void render(LineCounter lines, ParseNode node, Appendable out) throws IOException {
                  out.append(' ');
               }
            };
         }
      }

      if (parent.getType() == GrammarTypeContext.class) {
         if (isFirstOf(terminal, getVisibleChildrenOfCurrentLang(parent))) {
            return new NewLineRenderer();
         }
      }

      if (token.getType().getSourceType() == ANTLRv4Lexer.class) {
         int tokenId = token.getType().getTokenId();
         if (tokenId != ANTLRv4Lexer.EOF && tokenId != ANTLRv4Lexer.SEMI) {
            return new Renderer() {
               @Override
               public void render(LineCounter lines, ParseNode node, Appendable out) throws IOException {
                  out.append(' ');
               }
            };
         }
      }
      return null;
   }

   public static String getPreviousWs(Terminal terminal) {
      final StringBuilder ws = new StringBuilder();
      addPreviousWs(terminal, ws);
      return ws.toString();
   }

   private static void addPreviousWs(Terminal terminal, StringBuilder ws) {
      Terminal prev = terminal.getPrevious();
      if (prev != null && isWs(prev)) {
         addPreviousWs(prev, ws);
         ws.append(prev.getToken().getText());
      }
   }

   private static boolean isWs(Terminal prev) {
      return isWs(prev.getToken());
   }

   private static boolean isWs(final Token token) {
      final String text = token.getText();
      if (text.isEmpty()) {
         return false;
      }
      for (char c : text.toCharArray()) {
         if (!Character.isWhitespace(c)) {
            return false;
         }
      }
      return true;
   }

   private List<ParseNode> getVisibleChildrenOfCurrentLang(Rule parent) {
      return getChildren(parent, new SelectVisibleOfCurrentLang());
   }

   private boolean isFirstOf(ParseNode node, final List<ParseNode> children) {
      return children.indexOf(node) == 0;
   }

   @Override
   public Renderer createPostRenderer(ParseNode node) {
      // TODO: git_user_name Auto-generated method stub
      return null;
   }

   @Override
   public Renderer createMainRenderer(ParseNode node) {
      if (node.isTerminal() && node.asTerminal().getToken().getType().getTokenId() > 0) {
         return new TerminalRenderer();
      }
      return null;
   }

   @Override
   public Renderer createIndentationRenderer(ParseNode node) {
      // TODO: git_user_name Auto-generated method stub
      return null;
   }
}