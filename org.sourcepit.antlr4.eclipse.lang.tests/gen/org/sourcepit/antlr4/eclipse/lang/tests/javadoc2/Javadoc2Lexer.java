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
   public static final int JavadocStart = 1, JavadocEnd = 2, JavadocLinePrefix = 3, CHAR = 4, STAR = 5, NL = 6, WS = 7;
   public static String[] modeNames = { "DEFAULT_MODE" };

   public static final String[] ruleNames = { "JavadocStart", "JavadocEnd", "JavadocLinePrefix", "CHAR", "STAR", "NL",
      "WS" };

   private static final String[] _LITERAL_NAMES = { null, null, null, null, null, "'*'" };
   private static final String[] _SYMBOLIC_NAMES = { null, "JavadocStart", "JavadocEnd", "JavadocLinePrefix", "CHAR",
      "STAR", "NL", "WS" };
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


   public static final int JAVA_DOC_LINE_PREFIX = 2;

   private boolean isOnNl() {
      int c = _input.LA(-1);
      return '\n' == c || '\r' == c;
   }

   private boolean isNotBreakJavadocEnd() {
      final int c = _input.LA(-1);
      if ('*' == c) {
         return '/' != _input.LA(1);
      }
      return true;
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
         case 2 :
            return JavadocLinePrefix_sempred((RuleContext) _localctx, predIndex);
      }
      return true;
   }

   private boolean JavadocLinePrefix_sempred(RuleContext _localctx, int predIndex) {
      switch (predIndex) {
         case 0 :
            return isOnNl();
         case 1 :
            return isNotBreakJavadocEnd();
      }
      return true;
   }

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\tX\b\1\4\2\t\2\4"
      + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\7\2"
      + "\27\n\2\f\2\16\2\32\13\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\3\7\3#\n\3\f"
      + "\3\16\3&\13\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\3\3\4\3\4\7\4\63\n"
      + "\4\f\4\16\4\66\13\4\3\4\6\49\n\4\r\4\16\4:\3\4\7\4>\n\4\f\4\16\4A\13\4"
      + "\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7N\n\7\3\7\3\7\3\b\6\b"
      + "S\n\b\r\b\16\bT\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\5\4\2"
      + "C\\c|\4\2\f\f\17\17\5\2\13\13\16\16\"\"`\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"
      + "\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2"
      + "\5$\3\2\2\2\7\60\3\2\2\2\tF\3\2\2\2\13H\3\2\2\2\rM\3\2\2\2\17R\3\2\2\2"
      + "\21\22\7\61\2\2\22\23\7,\2\2\23\24\7,\2\2\24\30\3\2\2\2\25\27\5\13\6\2"
      + "\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\36\3\2\2\2"
      + "\32\30\3\2\2\2\33\35\5\17\b\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2"
      + "\36\37\3\2\2\2\37\4\3\2\2\2 \36\3\2\2\2!#\5\17\b\2\"!\3\2\2\2#&\3\2\2"
      + "\2$\"\3\2\2\2$%\3\2\2\2%*\3\2\2\2&$\3\2\2\2\')\5\13\6\2(\'\3\2\2\2),\3"
      + "\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7,\2\2./\7\61\2\2/\6"
      + "\3\2\2\2\60\64\6\4\2\2\61\63\5\17\b\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62"
      + "\3\2\2\2\64\65\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\679\5\13\6\28\67\3\2"
      + "\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;?\3\2\2\2<>\5\17\b\2=<\3\2\2\2>A\3"
      + "\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\6\4\3\2CD\3\2\2\2DE\b"
      + "\4\2\2E\b\3\2\2\2FG\t\2\2\2G\n\3\2\2\2HI\7,\2\2I\f\3\2\2\2JK\7\17\2\2"
      + "KN\7\f\2\2LN\t\3\2\2MJ\3\2\2\2ML\3\2\2\2NO\3\2\2\2OP\b\7\3\2P\16\3\2\2"
      + "\2QS\t\4\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\b\b\3"
      + "\2W\20\3\2\2\2\f\2\30\36$*\64:?MT\4\2\4\2\2\3\2";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}