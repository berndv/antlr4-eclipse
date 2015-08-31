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

package org.sourcepit.antlr4.eclipse.lang.tests.javadoc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AbstractJavadocLexerTest {

   @Test
   public void testIsTagStart() {
      assertTrue(AbstractJavadocLexer.isTagStart('a'));
      assertTrue(AbstractJavadocLexer.isTagStart('h'));
      assertTrue(AbstractJavadocLexer.isTagStart('u'));
      assertTrue(AbstractJavadocLexer.isTagStart('z'));
      assertTrue(AbstractJavadocLexer.isTagStart('A'));
      assertTrue(AbstractJavadocLexer.isTagStart('H'));
      assertTrue(AbstractJavadocLexer.isTagStart('U'));
      assertTrue(AbstractJavadocLexer.isTagStart('Z'));
      assertFalse(AbstractJavadocLexer.isTagStart('ß'));
      assertFalse(AbstractJavadocLexer.isTagStart('0'));
      assertFalse(AbstractJavadocLexer.isTagStart('9'));
      assertFalse(AbstractJavadocLexer.isTagStart('!'));
      assertFalse(AbstractJavadocLexer.isTagStart(' '));
   }

   @Test
   public void testIsChar() throws Exception {
      assertTrue(AbstractJavadocLexer.isChar('\n', '\n'));
      assertTrue(AbstractJavadocLexer.isChar('\n', '\n', '\r'));
      assertTrue(AbstractJavadocLexer.isChar('\r', '\n', '\r'));
      assertFalse(AbstractJavadocLexer.isChar('a', '\n', '\r'));
   }

   @Test
   public void testIsNotChar() throws Exception {
      assertTrue(AbstractJavadocLexer.isNotChar('/', ' '));
      assertTrue(AbstractJavadocLexer.isNotChar('/', ' ', '*'));
      assertTrue(AbstractJavadocLexer.isNotChar('\r', '\n'));
      assertFalse(AbstractJavadocLexer.isNotChar('\r', '\n', '\r'));
   }

}
