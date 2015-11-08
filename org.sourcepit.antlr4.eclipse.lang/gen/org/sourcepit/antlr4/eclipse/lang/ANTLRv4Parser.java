// Generated from ANTLRv4Parser.g4 by ANTLR 4.5.1

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
public class ANTLRv4Parser extends Parser {
   static {
      RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int TOKEN_REF = 1, RULE_REF = 2, LEXER_CHAR_SET = 3, DOC_COMMENT = 4, BLOCK_COMMENT = 5,
      LINE_COMMENT = 6, BEGIN_ARG_ACTION = 7, OPTIONS = 8, TOKENS = 9, IMPORT = 10, FRAGMENT = 11, LEXER = 12,
      PARSER = 13, GRAMMAR = 14, PROTECTED = 15, PUBLIC = 16, PRIVATE = 17, RETURNS = 18, LOCALS = 19, THROWS = 20,
      CATCH = 21, FINALLY = 22, MODE = 23, COLON = 24, COLONCOLON = 25, COMMA = 26, SEMI = 27, LPAREN = 28, RPAREN = 29,
      RARROW = 30, LT = 31, GT = 32, ASSIGN = 33, QUESTION = 34, STAR = 35, PLUS = 36, PLUS_ASSIGN = 37, OR = 38,
      DOLLAR = 39, DOT = 40, RANGE = 41, AT = 42, POUND = 43, NOT = 44, RBRACE = 45, ID = 46, INT = 47,
      STRING_LITERAL = 48, UNTERMINATED_STRING_LITERAL = 49, WS = 50, ACTION = 51, ERRCHAR = 52, ARG_ACTION = 53,
      UNTERMINATED_ARG_ACTION = 54, UNTERMINATED_CHAR_SET = 55;
   public static final int RULE_grammarSpec = 0, RULE_grammarDecl = 1, RULE_grammarType = 2, RULE_prequelConstruct = 3,
      RULE_optionsSpec = 4, RULE_optionsSpecBody = 5, RULE_option = 6, RULE_optionValue = 7, RULE_delegateGrammars = 8,
      RULE_delegateGrammar = 9, RULE_tokensSpec = 10, RULE_tokensSpecBody = 11, RULE_token = 12, RULE_action = 13,
      RULE_actionScopeName = 14, RULE_modeSpec = 15, RULE_rules = 16, RULE_ruleSpec = 17, RULE_parserRuleSpec = 18,
      RULE_exceptionGroup = 19, RULE_exceptionHandler = 20, RULE_finallyClause = 21, RULE_rulePrequel = 22,
      RULE_ruleReturns = 23, RULE_throwsSpec = 24, RULE_localsSpec = 25, RULE_ruleAction = 26, RULE_ruleModifiers = 27,
      RULE_ruleModifier = 28, RULE_ruleBlock = 29, RULE_ruleAltList = 30, RULE_labeledAlt = 31, RULE_lexerRule = 32,
      RULE_lexerRuleBlock = 33, RULE_lexerAltList = 34, RULE_lexerAlt = 35, RULE_lexerElements = 36,
      RULE_lexerElement = 37, RULE_labeledLexerElement = 38, RULE_lexerBlock = 39, RULE_lexerCommands = 40,
      RULE_lexerCommand = 41, RULE_lexerCommandName = 42, RULE_lexerCommandExpr = 43, RULE_altList = 44,
      RULE_alternative = 45, RULE_element = 46, RULE_labeledElement = 47, RULE_ebnf = 48, RULE_blockSuffix = 49,
      RULE_ebnfSuffix = 50, RULE_lexerAtom = 51, RULE_atom = 52, RULE_notSet = 53, RULE_blockSet = 54,
      RULE_setElement = 55, RULE_block = 56, RULE_ruleref = 57, RULE_range = 58, RULE_terminal = 59,
      RULE_elementOptions = 60, RULE_elementOption = 61, RULE_id = 62;
   public static final String[] ruleNames = { "grammarSpec", "grammarDecl", "grammarType", "prequelConstruct",
      "optionsSpec", "optionsSpecBody", "option", "optionValue", "delegateGrammars", "delegateGrammar", "tokensSpec",
      "tokensSpecBody", "token", "action", "actionScopeName", "modeSpec", "rules", "ruleSpec", "parserRuleSpec",
      "exceptionGroup", "exceptionHandler", "finallyClause", "rulePrequel", "ruleReturns", "throwsSpec", "localsSpec",
      "ruleAction", "ruleModifiers", "ruleModifier", "ruleBlock", "ruleAltList", "labeledAlt", "lexerRule",
      "lexerRuleBlock", "lexerAltList", "lexerAlt", "lexerElements", "lexerElement", "labeledLexerElement",
      "lexerBlock", "lexerCommands", "lexerCommand", "lexerCommandName", "lexerCommandExpr", "altList", "alternative",
      "element", "labeledElement", "ebnf", "blockSuffix", "ebnfSuffix", "lexerAtom", "atom", "notSet", "blockSet",
      "setElement", "block", "ruleref", "range", "terminal", "elementOptions", "elementOption", "id" };

   private static final String[] _LITERAL_NAMES = { null, null, null, null, null, null, null, null, null, null,
      "'import'", "'fragment'", "'lexer'", "'parser'", "'grammar'", "'protected'", "'public'", "'private'", "'returns'",
      "'locals'", "'throws'", "'catch'", "'finally'", "'mode'", "':'", "'::'", "','", "';'", "'('", "')'", "'->'",
      "'<'", "'>'", "'='", "'?'", "'*'", "'+'", "'+='", "'|'", "'$'", "'.'", "'..'", "'@'", "'#'", "'~'", "'}'" };
   private static final String[] _SYMBOLIC_NAMES = { null, "TOKEN_REF", "RULE_REF", "LEXER_CHAR_SET", "DOC_COMMENT",
      "BLOCK_COMMENT", "LINE_COMMENT", "BEGIN_ARG_ACTION", "OPTIONS", "TOKENS", "IMPORT", "FRAGMENT", "LEXER", "PARSER",
      "GRAMMAR", "PROTECTED", "PUBLIC", "PRIVATE", "RETURNS", "LOCALS", "THROWS", "CATCH", "FINALLY", "MODE", "COLON",
      "COLONCOLON", "COMMA", "SEMI", "LPAREN", "RPAREN", "RARROW", "LT", "GT", "ASSIGN", "QUESTION", "STAR", "PLUS",
      "PLUS_ASSIGN", "OR", "DOLLAR", "DOT", "RANGE", "AT", "POUND", "NOT", "RBRACE", "ID", "INT", "STRING_LITERAL",
      "UNTERMINATED_STRING_LITERAL", "WS", "ACTION", "ERRCHAR", "ARG_ACTION", "UNTERMINATED_ARG_ACTION",
      "UNTERMINATED_CHAR_SET" };
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
      return "ANTLRv4Parser.g4";
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

   public ANTLRv4Parser(TokenStream input) {
      super(input);
      _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   public static class GrammarSpecContext extends ParserRuleContext {
      public GrammarDeclContext grammarDecl() {
         return getRuleContext(GrammarDeclContext.class, 0);
      }

      public RulesContext rules() {
         return getRuleContext(RulesContext.class, 0);
      }

      public TerminalNode EOF() {
         return getToken(ANTLRv4Parser.EOF, 0);
      }

      public List<PrequelConstructContext> prequelConstruct() {
         return getRuleContexts(PrequelConstructContext.class);
      }

      public PrequelConstructContext prequelConstruct(int i) {
         return getRuleContext(PrequelConstructContext.class, i);
      }

      public List<ModeSpecContext> modeSpec() {
         return getRuleContexts(ModeSpecContext.class);
      }

      public ModeSpecContext modeSpec(int i) {
         return getRuleContext(ModeSpecContext.class, i);
      }

      public GrammarSpecContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_grammarSpec;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterGrammarSpec(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitGrammarSpec(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitGrammarSpec(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final GrammarSpecContext grammarSpec() throws RecognitionException {
      GrammarSpecContext _localctx = new GrammarSpecContext(_ctx, getState());
      enterRule(_localctx, 0, RULE_grammarSpec);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(126);
            grammarDecl();
            setState(130);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0
               && ((1L << _la) & ((1L << OPTIONS) | (1L << TOKENS) | (1L << IMPORT) | (1L << AT))) != 0)) {
               {
                  {
                     setState(127);
                     prequelConstruct();
                  }
               }
               setState(132);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(133);
            rules();
            setState(137);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == MODE) {
               {
                  {
                     setState(134);
                     modeSpec();
                  }
               }
               setState(139);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(140);
            match(EOF);
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

   public static class GrammarDeclContext extends ParserRuleContext {
      public GrammarTypeContext grammarType() {
         return getRuleContext(GrammarTypeContext.class, 0);
      }

      public IdContext id() {
         return getRuleContext(IdContext.class, 0);
      }

      public TerminalNode SEMI() {
         return getToken(ANTLRv4Parser.SEMI, 0);
      }

      public TerminalNode DOC_COMMENT() {
         return getToken(ANTLRv4Parser.DOC_COMMENT, 0);
      }

      public GrammarDeclContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_grammarDecl;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterGrammarDecl(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitGrammarDecl(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitGrammarDecl(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final GrammarDeclContext grammarDecl() throws RecognitionException {
      GrammarDeclContext _localctx = new GrammarDeclContext(_ctx, getState());
      enterRule(_localctx, 2, RULE_grammarDecl);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(143);
            _la = _input.LA(1);
            if (_la == DOC_COMMENT) {
               {
                  setState(142);
                  match(DOC_COMMENT);
               }
            }

            setState(145);
            grammarType();
            setState(146);
            id();
            setState(147);
            match(SEMI);
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

   public static class GrammarTypeContext extends ParserRuleContext {
      public TerminalNode LEXER() {
         return getToken(ANTLRv4Parser.LEXER, 0);
      }

      public TerminalNode GRAMMAR() {
         return getToken(ANTLRv4Parser.GRAMMAR, 0);
      }

      public TerminalNode PARSER() {
         return getToken(ANTLRv4Parser.PARSER, 0);
      }

      public GrammarTypeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_grammarType;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterGrammarType(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitGrammarType(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitGrammarType(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final GrammarTypeContext grammarType() throws RecognitionException {
      GrammarTypeContext _localctx = new GrammarTypeContext(_ctx, getState());
      enterRule(_localctx, 4, RULE_grammarType);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(154);
            switch (_input.LA(1)) {
               case LEXER : {
                  setState(149);
                  match(LEXER);
                  setState(150);
                  match(GRAMMAR);
               }
                  break;
               case PARSER : {
                  setState(151);
                  match(PARSER);
                  setState(152);
                  match(GRAMMAR);
               }
                  break;
               case GRAMMAR : {
                  setState(153);
                  match(GRAMMAR);
               }
                  break;
               default :
                  throw new NoViableAltException(this);
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

   public static class PrequelConstructContext extends ParserRuleContext {
      public OptionsSpecContext optionsSpec() {
         return getRuleContext(OptionsSpecContext.class, 0);
      }

      public DelegateGrammarsContext delegateGrammars() {
         return getRuleContext(DelegateGrammarsContext.class, 0);
      }

      public TokensSpecContext tokensSpec() {
         return getRuleContext(TokensSpecContext.class, 0);
      }

      public ActionContext action() {
         return getRuleContext(ActionContext.class, 0);
      }

      public PrequelConstructContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_prequelConstruct;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterPrequelConstruct(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitPrequelConstruct(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitPrequelConstruct(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final PrequelConstructContext prequelConstruct() throws RecognitionException {
      PrequelConstructContext _localctx = new PrequelConstructContext(_ctx, getState());
      enterRule(_localctx, 6, RULE_prequelConstruct);
      try {
         setState(160);
         switch (_input.LA(1)) {
            case OPTIONS :
               enterOuterAlt(_localctx, 1); {
               setState(156);
               optionsSpec();
            }
               break;
            case IMPORT :
               enterOuterAlt(_localctx, 2); {
               setState(157);
               delegateGrammars();
            }
               break;
            case TOKENS :
               enterOuterAlt(_localctx, 3); {
               setState(158);
               tokensSpec();
            }
               break;
            case AT :
               enterOuterAlt(_localctx, 4); {
               setState(159);
               action();
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

   public static class OptionsSpecContext extends ParserRuleContext {
      public TerminalNode OPTIONS() {
         return getToken(ANTLRv4Parser.OPTIONS, 0);
      }

      public TerminalNode RBRACE() {
         return getToken(ANTLRv4Parser.RBRACE, 0);
      }

      public OptionsSpecBodyContext optionsSpecBody() {
         return getRuleContext(OptionsSpecBodyContext.class, 0);
      }

      public OptionsSpecContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_optionsSpec;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterOptionsSpec(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitOptionsSpec(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitOptionsSpec(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final OptionsSpecContext optionsSpec() throws RecognitionException {
      OptionsSpecContext _localctx = new OptionsSpecContext(_ctx, getState());
      enterRule(_localctx, 8, RULE_optionsSpec);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(162);
            match(OPTIONS);
            setState(164);
            _la = _input.LA(1);
            if (_la == TOKEN_REF || _la == RULE_REF) {
               {
                  setState(163);
                  optionsSpecBody();
               }
            }

            setState(166);
            match(RBRACE);
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

   public static class OptionsSpecBodyContext extends ParserRuleContext {
      public List<OptionContext> option() {
         return getRuleContexts(OptionContext.class);
      }

      public OptionContext option(int i) {
         return getRuleContext(OptionContext.class, i);
      }

      public List<TerminalNode> SEMI() {
         return getTokens(ANTLRv4Parser.SEMI);
      }

      public TerminalNode SEMI(int i) {
         return getToken(ANTLRv4Parser.SEMI, i);
      }

      public OptionsSpecBodyContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_optionsSpecBody;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterOptionsSpecBody(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitOptionsSpecBody(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitOptionsSpecBody(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final OptionsSpecBodyContext optionsSpecBody() throws RecognitionException {
      OptionsSpecBodyContext _localctx = new OptionsSpecBodyContext(_ctx, getState());
      enterRule(_localctx, 10, RULE_optionsSpecBody);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(171);
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
               {
                  {
                     setState(168);
                     option();
                     setState(169);
                     match(SEMI);
                  }
               }
               setState(173);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            while (_la == TOKEN_REF || _la == RULE_REF);
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

   public static class OptionContext extends ParserRuleContext {
      public IdContext id() {
         return getRuleContext(IdContext.class, 0);
      }

      public TerminalNode ASSIGN() {
         return getToken(ANTLRv4Parser.ASSIGN, 0);
      }

      public OptionValueContext optionValue() {
         return getRuleContext(OptionValueContext.class, 0);
      }

      public OptionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_option;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterOption(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitOption(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitOption(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final OptionContext option() throws RecognitionException {
      OptionContext _localctx = new OptionContext(_ctx, getState());
      enterRule(_localctx, 12, RULE_option);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(175);
            id();
            setState(176);
            match(ASSIGN);
            setState(177);
            optionValue();
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

   public static class OptionValueContext extends ParserRuleContext {
      public List<IdContext> id() {
         return getRuleContexts(IdContext.class);
      }

      public IdContext id(int i) {
         return getRuleContext(IdContext.class, i);
      }

      public List<TerminalNode> DOT() {
         return getTokens(ANTLRv4Parser.DOT);
      }

      public TerminalNode DOT(int i) {
         return getToken(ANTLRv4Parser.DOT, i);
      }

      public TerminalNode STRING_LITERAL() {
         return getToken(ANTLRv4Parser.STRING_LITERAL, 0);
      }

      public TerminalNode ACTION() {
         return getToken(ANTLRv4Parser.ACTION, 0);
      }

      public TerminalNode INT() {
         return getToken(ANTLRv4Parser.INT, 0);
      }

      public OptionValueContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_optionValue;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterOptionValue(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitOptionValue(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitOptionValue(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final OptionValueContext optionValue() throws RecognitionException {
      OptionValueContext _localctx = new OptionValueContext(_ctx, getState());
      enterRule(_localctx, 14, RULE_optionValue);
      int _la;
      try {
         setState(190);
         switch (_input.LA(1)) {
            case TOKEN_REF :
            case RULE_REF :
               enterOuterAlt(_localctx, 1); {
               setState(179);
               id();
               setState(184);
               _errHandler.sync(this);
               _la = _input.LA(1);
               while (_la == DOT) {
                  {
                     {
                        setState(180);
                        match(DOT);
                        setState(181);
                        id();
                     }
                  }
                  setState(186);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
               }
            }
               break;
            case STRING_LITERAL :
               enterOuterAlt(_localctx, 2); {
               setState(187);
               match(STRING_LITERAL);
            }
               break;
            case ACTION :
               enterOuterAlt(_localctx, 3); {
               setState(188);
               match(ACTION);
            }
               break;
            case INT :
               enterOuterAlt(_localctx, 4); {
               setState(189);
               match(INT);
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

   public static class DelegateGrammarsContext extends ParserRuleContext {
      public TerminalNode IMPORT() {
         return getToken(ANTLRv4Parser.IMPORT, 0);
      }

      public List<DelegateGrammarContext> delegateGrammar() {
         return getRuleContexts(DelegateGrammarContext.class);
      }

      public DelegateGrammarContext delegateGrammar(int i) {
         return getRuleContext(DelegateGrammarContext.class, i);
      }

      public TerminalNode SEMI() {
         return getToken(ANTLRv4Parser.SEMI, 0);
      }

      public List<TerminalNode> COMMA() {
         return getTokens(ANTLRv4Parser.COMMA);
      }

      public TerminalNode COMMA(int i) {
         return getToken(ANTLRv4Parser.COMMA, i);
      }

      public DelegateGrammarsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_delegateGrammars;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterDelegateGrammars(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitDelegateGrammars(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitDelegateGrammars(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final DelegateGrammarsContext delegateGrammars() throws RecognitionException {
      DelegateGrammarsContext _localctx = new DelegateGrammarsContext(_ctx, getState());
      enterRule(_localctx, 16, RULE_delegateGrammars);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(192);
            match(IMPORT);
            setState(193);
            delegateGrammar();
            setState(198);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(194);
                     match(COMMA);
                     setState(195);
                     delegateGrammar();
                  }
               }
               setState(200);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(201);
            match(SEMI);
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

   public static class DelegateGrammarContext extends ParserRuleContext {
      public List<IdContext> id() {
         return getRuleContexts(IdContext.class);
      }

      public IdContext id(int i) {
         return getRuleContext(IdContext.class, i);
      }

      public TerminalNode ASSIGN() {
         return getToken(ANTLRv4Parser.ASSIGN, 0);
      }

      public DelegateGrammarContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_delegateGrammar;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterDelegateGrammar(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitDelegateGrammar(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitDelegateGrammar(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final DelegateGrammarContext delegateGrammar() throws RecognitionException {
      DelegateGrammarContext _localctx = new DelegateGrammarContext(_ctx, getState());
      enterRule(_localctx, 18, RULE_delegateGrammar);
      try {
         setState(208);
         switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(203);
               id();
               setState(204);
               match(ASSIGN);
               setState(205);
               id();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(207);
               id();
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

   public static class TokensSpecContext extends ParserRuleContext {
      public TerminalNode TOKENS() {
         return getToken(ANTLRv4Parser.TOKENS, 0);
      }

      public TokensSpecBodyContext tokensSpecBody() {
         return getRuleContext(TokensSpecBodyContext.class, 0);
      }

      public TerminalNode RBRACE() {
         return getToken(ANTLRv4Parser.RBRACE, 0);
      }

      public TokensSpecContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_tokensSpec;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterTokensSpec(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitTokensSpec(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitTokensSpec(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TokensSpecContext tokensSpec() throws RecognitionException {
      TokensSpecContext _localctx = new TokensSpecContext(_ctx, getState());
      enterRule(_localctx, 20, RULE_tokensSpec);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(210);
            match(TOKENS);
            setState(211);
            tokensSpecBody();
            setState(212);
            match(RBRACE);
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

   public static class TokensSpecBodyContext extends ParserRuleContext {
      public List<TokenContext> token() {
         return getRuleContexts(TokenContext.class);
      }

      public TokenContext token(int i) {
         return getRuleContext(TokenContext.class, i);
      }

      public List<TerminalNode> COMMA() {
         return getTokens(ANTLRv4Parser.COMMA);
      }

      public TerminalNode COMMA(int i) {
         return getToken(ANTLRv4Parser.COMMA, i);
      }

      public TokensSpecBodyContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_tokensSpecBody;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterTokensSpecBody(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitTokensSpecBody(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitTokensSpecBody(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TokensSpecBodyContext tokensSpecBody() throws RecognitionException {
      TokensSpecBodyContext _localctx = new TokensSpecBodyContext(_ctx, getState());
      enterRule(_localctx, 22, RULE_tokensSpecBody);
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(214);
            token();
            setState(219);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(215);
                        match(COMMA);
                        setState(216);
                        token();
                     }
                  }
               }
               setState(221);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
            }
            setState(223);
            _la = _input.LA(1);
            if (_la == COMMA) {
               {
                  setState(222);
                  match(COMMA);
               }
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

   public static class TokenContext extends ParserRuleContext {
      public IdContext id() {
         return getRuleContext(IdContext.class, 0);
      }

      public TokenContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_token;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterToken(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitToken(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitToken(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TokenContext token() throws RecognitionException {
      TokenContext _localctx = new TokenContext(_ctx, getState());
      enterRule(_localctx, 24, RULE_token);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(225);
            id();
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

   public static class ActionContext extends ParserRuleContext {
      public TerminalNode AT() {
         return getToken(ANTLRv4Parser.AT, 0);
      }

      public IdContext id() {
         return getRuleContext(IdContext.class, 0);
      }

      public TerminalNode ACTION() {
         return getToken(ANTLRv4Parser.ACTION, 0);
      }

      public ActionScopeNameContext actionScopeName() {
         return getRuleContext(ActionScopeNameContext.class, 0);
      }

      public TerminalNode COLONCOLON() {
         return getToken(ANTLRv4Parser.COLONCOLON, 0);
      }

      public ActionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_action;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterAction(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitAction(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitAction(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ActionContext action() throws RecognitionException {
      ActionContext _localctx = new ActionContext(_ctx, getState());
      enterRule(_localctx, 26, RULE_action);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(227);
            match(AT);
            setState(231);
            switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
               case 1 : {
                  setState(228);
                  actionScopeName();
                  setState(229);
                  match(COLONCOLON);
               }
                  break;
            }
            setState(233);
            id();
            setState(234);
            match(ACTION);
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

   public static class ActionScopeNameContext extends ParserRuleContext {
      public IdContext id() {
         return getRuleContext(IdContext.class, 0);
      }

      public TerminalNode LEXER() {
         return getToken(ANTLRv4Parser.LEXER, 0);
      }

      public TerminalNode PARSER() {
         return getToken(ANTLRv4Parser.PARSER, 0);
      }

      public ActionScopeNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_actionScopeName;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterActionScopeName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitActionScopeName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitActionScopeName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ActionScopeNameContext actionScopeName() throws RecognitionException {
      ActionScopeNameContext _localctx = new ActionScopeNameContext(_ctx, getState());
      enterRule(_localctx, 28, RULE_actionScopeName);
      try {
         setState(239);
         switch (_input.LA(1)) {
            case TOKEN_REF :
            case RULE_REF :
               enterOuterAlt(_localctx, 1); {
               setState(236);
               id();
            }
               break;
            case LEXER :
               enterOuterAlt(_localctx, 2); {
               setState(237);
               match(LEXER);
            }
               break;
            case PARSER :
               enterOuterAlt(_localctx, 3); {
               setState(238);
               match(PARSER);
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

   public static class ModeSpecContext extends ParserRuleContext {
      public TerminalNode MODE() {
         return getToken(ANTLRv4Parser.MODE, 0);
      }

      public IdContext id() {
         return getRuleContext(IdContext.class, 0);
      }

      public TerminalNode SEMI() {
         return getToken(ANTLRv4Parser.SEMI, 0);
      }

      public List<LexerRuleContext> lexerRule() {
         return getRuleContexts(LexerRuleContext.class);
      }

      public LexerRuleContext lexerRule(int i) {
         return getRuleContext(LexerRuleContext.class, i);
      }

      public ModeSpecContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_modeSpec;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterModeSpec(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitModeSpec(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitModeSpec(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ModeSpecContext modeSpec() throws RecognitionException {
      ModeSpecContext _localctx = new ModeSpecContext(_ctx, getState());
      enterRule(_localctx, 30, RULE_modeSpec);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(241);
            match(MODE);
            setState(242);
            id();
            setState(243);
            match(SEMI);
            setState(247);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0
               && ((1L << _la) & ((1L << TOKEN_REF) | (1L << DOC_COMMENT) | (1L << FRAGMENT))) != 0)) {
               {
                  {
                     setState(244);
                     lexerRule();
                  }
               }
               setState(249);
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

   public static class RulesContext extends ParserRuleContext {
      public List<RuleSpecContext> ruleSpec() {
         return getRuleContexts(RuleSpecContext.class);
      }

      public RuleSpecContext ruleSpec(int i) {
         return getRuleContext(RuleSpecContext.class, i);
      }

      public RulesContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_rules;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterRules(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitRules(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitRules(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final RulesContext rules() throws RecognitionException {
      RulesContext _localctx = new RulesContext(_ctx, getState());
      enterRule(_localctx, 32, RULE_rules);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(253);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << RULE_REF) | (1L << DOC_COMMENT)
               | (1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) {
               {
                  {
                     setState(250);
                     ruleSpec();
                  }
               }
               setState(255);
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

   public static class RuleSpecContext extends ParserRuleContext {
      public ParserRuleSpecContext parserRuleSpec() {
         return getRuleContext(ParserRuleSpecContext.class, 0);
      }

      public LexerRuleContext lexerRule() {
         return getRuleContext(LexerRuleContext.class, 0);
      }

      public RuleSpecContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ruleSpec;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterRuleSpec(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitRuleSpec(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitRuleSpec(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final RuleSpecContext ruleSpec() throws RecognitionException {
      RuleSpecContext _localctx = new RuleSpecContext(_ctx, getState());
      enterRule(_localctx, 34, RULE_ruleSpec);
      try {
         setState(258);
         switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(256);
               parserRuleSpec();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(257);
               lexerRule();
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

   public static class ParserRuleSpecContext extends ParserRuleContext {
      public TerminalNode RULE_REF() {
         return getToken(ANTLRv4Parser.RULE_REF, 0);
      }

      public RuleBlockContext ruleBlock() {
         return getRuleContext(RuleBlockContext.class, 0);
      }

      public ExceptionGroupContext exceptionGroup() {
         return getRuleContext(ExceptionGroupContext.class, 0);
      }

      public TerminalNode DOC_COMMENT() {
         return getToken(ANTLRv4Parser.DOC_COMMENT, 0);
      }

      public RuleModifiersContext ruleModifiers() {
         return getRuleContext(RuleModifiersContext.class, 0);
      }

      public TerminalNode ARG_ACTION() {
         return getToken(ANTLRv4Parser.ARG_ACTION, 0);
      }

      public RuleReturnsContext ruleReturns() {
         return getRuleContext(RuleReturnsContext.class, 0);
      }

      public ThrowsSpecContext throwsSpec() {
         return getRuleContext(ThrowsSpecContext.class, 0);
      }

      public LocalsSpecContext localsSpec() {
         return getRuleContext(LocalsSpecContext.class, 0);
      }

      public List<RulePrequelContext> rulePrequel() {
         return getRuleContexts(RulePrequelContext.class);
      }

      public RulePrequelContext rulePrequel(int i) {
         return getRuleContext(RulePrequelContext.class, i);
      }

      public ParserRuleSpecContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_parserRuleSpec;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterParserRuleSpec(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitParserRuleSpec(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitParserRuleSpec(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ParserRuleSpecContext parserRuleSpec() throws RecognitionException {
      ParserRuleSpecContext _localctx = new ParserRuleSpecContext(_ctx, getState());
      enterRule(_localctx, 36, RULE_parserRuleSpec);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(261);
            _la = _input.LA(1);
            if (_la == DOC_COMMENT) {
               {
                  setState(260);
                  match(DOC_COMMENT);
               }
            }

            setState(264);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0
               && ((1L << _la) & ((1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) {
               {
                  setState(263);
                  ruleModifiers();
               }
            }

            setState(266);
            match(RULE_REF);
            setState(268);
            _la = _input.LA(1);
            if (_la == ARG_ACTION) {
               {
                  setState(267);
                  match(ARG_ACTION);
               }
            }

            setState(271);
            _la = _input.LA(1);
            if (_la == RETURNS) {
               {
                  setState(270);
                  ruleReturns();
               }
            }

            setState(274);
            _la = _input.LA(1);
            if (_la == THROWS) {
               {
                  setState(273);
                  throwsSpec();
               }
            }

            setState(277);
            _la = _input.LA(1);
            if (_la == LOCALS) {
               {
                  setState(276);
                  localsSpec();
               }
            }

            setState(282);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == OPTIONS || _la == AT) {
               {
                  {
                     setState(279);
                     rulePrequel();
                  }
               }
               setState(284);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(285);
            ruleBlock();
            setState(286);
            exceptionGroup();
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

   public static class ExceptionGroupContext extends ParserRuleContext {
      public List<ExceptionHandlerContext> exceptionHandler() {
         return getRuleContexts(ExceptionHandlerContext.class);
      }

      public ExceptionHandlerContext exceptionHandler(int i) {
         return getRuleContext(ExceptionHandlerContext.class, i);
      }

      public FinallyClauseContext finallyClause() {
         return getRuleContext(FinallyClauseContext.class, 0);
      }

      public ExceptionGroupContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_exceptionGroup;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterExceptionGroup(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitExceptionGroup(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitExceptionGroup(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ExceptionGroupContext exceptionGroup() throws RecognitionException {
      ExceptionGroupContext _localctx = new ExceptionGroupContext(_ctx, getState());
      enterRule(_localctx, 38, RULE_exceptionGroup);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(291);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == CATCH) {
               {
                  {
                     setState(288);
                     exceptionHandler();
                  }
               }
               setState(293);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(295);
            _la = _input.LA(1);
            if (_la == FINALLY) {
               {
                  setState(294);
                  finallyClause();
               }
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

   public static class ExceptionHandlerContext extends ParserRuleContext {
      public TerminalNode CATCH() {
         return getToken(ANTLRv4Parser.CATCH, 0);
      }

      public TerminalNode ARG_ACTION() {
         return getToken(ANTLRv4Parser.ARG_ACTION, 0);
      }

      public TerminalNode ACTION() {
         return getToken(ANTLRv4Parser.ACTION, 0);
      }

      public ExceptionHandlerContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_exceptionHandler;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterExceptionHandler(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitExceptionHandler(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitExceptionHandler(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ExceptionHandlerContext exceptionHandler() throws RecognitionException {
      ExceptionHandlerContext _localctx = new ExceptionHandlerContext(_ctx, getState());
      enterRule(_localctx, 40, RULE_exceptionHandler);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(297);
            match(CATCH);
            setState(298);
            match(ARG_ACTION);
            setState(299);
            match(ACTION);
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

   public static class FinallyClauseContext extends ParserRuleContext {
      public TerminalNode FINALLY() {
         return getToken(ANTLRv4Parser.FINALLY, 0);
      }

      public TerminalNode ACTION() {
         return getToken(ANTLRv4Parser.ACTION, 0);
      }

      public FinallyClauseContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_finallyClause;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterFinallyClause(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitFinallyClause(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitFinallyClause(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final FinallyClauseContext finallyClause() throws RecognitionException {
      FinallyClauseContext _localctx = new FinallyClauseContext(_ctx, getState());
      enterRule(_localctx, 42, RULE_finallyClause);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(301);
            match(FINALLY);
            setState(302);
            match(ACTION);
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

   public static class RulePrequelContext extends ParserRuleContext {
      public OptionsSpecContext optionsSpec() {
         return getRuleContext(OptionsSpecContext.class, 0);
      }

      public RuleActionContext ruleAction() {
         return getRuleContext(RuleActionContext.class, 0);
      }

      public RulePrequelContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_rulePrequel;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterRulePrequel(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitRulePrequel(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitRulePrequel(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final RulePrequelContext rulePrequel() throws RecognitionException {
      RulePrequelContext _localctx = new RulePrequelContext(_ctx, getState());
      enterRule(_localctx, 44, RULE_rulePrequel);
      try {
         setState(306);
         switch (_input.LA(1)) {
            case OPTIONS :
               enterOuterAlt(_localctx, 1); {
               setState(304);
               optionsSpec();
            }
               break;
            case AT :
               enterOuterAlt(_localctx, 2); {
               setState(305);
               ruleAction();
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

   public static class RuleReturnsContext extends ParserRuleContext {
      public TerminalNode RETURNS() {
         return getToken(ANTLRv4Parser.RETURNS, 0);
      }

      public TerminalNode ARG_ACTION() {
         return getToken(ANTLRv4Parser.ARG_ACTION, 0);
      }

      public RuleReturnsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ruleReturns;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterRuleReturns(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitRuleReturns(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitRuleReturns(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final RuleReturnsContext ruleReturns() throws RecognitionException {
      RuleReturnsContext _localctx = new RuleReturnsContext(_ctx, getState());
      enterRule(_localctx, 46, RULE_ruleReturns);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(308);
            match(RETURNS);
            setState(309);
            match(ARG_ACTION);
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

   public static class ThrowsSpecContext extends ParserRuleContext {
      public TerminalNode THROWS() {
         return getToken(ANTLRv4Parser.THROWS, 0);
      }

      public List<IdContext> id() {
         return getRuleContexts(IdContext.class);
      }

      public IdContext id(int i) {
         return getRuleContext(IdContext.class, i);
      }

      public List<TerminalNode> COMMA() {
         return getTokens(ANTLRv4Parser.COMMA);
      }

      public TerminalNode COMMA(int i) {
         return getToken(ANTLRv4Parser.COMMA, i);
      }

      public ThrowsSpecContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_throwsSpec;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterThrowsSpec(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitThrowsSpec(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitThrowsSpec(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ThrowsSpecContext throwsSpec() throws RecognitionException {
      ThrowsSpecContext _localctx = new ThrowsSpecContext(_ctx, getState());
      enterRule(_localctx, 48, RULE_throwsSpec);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(311);
            match(THROWS);
            setState(312);
            id();
            setState(317);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(313);
                     match(COMMA);
                     setState(314);
                     id();
                  }
               }
               setState(319);
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

   public static class LocalsSpecContext extends ParserRuleContext {
      public TerminalNode LOCALS() {
         return getToken(ANTLRv4Parser.LOCALS, 0);
      }

      public TerminalNode ARG_ACTION() {
         return getToken(ANTLRv4Parser.ARG_ACTION, 0);
      }

      public LocalsSpecContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_localsSpec;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterLocalsSpec(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitLocalsSpec(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitLocalsSpec(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LocalsSpecContext localsSpec() throws RecognitionException {
      LocalsSpecContext _localctx = new LocalsSpecContext(_ctx, getState());
      enterRule(_localctx, 50, RULE_localsSpec);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(320);
            match(LOCALS);
            setState(321);
            match(ARG_ACTION);
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

   public static class RuleActionContext extends ParserRuleContext {
      public TerminalNode AT() {
         return getToken(ANTLRv4Parser.AT, 0);
      }

      public IdContext id() {
         return getRuleContext(IdContext.class, 0);
      }

      public TerminalNode ACTION() {
         return getToken(ANTLRv4Parser.ACTION, 0);
      }

      public RuleActionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ruleAction;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterRuleAction(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitRuleAction(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitRuleAction(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final RuleActionContext ruleAction() throws RecognitionException {
      RuleActionContext _localctx = new RuleActionContext(_ctx, getState());
      enterRule(_localctx, 52, RULE_ruleAction);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(323);
            match(AT);
            setState(324);
            id();
            setState(325);
            match(ACTION);
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

   public static class RuleModifiersContext extends ParserRuleContext {
      public List<RuleModifierContext> ruleModifier() {
         return getRuleContexts(RuleModifierContext.class);
      }

      public RuleModifierContext ruleModifier(int i) {
         return getRuleContext(RuleModifierContext.class, i);
      }

      public RuleModifiersContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ruleModifiers;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterRuleModifiers(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitRuleModifiers(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitRuleModifiers(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final RuleModifiersContext ruleModifiers() throws RecognitionException {
      RuleModifiersContext _localctx = new RuleModifiersContext(_ctx, getState());
      enterRule(_localctx, 54, RULE_ruleModifiers);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(328);
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
               {
                  {
                     setState(327);
                     ruleModifier();
                  }
               }
               setState(330);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            while ((((_la) & ~0x3f) == 0
               && ((1L << _la) & ((1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0));
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

   public static class RuleModifierContext extends ParserRuleContext {
      public TerminalNode PUBLIC() {
         return getToken(ANTLRv4Parser.PUBLIC, 0);
      }

      public TerminalNode PRIVATE() {
         return getToken(ANTLRv4Parser.PRIVATE, 0);
      }

      public TerminalNode PROTECTED() {
         return getToken(ANTLRv4Parser.PROTECTED, 0);
      }

      public TerminalNode FRAGMENT() {
         return getToken(ANTLRv4Parser.FRAGMENT, 0);
      }

      public RuleModifierContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ruleModifier;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterRuleModifier(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitRuleModifier(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitRuleModifier(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final RuleModifierContext ruleModifier() throws RecognitionException {
      RuleModifierContext _localctx = new RuleModifierContext(_ctx, getState());
      enterRule(_localctx, 56, RULE_ruleModifier);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(332);
            _la = _input.LA(1);
            if (!((((_la) & ~0x3f) == 0
               && ((1L << _la) & ((1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0))) {
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

   public static class RuleBlockContext extends ParserRuleContext {
      public TerminalNode COLON() {
         return getToken(ANTLRv4Parser.COLON, 0);
      }

      public RuleAltListContext ruleAltList() {
         return getRuleContext(RuleAltListContext.class, 0);
      }

      public TerminalNode SEMI() {
         return getToken(ANTLRv4Parser.SEMI, 0);
      }

      public RuleBlockContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ruleBlock;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterRuleBlock(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitRuleBlock(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitRuleBlock(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final RuleBlockContext ruleBlock() throws RecognitionException {
      RuleBlockContext _localctx = new RuleBlockContext(_ctx, getState());
      enterRule(_localctx, 58, RULE_ruleBlock);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(334);
            match(COLON);
            setState(335);
            ruleAltList();
            setState(336);
            match(SEMI);
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

   public static class RuleAltListContext extends ParserRuleContext {
      public List<LabeledAltContext> labeledAlt() {
         return getRuleContexts(LabeledAltContext.class);
      }

      public LabeledAltContext labeledAlt(int i) {
         return getRuleContext(LabeledAltContext.class, i);
      }

      public List<TerminalNode> OR() {
         return getTokens(ANTLRv4Parser.OR);
      }

      public TerminalNode OR(int i) {
         return getToken(ANTLRv4Parser.OR, i);
      }

      public RuleAltListContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ruleAltList;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterRuleAltList(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitRuleAltList(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitRuleAltList(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final RuleAltListContext ruleAltList() throws RecognitionException {
      RuleAltListContext _localctx = new RuleAltListContext(_ctx, getState());
      enterRule(_localctx, 60, RULE_ruleAltList);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(338);
            labeledAlt();
            setState(343);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == OR) {
               {
                  {
                     setState(339);
                     match(OR);
                     setState(340);
                     labeledAlt();
                  }
               }
               setState(345);
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

   public static class LabeledAltContext extends ParserRuleContext {
      public AlternativeContext alternative() {
         return getRuleContext(AlternativeContext.class, 0);
      }

      public TerminalNode POUND() {
         return getToken(ANTLRv4Parser.POUND, 0);
      }

      public IdContext id() {
         return getRuleContext(IdContext.class, 0);
      }

      public LabeledAltContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_labeledAlt;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterLabeledAlt(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitLabeledAlt(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitLabeledAlt(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LabeledAltContext labeledAlt() throws RecognitionException {
      LabeledAltContext _localctx = new LabeledAltContext(_ctx, getState());
      enterRule(_localctx, 62, RULE_labeledAlt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(346);
            alternative();
            setState(349);
            _la = _input.LA(1);
            if (_la == POUND) {
               {
                  setState(347);
                  match(POUND);
                  setState(348);
                  id();
               }
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

   public static class LexerRuleContext extends ParserRuleContext {
      public TerminalNode TOKEN_REF() {
         return getToken(ANTLRv4Parser.TOKEN_REF, 0);
      }

      public LexerRuleBlockContext lexerRuleBlock() {
         return getRuleContext(LexerRuleBlockContext.class, 0);
      }

      public TerminalNode DOC_COMMENT() {
         return getToken(ANTLRv4Parser.DOC_COMMENT, 0);
      }

      public TerminalNode FRAGMENT() {
         return getToken(ANTLRv4Parser.FRAGMENT, 0);
      }

      public LexerRuleContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_lexerRule;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterLexerRule(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitLexerRule(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitLexerRule(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LexerRuleContext lexerRule() throws RecognitionException {
      LexerRuleContext _localctx = new LexerRuleContext(_ctx, getState());
      enterRule(_localctx, 64, RULE_lexerRule);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(352);
            _la = _input.LA(1);
            if (_la == DOC_COMMENT) {
               {
                  setState(351);
                  match(DOC_COMMENT);
               }
            }

            setState(355);
            _la = _input.LA(1);
            if (_la == FRAGMENT) {
               {
                  setState(354);
                  match(FRAGMENT);
               }
            }

            setState(357);
            match(TOKEN_REF);
            setState(358);
            lexerRuleBlock();
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

   public static class LexerRuleBlockContext extends ParserRuleContext {
      public TerminalNode COLON() {
         return getToken(ANTLRv4Parser.COLON, 0);
      }

      public LexerAltListContext lexerAltList() {
         return getRuleContext(LexerAltListContext.class, 0);
      }

      public TerminalNode SEMI() {
         return getToken(ANTLRv4Parser.SEMI, 0);
      }

      public LexerRuleBlockContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_lexerRuleBlock;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterLexerRuleBlock(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitLexerRuleBlock(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitLexerRuleBlock(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LexerRuleBlockContext lexerRuleBlock() throws RecognitionException {
      LexerRuleBlockContext _localctx = new LexerRuleBlockContext(_ctx, getState());
      enterRule(_localctx, 66, RULE_lexerRuleBlock);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(360);
            match(COLON);
            setState(361);
            lexerAltList();
            setState(362);
            match(SEMI);
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

   public static class LexerAltListContext extends ParserRuleContext {
      public List<LexerAltContext> lexerAlt() {
         return getRuleContexts(LexerAltContext.class);
      }

      public LexerAltContext lexerAlt(int i) {
         return getRuleContext(LexerAltContext.class, i);
      }

      public List<TerminalNode> OR() {
         return getTokens(ANTLRv4Parser.OR);
      }

      public TerminalNode OR(int i) {
         return getToken(ANTLRv4Parser.OR, i);
      }

      public LexerAltListContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_lexerAltList;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterLexerAltList(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitLexerAltList(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitLexerAltList(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LexerAltListContext lexerAltList() throws RecognitionException {
      LexerAltListContext _localctx = new LexerAltListContext(_ctx, getState());
      enterRule(_localctx, 68, RULE_lexerAltList);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(364);
            lexerAlt();
            setState(369);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == OR) {
               {
                  {
                     setState(365);
                     match(OR);
                     setState(366);
                     lexerAlt();
                  }
               }
               setState(371);
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

   public static class LexerAltContext extends ParserRuleContext {
      public LexerElementsContext lexerElements() {
         return getRuleContext(LexerElementsContext.class, 0);
      }

      public LexerCommandsContext lexerCommands() {
         return getRuleContext(LexerCommandsContext.class, 0);
      }

      public LexerAltContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_lexerAlt;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterLexerAlt(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitLexerAlt(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitLexerAlt(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LexerAltContext lexerAlt() throws RecognitionException {
      LexerAltContext _localctx = new LexerAltContext(_ctx, getState());
      enterRule(_localctx, 70, RULE_lexerAlt);
      int _la;
      try {
         setState(377);
         switch (_input.LA(1)) {
            case TOKEN_REF :
            case RULE_REF :
            case LEXER_CHAR_SET :
            case LPAREN :
            case DOT :
            case NOT :
            case STRING_LITERAL :
            case ACTION :
               enterOuterAlt(_localctx, 1); {
               setState(372);
               lexerElements();
               setState(374);
               _la = _input.LA(1);
               if (_la == RARROW) {
                  {
                     setState(373);
                     lexerCommands();
                  }
               }

            }
               break;
            case SEMI :
            case RPAREN :
            case OR :
               enterOuterAlt(_localctx, 2); {
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

   public static class LexerElementsContext extends ParserRuleContext {
      public List<LexerElementContext> lexerElement() {
         return getRuleContexts(LexerElementContext.class);
      }

      public LexerElementContext lexerElement(int i) {
         return getRuleContext(LexerElementContext.class, i);
      }

      public LexerElementsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_lexerElements;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterLexerElements(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitLexerElements(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitLexerElements(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LexerElementsContext lexerElements() throws RecognitionException {
      LexerElementsContext _localctx = new LexerElementsContext(_ctx, getState());
      enterRule(_localctx, 72, RULE_lexerElements);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(380);
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
               {
                  {
                     setState(379);
                     lexerElement();
                  }
               }
               setState(382);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            while ((((_la) & ~0x3f) == 0
               && ((1L << _la) & ((1L << TOKEN_REF) | (1L << RULE_REF) | (1L << LEXER_CHAR_SET) | (1L << LPAREN)
                  | (1L << DOT) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << ACTION))) != 0));
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

   public static class LexerElementContext extends ParserRuleContext {
      public LabeledLexerElementContext labeledLexerElement() {
         return getRuleContext(LabeledLexerElementContext.class, 0);
      }

      public EbnfSuffixContext ebnfSuffix() {
         return getRuleContext(EbnfSuffixContext.class, 0);
      }

      public LexerAtomContext lexerAtom() {
         return getRuleContext(LexerAtomContext.class, 0);
      }

      public LexerBlockContext lexerBlock() {
         return getRuleContext(LexerBlockContext.class, 0);
      }

      public TerminalNode ACTION() {
         return getToken(ANTLRv4Parser.ACTION, 0);
      }

      public TerminalNode QUESTION() {
         return getToken(ANTLRv4Parser.QUESTION, 0);
      }

      public LexerElementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_lexerElement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterLexerElement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitLexerElement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitLexerElement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LexerElementContext lexerElement() throws RecognitionException {
      LexerElementContext _localctx = new LexerElementContext(_ctx, getState());
      enterRule(_localctx, 74, RULE_lexerElement);
      int _la;
      try {
         setState(400);
         switch (getInterpreter().adaptivePredict(_input, 42, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(384);
               labeledLexerElement();
               setState(386);
               _la = _input.LA(1);
               if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
                  {
                     setState(385);
                     ebnfSuffix();
                  }
               }

            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(388);
               lexerAtom();
               setState(390);
               _la = _input.LA(1);
               if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
                  {
                     setState(389);
                     ebnfSuffix();
                  }
               }

            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(392);
               lexerBlock();
               setState(394);
               _la = _input.LA(1);
               if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
                  {
                     setState(393);
                     ebnfSuffix();
                  }
               }

            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(396);
               match(ACTION);
               setState(398);
               _la = _input.LA(1);
               if (_la == QUESTION) {
                  {
                     setState(397);
                     match(QUESTION);
                  }
               }

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

   public static class LabeledLexerElementContext extends ParserRuleContext {
      public IdContext id() {
         return getRuleContext(IdContext.class, 0);
      }

      public TerminalNode ASSIGN() {
         return getToken(ANTLRv4Parser.ASSIGN, 0);
      }

      public TerminalNode PLUS_ASSIGN() {
         return getToken(ANTLRv4Parser.PLUS_ASSIGN, 0);
      }

      public LexerAtomContext lexerAtom() {
         return getRuleContext(LexerAtomContext.class, 0);
      }

      public BlockContext block() {
         return getRuleContext(BlockContext.class, 0);
      }

      public LabeledLexerElementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_labeledLexerElement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterLabeledLexerElement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitLabeledLexerElement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitLabeledLexerElement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LabeledLexerElementContext labeledLexerElement() throws RecognitionException {
      LabeledLexerElementContext _localctx = new LabeledLexerElementContext(_ctx, getState());
      enterRule(_localctx, 76, RULE_labeledLexerElement);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(402);
            id();
            setState(403);
            _la = _input.LA(1);
            if (!(_la == ASSIGN || _la == PLUS_ASSIGN)) {
               _errHandler.recoverInline(this);
            }
            else {
               consume();
            }
            setState(406);
            switch (_input.LA(1)) {
               case TOKEN_REF :
               case RULE_REF :
               case LEXER_CHAR_SET :
               case DOT :
               case NOT :
               case STRING_LITERAL : {
                  setState(404);
                  lexerAtom();
               }
                  break;
               case LPAREN : {
                  setState(405);
                  block();
               }
                  break;
               default :
                  throw new NoViableAltException(this);
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

   public static class LexerBlockContext extends ParserRuleContext {
      public TerminalNode LPAREN() {
         return getToken(ANTLRv4Parser.LPAREN, 0);
      }

      public LexerAltListContext lexerAltList() {
         return getRuleContext(LexerAltListContext.class, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(ANTLRv4Parser.RPAREN, 0);
      }

      public LexerBlockContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_lexerBlock;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterLexerBlock(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitLexerBlock(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitLexerBlock(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LexerBlockContext lexerBlock() throws RecognitionException {
      LexerBlockContext _localctx = new LexerBlockContext(_ctx, getState());
      enterRule(_localctx, 78, RULE_lexerBlock);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(408);
            match(LPAREN);
            setState(409);
            lexerAltList();
            setState(410);
            match(RPAREN);
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

   public static class LexerCommandsContext extends ParserRuleContext {
      public TerminalNode RARROW() {
         return getToken(ANTLRv4Parser.RARROW, 0);
      }

      public List<LexerCommandContext> lexerCommand() {
         return getRuleContexts(LexerCommandContext.class);
      }

      public LexerCommandContext lexerCommand(int i) {
         return getRuleContext(LexerCommandContext.class, i);
      }

      public List<TerminalNode> COMMA() {
         return getTokens(ANTLRv4Parser.COMMA);
      }

      public TerminalNode COMMA(int i) {
         return getToken(ANTLRv4Parser.COMMA, i);
      }

      public LexerCommandsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_lexerCommands;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterLexerCommands(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitLexerCommands(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitLexerCommands(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LexerCommandsContext lexerCommands() throws RecognitionException {
      LexerCommandsContext _localctx = new LexerCommandsContext(_ctx, getState());
      enterRule(_localctx, 80, RULE_lexerCommands);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(412);
            match(RARROW);
            setState(413);
            lexerCommand();
            setState(418);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(414);
                     match(COMMA);
                     setState(415);
                     lexerCommand();
                  }
               }
               setState(420);
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

   public static class LexerCommandContext extends ParserRuleContext {
      public LexerCommandNameContext lexerCommandName() {
         return getRuleContext(LexerCommandNameContext.class, 0);
      }

      public TerminalNode LPAREN() {
         return getToken(ANTLRv4Parser.LPAREN, 0);
      }

      public LexerCommandExprContext lexerCommandExpr() {
         return getRuleContext(LexerCommandExprContext.class, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(ANTLRv4Parser.RPAREN, 0);
      }

      public LexerCommandContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_lexerCommand;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterLexerCommand(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitLexerCommand(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitLexerCommand(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LexerCommandContext lexerCommand() throws RecognitionException {
      LexerCommandContext _localctx = new LexerCommandContext(_ctx, getState());
      enterRule(_localctx, 82, RULE_lexerCommand);
      try {
         setState(427);
         switch (getInterpreter().adaptivePredict(_input, 45, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(421);
               lexerCommandName();
               setState(422);
               match(LPAREN);
               setState(423);
               lexerCommandExpr();
               setState(424);
               match(RPAREN);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(426);
               lexerCommandName();
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

   public static class LexerCommandNameContext extends ParserRuleContext {
      public IdContext id() {
         return getRuleContext(IdContext.class, 0);
      }

      public TerminalNode MODE() {
         return getToken(ANTLRv4Parser.MODE, 0);
      }

      public LexerCommandNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_lexerCommandName;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterLexerCommandName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitLexerCommandName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitLexerCommandName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LexerCommandNameContext lexerCommandName() throws RecognitionException {
      LexerCommandNameContext _localctx = new LexerCommandNameContext(_ctx, getState());
      enterRule(_localctx, 84, RULE_lexerCommandName);
      try {
         setState(431);
         switch (_input.LA(1)) {
            case TOKEN_REF :
            case RULE_REF :
               enterOuterAlt(_localctx, 1); {
               setState(429);
               id();
            }
               break;
            case MODE :
               enterOuterAlt(_localctx, 2); {
               setState(430);
               match(MODE);
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

   public static class LexerCommandExprContext extends ParserRuleContext {
      public IdContext id() {
         return getRuleContext(IdContext.class, 0);
      }

      public TerminalNode INT() {
         return getToken(ANTLRv4Parser.INT, 0);
      }

      public LexerCommandExprContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_lexerCommandExpr;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterLexerCommandExpr(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitLexerCommandExpr(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitLexerCommandExpr(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LexerCommandExprContext lexerCommandExpr() throws RecognitionException {
      LexerCommandExprContext _localctx = new LexerCommandExprContext(_ctx, getState());
      enterRule(_localctx, 86, RULE_lexerCommandExpr);
      try {
         setState(435);
         switch (_input.LA(1)) {
            case TOKEN_REF :
            case RULE_REF :
               enterOuterAlt(_localctx, 1); {
               setState(433);
               id();
            }
               break;
            case INT :
               enterOuterAlt(_localctx, 2); {
               setState(434);
               match(INT);
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

   public static class AltListContext extends ParserRuleContext {
      public List<AlternativeContext> alternative() {
         return getRuleContexts(AlternativeContext.class);
      }

      public AlternativeContext alternative(int i) {
         return getRuleContext(AlternativeContext.class, i);
      }

      public List<TerminalNode> OR() {
         return getTokens(ANTLRv4Parser.OR);
      }

      public TerminalNode OR(int i) {
         return getToken(ANTLRv4Parser.OR, i);
      }

      public AltListContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_altList;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterAltList(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitAltList(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitAltList(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AltListContext altList() throws RecognitionException {
      AltListContext _localctx = new AltListContext(_ctx, getState());
      enterRule(_localctx, 88, RULE_altList);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(437);
            alternative();
            setState(442);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == OR) {
               {
                  {
                     setState(438);
                     match(OR);
                     setState(439);
                     alternative();
                  }
               }
               setState(444);
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

   public static class AlternativeContext extends ParserRuleContext {
      public ElementOptionsContext elementOptions() {
         return getRuleContext(ElementOptionsContext.class, 0);
      }

      public List<ElementContext> element() {
         return getRuleContexts(ElementContext.class);
      }

      public ElementContext element(int i) {
         return getRuleContext(ElementContext.class, i);
      }

      public AlternativeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_alternative;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterAlternative(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitAlternative(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitAlternative(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AlternativeContext alternative() throws RecognitionException {
      AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
      enterRule(_localctx, 90, RULE_alternative);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(446);
            _la = _input.LA(1);
            if (_la == LT) {
               {
                  setState(445);
                  elementOptions();
               }
            }

            setState(451);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << RULE_REF) | (1L << LPAREN)
               | (1L << DOT) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << ACTION))) != 0)) {
               {
                  {
                     setState(448);
                     element();
                  }
               }
               setState(453);
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

   public static class ElementContext extends ParserRuleContext {
      public LabeledElementContext labeledElement() {
         return getRuleContext(LabeledElementContext.class, 0);
      }

      public EbnfSuffixContext ebnfSuffix() {
         return getRuleContext(EbnfSuffixContext.class, 0);
      }

      public AtomContext atom() {
         return getRuleContext(AtomContext.class, 0);
      }

      public EbnfContext ebnf() {
         return getRuleContext(EbnfContext.class, 0);
      }

      public TerminalNode ACTION() {
         return getToken(ANTLRv4Parser.ACTION, 0);
      }

      public TerminalNode QUESTION() {
         return getToken(ANTLRv4Parser.QUESTION, 0);
      }

      public ElementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_element;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterElement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitElement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitElement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ElementContext element() throws RecognitionException {
      ElementContext _localctx = new ElementContext(_ctx, getState());
      enterRule(_localctx, 92, RULE_element);
      int _la;
      try {
         setState(469);
         switch (getInterpreter().adaptivePredict(_input, 54, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(454);
               labeledElement();
               setState(457);
               switch (_input.LA(1)) {
                  case QUESTION :
                  case STAR :
                  case PLUS : {
                     setState(455);
                     ebnfSuffix();
                  }
                     break;
                  case TOKEN_REF :
                  case RULE_REF :
                  case SEMI :
                  case LPAREN :
                  case RPAREN :
                  case OR :
                  case DOT :
                  case POUND :
                  case NOT :
                  case STRING_LITERAL :
                  case ACTION : {
                  }
                     break;
                  default :
                     throw new NoViableAltException(this);
               }
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(459);
               atom();
               setState(462);
               switch (_input.LA(1)) {
                  case QUESTION :
                  case STAR :
                  case PLUS : {
                     setState(460);
                     ebnfSuffix();
                  }
                     break;
                  case TOKEN_REF :
                  case RULE_REF :
                  case SEMI :
                  case LPAREN :
                  case RPAREN :
                  case OR :
                  case DOT :
                  case POUND :
                  case NOT :
                  case STRING_LITERAL :
                  case ACTION : {
                  }
                     break;
                  default :
                     throw new NoViableAltException(this);
               }
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(464);
               ebnf();
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(465);
               match(ACTION);
               setState(467);
               _la = _input.LA(1);
               if (_la == QUESTION) {
                  {
                     setState(466);
                     match(QUESTION);
                  }
               }

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

   public static class LabeledElementContext extends ParserRuleContext {
      public IdContext id() {
         return getRuleContext(IdContext.class, 0);
      }

      public TerminalNode ASSIGN() {
         return getToken(ANTLRv4Parser.ASSIGN, 0);
      }

      public TerminalNode PLUS_ASSIGN() {
         return getToken(ANTLRv4Parser.PLUS_ASSIGN, 0);
      }

      public AtomContext atom() {
         return getRuleContext(AtomContext.class, 0);
      }

      public BlockContext block() {
         return getRuleContext(BlockContext.class, 0);
      }

      public LabeledElementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_labeledElement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterLabeledElement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitLabeledElement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitLabeledElement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LabeledElementContext labeledElement() throws RecognitionException {
      LabeledElementContext _localctx = new LabeledElementContext(_ctx, getState());
      enterRule(_localctx, 94, RULE_labeledElement);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(471);
            id();
            setState(472);
            _la = _input.LA(1);
            if (!(_la == ASSIGN || _la == PLUS_ASSIGN)) {
               _errHandler.recoverInline(this);
            }
            else {
               consume();
            }
            setState(475);
            switch (_input.LA(1)) {
               case TOKEN_REF :
               case RULE_REF :
               case DOT :
               case NOT :
               case STRING_LITERAL : {
                  setState(473);
                  atom();
               }
                  break;
               case LPAREN : {
                  setState(474);
                  block();
               }
                  break;
               default :
                  throw new NoViableAltException(this);
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

   public static class EbnfContext extends ParserRuleContext {
      public BlockContext block() {
         return getRuleContext(BlockContext.class, 0);
      }

      public BlockSuffixContext blockSuffix() {
         return getRuleContext(BlockSuffixContext.class, 0);
      }

      public EbnfContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ebnf;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterEbnf(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitEbnf(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitEbnf(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final EbnfContext ebnf() throws RecognitionException {
      EbnfContext _localctx = new EbnfContext(_ctx, getState());
      enterRule(_localctx, 96, RULE_ebnf);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(477);
            block();
            setState(479);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
               {
                  setState(478);
                  blockSuffix();
               }
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

   public static class BlockSuffixContext extends ParserRuleContext {
      public EbnfSuffixContext ebnfSuffix() {
         return getRuleContext(EbnfSuffixContext.class, 0);
      }

      public BlockSuffixContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_blockSuffix;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterBlockSuffix(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitBlockSuffix(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitBlockSuffix(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final BlockSuffixContext blockSuffix() throws RecognitionException {
      BlockSuffixContext _localctx = new BlockSuffixContext(_ctx, getState());
      enterRule(_localctx, 98, RULE_blockSuffix);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(481);
            ebnfSuffix();
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

   public static class EbnfSuffixContext extends ParserRuleContext {
      public List<TerminalNode> QUESTION() {
         return getTokens(ANTLRv4Parser.QUESTION);
      }

      public TerminalNode QUESTION(int i) {
         return getToken(ANTLRv4Parser.QUESTION, i);
      }

      public TerminalNode STAR() {
         return getToken(ANTLRv4Parser.STAR, 0);
      }

      public TerminalNode PLUS() {
         return getToken(ANTLRv4Parser.PLUS, 0);
      }

      public EbnfSuffixContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ebnfSuffix;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterEbnfSuffix(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitEbnfSuffix(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitEbnfSuffix(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final EbnfSuffixContext ebnfSuffix() throws RecognitionException {
      EbnfSuffixContext _localctx = new EbnfSuffixContext(_ctx, getState());
      enterRule(_localctx, 100, RULE_ebnfSuffix);
      int _la;
      try {
         setState(495);
         switch (_input.LA(1)) {
            case QUESTION :
               enterOuterAlt(_localctx, 1); {
               setState(483);
               match(QUESTION);
               setState(485);
               _la = _input.LA(1);
               if (_la == QUESTION) {
                  {
                     setState(484);
                     match(QUESTION);
                  }
               }

            }
               break;
            case STAR :
               enterOuterAlt(_localctx, 2); {
               setState(487);
               match(STAR);
               setState(489);
               _la = _input.LA(1);
               if (_la == QUESTION) {
                  {
                     setState(488);
                     match(QUESTION);
                  }
               }

            }
               break;
            case PLUS :
               enterOuterAlt(_localctx, 3); {
               setState(491);
               match(PLUS);
               setState(493);
               _la = _input.LA(1);
               if (_la == QUESTION) {
                  {
                     setState(492);
                     match(QUESTION);
                  }
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

   public static class LexerAtomContext extends ParserRuleContext {
      public RangeContext range() {
         return getRuleContext(RangeContext.class, 0);
      }

      public TerminalContext terminal() {
         return getRuleContext(TerminalContext.class, 0);
      }

      public TerminalNode RULE_REF() {
         return getToken(ANTLRv4Parser.RULE_REF, 0);
      }

      public NotSetContext notSet() {
         return getRuleContext(NotSetContext.class, 0);
      }

      public TerminalNode LEXER_CHAR_SET() {
         return getToken(ANTLRv4Parser.LEXER_CHAR_SET, 0);
      }

      public TerminalNode DOT() {
         return getToken(ANTLRv4Parser.DOT, 0);
      }

      public ElementOptionsContext elementOptions() {
         return getRuleContext(ElementOptionsContext.class, 0);
      }

      public LexerAtomContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_lexerAtom;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterLexerAtom(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitLexerAtom(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitLexerAtom(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final LexerAtomContext lexerAtom() throws RecognitionException {
      LexerAtomContext _localctx = new LexerAtomContext(_ctx, getState());
      enterRule(_localctx, 102, RULE_lexerAtom);
      int _la;
      try {
         setState(506);
         switch (getInterpreter().adaptivePredict(_input, 62, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(497);
               range();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(498);
               terminal();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(499);
               match(RULE_REF);
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(500);
               notSet();
            }
               break;
            case 5 :
               enterOuterAlt(_localctx, 5); {
               setState(501);
               match(LEXER_CHAR_SET);
            }
               break;
            case 6 :
               enterOuterAlt(_localctx, 6); {
               setState(502);
               match(DOT);
               setState(504);
               _la = _input.LA(1);
               if (_la == LT) {
                  {
                     setState(503);
                     elementOptions();
                  }
               }

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

   public static class AtomContext extends ParserRuleContext {
      public RangeContext range() {
         return getRuleContext(RangeContext.class, 0);
      }

      public TerminalContext terminal() {
         return getRuleContext(TerminalContext.class, 0);
      }

      public RulerefContext ruleref() {
         return getRuleContext(RulerefContext.class, 0);
      }

      public NotSetContext notSet() {
         return getRuleContext(NotSetContext.class, 0);
      }

      public TerminalNode DOT() {
         return getToken(ANTLRv4Parser.DOT, 0);
      }

      public ElementOptionsContext elementOptions() {
         return getRuleContext(ElementOptionsContext.class, 0);
      }

      public AtomContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_atom;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterAtom(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitAtom(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitAtom(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final AtomContext atom() throws RecognitionException {
      AtomContext _localctx = new AtomContext(_ctx, getState());
      enterRule(_localctx, 104, RULE_atom);
      int _la;
      try {
         setState(516);
         switch (getInterpreter().adaptivePredict(_input, 64, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(508);
               range();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(509);
               terminal();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(510);
               ruleref();
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(511);
               notSet();
            }
               break;
            case 5 :
               enterOuterAlt(_localctx, 5); {
               setState(512);
               match(DOT);
               setState(514);
               _la = _input.LA(1);
               if (_la == LT) {
                  {
                     setState(513);
                     elementOptions();
                  }
               }

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

   public static class NotSetContext extends ParserRuleContext {
      public TerminalNode NOT() {
         return getToken(ANTLRv4Parser.NOT, 0);
      }

      public SetElementContext setElement() {
         return getRuleContext(SetElementContext.class, 0);
      }

      public BlockSetContext blockSet() {
         return getRuleContext(BlockSetContext.class, 0);
      }

      public NotSetContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_notSet;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterNotSet(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitNotSet(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitNotSet(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final NotSetContext notSet() throws RecognitionException {
      NotSetContext _localctx = new NotSetContext(_ctx, getState());
      enterRule(_localctx, 106, RULE_notSet);
      try {
         setState(522);
         switch (getInterpreter().adaptivePredict(_input, 65, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(518);
               match(NOT);
               setState(519);
               setElement();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(520);
               match(NOT);
               setState(521);
               blockSet();
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

   public static class BlockSetContext extends ParserRuleContext {
      public TerminalNode LPAREN() {
         return getToken(ANTLRv4Parser.LPAREN, 0);
      }

      public List<SetElementContext> setElement() {
         return getRuleContexts(SetElementContext.class);
      }

      public SetElementContext setElement(int i) {
         return getRuleContext(SetElementContext.class, i);
      }

      public TerminalNode RPAREN() {
         return getToken(ANTLRv4Parser.RPAREN, 0);
      }

      public List<TerminalNode> OR() {
         return getTokens(ANTLRv4Parser.OR);
      }

      public TerminalNode OR(int i) {
         return getToken(ANTLRv4Parser.OR, i);
      }

      public BlockSetContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_blockSet;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterBlockSet(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitBlockSet(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitBlockSet(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final BlockSetContext blockSet() throws RecognitionException {
      BlockSetContext _localctx = new BlockSetContext(_ctx, getState());
      enterRule(_localctx, 108, RULE_blockSet);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(524);
            match(LPAREN);
            setState(525);
            setElement();
            setState(530);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == OR) {
               {
                  {
                     setState(526);
                     match(OR);
                     setState(527);
                     setElement();
                  }
               }
               setState(532);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(533);
            match(RPAREN);
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

   public static class SetElementContext extends ParserRuleContext {
      public TerminalNode TOKEN_REF() {
         return getToken(ANTLRv4Parser.TOKEN_REF, 0);
      }

      public ElementOptionsContext elementOptions() {
         return getRuleContext(ElementOptionsContext.class, 0);
      }

      public TerminalNode STRING_LITERAL() {
         return getToken(ANTLRv4Parser.STRING_LITERAL, 0);
      }

      public RangeContext range() {
         return getRuleContext(RangeContext.class, 0);
      }

      public TerminalNode LEXER_CHAR_SET() {
         return getToken(ANTLRv4Parser.LEXER_CHAR_SET, 0);
      }

      public SetElementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_setElement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterSetElement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitSetElement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitSetElement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final SetElementContext setElement() throws RecognitionException {
      SetElementContext _localctx = new SetElementContext(_ctx, getState());
      enterRule(_localctx, 110, RULE_setElement);
      int _la;
      try {
         setState(545);
         switch (getInterpreter().adaptivePredict(_input, 69, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(535);
               match(TOKEN_REF);
               setState(537);
               _la = _input.LA(1);
               if (_la == LT) {
                  {
                     setState(536);
                     elementOptions();
                  }
               }

            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(539);
               match(STRING_LITERAL);
               setState(541);
               _la = _input.LA(1);
               if (_la == LT) {
                  {
                     setState(540);
                     elementOptions();
                  }
               }

            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(543);
               range();
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(544);
               match(LEXER_CHAR_SET);
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

   public static class BlockContext extends ParserRuleContext {
      public TerminalNode LPAREN() {
         return getToken(ANTLRv4Parser.LPAREN, 0);
      }

      public AltListContext altList() {
         return getRuleContext(AltListContext.class, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(ANTLRv4Parser.RPAREN, 0);
      }

      public TerminalNode COLON() {
         return getToken(ANTLRv4Parser.COLON, 0);
      }

      public OptionsSpecContext optionsSpec() {
         return getRuleContext(OptionsSpecContext.class, 0);
      }

      public List<RuleActionContext> ruleAction() {
         return getRuleContexts(RuleActionContext.class);
      }

      public RuleActionContext ruleAction(int i) {
         return getRuleContext(RuleActionContext.class, i);
      }

      public BlockContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_block;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterBlock(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitBlock(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitBlock(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final BlockContext block() throws RecognitionException {
      BlockContext _localctx = new BlockContext(_ctx, getState());
      enterRule(_localctx, 112, RULE_block);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(547);
            match(LPAREN);
            setState(558);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPTIONS) | (1L << COLON) | (1L << AT))) != 0)) {
               {
                  setState(549);
                  _la = _input.LA(1);
                  if (_la == OPTIONS) {
                     {
                        setState(548);
                        optionsSpec();
                     }
                  }

                  setState(554);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
                  while (_la == AT) {
                     {
                        {
                           setState(551);
                           ruleAction();
                        }
                     }
                     setState(556);
                     _errHandler.sync(this);
                     _la = _input.LA(1);
                  }
                  setState(557);
                  match(COLON);
               }
            }

            setState(560);
            altList();
            setState(561);
            match(RPAREN);
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

   public static class RulerefContext extends ParserRuleContext {
      public TerminalNode RULE_REF() {
         return getToken(ANTLRv4Parser.RULE_REF, 0);
      }

      public TerminalNode ARG_ACTION() {
         return getToken(ANTLRv4Parser.ARG_ACTION, 0);
      }

      public ElementOptionsContext elementOptions() {
         return getRuleContext(ElementOptionsContext.class, 0);
      }

      public RulerefContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ruleref;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterRuleref(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitRuleref(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitRuleref(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final RulerefContext ruleref() throws RecognitionException {
      RulerefContext _localctx = new RulerefContext(_ctx, getState());
      enterRule(_localctx, 114, RULE_ruleref);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(563);
            match(RULE_REF);
            setState(565);
            _la = _input.LA(1);
            if (_la == ARG_ACTION) {
               {
                  setState(564);
                  match(ARG_ACTION);
               }
            }

            setState(568);
            _la = _input.LA(1);
            if (_la == LT) {
               {
                  setState(567);
                  elementOptions();
               }
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

   public static class RangeContext extends ParserRuleContext {
      public List<TerminalNode> STRING_LITERAL() {
         return getTokens(ANTLRv4Parser.STRING_LITERAL);
      }

      public TerminalNode STRING_LITERAL(int i) {
         return getToken(ANTLRv4Parser.STRING_LITERAL, i);
      }

      public TerminalNode RANGE() {
         return getToken(ANTLRv4Parser.RANGE, 0);
      }

      public RangeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_range;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterRange(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitRange(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitRange(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final RangeContext range() throws RecognitionException {
      RangeContext _localctx = new RangeContext(_ctx, getState());
      enterRule(_localctx, 116, RULE_range);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(570);
            match(STRING_LITERAL);
            setState(571);
            match(RANGE);
            setState(572);
            match(STRING_LITERAL);
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

   public static class TerminalContext extends ParserRuleContext {
      public TerminalNode TOKEN_REF() {
         return getToken(ANTLRv4Parser.TOKEN_REF, 0);
      }

      public ElementOptionsContext elementOptions() {
         return getRuleContext(ElementOptionsContext.class, 0);
      }

      public TerminalNode STRING_LITERAL() {
         return getToken(ANTLRv4Parser.STRING_LITERAL, 0);
      }

      public TerminalContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_terminal;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterTerminal(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitTerminal(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitTerminal(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TerminalContext terminal() throws RecognitionException {
      TerminalContext _localctx = new TerminalContext(_ctx, getState());
      enterRule(_localctx, 118, RULE_terminal);
      int _la;
      try {
         setState(582);
         switch (_input.LA(1)) {
            case TOKEN_REF :
               enterOuterAlt(_localctx, 1); {
               setState(574);
               match(TOKEN_REF);
               setState(576);
               _la = _input.LA(1);
               if (_la == LT) {
                  {
                     setState(575);
                     elementOptions();
                  }
               }

            }
               break;
            case STRING_LITERAL :
               enterOuterAlt(_localctx, 2); {
               setState(578);
               match(STRING_LITERAL);
               setState(580);
               _la = _input.LA(1);
               if (_la == LT) {
                  {
                     setState(579);
                     elementOptions();
                  }
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

   public static class ElementOptionsContext extends ParserRuleContext {
      public TerminalNode LT() {
         return getToken(ANTLRv4Parser.LT, 0);
      }

      public List<ElementOptionContext> elementOption() {
         return getRuleContexts(ElementOptionContext.class);
      }

      public ElementOptionContext elementOption(int i) {
         return getRuleContext(ElementOptionContext.class, i);
      }

      public TerminalNode GT() {
         return getToken(ANTLRv4Parser.GT, 0);
      }

      public List<TerminalNode> COMMA() {
         return getTokens(ANTLRv4Parser.COMMA);
      }

      public TerminalNode COMMA(int i) {
         return getToken(ANTLRv4Parser.COMMA, i);
      }

      public ElementOptionsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_elementOptions;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterElementOptions(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitElementOptions(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitElementOptions(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ElementOptionsContext elementOptions() throws RecognitionException {
      ElementOptionsContext _localctx = new ElementOptionsContext(_ctx, getState());
      enterRule(_localctx, 120, RULE_elementOptions);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(584);
            match(LT);
            setState(585);
            elementOption();
            setState(590);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(586);
                     match(COMMA);
                     setState(587);
                     elementOption();
                  }
               }
               setState(592);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(593);
            match(GT);
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

   public static class ElementOptionContext extends ParserRuleContext {
      public List<IdContext> id() {
         return getRuleContexts(IdContext.class);
      }

      public IdContext id(int i) {
         return getRuleContext(IdContext.class, i);
      }

      public TerminalNode ASSIGN() {
         return getToken(ANTLRv4Parser.ASSIGN, 0);
      }

      public TerminalNode STRING_LITERAL() {
         return getToken(ANTLRv4Parser.STRING_LITERAL, 0);
      }

      public ElementOptionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_elementOption;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterElementOption(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitElementOption(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitElementOption(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ElementOptionContext elementOption() throws RecognitionException {
      ElementOptionContext _localctx = new ElementOptionContext(_ctx, getState());
      enterRule(_localctx, 122, RULE_elementOption);
      try {
         setState(602);
         switch (getInterpreter().adaptivePredict(_input, 80, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(595);
               id();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(596);
               id();
               setState(597);
               match(ASSIGN);
               setState(600);
               switch (_input.LA(1)) {
                  case TOKEN_REF :
                  case RULE_REF : {
                     setState(598);
                     id();
                  }
                     break;
                  case STRING_LITERAL : {
                     setState(599);
                     match(STRING_LITERAL);
                  }
                     break;
                  default :
                     throw new NoViableAltException(this);
               }
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

   public static class IdContext extends ParserRuleContext {
      public TerminalNode RULE_REF() {
         return getToken(ANTLRv4Parser.RULE_REF, 0);
      }

      public TerminalNode TOKEN_REF() {
         return getToken(ANTLRv4Parser.TOKEN_REF, 0);
      }

      public IdContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_id;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).enterId(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof ANTLRv4ParserListener)
            ((ANTLRv4ParserListener) listener).exitId(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof ANTLRv4ParserVisitor)
            return ((ANTLRv4ParserVisitor<? extends T>) visitor).visitId(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final IdContext id() throws RecognitionException {
      IdContext _localctx = new IdContext(_ctx, getState());
      enterRule(_localctx, 124, RULE_id);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(604);
            _la = _input.LA(1);
            if (!(_la == TOKEN_REF || _la == RULE_REF)) {
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

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u0261\4\2\t\2\4"
      + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
      + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
      + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
      + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
      + "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
      + ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"
      + "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="
      + "\4>\t>\4?\t?\4@\t@\3\2\3\2\7\2\u0083\n\2\f\2\16\2\u0086\13\2\3\2\3\2\7"
      + "\2\u008a\n\2\f\2\16\2\u008d\13\2\3\2\3\2\3\3\5\3\u0092\n\3\3\3\3\3\3\3"
      + "\3\3\3\4\3\4\3\4\3\4\3\4\5\4\u009d\n\4\3\5\3\5\3\5\3\5\5\5\u00a3\n\5\3"
      + "\6\3\6\5\6\u00a7\n\6\3\6\3\6\3\7\3\7\3\7\6\7\u00ae\n\7\r\7\16\7\u00af"
      + "\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u00b9\n\t\f\t\16\t\u00bc\13\t\3\t\3\t"
      + "\3\t\5\t\u00c1\n\t\3\n\3\n\3\n\3\n\7\n\u00c7\n\n\f\n\16\n\u00ca\13\n\3"
      + "\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u00d3\n\13\3\f\3\f\3\f\3\f\3\r\3"
      + "\r\3\r\7\r\u00dc\n\r\f\r\16\r\u00df\13\r\3\r\5\r\u00e2\n\r\3\16\3\16\3"
      + "\17\3\17\3\17\3\17\5\17\u00ea\n\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20"
      + "\u00f2\n\20\3\21\3\21\3\21\3\21\7\21\u00f8\n\21\f\21\16\21\u00fb\13\21"
      + "\3\22\7\22\u00fe\n\22\f\22\16\22\u0101\13\22\3\23\3\23\5\23\u0105\n\23"
      + "\3\24\5\24\u0108\n\24\3\24\5\24\u010b\n\24\3\24\3\24\5\24\u010f\n\24\3"
      + "\24\5\24\u0112\n\24\3\24\5\24\u0115\n\24\3\24\5\24\u0118\n\24\3\24\7\24"
      + "\u011b\n\24\f\24\16\24\u011e\13\24\3\24\3\24\3\24\3\25\7\25\u0124\n\25"
      + "\f\25\16\25\u0127\13\25\3\25\5\25\u012a\n\25\3\26\3\26\3\26\3\26\3\27"
      + "\3\27\3\27\3\30\3\30\5\30\u0135\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32"
      + "\7\32\u013e\n\32\f\32\16\32\u0141\13\32\3\33\3\33\3\33\3\34\3\34\3\34"
      + "\3\34\3\35\6\35\u014b\n\35\r\35\16\35\u014c\3\36\3\36\3\37\3\37\3\37\3"
      + "\37\3 \3 \3 \7 \u0158\n \f \16 \u015b\13 \3!\3!\3!\5!\u0160\n!\3\"\5\""
      + "\u0163\n\"\3\"\5\"\u0166\n\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\7$\u0172"
      + "\n$\f$\16$\u0175\13$\3%\3%\5%\u0179\n%\3%\5%\u017c\n%\3&\6&\u017f\n&\r"
      + "&\16&\u0180\3\'\3\'\5\'\u0185\n\'\3\'\3\'\5\'\u0189\n\'\3\'\3\'\5\'\u018d"
      + "\n\'\3\'\3\'\5\'\u0191\n\'\5\'\u0193\n\'\3(\3(\3(\3(\5(\u0199\n(\3)\3"
      + ")\3)\3)\3*\3*\3*\3*\7*\u01a3\n*\f*\16*\u01a6\13*\3+\3+\3+\3+\3+\3+\5+"
      + "\u01ae\n+\3,\3,\5,\u01b2\n,\3-\3-\5-\u01b6\n-\3.\3.\3.\7.\u01bb\n.\f."
      + "\16.\u01be\13.\3/\5/\u01c1\n/\3/\7/\u01c4\n/\f/\16/\u01c7\13/\3\60\3\60"
      + "\3\60\5\60\u01cc\n\60\3\60\3\60\3\60\5\60\u01d1\n\60\3\60\3\60\3\60\5"
      + "\60\u01d6\n\60\5\60\u01d8\n\60\3\61\3\61\3\61\3\61\5\61\u01de\n\61\3\62"
      + "\3\62\5\62\u01e2\n\62\3\63\3\63\3\64\3\64\5\64\u01e8\n\64\3\64\3\64\5"
      + "\64\u01ec\n\64\3\64\3\64\5\64\u01f0\n\64\5\64\u01f2\n\64\3\65\3\65\3\65"
      + "\3\65\3\65\3\65\3\65\5\65\u01fb\n\65\5\65\u01fd\n\65\3\66\3\66\3\66\3"
      + "\66\3\66\3\66\5\66\u0205\n\66\5\66\u0207\n\66\3\67\3\67\3\67\3\67\5\67"
      + "\u020d\n\67\38\38\38\38\78\u0213\n8\f8\168\u0216\138\38\38\39\39\59\u021c"
      + "\n9\39\39\59\u0220\n9\39\39\59\u0224\n9\3:\3:\5:\u0228\n:\3:\7:\u022b"
      + "\n:\f:\16:\u022e\13:\3:\5:\u0231\n:\3:\3:\3:\3;\3;\5;\u0238\n;\3;\5;\u023b"
      + "\n;\3<\3<\3<\3<\3=\3=\5=\u0243\n=\3=\3=\5=\u0247\n=\5=\u0249\n=\3>\3>"
      + "\3>\3>\7>\u024f\n>\f>\16>\u0252\13>\3>\3>\3?\3?\3?\3?\3?\5?\u025b\n?\5"
      + "?\u025d\n?\3@\3@\3@\2\2A\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("
      + "*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\2\5\4\2\r\r\21\23"
      + "\4\2##\'\'\3\2\3\4\u0286\2\u0080\3\2\2\2\4\u0091\3\2\2\2\6\u009c\3\2\2"
      + "\2\b\u00a2\3\2\2\2\n\u00a4\3\2\2\2\f\u00ad\3\2\2\2\16\u00b1\3\2\2\2\20"
      + "\u00c0\3\2\2\2\22\u00c2\3\2\2\2\24\u00d2\3\2\2\2\26\u00d4\3\2\2\2\30\u00d8"
      + "\3\2\2\2\32\u00e3\3\2\2\2\34\u00e5\3\2\2\2\36\u00f1\3\2\2\2 \u00f3\3\2"
      + "\2\2\"\u00ff\3\2\2\2$\u0104\3\2\2\2&\u0107\3\2\2\2(\u0125\3\2\2\2*\u012b"
      + "\3\2\2\2,\u012f\3\2\2\2.\u0134\3\2\2\2\60\u0136\3\2\2\2\62\u0139\3\2\2"
      + "\2\64\u0142\3\2\2\2\66\u0145\3\2\2\28\u014a\3\2\2\2:\u014e\3\2\2\2<\u0150"
      + "\3\2\2\2>\u0154\3\2\2\2@\u015c\3\2\2\2B\u0162\3\2\2\2D\u016a\3\2\2\2F"
      + "\u016e\3\2\2\2H\u017b\3\2\2\2J\u017e\3\2\2\2L\u0192\3\2\2\2N\u0194\3\2"
      + "\2\2P\u019a\3\2\2\2R\u019e\3\2\2\2T\u01ad\3\2\2\2V\u01b1\3\2\2\2X\u01b5"
      + "\3\2\2\2Z\u01b7\3\2\2\2\\\u01c0\3\2\2\2^\u01d7\3\2\2\2`\u01d9\3\2\2\2"
      + "b\u01df\3\2\2\2d\u01e3\3\2\2\2f\u01f1\3\2\2\2h\u01fc\3\2\2\2j\u0206\3"
      + "\2\2\2l\u020c\3\2\2\2n\u020e\3\2\2\2p\u0223\3\2\2\2r\u0225\3\2\2\2t\u0235"
      + "\3\2\2\2v\u023c\3\2\2\2x\u0248\3\2\2\2z\u024a\3\2\2\2|\u025c\3\2\2\2~"
      + "\u025e\3\2\2\2\u0080\u0084\5\4\3\2\u0081\u0083\5\b\5\2\u0082\u0081\3\2"
      + "\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"
      + "\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008b\5\"\22\2\u0088\u008a\5"
      + " \21\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"
      + "\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\2"
      + "\2\3\u008f\3\3\2\2\2\u0090\u0092\7\6\2\2\u0091\u0090\3\2\2\2\u0091\u0092"
      + "\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\5\6\4\2\u0094\u0095\5~@\2\u0095"
      + "\u0096\7\35\2\2\u0096\5\3\2\2\2\u0097\u0098\7\16\2\2\u0098\u009d\7\20"
      + "\2\2\u0099\u009a\7\17\2\2\u009a\u009d\7\20\2\2\u009b\u009d\7\20\2\2\u009c"
      + "\u0097\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009b\3\2\2\2\u009d\7\3\2\2\2"
      + "\u009e\u00a3\5\n\6\2\u009f\u00a3\5\22\n\2\u00a0\u00a3\5\26\f\2\u00a1\u00a3"
      + "\5\34\17\2\u00a2\u009e\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a0\3\2\2\2"
      + "\u00a2\u00a1\3\2\2\2\u00a3\t\3\2\2\2\u00a4\u00a6\7\n\2\2\u00a5\u00a7\5"
      + "\f\7\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"
      + "\u00a9\7/\2\2\u00a9\13\3\2\2\2\u00aa\u00ab\5\16\b\2\u00ab\u00ac\7\35\2"
      + "\2\u00ac\u00ae\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad"
      + "\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\r\3\2\2\2\u00b1\u00b2\5~@\2\u00b2\u00b3"
      + "\7#\2\2\u00b3\u00b4\5\20\t\2\u00b4\17\3\2\2\2\u00b5\u00ba\5~@\2\u00b6"
      + "\u00b7\7*\2\2\u00b7\u00b9\5~@\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2"
      + "\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c1\3\2\2\2\u00bc\u00ba"
      + "\3\2\2\2\u00bd\u00c1\7\62\2\2\u00be\u00c1\7\65\2\2\u00bf\u00c1\7\61\2"
      + "\2\u00c0\u00b5\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf"
      + "\3\2\2\2\u00c1\21\3\2\2\2\u00c2\u00c3\7\f\2\2\u00c3\u00c8\5\24\13\2\u00c4"
      + "\u00c5\7\34\2\2\u00c5\u00c7\5\24\13\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca"
      + "\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca"
      + "\u00c8\3\2\2\2\u00cb\u00cc\7\35\2\2\u00cc\23\3\2\2\2\u00cd\u00ce\5~@\2"
      + "\u00ce\u00cf\7#\2\2\u00cf\u00d0\5~@\2\u00d0\u00d3\3\2\2\2\u00d1\u00d3"
      + "\5~@\2\u00d2\u00cd\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\25\3\2\2\2\u00d4"
      + "\u00d5\7\13\2\2\u00d5\u00d6\5\30\r\2\u00d6\u00d7\7/\2\2\u00d7\27\3\2\2"
      + "\2\u00d8\u00dd\5\32\16\2\u00d9\u00da\7\34\2\2\u00da\u00dc\5\32\16\2\u00db"
      + "\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"
      + "\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2\7\34\2\2\u00e1"
      + "\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\31\3\2\2\2\u00e3\u00e4\5~@\2"
      + "\u00e4\33\3\2\2\2\u00e5\u00e9\7,\2\2\u00e6\u00e7\5\36\20\2\u00e7\u00e8"
      + "\7\33\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00ea\3\2\2\2"
      + "\u00ea\u00eb\3\2\2\2\u00eb\u00ec\5~@\2\u00ec\u00ed\7\65\2\2\u00ed\35\3"
      + "\2\2\2\u00ee\u00f2\5~@\2\u00ef\u00f2\7\16\2\2\u00f0\u00f2\7\17\2\2\u00f1"
      + "\u00ee\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\37\3\2\2"
      + "\2\u00f3\u00f4\7\31\2\2\u00f4\u00f5\5~@\2\u00f5\u00f9\7\35\2\2\u00f6\u00f8"
      + "\5B\"\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"
      + "\u00fa\3\2\2\2\u00fa!\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fe\5$\23\2"
      + "\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100"
      + "\3\2\2\2\u0100#\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0105\5&\24\2\u0103"
      + "\u0105\5B\"\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105%\3\2\2\2\u0106"
      + "\u0108\7\6\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2"
      + "\2\2\u0109\u010b\58\35\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b"
      + "\u010c\3\2\2\2\u010c\u010e\7\4\2\2\u010d\u010f\7\67\2\2\u010e\u010d\3"
      + "\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u0112\5\60\31\2\u0111"
      + "\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0115\5\62"
      + "\32\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116"
      + "\u0118\5\64\33\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011c\3"
      + "\2\2\2\u0119\u011b\5.\30\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c"
      + "\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2"
      + "\2\2\u011f\u0120\5<\37\2\u0120\u0121\5(\25\2\u0121\'\3\2\2\2\u0122\u0124"
      + "\5*\26\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125"
      + "\u0126\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012a\5,"
      + "\27\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a)\3\2\2\2\u012b\u012c"
      + "\7\27\2\2\u012c\u012d\7\67\2\2\u012d\u012e\7\65\2\2\u012e+\3\2\2\2\u012f"
      + "\u0130\7\30\2\2\u0130\u0131\7\65\2\2\u0131-\3\2\2\2\u0132\u0135\5\n\6"
      + "\2\u0133\u0135\5\66\34\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135"
      + "/\3\2\2\2\u0136\u0137\7\24\2\2\u0137\u0138\7\67\2\2\u0138\61\3\2\2\2\u0139"
      + "\u013a\7\26\2\2\u013a\u013f\5~@\2\u013b\u013c\7\34\2\2\u013c\u013e\5~"
      + "@\2\u013d\u013b\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f"
      + "\u0140\3\2\2\2\u0140\63\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\7\25\2"
      + "\2\u0143\u0144\7\67\2\2\u0144\65\3\2\2\2\u0145\u0146\7,\2\2\u0146\u0147"
      + "\5~@\2\u0147\u0148\7\65\2\2\u0148\67\3\2\2\2\u0149\u014b\5:\36\2\u014a"
      + "\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"
      + "\2\2\u014d9\3\2\2\2\u014e\u014f\t\2\2\2\u014f;\3\2\2\2\u0150\u0151\7\32"
      + "\2\2\u0151\u0152\5> \2\u0152\u0153\7\35\2\2\u0153=\3\2\2\2\u0154\u0159"
      + "\5@!\2\u0155\u0156\7(\2\2\u0156\u0158\5@!\2\u0157\u0155\3\2\2\2\u0158"
      + "\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a?\3\2\2\2"
      + "\u015b\u0159\3\2\2\2\u015c\u015f\5\\/\2\u015d\u015e\7-\2\2\u015e\u0160"
      + "\5~@\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160A\3\2\2\2\u0161\u0163"
      + "\7\6\2\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164"
      + "\u0166\7\r\2\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2"
      + "\2\2\u0167\u0168\7\3\2\2\u0168\u0169\5D#\2\u0169C\3\2\2\2\u016a\u016b"
      + "\7\32\2\2\u016b\u016c\5F$\2\u016c\u016d\7\35\2\2\u016dE\3\2\2\2\u016e"
      + "\u0173\5H%\2\u016f\u0170\7(\2\2\u0170\u0172\5H%\2\u0171\u016f\3\2\2\2"
      + "\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174G\3"
      + "\2\2\2\u0175\u0173\3\2\2\2\u0176\u0178\5J&\2\u0177\u0179\5R*\2\u0178\u0177"
      + "\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u017c\3\2\2\2\u017b"
      + "\u0176\3\2\2\2\u017b\u017a\3\2\2\2\u017cI\3\2\2\2\u017d\u017f\5L\'\2\u017e"
      + "\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2"
      + "\2\2\u0181K\3\2\2\2\u0182\u0184\5N(\2\u0183\u0185\5f\64\2\u0184\u0183"
      + "\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0193\3\2\2\2\u0186\u0188\5h\65\2\u0187"
      + "\u0189\5f\64\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0193\3\2"
      + "\2\2\u018a\u018c\5P)\2\u018b\u018d\5f\64\2\u018c\u018b\3\2\2\2\u018c\u018d"
      + "\3\2\2\2\u018d\u0193\3\2\2\2\u018e\u0190\7\65\2\2\u018f\u0191\7$\2\2\u0190"
      + "\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0182\3\2"
      + "\2\2\u0192\u0186\3\2\2\2\u0192\u018a\3\2\2\2\u0192\u018e\3\2\2\2\u0193"
      + "M\3\2\2\2\u0194\u0195\5~@\2\u0195\u0198\t\3\2\2\u0196\u0199\5h\65\2\u0197"
      + "\u0199\5r:\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199O\3\2\2\2\u019a"
      + "\u019b\7\36\2\2\u019b\u019c\5F$\2\u019c\u019d\7\37\2\2\u019dQ\3\2\2\2"
      + "\u019e\u019f\7 \2\2\u019f\u01a4\5T+\2\u01a0\u01a1\7\34\2\2\u01a1\u01a3"
      + "\5T+\2\u01a2\u01a0\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4"
      + "\u01a5\3\2\2\2\u01a5S\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8\5V,\2\u01a8"
      + "\u01a9\7\36\2\2\u01a9\u01aa\5X-\2\u01aa\u01ab\7\37\2\2\u01ab\u01ae\3\2"
      + "\2\2\u01ac\u01ae\5V,\2\u01ad\u01a7\3\2\2\2\u01ad\u01ac\3\2\2\2\u01aeU"
      + "\3\2\2\2\u01af\u01b2\5~@\2\u01b0\u01b2\7\31\2\2\u01b1\u01af\3\2\2\2\u01b1"
      + "\u01b0\3\2\2\2\u01b2W\3\2\2\2\u01b3\u01b6\5~@\2\u01b4\u01b6\7\61\2\2\u01b5"
      + "\u01b3\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6Y\3\2\2\2\u01b7\u01bc\5\\/\2\u01b8"
      + "\u01b9\7(\2\2\u01b9\u01bb\5\\/\2\u01ba\u01b8\3\2\2\2\u01bb\u01be\3\2\2"
      + "\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd[\3\2\2\2\u01be\u01bc"
      + "\3\2\2\2\u01bf\u01c1\5z>\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"
      + "\u01c5\3\2\2\2\u01c2\u01c4\5^\60\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2"
      + "\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6]\3\2\2\2\u01c7\u01c5"
      + "\3\2\2\2\u01c8\u01cb\5`\61\2\u01c9\u01cc\5f\64\2\u01ca\u01cc\3\2\2\2\u01cb"
      + "\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01d8\3\2\2\2\u01cd\u01d0\5j"
      + "\66\2\u01ce\u01d1\5f\64\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0"
      + "\u01cf\3\2\2\2\u01d1\u01d8\3\2\2\2\u01d2\u01d8\5b\62\2\u01d3\u01d5\7\65"
      + "\2\2\u01d4\u01d6\7$\2\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"
      + "\u01d8\3\2\2\2\u01d7\u01c8\3\2\2\2\u01d7\u01cd\3\2\2\2\u01d7\u01d2\3\2"
      + "\2\2\u01d7\u01d3\3\2\2\2\u01d8_\3\2\2\2\u01d9\u01da\5~@\2\u01da\u01dd"
      + "\t\3\2\2\u01db\u01de\5j\66\2\u01dc\u01de\5r:\2\u01dd\u01db\3\2\2\2\u01dd"
      + "\u01dc\3\2\2\2\u01dea\3\2\2\2\u01df\u01e1\5r:\2\u01e0\u01e2\5d\63\2\u01e1"
      + "\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2c\3\2\2\2\u01e3\u01e4\5f\64\2"
      + "\u01e4e\3\2\2\2\u01e5\u01e7\7$\2\2\u01e6\u01e8\7$\2\2\u01e7\u01e6\3\2"
      + "\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01f2\3\2\2\2\u01e9\u01eb\7%\2\2\u01ea"
      + "\u01ec\7$\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01f2\3\2"
      + "\2\2\u01ed\u01ef\7&\2\2\u01ee\u01f0\7$\2\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0"
      + "\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01e5\3\2\2\2\u01f1\u01e9\3\2\2\2\u01f1"
      + "\u01ed\3\2\2\2\u01f2g\3\2\2\2\u01f3\u01fd\5v<\2\u01f4\u01fd\5x=\2\u01f5"
      + "\u01fd\7\4\2\2\u01f6\u01fd\5l\67\2\u01f7\u01fd\7\5\2\2\u01f8\u01fa\7*"
      + "\2\2\u01f9\u01fb\5z>\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd"
      + "\3\2\2\2\u01fc\u01f3\3\2\2\2\u01fc\u01f4\3\2\2\2\u01fc\u01f5\3\2\2\2\u01fc"
      + "\u01f6\3\2\2\2\u01fc\u01f7\3\2\2\2\u01fc\u01f8\3\2\2\2\u01fdi\3\2\2\2"
      + "\u01fe\u0207\5v<\2\u01ff\u0207\5x=\2\u0200\u0207\5t;\2\u0201\u0207\5l"
      + "\67\2\u0202\u0204\7*\2\2\u0203\u0205\5z>\2\u0204\u0203\3\2\2\2\u0204\u0205"
      + "\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u01fe\3\2\2\2\u0206\u01ff\3\2\2\2\u0206"
      + "\u0200\3\2\2\2\u0206\u0201\3\2\2\2\u0206\u0202\3\2\2\2\u0207k\3\2\2\2"
      + "\u0208\u0209\7.\2\2\u0209\u020d\5p9\2\u020a\u020b\7.\2\2\u020b\u020d\5"
      + "n8\2\u020c\u0208\3\2\2\2\u020c\u020a\3\2\2\2\u020dm\3\2\2\2\u020e\u020f"
      + "\7\36\2\2\u020f\u0214\5p9\2\u0210\u0211\7(\2\2\u0211\u0213\5p9\2\u0212"
      + "\u0210\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2"
      + "\2\2\u0215\u0217\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0218\7\37\2\2\u0218"
      + "o\3\2\2\2\u0219\u021b\7\3\2\2\u021a\u021c\5z>\2\u021b\u021a\3\2\2\2\u021b"
      + "\u021c\3\2\2\2\u021c\u0224\3\2\2\2\u021d\u021f\7\62\2\2\u021e\u0220\5"
      + "z>\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0224\3\2\2\2\u0221"
      + "\u0224\5v<\2\u0222\u0224\7\5\2\2\u0223\u0219\3\2\2\2\u0223\u021d\3\2\2"
      + "\2\u0223\u0221\3\2\2\2\u0223\u0222\3\2\2\2\u0224q\3\2\2\2\u0225\u0230"
      + "\7\36\2\2\u0226\u0228\5\n\6\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2"
      + "\u0228\u022c\3\2\2\2\u0229\u022b\5\66\34\2\u022a\u0229\3\2\2\2\u022b\u022e"
      + "\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e"
      + "\u022c\3\2\2\2\u022f\u0231\7\32\2\2\u0230\u0227\3\2\2\2\u0230\u0231\3"
      + "\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\5Z.\2\u0233\u0234\7\37\2\2\u0234"
      + "s\3\2\2\2\u0235\u0237\7\4\2\2\u0236\u0238\7\67\2\2\u0237\u0236\3\2\2\2"
      + "\u0237\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u023b\5z>\2\u023a\u0239"
      + "\3\2\2\2\u023a\u023b\3\2\2\2\u023bu\3\2\2\2\u023c\u023d\7\62\2\2\u023d"
      + "\u023e\7+\2\2\u023e\u023f\7\62\2\2\u023fw\3\2\2\2\u0240\u0242\7\3\2\2"
      + "\u0241\u0243\5z>\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0249"
      + "\3\2\2\2\u0244\u0246\7\62\2\2\u0245\u0247\5z>\2\u0246\u0245\3\2\2\2\u0246"
      + "\u0247\3\2\2\2\u0247\u0249\3\2\2\2\u0248\u0240\3\2\2\2\u0248\u0244\3\2"
      + "\2\2\u0249y\3\2\2\2\u024a\u024b\7!\2\2\u024b\u0250\5|?\2\u024c\u024d\7"
      + "\34\2\2\u024d\u024f\5|?\2\u024e\u024c\3\2\2\2\u024f\u0252\3\2\2\2\u0250"
      + "\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0253\3\2\2\2\u0252\u0250\3\2"
      + "\2\2\u0253\u0254\7\"\2\2\u0254{\3\2\2\2\u0255\u025d\5~@\2\u0256\u0257"
      + "\5~@\2\u0257\u025a\7#\2\2\u0258\u025b\5~@\2\u0259\u025b\7\62\2\2\u025a"
      + "\u0258\3\2\2\2\u025a\u0259\3\2\2\2\u025b\u025d\3\2\2\2\u025c\u0255\3\2"
      + "\2\2\u025c\u0256\3\2\2\2\u025d}\3\2\2\2\u025e\u025f\t\4\2\2\u025f\177"
      + "\3\2\2\2S\u0084\u008b\u0091\u009c\u00a2\u00a6\u00af\u00ba\u00c0\u00c8"
      + "\u00d2\u00dd\u00e1\u00e9\u00f1\u00f9\u00ff\u0104\u0107\u010a\u010e\u0111"
      + "\u0114\u0117\u011c\u0125\u0129\u0134\u013f\u014c\u0159\u015f\u0162\u0165"
      + "\u0173\u0178\u017b\u0180\u0184\u0188\u018c\u0190\u0192\u0198\u01a4\u01ad"
      + "\u01b1\u01b5\u01bc\u01c0\u01c5\u01cb\u01d0\u01d5\u01d7\u01dd\u01e1\u01e7"
      + "\u01eb\u01ef\u01f1\u01fa\u01fc\u0204\u0206\u020c\u0214\u021b\u021f\u0223"
      + "\u0227\u022c\u0230\u0237\u023a\u0242\u0246\u0248\u0250\u025a\u025c";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}