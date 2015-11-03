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
      RULE_delegateGrammar = 9, RULE_tokensSpec = 10, RULE_action = 11, RULE_actionScopeName = 12, RULE_modeSpec = 13,
      RULE_rules = 14, RULE_ruleSpec = 15, RULE_parserRuleSpec = 16, RULE_exceptionGroup = 17,
      RULE_exceptionHandler = 18, RULE_finallyClause = 19, RULE_rulePrequel = 20, RULE_ruleReturns = 21,
      RULE_throwsSpec = 22, RULE_localsSpec = 23, RULE_ruleAction = 24, RULE_ruleModifiers = 25, RULE_ruleModifier = 26,
      RULE_ruleBlock = 27, RULE_ruleAltList = 28, RULE_labeledAlt = 29, RULE_lexerRule = 30, RULE_lexerRuleBlock = 31,
      RULE_lexerAltList = 32, RULE_lexerAlt = 33, RULE_lexerElements = 34, RULE_lexerElement = 35,
      RULE_labeledLexerElement = 36, RULE_lexerBlock = 37, RULE_lexerCommands = 38, RULE_lexerCommand = 39,
      RULE_lexerCommandName = 40, RULE_lexerCommandExpr = 41, RULE_altList = 42, RULE_alternative = 43,
      RULE_element = 44, RULE_labeledElement = 45, RULE_ebnf = 46, RULE_blockSuffix = 47, RULE_ebnfSuffix = 48,
      RULE_lexerAtom = 49, RULE_atom = 50, RULE_notSet = 51, RULE_blockSet = 52, RULE_setElement = 53, RULE_block = 54,
      RULE_ruleref = 55, RULE_range = 56, RULE_terminal = 57, RULE_elementOptions = 58, RULE_elementOption = 59,
      RULE_id = 60;
   public static final String[] ruleNames = { "grammarSpec", "grammarDecl", "grammarType", "prequelConstruct",
      "optionsSpec", "optionsSpecBody", "option", "optionValue", "delegateGrammars", "delegateGrammar", "tokensSpec",
      "action", "actionScopeName", "modeSpec", "rules", "ruleSpec", "parserRuleSpec", "exceptionGroup",
      "exceptionHandler", "finallyClause", "rulePrequel", "ruleReturns", "throwsSpec", "localsSpec", "ruleAction",
      "ruleModifiers", "ruleModifier", "ruleBlock", "ruleAltList", "labeledAlt", "lexerRule", "lexerRuleBlock",
      "lexerAltList", "lexerAlt", "lexerElements", "lexerElement", "labeledLexerElement", "lexerBlock", "lexerCommands",
      "lexerCommand", "lexerCommandName", "lexerCommandExpr", "altList", "alternative", "element", "labeledElement",
      "ebnf", "blockSuffix", "ebnfSuffix", "lexerAtom", "atom", "notSet", "blockSet", "setElement", "block", "ruleref",
      "range", "terminal", "elementOptions", "elementOption", "id" };

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
            setState(122);
            grammarDecl();
            setState(126);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0
               && ((1L << _la) & ((1L << OPTIONS) | (1L << TOKENS) | (1L << IMPORT) | (1L << AT))) != 0)) {
               {
                  {
                     setState(123);
                     prequelConstruct();
                  }
               }
               setState(128);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(129);
            rules();
            setState(133);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == MODE) {
               {
                  {
                     setState(130);
                     modeSpec();
                  }
               }
               setState(135);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(136);
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
            setState(139);
            _la = _input.LA(1);
            if (_la == DOC_COMMENT) {
               {
                  setState(138);
                  match(DOC_COMMENT);
               }
            }

            setState(141);
            grammarType();
            setState(142);
            id();
            setState(143);
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
            setState(150);
            switch (_input.LA(1)) {
               case LEXER : {
                  setState(145);
                  match(LEXER);
                  setState(146);
                  match(GRAMMAR);
               }
                  break;
               case PARSER : {
                  setState(147);
                  match(PARSER);
                  setState(148);
                  match(GRAMMAR);
               }
                  break;
               case GRAMMAR : {
                  setState(149);
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
         setState(156);
         switch (_input.LA(1)) {
            case OPTIONS :
               enterOuterAlt(_localctx, 1); {
               setState(152);
               optionsSpec();
            }
               break;
            case IMPORT :
               enterOuterAlt(_localctx, 2); {
               setState(153);
               delegateGrammars();
            }
               break;
            case TOKENS :
               enterOuterAlt(_localctx, 3); {
               setState(154);
               tokensSpec();
            }
               break;
            case AT :
               enterOuterAlt(_localctx, 4); {
               setState(155);
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
            setState(158);
            match(OPTIONS);
            setState(160);
            _la = _input.LA(1);
            if (_la == TOKEN_REF || _la == RULE_REF) {
               {
                  setState(159);
                  optionsSpecBody();
               }
            }

            setState(162);
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
            setState(167);
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
               {
                  {
                     setState(164);
                     option();
                     setState(165);
                     match(SEMI);
                  }
               }
               setState(169);
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
            setState(171);
            id();
            setState(172);
            match(ASSIGN);
            setState(173);
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
         setState(186);
         switch (_input.LA(1)) {
            case TOKEN_REF :
            case RULE_REF :
               enterOuterAlt(_localctx, 1); {
               setState(175);
               id();
               setState(180);
               _errHandler.sync(this);
               _la = _input.LA(1);
               while (_la == DOT) {
                  {
                     {
                        setState(176);
                        match(DOT);
                        setState(177);
                        id();
                     }
                  }
                  setState(182);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
               }
            }
               break;
            case STRING_LITERAL :
               enterOuterAlt(_localctx, 2); {
               setState(183);
               match(STRING_LITERAL);
            }
               break;
            case ACTION :
               enterOuterAlt(_localctx, 3); {
               setState(184);
               match(ACTION);
            }
               break;
            case INT :
               enterOuterAlt(_localctx, 4); {
               setState(185);
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
            setState(188);
            match(IMPORT);
            setState(189);
            delegateGrammar();
            setState(194);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(190);
                     match(COMMA);
                     setState(191);
                     delegateGrammar();
                  }
               }
               setState(196);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(197);
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
         setState(204);
         switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(199);
               id();
               setState(200);
               match(ASSIGN);
               setState(201);
               id();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(203);
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

      public List<IdContext> id() {
         return getRuleContexts(IdContext.class);
      }

      public IdContext id(int i) {
         return getRuleContext(IdContext.class, i);
      }

      public TerminalNode RBRACE() {
         return getToken(ANTLRv4Parser.RBRACE, 0);
      }

      public List<TerminalNode> COMMA() {
         return getTokens(ANTLRv4Parser.COMMA);
      }

      public TerminalNode COMMA(int i) {
         return getToken(ANTLRv4Parser.COMMA, i);
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
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(206);
            match(TOKENS);
            setState(207);
            id();
            setState(212);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
               if (_alt == 1) {
                  {
                     {
                        setState(208);
                        match(COMMA);
                        setState(209);
                        id();
                     }
                  }
               }
               setState(214);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
            }
            setState(216);
            _la = _input.LA(1);
            if (_la == COMMA) {
               {
                  setState(215);
                  match(COMMA);
               }
            }

            setState(218);
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
      enterRule(_localctx, 22, RULE_action);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(220);
            match(AT);
            setState(224);
            switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
               case 1 : {
                  setState(221);
                  actionScopeName();
                  setState(222);
                  match(COLONCOLON);
               }
                  break;
            }
            setState(226);
            id();
            setState(227);
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
      enterRule(_localctx, 24, RULE_actionScopeName);
      try {
         setState(232);
         switch (_input.LA(1)) {
            case TOKEN_REF :
            case RULE_REF :
               enterOuterAlt(_localctx, 1); {
               setState(229);
               id();
            }
               break;
            case LEXER :
               enterOuterAlt(_localctx, 2); {
               setState(230);
               match(LEXER);
            }
               break;
            case PARSER :
               enterOuterAlt(_localctx, 3); {
               setState(231);
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
      enterRule(_localctx, 26, RULE_modeSpec);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(234);
            match(MODE);
            setState(235);
            id();
            setState(236);
            match(SEMI);
            setState(240);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0
               && ((1L << _la) & ((1L << TOKEN_REF) | (1L << DOC_COMMENT) | (1L << FRAGMENT))) != 0)) {
               {
                  {
                     setState(237);
                     lexerRule();
                  }
               }
               setState(242);
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
      enterRule(_localctx, 28, RULE_rules);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(246);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << RULE_REF) | (1L << DOC_COMMENT)
               | (1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) {
               {
                  {
                     setState(243);
                     ruleSpec();
                  }
               }
               setState(248);
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
      enterRule(_localctx, 30, RULE_ruleSpec);
      try {
         setState(251);
         switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(249);
               parserRuleSpec();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(250);
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

      public TerminalNode COLON() {
         return getToken(ANTLRv4Parser.COLON, 0);
      }

      public RuleBlockContext ruleBlock() {
         return getRuleContext(RuleBlockContext.class, 0);
      }

      public TerminalNode SEMI() {
         return getToken(ANTLRv4Parser.SEMI, 0);
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
      enterRule(_localctx, 32, RULE_parserRuleSpec);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(254);
            _la = _input.LA(1);
            if (_la == DOC_COMMENT) {
               {
                  setState(253);
                  match(DOC_COMMENT);
               }
            }

            setState(257);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0
               && ((1L << _la) & ((1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) {
               {
                  setState(256);
                  ruleModifiers();
               }
            }

            setState(259);
            match(RULE_REF);
            setState(261);
            _la = _input.LA(1);
            if (_la == ARG_ACTION) {
               {
                  setState(260);
                  match(ARG_ACTION);
               }
            }

            setState(264);
            _la = _input.LA(1);
            if (_la == RETURNS) {
               {
                  setState(263);
                  ruleReturns();
               }
            }

            setState(267);
            _la = _input.LA(1);
            if (_la == THROWS) {
               {
                  setState(266);
                  throwsSpec();
               }
            }

            setState(270);
            _la = _input.LA(1);
            if (_la == LOCALS) {
               {
                  setState(269);
                  localsSpec();
               }
            }

            setState(275);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == OPTIONS || _la == AT) {
               {
                  {
                     setState(272);
                     rulePrequel();
                  }
               }
               setState(277);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(278);
            match(COLON);
            setState(279);
            ruleBlock();
            setState(280);
            match(SEMI);
            setState(281);
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
      enterRule(_localctx, 34, RULE_exceptionGroup);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(286);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == CATCH) {
               {
                  {
                     setState(283);
                     exceptionHandler();
                  }
               }
               setState(288);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(290);
            _la = _input.LA(1);
            if (_la == FINALLY) {
               {
                  setState(289);
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
      enterRule(_localctx, 36, RULE_exceptionHandler);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(292);
            match(CATCH);
            setState(293);
            match(ARG_ACTION);
            setState(294);
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
      enterRule(_localctx, 38, RULE_finallyClause);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(296);
            match(FINALLY);
            setState(297);
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
      enterRule(_localctx, 40, RULE_rulePrequel);
      try {
         setState(301);
         switch (_input.LA(1)) {
            case OPTIONS :
               enterOuterAlt(_localctx, 1); {
               setState(299);
               optionsSpec();
            }
               break;
            case AT :
               enterOuterAlt(_localctx, 2); {
               setState(300);
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
      enterRule(_localctx, 42, RULE_ruleReturns);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(303);
            match(RETURNS);
            setState(304);
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
      enterRule(_localctx, 44, RULE_throwsSpec);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(306);
            match(THROWS);
            setState(307);
            id();
            setState(312);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(308);
                     match(COMMA);
                     setState(309);
                     id();
                  }
               }
               setState(314);
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
      enterRule(_localctx, 46, RULE_localsSpec);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(315);
            match(LOCALS);
            setState(316);
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
      enterRule(_localctx, 48, RULE_ruleAction);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(318);
            match(AT);
            setState(319);
            id();
            setState(320);
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
      enterRule(_localctx, 50, RULE_ruleModifiers);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(323);
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
               {
                  {
                     setState(322);
                     ruleModifier();
                  }
               }
               setState(325);
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
      enterRule(_localctx, 52, RULE_ruleModifier);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(327);
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
      public RuleAltListContext ruleAltList() {
         return getRuleContext(RuleAltListContext.class, 0);
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
      enterRule(_localctx, 54, RULE_ruleBlock);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(329);
            ruleAltList();
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
      enterRule(_localctx, 56, RULE_ruleAltList);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(331);
            labeledAlt();
            setState(336);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == OR) {
               {
                  {
                     setState(332);
                     match(OR);
                     setState(333);
                     labeledAlt();
                  }
               }
               setState(338);
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
      enterRule(_localctx, 58, RULE_labeledAlt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(339);
            alternative();
            setState(342);
            _la = _input.LA(1);
            if (_la == POUND) {
               {
                  setState(340);
                  match(POUND);
                  setState(341);
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

      public TerminalNode COLON() {
         return getToken(ANTLRv4Parser.COLON, 0);
      }

      public LexerRuleBlockContext lexerRuleBlock() {
         return getRuleContext(LexerRuleBlockContext.class, 0);
      }

      public TerminalNode SEMI() {
         return getToken(ANTLRv4Parser.SEMI, 0);
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
      enterRule(_localctx, 60, RULE_lexerRule);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(345);
            _la = _input.LA(1);
            if (_la == DOC_COMMENT) {
               {
                  setState(344);
                  match(DOC_COMMENT);
               }
            }

            setState(348);
            _la = _input.LA(1);
            if (_la == FRAGMENT) {
               {
                  setState(347);
                  match(FRAGMENT);
               }
            }

            setState(350);
            match(TOKEN_REF);
            setState(351);
            match(COLON);
            setState(352);
            lexerRuleBlock();
            setState(353);
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

   public static class LexerRuleBlockContext extends ParserRuleContext {
      public LexerAltListContext lexerAltList() {
         return getRuleContext(LexerAltListContext.class, 0);
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
      enterRule(_localctx, 62, RULE_lexerRuleBlock);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(355);
            lexerAltList();
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
      enterRule(_localctx, 64, RULE_lexerAltList);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(357);
            lexerAlt();
            setState(362);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == OR) {
               {
                  {
                     setState(358);
                     match(OR);
                     setState(359);
                     lexerAlt();
                  }
               }
               setState(364);
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
      enterRule(_localctx, 66, RULE_lexerAlt);
      int _la;
      try {
         setState(370);
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
               setState(365);
               lexerElements();
               setState(367);
               _la = _input.LA(1);
               if (_la == RARROW) {
                  {
                     setState(366);
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
      enterRule(_localctx, 68, RULE_lexerElements);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(373);
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
               {
                  {
                     setState(372);
                     lexerElement();
                  }
               }
               setState(375);
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
      enterRule(_localctx, 70, RULE_lexerElement);
      int _la;
      try {
         setState(393);
         switch (getInterpreter().adaptivePredict(_input, 42, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(377);
               labeledLexerElement();
               setState(379);
               _la = _input.LA(1);
               if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
                  {
                     setState(378);
                     ebnfSuffix();
                  }
               }

            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(381);
               lexerAtom();
               setState(383);
               _la = _input.LA(1);
               if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
                  {
                     setState(382);
                     ebnfSuffix();
                  }
               }

            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(385);
               lexerBlock();
               setState(387);
               _la = _input.LA(1);
               if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
                  {
                     setState(386);
                     ebnfSuffix();
                  }
               }

            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(389);
               match(ACTION);
               setState(391);
               _la = _input.LA(1);
               if (_la == QUESTION) {
                  {
                     setState(390);
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
      enterRule(_localctx, 72, RULE_labeledLexerElement);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(395);
            id();
            setState(396);
            _la = _input.LA(1);
            if (!(_la == ASSIGN || _la == PLUS_ASSIGN)) {
               _errHandler.recoverInline(this);
            }
            else {
               consume();
            }
            setState(399);
            switch (_input.LA(1)) {
               case TOKEN_REF :
               case RULE_REF :
               case LEXER_CHAR_SET :
               case DOT :
               case NOT :
               case STRING_LITERAL : {
                  setState(397);
                  lexerAtom();
               }
                  break;
               case LPAREN : {
                  setState(398);
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
      enterRule(_localctx, 74, RULE_lexerBlock);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(401);
            match(LPAREN);
            setState(402);
            lexerAltList();
            setState(403);
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
      enterRule(_localctx, 76, RULE_lexerCommands);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(405);
            match(RARROW);
            setState(406);
            lexerCommand();
            setState(411);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(407);
                     match(COMMA);
                     setState(408);
                     lexerCommand();
                  }
               }
               setState(413);
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
      enterRule(_localctx, 78, RULE_lexerCommand);
      try {
         setState(420);
         switch (getInterpreter().adaptivePredict(_input, 45, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(414);
               lexerCommandName();
               setState(415);
               match(LPAREN);
               setState(416);
               lexerCommandExpr();
               setState(417);
               match(RPAREN);
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(419);
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
      enterRule(_localctx, 80, RULE_lexerCommandName);
      try {
         setState(424);
         switch (_input.LA(1)) {
            case TOKEN_REF :
            case RULE_REF :
               enterOuterAlt(_localctx, 1); {
               setState(422);
               id();
            }
               break;
            case MODE :
               enterOuterAlt(_localctx, 2); {
               setState(423);
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
      enterRule(_localctx, 82, RULE_lexerCommandExpr);
      try {
         setState(428);
         switch (_input.LA(1)) {
            case TOKEN_REF :
            case RULE_REF :
               enterOuterAlt(_localctx, 1); {
               setState(426);
               id();
            }
               break;
            case INT :
               enterOuterAlt(_localctx, 2); {
               setState(427);
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
      enterRule(_localctx, 84, RULE_altList);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(430);
            alternative();
            setState(435);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == OR) {
               {
                  {
                     setState(431);
                     match(OR);
                     setState(432);
                     alternative();
                  }
               }
               setState(437);
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
      enterRule(_localctx, 86, RULE_alternative);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(439);
            _la = _input.LA(1);
            if (_la == LT) {
               {
                  setState(438);
                  elementOptions();
               }
            }

            setState(444);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << RULE_REF) | (1L << LPAREN)
               | (1L << DOT) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << ACTION))) != 0)) {
               {
                  {
                     setState(441);
                     element();
                  }
               }
               setState(446);
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
      enterRule(_localctx, 88, RULE_element);
      int _la;
      try {
         setState(462);
         switch (getInterpreter().adaptivePredict(_input, 54, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(447);
               labeledElement();
               setState(450);
               switch (_input.LA(1)) {
                  case QUESTION :
                  case STAR :
                  case PLUS : {
                     setState(448);
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
               setState(452);
               atom();
               setState(455);
               switch (_input.LA(1)) {
                  case QUESTION :
                  case STAR :
                  case PLUS : {
                     setState(453);
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
               setState(457);
               ebnf();
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(458);
               match(ACTION);
               setState(460);
               _la = _input.LA(1);
               if (_la == QUESTION) {
                  {
                     setState(459);
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
      enterRule(_localctx, 90, RULE_labeledElement);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(464);
            id();
            setState(465);
            _la = _input.LA(1);
            if (!(_la == ASSIGN || _la == PLUS_ASSIGN)) {
               _errHandler.recoverInline(this);
            }
            else {
               consume();
            }
            setState(468);
            switch (_input.LA(1)) {
               case TOKEN_REF :
               case RULE_REF :
               case DOT :
               case NOT :
               case STRING_LITERAL : {
                  setState(466);
                  atom();
               }
                  break;
               case LPAREN : {
                  setState(467);
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
      enterRule(_localctx, 92, RULE_ebnf);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(470);
            block();
            setState(472);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
               {
                  setState(471);
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
      enterRule(_localctx, 94, RULE_blockSuffix);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(474);
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
      enterRule(_localctx, 96, RULE_ebnfSuffix);
      int _la;
      try {
         setState(488);
         switch (_input.LA(1)) {
            case QUESTION :
               enterOuterAlt(_localctx, 1); {
               setState(476);
               match(QUESTION);
               setState(478);
               _la = _input.LA(1);
               if (_la == QUESTION) {
                  {
                     setState(477);
                     match(QUESTION);
                  }
               }

            }
               break;
            case STAR :
               enterOuterAlt(_localctx, 2); {
               setState(480);
               match(STAR);
               setState(482);
               _la = _input.LA(1);
               if (_la == QUESTION) {
                  {
                     setState(481);
                     match(QUESTION);
                  }
               }

            }
               break;
            case PLUS :
               enterOuterAlt(_localctx, 3); {
               setState(484);
               match(PLUS);
               setState(486);
               _la = _input.LA(1);
               if (_la == QUESTION) {
                  {
                     setState(485);
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
      enterRule(_localctx, 98, RULE_lexerAtom);
      int _la;
      try {
         setState(499);
         switch (getInterpreter().adaptivePredict(_input, 62, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(490);
               range();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(491);
               terminal();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(492);
               match(RULE_REF);
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(493);
               notSet();
            }
               break;
            case 5 :
               enterOuterAlt(_localctx, 5); {
               setState(494);
               match(LEXER_CHAR_SET);
            }
               break;
            case 6 :
               enterOuterAlt(_localctx, 6); {
               setState(495);
               match(DOT);
               setState(497);
               _la = _input.LA(1);
               if (_la == LT) {
                  {
                     setState(496);
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
      enterRule(_localctx, 100, RULE_atom);
      int _la;
      try {
         setState(509);
         switch (getInterpreter().adaptivePredict(_input, 64, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(501);
               range();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(502);
               terminal();
            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(503);
               ruleref();
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(504);
               notSet();
            }
               break;
            case 5 :
               enterOuterAlt(_localctx, 5); {
               setState(505);
               match(DOT);
               setState(507);
               _la = _input.LA(1);
               if (_la == LT) {
                  {
                     setState(506);
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
      enterRule(_localctx, 102, RULE_notSet);
      try {
         setState(515);
         switch (getInterpreter().adaptivePredict(_input, 65, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(511);
               match(NOT);
               setState(512);
               setElement();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(513);
               match(NOT);
               setState(514);
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
      enterRule(_localctx, 104, RULE_blockSet);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(517);
            match(LPAREN);
            setState(518);
            setElement();
            setState(523);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == OR) {
               {
                  {
                     setState(519);
                     match(OR);
                     setState(520);
                     setElement();
                  }
               }
               setState(525);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(526);
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
      enterRule(_localctx, 106, RULE_setElement);
      int _la;
      try {
         setState(538);
         switch (getInterpreter().adaptivePredict(_input, 69, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(528);
               match(TOKEN_REF);
               setState(530);
               _la = _input.LA(1);
               if (_la == LT) {
                  {
                     setState(529);
                     elementOptions();
                  }
               }

            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(532);
               match(STRING_LITERAL);
               setState(534);
               _la = _input.LA(1);
               if (_la == LT) {
                  {
                     setState(533);
                     elementOptions();
                  }
               }

            }
               break;
            case 3 :
               enterOuterAlt(_localctx, 3); {
               setState(536);
               range();
            }
               break;
            case 4 :
               enterOuterAlt(_localctx, 4); {
               setState(537);
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
      enterRule(_localctx, 108, RULE_block);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(540);
            match(LPAREN);
            setState(551);
            _la = _input.LA(1);
            if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPTIONS) | (1L << COLON) | (1L << AT))) != 0)) {
               {
                  setState(542);
                  _la = _input.LA(1);
                  if (_la == OPTIONS) {
                     {
                        setState(541);
                        optionsSpec();
                     }
                  }

                  setState(547);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
                  while (_la == AT) {
                     {
                        {
                           setState(544);
                           ruleAction();
                        }
                     }
                     setState(549);
                     _errHandler.sync(this);
                     _la = _input.LA(1);
                  }
                  setState(550);
                  match(COLON);
               }
            }

            setState(553);
            altList();
            setState(554);
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
      enterRule(_localctx, 110, RULE_ruleref);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(556);
            match(RULE_REF);
            setState(558);
            _la = _input.LA(1);
            if (_la == ARG_ACTION) {
               {
                  setState(557);
                  match(ARG_ACTION);
               }
            }

            setState(561);
            _la = _input.LA(1);
            if (_la == LT) {
               {
                  setState(560);
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
      enterRule(_localctx, 112, RULE_range);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(563);
            match(STRING_LITERAL);
            setState(564);
            match(RANGE);
            setState(565);
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
      enterRule(_localctx, 114, RULE_terminal);
      int _la;
      try {
         setState(575);
         switch (_input.LA(1)) {
            case TOKEN_REF :
               enterOuterAlt(_localctx, 1); {
               setState(567);
               match(TOKEN_REF);
               setState(569);
               _la = _input.LA(1);
               if (_la == LT) {
                  {
                     setState(568);
                     elementOptions();
                  }
               }

            }
               break;
            case STRING_LITERAL :
               enterOuterAlt(_localctx, 2); {
               setState(571);
               match(STRING_LITERAL);
               setState(573);
               _la = _input.LA(1);
               if (_la == LT) {
                  {
                     setState(572);
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
      enterRule(_localctx, 116, RULE_elementOptions);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(577);
            match(LT);
            setState(578);
            elementOption();
            setState(583);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(579);
                     match(COMMA);
                     setState(580);
                     elementOption();
                  }
               }
               setState(585);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(586);
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
      enterRule(_localctx, 118, RULE_elementOption);
      try {
         setState(595);
         switch (getInterpreter().adaptivePredict(_input, 80, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1); {
               setState(588);
               id();
            }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2); {
               setState(589);
               id();
               setState(590);
               match(ASSIGN);
               setState(593);
               switch (_input.LA(1)) {
                  case TOKEN_REF :
                  case RULE_REF : {
                     setState(591);
                     id();
                  }
                     break;
                  case STRING_LITERAL : {
                     setState(592);
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
      enterRule(_localctx, 120, RULE_id);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(597);
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

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u025a\4\2\t\2\4"
      + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
      + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
      + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
      + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
      + "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
      + ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"
      + "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="
      + "\4>\t>\3\2\3\2\7\2\177\n\2\f\2\16\2\u0082\13\2\3\2\3\2\7\2\u0086\n\2\f"
      + "\2\16\2\u0089\13\2\3\2\3\2\3\3\5\3\u008e\n\3\3\3\3\3\3\3\3\3\3\4\3\4\3"
      + "\4\3\4\3\4\5\4\u0099\n\4\3\5\3\5\3\5\3\5\5\5\u009f\n\5\3\6\3\6\5\6\u00a3"
      + "\n\6\3\6\3\6\3\7\3\7\3\7\6\7\u00aa\n\7\r\7\16\7\u00ab\3\b\3\b\3\b\3\b"
      + "\3\t\3\t\3\t\7\t\u00b5\n\t\f\t\16\t\u00b8\13\t\3\t\3\t\3\t\5\t\u00bd\n"
      + "\t\3\n\3\n\3\n\3\n\7\n\u00c3\n\n\f\n\16\n\u00c6\13\n\3\n\3\n\3\13\3\13"
      + "\3\13\3\13\3\13\5\13\u00cf\n\13\3\f\3\f\3\f\3\f\7\f\u00d5\n\f\f\f\16\f"
      + "\u00d8\13\f\3\f\5\f\u00db\n\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00e3\n\r\3"
      + "\r\3\r\3\r\3\16\3\16\3\16\5\16\u00eb\n\16\3\17\3\17\3\17\3\17\7\17\u00f1"
      + "\n\17\f\17\16\17\u00f4\13\17\3\20\7\20\u00f7\n\20\f\20\16\20\u00fa\13"
      + "\20\3\21\3\21\5\21\u00fe\n\21\3\22\5\22\u0101\n\22\3\22\5\22\u0104\n\22"
      + "\3\22\3\22\5\22\u0108\n\22\3\22\5\22\u010b\n\22\3\22\5\22\u010e\n\22\3"
      + "\22\5\22\u0111\n\22\3\22\7\22\u0114\n\22\f\22\16\22\u0117\13\22\3\22\3"
      + "\22\3\22\3\22\3\22\3\23\7\23\u011f\n\23\f\23\16\23\u0122\13\23\3\23\5"
      + "\23\u0125\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\5\26\u0130"
      + "\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0139\n\30\f\30\16\30\u013c"
      + "\13\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\6\33\u0146\n\33\r\33\16"
      + "\33\u0147\3\34\3\34\3\35\3\35\3\36\3\36\3\36\7\36\u0151\n\36\f\36\16\36"
      + "\u0154\13\36\3\37\3\37\3\37\5\37\u0159\n\37\3 \5 \u015c\n \3 \5 \u015f"
      + "\n \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\7\"\u016b\n\"\f\"\16\"\u016e\13\""
      + "\3#\3#\5#\u0172\n#\3#\5#\u0175\n#\3$\6$\u0178\n$\r$\16$\u0179\3%\3%\5"
      + "%\u017e\n%\3%\3%\5%\u0182\n%\3%\3%\5%\u0186\n%\3%\3%\5%\u018a\n%\5%\u018c"
      + "\n%\3&\3&\3&\3&\5&\u0192\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\7(\u019c\n(\f"
      + "(\16(\u019f\13(\3)\3)\3)\3)\3)\3)\5)\u01a7\n)\3*\3*\5*\u01ab\n*\3+\3+"
      + "\5+\u01af\n+\3,\3,\3,\7,\u01b4\n,\f,\16,\u01b7\13,\3-\5-\u01ba\n-\3-\7"
      + "-\u01bd\n-\f-\16-\u01c0\13-\3.\3.\3.\5.\u01c5\n.\3.\3.\3.\5.\u01ca\n."
      + "\3.\3.\3.\5.\u01cf\n.\5.\u01d1\n.\3/\3/\3/\3/\5/\u01d7\n/\3\60\3\60\5"
      + "\60\u01db\n\60\3\61\3\61\3\62\3\62\5\62\u01e1\n\62\3\62\3\62\5\62\u01e5"
      + "\n\62\3\62\3\62\5\62\u01e9\n\62\5\62\u01eb\n\62\3\63\3\63\3\63\3\63\3"
      + "\63\3\63\3\63\5\63\u01f4\n\63\5\63\u01f6\n\63\3\64\3\64\3\64\3\64\3\64"
      + "\3\64\5\64\u01fe\n\64\5\64\u0200\n\64\3\65\3\65\3\65\3\65\5\65\u0206\n"
      + "\65\3\66\3\66\3\66\3\66\7\66\u020c\n\66\f\66\16\66\u020f\13\66\3\66\3"
      + "\66\3\67\3\67\5\67\u0215\n\67\3\67\3\67\5\67\u0219\n\67\3\67\3\67\5\67"
      + "\u021d\n\67\38\38\58\u0221\n8\38\78\u0224\n8\f8\168\u0227\138\38\58\u022a"
      + "\n8\38\38\38\39\39\59\u0231\n9\39\59\u0234\n9\3:\3:\3:\3:\3;\3;\5;\u023c"
      + "\n;\3;\3;\5;\u0240\n;\5;\u0242\n;\3<\3<\3<\3<\7<\u0248\n<\f<\16<\u024b"
      + "\13<\3<\3<\3=\3=\3=\3=\3=\5=\u0254\n=\5=\u0256\n=\3>\3>\3>\2\2?\2\4\6"
      + "\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"
      + "VXZ\\^`bdfhjlnprtvxz\2\5\4\2\r\r\21\23\4\2##\'\'\3\2\3\4\u0281\2|\3\2"
      + "\2\2\4\u008d\3\2\2\2\6\u0098\3\2\2\2\b\u009e\3\2\2\2\n\u00a0\3\2\2\2\f"
      + "\u00a9\3\2\2\2\16\u00ad\3\2\2\2\20\u00bc\3\2\2\2\22\u00be\3\2\2\2\24\u00ce"
      + "\3\2\2\2\26\u00d0\3\2\2\2\30\u00de\3\2\2\2\32\u00ea\3\2\2\2\34\u00ec\3"
      + "\2\2\2\36\u00f8\3\2\2\2 \u00fd\3\2\2\2\"\u0100\3\2\2\2$\u0120\3\2\2\2"
      + "&\u0126\3\2\2\2(\u012a\3\2\2\2*\u012f\3\2\2\2,\u0131\3\2\2\2.\u0134\3"
      + "\2\2\2\60\u013d\3\2\2\2\62\u0140\3\2\2\2\64\u0145\3\2\2\2\66\u0149\3\2"
      + "\2\28\u014b\3\2\2\2:\u014d\3\2\2\2<\u0155\3\2\2\2>\u015b\3\2\2\2@\u0165"
      + "\3\2\2\2B\u0167\3\2\2\2D\u0174\3\2\2\2F\u0177\3\2\2\2H\u018b\3\2\2\2J"
      + "\u018d\3\2\2\2L\u0193\3\2\2\2N\u0197\3\2\2\2P\u01a6\3\2\2\2R\u01aa\3\2"
      + "\2\2T\u01ae\3\2\2\2V\u01b0\3\2\2\2X\u01b9\3\2\2\2Z\u01d0\3\2\2\2\\\u01d2"
      + "\3\2\2\2^\u01d8\3\2\2\2`\u01dc\3\2\2\2b\u01ea\3\2\2\2d\u01f5\3\2\2\2f"
      + "\u01ff\3\2\2\2h\u0205\3\2\2\2j\u0207\3\2\2\2l\u021c\3\2\2\2n\u021e\3\2"
      + "\2\2p\u022e\3\2\2\2r\u0235\3\2\2\2t\u0241\3\2\2\2v\u0243\3\2\2\2x\u0255"
      + "\3\2\2\2z\u0257\3\2\2\2|\u0080\5\4\3\2}\177\5\b\5\2~}\3\2\2\2\177\u0082"
      + "\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082"
      + "\u0080\3\2\2\2\u0083\u0087\5\36\20\2\u0084\u0086\5\34\17\2\u0085\u0084"
      + "\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"
      + "\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\2\2\3\u008b\3\3\2\2\2"
      + "\u008c\u008e\7\6\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f"
      + "\3\2\2\2\u008f\u0090\5\6\4\2\u0090\u0091\5z>\2\u0091\u0092\7\35\2\2\u0092"
      + "\5\3\2\2\2\u0093\u0094\7\16\2\2\u0094\u0099\7\20\2\2\u0095\u0096\7\17"
      + "\2\2\u0096\u0099\7\20\2\2\u0097\u0099\7\20\2\2\u0098\u0093\3\2\2\2\u0098"
      + "\u0095\3\2\2\2\u0098\u0097\3\2\2\2\u0099\7\3\2\2\2\u009a\u009f\5\n\6\2"
      + "\u009b\u009f\5\22\n\2\u009c\u009f\5\26\f\2\u009d\u009f\5\30\r\2\u009e"
      + "\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2"
      + "\2\2\u009f\t\3\2\2\2\u00a0\u00a2\7\n\2\2\u00a1\u00a3\5\f\7\2\u00a2\u00a1"
      + "\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7/\2\2\u00a5"
      + "\13\3\2\2\2\u00a6\u00a7\5\16\b\2\u00a7\u00a8\7\35\2\2\u00a8\u00aa\3\2"
      + "\2\2\u00a9\u00a6\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"
      + "\u00ac\3\2\2\2\u00ac\r\3\2\2\2\u00ad\u00ae\5z>\2\u00ae\u00af\7#\2\2\u00af"
      + "\u00b0\5\20\t\2\u00b0\17\3\2\2\2\u00b1\u00b6\5z>\2\u00b2\u00b3\7*\2\2"
      + "\u00b3\u00b5\5z>\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4"
      + "\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bd\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"
      + "\u00bd\7\62\2\2\u00ba\u00bd\7\65\2\2\u00bb\u00bd\7\61\2\2\u00bc\u00b1"
      + "\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"
      + "\21\3\2\2\2\u00be\u00bf\7\f\2\2\u00bf\u00c4\5\24\13\2\u00c0\u00c1\7\34"
      + "\2\2\u00c1\u00c3\5\24\13\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"
      + "\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2"
      + "\2\2\u00c7\u00c8\7\35\2\2\u00c8\23\3\2\2\2\u00c9\u00ca\5z>\2\u00ca\u00cb"
      + "\7#\2\2\u00cb\u00cc\5z>\2\u00cc\u00cf\3\2\2\2\u00cd\u00cf\5z>\2\u00ce"
      + "\u00c9\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\25\3\2\2\2\u00d0\u00d1\7\13\2"
      + "\2\u00d1\u00d6\5z>\2\u00d2\u00d3\7\34\2\2\u00d3\u00d5\5z>\2\u00d4\u00d2"
      + "\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"
      + "\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\7\34\2\2\u00da\u00d9\3"
      + "\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7/\2\2\u00dd"
      + "\27\3\2\2\2\u00de\u00e2\7,\2\2\u00df\u00e0\5\32\16\2\u00e0\u00e1\7\33"
      + "\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"
      + "\u00e4\3\2\2\2\u00e4\u00e5\5z>\2\u00e5\u00e6\7\65\2\2\u00e6\31\3\2\2\2"
      + "\u00e7\u00eb\5z>\2\u00e8\u00eb\7\16\2\2\u00e9\u00eb\7\17\2\2\u00ea\u00e7"
      + "\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\33\3\2\2\2\u00ec"
      + "\u00ed\7\31\2\2\u00ed\u00ee\5z>\2\u00ee\u00f2\7\35\2\2\u00ef\u00f1\5>"
      + " \2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"
      + "\u00f3\3\2\2\2\u00f3\35\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\5 \21"
      + "\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9"
      + "\3\2\2\2\u00f9\37\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\5\"\22\2\u00fc"
      + "\u00fe\5> \2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe!\3\2\2\2\u00ff"
      + "\u0101\7\6\2\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2"
      + "\2\2\u0102\u0104\5\64\33\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104"
      + "\u0105\3\2\2\2\u0105\u0107\7\4\2\2\u0106\u0108\7\67\2\2\u0107\u0106\3"
      + "\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u010b\5,\27\2\u010a"
      + "\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010e\5."
      + "\30\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f"
      + "\u0111\5\60\31\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0115\3"
      + "\2\2\2\u0112\u0114\5*\26\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115"
      + "\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2"
      + "\2\2\u0118\u0119\7\32\2\2\u0119\u011a\58\35\2\u011a\u011b\7\35\2\2\u011b"
      + "\u011c\5$\23\2\u011c#\3\2\2\2\u011d\u011f\5&\24\2\u011e\u011d\3\2\2\2"
      + "\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0124"
      + "\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0125\5(\25\2\u0124\u0123\3\2\2\2\u0124"
      + "\u0125\3\2\2\2\u0125%\3\2\2\2\u0126\u0127\7\27\2\2\u0127\u0128\7\67\2"
      + "\2\u0128\u0129\7\65\2\2\u0129\'\3\2\2\2\u012a\u012b\7\30\2\2\u012b\u012c"
      + "\7\65\2\2\u012c)\3\2\2\2\u012d\u0130\5\n\6\2\u012e\u0130\5\62\32\2\u012f"
      + "\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130+\3\2\2\2\u0131\u0132\7\24\2\2"
      + "\u0132\u0133\7\67\2\2\u0133-\3\2\2\2\u0134\u0135\7\26\2\2\u0135\u013a"
      + "\5z>\2\u0136\u0137\7\34\2\2\u0137\u0139\5z>\2\u0138\u0136\3\2\2\2\u0139"
      + "\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b/\3\2\2\2"
      + "\u013c\u013a\3\2\2\2\u013d\u013e\7\25\2\2\u013e\u013f\7\67\2\2\u013f\61"
      + "\3\2\2\2\u0140\u0141\7,\2\2\u0141\u0142\5z>\2\u0142\u0143\7\65\2\2\u0143"
      + "\63\3\2\2\2\u0144\u0146\5\66\34\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2"
      + "\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\65\3\2\2\2\u0149\u014a"
      + "\t\2\2\2\u014a\67\3\2\2\2\u014b\u014c\5:\36\2\u014c9\3\2\2\2\u014d\u0152"
      + "\5<\37\2\u014e\u014f\7(\2\2\u014f\u0151\5<\37\2\u0150\u014e\3\2\2\2\u0151"
      + "\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153;\3\2\2\2"
      + "\u0154\u0152\3\2\2\2\u0155\u0158\5X-\2\u0156\u0157\7-\2\2\u0157\u0159"
      + "\5z>\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159=\3\2\2\2\u015a\u015c"
      + "\7\6\2\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d"
      + "\u015f\7\r\2\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2"
      + "\2\2\u0160\u0161\7\3\2\2\u0161\u0162\7\32\2\2\u0162\u0163\5@!\2\u0163"
      + "\u0164\7\35\2\2\u0164?\3\2\2\2\u0165\u0166\5B\"\2\u0166A\3\2\2\2\u0167"
      + "\u016c\5D#\2\u0168\u0169\7(\2\2\u0169\u016b\5D#\2\u016a\u0168\3\2\2\2"
      + "\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016dC\3"
      + "\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171\5F$\2\u0170\u0172\5N(\2\u0171\u0170"
      + "\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0175\3\2\2\2\u0174"
      + "\u016f\3\2\2\2\u0174\u0173\3\2\2\2\u0175E\3\2\2\2\u0176\u0178\5H%\2\u0177"
      + "\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2"
      + "\2\2\u017aG\3\2\2\2\u017b\u017d\5J&\2\u017c\u017e\5b\62\2\u017d\u017c"
      + "\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u018c\3\2\2\2\u017f\u0181\5d\63\2\u0180"
      + "\u0182\5b\62\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u018c\3\2"
      + "\2\2\u0183\u0185\5L\'\2\u0184\u0186\5b\62\2\u0185\u0184\3\2\2\2\u0185"
      + "\u0186\3\2\2\2\u0186\u018c\3\2\2\2\u0187\u0189\7\65\2\2\u0188\u018a\7"
      + "$\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b"
      + "\u017b\3\2\2\2\u018b\u017f\3\2\2\2\u018b\u0183\3\2\2\2\u018b\u0187\3\2"
      + "\2\2\u018cI\3\2\2\2\u018d\u018e\5z>\2\u018e\u0191\t\3\2\2\u018f\u0192"
      + "\5d\63\2\u0190\u0192\5n8\2\u0191\u018f\3\2\2\2\u0191\u0190\3\2\2\2\u0192"
      + "K\3\2\2\2\u0193\u0194\7\36\2\2\u0194\u0195\5B\"\2\u0195\u0196\7\37\2\2"
      + "\u0196M\3\2\2\2\u0197\u0198\7 \2\2\u0198\u019d\5P)\2\u0199\u019a\7\34"
      + "\2\2\u019a\u019c\5P)\2\u019b\u0199\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b"
      + "\3\2\2\2\u019d\u019e\3\2\2\2\u019eO\3\2\2\2\u019f\u019d\3\2\2\2\u01a0"
      + "\u01a1\5R*\2\u01a1\u01a2\7\36\2\2\u01a2\u01a3\5T+\2\u01a3\u01a4\7\37\2"
      + "\2\u01a4\u01a7\3\2\2\2\u01a5\u01a7\5R*\2\u01a6\u01a0\3\2\2\2\u01a6\u01a5"
      + "\3\2\2\2\u01a7Q\3\2\2\2\u01a8\u01ab\5z>\2\u01a9\u01ab\7\31\2\2\u01aa\u01a8"
      + "\3\2\2\2\u01aa\u01a9\3\2\2\2\u01abS\3\2\2\2\u01ac\u01af\5z>\2\u01ad\u01af"
      + "\7\61\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2\u01afU\3\2\2\2\u01b0"
      + "\u01b5\5X-\2\u01b1\u01b2\7(\2\2\u01b2\u01b4\5X-\2\u01b3\u01b1\3\2\2\2"
      + "\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6W\3"
      + "\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01ba\5v<\2\u01b9\u01b8\3\2\2\2\u01b9"
      + "\u01ba\3\2\2\2\u01ba\u01be\3\2\2\2\u01bb\u01bd\5Z.\2\u01bc\u01bb\3\2\2"
      + "\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bfY"
      + "\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c4\5\\/\2\u01c2\u01c5\5b\62\2\u01c3"
      + "\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01d1\3\2"
      + "\2\2\u01c6\u01c9\5f\64\2\u01c7\u01ca\5b\62\2\u01c8\u01ca\3\2\2\2\u01c9"
      + "\u01c7\3\2\2\2\u01c9\u01c8\3\2\2\2\u01ca\u01d1\3\2\2\2\u01cb\u01d1\5^"
      + "\60\2\u01cc\u01ce\7\65\2\2\u01cd\u01cf\7$\2\2\u01ce\u01cd\3\2\2\2\u01ce"
      + "\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01c1\3\2\2\2\u01d0\u01c6\3\2"
      + "\2\2\u01d0\u01cb\3\2\2\2\u01d0\u01cc\3\2\2\2\u01d1[\3\2\2\2\u01d2\u01d3"
      + "\5z>\2\u01d3\u01d6\t\3\2\2\u01d4\u01d7\5f\64\2\u01d5\u01d7\5n8\2\u01d6"
      + "\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7]\3\2\2\2\u01d8\u01da\5n8\2\u01d9"
      + "\u01db\5`\61\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db_\3\2\2\2"
      + "\u01dc\u01dd\5b\62\2\u01dda\3\2\2\2\u01de\u01e0\7$\2\2\u01df\u01e1\7$"
      + "\2\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01eb\3\2\2\2\u01e2"
      + "\u01e4\7%\2\2\u01e3\u01e5\7$\2\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2"
      + "\2\u01e5\u01eb\3\2\2\2\u01e6\u01e8\7&\2\2\u01e7\u01e9\7$\2\2\u01e8\u01e7"
      + "\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01de\3\2\2\2\u01ea"
      + "\u01e2\3\2\2\2\u01ea\u01e6\3\2\2\2\u01ebc\3\2\2\2\u01ec\u01f6\5r:\2\u01ed"
      + "\u01f6\5t;\2\u01ee\u01f6\7\4\2\2\u01ef\u01f6\5h\65\2\u01f0\u01f6\7\5\2"
      + "\2\u01f1\u01f3\7*\2\2\u01f2\u01f4\5v<\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4"
      + "\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01ec\3\2\2\2\u01f5\u01ed\3\2\2\2\u01f5"
      + "\u01ee\3\2\2\2\u01f5\u01ef\3\2\2\2\u01f5\u01f0\3\2\2\2\u01f5\u01f1\3\2"
      + "\2\2\u01f6e\3\2\2\2\u01f7\u0200\5r:\2\u01f8\u0200\5t;\2\u01f9\u0200\5"
      + "p9\2\u01fa\u0200\5h\65\2\u01fb\u01fd\7*\2\2\u01fc\u01fe\5v<\2\u01fd\u01fc"
      + "\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u01f7\3\2\2\2\u01ff"
      + "\u01f8\3\2\2\2\u01ff\u01f9\3\2\2\2\u01ff\u01fa\3\2\2\2\u01ff\u01fb\3\2"
      + "\2\2\u0200g\3\2\2\2\u0201\u0202\7.\2\2\u0202\u0206\5l\67\2\u0203\u0204"
      + "\7.\2\2\u0204\u0206\5j\66\2\u0205\u0201\3\2\2\2\u0205\u0203\3\2\2\2\u0206"
      + "i\3\2\2\2\u0207\u0208\7\36\2\2\u0208\u020d\5l\67\2\u0209\u020a\7(\2\2"
      + "\u020a\u020c\5l\67\2\u020b\u0209\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b"
      + "\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210"
      + "\u0211\7\37\2\2\u0211k\3\2\2\2\u0212\u0214\7\3\2\2\u0213\u0215\5v<\2\u0214"
      + "\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u021d\3\2\2\2\u0216\u0218\7\62"
      + "\2\2\u0217\u0219\5v<\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021d"
      + "\3\2\2\2\u021a\u021d\5r:\2\u021b\u021d\7\5\2\2\u021c\u0212\3\2\2\2\u021c"
      + "\u0216\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021dm\3\2\2\2"
      + "\u021e\u0229\7\36\2\2\u021f\u0221\5\n\6\2\u0220\u021f\3\2\2\2\u0220\u0221"
      + "\3\2\2\2\u0221\u0225\3\2\2\2\u0222\u0224\5\62\32\2\u0223\u0222\3\2\2\2"
      + "\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228"
      + "\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u022a\7\32\2\2\u0229\u0220\3\2\2\2"
      + "\u0229\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\5V,\2\u022c\u022d"
      + "\7\37\2\2\u022do\3\2\2\2\u022e\u0230\7\4\2\2\u022f\u0231\7\67\2\2\u0230"
      + "\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0234\5v"
      + "<\2\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234q\3\2\2\2\u0235\u0236"
      + "\7\62\2\2\u0236\u0237\7+\2\2\u0237\u0238\7\62\2\2\u0238s\3\2\2\2\u0239"
      + "\u023b\7\3\2\2\u023a\u023c\5v<\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2"
      + "\2\u023c\u0242\3\2\2\2\u023d\u023f\7\62\2\2\u023e\u0240\5v<\2\u023f\u023e"
      + "\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\3\2\2\2\u0241\u0239\3\2\2\2\u0241"
      + "\u023d\3\2\2\2\u0242u\3\2\2\2\u0243\u0244\7!\2\2\u0244\u0249\5x=\2\u0245"
      + "\u0246\7\34\2\2\u0246\u0248\5x=\2\u0247\u0245\3\2\2\2\u0248\u024b\3\2"
      + "\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b"
      + "\u0249\3\2\2\2\u024c\u024d\7\"\2\2\u024dw\3\2\2\2\u024e\u0256\5z>\2\u024f"
      + "\u0250\5z>\2\u0250\u0253\7#\2\2\u0251\u0254\5z>\2\u0252\u0254\7\62\2\2"
      + "\u0253\u0251\3\2\2\2\u0253\u0252\3\2\2\2\u0254\u0256\3\2\2\2\u0255\u024e"
      + "\3\2\2\2\u0255\u024f\3\2\2\2\u0256y\3\2\2\2\u0257\u0258\t\4\2\2\u0258"
      + "{\3\2\2\2S\u0080\u0087\u008d\u0098\u009e\u00a2\u00ab\u00b6\u00bc\u00c4"
      + "\u00ce\u00d6\u00da\u00e2\u00ea\u00f2\u00f8\u00fd\u0100\u0103\u0107\u010a"
      + "\u010d\u0110\u0115\u0120\u0124\u012f\u013a\u0147\u0152\u0158\u015b\u015e"
      + "\u016c\u0171\u0174\u0179\u017d\u0181\u0185\u0189\u018b\u0191\u019d\u01a6"
      + "\u01aa\u01ae\u01b5\u01b9\u01be\u01c4\u01c9\u01ce\u01d0\u01d6\u01da\u01e0"
      + "\u01e4\u01e8\u01ea\u01f3\u01f5\u01fd\u01ff\u0205\u020d\u0214\u0218\u021c"
      + "\u0220\u0225\u0229\u0230\u0233\u023b\u023f\u0241\u0249\u0253\u0255";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}