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
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.AltListContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.BlockContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.GrammarSpecContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.IdContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.LexerBlockContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.LexerRuleBlockContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.LexerRuleContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.ParserRuleSpecContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.RuleBlockContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.RuleSpecContext;

public class FormatterTest {

   private static class NlRenderer implements Renderer {
      @Override
      public void print(FormatterNode node, Appendable a) throws IOException {
         a.append('\n');
      }
   }

   private static class BlankRenderer implements Renderer {
      @Override
      public void print(FormatterNode node, Appendable a) throws IOException {
         a.append(' ');
      }
   }

   private static final class TokenRenderer implements Renderer {
      @Override
      public void print(FormatterNode node, Appendable a) throws IOException {
         final Token token = ((TerminalNode) node.astNode).getSymbol();
         if (token.getType() != Token.EOF) {
            final String text = token.getText();
            a.append(text);
         }
      }
   }

   private final RendererSelector selector = new RendererSelector() {

      @Override
      public Renderer getIndentationRenderer(FormatterNode fn) {
         final ParseTree node = fn.astNode;

         if (fn.parent != null
            && (fn.parent.astNode instanceof ParserRuleSpecContext || fn.parent.astNode instanceof LexerRuleContext)) {
            if (!node.equals(node.getParent().getChild(0))) {
               return new Renderer() {
                  @Override
                  public void print(FormatterNode node, Appendable a) throws IOException {
                     a.append("    ");
                     if (node.astNode instanceof RuleBlockContext || node.astNode instanceof LexerBlockContext) {
                        a.append("  ");
                     }
                  }
               };
            }
         }

         if (node instanceof TerminalNode) {
            final TerminalNode t = (TerminalNode) node;
            if (ANTLRv4Lexer.SEMI == t.getSymbol().getType()) {
               if (node.getParent().getParent() instanceof RuleSpecContext) {
                  return new Renderer() {
                     @Override
                     public void print(FormatterNode node, Appendable a) throws IOException {
                        a.append("    ");
                     }
                  };
               }
            }

         }

         return null;
      }

      @Override
      public Renderer getPreRenderer(FormatterNode fn) {
         final ParseTree node = fn.astNode;

         if (node instanceof IdContext) {
            return new BlankRenderer();
         }

         if (node instanceof RuleSpecContext) {
            return new Renderer() {
               @Override
               public void print(FormatterNode node, Appendable a) throws IOException {
                  a.append('\n');
                  a.append('\n');
               }
            };
         }

         if (node instanceof RuleBlockContext || node instanceof LexerRuleBlockContext) {
            return new BlankRenderer();
         }

         if (node.getParent() instanceof BlockContext) {
            if (fn.parent != null && fn.parent.wrap) {
               int type = getTokenType(node);
               if (type != ANTLRv4Lexer.LPAREN && type != ANTLRv4Lexer.RPAREN && getChildIndex(node) > 1) {
                  return new NlRenderer() {
                     @Override
                     public void print(FormatterNode node, Appendable a) throws IOException {
                        super.print(node, a);
                     }
                  };
               }
            }
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

            if (((TerminalNode) node).getSymbol().getType() == ANTLRv4Lexer.RPAREN) {
               if (node.getParent() instanceof BlockContext) {
                  return new BlankRenderer() {
                     @Override
                     public void print(FormatterNode node, Appendable a) throws IOException {
                        if (!Character.isWhitespace(node.prevChar)) {
                           super.print(node, a);
                        }
                     }
                  };
               }
            }

            if (((TerminalNode) node).getSymbol().getType() == ANTLRv4Lexer.OR) {
               if (node.getParent() instanceof AltListContext) {

                  if (node.getParent().getParent() instanceof BlockContext) {
                     if (fn.parent != null && fn.parent.parent != null && fn.parent.parent.wrap) {
                        return new NlRenderer() {
                           @Override
                           public void print(FormatterNode node, Appendable a) throws IOException {
                              super.print(node, a);
                           }
                        };
                     }
                  }


                  return new BlankRenderer();
               }
            }
         }

         return null;
      }

      private int getTokenType(ParseTree node) {
         if (node instanceof TerminalNode) {
            return ((TerminalNode) node).getSymbol().getType();
         }
         return ANTLRv4Lexer.EOF - 1;
      }

      private int getChildIndex(ParseTree node) {
         final ParseTree parent = node.getParent();
         if (parent != null) {
            final int length = parent.getChildCount();
            for (int i = 0; i < length; i++) {
               if (node.equals(parent.getChild(0))) {
                  return i;
               }
            }
         }
         return -1;
      }

      @Override
      public Renderer getMainRenderer(FormatterNode fn) {
         final ParseTree node = fn.astNode;
         if (node instanceof TerminalNode) {
            return new TokenRenderer();
         }

         return null;
      }

      @Override
      public Renderer getPostRenderer(FormatterNode fn) {
         final ParseTree node = fn.astNode;

         if (node instanceof AltListContext) {
            if (node.getParent() instanceof BlockContext) {
               if (fn.parent != null && fn.parent.wrap) {
                  return new NlRenderer();
               }
            }
         }

         if (node instanceof TerminalNode) {
            if (((TerminalNode) node).getSymbol().getType() == ANTLRv4Lexer.LPAREN) {
               if (node.getParent() instanceof BlockContext) {
                  return new BlankRenderer();
               }
            }

            if (((TerminalNode) node).getSymbol().getType() == ANTLRv4Lexer.OR) {
               if (node.getParent() instanceof AltListContext) {
                  return new BlankRenderer();
               }
            }
         }
         return null;
      }

   };

   @Test
   public void test() throws RecognitionException, IOException {

      String grammar = "grammar Foo; foo: FOO; Foo: \"Bar\";";

      GrammarSpecContext grammarSpec = parse(grammar);

      StringWriter appendable = new StringWriter();
      new Formatter(selector).format(80, grammarSpec, appendable);
      System.out.println(appendable);

   }

   @Test
   public void test2() throws RecognitionException, IOException {

      String grammar = "grammar Foo; foo: ( a | b | c | d);";

      GrammarSpecContext grammarSpec = parse(grammar);

      StringWriter appendable = new StringWriter();
      new Formatter(selector).format(4, grammarSpec, appendable);
      System.out.println(appendable);

   }

   private GrammarSpecContext parse(String grammar) {
      final ANTLRInputStream input;
      try {
         input = new ANTLRInputStream(new StringReader(grammar));
      }
      catch (IOException e) {
         throw new IllegalStateException(e);
      }
      final CommonTokenStream tokenStream = new CommonTokenStream(new ANTLRv4Lexer(input));
      final ANTLRv4Parser parser = new ANTLRv4Parser(tokenStream);

      GrammarSpecContext grammarSpec = parser.grammarSpec();
      return grammarSpec;
   }

}
