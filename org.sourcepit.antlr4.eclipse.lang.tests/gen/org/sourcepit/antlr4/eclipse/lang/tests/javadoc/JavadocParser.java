// Generated from Javadoc.g4 by ANTLR 4.5

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

package org.sourcepit.antlr4.eclipse.lang.tests.javadoc;

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
public class JavadocParser extends Parser {
   static {
      RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int T__0 = 1, T__1 = 2, AT = 3, STAR = 4, WORD = 5, NL = 6, WS = 7;
   public static final int RULE_javadoc = 0, RULE_javadocStart = 1, RULE_javadocEnd = 2, RULE_mainDescription = 3,
      RULE_line = 4, RULE_prefix = 5, RULE_text = 6, RULE_tagSection = 7, RULE_tag = 8, RULE_tagName = 9;
   public static final String[] ruleNames = { "javadoc", "javadocStart", "javadocEnd", "mainDescription", "line",
      "prefix", "text", "tagSection", "tag", "tagName" };

   private static final String[] _LITERAL_NAMES = { null, "'/**'", "'*/'", "'@'", "'*'" };
   private static final String[] _SYMBOLIC_NAMES = { null, null, null, "AT", "STAR", "WORD", "NL", "WS" };
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
      return "Javadoc.g4";
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

   public JavadocParser(TokenStream input) {
      super(input);
      _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   public static class JavadocContext extends ParserRuleContext {
      public JavadocStartContext javadocStart() {
         return getRuleContext(JavadocStartContext.class, 0);
      }

      public JavadocEndContext javadocEnd() {
         return getRuleContext(JavadocEndContext.class, 0);
      }

      public MainDescriptionContext mainDescription() {
         return getRuleContext(MainDescriptionContext.class, 0);
      }

      public TagSectionContext tagSection() {
         return getRuleContext(TagSectionContext.class, 0);
      }

      public JavadocContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_javadoc;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).enterJavadoc(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).exitJavadoc(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JavadocVisitor)
            return ((JavadocVisitor<? extends T>) visitor).visitJavadoc(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final JavadocContext javadoc() throws RecognitionException {
      JavadocContext _localctx = new JavadocContext(_ctx, getState());
      enterRule(_localctx, 0, RULE_javadoc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(20);
            javadocStart();
            setState(22);
            switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
               case 1 : {
                  setState(21);
                  mainDescription();
               }
                  break;
            }
            setState(25);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
               case 1 : {
                  setState(24);
                  tagSection();
               }
                  break;
            }
            setState(27);
            javadocEnd();
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

   public static class JavadocStartContext extends ParserRuleContext {
      public List<TerminalNode> STAR() {
         return getTokens(JavadocParser.STAR);
      }

      public TerminalNode STAR(int i) {
         return getToken(JavadocParser.STAR, i);
      }

      public List<TerminalNode> WS() {
         return getTokens(JavadocParser.WS);
      }

      public TerminalNode WS(int i) {
         return getToken(JavadocParser.WS, i);
      }

      public TerminalNode NL() {
         return getToken(JavadocParser.NL, 0);
      }

      public JavadocStartContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_javadocStart;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).enterJavadocStart(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).exitJavadocStart(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JavadocVisitor)
            return ((JavadocVisitor<? extends T>) visitor).visitJavadocStart(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final JavadocStartContext javadocStart() throws RecognitionException {
      JavadocStartContext _localctx = new JavadocStartContext(_ctx, getState());
      enterRule(_localctx, 2, RULE_javadocStart);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(29);
            match(T__0);
            setState(33);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(30);
                        match(STAR);
                     }
                  }
               }
               setState(35);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
            }
            setState(39);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(36);
                        match(WS);
                     }
                  }
               }
               setState(41);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
            }
            setState(43);
            switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
               case 1 : {
                  setState(42);
                  match(NL);
               }
                  break;
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

   public static class JavadocEndContext extends ParserRuleContext {
      public List<TerminalNode> WS() {
         return getTokens(JavadocParser.WS);
      }

      public TerminalNode WS(int i) {
         return getToken(JavadocParser.WS, i);
      }

      public List<TerminalNode> STAR() {
         return getTokens(JavadocParser.STAR);
      }

      public TerminalNode STAR(int i) {
         return getToken(JavadocParser.STAR, i);
      }

      public JavadocEndContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_javadocEnd;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).enterJavadocEnd(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).exitJavadocEnd(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JavadocVisitor)
            return ((JavadocVisitor<? extends T>) visitor).visitJavadocEnd(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final JavadocEndContext javadocEnd() throws RecognitionException {
      JavadocEndContext _localctx = new JavadocEndContext(_ctx, getState());
      enterRule(_localctx, 4, RULE_javadocEnd);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(48);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == WS) {
               {
                  {
                     setState(45);
                     match(WS);
                  }
               }
               setState(50);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(54);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == STAR) {
               {
                  {
                     setState(51);
                     match(STAR);
                  }
               }
               setState(56);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(57);
            match(T__1);
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

   public static class MainDescriptionContext extends ParserRuleContext {
      public List<LineContext> line() {
         return getRuleContexts(LineContext.class);
      }

      public LineContext line(int i) {
         return getRuleContext(LineContext.class, i);
      }

      public MainDescriptionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_mainDescription;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).enterMainDescription(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).exitMainDescription(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JavadocVisitor)
            return ((JavadocVisitor<? extends T>) visitor).visitMainDescription(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MainDescriptionContext mainDescription() throws RecognitionException {
      MainDescriptionContext _localctx = new MainDescriptionContext(_ctx, getState());
      enterRule(_localctx, 6, RULE_mainDescription);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(60);
            _errHandler.sync(this);
            _alt = 1;
            do {
               switch (_alt) {
                  case 1 : {
                     {
                        setState(59);
                        line();
                     }
                  }
                     break;
                  default :
                     throw new NoViableAltException(this);
               }
               setState(62);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
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

   public static class LineContext extends ParserRuleContext {
      public TextContext text() {
         return getRuleContext(TextContext.class, 0);
      }

      public PrefixContext prefix() {
         return getRuleContext(PrefixContext.class, 0);
      }

      public TerminalNode NL() {
         return getToken(JavadocParser.NL, 0);
      }

      public List<TerminalNode> WS() {
         return getTokens(JavadocParser.WS);
      }

      public TerminalNode WS(int i) {
         return getToken(JavadocParser.WS, i);
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
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).enterLine(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).exitLine(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JavadocVisitor)
            return ((JavadocVisitor<? extends T>) visitor).visitLine(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LineContext line() throws RecognitionException {
      LineContext _localctx = new LineContext(_ctx, getState());
      enterRule(_localctx, 8, RULE_line);
      int _la;
      try {
         setState(81);
         switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(65);
               switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                  case 1 : {
                     setState(64);
                     prefix();
                  }
                     break;
               }
               setState(67);
               text();
               setState(69);
               switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
                  case 1 : {
                     setState(68);
                     match(NL);
                  }
                     break;
               }
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(71);
               prefix();
               setState(72);
               match(NL);
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(77);
               _errHandler.sync(this);
               _la = _input.LA(1);
               while (_la == WS) {
                  {
                     {
                        setState(74);
                        match(WS);
                     }
                  }
                  setState(79);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
               }
               setState(80);
               match(NL);
            }
               break;
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

   public static class PrefixContext extends ParserRuleContext {
      public List<TerminalNode> WS() {
         return getTokens(JavadocParser.WS);
      }

      public TerminalNode WS(int i) {
         return getToken(JavadocParser.WS, i);
      }

      public List<TerminalNode> STAR() {
         return getTokens(JavadocParser.STAR);
      }

      public TerminalNode STAR(int i) {
         return getToken(JavadocParser.STAR, i);
      }

      public PrefixContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_prefix;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).enterPrefix(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).exitPrefix(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JavadocVisitor)
            return ((JavadocVisitor<? extends T>) visitor).visitPrefix(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PrefixContext prefix() throws RecognitionException {
      PrefixContext _localctx = new PrefixContext(_ctx, getState());
      enterRule(_localctx, 10, RULE_prefix);
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(86);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == WS) {
               {
                  {
                     setState(83);
                     match(WS);
                  }
               }
               setState(88);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(90);
            _errHandler.sync(this);
            _alt = 1;
            do {
               switch (_alt) {
                  case 1 : {
                     {
                        setState(89);
                        match(STAR);
                     }
                  }
                     break;
                  default :
                     throw new NoViableAltException(this);
               }
               setState(92);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
            }
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            setState(97);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(94);
                        match(WS);
                     }
                  }
               }
               setState(99);
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

   public static class TextContext extends ParserRuleContext {
      public List<TerminalNode> WORD() {
         return getTokens(JavadocParser.WORD);
      }

      public TerminalNode WORD(int i) {
         return getToken(JavadocParser.WORD, i);
      }

      public List<TerminalNode> STAR() {
         return getTokens(JavadocParser.STAR);
      }

      public TerminalNode STAR(int i) {
         return getToken(JavadocParser.STAR, i);
      }

      public List<TerminalNode> WS() {
         return getTokens(JavadocParser.WS);
      }

      public TerminalNode WS(int i) {
         return getToken(JavadocParser.WS, i);
      }

      public List<TerminalNode> AT() {
         return getTokens(JavadocParser.AT);
      }

      public TerminalNode AT(int i) {
         return getToken(JavadocParser.AT, i);
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
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).enterText(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).exitText(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JavadocVisitor)
            return ((JavadocVisitor<? extends T>) visitor).visitText(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TextContext text() throws RecognitionException {
      TextContext _localctx = new TextContext(_ctx, getState());
      enterRule(_localctx, 12, RULE_text);
      int _la;
      try {
         int _alt;
         setState(128);
         switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(107);
               _errHandler.sync(this);
               _alt = 1;
               do {
                  switch (_alt) {
                     case 1 : {
                        {
                           setState(100);
                           _la = _input.LA(1);
                           if (!(_la == STAR || _la == WORD)) {
                              _errHandler.recoverInline(this);
                           }
                           else {
                              consume();
                           }
                           setState(104);
                           _errHandler.sync(this);
                           _alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
                           while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                              if (_alt == 1) {
                                 {
                                    {
                                       setState(101);
                                       _la = _input.LA(1);
                                       if (!((((_la) & ~0x3f) == 0 && ((1L << _la)
                                          & ((1L << AT) | (1L << STAR) | (1L << WORD) | (1L << WS))) != 0))) {
                                          _errHandler.recoverInline(this);
                                       }
                                       else {
                                          consume();
                                       }
                                    }
                                 }
                              }
                              setState(106);
                              _errHandler.sync(this);
                              _alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
                           }
                        }
                     }
                        break;
                     default :
                        throw new NoViableAltException(this);
                  }
                  setState(109);
                  _errHandler.sync(this);
                  _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
               }
               while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(124);
               _errHandler.sync(this);
               _alt = 1;
               do {
                  switch (_alt) {
                     case 1 : {
                        {
                           setState(114);
                           _errHandler.sync(this);
                           _la = _input.LA(1);
                           while (_la == WS) {
                              {
                                 {
                                    setState(111);
                                    match(WS);
                                 }
                              }
                              setState(116);
                              _errHandler.sync(this);
                              _la = _input.LA(1);
                           }
                           setState(117);
                           match(WORD);
                           setState(121);
                           _errHandler.sync(this);
                           _alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
                           while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                              if (_alt == 1) {
                                 {
                                    {
                                       setState(118);
                                       _la = _input.LA(1);
                                       if (!((((_la) & ~0x3f) == 0 && ((1L << _la)
                                          & ((1L << AT) | (1L << STAR) | (1L << WORD) | (1L << WS))) != 0))) {
                                          _errHandler.recoverInline(this);
                                       }
                                       else {
                                          consume();
                                       }
                                    }
                                 }
                              }
                              setState(123);
                              _errHandler.sync(this);
                              _alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
                           }
                        }
                     }
                        break;
                     default :
                        throw new NoViableAltException(this);
                  }
                  setState(126);
                  _errHandler.sync(this);
                  _alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
               }
               while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
               break;
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

   public static class TagSectionContext extends ParserRuleContext {
      public List<TagContext> tag() {
         return getRuleContexts(TagContext.class);
      }

      public TagContext tag(int i) {
         return getRuleContext(TagContext.class, i);
      }

      public TagSectionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_tagSection;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).enterTagSection(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).exitTagSection(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JavadocVisitor)
            return ((JavadocVisitor<? extends T>) visitor).visitTagSection(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TagSectionContext tagSection() throws RecognitionException {
      TagSectionContext _localctx = new TagSectionContext(_ctx, getState());
      enterRule(_localctx, 14, RULE_tagSection);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(131);
            _errHandler.sync(this);
            _alt = 1;
            do {
               switch (_alt) {
                  case 1 : {
                     {
                        setState(130);
                        tag();
                     }
                  }
                     break;
                  default :
                     throw new NoViableAltException(this);
               }
               setState(133);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
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

   public static class TagContext extends ParserRuleContext {
      public TerminalNode AT() {
         return getToken(JavadocParser.AT, 0);
      }

      public PrefixContext prefix() {
         return getRuleContext(PrefixContext.class, 0);
      }

      public TagNameContext tagName() {
         return getRuleContext(TagNameContext.class, 0);
      }

      public List<TerminalNode> WS() {
         return getTokens(JavadocParser.WS);
      }

      public TerminalNode WS(int i) {
         return getToken(JavadocParser.WS, i);
      }

      public List<LineContext> line() {
         return getRuleContexts(LineContext.class);
      }

      public LineContext line(int i) {
         return getRuleContext(LineContext.class, i);
      }

      public TagContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_tag;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).enterTag(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).exitTag(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JavadocVisitor)
            return ((JavadocVisitor<? extends T>) visitor).visitTag(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TagContext tag() throws RecognitionException {
      TagContext _localctx = new TagContext(_ctx, getState());
      enterRule(_localctx, 16, RULE_tag);
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(136);
            _la = _input.LA(1);
            if (_la == STAR || _la == WS) {
               {
                  setState(135);
                  prefix();
               }
            }

            setState(138);
            match(AT);
            setState(140);
            switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
               case 1 : {
                  setState(139);
                  tagName();
               }
                  break;
            }
            setState(145);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 24, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(142);
                        match(WS);
                     }
                  }
               }
               setState(147);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 24, _ctx);
            }
            setState(151);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 25, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(148);
                        line();
                     }
                  }
               }
               setState(153);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 25, _ctx);
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

   public static class TagNameContext extends ParserRuleContext {
      public List<TerminalNode> WORD() {
         return getTokens(JavadocParser.WORD);
      }

      public TerminalNode WORD(int i) {
         return getToken(JavadocParser.WORD, i);
      }

      public List<TerminalNode> AT() {
         return getTokens(JavadocParser.AT);
      }

      public TerminalNode AT(int i) {
         return getToken(JavadocParser.AT, i);
      }

      public List<TerminalNode> STAR() {
         return getTokens(JavadocParser.STAR);
      }

      public TerminalNode STAR(int i) {
         return getToken(JavadocParser.STAR, i);
      }

      public TagNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_tagName;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).enterTagName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JavadocListener)
            ((JavadocListener) listener).exitTagName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JavadocVisitor)
            return ((JavadocVisitor<? extends T>) visitor).visitTagName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TagNameContext tagName() throws RecognitionException {
      TagNameContext _localctx = new TagNameContext(_ctx, getState());
      enterRule(_localctx, 18, RULE_tagName);
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(155);
            _errHandler.sync(this);
            _alt = 1;
            do {
               switch (_alt) {
                  case 1 : {
                     {
                        setState(154);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0
                           && ((1L << _la) & ((1L << AT) | (1L << STAR) | (1L << WORD))) != 0))) {
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
               setState(157);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
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

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t\u00a2\4\2\t\2\4"
      + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
      + "\13\3\2\3\2\5\2\31\n\2\3\2\5\2\34\n\2\3\2\3\2\3\3\3\3\7\3\"\n\3\f\3\16"
      + "\3%\13\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\5\3.\n\3\3\4\7\4\61\n\4\f\4\16"
      + "\4\64\13\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\3\4\3\5\6\5?\n\5\r\5\16\5"
      + "@\3\6\5\6D\n\6\3\6\3\6\5\6H\n\6\3\6\3\6\3\6\3\6\7\6N\n\6\f\6\16\6Q\13"
      + "\6\3\6\5\6T\n\6\3\7\7\7W\n\7\f\7\16\7Z\13\7\3\7\6\7]\n\7\r\7\16\7^\3\7"
      + "\7\7b\n\7\f\7\16\7e\13\7\3\b\3\b\7\bi\n\b\f\b\16\bl\13\b\6\bn\n\b\r\b"
      + "\16\bo\3\b\7\bs\n\b\f\b\16\bv\13\b\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\6\b"
      + "\177\n\b\r\b\16\b\u0080\5\b\u0083\n\b\3\t\6\t\u0086\n\t\r\t\16\t\u0087"
      + "\3\n\5\n\u008b\n\n\3\n\3\n\5\n\u008f\n\n\3\n\7\n\u0092\n\n\f\n\16\n\u0095"
      + "\13\n\3\n\7\n\u0098\n\n\f\n\16\n\u009b\13\n\3\13\6\13\u009e\n\13\r\13"
      + "\16\13\u009f\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\5\3\2\6\7\4\2\5\7\t"
      + "\t\3\2\5\7\u00b3\2\26\3\2\2\2\4\37\3\2\2\2\6\62\3\2\2\2\b>\3\2\2\2\nS"
      + "\3\2\2\2\fX\3\2\2\2\16\u0082\3\2\2\2\20\u0085\3\2\2\2\22\u008a\3\2\2\2"
      + "\24\u009d\3\2\2\2\26\30\5\4\3\2\27\31\5\b\5\2\30\27\3\2\2\2\30\31\3\2"
      + "\2\2\31\33\3\2\2\2\32\34\5\20\t\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35\3"
      + "\2\2\2\35\36\5\6\4\2\36\3\3\2\2\2\37#\7\3\2\2 \"\7\6\2\2! \3\2\2\2\"%"
      + "\3\2\2\2#!\3\2\2\2#$\3\2\2\2$)\3\2\2\2%#\3\2\2\2&(\7\t\2\2\'&\3\2\2\2"
      + "(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*-\3\2\2\2+)\3\2\2\2,.\7\b\2\2-,\3\2\2"
      + "\2-.\3\2\2\2.\5\3\2\2\2/\61\7\t\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3"
      + "\2\2\2\62\63\3\2\2\2\638\3\2\2\2\64\62\3\2\2\2\65\67\7\6\2\2\66\65\3\2"
      + "\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\4\2\2<"
      + "\7\3\2\2\2=?\5\n\6\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\t\3\2\2"
      + "\2BD\5\f\7\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EG\5\16\b\2FH\7\b\2\2GF\3\2"
      + "\2\2GH\3\2\2\2HT\3\2\2\2IJ\5\f\7\2JK\7\b\2\2KT\3\2\2\2LN\7\t\2\2ML\3\2"
      + "\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RT\7\b\2\2SC\3\2"
      + "\2\2SI\3\2\2\2SO\3\2\2\2T\13\3\2\2\2UW\7\t\2\2VU\3\2\2\2WZ\3\2\2\2XV\3"
      + "\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2[]\7\6\2\2\\[\3\2\2\2]^\3\2\2\2^"
      + "\\\3\2\2\2^_\3\2\2\2_c\3\2\2\2`b\7\t\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2"
      + "cd\3\2\2\2d\r\3\2\2\2ec\3\2\2\2fj\t\2\2\2gi\t\3\2\2hg\3\2\2\2il\3\2\2"
      + "\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2mf\3\2\2\2no\3\2\2\2om\3\2\2"
      + "\2op\3\2\2\2p\u0083\3\2\2\2qs\7\t\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu"
      + "\3\2\2\2uw\3\2\2\2vt\3\2\2\2w{\7\7\2\2xz\t\3\2\2yx\3\2\2\2z}\3\2\2\2{"
      + "y\3\2\2\2{|\3\2\2\2|\177\3\2\2\2}{\3\2\2\2~t\3\2\2\2\177\u0080\3\2\2\2"
      + "\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082m\3\2\2\2"
      + "\u0082~\3\2\2\2\u0083\17\3\2\2\2\u0084\u0086\5\22\n\2\u0085\u0084\3\2"
      + "\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"
      + "\21\3\2\2\2\u0089\u008b\5\f\7\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2"
      + "\2\u008b\u008c\3\2\2\2\u008c\u008e\7\5\2\2\u008d\u008f\5\24\13\2\u008e"
      + "\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0093\3\2\2\2\u0090\u0092\7\t"
      + "\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"
      + "\u0094\3\2\2\2\u0094\u0099\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\5\n"
      + "\6\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"
      + "\u009a\3\2\2\2\u009a\23\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\t\4\2"
      + "\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"
      + "\3\2\2\2\u00a0\25\3\2\2\2\35\30\33#)-\628@CGOSX^cjot{\u0080\u0082\u0087" + "\u008a\u008e\u0093\u0099\u009f";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}