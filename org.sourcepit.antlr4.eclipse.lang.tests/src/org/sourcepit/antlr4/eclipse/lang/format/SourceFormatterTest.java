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

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class SourceFormatterTest {

   @Test
   public void test() throws RecognitionException, IOException {

      final ANTLRInputStream input;
      try {
         input = new ANTLRInputStream(new StringReader("grammar Foo;foo:FOO;bar:BAR;"));
      }
      catch (IOException e) {
         throw new IllegalStateException(e);
      }
      final CommonTokenStream tokenStream = new CommonTokenStream(new ANTLRv4Lexer(input));
      final ANTLRv4Parser parser = new ANTLRv4Parser(tokenStream);

      new SourceFormatter().format(parser.grammarSpec(), tokenStream);
   }

   public interface Printer<T> {
      void print(int line, T token, Appendable a) throws IOException;
   }


   public abstract static class ParserTree {
      public ParserRule parent;
   }

   public static class ParserRule extends ParserTree {

      public final String type;

      public final List<ParserTree> children = new ArrayList<>();

      public ParserRule(String type) {
         this.type = type;
      }

      @Override
      public String toString() {
         return type;
      }
   }

   public static class TerminalRule extends ParserTree {
      public String token;

      public TerminalRule(ParserRule parent, String token) {
         this.parent = parent;
         this.token = token;
      }

      @Override
      public String toString() {
         return token;
      }

   }

   public static Printer<ParserTree> getIdent(ParserTree node) {

      if (node instanceof TerminalRule) {
         String token = ((TerminalRule) node).token;

         if (":".equals(token) || ";".equals(token)) {
            return new Printer<ParserTree>() {
               @Override
               public void print(int line, ParserTree token, Appendable a) throws IOException {
                  a.append("    ");
               }
            };
         }

         if ("BAR\nBLUB".equals(token)) {
            return new Printer<ParserTree>() {
               @Override
               public void print(int line, ParserTree token, Appendable a) throws IOException {
                  if (line > 0) {
                     a.append("  ");
                  }
               }
            };
         }
      }

      if (node instanceof ParserRule) {
         String type = ((ParserRule) node).type;
         if ("alt".equals(type)) {
            return new Printer<ParserTree>() {
               @Override
               public void print(int line, ParserTree token, Appendable a) throws IOException {
                  if (line > 0) {
                     a.append("    ");
                  }
               }
            };
         }
      }
      return new Printer<ParserTree>() {
         @Override
         public void print(int line, ParserTree token, Appendable a) throws IOException {
         }
      };
   }

   public static Printer<ParserTree> getPrequel(ParserTree node) {

      if (node instanceof TerminalRule) {
         String token = ((TerminalRule) node).token;
         if (":".equals(token) || "|".equals(token) || ";".equals(token)) {
            return new Printer<ParserTree>() {
               @Override
               public void print(int line, ParserTree token, Appendable a) throws IOException {
                  if (line == 0) {
                     a.append('\n');
                  }
               }
            };
         }
      }

      return new Printer<ParserTree>() {

         @Override
         public void print(int line, ParserTree token, Appendable a) throws IOException {
         }

      };
   }


   public static Printer<ParserTree> getPrinter(ParserTree node) {

      if (node instanceof TerminalRule) {
         return new Printer<ParserTree>() {
            @Override
            public void print(int line, ParserTree token, Appendable a) throws IOException {
               a.append(((TerminalRule) token).token);
            }
         };
      }

      return new Printer<ParserTree>() {

         @Override
         public void print(int line, ParserTree token, Appendable a) throws IOException {
         }

      };
   }

   public static Printer<ParserTree> getTerminator(ParserTree node) {

      if (node instanceof TerminalRule) {
         String token = ((TerminalRule) node).token;

         if (":".equals(token)) {
            return new Printer<ParserTree>() {

               @Override
               public void print(int line, ParserTree token, Appendable a) throws IOException {
                  a.append(' ');
               }
            };
         }

         if ("|".equals(token)) {
            return new Printer<ParserTree>() {
               @Override
               public void print(int line, ParserTree token, Appendable a) throws IOException {
                  // if (line == 0) {
                  a.append(' ');
                  // }
               }
            };
         }
      }

      return new Printer<ParserTree>() {
         @Override
         public void print(int line, ParserTree token, Appendable a) throws IOException {
         }
      };
   }

   public static class LineCountingAppendable implements Appendable {

      private final Appendable target;

      int line = 0;

      List<Context> nlListener = new ArrayList<>();

      public LineCountingAppendable(Appendable target) {
         this.target = target;
      }

      @Override
      public Appendable append(CharSequence csq) throws IOException {
         return append(csq, 0, csq.length());
      }

      @Override
      public Appendable append(CharSequence csq, int start, int end) throws IOException {
         for (int i = start; i < end; i++) {
            append(csq.charAt(i));
         }
         return this;
      }

      boolean nl;

      @Override
      public Appendable append(char c) throws IOException {
         nl = false;
         target.append(c);
         if (c == '\n') {

            nl = true;

            line++;

            for (Context context : nlListener) {
               context.nl(this);
            }

         }
         return this;
      }

   }


   @Test
   public void testName() throws Exception {
      ParserRule alt2 = new ParserRule("alt");
      alt2.children.add(new TerminalRule(alt2, "|"));
      alt2.children.add(new TerminalRule(alt2, "BAR\nBLUB"));

      ParserRule alt1 = new ParserRule("alt");
      alt1.children.add(new TerminalRule(alt1, "FOO"));

      ParserRule block = new ParserRule("block");
      alt1.parent = block;
      block.children.add(alt1);
      alt2.parent = block;
      block.children.add(alt2);

      ParserRule rule = new ParserRule("rule");
      rule.children.add(new TerminalRule(rule, "foo"));
      rule.children.add(new TerminalRule(rule, ":"));
      block.parent = rule;
      rule.children.add(block);
      rule.children.add(new TerminalRule(rule, ";"));

      Appendable a = System.out;
      print(null, rule, new LineCountingAppendable(a));
   }

   public static class Context {
      Context parent;

      ParserTree tree;
      int line;

      public Printer<ParserTree> prequel;

      public Printer<ParserTree> body;

      public Printer<ParserTree> terminator;

      public Printer<ParserTree> ident;

      public void nl(LineCountingAppendable a) throws IOException {
      }

   }

   private void print(Context parentCtx, ParserTree tree, LineCountingAppendable a) throws IOException {

      Context ctx = new Context() {
         @Override
         public void nl(LineCountingAppendable a) throws IOException {
            ident(this, a);
            // prequel.print(a.line - line, tree, a);
         }
      };

      ctx.parent = parentCtx;
      ctx.line = a.line;
      ctx.tree = tree;

      ctx.prequel = getPrequel(tree);
      ctx.body = getPrinter(tree);
      ctx.terminator = getTerminator(tree);
      ctx.ident = getIdent(tree);

      a.nlListener.add(ctx);

      // if (a.nl) {
      // ident(ctx, a);
      // }

      ctx.prequel.print(a.line - ctx.line, tree, a);
      ctx.body.print(a.line - ctx.line, tree, a);

      if (tree instanceof ParserRule) {
         for (ParserTree parserTree : ((ParserRule) tree).children) {
            print(ctx, parserTree, a);
         }
      }

      a.nlListener.remove(ctx);

      ctx.terminator.print(a.line - ctx.line, tree, a);
   }

   private void ident(Context parent, LineCountingAppendable a) throws IOException {
      if (parent != null) {
         // ident(parent.parent, a);
         parent.ident.print(a.line - parent.line, parent.tree, a);
      }
   }
}
