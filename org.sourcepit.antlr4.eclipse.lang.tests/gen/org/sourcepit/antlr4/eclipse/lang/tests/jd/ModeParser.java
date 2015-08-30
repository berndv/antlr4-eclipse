// Generated from ModeParser.g4 by ANTLR 4.5

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
public class ModeParser extends Parser {
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
   public static final int RULE_javadoc = 0, RULE_mainDescription = 1, RULE_tagSection = 2, RULE_javadocBlockTag = 3,
      RULE_javadocText = 4, RULE_javadocInlineTag = 5, RULE_javadocHtmlTag = 6, RULE_javadocHtmlAttribute = 7,
      RULE_javadocHtmlAttributeValue = 8;
   public static final String[] ruleNames = { "javadoc", "mainDescription", "tagSection", "javadocBlockTag",
      "javadocText", "javadocInlineTag", "javadocHtmlTag", "javadocHtmlAttribute", "javadocHtmlAttributeValue" };

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
      return "ModeParser.g4";
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

   public ModeParser(TokenStream input) {
      super(input);
      _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   public static class JavadocContext extends ParserRuleContext {
      public TerminalNode JavadocStart() {
         return getToken(ModeParser.JavadocStart, 0);
      }

      public TerminalNode JavadocEnd() {
         return getToken(ModeParser.JavadocEnd, 0);
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
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).enterJavadoc(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).exitJavadoc(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ModeParserVisitor)
            return ((ModeParserVisitor<? extends T>) visitor).visitJavadoc(this);
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
            setState(18);
            match(JavadocStart);
            setState(20);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la)
               & ((1L << JavadocInlineTagOpen) | (1L << TagSlashOpen) | (1L << TagOpen) | (1L << JavadocText))) != 0)) {
               {
                  setState(19);
                  mainDescription();
               }
            }

            setState(23);
            _la = _input.LA(1);
            if (_la == JavadocBlockTag) {
               {
                  setState(22);
                  tagSection();
               }
            }

            setState(25);
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

   public static class MainDescriptionContext extends ParserRuleContext {
      public List<JavadocTextContext> javadocText() {
         return getRuleContexts(JavadocTextContext.class);
      }

      public JavadocTextContext javadocText(int i) {
         return getRuleContext(JavadocTextContext.class, i);
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
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).enterMainDescription(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).exitMainDescription(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ModeParserVisitor)
            return ((ModeParserVisitor<? extends T>) visitor).visitMainDescription(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MainDescriptionContext mainDescription() throws RecognitionException {
      MainDescriptionContext _localctx = new MainDescriptionContext(_ctx, getState());
      enterRule(_localctx, 2, RULE_mainDescription);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(28);
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
               {
                  {
                     setState(27);
                     javadocText();
                  }
               }
               setState(30);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            while ((((_la) & ~0x3f) == 0 && ((1L << _la)
               & ((1L << JavadocInlineTagOpen) | (1L << TagSlashOpen) | (1L << TagOpen) | (1L << JavadocText))) != 0));
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
      public List<JavadocBlockTagContext> javadocBlockTag() {
         return getRuleContexts(JavadocBlockTagContext.class);
      }

      public JavadocBlockTagContext javadocBlockTag(int i) {
         return getRuleContext(JavadocBlockTagContext.class, i);
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
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).enterTagSection(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).exitTagSection(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ModeParserVisitor)
            return ((ModeParserVisitor<? extends T>) visitor).visitTagSection(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TagSectionContext tagSection() throws RecognitionException {
      TagSectionContext _localctx = new TagSectionContext(_ctx, getState());
      enterRule(_localctx, 4, RULE_tagSection);
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
         return getToken(ModeParser.JavadocBlockTag, 0);
      }

      public List<JavadocTextContext> javadocText() {
         return getRuleContexts(JavadocTextContext.class);
      }

      public JavadocTextContext javadocText(int i) {
         return getRuleContext(JavadocTextContext.class, i);
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
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).enterJavadocBlockTag(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).exitJavadocBlockTag(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ModeParserVisitor)
            return ((ModeParserVisitor<? extends T>) visitor).visitJavadocBlockTag(this);
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
                     javadocText();
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

   public static class JavadocTextContext extends ParserRuleContext {
      public List<TerminalNode> JavadocText() {
         return getTokens(ModeParser.JavadocText);
      }

      public TerminalNode JavadocText(int i) {
         return getToken(ModeParser.JavadocText, i);
      }

      public JavadocInlineTagContext javadocInlineTag() {
         return getRuleContext(JavadocInlineTagContext.class, 0);
      }

      public JavadocHtmlTagContext javadocHtmlTag() {
         return getRuleContext(JavadocHtmlTagContext.class, 0);
      }

      public JavadocTextContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_javadocText;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).enterJavadocText(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).exitJavadocText(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ModeParserVisitor)
            return ((ModeParserVisitor<? extends T>) visitor).visitJavadocText(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final JavadocTextContext javadocText() throws RecognitionException {
      JavadocTextContext _localctx = new JavadocTextContext(_ctx, getState());
      enterRule(_localctx, 8, RULE_javadocText);
      try {
         int _alt;
         setState(51);
         switch (_input.LA(1)) {
            case JavadocText :
               enterOuterAlt(_localctx, 1); {
               setState(45);
               _errHandler.sync(this);
               _alt = 1;
               do {
                  switch (_alt) {
                     case 1 : {
                        {
                           setState(44);
                           match(JavadocText);
                        }
                     }
                        break;
                     default :
                        throw new NoViableAltException(this);
                  }
                  setState(47);
                  _errHandler.sync(this);
                  _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
               }
               while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
               break;
            case JavadocInlineTagOpen :
               enterOuterAlt(_localctx, 2); {
               setState(49);
               javadocInlineTag();
            }
               break;
            case TagSlashOpen :
            case TagOpen :
               enterOuterAlt(_localctx, 3); {
               setState(50);
               javadocHtmlTag();
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

   public static class JavadocInlineTagContext extends ParserRuleContext {
      public TerminalNode JavadocInlineTagOpen() {
         return getToken(ModeParser.JavadocInlineTagOpen, 0);
      }

      public TerminalNode JavadocInlineTagClose() {
         return getToken(ModeParser.JavadocInlineTagClose, 0);
      }

      public List<TerminalNode> JavadocInlineTagText() {
         return getTokens(ModeParser.JavadocInlineTagText);
      }

      public TerminalNode JavadocInlineTagText(int i) {
         return getToken(ModeParser.JavadocInlineTagText, i);
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
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).enterJavadocInlineTag(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).exitJavadocInlineTag(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ModeParserVisitor)
            return ((ModeParserVisitor<? extends T>) visitor).visitJavadocInlineTag(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final JavadocInlineTagContext javadocInlineTag() throws RecognitionException {
      JavadocInlineTagContext _localctx = new JavadocInlineTagContext(_ctx, getState());
      enterRule(_localctx, 10, RULE_javadocInlineTag);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(53);
            match(JavadocInlineTagOpen);
            setState(57);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == JavadocInlineTagText) {
               {
                  {
                     setState(54);
                     match(JavadocInlineTagText);
                  }
               }
               setState(59);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(60);
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
         return getToken(ModeParser.TagOpen, 0);
      }

      public TerminalNode TagName() {
         return getToken(ModeParser.TagName, 0);
      }

      public TerminalNode TagClose() {
         return getToken(ModeParser.TagClose, 0);
      }

      public List<JavadocHtmlAttributeContext> javadocHtmlAttribute() {
         return getRuleContexts(JavadocHtmlAttributeContext.class);
      }

      public JavadocHtmlAttributeContext javadocHtmlAttribute(int i) {
         return getRuleContext(JavadocHtmlAttributeContext.class, i);
      }

      public TerminalNode TagSlashClose() {
         return getToken(ModeParser.TagSlashClose, 0);
      }

      public TerminalNode TagSlashOpen() {
         return getToken(ModeParser.TagSlashOpen, 0);
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
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).enterJavadocHtmlTag(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).exitJavadocHtmlTag(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ModeParserVisitor)
            return ((ModeParserVisitor<? extends T>) visitor).visitJavadocHtmlTag(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final JavadocHtmlTagContext javadocHtmlTag() throws RecognitionException {
      JavadocHtmlTagContext _localctx = new JavadocHtmlTagContext(_ctx, getState());
      enterRule(_localctx, 12, RULE_javadocHtmlTag);
      int _la;
      try {
         setState(83);
         switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
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
               match(TagClose);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(71);
               match(TagOpen);
               setState(72);
               match(TagName);
               setState(76);
               _errHandler.sync(this);
               _la = _input.LA(1);
               while (_la == TagName) {
                  {
                     {
                        setState(73);
                        javadocHtmlAttribute();
                     }
                  }
                  setState(78);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
               }
               setState(79);
               match(TagSlashClose);
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(80);
               match(TagSlashOpen);
               setState(81);
               match(TagName);
               setState(82);
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
         return getToken(ModeParser.TagName, 0);
      }

      public TerminalNode TagEquals() {
         return getToken(ModeParser.TagEquals, 0);
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
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).enterJavadocHtmlAttribute(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).exitJavadocHtmlAttribute(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ModeParserVisitor)
            return ((ModeParserVisitor<? extends T>) visitor).visitJavadocHtmlAttribute(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final JavadocHtmlAttributeContext javadocHtmlAttribute() throws RecognitionException {
      JavadocHtmlAttributeContext _localctx = new JavadocHtmlAttributeContext(_ctx, getState());
      enterRule(_localctx, 14, RULE_javadocHtmlAttribute);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(85);
            match(TagName);
            setState(86);
            match(TagEquals);
            setState(87);
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
         return getToken(ModeParser.AttributeChars, 0);
      }

      public TerminalNode AttributeHexChars() {
         return getToken(ModeParser.AttributeHexChars, 0);
      }

      public TerminalNode AttributeDecChars() {
         return getToken(ModeParser.AttributeDecChars, 0);
      }

      public TerminalNode AttributeDoubleQuoteString() {
         return getToken(ModeParser.AttributeDoubleQuoteString, 0);
      }

      public TerminalNode AttributeSingleQuoteString() {
         return getToken(ModeParser.AttributeSingleQuoteString, 0);
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
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).enterJavadocHtmlAttributeValue(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ModeParserListener)
            ((ModeParserListener) listener).exitJavadocHtmlAttributeValue(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ModeParserVisitor)
            return ((ModeParserVisitor<? extends T>) visitor).visitJavadocHtmlAttributeValue(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final JavadocHtmlAttributeValueContext javadocHtmlAttributeValue() throws RecognitionException {
      JavadocHtmlAttributeValueContext _localctx = new JavadocHtmlAttributeValueContext(_ctx, getState());
      enterRule(_localctx, 16, RULE_javadocHtmlAttributeValue);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(89);
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

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30^\4\2\t\2\4\3\t"
      + "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\5\2"
      + "\27\n\2\3\2\5\2\32\n\2\3\2\3\2\3\3\6\3\37\n\3\r\3\16\3 \3\4\6\4$\n\4\r"
      + "\4\16\4%\3\5\3\5\7\5*\n\5\f\5\16\5-\13\5\3\6\6\6\60\n\6\r\6\16\6\61\3"
      + "\6\3\6\5\6\66\n\6\3\7\3\7\7\7:\n\7\f\7\16\7=\13\7\3\7\3\7\3\b\3\b\3\b"
      + "\7\bD\n\b\f\b\16\bG\13\b\3\b\3\b\3\b\3\b\7\bM\n\b\f\b\16\bP\13\b\3\b\3"
      + "\b\3\b\3\b\5\bV\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16"
      + "\20\22\2\3\3\2\24\30a\2\24\3\2\2\2\4\36\3\2\2\2\6#\3\2\2\2\b\'\3\2\2\2"
      + "\n\65\3\2\2\2\f\67\3\2\2\2\16U\3\2\2\2\20W\3\2\2\2\22[\3\2\2\2\24\26\7"
      + "\3\2\2\25\27\5\4\3\2\26\25\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\32\5"
      + "\6\4\2\31\30\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\34\7\b\2\2\34\3\3"
      + "\2\2\2\35\37\5\n\6\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!"
      + "\5\3\2\2\2\"$\5\b\5\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\7\3\2"
      + "\2\2\'+\7\n\2\2(*\5\n\6\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\t\3"
      + "\2\2\2-+\3\2\2\2.\60\7\r\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62"
      + "\3\2\2\2\62\66\3\2\2\2\63\66\5\f\7\2\64\66\5\16\b\2\65/\3\2\2\2\65\63"
      + "\3\2\2\2\65\64\3\2\2\2\66\13\3\2\2\2\67;\7\t\2\28:\7\17\2\298\3\2\2\2"
      + ":=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\16\2\2?\r\3\2\2"
      + "\2@A\7\f\2\2AE\7\23\2\2BD\5\20\t\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2"
      + "\2\2FH\3\2\2\2GE\3\2\2\2HV\7\21\2\2IJ\7\f\2\2JN\7\23\2\2KM\5\20\t\2LK"
      + "\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QV\7\20\2\2"
      + "RS\7\13\2\2ST\7\23\2\2TV\7\21\2\2U@\3\2\2\2UI\3\2\2\2UR\3\2\2\2V\17\3"
      + "\2\2\2WX\7\23\2\2XY\7\22\2\2YZ\5\22\n\2Z\21\3\2\2\2[\\\t\2\2\2\\\23\3" + "\2\2\2\r\26\31 %+\61\65;ENU";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}