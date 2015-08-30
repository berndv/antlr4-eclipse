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
      JavadocInlineTagOpen = 7, JavadocBlockTag = 8, TagSlashOpen = 9, TagOpen = 10, JavadocText = 11,
      JavadocInlineTagClose = 12, JavadocInlineTagText = 13, TagSlashClose = 14, TagClose = 15, TagEquals = 16,
      TagName = 17, AttributeChars = 18, AttributeHexChars = 19, AttributeDecChars = 20,
      AttributeDoubleQuoteString = 21, AttributeSingleQuoteString = 22;
   public static final int JAVADOC = 1;
   public static final int JAVADOC_INLINE_TAG = 2;
   public static final int TAG = 3;
   public static final int ATTVALUE = 4;
   public static String[] modeNames = { "DEFAULT_MODE", "JAVADOC", "JAVADOC_INLINE_TAG", "TAG", "ATTVALUE" };

   public static final String[] ruleNames = { "JavadocStart", "Id", "NameChar", "NameStartChar", "CommonNl", "CommonWs",
      "Nl", "Ws", "CommonJavadocLinePrefix", "JavadocLinePrefix", "JavadocEnd", "JavadocInlineTagOpen",
      "JavadocBlockTag", "JavadocNl", "JavadocWs", "TagSlashOpen", "TagOpen", "JavadocText", "JavadocInlineTagClose",
      "JavadocInlineTagPrefix", "JavadocInlineTagNl", "JavadocInlineTagWs", "JavadocInlineTagText", "TagSlashClose",
      "TagClose", "TagJavadocLinePrefix", "TagEquals", "TagNl", "TagWs", "TagNameChar", "TagNameStartChar", "TagName",
      "AttributeJavadocLinePrefix", "AttributeChar", "AttributeChars", "AttributeHexChars", "AttributeDecChars",
      "AttributeDoubleQuoteString", "AttributeSingleQuoteString", "AttributeNl", "AttributeWs" };

   private static final String[] _LITERAL_NAMES = { null, null, null, null, null, null, null, null, null, null, null,
      null, "'}'", null, "'/>'", "'>'", "'='" };
   private static final String[] _SYMBOLIC_NAMES = { null, "JavadocStart", "Id", "Nl", "Ws", "JavadocLinePrefix",
      "JavadocEnd", "JavadocInlineTagOpen", "JavadocBlockTag", "TagSlashOpen", "TagOpen", "JavadocText",
      "JavadocInlineTagClose", "JavadocInlineTagText", "TagSlashClose", "TagClose", "TagEquals", "TagName",
      "AttributeChars", "AttributeHexChars", "AttributeDecChars", "AttributeDoubleQuoteString",
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
         case 12 :
            return JavadocBlockTag_sempred((RuleContext) _localctx, predIndex);
         case 15 :
            return TagSlashOpen_sempred((RuleContext) _localctx, predIndex);
         case 16 :
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

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u0158\b\1\b\1"
      + "\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"
      + "\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"
      + "\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"
      + "\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"
      + "\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"
      + ")\t)\4*\t*\3\2\3\2\3\2\3\2\3\2\7\2_\n\2\f\2\16\2b\13\2\3\2\7\2e\n\2\f"
      + "\2\16\2h\13\2\3\2\3\2\3\3\3\3\7\3n\n\3\f\3\16\3q\13\3\3\4\3\4\5\4u\n\4"
      + "\3\5\3\5\3\6\3\6\3\6\5\6|\n\6\3\7\6\7\177\n\7\r\7\16\7\u0080\3\b\3\b\3"
      + "\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\7\n\u008d\n\n\f\n\16\n\u0090\13\n\3\n\6"
      + "\n\u0093\n\n\r\n\16\n\u0094\3\n\3\n\7\n\u0099\n\n\f\n\16\n\u009c\13\n"
      + "\3\13\3\13\3\13\3\13\3\f\7\f\u00a3\n\f\f\f\16\f\u00a6\13\f\3\f\7\f\u00a9"
      + "\n\f\f\f\16\f\u00ac\13\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"
      + "\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"
      + "\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\6"
      + "\23\u00d5\n\23\r\23\16\23\u00d6\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"
      + "\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\6\30\u00ed"
      + "\n\30\r\30\16\30\u00ee\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"
      + "\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"
      + "\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\7!\u0113\n!\f!\16!\u0116"
      + "\13!\3\"\3\"\3\"\3\"\3\"\3#\5#\u011e\n#\3$\6$\u0121\n$\r$\16$\u0122\3"
      + "$\3$\3%\3%\6%\u0129\n%\r%\16%\u012a\3%\3%\3&\6&\u0130\n&\r&\16&\u0131"
      + "\3&\5&\u0135\n&\3&\3&\3\'\3\'\7\'\u013b\n\'\f\'\16\'\u013e\13\'\3\'\3"
      + "\'\3\'\3\'\3(\3(\7(\u0146\n(\f(\16(\u0149\13(\3(\3(\3(\3(\3)\3)\3)\3)"
      + "\3)\3*\3*\3*\3*\3*\5\u00d6\u013c\u0147\2+\7\3\t\4\13\2\r\2\17\2\21\2\23"
      + "\5\25\6\27\2\31\7\33\b\35\t\37\n!\2#\2%\13\'\f)\r+\16-\2/\2\61\2\63\17"
      + "\65\20\67\219\2;\22=\2?\2A\2C\2E\23G\2I\2K\24M\25O\26Q\27S\30U\2W\2\7"
      + "\2\3\4\5\6\f\7\2\62;aa\u00b9\u00b9\u0302\u0371\u2041\u2042\17\2C\\c|\u00c2"
      + "\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072"
      + "\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\4\2\f\f\17\17\5"
      + "\2\13\13\16\16\"\"\6\2\13\f\16\17\"\"\177\177\7\2/\60\62<C\\aac|\4\2C"
      + "\\c|\t\2%%-=??AAC\\aac|\5\2\62;CHch\3\2\62;\u015f\2\7\3\2\2\2\2\t\3\2"
      + "\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\31\3\2\2\2\3\33\3\2\2\2\3\35\3\2\2\2"
      + "\3\37\3\2\2\2\3!\3\2\2\2\3#\3\2\2\2\3%\3\2\2\2\3\'\3\2\2\2\3)\3\2\2\2"
      + "\4+\3\2\2\2\4-\3\2\2\2\4/\3\2\2\2\4\61\3\2\2\2\4\63\3\2\2\2\5\65\3\2\2"
      + "\2\5\67\3\2\2\2\59\3\2\2\2\5;\3\2\2\2\5=\3\2\2\2\5?\3\2\2\2\5E\3\2\2\2"
      + "\6G\3\2\2\2\6K\3\2\2\2\6M\3\2\2\2\6O\3\2\2\2\6Q\3\2\2\2\6S\3\2\2\2\6U"
      + "\3\2\2\2\6W\3\2\2\2\7Y\3\2\2\2\tk\3\2\2\2\13t\3\2\2\2\rv\3\2\2\2\17{\3"
      + "\2\2\2\21~\3\2\2\2\23\u0082\3\2\2\2\25\u0086\3\2\2\2\27\u008a\3\2\2\2"
      + "\31\u009d\3\2\2\2\33\u00a4\3\2\2\2\35\u00b2\3\2\2\2\37\u00b9\3\2\2\2!"
      + "\u00bd\3\2\2\2#\u00c2\3\2\2\2%\u00c7\3\2\2\2\'\u00ce\3\2\2\2)\u00d4\3"
      + "\2\2\2+\u00d8\3\2\2\2-\u00dc\3\2\2\2/\u00e1\3\2\2\2\61\u00e6\3\2\2\2\63"
      + "\u00ec\3\2\2\2\65\u00f0\3\2\2\2\67\u00f5\3\2\2\29\u00f9\3\2\2\2;\u00fe"
      + "\3\2\2\2=\u0102\3\2\2\2?\u0107\3\2\2\2A\u010c\3\2\2\2C\u010e\3\2\2\2E"
      + "\u0110\3\2\2\2G\u0117\3\2\2\2I\u011d\3\2\2\2K\u0120\3\2\2\2M\u0126\3\2"
      + "\2\2O\u012f\3\2\2\2Q\u0138\3\2\2\2S\u0143\3\2\2\2U\u014e\3\2\2\2W\u0153"
      + "\3\2\2\2YZ\7\61\2\2Z[\7,\2\2[\\\7,\2\2\\`\3\2\2\2]_\7,\2\2^]\3\2\2\2_"
      + "b\3\2\2\2`^\3\2\2\2`a\3\2\2\2af\3\2\2\2b`\3\2\2\2ce\5\25\t\2dc\3\2\2\2"
      + "eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\b\2\2\2j\b\3\2\2"
      + "\2ko\5\r\5\2ln\5\13\4\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\n\3\2"
      + "\2\2qo\3\2\2\2ru\5\r\5\2su\t\2\2\2tr\3\2\2\2ts\3\2\2\2u\f\3\2\2\2vw\t"
      + "\3\2\2w\16\3\2\2\2xy\7\17\2\2y|\7\f\2\2z|\t\4\2\2{x\3\2\2\2{z\3\2\2\2"
      + "|\20\3\2\2\2}\177\t\5\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080"
      + "\u0081\3\2\2\2\u0081\22\3\2\2\2\u0082\u0083\5\17\6\2\u0083\u0084\3\2\2"
      + "\2\u0084\u0085\b\b\3\2\u0085\24\3\2\2\2\u0086\u0087\5\21\7\2\u0087\u0088"
      + "\3\2\2\2\u0088\u0089\b\t\3\2\u0089\26\3\2\2\2\u008a\u008e\6\n\2\2\u008b"
      + "\u008d\5#\20\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"
      + "\2\2\u008e\u008f\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0091"
      + "\u0093\7,\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2"
      + "\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009a\6\n\3\2\u0097"
      + "\u0099\5#\20\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"
      + "\2\2\u009a\u009b\3\2\2\2\u009b\30\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e"
      + "\5\27\n\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\13\4\2\u00a0\32\3\2\2\2\u00a1"
      + "\u00a3\5#\20\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2"
      + "\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00aa\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"
      + "\u00a9\7,\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2"
      + "\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"
      + "\u00ae\7,\2\2\u00ae\u00af\7\61\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\f"
      + "\5\2\u00b1\34\3\2\2\2\u00b2\u00b3\7}\2\2\u00b3\u00b4\7B\2\2\u00b4\u00b5"
      + "\3\2\2\2\u00b5\u00b6\5\t\3\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\r\6\2\u00b8"
      + "\36\3\2\2\2\u00b9\u00ba\6\16\4\2\u00ba\u00bb\7B\2\2\u00bb\u00bc\5\t\3"
      + "\2\u00bc \3\2\2\2\u00bd\u00be\5\17\6\2\u00be\u00bf\3\2\2\2\u00bf\u00c0"
      + "\b\17\7\2\u00c0\u00c1\b\17\3\2\u00c1\"\3\2\2\2\u00c2\u00c3\5\21\7\2\u00c3"
      + "\u00c4\3\2\2\2\u00c4\u00c5\b\20\b\2\u00c5\u00c6\b\20\3\2\u00c6$\3\2\2"
      + "\2\u00c7\u00c8\7>\2\2\u00c8\u00c9\7\61\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb"
      + "\6\21\5\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b\21\t\2\u00cd&\3\2\2\2\u00ce"
      + "\u00cf\7>\2\2\u00cf\u00d0\6\22\6\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b\22"
      + "\t\2\u00d2(\3\2\2\2\u00d3\u00d5\13\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6"
      + "\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7*\3\2\2\2\u00d8"
      + "\u00d9\7\177\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\b\24\5\2\u00db,\3\2\2"
      + "\2\u00dc\u00dd\5\27\n\2\u00dd\u00de\3\2\2\2\u00de\u00df\b\25\n\2\u00df"
      + "\u00e0\b\25\4\2\u00e0.\3\2\2\2\u00e1\u00e2\5\17\6\2\u00e2\u00e3\3\2\2"
      + "\2\u00e3\u00e4\b\26\7\2\u00e4\u00e5\b\26\3\2\u00e5\60\3\2\2\2\u00e6\u00e7"
      + "\5\21\7\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\b\27\b\2\u00e9\u00ea\b\27\3"
      + "\2\u00ea\62\3\2\2\2\u00eb\u00ed\n\6\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee"
      + "\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\64\3\2\2\2\u00f0"
      + "\u00f1\7\61\2\2\u00f1\u00f2\7@\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b\31"
      + "\5\2\u00f4\66\3\2\2\2\u00f5\u00f6\7@\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8"
      + "\b\32\5\2\u00f88\3\2\2\2\u00f9\u00fa\5\27\n\2\u00fa\u00fb\3\2\2\2\u00fb"
      + "\u00fc\b\33\n\2\u00fc\u00fd\b\33\4\2\u00fd:\3\2\2\2\u00fe\u00ff\7?\2\2"
      + "\u00ff\u0100\3\2\2\2\u0100\u0101\b\34\13\2\u0101<\3\2\2\2\u0102\u0103"
      + "\5\17\6\2\u0103\u0104\3\2\2\2\u0104\u0105\b\35\7\2\u0105\u0106\b\35\3"
      + "\2\u0106>\3\2\2\2\u0107\u0108\5\21\7\2\u0108\u0109\3\2\2\2\u0109\u010a"
      + "\b\36\b\2\u010a\u010b\b\36\3\2\u010b@\3\2\2\2\u010c\u010d\t\7\2\2\u010d"
      + "B\3\2\2\2\u010e\u010f\t\b\2\2\u010fD\3\2\2\2\u0110\u0114\5C \2\u0111\u0113"
      + "\5A\37\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114"
      + "\u0115\3\2\2\2\u0115F\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\5\27\n\2"
      + "\u0118\u0119\3\2\2\2\u0119\u011a\b\"\n\2\u011a\u011b\b\"\4\2\u011bH\3"
      + "\2\2\2\u011c\u011e\t\t\2\2\u011d\u011c\3\2\2\2\u011eJ\3\2\2\2\u011f\u0121"
      + "\5I#\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122"
      + "\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\b$\5\2\u0125L\3\2\2\2\u0126"
      + "\u0128\7%\2\2\u0127\u0129\t\n\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2"
      + "\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c"
      + "\u012d\b%\5\2\u012dN\3\2\2\2\u012e\u0130\t\13\2\2\u012f\u012e\3\2\2\2"
      + "\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134"
      + "\3\2\2\2\u0133\u0135\7\'\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135"
      + "\u0136\3\2\2\2\u0136\u0137\b&\5\2\u0137P\3\2\2\2\u0138\u013c\7$\2\2\u0139"
      + "\u013b\13\2\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013d\3"
      + "\2\2\2\u013c\u013a\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f"
      + "\u0140\7$\2\2\u0140\u0141\3\2\2\2\u0141\u0142\b\'\5\2\u0142R\3\2\2\2\u0143"
      + "\u0147\7)\2\2\u0144\u0146\13\2\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2"
      + "\2\2\u0147\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014a\3\2\2\2\u0149"
      + "\u0147\3\2\2\2\u014a\u014b\7)\2\2\u014b\u014c\3\2\2\2\u014c\u014d\b(\5"
      + "\2\u014dT\3\2\2\2\u014e\u014f\5\17\6\2\u014f\u0150\3\2\2\2\u0150\u0151"
      + "\b)\7\2\u0151\u0152\b)\3\2\u0152V\3\2\2\2\u0153\u0154\5\21\7\2\u0154\u0155"
      + "\3\2\2\2\u0155\u0156\b*\b\2\u0156\u0157\b*\3\2\u0157X\3\2\2\2\34\2\3\4"
      + "\5\6`fot{\u0080\u008e\u0094\u009a\u00a4\u00aa\u00d6\u00ee\u0114\u011d"
      + "\u0122\u012a\u0131\u0134\u013c\u0147\f\7\3\2\2\3\2\2\4\2\6\2\2\7\4\2\t" + "\5\2\t\6\2\7\5\2\t\7\2\7\6\2";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}