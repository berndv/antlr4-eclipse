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

import java.io.IOException;

import org.antlr.v4.runtime.tree.ParseTree;
import org.sourcepit.antlr4.eclipse.lang.format.SourceFormatterTest.Context;
import org.sourcepit.antlr4.eclipse.lang.format.SourceFormatterTest.Printer;

public class Formatter {

   private final RendererSelector rendererSelector;

   public Formatter(RendererSelector rendererSelector) {
      this.rendererSelector = rendererSelector;
   }

   public void format(ParseTree tree, Appendable appendable) throws IOException {
      final LineCountingAppendable lca = new LineCountingAppendable(appendable);
      final Context context = createContext(null, tree, 0);
      format(context, lca);
   }

   public static class Context {
      public Context parent;

      public ParseTree tree;

      public int line;

      public Renderer preamble;

      public Renderer body;

      public Renderer end;

      public Renderer indentation;
   }

   private void format(final Context context, LineCountingAppendable a) throws IOException {

      final NlListener nll = new NlListener() {
         @Override
         public void nl() throws IOException {
            ident(context, a);
         }
      };

      a.nlListener.add(nll);

      final ParseTree tree = context.tree;

      context.preamble.print(a.line - context.line, tree, a);

      // if (a.nl) {
      // ident(ctx, a);
      // }

      context.body.print(a.line - context.line, tree, a);

      final int length = tree.getChildCount();
      for (int i = 0; i < length; i++) {
         format(createContext(context, tree.getChild(i), a.line), a);

      }

      a.nlListener.remove(nll);

      context.end.print(a.line - context.line, tree, a);
   }

   private Context createContext(Context parentCtx, ParseTree tree, int line) {
      final Context ctx = new Context();

      ctx.parent = parentCtx;
      ctx.line = line;
      ctx.tree = tree;

      ctx.preamble = rendererSelector.getPreRenderer(tree);
      if (ctx.preamble == null) {
         ctx.preamble = Renderer.NULL;
      }
      ctx.body = rendererSelector.getMainRenderer(tree);
      if (ctx.body == null) {
         ctx.body = Renderer.NULL;
      }
      ctx.end = rendererSelector.getPostRenderer(tree);
      if (ctx.end == null) {
         ctx.end = Renderer.NULL;
      }

      ctx.indentation = rendererSelector.getIndentationRenderer(tree);
      if (ctx.indentation == null) {
         ctx.indentation = Renderer.NULL;
      }

      return ctx;
   }

   private void ident(Context parent, LineCountingAppendable a) throws IOException {
      if (parent != null) {
         // ident(parent.parent, a);
         parent.indentation.print(a.line - parent.line, parent.tree, a);
      }
   }

}
