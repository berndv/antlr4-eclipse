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

package org.sourcepit.antlr4.eclipse.ui;

import java.io.IOException;
import java.io.Reader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer;

public class AntlrTokenRule implements IRule {

   private static final class CharacterScannerReader extends Reader {

      private final ICharacterScanner scanner;

      private int reads;

      public CharacterScannerReader(ICharacterScanner scanner) {
         this.scanner = scanner;
      }

      @Override
      public int read(char[] cbuf, int off, int len) throws IOException {
         int i = 0;
         for (; i < len; i++) {
            final int c = scanner.read();
            reads++;
            if (c == ICharacterScanner.EOF) {
               break;
            }
            else {
               cbuf[off + i] = (char) c;
            }
         }
         return i;
      }

      public void unread() {
         for (int i = 0; i < reads; i++) {
            scanner.unread();
         }
         reads = 0;
      }

      @Override
      public void close() throws IOException {
      }
   }

   @Override
   public IToken evaluate(ICharacterScanner scanner) {

      final CharacterScannerReader reader = new CharacterScannerReader(scanner);

      final ANTLRv4Lexer lexer;
      try {
         lexer = new ANTLRv4Lexer(new ANTLRInputStream(reader));
      }
      catch (IOException e) {
         throw new IllegalStateException(e);
      }

      Token nextToken = lexer.nextToken();
      System.out.println(nextToken);

      return null;
   }

}
