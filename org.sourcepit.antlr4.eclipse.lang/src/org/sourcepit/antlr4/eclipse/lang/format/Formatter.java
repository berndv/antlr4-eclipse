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
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.sourcepit.antlr4.eclipse.lang.TokenUtils;

public class Formatter {

   private final RendererSelector rendererSelector;

   private List<Token> hiddenTokens;

   public Formatter(RendererSelector rendererSelector) {
      this.rendererSelector = rendererSelector;
   }

   public void format(int maxLength, ParseTree tree, BufferedTokenStream tokenStream, Appendable appendable)
      throws IOException {
      final LineCountingAppendable lca = new LineCountingAppendable(appendable);

      lca.nlListener.add(new NlListener() {
         @Override
         public void nl() throws IOException {
         }
      });
      final Context context = createContext(null, null, tree, tokenStream, 0, false);
      context.fn.prevChar = '\n';
      hiddenTokens = TokenUtils.getHiddenTokensToRight(tokenStream, -1);
      format(maxLength, context, lca);
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

      final List<Token> myHidden = hiddenTokens;

      if (tree instanceof TerminalNode) {
         final int idx = ((TerminalNode) tree).getSymbol().getTokenIndex();
         hiddenTokens = TokenUtils.getHiddenTokensToRight(ctx.tokenStream, idx);
      }
      else {
         hiddenTokens = Collections.emptyList();
      }

      ParseTree prevNode = ctx.prevNode;

      for (Token token : myHidden) {

         final TerminalNodeImpl child = new TerminalNodeImpl(token);
         child.parent = tree;

         boolean wrap = false;
         boolean wrapEnabled = maxLength > 0;
         if (wrapEnabled) {
            int expected = calcLineLength(child, ctx.tokenStream);
            wrap = a.length + expected > maxLength;
         }

         format(maxLength, createContext(ctx, prevNode, child, ctx.tokenStream, a.line, wrap), a);
         prevNode = child;
      }

      final int length = tree.getChildCount();
      for (int i = 0; i < length; i++) {

         final ParseTree child = tree.getChild(i);

         boolean wrap = false;
         boolean wrapEnabled = maxLength > 0;
         if (wrapEnabled) {
            int expected = calcLineLength(child, ctx.tokenStream);
            wrap = a.length + expected > maxLength;
         }

         format(maxLength, createContext(ctx, prevNode, child, ctx.tokenStream, a.line, wrap), a);
         prevNode = child;

      }

      a.nlListener.remove(nll);

      ctx.fn.relLine = a.line - ctx.fn.line;
      ctx.fn.prevChar = a.currentChar;
      ctx.end.print(ctx.fn, a);
   }

   private int calcLineLength(ParseTree tree, BufferedTokenStream tokenStream) throws IOException {
      final Formatter formatter = new Formatter(rendererSelector);
      final StringWriter sw = new StringWriter();
      formatter.format(-1, tree, tokenStream, sw);
      final String string = sw.toString();
      final int idx = string.indexOf('\n');
      return idx == -1 ? string.length() : idx;
   }

   private Context createContext(Context parentCtx, ParseTree prevNode, ParseTree tree, BufferedTokenStream tokenStream,
      int line, boolean wrap) {
      final Context ctx = new Context();

      ctx.parent = parentCtx;
      ctx.line = line;
      ctx.prevNode = prevNode;
      ctx.tree = tree;
      ctx.tokenStream = tokenStream;
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

   public static class Context {
      public Context parent;

      public ParseTree prevNode;

      public ParseTree tree;

      public BufferedTokenStream tokenStream;

      public boolean wrap;

      public int line;

      public Renderer preamble;

      public Renderer body;

      public Renderer end;

      public Renderer indentation;

      public FormatterNode fn;
   }

}
