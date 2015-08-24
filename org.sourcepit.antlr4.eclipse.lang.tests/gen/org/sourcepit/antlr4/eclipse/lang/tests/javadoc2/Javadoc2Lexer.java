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
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class Javadoc2Lexer extends Lexer {
   static {
      RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int JavadocStart = 1, JavadocEnd = 2, CHAR = 3, STARS = 4, STAR = 5, NL = 6, WS = 7;
   public static String[] modeNames = { "DEFAULT_MODE" };

   public static final String[] ruleNames = { "JavadocStart", "JavadocEnd", "CHAR", "STARS", "STAR", "NL", "WS" };

   private static final String[] _LITERAL_NAMES = { null, null, null, null, null, "'*'" };
   private static final String[] _SYMBOLIC_NAMES = { null, "JavadocStart", "JavadocEnd", "CHAR", "STARS", "STAR", "NL",
      "WS" };
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


   public static final int DOCFRAME = 2;

   private boolean isJavadocEnd() {
      int i = 1;
      int c = _input.LA(i);
      while ('*' == c) {
         i++;
         c = _input.LA(i);
      }
      return '/' == c;
   }

   private boolean isJavadocLinePrefix() {
      int i = -1;
      int c = _input.LA(i);

      while (' ' == c) {
         i--;
         c = _input.LA(i);
      }

      while ('*' == c) {
         i--;
         c = _input.LA(i);
      }

      while (' ' == c) {
         i--;
         c = _input.LA(i);
      }

      return '\n' == c || '\r' == c;
   }


   public Javadoc2Lexer(CharStream input) {
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

   @Override
   public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
      switch (ruleIndex) {
         case 3 :
            return STARS_sempred((RuleContext) _localctx, predIndex);
      }
      return true;
   }

   private boolean STARS_sempred(RuleContext _localctx, int predIndex) {
      switch (predIndex) {
         case 0 :
            return !isJavadocEnd();
         case 1 :
            return isJavadocLinePrefix();
      }
      return true;
   }

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\tR\b\1\4\2\t\2\4"
      + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\7\2"
      + "\27\n\2\f\2\16\2\32\13\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\3\7\3#\n\3\f"
      + "\3\16\3&\13\3\3\3\3\3\3\3\3\4\3\4\3\5\7\5.\n\5\f\5\16\5\61\13\5\3\5\3"
      + "\5\6\5\65\n\5\r\5\16\5\66\3\5\7\5:\n\5\f\5\16\5=\13\5\3\5\3\5\3\5\3\5"
      + "\3\6\3\6\3\7\3\7\3\7\5\7H\n\7\3\7\3\7\3\b\6\bM\n\b\r\b\16\bN\3\b\3\b\2"
      + "\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\5\4\2C\\c|\4\2\f\f\17\17\5\2\13"
      + "\13\16\16\"\"Y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"
      + "\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5$\3\2\2\2\7*\3\2\2\2\t/"
      + "\3\2\2\2\13B\3\2\2\2\rG\3\2\2\2\17L\3\2\2\2\21\22\7\61\2\2\22\23\7,\2"
      + "\2\23\24\7,\2\2\24\30\3\2\2\2\25\27\5\13\6\2\26\25\3\2\2\2\27\32\3\2\2"
      + "\2\30\26\3\2\2\2\30\31\3\2\2\2\31\36\3\2\2\2\32\30\3\2\2\2\33\35\5\17"
      + "\b\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\4\3\2\2"
      + "\2 \36\3\2\2\2!#\5\13\6\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'"
      + "\3\2\2\2&$\3\2\2\2\'(\7,\2\2()\7\61\2\2)\6\3\2\2\2*+\t\2\2\2+\b\3\2\2"
      + "\2,.\5\17\b\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2"
      + "\2\61/\3\2\2\2\62\64\6\5\2\2\63\65\5\13\6\2\64\63\3\2\2\2\65\66\3\2\2"
      + "\2\66\64\3\2\2\2\66\67\3\2\2\2\67;\3\2\2\28:\5\17\b\298\3\2\2\2:=\3\2"
      + "\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\6\5\3\2?@\3\2\2\2@A\b\5"
      + "\2\2A\n\3\2\2\2BC\7,\2\2C\f\3\2\2\2DE\7\17\2\2EH\7\f\2\2FH\t\3\2\2GD\3"
      + "\2\2\2GF\3\2\2\2HI\3\2\2\2IJ\b\7\3\2J\16\3\2\2\2KM\t\4\2\2LK\3\2\2\2M"
      + "N\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\b\b\3\2Q\20\3\2\2\2\13\2\30" + "\36$/\66;GN\4\2\4\2\2\3\2";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}