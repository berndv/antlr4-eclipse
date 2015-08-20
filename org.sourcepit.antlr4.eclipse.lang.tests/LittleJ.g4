grammar LittleJ;

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
	
package org.sourcepit.antlr4.eclipse.lang.tests.littlej;
}

compilationUnit
	: packageDeclaration? importDeclaration* classDeclaration EOF
	;

packageDeclaration
	: 'package' ID ( '.' ID )*
	;

importDeclaration
	: singleTypeImportDeclaration 
	| typeImportOnDemandDeclaration 
	| singleStaticImportDeclaration 
	| staticImportOnDemandDeclaration
	;
	
singleTypeImportDeclaration
	: 'import' typeName
	;

typeImportOnDemandDeclaration
	: 'import' packageOrTypeName '.' '*'
	;

singleStaticImportDeclaration
	: 'import' 'static' typeName '.' ID
	;

staticImportOnDemandDeclaration
	: 'import' 'static' typeName '.' '*'
	;
	
classDeclaration
	: 'class' ID classBody
	;
	
classBody
	: '{' classBodyDeclaration* '}'
	;
	
classBodyDeclaration
	: memberDeclaration
	| methodDeclaration
	;
	
memberDeclaration
	: typeName fieldName ';'
	;
	
methodDeclaration
	: typeName methodName methodBody
	;
	
methodBody
	: '{' methodBodyDeclaration* '}'
	;
	
methodBodyDeclaration
	: statement
	;
	
statement
	: ifStatement
	| doWhileStatement
	;
	
ifStatement
	: 'if' '(' expression ')' block
	;
	
doWhileStatement
	: 'do' block 'while' '(' expression ')'
	;
	
expression
	: ID '==' ID
	;
	
block
	: '{' '}'
	;
	
packageOrTypeName
	: qualifiedName
	;
	
typeName
	: qualifiedName
	;
	
fieldName
	: ID
	;
	
methodName
	: ID
	;
	
qualifiedName
	: ID ( '.' ID )*
	;
	
ID
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
	
WS
:
	[ \t\r\n\u000C]+ -> skip
;

COMMENT
:
	'/*' .*? '*/' -> channel(HIDDEN)
;

LINE_COMMENT
:
	'//' ~[\r\n]* -> channel(HIDDEN)
;