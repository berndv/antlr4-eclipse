// Generated from JDoc.g4 by ANTLR 4.5

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

package org.sourcepit.antlr4.eclipse.lang.tests.jdoc;

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
public class JDocLexer extends Lexer {
   static {
      RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, JDOC_START = 6, JDOC_END = 7, ID = 8,
      TAG_START = 9, TAG_END = 10, TAG_CLOSED = 11, CRLF = 12, LF = 13, CR = 14, WS = 15, WORD = 16;
   public static String[] modeNames = { "DEFAULT_MODE" };

   public static final String[] ruleNames = { "T__0", "T__1", "T__2", "T__3", "T__4", "JDOC_START", "JDOC_END", "ID",
      "TAG_START", "TAG_END", "TAG_CLOSED", "NameChar", "NameStartChar", "CRLF", "LF", "CR", "WS", "WORD",
      "F_NOT_STAR_SLASH", "F_STAR_NOT_SLASH" };

   private static final String[] _LITERAL_NAMES = { null, "'*'", "'<'", "'>'", "'/'", "'/*'", null, null, null, null,
      null, null, "'\r\n'", "'\n'", "'\r'" };
   private static final String[] _SYMBOLIC_NAMES = { null, null, null, null, null, null, "JDOC_START", "JDOC_END", "ID",
      "TAG_START", "TAG_END", "TAG_CLOSED", "CRLF", "LF", "CR", "WS", "WORD" };
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


   public JDocLexer(CharStream input) {
      super(input);
      _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   @Override
   public String getGrammarFileName() {
      return "JDoc.g4";
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

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22\u00b7\b\1\4\2"
      + "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"
      + "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"
      + "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"
      + "\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7<\n\7\f\7\16\7?\13\7\3\b\7\bB\n\b\f"
      + "\b\16\bE\13\b\3\b\3\b\3\b\3\t\3\t\6\tL\n\t\r\t\16\tM\3\n\3\n\7\nR\n\n"
      + "\f\n\16\nU\13\n\3\n\6\nX\n\n\r\n\16\nY\3\n\7\n]\n\n\f\n\16\n`\13\n\3\n"
      + "\3\n\3\13\3\13\3\13\7\13g\n\13\f\13\16\13j\13\13\3\13\6\13m\n\13\r\13"
      + "\16\13n\3\13\7\13r\n\13\f\13\16\13u\13\13\3\13\3\13\3\f\3\f\7\f{\n\f\f"
      + "\f\16\f~\13\f\3\f\6\f\u0081\n\f\r\f\16\f\u0082\3\f\7\f\u0086\n\f\f\f\16"
      + "\f\u0089\13\f\3\f\3\f\3\f\3\r\3\r\5\r\u0090\n\r\3\16\3\16\3\17\3\17\3"
      + "\17\3\20\3\20\3\21\3\21\3\22\6\22\u009c\n\22\r\22\16\22\u009d\3\23\3\23"
      + "\6\23\u00a2\n\23\r\23\16\23\u00a3\3\24\3\24\3\25\6\25\u00a9\n\25\r\25"
      + "\16\25\u00aa\3\25\3\25\6\25\u00af\n\25\r\25\16\25\u00b0\3\25\3\25\3\25"
      + "\5\25\u00b6\n\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"
      + "\27\r\31\2\33\2\35\16\37\17!\20#\21%\22\'\2)\2\3\2\6\7\2\62;aa\u00b9\u00b9"
      + "\u0302\u0371\u2041\u2042\17\2C\\c|\u00c2\u00d8\u00da\u00f8\u00fa\u0301"
      + "\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003\ud801"
      + "\uf902\ufdd1\ufdf2\uffff\5\2\13\13\16\16\"\"\t\2\13\f\16\17\"\",,\61\61"
      + ">>@@\u00c6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"
      + "\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"
      + "\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3"
      + "+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\66\3\2\2"
      + "\2\17C\3\2\2\2\21I\3\2\2\2\23O\3\2\2\2\25c\3\2\2\2\27x\3\2\2\2\31\u008f"
      + "\3\2\2\2\33\u0091\3\2\2\2\35\u0093\3\2\2\2\37\u0096\3\2\2\2!\u0098\3\2"
      + "\2\2#\u009b\3\2\2\2%\u00a1\3\2\2\2\'\u00a5\3\2\2\2)\u00b5\3\2\2\2+,\7"
      + ",\2\2,\4\3\2\2\2-.\7>\2\2.\6\3\2\2\2/\60\7@\2\2\60\b\3\2\2\2\61\62\7\61"
      + "\2\2\62\n\3\2\2\2\63\64\7\61\2\2\64\65\7,\2\2\65\f\3\2\2\2\66\67\7\61"
      + "\2\2\678\7,\2\289\7,\2\29=\3\2\2\2:<\7,\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2"
      + "\2\2=>\3\2\2\2>\16\3\2\2\2?=\3\2\2\2@B\7,\2\2A@\3\2\2\2BE\3\2\2\2CA\3"
      + "\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7,\2\2GH\7\61\2\2H\20\3\2\2\2I"
      + "K\7B\2\2JL\5\31\r\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\22\3\2\2"
      + "\2OS\7>\2\2PR\5#\22\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TW\3\2\2"
      + "\2US\3\2\2\2VX\5\31\r\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z^\3\2"
      + "\2\2[]\5#\22\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3"
      + "\2\2\2ab\7@\2\2b\24\3\2\2\2cd\7>\2\2dh\7\61\2\2eg\5#\22\2fe\3\2\2\2gj"
      + "\3\2\2\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2km\5\31\r\2lk\3\2\2\2"
      + "mn\3\2\2\2nl\3\2\2\2no\3\2\2\2os\3\2\2\2pr\5#\22\2qp\3\2\2\2ru\3\2\2\2"
      + "sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7@\2\2w\26\3\2\2\2x|\7>\2\2"
      + "y{\5#\22\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0080\3\2\2\2~|\3"
      + "\2\2\2\177\u0081\5\31\r\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"
      + "\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0087\3\2\2\2\u0084\u0086\5#"
      + "\22\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087"
      + "\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\61"
      + "\2\2\u008b\u008c\7@\2\2\u008c\30\3\2\2\2\u008d\u0090\5\33\16\2\u008e\u0090"
      + "\t\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\32\3\2\2\2\u0091"
      + "\u0092\t\3\2\2\u0092\34\3\2\2\2\u0093\u0094\7\17\2\2\u0094\u0095\7\f\2"
      + "\2\u0095\36\3\2\2\2\u0096\u0097\7\f\2\2\u0097 \3\2\2\2\u0098\u0099\7\17"
      + "\2\2\u0099\"\3\2\2\2\u009a\u009c\t\4\2\2\u009b\u009a\3\2\2\2\u009c\u009d"
      + "\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e$\3\2\2\2\u009f"
      + "\u00a2\5\'\24\2\u00a0\u00a2\5)\25\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3"
      + "\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"
      + "&\3\2\2\2\u00a5\u00a6\n\5\2\2\u00a6(\3\2\2\2\u00a7\u00a9\7,\2\2\u00a8"
      + "\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"
      + "\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b6\n\5\2\2\u00ad\u00af\7,\2\2\u00ae"
      + "\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"
      + "\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b6\7\2\2\3\u00b3\u00b4\7\61\2\2\u00b4"
      + "\u00b6\n\5\2\2\u00b5\u00a8\3\2\2\2\u00b5\u00ae\3\2\2\2\u00b5\u00b3\3\2"
      + "\2\2\u00b6*\3\2\2\2\26\2=CMSY^hns|\u0082\u0087\u008f\u009d\u00a1\u00a3" + "\u00aa\u00b0\u00b5\2";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}