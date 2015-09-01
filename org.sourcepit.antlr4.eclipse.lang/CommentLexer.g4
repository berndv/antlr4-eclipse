lexer grammar CommentLexer;

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
	
package org.sourcepit.antlr4.eclipse.lang;
}

options {
    superClass=org.sourcepit.antlr4.eclipse.lang.AbstractCommentLexer;
}

DocCommentStart
	: '/**' '*'* Ws* -> pushMode(BLOCK_COMMENT)
	;

BlockCommentStart
	: '/*' Ws* -> pushMode(BLOCK_COMMENT)
	;

LineCommentStart
    : '//' Ws* -> pushMode(LINE_COMMENT)
    ;

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

fragment
CommonText
    : .+? // Note: Will be tokenized into single chars, but we'll aggregate them to a single token in our abstract lexer
    ;

CommentText
    : CommonText
    ;


mode BLOCK_COMMENT;

BlockCommentLinePrefix
	: {isChar(LA(-1), '\n', '\r')}? BlockCommentWs* '*'+ {isNotChar(LA(1), '/')}? BlockCommentWs*  -> channel(/*BLOCK_COMMENT_LINE_PREFIX*/ 2)
	;
	
BlockCommentEnd
	: BlockCommentWs* '*'* '*/'  -> popMode
	;

BlockCommentNl
    : CommonNl -> type(Nl), channel(HIDDEN)
	;
	
BlockCommentWs
    : CommonWs -> type(Ws), channel(HIDDEN)
	;

BlockCommentText
    : CommonText -> type(CommentText)
    ;

mode LINE_COMMENT;

LineCommentNl
    : CommonNl -> type(Nl), channel(HIDDEN), popMode
	;
	
LineCommentWs
    : CommonWs -> type(Ws), channel(HIDDEN)
	;

LineCommentText
    : CommonText -> type(CommentText)
    ;
