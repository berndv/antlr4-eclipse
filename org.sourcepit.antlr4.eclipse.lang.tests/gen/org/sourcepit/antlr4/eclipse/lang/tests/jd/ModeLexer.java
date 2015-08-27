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

package org.sourcepit.antlr4.eclipse.lang.tests.jd;

import org.antlr.v4.runtime.CharStream;
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
public class ModeLexer extends org.sourcepit.antlr4.eclipse.lang.tests.jd.AbstractJavadocLexer {
   static {
      RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int JavadocStart = 1, Id = 2, Nl = 3, Ws = 4, JavadocLinePrefix = 5, JavadocEnd = 6,
      JavadocBlockTag = 7, JavadocNl = 8, JavadocWs = 9, JavadocChar = 10;
   public static final int JAVADOC = 1;
   public static String[] modeNames = { "DEFAULT_MODE", "JAVADOC" };

   public static final String[] ruleNames = { "JavadocStart", "Id", "NameChar", "NameStartChar", "Nl", "Ws",
      "JavadocLinePrefix", "JavadocEnd", "JavadocBlockTag", "JavadocNl", "JavadocWs", "JavadocChar" };

   private static final String[] _LITERAL_NAMES = {};
   private static final String[] _SYMBOLIC_NAMES = { null, "JavadocStart", "Id", "Nl", "Ws", "JavadocLinePrefix",
      "JavadocEnd", "JavadocBlockTag", "JavadocNl", "JavadocWs", "JavadocChar" };
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

   @Override
   public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
      switch (ruleIndex) {
         case 6 :
            return JavadocLinePrefix_sempred((RuleContext) _localctx, predIndex);
         case 8 :
            return JavadocBlockTag_sempred((RuleContext) _localctx, predIndex);
      }
      return true;
   }

   private boolean JavadocLinePrefix_sempred(RuleContext _localctx, int predIndex) {
      switch (predIndex) {
         case 0 :
            return isNl();
         case 1 :
            return isNotBreakJavadocEnd();
      }
      return true;
   }

   private boolean JavadocBlockTag_sempred(RuleContext _localctx, int predIndex) {
      switch (predIndex) {
         case 2 :
            return allowBlockTag;
      }
      return true;
   }

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\f\u0084\b\1\b\1\4"
      + "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"
      + "\4\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2%\13"
      + "\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\7\3\61\n\3\f\3\16\3\64"
      + "\13\3\3\4\3\4\5\48\n\4\3\5\3\5\3\6\3\6\3\6\5\6?\n\6\3\6\3\6\3\7\6\7D\n"
      + "\7\r\7\16\7E\3\7\3\7\3\b\3\b\7\bL\n\b\f\b\16\bO\13\b\3\b\6\bR\n\b\r\b"
      + "\16\bS\3\b\7\bW\n\b\f\b\16\bZ\13\b\3\b\3\b\3\b\3\b\3\t\7\ta\n\t\f\t\16"
      + "\td\13\t\3\t\7\tg\n\t\f\t\16\tj\13\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"
      + "\n\3\13\3\13\3\13\5\13x\n\13\3\13\3\13\3\f\6\f}\n\f\r\f\16\f~\3\f\3\f"
      + "\3\r\3\r\2\2\16\4\3\6\4\b\2\n\2\f\5\16\6\20\7\22\b\24\t\26\n\30\13\32"
      + "\f\4\2\3\6\7\2\62;aa\u00b9\u00b9\u0302\u0371\u2041\u2042\17\2C\\c|\u00c2"
      + "\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072"
      + "\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\4\2\f\f\17\17\5"
      + "\2\13\13\16\16\"\"\u008d\2\4\3\2\2\2\2\6\3\2\2\2\2\f\3\2\2\2\2\16\3\2"
      + "\2\2\3\20\3\2\2\2\3\22\3\2\2\2\3\24\3\2\2\2\3\26\3\2\2\2\3\30\3\2\2\2"
      + "\3\32\3\2\2\2\4\34\3\2\2\2\6.\3\2\2\2\b\67\3\2\2\2\n9\3\2\2\2\f>\3\2\2"
      + "\2\16C\3\2\2\2\20I\3\2\2\2\22b\3\2\2\2\24p\3\2\2\2\26w\3\2\2\2\30|\3\2"
      + "\2\2\32\u0082\3\2\2\2\34\35\7\61\2\2\35\36\7,\2\2\36\37\7,\2\2\37#\3\2"
      + "\2\2 \"\7,\2\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$)\3\2\2\2%#\3"
      + "\2\2\2&(\5\16\7\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2"
      + "+)\3\2\2\2,-\b\2\2\2-\5\3\2\2\2.\62\5\n\5\2/\61\5\b\4\2\60/\3\2\2\2\61"
      + "\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\7\3\2\2\2\64\62\3\2\2\2\65"
      + "8\5\n\5\2\668\t\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\t\3\2\2\29:\t\3\2\2"
      + ":\13\3\2\2\2;<\7\17\2\2<?\7\f\2\2=?\t\4\2\2>;\3\2\2\2>=\3\2\2\2?@\3\2"
      + "\2\2@A\b\6\3\2A\r\3\2\2\2BD\t\5\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3"
      + "\2\2\2FG\3\2\2\2GH\b\7\3\2H\17\3\2\2\2IM\6\b\2\2JL\5\30\f\2KJ\3\2\2\2"
      + "LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PR\7,\2\2QP\3\2\2\2"
      + "RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TX\3\2\2\2UW\5\30\f\2VU\3\2\2\2WZ\3\2\2"
      + "\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\6\b\3\2\\]\3\2\2\2]^\b\b"
      + "\4\2^\21\3\2\2\2_a\5\30\f\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ch"
      + "\3\2\2\2db\3\2\2\2eg\7,\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik"
      + "\3\2\2\2jh\3\2\2\2kl\7,\2\2lm\7\61\2\2mn\3\2\2\2no\b\t\5\2o\23\3\2\2\2"
      + "pq\6\n\4\2qr\7B\2\2rs\5\6\3\2s\25\3\2\2\2tu\7\17\2\2ux\7\f\2\2vx\t\4\2"
      + "\2wt\3\2\2\2wv\3\2\2\2xy\3\2\2\2yz\b\13\3\2z\27\3\2\2\2{}\t\5\2\2|{\3"
      + "\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"
      + "\b\f\3\2\u0081\31\3\2\2\2\u0082\u0083\13\2\2\2\u0083\33\3\2\2\2\21\2\3"
      + "#)\62\67>EMSXbhw~\6\7\3\2\2\3\2\2\4\2\6\2\2";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}