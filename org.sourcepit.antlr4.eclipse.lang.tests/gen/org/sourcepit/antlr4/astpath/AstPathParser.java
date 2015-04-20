// Generated from AstPath.g4 by ANTLR 4.5

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

package org.sourcepit.antlr4.astpath;

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
public class AstPathParser extends Parser {
   static {
      RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, ValueLiteral = 8,
      ID = 9, IndexNumeral = 10, WS = 11;
   public static final int RULE_query = 0, RULE_segment = 1, RULE_indexQuery = 2, RULE_segmentName = 3,
      RULE_terminalQuery = 4, RULE_tokenExpression = 5, RULE_tokenAttribute = 6;
   public static final String[] ruleNames = { "query", "segment", "indexQuery", "segmentName", "terminalQuery",
      "tokenExpression", "tokenAttribute" };

   private static final String[] _LITERAL_NAMES = { null, "'/'", "'['", "']'", "'@'", "'='", "'text'", "'type'" };
   private static final String[] _SYMBOLIC_NAMES = { null, null, null, null, null, null, null, null, "ValueLiteral",
      "ID", "IndexNumeral", "WS" };
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
      return "AstPath.g4";
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

   public AstPathParser(TokenStream input) {
      super(input);
      _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   public static class QueryContext extends ParserRuleContext {
      public List<SegmentContext> segment() {
         return getRuleContexts(SegmentContext.class);
      }

      public SegmentContext segment(int i) {
         return getRuleContext(SegmentContext.class, i);
      }

      public TerminalNode EOF() {
         return getToken(AstPathParser.EOF, 0);
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
         if (listener instanceof AstPathListener)
            ((AstPathListener) listener).enterQuery(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof AstPathListener)
            ((AstPathListener) listener).exitQuery(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof AstPathVisitor)
            return ((AstPathVisitor<? extends T>) visitor).visitQuery(this);
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
            setState(14);
            match(T__0);
            setState(15);
            segment();
            setState(20);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__0) {
               {
                  {
                     setState(16);
                     match(T__0);
                     setState(17);
                     segment();
                  }
               }
               setState(22);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(23);
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

   public static class SegmentContext extends ParserRuleContext {
      public SegmentNameContext segmentName() {
         return getRuleContext(SegmentNameContext.class, 0);
      }

      public IndexQueryContext indexQuery() {
         return getRuleContext(IndexQueryContext.class, 0);
      }

      public TerminalQueryContext terminalQuery() {
         return getRuleContext(TerminalQueryContext.class, 0);
      }

      public SegmentContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_segment;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof AstPathListener)
            ((AstPathListener) listener).enterSegment(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof AstPathListener)
            ((AstPathListener) listener).exitSegment(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof AstPathVisitor)
            return ((AstPathVisitor<? extends T>) visitor).visitSegment(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final SegmentContext segment() throws RecognitionException {
      SegmentContext _localctx = new SegmentContext(_ctx, getState());
      enterRule(_localctx, 2, RULE_segment);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(25);
            segmentName();
            setState(27);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
               case 1 : {
                  setState(26);
                  indexQuery();
               }
                  break;
            }
            setState(30);
            _la = _input.LA(1);
            if (_la == T__1) {
               {
                  setState(29);
                  terminalQuery();
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

   public static class IndexQueryContext extends ParserRuleContext {
      public TerminalNode IndexNumeral() {
         return getToken(AstPathParser.IndexNumeral, 0);
      }

      public IndexQueryContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_indexQuery;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof AstPathListener)
            ((AstPathListener) listener).enterIndexQuery(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof AstPathListener)
            ((AstPathListener) listener).exitIndexQuery(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof AstPathVisitor)
            return ((AstPathVisitor<? extends T>) visitor).visitIndexQuery(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final IndexQueryContext indexQuery() throws RecognitionException {
      IndexQueryContext _localctx = new IndexQueryContext(_ctx, getState());
      enterRule(_localctx, 4, RULE_indexQuery);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(32);
            match(T__1);
            setState(33);
            match(IndexNumeral);
            setState(34);
            match(T__2);
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
         return getToken(AstPathParser.ID, 0);
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
         if (listener instanceof AstPathListener)
            ((AstPathListener) listener).enterSegmentName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof AstPathListener)
            ((AstPathListener) listener).exitSegmentName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof AstPathVisitor)
            return ((AstPathVisitor<? extends T>) visitor).visitSegmentName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final SegmentNameContext segmentName() throws RecognitionException {
      SegmentNameContext _localctx = new SegmentNameContext(_ctx, getState());
      enterRule(_localctx, 6, RULE_segmentName);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(36);
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

   public static class TerminalQueryContext extends ParserRuleContext {
      public TokenExpressionContext tokenExpression() {
         return getRuleContext(TokenExpressionContext.class, 0);
      }

      public TerminalQueryContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_terminalQuery;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof AstPathListener)
            ((AstPathListener) listener).enterTerminalQuery(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof AstPathListener)
            ((AstPathListener) listener).exitTerminalQuery(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof AstPathVisitor)
            return ((AstPathVisitor<? extends T>) visitor).visitTerminalQuery(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TerminalQueryContext terminalQuery() throws RecognitionException {
      TerminalQueryContext _localctx = new TerminalQueryContext(_ctx, getState());
      enterRule(_localctx, 8, RULE_terminalQuery);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(38);
            match(T__1);
            setState(39);
            tokenExpression();
            setState(40);
            match(T__2);
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

   public static class TokenExpressionContext extends ParserRuleContext {
      public TokenAttributeContext tokenAttribute() {
         return getRuleContext(TokenAttributeContext.class, 0);
      }

      public TerminalNode ValueLiteral() {
         return getToken(AstPathParser.ValueLiteral, 0);
      }

      public TokenExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_tokenExpression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof AstPathListener)
            ((AstPathListener) listener).enterTokenExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof AstPathListener)
            ((AstPathListener) listener).exitTokenExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof AstPathVisitor)
            return ((AstPathVisitor<? extends T>) visitor).visitTokenExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TokenExpressionContext tokenExpression() throws RecognitionException {
      TokenExpressionContext _localctx = new TokenExpressionContext(_ctx, getState());
      enterRule(_localctx, 10, RULE_tokenExpression);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(42);
            match(T__3);
            setState(43);
            tokenAttribute();
            setState(44);
            match(T__4);
            setState(45);
            match(ValueLiteral);
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

   public static class TokenAttributeContext extends ParserRuleContext {
      public TokenAttributeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_tokenAttribute;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof AstPathListener)
            ((AstPathListener) listener).enterTokenAttribute(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof AstPathListener)
            ((AstPathListener) listener).exitTokenAttribute(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof AstPathVisitor)
            return ((AstPathVisitor<? extends T>) visitor).visitTokenAttribute(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TokenAttributeContext tokenAttribute() throws RecognitionException {
      TokenAttributeContext _localctx = new TokenAttributeContext(_ctx, getState());
      enterRule(_localctx, 12, RULE_tokenAttribute);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(47);
            _la = _input.LA(1);
            if (!(_la == T__5 || _la == T__6)) {
               _errHandler.recoverInline(this);
            }
            else {
               consume();
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

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r\64\4\2\t\2\4\3"
      + "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\7\2\25\n"
      + "\2\f\2\16\2\30\13\2\3\2\3\2\3\3\3\3\5\3\36\n\3\3\3\5\3!\n\3\3\4\3\4\3"
      + "\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\2\2\t\2"
      + "\4\6\b\n\f\16\2\3\3\2\b\t/\2\20\3\2\2\2\4\33\3\2\2\2\6\"\3\2\2\2\b&\3"
      + "\2\2\2\n(\3\2\2\2\f,\3\2\2\2\16\61\3\2\2\2\20\21\7\3\2\2\21\26\5\4\3\2"
      + "\22\23\7\3\2\2\23\25\5\4\3\2\24\22\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2"
      + "\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32\7\2\2\3\32\3\3\2\2\2"
      + "\33\35\5\b\5\2\34\36\5\6\4\2\35\34\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37"
      + "!\5\n\6\2 \37\3\2\2\2 !\3\2\2\2!\5\3\2\2\2\"#\7\4\2\2#$\7\f\2\2$%\7\5"
      + "\2\2%\7\3\2\2\2&\'\7\13\2\2\'\t\3\2\2\2()\7\4\2\2)*\5\f\7\2*+\7\5\2\2"
      + "+\13\3\2\2\2,-\7\6\2\2-.\5\16\b\2./\7\7\2\2/\60\7\n\2\2\60\r\3\2\2\2\61"
      + "\62\t\2\2\2\62\17\3\2\2\2\5\26\35 ";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}