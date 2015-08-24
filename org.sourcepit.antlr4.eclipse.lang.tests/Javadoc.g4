grammar Javadoc;

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
	
package org.sourcepit.antlr4.eclipse.lang.tests.javadoc;
}

javadoc
	: javadocStart javadocBody? javadocEnd
	;
	
javadocBody
	: mainDescription[true]
	| tagSection[true]
	| mainDescription[false] tagSection[false]
	;
	
singleLineDescription
	: text[true]
	;
	
singleLineTag
	: AT tagName? WS* text[true]
	;
	
javadocStart
	: '/**' STAR* WS*
	;
	
javadocEnd
	: NL? WS* STAR* '*/'
	;
	
mainDescription[boolean _lastLine]
	: {$_lastLine}? firstLine line* lastLine?
	| {!$_lastLine}? firstLine line*
	;
	
firstLine
	: text[true] NL?
	| NL
	;

line
	: prefix text[true]? NL
	| text[false]? NL
	;
	
lastLine
	: prefix
	| prefix? text[false]
	;

prefix
	: WS* STAR+ WS*
	;
	
text[boolean prefixed]
	: {$prefixed}? ( (WORD | STAR) (WS | WORD | AT | STAR)* )+
	| {!$prefixed}? ( WS* WORD (WS | WORD | AT | STAR)* )+
	| {!$prefixed}? WS+
	;

tagSection[boolean _firstLine]
	: tag[_firstLine] tag[false]*
	;
	
tag[boolean _firstLine]
	: {$_firstLine}? AT tagName? WS* (firstLine line* lastLine?)?
	| {!$_firstLine}? prefix? AT tagName? WS* (firstLine line* lastLine?)?
	;
		
tagName
	: (WORD | AT | STAR)+
	;
	
AT
	: '@'
	;
	
STAR
	: '*'
	;
	
WORD
	: ~[ \r\n\t\u000C@*]+
	;
	
NL
	: '\r\n'
	| '\r'
	| '\n'
	;
	
WS
	: [ \t\u000C]+
	;