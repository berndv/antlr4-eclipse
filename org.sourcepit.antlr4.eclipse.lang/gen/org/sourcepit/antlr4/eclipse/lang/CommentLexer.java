// Generated from CommentLexer.g4 by ANTLR 4.5.1

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

package org.sourcepit.antlr4.eclipse.lang;

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
public class CommentLexer extends org.sourcepit.antlr4.eclipse.lang.AbstractCommentLexer {
   static {
      RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int DocCommentStart = 1, BlockCommentStart = 2, LineCommentStart = 3, Nl = 4, Ws = 5,
      CommentText = 6, BlockCommentLinePrefix = 7, BlockCommentEnd = 8;
   public static final int BLOCK_COMMENT = 1;
   public static final int LINE_COMMENT = 2;
   public static String[] modeNames = { "DEFAULT_MODE", "BLOCK_COMMENT", "LINE_COMMENT" };

   public static final String[] ruleNames = { "DocCommentStart", "BlockCommentStart", "LineCommentStart", "CommonNl",
      "CommonWs", "Nl", "Ws", "CommonText", "CommentText", "BlockCommentLinePrefix", "BlockCommentEnd",
      "BlockCommentNl", "BlockCommentWs", "BlockCommentText", "LineCommentNl", "LineCommentWs", "LineCommentText" };

   private static final String[] _LITERAL_NAMES = {};
   private static final String[] _SYMBOLIC_NAMES = { null, "DocCommentStart", "BlockCommentStart", "LineCommentStart",
      "Nl", "Ws", "CommentText", "BlockCommentLinePrefix", "BlockCommentEnd" };
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


   public CommentLexer(CharStream input) {
      super(input);
      _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   @Override
   public String getGrammarFileName() {
      return "CommentLexer.g4";
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
         case 9 :
            return BlockCommentLinePrefix_sempred((RuleContext) _localctx, predIndex);
      }
      return true;
   }

   private boolean BlockCommentLinePrefix_sempred(RuleContext _localctx, int predIndex) {
      switch (predIndex) {
         case 0 :
            return isChar(LA(-1), '\n', '\r');
         case 1 :
            return isNotChar(LA(1), '/');
      }
      return true;
   }

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\u00ab\b\1\b\1\b"
      + "\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"
      + "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"
      + "\4\22\t\22\3\2\3\2\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\7\2\63\n"
      + "\2\f\2\16\2\66\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\3"
      + "\3\3\3\3\4\3\4\3\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\4\3\4\3\5\3\5\3\5\5\5"
      + "S\n\5\3\6\6\6V\n\6\r\6\16\6W\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\6\tc"
      + "\n\t\r\t\16\td\3\n\3\n\3\13\3\13\7\13k\n\13\f\13\16\13n\13\13\3\13\6\13"
      + "q\n\13\r\13\16\13r\3\13\3\13\7\13w\n\13\f\13\16\13z\13\13\3\13\3\13\3"
      + "\f\7\f\177\n\f\f\f\16\f\u0082\13\f\3\f\7\f\u0085\n\f\f\f\16\f\u0088\13"
      + "\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"
      + "\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"
      + "\21\3\22\3\22\3\22\3\22\3d\2\23\5\3\7\4\t\5\13\2\r\2\17\6\21\7\23\2\25"
      + "\b\27\t\31\n\33\2\35\2\37\2!\2#\2%\2\5\2\3\4\4\4\2\f\f\17\17\5\2\13\13"
      + "\16\16\"\"\u00b1\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\17\3\2\2\2\2\21"
      + "\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\3\31\3\2\2\2\3\33\3\2\2\2\3\35\3\2"
      + "\2\2\3\37\3\2\2\2\4!\3\2\2\2\4#\3\2\2\2\4%\3\2\2\2\5\'\3\2\2\2\79\3\2"
      + "\2\2\tD\3\2\2\2\13R\3\2\2\2\rU\3\2\2\2\17Y\3\2\2\2\21]\3\2\2\2\23b\3\2"
      + "\2\2\25f\3\2\2\2\27h\3\2\2\2\31\u0080\3\2\2\2\33\u008e\3\2\2\2\35\u0093"
      + "\3\2\2\2\37\u0098\3\2\2\2!\u009c\3\2\2\2#\u00a2\3\2\2\2%\u00a7\3\2\2\2"
      + "\'(\7\61\2\2()\7,\2\2)*\7,\2\2*.\3\2\2\2+-\7,\2\2,+\3\2\2\2-\60\3\2\2"
      + "\2.,\3\2\2\2./\3\2\2\2/\64\3\2\2\2\60.\3\2\2\2\61\63\5\21\b\2\62\61\3"
      + "\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3"
      + "\2\2\2\678\b\2\2\28\6\3\2\2\29:\7\61\2\2:;\7,\2\2;?\3\2\2\2<>\5\21\b\2"
      + "=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\b\3\2\2"
      + "C\b\3\2\2\2DE\7\61\2\2EF\7\61\2\2FJ\3\2\2\2GI\5\21\b\2HG\3\2\2\2IL\3\2"
      + "\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\b\4\3\2N\n\3\2\2\2OP\7"
      + "\17\2\2PS\7\f\2\2QS\t\2\2\2RO\3\2\2\2RQ\3\2\2\2S\f\3\2\2\2TV\t\3\2\2U"
      + "T\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\16\3\2\2\2YZ\5\13\5\2Z[\3\2\2"
      + "\2[\\\b\7\4\2\\\20\3\2\2\2]^\5\r\6\2^_\3\2\2\2_`\b\b\4\2`\22\3\2\2\2a"
      + "c\13\2\2\2ba\3\2\2\2cd\3\2\2\2de\3\2\2\2db\3\2\2\2e\24\3\2\2\2fg\5\23"
      + "\t\2g\26\3\2\2\2hl\6\13\2\2ik\5\35\16\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2"
      + "lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2oq\7,\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2"
      + "rs\3\2\2\2st\3\2\2\2tx\6\13\3\2uw\5\35\16\2vu\3\2\2\2wz\3\2\2\2xv\3\2"
      + "\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\b\13\5\2|\30\3\2\2\2}\177\5\35\16"
      + "\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"
      + "\u0086\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\7,\2\2\u0084\u0083\3\2"
      + "\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"
      + "\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7,\2\2\u008a\u008b\7\61"
      + "\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\f\6\2\u008d\32\3\2\2\2\u008e\u008f"
      + "\5\13\5\2\u008f\u0090\3\2\2\2\u0090\u0091\b\r\7\2\u0091\u0092\b\r\4\2"
      + "\u0092\34\3\2\2\2\u0093\u0094\5\r\6\2\u0094\u0095\3\2\2\2\u0095\u0096"
      + "\b\16\b\2\u0096\u0097\b\16\4\2\u0097\36\3\2\2\2\u0098\u0099\5\23\t\2\u0099"
      + "\u009a\3\2\2\2\u009a\u009b\b\17\t\2\u009b \3\2\2\2\u009c\u009d\5\13\5"
      + "\2\u009d\u009e\3\2\2\2\u009e\u009f\b\20\7\2\u009f\u00a0\b\20\4\2\u00a0"
      + "\u00a1\b\20\6\2\u00a1\"\3\2\2\2\u00a2\u00a3\5\r\6\2\u00a3\u00a4\3\2\2"
      + "\2\u00a4\u00a5\b\21\b\2\u00a5\u00a6\b\21\4\2\u00a6$\3\2\2\2\u00a7\u00a8"
      + "\5\23\t\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\22\t\2\u00aa&\3\2\2\2\21\2"
      + "\3\4.\64?JRWdlrx\u0080\u0086\n\7\3\2\7\4\2\2\3\2\2\4\2\6\2\2\t\6\2\t\7" + "\2\t\b\2";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}