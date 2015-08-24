// Generated from Line.g4 by ANTLR 4.5

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
	
package org.sourcepit.antlr4.eclipse.lang.tests.line;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, AT=3, STAR=4, WORD=5, NL=6, WS=7;
	public static final int
		RULE_javadoc = 0, RULE_javadocStart = 1, RULE_javadocEnd = 2, RULE_mainDescription = 3, 
		RULE_line = 4, RULE_prefix = 5, RULE_text = 6;
	public static final String[] ruleNames = {
		"javadoc", "javadocStart", "javadocEnd", "mainDescription", "line", "prefix", 
		"text"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'/**'", "'*/'", "'@'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "AT", "STAR", "WORD", "NL", "WS"
	};
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
	public String getGrammarFileName() { return "Line.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LineParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class JavadocContext extends ParserRuleContext {
		public JavadocStartContext javadocStart() {
			return getRuleContext(JavadocStartContext.class,0);
		}
		public JavadocEndContext javadocEnd() {
			return getRuleContext(JavadocEndContext.class,0);
		}
		public MainDescriptionContext mainDescription() {
			return getRuleContext(MainDescriptionContext.class,0);
		}
		public JavadocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javadoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LineListener ) ((LineListener)listener).enterJavadoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LineListener ) ((LineListener)listener).exitJavadoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LineVisitor ) return ((LineVisitor<? extends T>)visitor).visitJavadoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavadocContext javadoc() throws RecognitionException {
		JavadocContext _localctx = new JavadocContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_javadoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			javadocStart();
			setState(16);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(15);
				mainDescription();
				}
				break;
			}
			setState(18);
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
		public List<TerminalNode> STAR() { return getTokens(LineParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(LineParser.STAR, i);
		}
		public List<TerminalNode> WS() { return getTokens(LineParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(LineParser.WS, i);
		}
		public JavadocStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javadocStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LineListener ) ((LineListener)listener).enterJavadocStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LineListener ) ((LineListener)listener).exitJavadocStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LineVisitor ) return ((LineVisitor<? extends T>)visitor).visitJavadocStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavadocStartContext javadocStart() throws RecognitionException {
		JavadocStartContext _localctx = new JavadocStartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_javadocStart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(24);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(21);
					match(STAR);
					}
					} 
				}
				setState(26);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(30);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(27);
					match(WS);
					}
					} 
				}
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		public List<TerminalNode> STAR() { return getTokens(LineParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(LineParser.STAR, i);
		}
		public JavadocEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javadocEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LineListener ) ((LineListener)listener).enterJavadocEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LineListener ) ((LineListener)listener).exitJavadocEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LineVisitor ) return ((LineVisitor<? extends T>)visitor).visitJavadocEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavadocEndContext javadocEnd() throws RecognitionException {
		JavadocEndContext _localctx = new JavadocEndContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_javadocEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR) {
				{
				{
				setState(33);
				match(STAR);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
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
			return getRuleContext(LineContext.class,i);
		}
		public MainDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LineListener ) ((LineListener)listener).enterMainDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LineListener ) ((LineListener)listener).exitMainDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LineVisitor ) return ((LineVisitor<? extends T>)visitor).visitMainDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDescriptionContext mainDescription() throws RecognitionException {
		MainDescriptionContext _localctx = new MainDescriptionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainDescription);
		try {
			int _alt;
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(41);
						line(false);
						}
						} 
					}
					setState(46);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(47);
				line(true);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(48);
						line(false);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(51); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class LineContext extends ParserRuleContext {
		public boolean allowMissingNl;
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public TerminalNode NL() { return getToken(LineParser.NL, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LineContext(ParserRuleContext parent, int invokingState, boolean allowMissingNl) {
			super(parent, invokingState);
			this.allowMissingNl = allowMissingNl;
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LineListener ) ((LineListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LineListener ) ((LineListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LineVisitor ) return ((LineVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line(boolean allowMissingNl) throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState(), allowMissingNl);
		enterRule(_localctx, 8, RULE_line);
		try {
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				prefix();
				setState(57);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(56);
					text(true);
					}
					break;
				}
				setState(59);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				text(false);
				setState(62);
				match(NL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(NL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				if (!(_localctx.allowMissingNl)) throw new FailedPredicateException(this, "$allowMissingNl");
				setState(66);
				text(false);
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
		public List<TerminalNode> WS() { return getTokens(LineParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(LineParser.WS, i);
		}
		public List<TerminalNode> STAR() { return getTokens(LineParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(LineParser.STAR, i);
		}
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LineListener ) ((LineListener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LineListener ) ((LineListener)listener).exitPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LineVisitor ) return ((LineVisitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
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
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(69);
				match(WS);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(75);
					match(STAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(78); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					match(WS);
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public boolean prefixed;
		public List<TerminalNode> WORD() { return getTokens(LineParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(LineParser.WORD, i);
		}
		public List<TerminalNode> STAR() { return getTokens(LineParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(LineParser.STAR, i);
		}
		public List<TerminalNode> WS() { return getTokens(LineParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(LineParser.WS, i);
		}
		public List<TerminalNode> AT() { return getTokens(LineParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(LineParser.AT, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TextContext(ParserRuleContext parent, int invokingState, boolean prefixed) {
			super(parent, invokingState);
			this.prefixed = prefixed;
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LineListener ) ((LineListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LineListener ) ((LineListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LineVisitor ) return ((LineVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text(boolean prefixed) throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState(), prefixed);
		enterRule(_localctx, 12, RULE_text);
		int _la;
		try {
			int _alt;
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				if (!(_localctx.prefixed)) throw new FailedPredicateException(this, "$prefixed");
				setState(94); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(87);
						_la = _input.LA(1);
						if ( !(_la==STAR || _la==WORD) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(91);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(88);
								_la = _input.LA(1);
								if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << STAR) | (1L << WORD) | (1L << WS))) != 0)) ) {
								_errHandler.recoverInline(this);
								} else {
									consume();
								}
								}
								} 
							}
							setState(93);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(96); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				if (!(!_localctx.prefixed)) throw new FailedPredicateException(this, "!$prefixed");
				setState(112); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(102);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(99);
							match(WS);
							}
							}
							setState(104);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(105);
						match(WORD);
						setState(109);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(106);
								_la = _input.LA(1);
								if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << STAR) | (1L << WORD) | (1L << WS))) != 0)) ) {
								_errHandler.recoverInline(this);
								} else {
									consume();
								}
								}
								} 
							}
							setState(111);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(114); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				if (!(!_localctx.prefixed)) throw new FailedPredicateException(this, "!$prefixed");
				setState(118); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(117);
						match(WS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(120); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return line_sempred((LineContext)_localctx, predIndex);
		case 6:
			return text_sempred((TextContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean line_sempred(LineContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return _localctx.allowMissingNl;
		}
		return true;
	}
	private boolean text_sempred(TextContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return _localctx.prefixed;
		case 2:
			return !_localctx.prefixed;
		case 3:
			return !_localctx.prefixed;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t\177\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\5\2\23\n\2\3\2\3"+
		"\2\3\3\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3"+
		"\3\4\7\4%\n\4\f\4\16\4(\13\4\3\4\3\4\3\5\7\5-\n\5\f\5\16\5\60\13\5\3\5"+
		"\3\5\6\5\64\n\5\r\5\16\5\65\5\58\n\5\3\6\3\6\5\6<\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6F\n\6\3\7\7\7I\n\7\f\7\16\7L\13\7\3\7\6\7O\n\7\r\7"+
		"\16\7P\3\7\7\7T\n\7\f\7\16\7W\13\7\3\b\3\b\3\b\7\b\\\n\b\f\b\16\b_\13"+
		"\b\6\ba\n\b\r\b\16\bb\3\b\3\b\7\bg\n\b\f\b\16\bj\13\b\3\b\3\b\7\bn\n\b"+
		"\f\b\16\bq\13\b\6\bs\n\b\r\b\16\bt\3\b\3\b\6\by\n\b\r\b\16\bz\5\b}\n\b"+
		"\3\b\2\2\t\2\4\6\b\n\f\16\2\4\3\2\6\7\4\2\5\7\t\t\u008d\2\20\3\2\2\2\4"+
		"\26\3\2\2\2\6&\3\2\2\2\b\67\3\2\2\2\nE\3\2\2\2\fJ\3\2\2\2\16|\3\2\2\2"+
		"\20\22\5\4\3\2\21\23\5\b\5\2\22\21\3\2\2\2\22\23\3\2\2\2\23\24\3\2\2\2"+
		"\24\25\5\6\4\2\25\3\3\2\2\2\26\32\7\3\2\2\27\31\7\6\2\2\30\27\3\2\2\2"+
		"\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33 \3\2\2\2\34\32\3\2\2\2\35"+
		"\37\7\t\2\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\5\3\2\2"+
		"\2\" \3\2\2\2#%\7\6\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3"+
		"\2\2\2(&\3\2\2\2)*\7\4\2\2*\7\3\2\2\2+-\5\n\6\2,+\3\2\2\2-\60\3\2\2\2"+
		".,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\618\5\n\6\2\62\64\5\n\6\2"+
		"\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67"+
		".\3\2\2\2\67\63\3\2\2\28\t\3\2\2\29;\5\f\7\2:<\5\16\b\2;:\3\2\2\2;<\3"+
		"\2\2\2<=\3\2\2\2=>\7\b\2\2>F\3\2\2\2?@\5\16\b\2@A\7\b\2\2AF\3\2\2\2BF"+
		"\7\b\2\2CD\6\6\2\3DF\5\16\b\2E9\3\2\2\2E?\3\2\2\2EB\3\2\2\2EC\3\2\2\2"+
		"F\13\3\2\2\2GI\7\t\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2"+
		"\2LJ\3\2\2\2MO\7\6\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QU\3\2\2"+
		"\2RT\7\t\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\r\3\2\2\2WU\3\2"+
		"\2\2X`\6\b\3\3Y]\t\2\2\2Z\\\t\3\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3"+
		"\2\2\2^a\3\2\2\2_]\3\2\2\2`Y\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c}\3"+
		"\2\2\2dr\6\b\4\3eg\7\t\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3"+
		"\2\2\2jh\3\2\2\2ko\7\7\2\2ln\t\3\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3"+
		"\2\2\2ps\3\2\2\2qo\3\2\2\2rh\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u}\3"+
		"\2\2\2vx\6\b\5\3wy\7\t\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3"+
		"\2\2\2|X\3\2\2\2|d\3\2\2\2|v\3\2\2\2}\17\3\2\2\2\25\22\32 &.\65\67;EJ"+
		"PU]bhotz|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}