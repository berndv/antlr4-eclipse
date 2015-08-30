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
      JavadocBlockTag = 7, TagSlashOpen = 8, TagOpen = 9, JavadocChar = 10, TagSlashClose = 11, TagClose = 12,
      TagEquals = 13, TagName = 14, AttributeChars = 15, AttributeHexChars = 16, AttributeDecChars = 17,
      AttributeDoubleQuoteString = 18, AttributeSingleQuoteString = 19;
   public static final int JAVADOC = 1;
   public static final int TAG = 2;
   public static final int ATTVALUE = 3;
   public static String[] modeNames = { "DEFAULT_MODE", "JAVADOC", "TAG", "ATTVALUE" };

   public static final String[] ruleNames = { "JavadocStart", "Id", "NameChar", "NameStartChar", "CommonNl", "CommonWs",
      "Nl", "Ws", "CommonJavadocLinePrefix", "JavadocLinePrefix", "JavadocEnd", "JavadocBlockTag", "JavadocNl",
      "JavadocWs", "TagSlashOpen", "TagOpen", "JavadocChar", "TagSlashClose", "TagClose", "TagJavadocLinePrefix",
      "TagEquals", "TagNl", "TagWs", "TagNameChar", "TagNameStartChar", "TagName", "AttributeJavadocLinePrefix",
      "AttributeChar", "AttributeChars", "AttributeHexChars", "AttributeDecChars", "AttributeDoubleQuoteString",
      "AttributeSingleQuoteString", "AttributeNl", "AttributeWs" };

   private static final String[] _LITERAL_NAMES = { null, null, null, null, null, null, null, null, null, null, null,
      "'/>'", "'>'", "'='" };
   private static final String[] _SYMBOLIC_NAMES = { null, "JavadocStart", "Id", "Nl", "Ws", "JavadocLinePrefix",
      "JavadocEnd", "JavadocBlockTag", "TagSlashOpen", "TagOpen", "JavadocChar", "TagSlashClose", "TagClose",
      "TagEquals", "TagName", "AttributeChars", "AttributeHexChars", "AttributeDecChars", "AttributeDoubleQuoteString",
      "AttributeSingleQuoteString" };
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
         case 8 :
            return CommonJavadocLinePrefix_sempred((RuleContext) _localctx, predIndex);
         case 11 :
            return JavadocBlockTag_sempred((RuleContext) _localctx, predIndex);
         case 14 :
            return TagSlashOpen_sempred((RuleContext) _localctx, predIndex);
         case 15 :
            return TagOpen_sempred((RuleContext) _localctx, predIndex);
      }
      return true;
   }

   private boolean CommonJavadocLinePrefix_sempred(RuleContext _localctx, int predIndex) {
      switch (predIndex) {
         case 0 :
            return isChar(LA(-1), '\n', '\r');
         case 1 :
            return isNotChar(LA(1), '/');
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

   private boolean TagSlashOpen_sempred(RuleContext _localctx, int predIndex) {
      switch (predIndex) {
         case 3 :
            return isTagStart(LA(1));
      }
      return true;
   }

   private boolean TagOpen_sempred(RuleContext _localctx, int predIndex) {
      switch (predIndex) {
         case 4 :
            return isTagStart(LA(1));
      }
      return true;
   }

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u0129\b\1\b\1"
      + "\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"
      + "\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"
      + "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"
      + "\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"
      + "\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\7\2R\n\2\f\2"
      + "\16\2U\13\2\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2\3\3\3\3\7\3a\n\3\f\3\16"
      + "\3d\13\3\3\4\3\4\5\4h\n\4\3\5\3\5\3\6\3\6\3\6\5\6o\n\6\3\7\6\7r\n\7\r"
      + "\7\16\7s\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\7\n\u0080\n\n\f\n\16"
      + "\n\u0083\13\n\3\n\6\n\u0086\n\n\r\n\16\n\u0087\3\n\3\n\7\n\u008c\n\n\f"
      + "\n\16\n\u008f\13\n\3\13\3\13\3\13\3\13\3\f\7\f\u0096\n\f\f\f\16\f\u0099"
      + "\13\f\3\f\7\f\u009c\n\f\f\f\16\f\u009f\13\f\3\f\3\f\3\f\3\f\3\f\3\r\3"
      + "\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"
      + "\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23"
      + "\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"
      + "\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"
      + "\3\32\3\32\3\33\3\33\7\33\u00e4\n\33\f\33\16\33\u00e7\13\33\3\34\3\34"
      + "\3\34\3\34\3\34\3\35\5\35\u00ef\n\35\3\36\6\36\u00f2\n\36\r\36\16\36\u00f3"
      + "\3\36\3\36\3\37\3\37\6\37\u00fa\n\37\r\37\16\37\u00fb\3\37\3\37\3 \6 "
      + "\u0101\n \r \16 \u0102\3 \5 \u0106\n \3 \3 \3!\3!\7!\u010c\n!\f!\16!\u010f"
      + "\13!\3!\3!\3!\3!\3\"\3\"\7\"\u0117\n\"\f\"\16\"\u011a\13\"\3\"\3\"\3\""
      + "\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\4\u010d\u0118\2%\6\3\b\4\n\2\f\2\16"
      + "\2\20\2\22\5\24\6\26\2\30\7\32\b\34\t\36\2 \2\"\n$\13&\f(\r*\16,\2.\17"
      + "\60\2\62\2\64\2\66\28\20:\2<\2>\21@\22B\23D\24F\25H\2J\2\6\2\3\4\5\13"
      + "\7\2\62;aa\u00b9\u00b9\u0302\u0371\u2041\u2042\17\2C\\c|\u00c2\u00d8\u00da"
      + "\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02"
      + "\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\4\2\f\f\17\17\5\2\13\13\16"
      + "\16\"\"\7\2/\60\62<C\\aac|\4\2C\\c|\t\2%%-=??AAC\\aac|\5\2\62;CHch\3\2"
      + "\62;\u012f\2\6\3\2\2\2\2\b\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\3\30\3\2"
      + "\2\2\3\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3$"
      + "\3\2\2\2\3&\3\2\2\2\4(\3\2\2\2\4*\3\2\2\2\4,\3\2\2\2\4.\3\2\2\2\4\60\3"
      + "\2\2\2\4\62\3\2\2\2\48\3\2\2\2\5:\3\2\2\2\5>\3\2\2\2\5@\3\2\2\2\5B\3\2"
      + "\2\2\5D\3\2\2\2\5F\3\2\2\2\5H\3\2\2\2\5J\3\2\2\2\6L\3\2\2\2\b^\3\2\2\2"
      + "\ng\3\2\2\2\fi\3\2\2\2\16n\3\2\2\2\20q\3\2\2\2\22u\3\2\2\2\24y\3\2\2\2"
      + "\26}\3\2\2\2\30\u0090\3\2\2\2\32\u0097\3\2\2\2\34\u00a5\3\2\2\2\36\u00a9"
      + "\3\2\2\2 \u00ae\3\2\2\2\"\u00b3\3\2\2\2$\u00ba\3\2\2\2&\u00bf\3\2\2\2"
      + "(\u00c1\3\2\2\2*\u00c6\3\2\2\2,\u00ca\3\2\2\2.\u00cf\3\2\2\2\60\u00d3"
      + "\3\2\2\2\62\u00d8\3\2\2\2\64\u00dd\3\2\2\2\66\u00df\3\2\2\28\u00e1\3\2"
      + "\2\2:\u00e8\3\2\2\2<\u00ee\3\2\2\2>\u00f1\3\2\2\2@\u00f7\3\2\2\2B\u0100"
      + "\3\2\2\2D\u0109\3\2\2\2F\u0114\3\2\2\2H\u011f\3\2\2\2J\u0124\3\2\2\2L"
      + "M\7\61\2\2MN\7,\2\2NO\7,\2\2OS\3\2\2\2PR\7,\2\2QP\3\2\2\2RU\3\2\2\2SQ"
      + "\3\2\2\2ST\3\2\2\2TY\3\2\2\2US\3\2\2\2VX\5\24\t\2WV\3\2\2\2X[\3\2\2\2"
      + "YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\b\2\2\2]\7\3\2\2\2^b\5\f"
      + "\5\2_a\5\n\4\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\t\3\2\2\2db\3"
      + "\2\2\2eh\5\f\5\2fh\t\2\2\2ge\3\2\2\2gf\3\2\2\2h\13\3\2\2\2ij\t\3\2\2j"
      + "\r\3\2\2\2kl\7\17\2\2lo\7\f\2\2mo\t\4\2\2nk\3\2\2\2nm\3\2\2\2o\17\3\2"
      + "\2\2pr\t\5\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\21\3\2\2\2uv\5"
      + "\16\6\2vw\3\2\2\2wx\b\b\3\2x\23\3\2\2\2yz\5\20\7\2z{\3\2\2\2{|\b\t\3\2"
      + "|\25\3\2\2\2}\u0081\6\n\2\2~\u0080\5 \17\2\177~\3\2\2\2\u0080\u0083\3"
      + "\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2\2\u0083"
      + "\u0081\3\2\2\2\u0084\u0086\7,\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2"
      + "\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089"
      + "\u008d\6\n\3\2\u008a\u008c\5 \17\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2"
      + "\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\27\3\2\2\2\u008f\u008d"
      + "\3\2\2\2\u0090\u0091\5\26\n\2\u0091\u0092\3\2\2\2\u0092\u0093\b\13\4\2"
      + "\u0093\31\3\2\2\2\u0094\u0096\5 \17\2\u0095\u0094\3\2\2\2\u0096\u0099"
      + "\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009d\3\2\2\2\u0099"
      + "\u0097\3\2\2\2\u009a\u009c\7,\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2"
      + "\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f"
      + "\u009d\3\2\2\2\u00a0\u00a1\7,\2\2\u00a1\u00a2\7\61\2\2\u00a2\u00a3\3\2"
      + "\2\2\u00a3\u00a4\b\f\5\2\u00a4\33\3\2\2\2\u00a5\u00a6\6\r\4\2\u00a6\u00a7"
      + "\7B\2\2\u00a7\u00a8\5\b\3\2\u00a8\35\3\2\2\2\u00a9\u00aa\5\16\6\2\u00aa"
      + "\u00ab\3\2\2\2\u00ab\u00ac\b\16\6\2\u00ac\u00ad\b\16\3\2\u00ad\37\3\2"
      + "\2\2\u00ae\u00af\5\20\7\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\17\7\2\u00b1"
      + "\u00b2\b\17\3\2\u00b2!\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4\u00b5\7\61\2\2"
      + "\u00b5\u00b6\3\2\2\2\u00b6\u00b7\6\20\5\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9"
      + "\b\20\b\2\u00b9#\3\2\2\2\u00ba\u00bb\7>\2\2\u00bb\u00bc\6\21\6\2\u00bc"
      + "\u00bd\3\2\2\2\u00bd\u00be\b\21\b\2\u00be%\3\2\2\2\u00bf\u00c0\13\2\2"
      + "\2\u00c0\'\3\2\2\2\u00c1\u00c2\7\61\2\2\u00c2\u00c3\7@\2\2\u00c3\u00c4"
      + "\3\2\2\2\u00c4\u00c5\b\23\5\2\u00c5)\3\2\2\2\u00c6\u00c7\7@\2\2\u00c7"
      + "\u00c8\3\2\2\2\u00c8\u00c9\b\24\5\2\u00c9+\3\2\2\2\u00ca\u00cb\5\26\n"
      + "\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b\25\t\2\u00cd\u00ce\b\25\4\2\u00ce"
      + "-\3\2\2\2\u00cf\u00d0\7?\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b\26\n\2"
      + "\u00d2/\3\2\2\2\u00d3\u00d4\5\16\6\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b"
      + "\27\6\2\u00d6\u00d7\b\27\3\2\u00d7\61\3\2\2\2\u00d8\u00d9\5\20\7\2\u00d9"
      + "\u00da\3\2\2\2\u00da\u00db\b\30\7\2\u00db\u00dc\b\30\3\2\u00dc\63\3\2"
      + "\2\2\u00dd\u00de\t\6\2\2\u00de\65\3\2\2\2\u00df\u00e0\t\7\2\2\u00e0\67"
      + "\3\2\2\2\u00e1\u00e5\5\66\32\2\u00e2\u00e4\5\64\31\2\u00e3\u00e2\3\2\2"
      + "\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e69"
      + "\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\5\26\n\2\u00e9\u00ea\3\2\2\2"
      + "\u00ea\u00eb\b\34\t\2\u00eb\u00ec\b\34\4\2\u00ec;\3\2\2\2\u00ed\u00ef"
      + "\t\b\2\2\u00ee\u00ed\3\2\2\2\u00ef=\3\2\2\2\u00f0\u00f2\5<\35\2\u00f1"
      + "\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"
      + "\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b\36\5\2\u00f6?\3\2\2\2\u00f7\u00f9"
      + "\7%\2\2\u00f8\u00fa\t\t\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"
      + "\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\b\37"
      + "\5\2\u00feA\3\2\2\2\u00ff\u0101\t\n\2\2\u0100\u00ff\3\2\2\2\u0101\u0102"
      + "\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104"
      + "\u0106\7\'\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2"
      + "\2\2\u0107\u0108\b \5\2\u0108C\3\2\2\2\u0109\u010d\7$\2\2\u010a\u010c"
      + "\13\2\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010e\3\2\2\2"
      + "\u010d\u010b\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111"
      + "\7$\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b!\5\2\u0113E\3\2\2\2\u0114\u0118"
      + "\7)\2\2\u0115\u0117\13\2\2\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118"
      + "\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2"
      + "\2\2\u011b\u011c\7)\2\2\u011c\u011d\3\2\2\2\u011d\u011e\b\"\5\2\u011e"
      + "G\3\2\2\2\u011f\u0120\5\16\6\2\u0120\u0121\3\2\2\2\u0121\u0122\b#\6\2"
      + "\u0122\u0123\b#\3\2\u0123I\3\2\2\2\u0124\u0125\5\20\7\2\u0125\u0126\3"
      + "\2\2\2\u0126\u0127\b$\7\2\u0127\u0128\b$\3\2\u0128K\3\2\2\2\31\2\3\4\5"
      + "SYbgns\u0081\u0087\u008d\u0097\u009d\u00e5\u00ee\u00f3\u00fb\u0102\u0105"
      + "\u010d\u0118\13\7\3\2\2\3\2\2\4\2\6\2\2\t\5\2\t\6\2\7\4\2\t\7\2\7\5\2";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}