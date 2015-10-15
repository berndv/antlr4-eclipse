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
import java.io.StringWriter;

import org.antlr.v4.runtime.tree.ParseTree;

public class Formatter {

   private final RendererSelector rendererSelector;

   public Formatter(RendererSelector rendererSelector) {
      this.rendererSelector = rendererSelector;
   }

   public void format(int maxLength, ParseTree tree, Appendable appendable) throws IOException {
      final LineCountingAppendable lca = new LineCountingAppendable(appendable);

      lca.nlListener.add(new NlListener() {
         @Override
         public void nl() throws IOException {
         }
      });

      final Context context = createContext(null, null, tree, 0, false);
      context.fn.prevChar = '\n';
      format(maxLength, context, lca);
   }

   public static class Context {
      public Context parent;

      public ParseTree prevNode;

      public ParseTree tree;

      public boolean wrap;

      public int line;

      public Renderer preamble;

      public Renderer body;

      public Renderer end;

      public Renderer indentation;

      public FormatterNode fn;
   }

   private void format(int maxLength, final Context ctx, LineCountingAppendable a) throws IOException {
      final NlListener nll = new NlListener() {
         @Override
         public void nl() throws IOException {
            ctx.fn.relLine = a.line - ctx.fn.line;
            ctx.fn.prevChar = a.currentChar;
            ident(ctx, a);
         }
      };

      a.nlListener.add(nll);

      ParseTree prevNode = ctx.prevNode;
      final ParseTree tree = ctx.tree;

      ctx.fn.relLine = a.line - ctx.fn.line;
      ctx.fn.prevChar = a.currentChar;
      ctx.preamble.print(ctx.fn, a);

      // if (a.nl) {
      // ident(ctx, a);
      // }

      ctx.fn.relLine = a.line - ctx.fn.line;
      ctx.fn.prevChar = a.currentChar;
      ctx.body.print(ctx.fn, a);

      final int length = tree.getChildCount();
      for (int i = 0; i < length; i++) {

         final ParseTree child = tree.getChild(i);

         boolean wrap = false;

         boolean wrapEnabled = maxLength > 0;
         if (wrapEnabled) {
            int expected = calcLineLength(child);
            wrap = a.length + expected > maxLength;
         }

         format(maxLength, createContext(ctx, prevNode, child, a.line, wrap), a);
         prevNode = child;
      }

      a.nlListener.remove(nll);

      ctx.fn.relLine = a.line - ctx.fn.line;
      ctx.fn.prevChar = a.currentChar;
      ctx.end.print(ctx.fn, a);
   }

   private int calcLineLength(ParseTree tree) throws IOException {
      final Formatter formatter = new Formatter(rendererSelector);
      final StringWriter sw = new StringWriter();
      formatter.format(-1, tree, sw);
      final String string = sw.toString();
      final int idx = string.indexOf('\n');
      return idx == -1 ? string.length() : idx;
   }

   private Context createContext(Context parentCtx, ParseTree prevNode, ParseTree tree, int line, boolean wrap) {
      final Context ctx = new Context();

      ctx.parent = parentCtx;
      ctx.line = line;
      ctx.prevNode = prevNode;
      ctx.tree = tree;
      ctx.wrap = wrap;

      ctx.fn = new FormatterNode(parentCtx == null ? null : parentCtx.fn, tree, line, wrap);

      ctx.preamble = rendererSelector.getPreRenderer(ctx.fn);
      if (ctx.preamble == null) {
         ctx.preamble = Renderer.NULL;
      }
      ctx.body = rendererSelector.getMainRenderer(ctx.fn);
      if (ctx.body == null) {
         ctx.body = Renderer.NULL;
      }
      ctx.end = rendererSelector.getPostRenderer(ctx.fn);
      if (ctx.end == null) {
         ctx.end = Renderer.NULL;
      }

      ctx.indentation = rendererSelector.getIndentationRenderer(ctx.fn);
      if (ctx.indentation == null) {
         ctx.indentation = Renderer.NULL;
      }

      return ctx;
   }

   private void ident(Context ctx, LineCountingAppendable a) throws IOException {
      if (ctx != null) {
         ctx.indentation.print(ctx.fn, a);
      }
   }

}
