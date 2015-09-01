// Generated from CommentParser.g4 by ANTLR 4.5.1

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

import java.util.List;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class CommentParser extends Parser {
   static {
      RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int DocCommentStart = 1, BlockCommentStart = 2, LineCommentStart = 3, Nl = 4, Ws = 5,
      CommentText = 6, BlockCommentLinePrefix = 7, BlockCommentEnd = 8;
   public static final int RULE_comment = 0, RULE_docComment = 1, RULE_blockComment = 2, RULE_lineComment = 3,
      RULE_commentText = 4;
   public static final String[] ruleNames = { "comment", "docComment", "blockComment", "lineComment", "commentText" };

   private static final String[] _LITERAL_NAMES = {};
   private static final String[] _SYMBOLIC_NAMES = { null, "DocCommentStart", "BlockCommentStart", "LineCommentStart",
      "Nl", "Ws", "CommentText", "BlockCommentLinePrefix", "BlockCommentEnd" };
   public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

   /**
    * @deprecated Use {@link #VOCABULARY} instead.
    */
   @Deprecated
   public static final String[] tokenNames;

   static {
      tokenNames = new String[_SYMBOLIC_NAMES.length];
      for (int i = 0; i < tokenNames.length; i++) {
         tokenNames[i] = VOCABULARY.getLiteralName(i);
         if (tokenNames[i] == null) {
            tokenNames[i] = VOCABULARY.getSymbolicName(i);
         }

         if (tokenNames[i] == null) {
            tokenNames[i] = "<INVALID>";
         }
      }
   }

   @Override
   @Deprecated
   public String[] getTokenNames() {
      return tokenNames;
   }

   @Override

   public Vocabulary getVocabulary() {
      return VOCABULARY;
   }

   @Override
   public String getGrammarFileName() {
      return "CommentParser.g4";
   }

   @Override
   public String[] getRuleNames() {
      return ruleNames;
   }

   @Override
   public String getSerializedATN() {
      return _serializedATN;
   }

   @Override
   public ATN getATN() {
      return _ATN;
   }

   public CommentParser(TokenStream input) {
      super(input);
      _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   public static class CommentContext extends ParserRuleContext {
      public DocCommentContext docComment() {
         return getRuleContext(DocCommentContext.class, 0);
      }

      public BlockCommentContext blockComment() {
         return getRuleContext(BlockCommentContext.class, 0);
      }

      public LineCommentContext lineComment() {
         return getRuleContext(LineCommentContext.class, 0);
      }

      public CommentContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_comment;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof CommentParserListener)
            ((CommentParserListener) listener).enterComment(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof CommentParserListener)
            ((CommentParserListener) listener).exitComment(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof CommentParserVisitor)
            return ((CommentParserVisitor<? extends T>) visitor).visitComment(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final CommentContext comment() throws RecognitionException {
      CommentContext _localctx = new CommentContext(_ctx, getState());
      enterRule(_localctx, 0, RULE_comment);
      try {
         setState(13);
         switch (_input.LA(1)) {
            case DocCommentStart :
               enterOuterAlt(_localctx, 1); {
               setState(10);
               docComment();
            }
               break;
            case BlockCommentStart :
               enterOuterAlt(_localctx, 2); {
               setState(11);
               blockComment();
            }
               break;
            case LineCommentStart :
               enterOuterAlt(_localctx, 3); {
               setState(12);
               lineComment();
            }
               break;
            default :
               throw new NoViableAltException(this);
         }
      }
      catch (RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      }
      finally {
         exitRule();
      }
      return _localctx;
   }

   public static class DocCommentContext extends ParserRuleContext {
      public TerminalNode DocCommentStart() {
         return getToken(CommentParser.DocCommentStart, 0);
      }

      public TerminalNode BlockCommentEnd() {
         return getToken(CommentParser.BlockCommentEnd, 0);
      }

      public CommentTextContext commentText() {
         return getRuleContext(CommentTextContext.class, 0);
      }

      public DocCommentContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_docComment;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof CommentParserListener)
            ((CommentParserListener) listener).enterDocComment(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof CommentParserListener)
            ((CommentParserListener) listener).exitDocComment(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof CommentParserVisitor)
            return ((CommentParserVisitor<? extends T>) visitor).visitDocComment(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final DocCommentContext docComment() throws RecognitionException {
      DocCommentContext _localctx = new DocCommentContext(_ctx, getState());
      enterRule(_localctx, 2, RULE_docComment);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(15);
            match(DocCommentStart);
            setState(17);
            _la = _input.LA(1);
            if (_la == CommentText) {
               {
                  setState(16);
                  commentText();
               }
            }

            setState(19);
            match(BlockCommentEnd);
         }
      }
      catch (RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      }
      finally {
         exitRule();
      }
      return _localctx;
   }

   public static class BlockCommentContext extends ParserRuleContext {
      public TerminalNode BlockCommentStart() {
         return getToken(CommentParser.BlockCommentStart, 0);
      }

      public TerminalNode BlockCommentEnd() {
         return getToken(CommentParser.BlockCommentEnd, 0);
      }

      public CommentTextContext commentText() {
         return getRuleContext(CommentTextContext.class, 0);
      }

      public BlockCommentContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_blockComment;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof CommentParserListener)
            ((CommentParserListener) listener).enterBlockComment(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof CommentParserListener)
            ((CommentParserListener) listener).exitBlockComment(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof CommentParserVisitor)
            return ((CommentParserVisitor<? extends T>) visitor).visitBlockComment(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final BlockCommentContext blockComment() throws RecognitionException {
      BlockCommentContext _localctx = new BlockCommentContext(_ctx, getState());
      enterRule(_localctx, 4, RULE_blockComment);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(21);
            match(BlockCommentStart);
            setState(23);
            _la = _input.LA(1);
            if (_la == CommentText) {
               {
                  setState(22);
                  commentText();
               }
            }

            setState(25);
            match(BlockCommentEnd);
         }
      }
      catch (RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      }
      finally {
         exitRule();
      }
      return _localctx;
   }

   public static class LineCommentContext extends ParserRuleContext {
      public TerminalNode LineCommentStart() {
         return getToken(CommentParser.LineCommentStart, 0);
      }

      public CommentTextContext commentText() {
         return getRuleContext(CommentTextContext.class, 0);
      }

      public LineCommentContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_lineComment;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof CommentParserListener)
            ((CommentParserListener) listener).enterLineComment(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof CommentParserListener)
            ((CommentParserListener) listener).exitLineComment(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof CommentParserVisitor)
            return ((CommentParserVisitor<? extends T>) visitor).visitLineComment(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LineCommentContext lineComment() throws RecognitionException {
      LineCommentContext _localctx = new LineCommentContext(_ctx, getState());
      enterRule(_localctx, 6, RULE_lineComment);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(27);
            match(LineCommentStart);
            setState(29);
            _la = _input.LA(1);
            if (_la == CommentText) {
               {
                  setState(28);
                  commentText();
               }
            }

         }
      }
      catch (RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      }
      finally {
         exitRule();
      }
      return _localctx;
   }

   public static class CommentTextContext extends ParserRuleContext {
      public List<TerminalNode> CommentText() {
         return getTokens(CommentParser.CommentText);
      }

      public TerminalNode CommentText(int i) {
         return getToken(CommentParser.CommentText, i);
      }

      public CommentTextContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_commentText;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof CommentParserListener)
            ((CommentParserListener) listener).enterCommentText(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof CommentParserListener)
            ((CommentParserListener) listener).exitCommentText(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof CommentParserVisitor)
            return ((CommentParserVisitor<? extends T>) visitor).visitCommentText(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final CommentTextContext commentText() throws RecognitionException {
      CommentTextContext _localctx = new CommentTextContext(_ctx, getState());
      enterRule(_localctx, 8, RULE_commentText);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(32);
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
               {
                  {
                     setState(31);
                     match(CommentText);
                  }
               }
               setState(34);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            while (_la == CommentText);
         }
      }
      catch (RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      }
      finally {
         exitRule();
      }
      return _localctx;
   }

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n\'\4\2\t\2\4\3\t"
      + "\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\5\2\20\n\2\3\3\3\3\5\3\24\n\3\3"
      + "\3\3\3\3\4\3\4\5\4\32\n\4\3\4\3\4\3\5\3\5\5\5 \n\5\3\6\6\6#\n\6\r\6\16"
      + "\6$\3\6\2\2\7\2\4\6\b\n\2\2\'\2\17\3\2\2\2\4\21\3\2\2\2\6\27\3\2\2\2\b"
      + "\35\3\2\2\2\n\"\3\2\2\2\f\20\5\4\3\2\r\20\5\6\4\2\16\20\5\b\5\2\17\f\3"
      + "\2\2\2\17\r\3\2\2\2\17\16\3\2\2\2\20\3\3\2\2\2\21\23\7\3\2\2\22\24\5\n"
      + "\6\2\23\22\3\2\2\2\23\24\3\2\2\2\24\25\3\2\2\2\25\26\7\n\2\2\26\5\3\2"
      + "\2\2\27\31\7\4\2\2\30\32\5\n\6\2\31\30\3\2\2\2\31\32\3\2\2\2\32\33\3\2"
      + "\2\2\33\34\7\n\2\2\34\7\3\2\2\2\35\37\7\5\2\2\36 \5\n\6\2\37\36\3\2\2"
      + "\2\37 \3\2\2\2 \t\3\2\2\2!#\7\b\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%" + "\3\2\2\2%\13\3\2\2\2\7\17\23\31\37$";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}