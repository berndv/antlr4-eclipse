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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavadocParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, AT=3, STAR=4, WORD=5, NL=6, WS=7;
	public static final int
		RULE_javadoc = 0, RULE_javadocBody = 1, RULE_singleLineDescription = 2, 
		RULE_singleLineTag = 3, RULE_javadocStart = 4, RULE_javadocEnd = 5, RULE_mainDescription = 6, 
		RULE_firstLine = 7, RULE_line = 8, RULE_lastLine = 9, RULE_prefix = 10, 
		RULE_text = 11, RULE_tagSection = 12, RULE_tag = 13, RULE_tagName = 14;
	public static final String[] ruleNames = {
		"javadoc", "javadocBody", "singleLineDescription", "singleLineTag", "javadocStart", 
		"javadocEnd", "mainDescription", "firstLine", "line", "lastLine", "prefix", 
		"text", "tagSection", "tag", "tagName"
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
	public String getGrammarFileName() { return "Javadoc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavadocParser(TokenStream input) {
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
		public JavadocBodyContext javadocBody() {
			return getRuleContext(JavadocBodyContext.class,0);
		}
		public JavadocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javadoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).enterJavadoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).exitJavadoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavadocVisitor ) return ((JavadocVisitor<? extends T>)visitor).visitJavadoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavadocContext javadoc() throws RecognitionException {
		JavadocContext _localctx = new JavadocContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_javadoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			javadocStart();
			setState(32);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(31);
				javadocBody();
				}
				break;
			}
			setState(34);
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

	public static class JavadocBodyContext extends ParserRuleContext {
		public MainDescriptionContext mainDescription() {
			return getRuleContext(MainDescriptionContext.class,0);
		}
		public TagSectionContext tagSection() {
			return getRuleContext(TagSectionContext.class,0);
		}
		public JavadocBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javadocBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).enterJavadocBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).exitJavadocBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavadocVisitor ) return ((JavadocVisitor<? extends T>)visitor).visitJavadocBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavadocBodyContext javadocBody() throws RecognitionException {
		JavadocBodyContext _localctx = new JavadocBodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_javadocBody);
		try {
			setState(41);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				mainDescription(true);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				tagSection(true);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				mainDescription(false);
				setState(39);
				tagSection(false);
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

	public static class SingleLineDescriptionContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public SingleLineDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleLineDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).enterSingleLineDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).exitSingleLineDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavadocVisitor ) return ((JavadocVisitor<? extends T>)visitor).visitSingleLineDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleLineDescriptionContext singleLineDescription() throws RecognitionException {
		SingleLineDescriptionContext _localctx = new SingleLineDescriptionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleLineDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			text(true);
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

	public static class SingleLineTagContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavadocParser.AT, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(JavadocParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JavadocParser.WS, i);
		}
		public SingleLineTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleLineTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).enterSingleLineTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).exitSingleLineTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavadocVisitor ) return ((JavadocVisitor<? extends T>)visitor).visitSingleLineTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleLineTagContext singleLineTag() throws RecognitionException {
		SingleLineTagContext _localctx = new SingleLineTagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleLineTag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(AT);
			setState(47);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(46);
				tagName();
				}
				break;
			}
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(49);
					match(WS);
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(55);
			text(true);
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
		public List<TerminalNode> STAR() { return getTokens(JavadocParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(JavadocParser.STAR, i);
		}
		public List<TerminalNode> WS() { return getTokens(JavadocParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JavadocParser.WS, i);
		}
		public JavadocStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javadocStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).enterJavadocStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).exitJavadocStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavadocVisitor ) return ((JavadocVisitor<? extends T>)visitor).visitJavadocStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavadocStartContext javadocStart() throws RecognitionException {
		JavadocStartContext _localctx = new JavadocStartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_javadocStart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__0);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					match(STAR);
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					match(WS);
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		public TerminalNode NL() { return getToken(JavadocParser.NL, 0); }
		public List<TerminalNode> WS() { return getTokens(JavadocParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JavadocParser.WS, i);
		}
		public List<TerminalNode> STAR() { return getTokens(JavadocParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(JavadocParser.STAR, i);
		}
		public JavadocEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javadocEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).enterJavadocEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).exitJavadocEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavadocVisitor ) return ((JavadocVisitor<? extends T>)visitor).visitJavadocEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavadocEndContext javadocEnd() throws RecognitionException {
		JavadocEndContext _localctx = new JavadocEndContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_javadocEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(70);
				match(NL);
				}
			}

			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(73);
				match(WS);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR) {
				{
				{
				setState(79);
				match(STAR);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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
		public boolean _lastLine;
		public FirstLineContext firstLine() {
			return getRuleContext(FirstLineContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public LastLineContext lastLine() {
			return getRuleContext(LastLineContext.class,0);
		}
		public MainDescriptionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MainDescriptionContext(ParserRuleContext parent, int invokingState, boolean _lastLine) {
			super(parent, invokingState);
			this._lastLine = _lastLine;
		}
		@Override public int getRuleIndex() { return RULE_mainDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).enterMainDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).exitMainDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavadocVisitor ) return ((JavadocVisitor<? extends T>)visitor).visitMainDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDescriptionContext mainDescription(boolean _lastLine) throws RecognitionException {
		MainDescriptionContext _localctx = new MainDescriptionContext(_ctx, getState(), _lastLine);
		enterRule(_localctx, 12, RULE_mainDescription);
		try {
			int _alt;
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				if (!(_localctx._lastLine)) throw new FailedPredicateException(this, "$_lastLine");
				setState(88);
				firstLine();
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(89);
						line();
						}
						} 
					}
					setState(94);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(96);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(95);
					lastLine();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				if (!(!_localctx._lastLine)) throw new FailedPredicateException(this, "!$_lastLine");
				setState(99);
				firstLine();
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(100);
						line();
						}
						} 
					}
					setState(105);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class FirstLineContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TerminalNode NL() { return getToken(JavadocParser.NL, 0); }
		public FirstLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).enterFirstLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).exitFirstLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavadocVisitor ) return ((JavadocVisitor<? extends T>)visitor).visitFirstLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstLineContext firstLine() throws RecognitionException {
		FirstLineContext _localctx = new FirstLineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_firstLine);
		try {
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				text(true);
				setState(110);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(109);
					match(NL);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
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

	public static class LineContext extends ParserRuleContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public TerminalNode NL() { return getToken(JavadocParser.NL, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavadocVisitor ) return ((JavadocVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_line);
		try {
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				prefix();
				setState(117);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(116);
					text(true);
					}
					break;
				}
				setState(119);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(121);
					text(false);
					}
					break;
				}
				setState(124);
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

	public static class LastLineContext extends ParserRuleContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public LastLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).enterLastLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).exitLastLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavadocVisitor ) return ((JavadocVisitor<? extends T>)visitor).visitLastLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastLineContext lastLine() throws RecognitionException {
		LastLineContext _localctx = new LastLineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lastLine);
		try {
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				prefix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(128);
					prefix();
					}
					break;
				}
				setState(131);
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
		public List<TerminalNode> WS() { return getTokens(JavadocParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JavadocParser.WS, i);
		}
		public List<TerminalNode> STAR() { return getTokens(JavadocParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(JavadocParser.STAR, i);
		}
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).exitPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavadocVisitor ) return ((JavadocVisitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_prefix);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(134);
				match(WS);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(140);
					match(STAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(143); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					match(WS);
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		public List<TerminalNode> WORD() { return getTokens(JavadocParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(JavadocParser.WORD, i);
		}
		public List<TerminalNode> STAR() { return getTokens(JavadocParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(JavadocParser.STAR, i);
		}
		public List<TerminalNode> WS() { return getTokens(JavadocParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JavadocParser.WS, i);
		}
		public List<TerminalNode> AT() { return getTokens(JavadocParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(JavadocParser.AT, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TextContext(ParserRuleContext parent, int invokingState, boolean prefixed) {
			super(parent, invokingState);
			this.prefixed = prefixed;
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavadocVisitor ) return ((JavadocVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text(boolean prefixed) throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState(), prefixed);
		enterRule(_localctx, 22, RULE_text);
		int _la;
		try {
			int _alt;
			setState(187);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				if (!(_localctx.prefixed)) throw new FailedPredicateException(this, "$prefixed");
				setState(159); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(152);
						_la = _input.LA(1);
						if ( !(_la==STAR || _la==WORD) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(156);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(153);
								_la = _input.LA(1);
								if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << STAR) | (1L << WORD) | (1L << WS))) != 0)) ) {
								_errHandler.recoverInline(this);
								} else {
									consume();
								}
								}
								} 
							}
							setState(158);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(161); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				if (!(!_localctx.prefixed)) throw new FailedPredicateException(this, "!$prefixed");
				setState(177); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(164);
							match(WS);
							}
							}
							setState(169);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(170);
						match(WORD);
						setState(174);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(171);
								_la = _input.LA(1);
								if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << STAR) | (1L << WORD) | (1L << WS))) != 0)) ) {
								_errHandler.recoverInline(this);
								} else {
									consume();
								}
								}
								} 
							}
							setState(176);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(179); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				if (!(!_localctx.prefixed)) throw new FailedPredicateException(this, "!$prefixed");
				setState(183); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(182);
						match(WS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(185); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class TagSectionContext extends ParserRuleContext {
		public boolean _firstLine;
		public List<TagContext> tag() {
			return getRuleContexts(TagContext.class);
		}
		public TagContext tag(int i) {
			return getRuleContext(TagContext.class,i);
		}
		public TagSectionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TagSectionContext(ParserRuleContext parent, int invokingState, boolean _firstLine) {
			super(parent, invokingState);
			this._firstLine = _firstLine;
		}
		@Override public int getRuleIndex() { return RULE_tagSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).enterTagSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).exitTagSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavadocVisitor ) return ((JavadocVisitor<? extends T>)visitor).visitTagSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagSectionContext tagSection(boolean _firstLine) throws RecognitionException {
		TagSectionContext _localctx = new TagSectionContext(_ctx, getState(), _firstLine);
		enterRule(_localctx, 24, RULE_tagSection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			tag(_firstLine);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190);
					tag(false);
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class TagContext extends ParserRuleContext {
		public boolean _firstLine;
		public TerminalNode AT() { return getToken(JavadocParser.AT, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(JavadocParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JavadocParser.WS, i);
		}
		public FirstLineContext firstLine() {
			return getRuleContext(FirstLineContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public LastLineContext lastLine() {
			return getRuleContext(LastLineContext.class,0);
		}
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public TagContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TagContext(ParserRuleContext parent, int invokingState, boolean _firstLine) {
			super(parent, invokingState);
			this._firstLine = _firstLine;
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavadocVisitor ) return ((JavadocVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag(boolean _firstLine) throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState(), _firstLine);
		enterRule(_localctx, 26, RULE_tag);
		int _la;
		try {
			int _alt;
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				if (!(_localctx._firstLine)) throw new FailedPredicateException(this, "$_firstLine");
				setState(197);
				match(AT);
				setState(199);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(198);
					tagName();
					}
					break;
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(201);
						match(WS);
						}
						} 
					}
					setState(206);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(217);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(207);
					firstLine();
					setState(211);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(208);
							line();
							}
							} 
						}
						setState(213);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
					}
					setState(215);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(214);
						lastLine();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				if (!(!_localctx._firstLine)) throw new FailedPredicateException(this, "!$_firstLine");
				setState(221);
				_la = _input.LA(1);
				if (_la==STAR || _la==WS) {
					{
					setState(220);
					prefix();
					}
				}

				setState(223);
				match(AT);
				setState(225);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(224);
					tagName();
					}
					break;
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(227);
						match(WS);
						}
						} 
					}
					setState(232);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(243);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(233);
					firstLine();
					setState(237);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(234);
							line();
							}
							} 
						}
						setState(239);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
					}
					setState(241);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(240);
						lastLine();
						}
						break;
					}
					}
					break;
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

	public static class TagNameContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(JavadocParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(JavadocParser.WORD, i);
		}
		public List<TerminalNode> AT() { return getTokens(JavadocParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(JavadocParser.AT, i);
		}
		public List<TerminalNode> STAR() { return getTokens(JavadocParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(JavadocParser.STAR, i);
		}
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavadocListener ) ((JavadocListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavadocVisitor ) return ((JavadocVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tagName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(247);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << STAR) | (1L << WORD))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(250); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		case 6:
			return mainDescription_sempred((MainDescriptionContext)_localctx, predIndex);
		case 11:
			return text_sempred((TextContext)_localctx, predIndex);
		case 13:
			return tag_sempred((TagContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mainDescription_sempred(MainDescriptionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return _localctx._lastLine;
		case 1:
			return !_localctx._lastLine;
		}
		return true;
	}
	private boolean text_sempred(TextContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return _localctx.prefixed;
		case 3:
			return !_localctx.prefixed;
		case 4:
			return !_localctx.prefixed;
		}
		return true;
	}
	private boolean tag_sempred(TagContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return _localctx._firstLine;
		case 6:
			return !_localctx._firstLine;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t\u00ff\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\5\2#\n\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\5\3\5\5\5\62\n\5\3\5\7\5\65"+
		"\n\5\f\5\16\58\13\5\3\5\3\5\3\6\3\6\7\6>\n\6\f\6\16\6A\13\6\3\6\7\6D\n"+
		"\6\f\6\16\6G\13\6\3\7\5\7J\n\7\3\7\7\7M\n\7\f\7\16\7P\13\7\3\7\7\7S\n"+
		"\7\f\7\16\7V\13\7\3\7\3\7\3\b\3\b\3\b\7\b]\n\b\f\b\16\b`\13\b\3\b\5\b"+
		"c\n\b\3\b\3\b\3\b\7\bh\n\b\f\b\16\bk\13\b\5\bm\n\b\3\t\3\t\5\tq\n\t\3"+
		"\t\5\tt\n\t\3\n\3\n\5\nx\n\n\3\n\3\n\3\n\5\n}\n\n\3\n\5\n\u0080\n\n\3"+
		"\13\3\13\5\13\u0084\n\13\3\13\5\13\u0087\n\13\3\f\7\f\u008a\n\f\f\f\16"+
		"\f\u008d\13\f\3\f\6\f\u0090\n\f\r\f\16\f\u0091\3\f\7\f\u0095\n\f\f\f\16"+
		"\f\u0098\13\f\3\r\3\r\3\r\7\r\u009d\n\r\f\r\16\r\u00a0\13\r\6\r\u00a2"+
		"\n\r\r\r\16\r\u00a3\3\r\3\r\7\r\u00a8\n\r\f\r\16\r\u00ab\13\r\3\r\3\r"+
		"\7\r\u00af\n\r\f\r\16\r\u00b2\13\r\6\r\u00b4\n\r\r\r\16\r\u00b5\3\r\3"+
		"\r\6\r\u00ba\n\r\r\r\16\r\u00bb\5\r\u00be\n\r\3\16\3\16\7\16\u00c2\n\16"+
		"\f\16\16\16\u00c5\13\16\3\17\3\17\3\17\5\17\u00ca\n\17\3\17\7\17\u00cd"+
		"\n\17\f\17\16\17\u00d0\13\17\3\17\3\17\7\17\u00d4\n\17\f\17\16\17\u00d7"+
		"\13\17\3\17\5\17\u00da\n\17\5\17\u00dc\n\17\3\17\3\17\5\17\u00e0\n\17"+
		"\3\17\3\17\5\17\u00e4\n\17\3\17\7\17\u00e7\n\17\f\17\16\17\u00ea\13\17"+
		"\3\17\3\17\7\17\u00ee\n\17\f\17\16\17\u00f1\13\17\3\17\5\17\u00f4\n\17"+
		"\5\17\u00f6\n\17\5\17\u00f8\n\17\3\20\6\20\u00fb\n\20\r\20\16\20\u00fc"+
		"\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\5\3\2\6\7\4\2\5"+
		"\7\t\t\3\2\5\7\u011d\2 \3\2\2\2\4+\3\2\2\2\6-\3\2\2\2\b/\3\2\2\2\n;\3"+
		"\2\2\2\fI\3\2\2\2\16l\3\2\2\2\20s\3\2\2\2\22\177\3\2\2\2\24\u0086\3\2"+
		"\2\2\26\u008b\3\2\2\2\30\u00bd\3\2\2\2\32\u00bf\3\2\2\2\34\u00f7\3\2\2"+
		"\2\36\u00fa\3\2\2\2 \"\5\n\6\2!#\5\4\3\2\"!\3\2\2\2\"#\3\2\2\2#$\3\2\2"+
		"\2$%\5\f\7\2%\3\3\2\2\2&,\5\16\b\2\',\5\32\16\2()\5\16\b\2)*\5\32\16\2"+
		"*,\3\2\2\2+&\3\2\2\2+\'\3\2\2\2+(\3\2\2\2,\5\3\2\2\2-.\5\30\r\2.\7\3\2"+
		"\2\2/\61\7\5\2\2\60\62\5\36\20\2\61\60\3\2\2\2\61\62\3\2\2\2\62\66\3\2"+
		"\2\2\63\65\7\t\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2"+
		"\2\679\3\2\2\28\66\3\2\2\29:\5\30\r\2:\t\3\2\2\2;?\7\3\2\2<>\7\6\2\2="+
		"<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@E\3\2\2\2A?\3\2\2\2BD\7\t\2\2"+
		"CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\13\3\2\2\2GE\3\2\2\2HJ\7\b\2"+
		"\2IH\3\2\2\2IJ\3\2\2\2JN\3\2\2\2KM\7\t\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2"+
		"\2NO\3\2\2\2OT\3\2\2\2PN\3\2\2\2QS\7\6\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2"+
		"\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\4\2\2X\r\3\2\2\2YZ\6\b\2\3Z^\5\20"+
		"\t\2[]\5\22\n\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^"+
		"\3\2\2\2ac\5\24\13\2ba\3\2\2\2bc\3\2\2\2cm\3\2\2\2de\6\b\3\3ei\5\20\t"+
		"\2fh\5\22\n\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2"+
		"\2\2lY\3\2\2\2ld\3\2\2\2m\17\3\2\2\2np\5\30\r\2oq\7\b\2\2po\3\2\2\2pq"+
		"\3\2\2\2qt\3\2\2\2rt\7\b\2\2sn\3\2\2\2sr\3\2\2\2t\21\3\2\2\2uw\5\26\f"+
		"\2vx\5\30\r\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\b\2\2z\u0080\3\2\2\2{"+
		"}\5\30\r\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0080\7\b\2\2\177u\3\2\2\2\177"+
		"|\3\2\2\2\u0080\23\3\2\2\2\u0081\u0087\5\26\f\2\u0082\u0084\5\26\f\2\u0083"+
		"\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\5\30"+
		"\r\2\u0086\u0081\3\2\2\2\u0086\u0083\3\2\2\2\u0087\25\3\2\2\2\u0088\u008a"+
		"\7\t\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\7\6"+
		"\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0096\3\2\2\2\u0093\u0095\7\t\2\2\u0094\u0093\3\2"+
		"\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\27\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u00a1\6\r\4\3\u009a\u009e\t\2\2"+
		"\2\u009b\u009d\t\3\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u009a\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00be\3\2\2\2\u00a5\u00b3\6\r\5\3\u00a6\u00a8\7\t\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b0\7\7\2\2\u00ad"+
		"\u00af\t\3\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00a9\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00be\3\2\2\2\u00b7\u00b9\6\r\6\3\u00b8\u00ba\7\t\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00be\3\2\2\2\u00bd\u0099\3\2\2\2\u00bd\u00a5\3\2\2\2\u00bd"+
		"\u00b7\3\2\2\2\u00be\31\3\2\2\2\u00bf\u00c3\5\34\17\2\u00c0\u00c2\5\34"+
		"\17\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\33\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\6\17\7"+
		"\3\u00c7\u00c9\7\5\2\2\u00c8\u00ca\5\36\20\2\u00c9\u00c8\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00cd\7\t\2\2\u00cc\u00cb\3\2"+
		"\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00db\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d5\5\20\t\2\u00d2\u00d4\5"+
		"\22\n\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da\5\24"+
		"\13\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db"+
		"\u00d1\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00f8\3\2\2\2\u00dd\u00df\6\17"+
		"\b\3\u00de\u00e0\5\26\f\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e3\7\5\2\2\u00e2\u00e4\5\36\20\2\u00e3\u00e2\3"+
		"\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e8\3\2\2\2\u00e5\u00e7\7\t\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00f5\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ef\5\20\t\2\u00ec"+
		"\u00ee\5\22\n\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3"+
		"\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f4\5\24\13\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3"+
		"\2\2\2\u00f5\u00eb\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00c6\3\2\2\2\u00f7\u00dd\3\2\2\2\u00f8\35\3\2\2\2\u00f9\u00fb\t\4\2"+
		"\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\37\3\2\2\2.\"+\61\66?EINT^bilpsw|\177\u0083\u0086\u008b"+
		"\u0091\u0096\u009e\u00a3\u00a9\u00b0\u00b5\u00bb\u00bd\u00c3\u00c9\u00ce"+
		"\u00d5\u00d9\u00db\u00df\u00e3\u00e8\u00ef\u00f3\u00f5\u00f7\u00fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}