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

package org.sourcepit.antlr4.eclipse.lang.tests.jd;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

public abstract class AbstractJavadocLexer extends Lexer {

   public static final int JAVA_DOC_LINE_PREFIX = 2;

   protected boolean allowBlockTag;

   public AbstractJavadocLexer(CharStream input) {
      super(input);
   }

   @Override
   public Token nextToken() {
      Token token = super.nextToken();
      switch (token.getType()) {
         case ModeLexer.JavadocStart :
         case ModeLexer.JavadocLinePrefix :
         case ModeLexer.JavadocNl :
         case ModeLexer.Nl :
            allowBlockTag = true;
            break;
         case ModeLexer.JavadocWs :
            break;
         default :
            allowBlockTag = false;
            break;
      }
      return token;
   }

   protected boolean isNl() {
      int c = _input.LA(-1);
      return '\n' == c || '\r' == c;
   }

   protected boolean isNotBreakJavadocEnd() {
      final int c = _input.LA(-1);
      if ('*' == c) {
         return '/' != _input.LA(1);
      }
      return true;
   }
}
