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

fragment
CommonNl
    : ('\r\n' | '\n' | '\r')
	;

fragment
CommonWs
    : [ \t\f]+
	;

Nl	: CommonNl -> channel(HIDDEN)
	;
	
Ws	: CommonWs -> channel(HIDDEN)
	;

mode JAVADOC;

fragment
CommonJavadocLinePrefix
	: {isChar(LA(-1), '\n', '\r')}? JavadocWs* '*'+ {isNotChar(LA(1), '/')}? JavadocWs*
	;

JavadocLinePrefix
	: CommonJavadocLinePrefix -> channel(/*JAVA_DOC_LINE_PREFIX*/ 2)
	;
	
JavadocEnd
	: JavadocWs* '*'* '*/'  -> popMode
	;

JavadocInlineTagOpen
	: '{@' Id -> pushMode(JAVADOC_INLINE_TAG)
	;

JavadocBlockTag
	: {allowBlockTag}? '@' Id
	;
	
JavadocNl
    : CommonNl -> type(Nl), channel(HIDDEN)
	;
	
JavadocWs
    : CommonWs -> type(Ws), channel(HIDDEN)
	;

TagSlashOpen
    : '</' {isTagStart(LA(1))}? -> pushMode(TAG)
    ;

TagOpen
    : '<' {isTagStart(LA(1))}? ->  pushMode(TAG)
    ;

JavadocText
    : .+? // Note: Will be tokenized into single chars, but we'll aggregate them to a single token in our abstract lexer
    ;

mode JAVADOC_INLINE_TAG;

JavadocInlineTagClose
    : '}' -> popMode
    ;

JavadocInlineTagPrefix
	: CommonJavadocLinePrefix -> type(JavadocLinePrefix), channel(/*JAVA_DOC_LINE_PREFIX*/ 2)
	;

JavadocInlineTagNl
    : CommonNl -> type(Nl), channel(HIDDEN)
	;
	
JavadocInlineTagWs
    : CommonWs -> type(Ws), channel(HIDDEN)
	;

JavadocInlineTagText
	: ~[ \r\n\t\f}]+
	;

mode TAG;

TagSlashClose     
    : '/>' -> popMode
    ;

TagClose      
    : '>' -> popMode
    ;
    
TagJavadocLinePrefix
	: CommonJavadocLinePrefix -> type(JavadocLinePrefix), channel(/*JAVA_DOC_LINE_PREFIX*/ 2)
	;

TagEquals     
    : '=' -> pushMode(ATTVALUE)
    ;

TagNl
    : CommonNl -> type(Nl), channel(HIDDEN)
	;
	
TagWs
    : CommonWs -> type(Ws), channel(HIDDEN)
	;

fragment
TagNameChar
	: 'A'..'Z'
	| 'a'..'z'
	| '0'..'9'
	| '-'
	| '_'
	| ':'
	| '.'
    ;

fragment
TagNameStartChar
	: 'A'..'Z'
	| 'a'..'z'
	;

TagName      
    : TagNameStartChar TagNameChar*
    ;

mode ATTVALUE;

AttributeJavadocLinePrefix
	: CommonJavadocLinePrefix -> type(JavadocLinePrefix), channel(/*JAVA_DOC_LINE_PREFIX*/ 2)
	;

fragment
AttributeChar
    : '-'
    | '_'
    | '.'
    | '/'
    | '+'
    | ','
    | '?'
    | '='
    | ':'
    | ';'
    | '#'
    | [0-9a-zA-Z]
    ;

AttributeChars
    : AttributeChar+ -> popMode
    ;

AttributeHexChars
    : '#' [0-9a-fA-F]+ -> popMode
    ;

AttributeDecChars
    : [0-9]+ '%'? -> popMode
    ;

AttributeDoubleQuoteString
    : '"' .*? '"' -> popMode
    ;
AttributeSingleQuoteString
    : '\'' .*? '\'' -> popMode
    ;

AttributeNl
    : CommonNl -> type(Nl), channel(HIDDEN)
	;
	
AttributeWs
    : CommonWs -> type(Ws), channel(HIDDEN)
	;