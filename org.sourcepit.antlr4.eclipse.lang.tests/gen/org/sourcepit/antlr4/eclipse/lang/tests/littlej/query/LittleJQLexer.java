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
public class LittleJQLexer extends Lexer {
   static {
      RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, StringLiteral = 6, ID = 7, WS = 8,
      COMMENT = 9, LINE_COMMENT = 10;
   public static String[] modeNames = { "DEFAULT_MODE" };

   public static final String[] ruleNames = { "T__0", "T__1", "T__2", "T__3", "T__4", "StringLiteral",
      "EscapeSequence", "ID", "NameChar", "NameStartChar", "WS", "COMMENT", "LINE_COMMENT" };

   private static final String[] _LITERAL_NAMES = { null, "'/'", "'['", "'@'", "'='", "']'" };
   private static final String[] _SYMBOLIC_NAMES = { null, null, null, null, null, null, "StringLiteral", "ID", "WS",
      "COMMENT", "LINE_COMMENT" };
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


   public LittleJQLexer(CharStream input) {
      super(input);
      _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
   public String[] getModeNames() {
      return modeNames;
   }

   @Override
   public ATN getATN() {
      return _ATN;
   }

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\fa\b\1\4\2\t\2\4"
      + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
      + "\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"
      + "\3\7\3\7\3\7\7\7+\n\7\f\7\16\7.\13\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\7\t\67"
      + "\n\t\f\t\16\t:\13\t\3\n\3\n\5\n>\n\n\3\13\3\13\3\f\6\fC\n\f\r\f\16\fD"
      + "\3\f\3\f\3\r\3\r\3\r\3\r\7\rM\n\r\f\r\16\rP\13\r\3\r\3\r\3\r\3\r\3\r\3"
      + "\16\3\16\3\16\3\16\7\16[\n\16\f\16\16\16^\13\16\3\16\3\16\3N\2\17\3\3"
      + "\5\4\7\5\t\6\13\7\r\b\17\2\21\t\23\2\25\2\27\n\31\13\33\f\3\2\7\4\2))"
      + "^^\7\2\62;aa\u00b9\u00b9\u0302\u0371\u2041\u2042\17\2C\\c|\u00c2\u00d8"
      + "\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191"
      + "\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\5\2\13\f\16\17\"\"\4"
      + "\2\f\f\17\17d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"
      + "\2\2\2\r\3\2\2\2\2\21\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3"
      + "\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13%\3\2\2\2\r\'\3\2\2\2"
      + "\17\61\3\2\2\2\21\64\3\2\2\2\23=\3\2\2\2\25?\3\2\2\2\27B\3\2\2\2\31H\3"
      + "\2\2\2\33V\3\2\2\2\35\36\7\61\2\2\36\4\3\2\2\2\37 \7]\2\2 \6\3\2\2\2!"
      + "\"\7B\2\2\"\b\3\2\2\2#$\7?\2\2$\n\3\2\2\2%&\7_\2\2&\f\3\2\2\2\',\7)\2"
      + "\2(+\5\17\b\2)+\n\2\2\2*(\3\2\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2"
      + "\2\2-/\3\2\2\2.,\3\2\2\2/\60\7)\2\2\60\16\3\2\2\2\61\62\7^\2\2\62\63\t"
      + "\2\2\2\63\20\3\2\2\2\648\5\25\13\2\65\67\5\23\n\2\66\65\3\2\2\2\67:\3"
      + "\2\2\28\66\3\2\2\289\3\2\2\29\22\3\2\2\2:8\3\2\2\2;>\5\25\13\2<>\t\3\2"
      + "\2=;\3\2\2\2=<\3\2\2\2>\24\3\2\2\2?@\t\4\2\2@\26\3\2\2\2AC\t\5\2\2BA\3"
      + "\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\b\f\2\2G\30\3\2\2\2H"
      + "I\7\61\2\2IJ\7,\2\2JN\3\2\2\2KM\13\2\2\2LK\3\2\2\2MP\3\2\2\2NO\3\2\2\2"
      + "NL\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7,\2\2RS\7\61\2\2ST\3\2\2\2TU\b\r\2\2"
      + "U\32\3\2\2\2VW\7\61\2\2WX\7\61\2\2X\\\3\2\2\2Y[\n\6\2\2ZY\3\2\2\2[^\3"
      + "\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\b\16\2\2`\34\3\2\2" + "\2\n\2*,8=DN\\\3\b\2\2";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}