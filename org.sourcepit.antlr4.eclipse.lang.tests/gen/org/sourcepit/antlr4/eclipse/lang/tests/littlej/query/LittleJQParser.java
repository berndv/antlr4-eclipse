// Generated from LittleJQ.g4 by ANTLR 4.5

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

package org.sourcepit.antlr4.eclipse.lang.tests.littlej.query;

import java.util.List;

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
public class LittleJQParser extends Parser {
   static {
      RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, StringLiteral = 6, ID = 7, WS = 8;
   public static final int RULE_query = 0, RULE_querySegment = 1, RULE_segmentName = 2, RULE_segmentQuery = 3,
      RULE_segmentQueryType = 4, RULE_segmentQueryExpression = 5;
   public static final String[] ruleNames = { "query", "querySegment", "segmentName", "segmentQuery",
      "segmentQueryType", "segmentQueryExpression" };

   private static final String[] _LITERAL_NAMES = { null, "'/'", "'['", "'@'", "'='", "']'" };
   private static final String[] _SYMBOLIC_NAMES = { null, null, null, null, null, null, "StringLiteral", "ID", "WS" };
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
      return "LittleJQ.g4";
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

   public LittleJQParser(TokenStream input) {
      super(input);
      _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   public static class QueryContext extends ParserRuleContext {
      public TerminalNode EOF() {
         return getToken(LittleJQParser.EOF, 0);
      }

      public List<QuerySegmentContext> querySegment() {
         return getRuleContexts(QuerySegmentContext.class);
      }

      public QuerySegmentContext querySegment(int i) {
         return getRuleContext(QuerySegmentContext.class, i);
      }

      public QueryContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_query;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJQListener)
            ((LittleJQListener) listener).enterQuery(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJQListener)
            ((LittleJQListener) listener).exitQuery(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJQVisitor)
            return ((LittleJQVisitor<? extends T>) visitor).visitQuery(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final QueryContext query() throws RecognitionException {
      QueryContext _localctx = new QueryContext(_ctx, getState());
      enterRule(_localctx, 0, RULE_query);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(15);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__0) {
               {
                  {
                     setState(12);
                     querySegment();
                  }
               }
               setState(17);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(18);
            match(EOF);
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

   public static class QuerySegmentContext extends ParserRuleContext {
      public SegmentNameContext segmentName() {
         return getRuleContext(SegmentNameContext.class, 0);
      }

      public SegmentQueryContext segmentQuery() {
         return getRuleContext(SegmentQueryContext.class, 0);
      }

      public QuerySegmentContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_querySegment;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJQListener)
            ((LittleJQListener) listener).enterQuerySegment(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJQListener)
            ((LittleJQListener) listener).exitQuerySegment(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJQVisitor)
            return ((LittleJQVisitor<? extends T>) visitor).visitQuerySegment(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final QuerySegmentContext querySegment() throws RecognitionException {
      QuerySegmentContext _localctx = new QuerySegmentContext(_ctx, getState());
      enterRule(_localctx, 2, RULE_querySegment);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(20);
            match(T__0);
            setState(21);
            segmentName();
            setState(23);
            _la = _input.LA(1);
            if (_la == T__1) {
               {
                  setState(22);
                  segmentQuery();
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

   public static class SegmentNameContext extends ParserRuleContext {
      public TerminalNode ID() {
         return getToken(LittleJQParser.ID, 0);
      }

      public SegmentNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_segmentName;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJQListener)
            ((LittleJQListener) listener).enterSegmentName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJQListener)
            ((LittleJQListener) listener).exitSegmentName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJQVisitor)
            return ((LittleJQVisitor<? extends T>) visitor).visitSegmentName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final SegmentNameContext segmentName() throws RecognitionException {
      SegmentNameContext _localctx = new SegmentNameContext(_ctx, getState());
      enterRule(_localctx, 4, RULE_segmentName);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(25);
            match(ID);
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

   public static class SegmentQueryContext extends ParserRuleContext {
      public SegmentQueryTypeContext segmentQueryType() {
         return getRuleContext(SegmentQueryTypeContext.class, 0);
      }

      public SegmentQueryExpressionContext segmentQueryExpression() {
         return getRuleContext(SegmentQueryExpressionContext.class, 0);
      }

      public SegmentQueryContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_segmentQuery;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJQListener)
            ((LittleJQListener) listener).enterSegmentQuery(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJQListener)
            ((LittleJQListener) listener).exitSegmentQuery(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJQVisitor)
            return ((LittleJQVisitor<? extends T>) visitor).visitSegmentQuery(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final SegmentQueryContext segmentQuery() throws RecognitionException {
      SegmentQueryContext _localctx = new SegmentQueryContext(_ctx, getState());
      enterRule(_localctx, 6, RULE_segmentQuery);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(27);
            match(T__1);
            setState(28);
            match(T__2);
            setState(29);
            segmentQueryType();
            setState(30);
            match(T__3);
            setState(31);
            segmentQueryExpression();
            setState(32);
            match(T__4);
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

   public static class SegmentQueryTypeContext extends ParserRuleContext {
      public TerminalNode ID() {
         return getToken(LittleJQParser.ID, 0);
      }

      public SegmentQueryTypeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_segmentQueryType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJQListener)
            ((LittleJQListener) listener).enterSegmentQueryType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJQListener)
            ((LittleJQListener) listener).exitSegmentQueryType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJQVisitor)
            return ((LittleJQVisitor<? extends T>) visitor).visitSegmentQueryType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final SegmentQueryTypeContext segmentQueryType() throws RecognitionException {
      SegmentQueryTypeContext _localctx = new SegmentQueryTypeContext(_ctx, getState());
      enterRule(_localctx, 8, RULE_segmentQueryType);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(34);
            match(ID);
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

   public static class SegmentQueryExpressionContext extends ParserRuleContext {
      public TerminalNode StringLiteral() {
         return getToken(LittleJQParser.StringLiteral, 0);
      }

      public SegmentQueryExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_segmentQueryExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJQListener)
            ((LittleJQListener) listener).enterSegmentQueryExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJQListener)
            ((LittleJQListener) listener).exitSegmentQueryExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJQVisitor)
            return ((LittleJQVisitor<? extends T>) visitor).visitSegmentQueryExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final SegmentQueryExpressionContext segmentQueryExpression() throws RecognitionException {
      SegmentQueryExpressionContext _localctx = new SegmentQueryExpressionContext(_ctx, getState());
      enterRule(_localctx, 10, RULE_segmentQueryExpression);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(36);
            match(StringLiteral);
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

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n)\4\2\t\2\4\3\t"
      + "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"
      + "\3\2\3\3\3\3\3\3\5\3\32\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"
      + "\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2$\2\21\3\2\2\2\4\26\3\2\2\2\6\33\3"
      + "\2\2\2\b\35\3\2\2\2\n$\3\2\2\2\f&\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2"
      + "\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\21\3\2\2\2"
      + "\24\25\7\2\2\3\25\3\3\2\2\2\26\27\7\3\2\2\27\31\5\6\4\2\30\32\5\b\5\2"
      + "\31\30\3\2\2\2\31\32\3\2\2\2\32\5\3\2\2\2\33\34\7\t\2\2\34\7\3\2\2\2\35"
      + "\36\7\4\2\2\36\37\7\5\2\2\37 \5\n\6\2 !\7\6\2\2!\"\5\f\7\2\"#\7\7\2\2"
      + "#\t\3\2\2\2$%\7\t\2\2%\13\3\2\2\2&\'\7\b\2\2\'\r\3\2\2\2\4\21\31";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}