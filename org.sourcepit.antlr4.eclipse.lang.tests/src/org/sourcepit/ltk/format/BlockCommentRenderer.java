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

import static java.lang.Character.isWhitespace;
import static org.sourcepit.antlr4.eclipse.lang.CommentLexer.BlockCommentEnd;
import static org.sourcepit.antlr4.eclipse.lang.CommentLexer.BlockCommentLinePrefix;
import static org.sourcepit.antlr4.eclipse.lang.CommentLexer.BlockCommentStart;
import static org.sourcepit.antlr4.eclipse.lang.CommentLexer.Nl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.sourcepit.antlr4.eclipse.lang.CommentLexer;
import org.sourcepit.antlr4.eclipse.lang.CommentParser.CommentTextContext;
import org.sourcepit.ltk.parser.ParseNode;
import org.sourcepit.ltk.parser.Rule;
import org.sourcepit.ltk.parser.Terminal;
import org.sourcepit.ltk.parser.Token;

public class BlockCommentRenderer implements Renderer {

   @Override
   public void render(LineCounter lc, ParseNode node, Appendable out) throws IOException {
      final boolean containsNl = containsNl(node);

      final Rule blockComment = node.asRule();

      final Terminal start = blockComment.getTerminal(CommentLexer.class, BlockCommentStart);
      final String startStr = start.getToken().getText();
      out.append(startStr);
      if (containsNl) {
         out.append('\n');
      }

      final Terminal end = blockComment.getTerminal(CommentLexer.class, BlockCommentEnd);
      final String endStr = end.getToken().getText();

      final Rule commentText = blockComment.getRule(CommentTextContext.class);
      if (commentText != null) {
         final List<String> lines = getLines(commentText);
         if (lines.size() == 1 && !containsNl) {
            if (!isWhitespace(startStr.charAt(startStr.length() - 1))) {
               out.append(' ');
            }
            out.append(lines.get(0));
            if (!isWhitespace(endStr.charAt(0))) {
               out.append(' ');
            }
         }
         else {
            for (String line : lines) {
               out.append(" * ");
               out.append(line);
               out.append('\n');
            }
         }
      }

      out.append(endStr);
   }

   private List<String> getLines(final Rule commentText) {
      List<String> lines = new ArrayList<>();

      StringBuilder line = new StringBuilder();

      for (ParseNode child : commentText.getChildren()) {
         final Token token = child.asTerminal().getToken();

         if (token.getType().is(CommentLexer.class, BlockCommentLinePrefix)) {
            continue;
         }

         if (token.getType().is(CommentLexer.class, Nl)) {
            lines.add(line.toString().trim());
            line = new StringBuilder();
         }
         else {
            line.append(token.getText());
         }
      }
      if (line.length() > 0) {
         lines.add(line.toString().trim());
      }
      return lines;
   }

   private static boolean containsNl(ParseNode node) {
      final ParseTreeVisitorWithResult<Boolean> visitor = new ParseTreeVisitorWithResult<Boolean>(Boolean.FALSE) {
         @Override
         public boolean visit(Terminal terminal) {
            if (terminal.getToken().getText().indexOf('\n') > -1) {
               setResult(Boolean.TRUE);
            }
            return super.visit(terminal);
         }
      };
      node.accept(visitor);
      return visitor.getResult().booleanValue();
   }
}