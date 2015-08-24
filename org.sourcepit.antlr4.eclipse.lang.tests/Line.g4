grammar Line;

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
	
package org.sourcepit.antlr4.eclipse.lang.tests.line;
}

javadoc
	: javadocStart mainDescription? javadocEnd
	;
	
javadocStart
	: '/**' STAR* WS*
	;
	
javadocEnd
	: STAR* '*/'
	;
	
mainDescription
	: line[false]* line[true]
	| line[false]+
	;

line[boolean allowMissingNl]
	: prefix text[true]? NL
	| text[false] NL
	| NL
	| {$allowMissingNl}? text[false]
	;

prefix
	: WS* STAR+ WS*
	;
	
text[boolean prefixed]
	: {$prefixed}? ( (WORD | STAR) (WS | WORD | AT | STAR)* )+
	| {!$prefixed}? ( WS* WORD (WS | WORD | AT | STAR)* )+
	| {!$prefixed}? WS+
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