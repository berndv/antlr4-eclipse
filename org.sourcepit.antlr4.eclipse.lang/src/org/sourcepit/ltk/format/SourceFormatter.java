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

import static org.apache.commons.io.IOUtils.closeQuietly;

import java.io.IOException;

import org.sourcepit.ltk.parser.ParseNode;

public class SourceFormatter {
   private final RendererFactory rendererFactory;

   public SourceFormatter(RendererFactory rendererFactory) {
      this.rendererFactory = rendererFactory;
   }

   public void format(ParseNode ast, Appendable out, EOL eol) throws IOException {
      final NewLineAndIndentationHandler nlAndIndentHandler = new NewLineAndIndentationHandler(
         new EOLNormalizer(out, eol), false);
      try {
         format(nlAndIndentHandler, nlAndIndentHandler, ast, new EOLNormalizer(nlAndIndentHandler, EOL.LF));
      }
      finally {
         closeQuietly(nlAndIndentHandler);
      }
   }

   private void format(LineCounter lines, IndentationHandler indents, final ParseNode node, Appendable out)
      throws IOException {

      final Indentation indent = getIndentationRenderer(lines, node);
      if (indent != null) {
         indents.addIndentation(indent);
      }

      final Renderer preRenderer = rendererFactory.createPreRenderer(node);
      if (preRenderer != null) {
         preRenderer.render(lines, node, out);
      }

      final Renderer mainRenderer = rendererFactory.createMainRenderer(node);
      if (mainRenderer != null) {
         mainRenderer.render(lines, node, out);
      }

      for (ParseNode child : node.getVisibleChildren()) {
         format(lines, indents, child, out);
      }

      if (indent != null) {
         indents.removeIndentation(indent);
      }

      final Renderer postRenderer = rendererFactory.createPostRenderer(node);
      if (postRenderer != null) {
         postRenderer.render(lines, node, out);
      }
   }

   private Indentation getIndentationRenderer(final LineCounter lines, final ParseNode node) {
      final Renderer indentRenderer = rendererFactory.createIndentationRenderer(node);
      if (indentRenderer != null) {
         return new Indentation() {
            @Override
            public void indent(Appendable out) throws IOException {
               indentRenderer.render(lines, node, out);
            }
         };
      }
      return null;
   }

}
