grammar Javadoc2;

@header {
/**
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
	
package org.sourcepit.antlr4.eclipse.lang.tests.javadoc2;
}

@lexer::members {

   public static final int DOCFRAME = 2;

   private boolean isJavadocEnd() {
      int i = 1;
      int c = _input.LA(i);
      while ('*' == c) {
         i++;
         c = _input.LA(i);
      }
      return '/' == c;
   }
   
   private boolean isJavadocLinePrefix() {
      int i = -1;
      int c = _input.LA(i);

      while (' ' == c) {
         i--;
         c = _input.LA(i);
      }

      while ('*' == c) {
         i--;
         c = _input.LA(i);
      }
      
      while (' ' == c) {
         i--;
         c = _input.LA(i);
      }

      return '\n' == c || '\r' == c;
   }
}

javadoc
	: JavadocStart text? JavadocEnd EOF
	;
	
text
	: (STAR | CHAR | WS | NL)+
	;
	
JavadocStart
	: '/**' STAR* WS* 
	;
	
JavadocEnd
	:  STAR* '*/'
	;
	
CHAR
	: 'a'..'z'
	| 'A'..'Z'
	;

STARS
	: WS* {!isJavadocEnd()}? STAR+ WS* {isJavadocLinePrefix()}? -> channel(2) //DOCFRAME
	;

STAR
	: '*'
	;

NL
	: ('\r\n'
	| '\n'
	| '\r') -> channel(HIDDEN)
	;
	
WS
	: [ \t\u000C]+ -> channel(HIDDEN)
	;
