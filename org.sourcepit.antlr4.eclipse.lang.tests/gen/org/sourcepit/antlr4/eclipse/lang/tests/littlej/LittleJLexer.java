// Generated from LittleJ.g4 by ANTLR 4.5

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

package org.sourcepit.antlr4.eclipse.lang.tests.littlej;

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
public class LittleJLexer extends Lexer {
   static {
      RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
      T__9 = 10, ID = 11;
   public static String[] modeNames = { "DEFAULT_MODE" };

   public static final String[] ruleNames = { "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
      "T__9", "ID", "NameChar", "NameStartChar" };

   private static final String[] _LITERAL_NAMES = { null, "'class'", "'{'", "'}'", "';'", "'if'", "'('", "')'", "'do'",
      "'while'", "'=='" };
   private static final String[] _SYMBOLIC_NAMES = { null, null, null, null, null, null, null, null, null, null, null,
      "ID" };
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


   public LittleJLexer(CharStream input) {
      super(input);
      _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   @Override
   public String getGrammarFileName() {
      return "LittleJ.g4";
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

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rI\b\1\4\2\t\2\4"
      + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
      + "\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4"
      + "\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"
      + "\n\3\13\3\13\3\13\3\f\3\f\7\f?\n\f\f\f\16\fB\13\f\3\r\3\r\5\rF\n\r\3\16"
      + "\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33"
      + "\2\3\2\4\7\2\62;aa\u00b9\u00b9\u0302\u0371\u2041\u2042\17\2C\\c|\u00c2"
      + "\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072"
      + "\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffffH\2\3\3\2\2\2\2"
      + "\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"
      + "\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\35\3\2\2\2\5"
      + "#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r,\3\2\2\2\17.\3\2\2\2\21"
      + "\60\3\2\2\2\23\63\3\2\2\2\259\3\2\2\2\27<\3\2\2\2\31E\3\2\2\2\33G\3\2"
      + "\2\2\35\36\7e\2\2\36\37\7n\2\2\37 \7c\2\2 !\7u\2\2!\"\7u\2\2\"\4\3\2\2"
      + "\2#$\7}\2\2$\6\3\2\2\2%&\7\177\2\2&\b\3\2\2\2\'(\7=\2\2(\n\3\2\2\2)*\7"
      + "k\2\2*+\7h\2\2+\f\3\2\2\2,-\7*\2\2-\16\3\2\2\2./\7+\2\2/\20\3\2\2\2\60"
      + "\61\7f\2\2\61\62\7q\2\2\62\22\3\2\2\2\63\64\7y\2\2\64\65\7j\2\2\65\66"
      + "\7k\2\2\66\67\7n\2\2\678\7g\2\28\24\3\2\2\29:\7?\2\2:;\7?\2\2;\26\3\2"
      + "\2\2<@\5\33\16\2=?\5\31\r\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\30"
      + "\3\2\2\2B@\3\2\2\2CF\5\33\16\2DF\t\2\2\2EC\3\2\2\2ED\3\2\2\2F\32\3\2\2" + "\2GH\t\3\2\2H\34\3\2\2\2\5\2@E\2";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}