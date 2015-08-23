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
	: javadocStart mainDescription? tagSection? javadocEnd
	;
	
javadocStart
	: '/**' STAR* WS* NL?
	;
	
javadocEnd
	: WS* STAR* '*/'
	;
	
mainDescription
	: line+
	;

line
	: prefix? text NL?
	| prefix NL
    | WS* NL // gefällt mir nicht..
	;

prefix
	: WS* STAR+ WS*
	;
	
text
	: ( (WORD | STAR) (WS | WORD | AT | STAR)* )+
	| ( WS* WORD (WS | WORD | AT | STAR)* )+
	;

tagSection
	: tag+
	;
	
tag
	: prefix? AT tagName? WS* line*
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