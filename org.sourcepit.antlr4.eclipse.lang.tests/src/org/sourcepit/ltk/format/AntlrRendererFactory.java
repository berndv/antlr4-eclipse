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
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.GrammarDeclContext;
import org.sourcepit.antlr4.eclipse.lang.CommentLexer;
import org.sourcepit.antlr4.eclipse.lang.CommentParser.CommentContext;
import org.sourcepit.antlr4.eclipse.lang.ParseNodeUtils;
import org.sourcepit.ltk.parser.ParseNode;
import org.sourcepit.ltk.parser.Terminal;
import org.sourcepit.ltk.parser.TokenType;

public class AntlrRendererFactory extends CommentRendererFactory implements RendererFactory {

   @Override
   public boolean isPartiallyRendered(ParseNode node) {
      return super.isPartiallyRendered(node);
   }

   private final class BlankRenderer implements Renderer {
      @Override
      public void render(LineCounter lines, ParseNode node, Appendable out) throws IOException {
         if (!lines.isNewLine()) {
            if (!isPrevBlockCommentEnd(node.asTerminal())) {
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
               if (isPrevWs(node.asRule().getOrigin())) {
                  out.append(' ');
               }
            }

            private boolean isPrevWs(Terminal terminal) {
               final Terminal previous = terminal.getPrevious();
               return previous != null && isWs(previous);
            }
         };
      }

      if (node.isTerminal()) {
         final TokenType tokenType = node.asTerminal().getToken().getType();
         if (tokenType.getSourceType() == ANTLRv4Lexer.class) {
            int tokenId = tokenType.getTokenId();
            if (tokenId != ANTLRv4Lexer.SEMI) {
               return new BlankRenderer();
            }
         }
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

      return null;
   }

   @Override
   public Renderer createMainRenderer(ParseNode node) {
      Renderer renderer = super.createMainRenderer(node);
      if (renderer != null) {
         return renderer;
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
      return null;
   }
}