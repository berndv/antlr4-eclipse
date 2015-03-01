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

package org.sourcepit.antlr4.eclipse.ui;

import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.ACTION;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.ARG_ACTION;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.ASSIGN;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.AT;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.BEGIN_ARG_ACTION;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.BLOCK_COMMENT;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.CATCH;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.COLON;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.COLONCOLON;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.COMMA;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.DOC_COMMENT;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.DOLLAR;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.DOT;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.ERRCHAR;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.FINALLY;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.FRAGMENT;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.GRAMMAR;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.GT;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.ID;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.IMPORT;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.INT;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.LEXER;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.LEXER_CHAR_SET;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.LINE_COMMENT;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.LOCALS;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.LPAREN;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.LT;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.MODE;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.NOT;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.OPTIONS;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.OR;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.PARSER;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.PLUS;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.PLUS_ASSIGN;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.POUND;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.PRIVATE;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.PROTECTED;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.PUBLIC;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.QUESTION;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.RANGE;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.RARROW;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.RBRACE;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.RETURNS;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.RPAREN;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.RULE_REF;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.SEMI;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.STAR;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.STRING_LITERAL;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.THROWS;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.TOKENS;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.TOKEN_REF;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.UNTERMINATED_ARG_ACTION;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.UNTERMINATED_CHAR_SET;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.UNTERMINATED_STRING_LITERAL;
import static org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer.WS;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.graphics.RGB;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class AntlrTokenScanner implements ITokenScanner {
   private DocumentRangeReader reader;

   private ANTLRv4Lexer lexer;

   private final ColorManager colorManager;

   private org.antlr.v4.runtime.Token token;

   public AntlrTokenScanner(org.sourcepit.antlr4.eclipse.ui.ColorManager colorManager) {
      this.colorManager = colorManager;
   }

   private int offset;

   @Override
   public void setRange(final IDocument document, int offset, int length) {
      this.offset = offset;
      reader = new DocumentRangeReader(document, offset, length);
      final ANTLRInputStream input;
      try {
         input = new ANTLRInputStream(reader);
      }
      catch (IOException e) {
         throw new IllegalStateException(e);
      }
      lexer = new ANTLRv4Lexer(input);
   }


   // CSOFF
   @Override
   // CSON
   public IToken nextToken() {
      // fTokenOffset = reader.getOffset();

      token = lexer.nextToken();

      switch (token.getType()) {
         case org.antlr.v4.runtime.Token.EOF :
            return Token.EOF;
            // Identifiers
         case TOKEN_REF :
         case RULE_REF :
         case ID :
            return new Token(new TextAttribute(colorManager.getColor(new RGB(128, 0, 0))));
            // Comments
         case DOC_COMMENT :
         case BLOCK_COMMENT :
         case LINE_COMMENT :
            return new Token(new TextAttribute(colorManager.getColor(new RGB(128, 128, 128))));
            // keywords
         case OPTIONS :
         case TOKENS :

         case IMPORT :
         case FRAGMENT :
         case LEXER :
         case PARSER :
         case GRAMMAR :
         case PROTECTED :
         case PUBLIC :
         case PRIVATE :
         case RETURNS :
         case LOCALS :
         case THROWS :
         case CATCH :
         case FINALLY :
         case MODE :
            return new Token(new TextAttribute(colorManager.getColor(new RGB(0, 0, 128))));
            // operators
         case COLON :
         case COLONCOLON :
         case COMMA :
         case SEMI :
         case LPAREN :
         case RPAREN :
         case RARROW :
         case LT :
         case GT :
         case ASSIGN :
         case QUESTION :
         case STAR :
         case PLUS :
         case PLUS_ASSIGN :
         case OR :
         case DOLLAR :
         case DOT :
         case RANGE :
         case AT :
         case POUND :
         case NOT :
         case RBRACE :
            return new Token(new TextAttribute(colorManager.getColor(new RGB(0, 0, 0))));
            // String
         case STRING_LITERAL :
         case UNTERMINATED_STRING_LITERAL :

         case INT :
            return new Token(new TextAttribute(colorManager.getColor(new RGB(0, 128, 0))));
            // Whitespace
         case WS :
            return Token.WHITESPACE;
         case ACTION :
            return new Token(new TextAttribute(colorManager.getColor(new RGB(128, 0, 0))));
            // ???
         case BEGIN_ARG_ACTION :
         case LEXER_CHAR_SET :
         case ARG_ACTION :
         case UNTERMINATED_ARG_ACTION :
         case UNTERMINATED_CHAR_SET :
         case ERRCHAR :
            return new Token(new TextAttribute(colorManager.getColor(new RGB(0, 0, 0))));
         default :
            throw new IllegalStateException();
      }
   }

   @Override
   public int getTokenOffset() {
      return offset + token.getStartIndex();
   }

   @Override
   public int getTokenLength() {
      return token.getText().length();
   }


}
