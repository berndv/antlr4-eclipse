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
public class JavadocLexer extends Lexer {
   static {
      RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int STAR = 1, NL = 2, WS = 3;
   public static String[] modeNames = { "DEFAULT_MODE" };

   public static final String[] ruleNames = { "STAR", "NL", "NLCHAR", "WS" };

   private static final String[] _LITERAL_NAMES = { null, "'*'" };
   private static final String[] _SYMBOLIC_NAMES = { null, "STAR", "NL", "WS" };
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


   public JavadocLexer(CharStream input) {
      super(input);
      _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
   public String[] getModeNames() {
      return modeNames;
   }

   @Override
   public ATN getATN() {
      return _ATN;
   }

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\5\"\b\1\4\2\t\2\4"
      + "\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\7\3\20\n\3\f\3\16\3\23\13\3\3\3"
      + "\3\3\3\4\3\4\3\4\5\4\32\n\4\3\5\6\5\35\n\5\r\5\16\5\36\3\5\3\5\2\2\6\3"
      + "\3\5\4\7\2\t\5\3\2\4\4\2\f\f\17\17\5\2\13\13\16\16\"\"#\2\3\3\2\2\2\2"
      + "\5\3\2\2\2\2\t\3\2\2\2\3\13\3\2\2\2\5\r\3\2\2\2\7\31\3\2\2\2\t\34\3\2"
      + "\2\2\13\f\7,\2\2\f\4\3\2\2\2\r\21\5\7\4\2\16\20\5\3\2\2\17\16\3\2\2\2"
      + "\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\21\3\2\2\2"
      + "\24\25\b\3\2\2\25\6\3\2\2\2\26\27\7\17\2\2\27\32\7\f\2\2\30\32\t\2\2\2"
      + "\31\26\3\2\2\2\31\30\3\2\2\2\32\b\3\2\2\2\33\35\t\3\2\2\34\33\3\2\2\2"
      + "\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\b\5\2\2!\n\3" + "\2\2\2\6\2\21\31\36\3\2\3\2";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}