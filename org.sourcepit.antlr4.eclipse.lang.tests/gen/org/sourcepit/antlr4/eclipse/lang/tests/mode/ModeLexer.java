// Generated from ModeLexer.g4 by ANTLR 4.5

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

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class ModeLexer extends Lexer {
   static {
      RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int JavaDocStart = 1, WS = 2, JavaDocEnd = 3, JWS = 4;
   public static final int JAVADOC = 1;
   public static String[] modeNames = { "DEFAULT_MODE", "JAVADOC" };

   public static final String[] ruleNames = { "JavaDocStart", "WS", "JavaDocEnd", "JWS" };

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


   public ModeLexer(CharStream input) {
      super(input);
      _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   @Override
   public String getGrammarFileName() {
      return "ModeLexer.g4";
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
   public String[] getModeNames() {
      return modeNames;
   }

   @Override
   public ATN getATN() {
      return _ATN;
   }

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\6%\b\1\b\1\4\2\t"
      + "\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3\24\n\3\r\3"
      + "\16\3\25\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\6\5 \n\5\r\5\16\5!\3\5\3\5\2"
      + "\2\6\4\3\6\4\b\5\n\6\4\2\3\3\5\2\13\f\16\17\"\"%\2\4\3\2\2\2\2\6\3\2\2"
      + "\2\3\b\3\2\2\2\3\n\3\2\2\2\4\f\3\2\2\2\6\23\3\2\2\2\b\31\3\2\2\2\n\37"
      + "\3\2\2\2\f\r\7\61\2\2\r\16\7,\2\2\16\17\7,\2\2\17\20\3\2\2\2\20\21\b\2"
      + "\2\2\21\5\3\2\2\2\22\24\t\2\2\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2"
      + "\2\2\25\26\3\2\2\2\26\27\3\2\2\2\27\30\b\3\3\2\30\7\3\2\2\2\31\32\7,\2"
      + "\2\32\33\7\61\2\2\33\34\3\2\2\2\34\35\b\4\4\2\35\t\3\2\2\2\36 \t\2\2\2"
      + "\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\b\5\3\2$"
      + "\13\3\2\2\2\6\2\3\25!\5\7\3\2\2\3\2\6\2\2";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}