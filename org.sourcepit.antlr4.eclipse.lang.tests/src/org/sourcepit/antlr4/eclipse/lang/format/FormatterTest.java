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

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.IdContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.LexerRuleBlockContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.RuleBlockContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.RuleSpecContext;

public class FormatterTest {

   private static final class NlRenderer implements Renderer {
      @Override
      public void print(int line, ParseTree node, Appendable a) throws IOException {
         a.append('\n');
      }
   }

   private static final class BlankRenderer implements Renderer {
      @Override
      public void print(int line, ParseTree node, Appendable a) throws IOException {
         a.append(' ');
      }
   }

   private static final class TokenRenderer implements Renderer {
      @Override
      public void print(int line, ParseTree node, Appendable a) throws IOException {
         final Token token = ((TerminalNode) node).getSymbol();
         if (token.getType() != Token.EOF) {
            final String text = token.getText();
            a.append(text);
         }
      }
   }

   @Test
   public void test() throws RecognitionException, IOException {

      RendererSelector selector = new RendererSelector() {

         @Override
         public Renderer getIndentationRenderer(ParseTree node) {

            if (node instanceof TerminalNode) {
               final TerminalNode t = (TerminalNode) node;
               if (ANTLRv4Lexer.COLON == t.getSymbol().getType()) {
                  if (node.getParent().getParent() instanceof RuleSpecContext) {
                     return new Renderer() {
                        @Override
                        public void print(int line, ParseTree node, Appendable a) throws IOException {
                           a.append('\t');
                        }
                     };
                  }
               }

               if (ANTLRv4Lexer.SEMI == t.getSymbol().getType()) {
                  if (node.getParent().getParent() instanceof RuleSpecContext) {
                     return new Renderer() {
                        @Override
                        public void print(int line, ParseTree node, Appendable a) throws IOException {
                           a.append('\t');
                        }
                     };
                  }
               }
            }

            return null;
         }

         @Override
         public Renderer getPreRenderer(ParseTree node) {

            if (node instanceof IdContext) {
               return new BlankRenderer();
            }

            if (node instanceof RuleSpecContext) {
               return new Renderer() {
                  @Override
                  public void print(int line, ParseTree node, Appendable a) throws IOException {
                     a.append('\n');
                     a.append('\n');
                  }
               };
            }

            if (node instanceof RuleBlockContext || node instanceof LexerRuleBlockContext) {
               return new BlankRenderer();
            }

            if (node instanceof TerminalNode) {
               final TerminalNode t = (TerminalNode) node;
               if (ANTLRv4Lexer.COLON == t.getSymbol().getType()) {
                  if (node.getParent().getParent() instanceof RuleSpecContext) {
                     return new NlRenderer();
                  }
               }

               if (ANTLRv4Lexer.SEMI == t.getSymbol().getType()) {
                  if (node.getParent().getParent() instanceof RuleSpecContext) {
                     return new NlRenderer();
                  }
               }
            }

            return null;
         }


         @Override
         public Renderer getMainRenderer(ParseTree node) {

            if (node instanceof TerminalNode) {
               return new TokenRenderer();
            }

            return null;
         }

         @Override
         public Renderer getPostRenderer(ParseTree node) {
            // TODO: git_user_name Auto-generated method stub
            return null;
         }
      };


      final ANTLRInputStream input;
      try {
         input = new ANTLRInputStream(new StringReader("grammar Foo; foo: FOO; Foo: \"Bar\";"));
      }
      catch (IOException e) {
         throw new IllegalStateException(e);
      }
      final CommonTokenStream tokenStream = new CommonTokenStream(new ANTLRv4Lexer(input));
      final ANTLRv4Parser parser = new ANTLRv4Parser(tokenStream);

      StringWriter appendable = new StringWriter();
      new Formatter(selector).format(parser.grammarSpec(), appendable);
      System.out.println(appendable);

   }

}
