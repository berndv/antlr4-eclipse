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
import java.util.List;

import org.sourcepit.antlr4.eclipse.lang.CommentLexer;
import org.sourcepit.ltk.parser.ParseNode;
import org.sourcepit.ltk.parser.Rule;
import org.sourcepit.ltk.parser.Terminal;
import org.sourcepit.ltk.parser.Token;

public class LineCommentRenderer implements Renderer {

   @Override
   public void render(LineCounter lines, ParseNode node, Appendable out) throws IOException {
      out.append("//");
      final Rule lineComment = node.asRule();
      final List<ParseNode> children = lineComment.getChildren();
      if (children.size() > 1) {
         final String text = toText(children);
         if (!text.isEmpty()) {
            out.append(' ');
            out.append(text);
         }
      }
   }

   private String toText(final List<ParseNode> children) {
      final StringBuilder sb = new StringBuilder();
      final Rule commentText = children.get(1).asRule();
      for (ParseNode text : commentText.getChildren()) {
         final Terminal terminal = text.asTerminal();
         final Token token = terminal.getToken();
         if (token.getType().is(CommentLexer.class, CommentLexer.Ws)) {
            sb.append(' ');
         }
         else {
            sb.append(token.getText());
         }
      }
      return sb.toString().trim();
   }

}
