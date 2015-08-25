// Generated from Javadoc2.g4 by ANTLR 4.5

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

package org.sourcepit.antlr4.eclipse.lang.tests.javadoc2;

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
public class Javadoc2Parser extends Parser {
   static {
      RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int JavadocStart = 1, JavadocEnd = 2, JavadocLinePrefix = 3, CHAR = 4, STAR = 5, NL = 6, WS = 7;
   public static final int RULE_javadoc = 0, RULE_text = 1;
   public static final String[] ruleNames = { "javadoc", "text" };

   private static final String[] _LITERAL_NAMES = { null, null, null, null, null, "'*'" };
   private static final String[] _SYMBOLIC_NAMES = { null, "JavadocStart", "JavadocEnd", "JavadocLinePrefix", "CHAR",
      "STAR", "NL", "WS" };
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
      return "Javadoc2.g4";
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

   public Javadoc2Parser(TokenStream input) {
      super(input);
      _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   public static class JavadocContext extends ParserRuleContext {
      public TerminalNode JavadocStart() {
         return getToken(Javadoc2Parser.JavadocStart, 0);
      }

      public TerminalNode JavadocEnd() {
         return getToken(Javadoc2Parser.JavadocEnd, 0);
      }

      public TerminalNode EOF() {
         return getToken(Javadoc2Parser.EOF, 0);
      }

      public TextContext text() {
         return getRuleContext(TextContext.class, 0);
      }

      public JavadocContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_javadoc;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof Javadoc2Listener)
            ((Javadoc2Listener) listener).enterJavadoc(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof Javadoc2Listener)
            ((Javadoc2Listener) listener).exitJavadoc(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof Javadoc2Visitor)
            return ((Javadoc2Visitor<? extends T>) visitor).visitJavadoc(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final JavadocContext javadoc() throws RecognitionException {
      JavadocContext _localctx = new JavadocContext(_ctx, getState());
      enterRule(_localctx, 0, RULE_javadoc);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(4);
            match(JavadocStart);
            setState(6);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0
               && ((1L << _la) & ((1L << CHAR) | (1L << STAR) | (1L << NL) | (1L << WS))) != 0)) {
               {
                  setState(5);
                  text();
               }
            }

            setState(8);
            match(JavadocEnd);
            setState(9);
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

   public static class TextContext extends ParserRuleContext {
      public List<TerminalNode> STAR() {
         return getTokens(Javadoc2Parser.STAR);
      }

      public TerminalNode STAR(int i) {
         return getToken(Javadoc2Parser.STAR, i);
      }

      public List<TerminalNode> CHAR() {
         return getTokens(Javadoc2Parser.CHAR);
      }

      public TerminalNode CHAR(int i) {
         return getToken(Javadoc2Parser.CHAR, i);
      }

      public List<TerminalNode> WS() {
         return getTokens(Javadoc2Parser.WS);
      }

      public TerminalNode WS(int i) {
         return getToken(Javadoc2Parser.WS, i);
      }

      public List<TerminalNode> NL() {
         return getTokens(Javadoc2Parser.NL);
      }

      public TerminalNode NL(int i) {
         return getToken(Javadoc2Parser.NL, i);
      }

      public TextContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_text;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof Javadoc2Listener)
            ((Javadoc2Listener) listener).enterText(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof Javadoc2Listener)
            ((Javadoc2Listener) listener).exitText(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof Javadoc2Visitor)
            return ((Javadoc2Visitor<? extends T>) visitor).visitText(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TextContext text() throws RecognitionException {
      TextContext _localctx = new TextContext(_ctx, getState());
      enterRule(_localctx, 2, RULE_text);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(12);
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
               {
                  {
                     setState(11);
                     _la = _input.LA(1);
                     if (!((((_la) & ~0x3f) == 0
                        && ((1L << _la) & ((1L << CHAR) | (1L << STAR) | (1L << NL) | (1L << WS))) != 0))) {
                        _errHandler.recoverInline(this);
                     }
                     else {
                        consume();
                     }
                  }
               }
               setState(14);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            while ((((_la) & ~0x3f) == 0
               && ((1L << _la) & ((1L << CHAR) | (1L << STAR) | (1L << NL) | (1L << WS))) != 0));
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

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t\23\4\2\t\2\4\3"
      + "\t\3\3\2\3\2\5\2\t\n\2\3\2\3\2\3\2\3\3\6\3\17\n\3\r\3\16\3\20\3\3\2\2"
      + "\4\2\4\2\3\3\2\6\t\22\2\6\3\2\2\2\4\16\3\2\2\2\6\b\7\3\2\2\7\t\5\4\3\2"
      + "\b\7\3\2\2\2\b\t\3\2\2\2\t\n\3\2\2\2\n\13\7\4\2\2\13\f\7\2\2\3\f\3\3\2"
      + "\2\2\r\17\t\2\2\2\16\r\3\2\2\2\17\20\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2" + "\2\21\5\3\2\2\2\4\b\20";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}