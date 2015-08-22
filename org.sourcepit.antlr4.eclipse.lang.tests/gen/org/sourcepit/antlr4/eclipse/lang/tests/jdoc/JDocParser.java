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

import java.util.List;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class JDocParser extends Parser {
   static {
      RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, JDOC_START = 6, JDOC_END = 7, ID = 8,
      TAG_START = 9, TAG_END = 10, TAG_CLOSED = 11, CRLF = 12, LF = 13, CR = 14, WS = 15, WORD = 16;
   public static final int RULE_javaDoc = 0, RULE_line = 1, RULE_content = 2, RULE_linePrefix = 3, RULE_text = 4,
      RULE_at = 5, RULE_html = 6, RULE_nl = 7;
   public static final String[] ruleNames = { "javaDoc", "line", "content", "linePrefix", "text", "at", "html", "nl" };

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
   public ATN getATN() {
      return _ATN;
   }

   public JDocParser(TokenStream input) {
      super(input);
      _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   public static class JavaDocContext extends ParserRuleContext {
      public TerminalNode JDOC_START() {
         return getToken(JDocParser.JDOC_START, 0);
      }

      public TerminalNode JDOC_END() {
         return getToken(JDocParser.JDOC_END, 0);
      }

      public List<LineContext> line() {
         return getRuleContexts(LineContext.class);
      }

      public LineContext line(int i) {
         return getRuleContext(LineContext.class, i);
      }

      public JavaDocContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_javaDoc;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JDocListener)
            ((JDocListener) listener).enterJavaDoc(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JDocListener)
            ((JDocListener) listener).exitJavaDoc(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JDocVisitor)
            return ((JDocVisitor<? extends T>) visitor).visitJavaDoc(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final JavaDocContext javaDoc() throws RecognitionException {
      JavaDocContext _localctx = new JavaDocContext(_ctx, getState());
      enterRule(_localctx, 0, RULE_javaDoc);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(16);
            match(JDOC_START);
            setState(20);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3)
               | (1L << T__4) | (1L << JDOC_START) | (1L << ID) | (1L << TAG_START) | (1L << TAG_END)
               | (1L << TAG_CLOSED) | (1L << CRLF) | (1L << LF) | (1L << CR) | (1L << WS) | (1L << WORD))) != 0)) {
               {
                  {
                     setState(17);
                     line();
                  }
               }
               setState(22);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(23);
            match(JDOC_END);
         }
      }
      catch (RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      }
      finally {
         exitRule();
      }
      return _localctx;
   }

   public static class LineContext extends ParserRuleContext {
      public List<ContentContext> content() {
         return getRuleContexts(ContentContext.class);
      }

      public ContentContext content(int i) {
         return getRuleContext(ContentContext.class, i);
      }

      public NlContext nl() {
         return getRuleContext(NlContext.class, 0);
      }

      public LinePrefixContext linePrefix() {
         return getRuleContext(LinePrefixContext.class, 0);
      }

      public LineContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_line;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JDocListener)
            ((JDocListener) listener).enterLine(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JDocListener)
            ((JDocListener) listener).exitLine(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JDocVisitor)
            return ((JDocVisitor<? extends T>) visitor).visitLine(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LineContext line() throws RecognitionException {
      LineContext _localctx = new LineContext(_ctx, getState());
      enterRule(_localctx, 2, RULE_line);
      try {
         int _alt;
         setState(40);
         switch (_input.LA(1)) {
            case T__0 :
            case T__1 :
            case T__2 :
            case T__3 :
            case T__4 :
            case JDOC_START :
            case ID :
            case TAG_START :
            case TAG_END :
            case TAG_CLOSED :
            case WS :
            case WORD :
               enterOuterAlt(_localctx, 1); {
               setState(26);
               _errHandler.sync(this);
               _alt = 1;
               do {
                  switch (_alt) {
                     case 1 : {
                        {
                           setState(25);
                           content();
                        }
                     }
                        break;
                     default :
                        throw new NoViableAltException(this);
                  }
                  setState(28);
                  _errHandler.sync(this);
                  _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
               }
               while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
               break;
            case CRLF :
            case LF :
            case CR :
               enterOuterAlt(_localctx, 2); {
               setState(30);
               nl();
               setState(32);
               switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                  case 1 : {
                     setState(31);
                     linePrefix();
                  }
                     break;
               }
               setState(37);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
               while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                  if (_alt == 1) {
                     {
                        {
                           setState(34);
                           content();
                        }
                     }
                  }
                  setState(39);
                  _errHandler.sync(this);
                  _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
               }
            }
               break;
            default :
               throw new NoViableAltException(this);
         }
      }
      catch (RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      }
      finally {
         exitRule();
      }
      return _localctx;
   }

   public static class ContentContext extends ParserRuleContext {
      public TextContext text() {
         return getRuleContext(TextContext.class, 0);
      }

      public AtContext at() {
         return getRuleContext(AtContext.class, 0);
      }

      public HtmlContext html() {
         return getRuleContext(HtmlContext.class, 0);
      }

      public ContentContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_content;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JDocListener)
            ((JDocListener) listener).enterContent(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JDocListener)
            ((JDocListener) listener).exitContent(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JDocVisitor)
            return ((JDocVisitor<? extends T>) visitor).visitContent(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ContentContext content() throws RecognitionException {
      ContentContext _localctx = new ContentContext(_ctx, getState());
      enterRule(_localctx, 4, RULE_content);
      try {
         setState(45);
         switch (_input.LA(1)) {
            case T__0 :
            case T__1 :
            case T__2 :
            case T__3 :
            case T__4 :
            case JDOC_START :
            case WS :
            case WORD :
               enterOuterAlt(_localctx, 1); {
               setState(42);
               text();
            }
               break;
            case ID :
               enterOuterAlt(_localctx, 2); {
               setState(43);
               at();
            }
               break;
            case TAG_START :
            case TAG_END :
            case TAG_CLOSED :
               enterOuterAlt(_localctx, 3); {
               setState(44);
               html();
            }
               break;
            default :
               throw new NoViableAltException(this);
         }
      }
      catch (RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      }
      finally {
         exitRule();
      }
      return _localctx;
   }

   public static class LinePrefixContext extends ParserRuleContext {
      public List<TerminalNode> WS() {
         return getTokens(JDocParser.WS);
      }

      public TerminalNode WS(int i) {
         return getToken(JDocParser.WS, i);
      }

      public LinePrefixContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_linePrefix;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JDocListener)
            ((JDocListener) listener).enterLinePrefix(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JDocListener)
            ((JDocListener) listener).exitLinePrefix(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JDocVisitor)
            return ((JDocVisitor<? extends T>) visitor).visitLinePrefix(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LinePrefixContext linePrefix() throws RecognitionException {
      LinePrefixContext _localctx = new LinePrefixContext(_ctx, getState());
      enterRule(_localctx, 6, RULE_linePrefix);
      try {
         int _alt;
         setState(75);
         switch (_input.LA(1)) {
            case WS :
               enterOuterAlt(_localctx, 1); {
               setState(48);
               _errHandler.sync(this);
               _alt = 1;
               do {
                  switch (_alt) {
                     case 1 : {
                        {
                           setState(47);
                           match(WS);
                        }
                     }
                        break;
                     default :
                        throw new NoViableAltException(this);
                  }
                  setState(50);
                  _errHandler.sync(this);
                  _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
               }
               while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
               setState(55);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
               while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                  if (_alt == 1) {
                     {
                        {
                           setState(52);
                           match(T__0);
                        }
                     }
                  }
                  setState(57);
                  _errHandler.sync(this);
                  _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
               }
               setState(61);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
               while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                  if (_alt == 1) {
                     {
                        {
                           setState(58);
                           match(WS);
                        }
                     }
                  }
                  setState(63);
                  _errHandler.sync(this);
                  _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
               }
            }
               break;
            case T__0 :
               enterOuterAlt(_localctx, 2); {
               setState(65);
               _errHandler.sync(this);
               _alt = 1;
               do {
                  switch (_alt) {
                     case 1 : {
                        {
                           setState(64);
                           match(T__0);
                        }
                     }
                        break;
                     default :
                        throw new NoViableAltException(this);
                  }
                  setState(67);
                  _errHandler.sync(this);
                  _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
               }
               while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
               setState(72);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
               while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                  if (_alt == 1) {
                     {
                        {
                           setState(69);
                           match(WS);
                        }
                     }
                  }
                  setState(74);
                  _errHandler.sync(this);
                  _alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
               }
            }
               break;
            default :
               throw new NoViableAltException(this);
         }
      }
      catch (RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      }
      finally {
         exitRule();
      }
      return _localctx;
   }

   public static class TextContext extends ParserRuleContext {
      public List<TerminalNode> WORD() {
         return getTokens(JDocParser.WORD);
      }

      public TerminalNode WORD(int i) {
         return getToken(JDocParser.WORD, i);
      }

      public List<TerminalNode> WS() {
         return getTokens(JDocParser.WS);
      }

      public TerminalNode WS(int i) {
         return getToken(JDocParser.WS, i);
      }

      public List<TerminalNode> JDOC_START() {
         return getTokens(JDocParser.JDOC_START);
      }

      public TerminalNode JDOC_START(int i) {
         return getToken(JDocParser.JDOC_START, i);
      }

      public TextContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_text;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JDocListener)
            ((JDocListener) listener).enterText(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JDocListener)
            ((JDocListener) listener).exitText(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JDocVisitor)
            return ((JDocVisitor<? extends T>) visitor).visitText(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TextContext text() throws RecognitionException {
      TextContext _localctx = new TextContext(_ctx, getState());
      enterRule(_localctx, 8, RULE_text);
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(78);
            _errHandler.sync(this);
            _alt = 1;
            do {
               switch (_alt) {
                  case 1 : {
                     {
                        setState(77);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2)
                           | (1L << T__3) | (1L << T__4) | (1L << JDOC_START) | (1L << WS) | (1L << WORD))) != 0))) {
                           _errHandler.recoverInline(this);
                        }
                        else {
                           consume();
                        }
                     }
                  }
                     break;
                  default :
                     throw new NoViableAltException(this);
               }
               setState(80);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
            }
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
         }
      }
      catch (RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      }
      finally {
         exitRule();
      }
      return _localctx;
   }

   public static class AtContext extends ParserRuleContext {
      public TerminalNode ID() {
         return getToken(JDocParser.ID, 0);
      }

      public List<TerminalNode> WS() {
         return getTokens(JDocParser.WS);
      }

      public TerminalNode WS(int i) {
         return getToken(JDocParser.WS, i);
      }

      public List<ContentContext> content() {
         return getRuleContexts(ContentContext.class);
      }

      public ContentContext content(int i) {
         return getRuleContext(ContentContext.class, i);
      }

      public AtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_at;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JDocListener)
            ((JDocListener) listener).enterAt(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JDocListener)
            ((JDocListener) listener).exitAt(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JDocVisitor)
            return ((JDocVisitor<? extends T>) visitor).visitAt(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AtContext at() throws RecognitionException {
      AtContext _localctx = new AtContext(_ctx, getState());
      enterRule(_localctx, 10, RULE_at);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(82);
            match(ID);
            setState(86);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(83);
                        match(WS);
                     }
                  }
               }
               setState(88);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
            }
            setState(92);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(89);
                        content();
                     }
                  }
               }
               setState(94);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
            }
         }
      }
      catch (RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      }
      finally {
         exitRule();
      }
      return _localctx;
   }

   public static class HtmlContext extends ParserRuleContext {
      public TerminalNode TAG_START() {
         return getToken(JDocParser.TAG_START, 0);
      }

      public TerminalNode TAG_END() {
         return getToken(JDocParser.TAG_END, 0);
      }

      public List<ContentContext> content() {
         return getRuleContexts(ContentContext.class);
      }

      public ContentContext content(int i) {
         return getRuleContext(ContentContext.class, i);
      }

      public TerminalNode TAG_CLOSED() {
         return getToken(JDocParser.TAG_CLOSED, 0);
      }

      public HtmlContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_html;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JDocListener)
            ((JDocListener) listener).enterHtml(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JDocListener)
            ((JDocListener) listener).exitHtml(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JDocVisitor)
            return ((JDocVisitor<? extends T>) visitor).visitHtml(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final HtmlContext html() throws RecognitionException {
      HtmlContext _localctx = new HtmlContext(_ctx, getState());
      enterRule(_localctx, 12, RULE_html);
      try {
         int _alt;
         setState(107);
         switch (_input.LA(1)) {
            case TAG_START :
               enterOuterAlt(_localctx, 1); {
               setState(95);
               match(TAG_START);
               setState(103);
               switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                  case 1 : {
                     setState(99);
                     _errHandler.sync(this);
                     _alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
                     while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                           {
                              {
                                 setState(96);
                                 content();
                              }
                           }
                        }
                        setState(101);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
                     }
                     setState(102);
                     match(TAG_END);
                  }
                     break;
               }
            }
               break;
            case TAG_END :
               enterOuterAlt(_localctx, 2); {
               setState(105);
               match(TAG_END);
            }
               break;
            case TAG_CLOSED :
               enterOuterAlt(_localctx, 3); {
               setState(106);
               match(TAG_CLOSED);
            }
               break;
            default :
               throw new NoViableAltException(this);
         }
      }
      catch (RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      }
      finally {
         exitRule();
      }
      return _localctx;
   }

   public static class NlContext extends ParserRuleContext {
      public TerminalNode CRLF() {
         return getToken(JDocParser.CRLF, 0);
      }

      public TerminalNode LF() {
         return getToken(JDocParser.LF, 0);
      }

      public TerminalNode CR() {
         return getToken(JDocParser.CR, 0);
      }

      public NlContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_nl;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JDocListener)
            ((JDocListener) listener).enterNl(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JDocListener)
            ((JDocListener) listener).exitNl(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JDocVisitor)
            return ((JDocVisitor<? extends T>) visitor).visitNl(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final NlContext nl() throws RecognitionException {
      NlContext _localctx = new NlContext(_ctx, getState());
      enterRule(_localctx, 14, RULE_nl);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(109);
            _la = _input.LA(1);
            if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CRLF) | (1L << LF) | (1L << CR))) != 0))) {
               _errHandler.recoverInline(this);
            }
            else {
               consume();
            }
         }
      }
      catch (RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      }
      finally {
         exitRule();
      }
      return _localctx;
   }

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22r\4\2\t\2\4\3\t"
      + "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25\n\2"
      + "\f\2\16\2\30\13\2\3\2\3\2\3\3\6\3\35\n\3\r\3\16\3\36\3\3\3\3\5\3#\n\3"
      + "\3\3\7\3&\n\3\f\3\16\3)\13\3\5\3+\n\3\3\4\3\4\3\4\5\4\60\n\4\3\5\6\5\63"
      + "\n\5\r\5\16\5\64\3\5\7\58\n\5\f\5\16\5;\13\5\3\5\7\5>\n\5\f\5\16\5A\13"
      + "\5\3\5\6\5D\n\5\r\5\16\5E\3\5\7\5I\n\5\f\5\16\5L\13\5\5\5N\n\5\3\6\6\6"
      + "Q\n\6\r\6\16\6R\3\7\3\7\7\7W\n\7\f\7\16\7Z\13\7\3\7\7\7]\n\7\f\7\16\7"
      + "`\13\7\3\b\3\b\7\bd\n\b\f\b\16\bg\13\b\3\b\5\bj\n\b\3\b\3\b\5\bn\n\b\3"
      + "\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\4\4\2\3\b\21\22\3\2\16\20}\2\22\3"
      + "\2\2\2\4*\3\2\2\2\6/\3\2\2\2\bM\3\2\2\2\nP\3\2\2\2\fT\3\2\2\2\16m\3\2"
      + "\2\2\20o\3\2\2\2\22\26\7\b\2\2\23\25\5\4\3\2\24\23\3\2\2\2\25\30\3\2\2"
      + "\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32\7\t\2"
      + "\2\32\3\3\2\2\2\33\35\5\6\4\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2"
      + "\2\36\37\3\2\2\2\37+\3\2\2\2 \"\5\20\t\2!#\5\b\5\2\"!\3\2\2\2\"#\3\2\2"
      + "\2#\'\3\2\2\2$&\5\6\4\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(+\3"
      + "\2\2\2)\'\3\2\2\2*\34\3\2\2\2* \3\2\2\2+\5\3\2\2\2,\60\5\n\6\2-\60\5\f"
      + "\7\2.\60\5\16\b\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\7\3\2\2\2\61\63\7\21"
      + "\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\659\3\2\2"
      + "\2\668\7\3\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:?\3\2\2\2"
      + ";9\3\2\2\2<>\7\21\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@N\3\2\2"
      + "\2A?\3\2\2\2BD\7\3\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FJ\3\2\2"
      + "\2GI\7\21\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2\2LJ\3\2"
      + "\2\2M\62\3\2\2\2MC\3\2\2\2N\t\3\2\2\2OQ\t\2\2\2PO\3\2\2\2QR\3\2\2\2RP"
      + "\3\2\2\2RS\3\2\2\2S\13\3\2\2\2TX\7\n\2\2UW\7\21\2\2VU\3\2\2\2WZ\3\2\2"
      + "\2XV\3\2\2\2XY\3\2\2\2Y^\3\2\2\2ZX\3\2\2\2[]\5\6\4\2\\[\3\2\2\2]`\3\2"
      + "\2\2^\\\3\2\2\2^_\3\2\2\2_\r\3\2\2\2`^\3\2\2\2ai\7\13\2\2bd\5\6\4\2cb"
      + "\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hj\7\f\2\2i"
      + "e\3\2\2\2ij\3\2\2\2jn\3\2\2\2kn\7\f\2\2ln\7\r\2\2ma\3\2\2\2mk\3\2\2\2"
      + "ml\3\2\2\2n\17\3\2\2\2op\t\3\2\2p\21\3\2\2\2\24\26\36\"\'*/\649?EJMRX" + "^eim";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}