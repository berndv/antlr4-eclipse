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
public class AstPathLexer extends Lexer {
   static {
      RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, ValueLiteral = 8,
      ID = 9, IndexNumeral = 10, WS = 11;
   public static String[] modeNames = { "DEFAULT_MODE" };

   public static final String[] ruleNames = { "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ValueLiteral",
      "EscapeSequence", "ID", "NameChar", "NameStartChar", "IndexNumeral", "NonZeroDigit", "Digit", "WS" };

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


   public AstPathLexer(CharStream input) {
      super(input);
      _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
   public String[] getModeNames() {
      return modeNames;
   }

   @Override
   public ATN getATN() {
      return _ATN;
   }

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rh\b\1\4\2\t\2\4"
      + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
      + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"
      + "\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"
      + "\3\t\3\t\3\t\7\t;\n\t\f\t\16\t>\13\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\7\13"
      + "G\n\13\f\13\16\13J\13\13\3\f\3\f\5\fN\n\f\3\r\3\r\3\16\3\16\3\16\7\16"
      + "U\n\16\f\16\16\16X\13\16\5\16Z\n\16\3\17\3\17\3\20\3\20\5\20`\n\20\3\21"
      + "\6\21c\n\21\r\21\16\21d\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t"
      + "\21\n\23\2\25\13\27\2\31\2\33\f\35\2\37\2!\r\3\2\6\4\2))^^\7\2\62;aa\u00b9"
      + "\u00b9\u0302\u0371\u2041\u2042\17\2C\\c|\u00c2\u00d8\u00da\u00f8\u00fa"
      + "\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003"
      + "\ud801\uf902\ufdd1\ufdf2\uffff\5\2\13\f\16\17\"\"j\2\3\3\2\2\2\2\5\3\2"
      + "\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"
      + "\3\2\2\2\2\25\3\2\2\2\2\33\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7"
      + "\'\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r-\3\2\2\2\17\62\3\2\2\2\21\67\3\2\2"
      + "\2\23A\3\2\2\2\25D\3\2\2\2\27M\3\2\2\2\31O\3\2\2\2\33Y\3\2\2\2\35[\3\2"
      + "\2\2\37_\3\2\2\2!b\3\2\2\2#$\7\61\2\2$\4\3\2\2\2%&\7]\2\2&\6\3\2\2\2\'"
      + "(\7_\2\2(\b\3\2\2\2)*\7B\2\2*\n\3\2\2\2+,\7?\2\2,\f\3\2\2\2-.\7v\2\2."
      + "/\7g\2\2/\60\7z\2\2\60\61\7v\2\2\61\16\3\2\2\2\62\63\7v\2\2\63\64\7{\2"
      + "\2\64\65\7r\2\2\65\66\7g\2\2\66\20\3\2\2\2\67<\7)\2\28;\5\23\n\29;\n\2"
      + "\2\2:8\3\2\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2"
      + "\2\2?@\7)\2\2@\22\3\2\2\2AB\7^\2\2BC\t\2\2\2C\24\3\2\2\2DH\5\31\r\2EG"
      + "\5\27\f\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\26\3\2\2\2JH\3\2\2"
      + "\2KN\5\31\r\2LN\t\3\2\2MK\3\2\2\2ML\3\2\2\2N\30\3\2\2\2OP\t\4\2\2P\32"
      + "\3\2\2\2QZ\7\62\2\2RV\5\35\17\2SU\5\37\20\2TS\3\2\2\2UX\3\2\2\2VT\3\2"
      + "\2\2VW\3\2\2\2WZ\3\2\2\2XV\3\2\2\2YQ\3\2\2\2YR\3\2\2\2Z\34\3\2\2\2[\\"
      + "\4\63;\2\\\36\3\2\2\2]`\7\62\2\2^`\5\35\17\2_]\3\2\2\2_^\3\2\2\2` \3\2"
      + "\2\2ac\t\5\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\b\21"
      + "\2\2g\"\3\2\2\2\13\2:<HMVY_d\3\b\2\2";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}