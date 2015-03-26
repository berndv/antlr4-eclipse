// Generated from LittleJ.g4 by ANTLR 4.5

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

package org.sourcepit.antlr4.eclipse.lang.tests.littlej;

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
public class LittleJParser extends Parser {
   static {
      RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
      T__9 = 10, ID = 11;
   public static final int RULE_compilationUnit = 0, RULE_classBody = 1, RULE_classBodyDeclaration = 2,
      RULE_memberDeclaration = 3, RULE_methodDeclaration = 4, RULE_methodBody = 5, RULE_methodBodyDeclaration = 6,
      RULE_statement = 7, RULE_ifStatement = 8, RULE_doWhileStatement = 9, RULE_expression = 10, RULE_block = 11,
      RULE_typeName = 12, RULE_fieldName = 13, RULE_methodName = 14;
   public static final String[] ruleNames = { "compilationUnit", "classBody", "classBodyDeclaration",
      "memberDeclaration", "methodDeclaration", "methodBody", "methodBodyDeclaration", "statement", "ifStatement",
      "doWhileStatement", "expression", "block", "typeName", "fieldName", "methodName" };

   private static final String[] _LITERAL_NAMES = { null, "'class'", "'{'", "'}'", "';'", "'if'", "'('", "')'", "'do'",
      "'while'", "'=='" };
   private static final String[] _SYMBOLIC_NAMES = { null, null, null, null, null, null, null, null, null, null, null,
      "ID" };
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
      return "LittleJ.g4";
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

   public LittleJParser(TokenStream input) {
      super(input);
      _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   public static class CompilationUnitContext extends ParserRuleContext {
      public TerminalNode ID() {
         return getToken(LittleJParser.ID, 0);
      }

      public ClassBodyContext classBody() {
         return getRuleContext(ClassBodyContext.class, 0);
      }

      public TerminalNode EOF() {
         return getToken(LittleJParser.EOF, 0);
      }

      public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_compilationUnit;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).enterCompilationUnit(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).exitCompilationUnit(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJVisitor)
            return ((LittleJVisitor<? extends T>) visitor).visitCompilationUnit(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final CompilationUnitContext compilationUnit() throws RecognitionException {
      CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
      enterRule(_localctx, 0, RULE_compilationUnit);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(30);
            match(T__0);
            setState(31);
            match(ID);
            setState(32);
            classBody();
            setState(33);
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

   public static class ClassBodyContext extends ParserRuleContext {
      public List<ClassBodyDeclarationContext> classBodyDeclaration() {
         return getRuleContexts(ClassBodyDeclarationContext.class);
      }

      public ClassBodyDeclarationContext classBodyDeclaration(int i) {
         return getRuleContext(ClassBodyDeclarationContext.class, i);
      }

      public ClassBodyContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_classBody;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).enterClassBody(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).exitClassBody(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJVisitor)
            return ((LittleJVisitor<? extends T>) visitor).visitClassBody(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ClassBodyContext classBody() throws RecognitionException {
      ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
      enterRule(_localctx, 2, RULE_classBody);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(35);
            match(T__1);
            setState(39);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == ID) {
               {
                  {
                     setState(36);
                     classBodyDeclaration();
                  }
               }
               setState(41);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(42);
            match(T__2);
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

   public static class ClassBodyDeclarationContext extends ParserRuleContext {
      public MemberDeclarationContext memberDeclaration() {
         return getRuleContext(MemberDeclarationContext.class, 0);
      }

      public MethodDeclarationContext methodDeclaration() {
         return getRuleContext(MethodDeclarationContext.class, 0);
      }

      public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_classBodyDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).enterClassBodyDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).exitClassBodyDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJVisitor)
            return ((LittleJVisitor<? extends T>) visitor).visitClassBodyDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
      ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
      enterRule(_localctx, 4, RULE_classBodyDeclaration);
      try {
         setState(46);
         switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
            case 1 :
               enterOuterAlt(_localctx, 1);
               {
                  setState(44);
                  memberDeclaration();
               }
               break;
            case 2 :
               enterOuterAlt(_localctx, 2);
               {
                  setState(45);
                  methodDeclaration();
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

   public static class MemberDeclarationContext extends ParserRuleContext {
      public TypeNameContext typeName() {
         return getRuleContext(TypeNameContext.class, 0);
      }

      public FieldNameContext fieldName() {
         return getRuleContext(FieldNameContext.class, 0);
      }

      public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_memberDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).enterMemberDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).exitMemberDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJVisitor)
            return ((LittleJVisitor<? extends T>) visitor).visitMemberDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
      MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
      enterRule(_localctx, 6, RULE_memberDeclaration);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(48);
            typeName();
            setState(49);
            fieldName();
            setState(50);
            match(T__3);
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

   public static class MethodDeclarationContext extends ParserRuleContext {
      public TypeNameContext typeName() {
         return getRuleContext(TypeNameContext.class, 0);
      }

      public MethodNameContext methodName() {
         return getRuleContext(MethodNameContext.class, 0);
      }

      public MethodBodyContext methodBody() {
         return getRuleContext(MethodBodyContext.class, 0);
      }

      public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_methodDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).enterMethodDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).exitMethodDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJVisitor)
            return ((LittleJVisitor<? extends T>) visitor).visitMethodDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
      MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
      enterRule(_localctx, 8, RULE_methodDeclaration);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(52);
            typeName();
            setState(53);
            methodName();
            setState(54);
            methodBody();
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

   public static class MethodBodyContext extends ParserRuleContext {
      public List<MethodBodyDeclarationContext> methodBodyDeclaration() {
         return getRuleContexts(MethodBodyDeclarationContext.class);
      }

      public MethodBodyDeclarationContext methodBodyDeclaration(int i) {
         return getRuleContext(MethodBodyDeclarationContext.class, i);
      }

      public MethodBodyContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_methodBody;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).enterMethodBody(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).exitMethodBody(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJVisitor)
            return ((LittleJVisitor<? extends T>) visitor).visitMethodBody(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MethodBodyContext methodBody() throws RecognitionException {
      MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
      enterRule(_localctx, 10, RULE_methodBody);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(56);
            match(T__1);
            setState(60);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__4 || _la == T__7) {
               {
                  {
                     setState(57);
                     methodBodyDeclaration();
                  }
               }
               setState(62);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(63);
            match(T__2);
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

   public static class MethodBodyDeclarationContext extends ParserRuleContext {
      public StatementContext statement() {
         return getRuleContext(StatementContext.class, 0);
      }

      public MethodBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_methodBodyDeclaration;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).enterMethodBodyDeclaration(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).exitMethodBodyDeclaration(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJVisitor)
            return ((LittleJVisitor<? extends T>) visitor).visitMethodBodyDeclaration(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MethodBodyDeclarationContext methodBodyDeclaration() throws RecognitionException {
      MethodBodyDeclarationContext _localctx = new MethodBodyDeclarationContext(_ctx, getState());
      enterRule(_localctx, 12, RULE_methodBodyDeclaration);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(65);
            statement();
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

   public static class StatementContext extends ParserRuleContext {
      public IfStatementContext ifStatement() {
         return getRuleContext(IfStatementContext.class, 0);
      }

      public DoWhileStatementContext doWhileStatement() {
         return getRuleContext(DoWhileStatementContext.class, 0);
      }

      public StatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_statement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).enterStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).exitStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJVisitor)
            return ((LittleJVisitor<? extends T>) visitor).visitStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final StatementContext statement() throws RecognitionException {
      StatementContext _localctx = new StatementContext(_ctx, getState());
      enterRule(_localctx, 14, RULE_statement);
      try {
         setState(69);
         switch (_input.LA(1)) {
            case T__4 :
               enterOuterAlt(_localctx, 1);
               {
                  setState(67);
                  ifStatement();
               }
               break;
            case T__7 :
               enterOuterAlt(_localctx, 2);
               {
                  setState(68);
                  doWhileStatement();
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

   public static class IfStatementContext extends ParserRuleContext {
      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public BlockContext block() {
         return getRuleContext(BlockContext.class, 0);
      }

      public IfStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ifStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).enterIfStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).exitIfStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJVisitor)
            return ((LittleJVisitor<? extends T>) visitor).visitIfStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final IfStatementContext ifStatement() throws RecognitionException {
      IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
      enterRule(_localctx, 16, RULE_ifStatement);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(71);
            match(T__4);
            setState(72);
            match(T__5);
            setState(73);
            expression();
            setState(74);
            match(T__6);
            setState(75);
            block();
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

   public static class DoWhileStatementContext extends ParserRuleContext {
      public BlockContext block() {
         return getRuleContext(BlockContext.class, 0);
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_doWhileStatement;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).enterDoWhileStatement(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).exitDoWhileStatement(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJVisitor)
            return ((LittleJVisitor<? extends T>) visitor).visitDoWhileStatement(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
      DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
      enterRule(_localctx, 18, RULE_doWhileStatement);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(77);
            match(T__7);
            setState(78);
            block();
            setState(79);
            match(T__8);
            setState(80);
            match(T__5);
            setState(81);
            expression();
            setState(82);
            match(T__6);
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

   public static class ExpressionContext extends ParserRuleContext {
      public List<TerminalNode> ID() {
         return getTokens(LittleJParser.ID);
      }

      public TerminalNode ID(int i) {
         return getToken(LittleJParser.ID, i);
      }

      public ExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_expression;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).enterExpression(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).exitExpression(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJVisitor)
            return ((LittleJVisitor<? extends T>) visitor).visitExpression(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final ExpressionContext expression() throws RecognitionException {
      ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
      enterRule(_localctx, 20, RULE_expression);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(84);
            match(ID);
            setState(85);
            match(T__9);
            setState(86);
            match(ID);
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
      public BlockContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_block;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).enterBlock(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).exitBlock(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJVisitor)
            return ((LittleJVisitor<? extends T>) visitor).visitBlock(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final BlockContext block() throws RecognitionException {
      BlockContext _localctx = new BlockContext(_ctx, getState());
      enterRule(_localctx, 22, RULE_block);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(88);
            match(T__1);
            setState(89);
            match(T__2);
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

   public static class TypeNameContext extends ParserRuleContext {
      public TerminalNode ID() {
         return getToken(LittleJParser.ID, 0);
      }

      public TypeNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_typeName;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).enterTypeName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).exitTypeName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJVisitor)
            return ((LittleJVisitor<? extends T>) visitor).visitTypeName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final TypeNameContext typeName() throws RecognitionException {
      TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
      enterRule(_localctx, 24, RULE_typeName);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(91);
            match(ID);
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

   public static class FieldNameContext extends ParserRuleContext {
      public TerminalNode ID() {
         return getToken(LittleJParser.ID, 0);
      }

      public FieldNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_fieldName;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).enterFieldName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).exitFieldName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJVisitor)
            return ((LittleJVisitor<? extends T>) visitor).visitFieldName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final FieldNameContext fieldName() throws RecognitionException {
      FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
      enterRule(_localctx, 26, RULE_fieldName);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(93);
            match(ID);
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

   public static class MethodNameContext extends ParserRuleContext {
      public TerminalNode ID() {
         return getToken(LittleJParser.ID, 0);
      }

      public MethodNameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public int getRuleIndex() {
         return RULE_methodName;
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).enterMethodName(this);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof LittleJListener)
            ((LittleJListener) listener).exitMethodName(this);
      }

      @Override
      public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
         if (visitor instanceof LittleJVisitor)
            return ((LittleJVisitor<? extends T>) visitor).visitMethodName(this);
         else
            return visitor.visitChildren(this);
      }
   }

   public final MethodNameContext methodName() throws RecognitionException {
      MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
      enterRule(_localctx, 28, RULE_methodName);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(95);
            match(ID);
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

   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\rd\4\2\t\2\4\3\t"
      + "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"
      + "\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2\3\3\3"
      + "\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\3\4\3\4\5\4\61\n\4\3\5\3\5\3\5\3\5"
      + "\3\6\3\6\3\6\3\6\3\7\3\7\7\7=\n\7\f\7\16\7@\13\7\3\7\3\7\3\b\3\b\3\t\3"
      + "\t\5\tH\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"
      + "\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\2\2\21"
      + "\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2X\2 \3\2\2\2\4%\3\2\2\2\6\60"
      + "\3\2\2\2\b\62\3\2\2\2\n\66\3\2\2\2\f:\3\2\2\2\16C\3\2\2\2\20G\3\2\2\2"
      + "\22I\3\2\2\2\24O\3\2\2\2\26V\3\2\2\2\30Z\3\2\2\2\32]\3\2\2\2\34_\3\2\2"
      + "\2\36a\3\2\2\2 !\7\3\2\2!\"\7\r\2\2\"#\5\4\3\2#$\7\2\2\3$\3\3\2\2\2%)"
      + "\7\4\2\2&(\5\6\4\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2"
      + "+)\3\2\2\2,-\7\5\2\2-\5\3\2\2\2.\61\5\b\5\2/\61\5\n\6\2\60.\3\2\2\2\60"
      + "/\3\2\2\2\61\7\3\2\2\2\62\63\5\32\16\2\63\64\5\34\17\2\64\65\7\6\2\2\65"
      + "\t\3\2\2\2\66\67\5\32\16\2\678\5\36\20\289\5\f\7\29\13\3\2\2\2:>\7\4\2"
      + "\2;=\5\16\b\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2"
      + "\2\2AB\7\5\2\2B\r\3\2\2\2CD\5\20\t\2D\17\3\2\2\2EH\5\22\n\2FH\5\24\13"
      + "\2GE\3\2\2\2GF\3\2\2\2H\21\3\2\2\2IJ\7\7\2\2JK\7\b\2\2KL\5\26\f\2LM\7"
      + "\t\2\2MN\5\30\r\2N\23\3\2\2\2OP\7\n\2\2PQ\5\30\r\2QR\7\13\2\2RS\7\b\2"
      + "\2ST\5\26\f\2TU\7\t\2\2U\25\3\2\2\2VW\7\r\2\2WX\7\f\2\2XY\7\r\2\2Y\27"
      + "\3\2\2\2Z[\7\4\2\2[\\\7\5\2\2\\\31\3\2\2\2]^\7\r\2\2^\33\3\2\2\2_`\7\r"
      + "\2\2`\35\3\2\2\2ab\7\r\2\2b\37\3\2\2\2\6)\60>G";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }
}