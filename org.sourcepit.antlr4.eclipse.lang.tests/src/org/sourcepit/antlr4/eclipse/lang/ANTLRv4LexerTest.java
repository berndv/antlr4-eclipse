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

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class ANTLRv4LexerTest {

   @Test
   public void test() {
      ANTLRv4Lexer lexer = new ANTLRv4Lexer(new ANTLRInputStream("grammar Foo"));

      Token t = lexer.nextToken();
      assertEquals("grammar", t.getText());
      assertEquals(ANTLRv4Lexer.GRAMMAR, t.getType());
      assertEquals(Token.DEFAULT_CHANNEL, t.getChannel());

      t = lexer.nextToken();
      assertEquals(" ", t.getText());
      assertEquals(ANTLRv4Lexer.WS, t.getType());
      assertEquals(Token.HIDDEN_CHANNEL, t.getChannel());

      t = lexer.nextToken();
      assertEquals("Foo", t.getText());
      assertEquals(ANTLRv4Lexer.TOKEN_REF, t.getType());
      assertEquals(Token.DEFAULT_CHANNEL, t.getChannel());

      t = lexer.nextToken();
      assertEquals("<EOF>", t.getText());
      assertEquals(ANTLRv4Lexer.EOF, t.getType());
      assertEquals(Token.DEFAULT_CHANNEL, t.getChannel());
   }

}
