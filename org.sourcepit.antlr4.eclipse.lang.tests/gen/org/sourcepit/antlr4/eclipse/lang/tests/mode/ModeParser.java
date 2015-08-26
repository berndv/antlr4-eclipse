// Generated from ModeParser.g4 by ANTLR 4.5

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

package org.sourcepit.antlr4.eclipse.lang.tests.mode;

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
public class ModeParser extends Parser {
   static {
      RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int JavaDocStart = 1, WS = 2, JavaDocEnd = 3, JWS = 4;
   public static final int RULE_javadoc = 0;
   public static final String[] ruleNames = { "javadoc" };

   private static final String[] _LITERAL_NAMES = { null, "'/**'", null, "'*/'" };
   private static final String[] _SYMBOLIC_NAMES = { null, "JavaDocStart", "WS", "JavaDocEnd", "JWS" };
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
      return "ModeParser.g4";
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

   public ModeParser(TokenStream input) {
      super(input);
      _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   public static class JavadocContext extends ParserRuleContext {
      public TerminalNode JavaDocStart() {
         return getToken(ModeParser.JavaDocStart, 0);
      }

      public TerminalNode JavaDocEnd() {
         return getToken(ModeParser.JavaDocEnd, 0);
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
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).enterJavadoc(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).exitJavadoc(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ModeParserVisitor)
            return ((ModeParserVisitor<? extends T>) visitor).visitJavadoc(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final JavadocContext javadoc() throws RecognitionException {
      JavadocContext _localctx = new JavadocContext(_ctx, getState());
      enterRule(_localctx, 0, RULE_javadoc);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(2);
            match(JavaDocStart);
            setState(6);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
            while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1 + 1) {
                  {
                     {
                        setState(3);
                        matchWildcard();
                     }
                  }
               }
               setState(8);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
            }
            setState(9);
            match(JavaDocEnd);
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

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\6\16\4\2\t\2\3\2"
      + "\3\2\7\2\7\n\2\f\2\16\2\n\13\2\3\2\3\2\3\2\3\b\2\3\2\2\2\r\2\4\3\2\2\2"
      + "\4\b\7\3\2\2\5\7\13\2\2\2\6\5\3\2\2\2\7\n\3\2\2\2\b\t\3\2\2\2\b\6\3\2"
      + "\2\2\t\13\3\2\2\2\n\b\3\2\2\2\13\f\7\5\2\2\f\3\3\2\2\2\3\b";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}