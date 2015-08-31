// Generated from LittleJQ.g4 by ANTLR 4.5.1

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
      RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, StringLiteral = 6, ID = 7, WS = 8;
   public static String[] modeNames = { "DEFAULT_MODE" };

   public static final String[] ruleNames = { "T__0", "T__1", "T__2", "T__3", "T__4", "StringLiteral", "EscapeSequence",
      "ID", "NameChar", "NameStartChar", "WS" };

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

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\nD\b\1\4\2\t\2\4"
      + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
      + "\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\7\7\'"
      + "\n\7\f\7\16\7*\13\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\7\t\63\n\t\f\t\16\t\66"
      + "\13\t\3\n\3\n\5\n:\n\n\3\13\3\13\3\f\6\f?\n\f\r\f\16\f@\3\f\3\f\2\2\r"
      + "\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\t\23\2\25\2\27\n\3\2\6\4\2))^^\7\2\62"
      + ";aa\u00b9\u00b9\u0302\u0371\u2041\u2042\17\2C\\c|\u00c2\u00d8\u00da\u00f8"
      + "\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1"
      + "\u3003\ud801\uf902\ufdd1\ufdf2\uffff\5\2\13\f\16\17\"\"E\2\3\3\2\2\2\2"
      + "\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\21\3\2\2"
      + "\2\2\27\3\2\2\2\3\31\3\2\2\2\5\33\3\2\2\2\7\35\3\2\2\2\t\37\3\2\2\2\13"
      + "!\3\2\2\2\r#\3\2\2\2\17-\3\2\2\2\21\60\3\2\2\2\239\3\2\2\2\25;\3\2\2\2"
      + "\27>\3\2\2\2\31\32\7\61\2\2\32\4\3\2\2\2\33\34\7]\2\2\34\6\3\2\2\2\35"
      + "\36\7B\2\2\36\b\3\2\2\2\37 \7?\2\2 \n\3\2\2\2!\"\7_\2\2\"\f\3\2\2\2#("
      + "\7)\2\2$\'\5\17\b\2%\'\n\2\2\2&$\3\2\2\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2"
      + "\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7)\2\2,\16\3\2\2\2-.\7^\2\2./\t\2\2"
      + "\2/\20\3\2\2\2\60\64\5\25\13\2\61\63\5\23\n\2\62\61\3\2\2\2\63\66\3\2"
      + "\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\22\3\2\2\2\66\64\3\2\2\2\67:\5\25"
      + "\13\28:\t\3\2\29\67\3\2\2\298\3\2\2\2:\24\3\2\2\2;<\t\4\2\2<\26\3\2\2"
      + "\2=?\t\5\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\b\f\2" + "\2C\30\3\2\2\2\b\2&(\649@\3\b\2\2";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}