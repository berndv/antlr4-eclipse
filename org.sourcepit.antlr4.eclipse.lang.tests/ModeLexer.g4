lexer grammar ModeLexer;

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
	
package org.sourcepit.antlr4.eclipse.lang.tests.jd;
}

options {
    superClass=org.sourcepit.antlr4.eclipse.lang.tests.jd.AbstractJavadocLexer;
}

JavadocStart
	: '/**' '*'* Ws* -> pushMode(JAVADOC)
	;
	
Id
	: NameStartChar NameChar*
	;

fragment NameChar
	: NameStartChar
	| '0'..'9'
	| '_'
	| '\u00B7'
	| '\u0300'..'\u036F'
	| '\u203F'..'\u2040'
	;

fragment NameStartChar
	: 'A'..'Z'
	| 'a'..'z'
	| '\u00C0'..'\u00D6'
	| '\u00D8'..'\u00F6'
	| '\u00F8'..'\u02FF'
	| '\u0370'..'\u037D'
	| '\u037F'..'\u1FFF'
	| '\u200C'..'\u200D'
	| '\u2070'..'\u218F'
	| '\u2C00'..'\u2FEF'
	| '\u3001'..'\uD7FF'
	| '\uF900'..'\uFDCF'
	| '\uFDF0'..'\uFFFD'
	; // ignores | ['\u10000-'\uEFFFF] ;

Nl	: ('\r\n' | '\n' | '\r') -> channel(HIDDEN)
	;
	
Ws	: [ \t\u000C]+ -> channel(HIDDEN)
	;

mode JAVADOC;

JavadocLinePrefix
	: {isNl()}? JavadocWs* '*'+ JavadocWs* {isNotBreakJavadocEnd()}? -> channel(/*JAVA_DOC_LINE_PREFIX*/ 2)
	;
	
JavadocEnd
	: JavadocWs* '*'* '*/'  -> popMode
	;

JavadocBlockTag
	: {allowBlockTag}? '@' Id
	;
	
JavadocNl	: ('\r\n' | '\n' | '\r') -> channel(HIDDEN)
	;
	
JavadocWs	: [ \t\u000C]+ -> channel(HIDDEN)
	;

JavadocChar
	: .
	;