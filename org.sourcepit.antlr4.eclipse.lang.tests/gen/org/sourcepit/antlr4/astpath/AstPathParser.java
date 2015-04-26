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
   public static final int T__0 = 1, T__1 = 2, T__2 = 3, ID = 4, IndexNumeral = 5, WS = 6;
   public static final int RULE_query = 0, RULE_segment = 1, RULE_index = 2, RULE_name = 3;
   public static final String[] ruleNames = { "query", "segment", "index", "name" };

   private static final String[] _LITERAL_NAMES = { null, "'/'", "'['", "']'" };
   private static final String[] _SYMBOLIC_NAMES = { null, null, null, null, "ID", "IndexNumeral", "WS" };
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
      public SegmentContext segment() {
         return getRuleContext(SegmentContext.class, 0);
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
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(8);
            match(T__0);
            setState(9);
            segment();
            setState(10);
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
      public NameContext name() {
         return getRuleContext(NameContext.class, 0);
      }

      public IndexContext index() {
         return getRuleContext(IndexContext.class, 0);
      }

      public List<SegmentContext> segment() {
         return getRuleContexts(SegmentContext.class);
      }

      public SegmentContext segment(int i) {
         return getRuleContext(SegmentContext.class, i);
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
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(12);
            name();
            setState(14);
            _la = _input.LA(1);
            if (_la == T__1) {
               {
                  setState(13);
                  index();
               }
            }

            setState(20);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(16);
                        match(T__0);
                        setState(17);
                        segment();
                     }
                  }
               }
               setState(22);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
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

   public static class IndexContext extends ParserRuleContext {
      public TerminalNode IndexNumeral() {
         return getToken(AstPathParser.IndexNumeral, 0);
      }

      public IndexContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_index;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof AstPathListener)
            ((AstPathListener) listener).enterIndex(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof AstPathListener)
            ((AstPathListener) listener).exitIndex(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof AstPathVisitor)
            return ((AstPathVisitor<? extends T>) visitor).visitIndex(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final IndexContext index() throws RecognitionException {
      IndexContext _localctx = new IndexContext(_ctx, getState());
      enterRule(_localctx, 4, RULE_index);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(23);
            match(T__1);
            setState(24);
            match(IndexNumeral);
            setState(25);
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

   public static class NameContext extends ParserRuleContext {
      public TerminalNode ID() {
         return getToken(AstPathParser.ID, 0);
      }

      public NameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_name;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof AstPathListener)
            ((AstPathListener) listener).enterName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof AstPathListener)
            ((AstPathListener) listener).exitName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof AstPathVisitor)
            return ((AstPathVisitor<? extends T>) visitor).visitName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final NameContext name() throws RecognitionException {
      NameContext _localctx = new NameContext(_ctx, getState());
      enterRule(_localctx, 6, RULE_name);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(27);
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

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\b \4\2\t\2\4\3\t"
      + "\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\3\3\3\5\3\21\n\3\3\3\3\3\7\3\25\n"
      + "\3\f\3\16\3\30\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\35\2"
      + "\n\3\2\2\2\4\16\3\2\2\2\6\31\3\2\2\2\b\35\3\2\2\2\n\13\7\3\2\2\13\f\5"
      + "\4\3\2\f\r\7\2\2\3\r\3\3\2\2\2\16\20\5\b\5\2\17\21\5\6\4\2\20\17\3\2\2"
      + "\2\20\21\3\2\2\2\21\26\3\2\2\2\22\23\7\3\2\2\23\25\5\4\3\2\24\22\3\2\2"
      + "\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\5\3\2\2\2\30\26\3\2\2"
      + "\2\31\32\7\4\2\2\32\33\7\7\2\2\33\34\7\5\2\2\34\7\3\2\2\2\35\36\7\6\2" + "\2\36\t\3\2\2\2\4\20\26";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}