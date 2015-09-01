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

package org.sourcepit.antlr4.eclipse.lang;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

public class CommentLexerTest {

   @Test
   public void testDocComment() {
      StringBuilder jdoc = new StringBuilder();
      jdoc.append("/**\n");
      jdoc.append(" * Hallo wie\n");
      jdoc.append(" * gehts?\n");
      jdoc.append(" */");

      final List<Token> tokens = new ArrayList<>();

      CommentLexer lexer = new CommentLexer(new ANTLRInputStream(jdoc.toString()));
      Token token = lexer.nextToken();
      while (token.getType() != Token.EOF) {
         tokens.add(token);
         token = lexer.nextToken();
      }

      assertEquals(11, tokens.size());

      Iterator<Token> it = tokens.iterator();
      assertToken(CommentLexer.DocCommentStart, "/**", it.next());
      assertToken(CommentLexer.Nl, "\n", it.next());
      assertToken(CommentLexer.BlockCommentLinePrefix, " * ", it.next());
      assertToken(CommentLexer.CommentText, "Hallo", it.next());
      assertToken(CommentLexer.Ws, " ", it.next());
      assertToken(CommentLexer.CommentText, "wie", it.next());
      assertToken(CommentLexer.Nl, "\n", it.next());
      assertToken(CommentLexer.BlockCommentLinePrefix, " * ", it.next());
      assertToken(CommentLexer.CommentText, "gehts?", it.next());
      assertToken(CommentLexer.Nl, "\n", it.next());
      assertToken(CommentLexer.BlockCommentEnd, " */", it.next());
   }

   @Test
   public void testLineComment() {
      StringBuilder jdoc = new StringBuilder();
      jdoc.append("// Hallo wie gehts?\n");

      final List<Token> tokens = new ArrayList<>();

      CommentLexer lexer = new CommentLexer(new ANTLRInputStream(jdoc.toString()));
      Token token = lexer.nextToken();
      while (token.getType() != Token.EOF) {
         tokens.add(token);
         token = lexer.nextToken();
      }

      assertEquals(7, tokens.size());

      Iterator<Token> it = tokens.iterator();
      assertToken(CommentLexer.LineCommentStart, "// ", it.next());
      assertToken(CommentLexer.CommentText, "Hallo", it.next());
      assertToken(CommentLexer.Ws, " ", it.next());
      assertToken(CommentLexer.CommentText, "wie", it.next());
      assertToken(CommentLexer.Ws, " ", it.next());
      assertToken(CommentLexer.CommentText, "gehts?", it.next());
      assertToken(CommentLexer.Nl, "\n", it.next());
   }

   private void assertToken(int type, String text, Token token) {
      assertEquals(type, token.getType());
      assertEquals(text, token.getText());
   }

}
