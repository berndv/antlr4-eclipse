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

   public static final int JAVA_DOC_LINE_PREFIX = 2;
   
   private boolean isOnNl() {
      int c = _input.LA(-1);
      return '\n' == c || '\r' == c;
   }
   
   private boolean isNotBreakJavadocEnd() {
      final int c = _input.LA(-1);
      if ('*' == c)
      {
         return '/' != _input.LA(1);
      }
      return true;
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
	:  WS* STAR* '*/'
	;

JavadocLinePrefix
	: {isOnNl()}? WS* STAR+ WS* {isNotBreakJavadocEnd()}? -> channel(/*JAVA_DOC_LINE_PREFIX*/ 2)
	;

CHAR
	: 'a'..'z'
	| 'A'..'Z'
	;

STAR
	: '*'
	;

NL	: ('\r\n' | '\n' | '\r') -> channel(HIDDEN)
	;
	
WS	: [ \t\u000C]+ -> channel(HIDDEN)
	;
