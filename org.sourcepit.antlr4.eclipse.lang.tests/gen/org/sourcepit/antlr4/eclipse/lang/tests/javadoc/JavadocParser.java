// Generated from JavadocParser.g4 by ANTLR 4.5.1

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
      RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int JavadocStart = 1, Id = 2, Nl = 3, Ws = 4, JavadocLinePrefix = 5, JavadocEnd = 6,
      JavadocInlineTagOpen = 7, JavadocBlockTag = 8, TagSlashOpen = 9, TagOpen = 10, JavadocText = 11,
      JavadocInlineTagClose = 12, JavadocInlineTagText = 13, TagSlashClose = 14, TagClose = 15, TagEquals = 16,
      TagName = 17, AttributeChars = 18, AttributeHexChars = 19, AttributeDecChars = 20,
      AttributeDoubleQuoteString = 21, AttributeSingleQuoteString = 22;
   public static final int RULE_javadoc = 0, RULE_javadocDescription = 1, RULE_javadocTagSection = 2,
      RULE_javadocBlockTag = 3, RULE_javadocInlineTag = 4, RULE_javadocHtmlTag = 5, RULE_javadocHtmlAttribute = 6,
      RULE_javadocHtmlAttributeValue = 7;
   public static final String[] ruleNames = { "javadoc", "javadocDescription", "javadocTagSection", "javadocBlockTag",
      "javadocInlineTag", "javadocHtmlTag", "javadocHtmlAttribute", "javadocHtmlAttributeValue" };

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

   @Override
   public String getGrammarFileName() {
      return "JavadocParser.g4";
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
      public TerminalNode JavadocStart() {
         return getToken(JavadocParser.JavadocStart, 0);
      }

      public TerminalNode JavadocEnd() {
         return getToken(JavadocParser.JavadocEnd, 0);
      }

      public JavadocDescriptionContext javadocDescription() {
         return getRuleContext(JavadocDescriptionContext.class, 0);
      }

      public JavadocTagSectionContext javadocTagSection() {
         return getRuleContext(JavadocTagSectionContext.class, 0);
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
         if (listener instanceof JavadocParserListener)
            ((JavadocParserListener) listener).enterJavadoc(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JavadocParserListener)
            ((JavadocParserListener) listener).exitJavadoc(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JavadocParserVisitor)
            return ((JavadocParserVisitor<? extends T>) visitor).visitJavadoc(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final JavadocContext javadoc() throws RecognitionException {
      JavadocContext _localctx = new JavadocContext(_ctx, getState());
      enterRule(_localctx, 0, RULE_javadoc);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(16);
            match(JavadocStart);
            setState(18);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la)
               & ((1L << JavadocInlineTagOpen) | (1L << TagSlashOpen) | (1L << TagOpen) | (1L << JavadocText))) != 0)) {
               {
                  setState(17);
                  javadocDescription();
               }
            }

            setState(21);
            _la = _input.LA(1);
            if (_la == JavadocBlockTag) {
               {
                  setState(20);
                  javadocTagSection();
               }
            }

            setState(23);
            match(JavadocEnd);
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

   public static class JavadocDescriptionContext extends ParserRuleContext {
      public List<TerminalNode> JavadocText() {
         return getTokens(JavadocParser.JavadocText);
      }

      public TerminalNode JavadocText(int i) {
         return getToken(JavadocParser.JavadocText, i);
      }

      public List<JavadocInlineTagContext> javadocInlineTag() {
         return getRuleContexts(JavadocInlineTagContext.class);
      }

      public JavadocInlineTagContext javadocInlineTag(int i) {
         return getRuleContext(JavadocInlineTagContext.class, i);
      }

      public List<JavadocHtmlTagContext> javadocHtmlTag() {
         return getRuleContexts(JavadocHtmlTagContext.class);
      }

      public JavadocHtmlTagContext javadocHtmlTag(int i) {
         return getRuleContext(JavadocHtmlTagContext.class, i);
      }

      public JavadocDescriptionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_javadocDescription;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JavadocParserListener)
            ((JavadocParserListener) listener).enterJavadocDescription(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JavadocParserListener)
            ((JavadocParserListener) listener).exitJavadocDescription(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JavadocParserVisitor)
            return ((JavadocParserVisitor<? extends T>) visitor).visitJavadocDescription(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final JavadocDescriptionContext javadocDescription() throws RecognitionException {
      JavadocDescriptionContext _localctx = new JavadocDescriptionContext(_ctx, getState());
      enterRule(_localctx, 2, RULE_javadocDescription);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(28);
            _errHandler.sync(this);
            _alt = 1;
            do {
               switch (_alt) {
                  case 1 : {
                     setState(28);
                     switch (_input.LA(1)) {
                        case JavadocText : {
                           setState(25);
                           match(JavadocText);
                        }
                           break;
                        case JavadocInlineTagOpen : {
                           setState(26);
                           javadocInlineTag();
                        }
                           break;
                        case TagSlashOpen :
                        case TagOpen : {
                           setState(27);
                           javadocHtmlTag();
                        }
                           break;
                        default :
                           throw new NoViableAltException(this);
                     }
                  }
                     break;
                  default :
                     throw new NoViableAltException(this);
               }
               setState(30);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
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

   public static class JavadocTagSectionContext extends ParserRuleContext {
      public List<JavadocBlockTagContext> javadocBlockTag() {
         return getRuleContexts(JavadocBlockTagContext.class);
      }

      public JavadocBlockTagContext javadocBlockTag(int i) {
         return getRuleContext(JavadocBlockTagContext.class, i);
      }

      public JavadocTagSectionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_javadocTagSection;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JavadocParserListener)
            ((JavadocParserListener) listener).enterJavadocTagSection(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JavadocParserListener)
            ((JavadocParserListener) listener).exitJavadocTagSection(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JavadocParserVisitor)
            return ((JavadocParserVisitor<? extends T>) visitor).visitJavadocTagSection(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final JavadocTagSectionContext javadocTagSection() throws RecognitionException {
      JavadocTagSectionContext _localctx = new JavadocTagSectionContext(_ctx, getState());
      enterRule(_localctx, 4, RULE_javadocTagSection);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(33);
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
               {
                  {
                     setState(32);
                     javadocBlockTag();
                  }
               }
               setState(35);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            while (_la == JavadocBlockTag);
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

   public static class JavadocBlockTagContext extends ParserRuleContext {
      public TerminalNode JavadocBlockTag() {
         return getToken(JavadocParser.JavadocBlockTag, 0);
      }

      public List<JavadocDescriptionContext> javadocDescription() {
         return getRuleContexts(JavadocDescriptionContext.class);
      }

      public JavadocDescriptionContext javadocDescription(int i) {
         return getRuleContext(JavadocDescriptionContext.class, i);
      }

      public JavadocBlockTagContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_javadocBlockTag;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JavadocParserListener)
            ((JavadocParserListener) listener).enterJavadocBlockTag(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JavadocParserListener)
            ((JavadocParserListener) listener).exitJavadocBlockTag(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JavadocParserVisitor)
            return ((JavadocParserVisitor<? extends T>) visitor).visitJavadocBlockTag(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final JavadocBlockTagContext javadocBlockTag() throws RecognitionException {
      JavadocBlockTagContext _localctx = new JavadocBlockTagContext(_ctx, getState());
      enterRule(_localctx, 6, RULE_javadocBlockTag);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(37);
            match(JavadocBlockTag);
            setState(41);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0 && ((1L << _la)
               & ((1L << JavadocInlineTagOpen) | (1L << TagSlashOpen) | (1L << TagOpen) | (1L << JavadocText))) != 0)) {
               {
                  {
                     setState(38);
                     javadocDescription();
                  }
               }
               setState(43);
               _errHandler.sync(this);
               _la = _input.LA(1);
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

   public static class JavadocInlineTagContext extends ParserRuleContext {
      public TerminalNode JavadocInlineTagOpen() {
         return getToken(JavadocParser.JavadocInlineTagOpen, 0);
      }

      public TerminalNode JavadocInlineTagClose() {
         return getToken(JavadocParser.JavadocInlineTagClose, 0);
      }

      public List<TerminalNode> JavadocInlineTagText() {
         return getTokens(JavadocParser.JavadocInlineTagText);
      }

      public TerminalNode JavadocInlineTagText(int i) {
         return getToken(JavadocParser.JavadocInlineTagText, i);
      }

      public JavadocInlineTagContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_javadocInlineTag;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JavadocParserListener)
            ((JavadocParserListener) listener).enterJavadocInlineTag(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JavadocParserListener)
            ((JavadocParserListener) listener).exitJavadocInlineTag(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JavadocParserVisitor)
            return ((JavadocParserVisitor<? extends T>) visitor).visitJavadocInlineTag(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final JavadocInlineTagContext javadocInlineTag() throws RecognitionException {
      JavadocInlineTagContext _localctx = new JavadocInlineTagContext(_ctx, getState());
      enterRule(_localctx, 8, RULE_javadocInlineTag);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(44);
            match(JavadocInlineTagOpen);
            setState(48);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == JavadocInlineTagText) {
               {
                  {
                     setState(45);
                     match(JavadocInlineTagText);
                  }
               }
               setState(50);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(51);
            match(JavadocInlineTagClose);
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

   public static class JavadocHtmlTagContext extends ParserRuleContext {
      public TerminalNode TagOpen() {
         return getToken(JavadocParser.TagOpen, 0);
      }

      public TerminalNode TagName() {
         return getToken(JavadocParser.TagName, 0);
      }

      public TerminalNode TagClose() {
         return getToken(JavadocParser.TagClose, 0);
      }

      public List<JavadocHtmlAttributeContext> javadocHtmlAttribute() {
         return getRuleContexts(JavadocHtmlAttributeContext.class);
      }

      public JavadocHtmlAttributeContext javadocHtmlAttribute(int i) {
         return getRuleContext(JavadocHtmlAttributeContext.class, i);
      }

      public TerminalNode TagSlashClose() {
         return getToken(JavadocParser.TagSlashClose, 0);
      }

      public TerminalNode TagSlashOpen() {
         return getToken(JavadocParser.TagSlashOpen, 0);
      }

      public JavadocHtmlTagContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_javadocHtmlTag;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JavadocParserListener)
            ((JavadocParserListener) listener).enterJavadocHtmlTag(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JavadocParserListener)
            ((JavadocParserListener) listener).exitJavadocHtmlTag(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JavadocParserVisitor)
            return ((JavadocParserVisitor<? extends T>) visitor).visitJavadocHtmlTag(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final JavadocHtmlTagContext javadocHtmlTag() throws RecognitionException {
      JavadocHtmlTagContext _localctx = new JavadocHtmlTagContext(_ctx, getState());
      enterRule(_localctx, 10, RULE_javadocHtmlTag);
      int _la;
      try {
         setState(74);
         switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(53);
               match(TagOpen);
               setState(54);
               match(TagName);
               setState(58);
               _errHandler.sync(this);
               _la = _input.LA(1);
               while (_la == TagName) {
                  {
                     {
                        setState(55);
                        javadocHtmlAttribute();
                     }
                  }
                  setState(60);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
               }
               setState(61);
               match(TagClose);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(62);
               match(TagOpen);
               setState(63);
               match(TagName);
               setState(67);
               _errHandler.sync(this);
               _la = _input.LA(1);
               while (_la == TagName) {
                  {
                     {
                        setState(64);
                        javadocHtmlAttribute();
                     }
                  }
                  setState(69);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
               }
               setState(70);
               match(TagSlashClose);
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(71);
               match(TagSlashOpen);
               setState(72);
               match(TagName);
               setState(73);
               match(TagClose);
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

   public static class JavadocHtmlAttributeContext extends ParserRuleContext {
      public TerminalNode TagName() {
         return getToken(JavadocParser.TagName, 0);
      }

      public TerminalNode TagEquals() {
         return getToken(JavadocParser.TagEquals, 0);
      }

      public JavadocHtmlAttributeValueContext javadocHtmlAttributeValue() {
         return getRuleContext(JavadocHtmlAttributeValueContext.class, 0);
      }

      public JavadocHtmlAttributeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_javadocHtmlAttribute;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JavadocParserListener)
            ((JavadocParserListener) listener).enterJavadocHtmlAttribute(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JavadocParserListener)
            ((JavadocParserListener) listener).exitJavadocHtmlAttribute(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JavadocParserVisitor)
            return ((JavadocParserVisitor<? extends T>) visitor).visitJavadocHtmlAttribute(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final JavadocHtmlAttributeContext javadocHtmlAttribute() throws RecognitionException {
      JavadocHtmlAttributeContext _localctx = new JavadocHtmlAttributeContext(_ctx, getState());
      enterRule(_localctx, 12, RULE_javadocHtmlAttribute);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(76);
            match(TagName);
            setState(77);
            match(TagEquals);
            setState(78);
            javadocHtmlAttributeValue();
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

   public static class JavadocHtmlAttributeValueContext extends ParserRuleContext {
      public TerminalNode AttributeChars() {
         return getToken(JavadocParser.AttributeChars, 0);
      }

      public TerminalNode AttributeHexChars() {
         return getToken(JavadocParser.AttributeHexChars, 0);
      }

      public TerminalNode AttributeDecChars() {
         return getToken(JavadocParser.AttributeDecChars, 0);
      }

      public TerminalNode AttributeDoubleQuoteString() {
         return getToken(JavadocParser.AttributeDoubleQuoteString, 0);
      }

      public TerminalNode AttributeSingleQuoteString() {
         return getToken(JavadocParser.AttributeSingleQuoteString, 0);
      }

      public JavadocHtmlAttributeValueContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_javadocHtmlAttributeValue;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof JavadocParserListener)
            ((JavadocParserListener) listener).enterJavadocHtmlAttributeValue(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof JavadocParserListener)
            ((JavadocParserListener) listener).exitJavadocHtmlAttributeValue(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof JavadocParserVisitor)
            return ((JavadocParserVisitor<? extends T>) visitor).visitJavadocHtmlAttributeValue(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final JavadocHtmlAttributeValueContext javadocHtmlAttributeValue() throws RecognitionException {
      JavadocHtmlAttributeValueContext _localctx = new JavadocHtmlAttributeValueContext(_ctx, getState());
      enterRule(_localctx, 14, RULE_javadocHtmlAttributeValue);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(80);
            _la = _input.LA(1);
            if (!((((_la) & ~0x3f) == 0
               && ((1L << _la) & ((1L << AttributeChars) | (1L << AttributeHexChars) | (1L << AttributeDecChars)
                  | (1L << AttributeDoubleQuoteString) | (1L << AttributeSingleQuoteString))) != 0))) {
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

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30U\4\2\t\2\4\3\t"
      + "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\5\2\25\n\2"
      + "\3\2\5\2\30\n\2\3\2\3\2\3\3\3\3\3\3\6\3\37\n\3\r\3\16\3 \3\4\6\4$\n\4"
      + "\r\4\16\4%\3\5\3\5\7\5*\n\5\f\5\16\5-\13\5\3\6\3\6\7\6\61\n\6\f\6\16\6"
      + "\64\13\6\3\6\3\6\3\7\3\7\3\7\7\7;\n\7\f\7\16\7>\13\7\3\7\3\7\3\7\3\7\7"
      + "\7D\n\7\f\7\16\7G\13\7\3\7\3\7\3\7\3\7\5\7M\n\7\3\b\3\b\3\b\3\b\3\t\3"
      + "\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\3\2\24\30X\2\22\3\2\2\2\4\36\3\2\2"
      + "\2\6#\3\2\2\2\b\'\3\2\2\2\n.\3\2\2\2\fL\3\2\2\2\16N\3\2\2\2\20R\3\2\2"
      + "\2\22\24\7\3\2\2\23\25\5\4\3\2\24\23\3\2\2\2\24\25\3\2\2\2\25\27\3\2\2"
      + "\2\26\30\5\6\4\2\27\26\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31\32\7\b\2"
      + "\2\32\3\3\2\2\2\33\37\7\r\2\2\34\37\5\n\6\2\35\37\5\f\7\2\36\33\3\2\2"
      + "\2\36\34\3\2\2\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\5\3"
      + "\2\2\2\"$\5\b\5\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\7\3\2\2\2"
      + "\'+\7\n\2\2(*\5\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\t\3\2\2"
      + "\2-+\3\2\2\2.\62\7\t\2\2/\61\7\17\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60"
      + "\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7\16\2\2\66\13"
      + "\3\2\2\2\678\7\f\2\28<\7\23\2\29;\5\16\b\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2"
      + "\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?M\7\21\2\2@A\7\f\2\2AE\7\23\2\2BD\5\16"
      + "\b\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HM\7\20"
      + "\2\2IJ\7\13\2\2JK\7\23\2\2KM\7\21\2\2L\67\3\2\2\2L@\3\2\2\2LI\3\2\2\2"
      + "M\r\3\2\2\2NO\7\23\2\2OP\7\22\2\2PQ\5\20\t\2Q\17\3\2\2\2RS\t\2\2\2S\21" + "\3\2\2\2\f\24\27\36 %+\62<EL";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}