// Generated from LittleJ.g4 by ANTLR 4.5.1

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
      RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
      T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, ID = 16, WS = 17, COMMENT = 18,
      LINE_COMMENT = 19;
   public static String[] modeNames = { "DEFAULT_MODE" };

   public static final String[] ruleNames = { "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
      "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "ID", "NameChar", "NameStartChar", "WS", "COMMENT",
      "LINE_COMMENT" };

   private static final String[] _LITERAL_NAMES = { null, "'package'", "'.'", "'import'", "'*'", "'static'", "'class'",
      "'{'", "'}'", "';'", "'if'", "'('", "')'", "'do'", "'while'", "'=='" };
   private static final String[] _SYMBOLIC_NAMES = { null, null, null, null, null, null, null, null, null, null, null,
      null, null, null, null, null, "ID", "WS", "COMMENT", "LINE_COMMENT" };
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

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u0093\b\1\4\2"
      + "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"
      + "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"
      + "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"
      + "\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3"
      + "\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"
      + "\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"
      + "\3\20\3\20\3\21\3\21\7\21i\n\21\f\21\16\21l\13\21\3\22\3\22\5\22p\n\22"
      + "\3\23\3\23\3\24\6\24u\n\24\r\24\16\24v\3\24\3\24\3\25\3\25\3\25\3\25\7"
      + "\25\177\n\25\f\25\16\25\u0082\13\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"
      + "\3\26\3\26\7\26\u008d\n\26\f\26\16\26\u0090\13\26\3\26\3\26\3\u0080\2"
      + "\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"
      + "\20\37\21!\22#\2%\2\'\23)\24+\25\3\2\6\7\2\62;aa\u00b9\u00b9\u0302\u0371"
      + "\u2041\u2042\17\2C\\c|\u00c2\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f"
      + "\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1"
      + "\ufdf2\uffff\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u0095\2\3\3\2\2\2\2\5\3"
      + "\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"
      + "\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"
      + "\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+"
      + "\3\2\2\2\3-\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t>\3\2\2\2\13@\3\2\2\2\r"
      + "G\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2\23Q\3\2\2\2\25S\3\2\2\2\27V\3\2\2\2"
      + "\31X\3\2\2\2\33Z\3\2\2\2\35]\3\2\2\2\37c\3\2\2\2!f\3\2\2\2#o\3\2\2\2%"
      + "q\3\2\2\2\'t\3\2\2\2)z\3\2\2\2+\u0088\3\2\2\2-.\7r\2\2./\7c\2\2/\60\7"
      + "e\2\2\60\61\7m\2\2\61\62\7c\2\2\62\63\7i\2\2\63\64\7g\2\2\64\4\3\2\2\2"
      + "\65\66\7\60\2\2\66\6\3\2\2\2\678\7k\2\289\7o\2\29:\7r\2\2:;\7q\2\2;<\7"
      + "t\2\2<=\7v\2\2=\b\3\2\2\2>?\7,\2\2?\n\3\2\2\2@A\7u\2\2AB\7v\2\2BC\7c\2"
      + "\2CD\7v\2\2DE\7k\2\2EF\7e\2\2F\f\3\2\2\2GH\7e\2\2HI\7n\2\2IJ\7c\2\2JK"
      + "\7u\2\2KL\7u\2\2L\16\3\2\2\2MN\7}\2\2N\20\3\2\2\2OP\7\177\2\2P\22\3\2"
      + "\2\2QR\7=\2\2R\24\3\2\2\2ST\7k\2\2TU\7h\2\2U\26\3\2\2\2VW\7*\2\2W\30\3"
      + "\2\2\2XY\7+\2\2Y\32\3\2\2\2Z[\7f\2\2[\\\7q\2\2\\\34\3\2\2\2]^\7y\2\2^"
      + "_\7j\2\2_`\7k\2\2`a\7n\2\2ab\7g\2\2b\36\3\2\2\2cd\7?\2\2de\7?\2\2e \3"
      + "\2\2\2fj\5%\23\2gi\5#\22\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\""
      + "\3\2\2\2lj\3\2\2\2mp\5%\23\2np\t\2\2\2om\3\2\2\2on\3\2\2\2p$\3\2\2\2q"
      + "r\t\3\2\2r&\3\2\2\2su\t\4\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2"
      + "wx\3\2\2\2xy\b\24\2\2y(\3\2\2\2z{\7\61\2\2{|\7,\2\2|\u0080\3\2\2\2}\177"
      + "\13\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080\u0081\3\2\2\2\u0080~\3\2\2"
      + "\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7,\2\2\u0084\u0085"
      + "\7\61\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\25\3\2\u0087*\3\2\2\2\u0088"
      + "\u0089\7\61\2\2\u0089\u008a\7\61\2\2\u008a\u008e\3\2\2\2\u008b\u008d\n"
      + "\5\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"
      + "\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\b\26"
      + "\3\2\u0092,\3\2\2\2\b\2jov\u0080\u008e\4\b\2\2\2\3\2";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}