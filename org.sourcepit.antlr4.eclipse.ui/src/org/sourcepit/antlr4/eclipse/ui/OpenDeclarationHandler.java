/*
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

package org.sourcepit.antlr4.eclipse.ui;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.texteditor.ITextEditor;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.GrammarSpecContext;
import org.sourcepit.antlr4.eclipse.lang.symbols.ANTLRv4ScopeBuildingListener;
import org.sourcepit.antlr4.eclipse.lang.symbols.LexerRuleSymbol;
import org.sourcepit.antlr4.eclipse.lang.symbols.ParserRuleSymbol;
import org.sourcepit.antlr4.eclipse.lang.symbols.Scope;
import org.sourcepit.antlr4.eclipse.lang.symbols.Symbol;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class OpenDeclarationHandler extends AbstractHandler {

   @Override
   public Object execute(ExecutionEvent event) throws ExecutionException {
      final ITextEditor activeEditor = (ITextEditor) HandlerUtil.getActiveEditorChecked(event);

      final ISelectionProvider selectionProvider = activeEditor.getSite().getSelectionProvider();
      final ITextSelection selection = (ITextSelection) selectionProvider.getSelection();


      final IDocument document = activeEditor.getDocumentProvider().getDocument(activeEditor.getEditorInput());
      final int selectionOffset = selection.getOffset();
      final int selectionLength = selection.getLength();

      final ANTLRInputStream input;
      try {
         input = new ANTLRInputStream(new DocumentRangeReader(document, 0, document.getLength()));
      }
      catch (IOException e) {
         throw new IllegalStateException(e);
      }
      final ANTLRv4Parser parser = new ANTLRv4Parser(new CommonTokenStream(new ANTLRv4Lexer(input)));
      final ANTLRv4ScopeBuildingListener scopeBuilder = new ANTLRv4ScopeBuildingListener();
      parser.addParseListener(scopeBuilder);

      final GrammarSpecContext root = parser.grammarSpec();

      final ParseTreeProperty<Scope<?>> nodeToScopeMap = scopeBuilder.getNodeToScopeMap();

      final TerminalNode node = findFirstNodeTouchedByRange(root, selectionOffset, selectionLength);
      if (node != null) {
         final Symbol<?> declaration = findDeclaration(node, nodeToScopeMap);
         if (declaration != null) {
            final ITextSelection textSelection = toTextSelection(declaration);
            selectionProvider.setSelection(textSelection);
         }
      }
      return null;
   }

   static ITextSelection toTextSelection(Symbol<?> declaration) {
      final ParseTree name = declaration.getName();
      if (name instanceof TerminalNode) {
         final TerminalNode nameNode = (TerminalNode) name;
         final Token nameToken = nameNode.getSymbol();
         final int offset = nameToken.getStartIndex();
         final int length = nameToken.getText().length();
         return new TextSelection(offset, length);
      }
      if (name instanceof ParserRuleContext) {
         final ParserRuleContext nameNode = (ParserRuleContext) name;
         final int offset = nameNode.getStart().getStartIndex();
         final int length = nameNode.getStop().getStopIndex() - offset + 1;
         return new TextSelection(offset, length);
      }
      throw new IllegalStateException();
   }

   private static Symbol<?> findDeclaration(TerminalNode node, ParseTreeProperty<Scope<?>> nodeToScopeMap) {
      final Scope<?> scope = findScope(node, nodeToScopeMap);
      final Token token = node.getSymbol();
      if (token.getType() == ANTLRv4Lexer.RULE_REF) {
         return scope.resolve(token.getText(), ParserRuleSymbol.class);
      }
      if (token.getType() == ANTLRv4Lexer.TOKEN_REF) {
         return scope.resolve(token.getText(), LexerRuleSymbol.class);
      }
      return null;
   }

   private static Scope<?> findScope(ParseTree node, ParseTreeProperty<Scope<?>> nodeToScopeMap) {
      Scope<?> scope = nodeToScopeMap.get(node);
      if (scope == null) {
         final ParseTree parent = node.getParent();
         if (parent != null) {
            scope = findScope(parent, nodeToScopeMap);
         }
      }
      return scope;
   }

   private static TerminalNode findFirstNodeTouchedByRange(final GrammarSpecContext root, final int selectionOffset,
      final int selectionLength) {

      TerminalNode node = root.accept(new AbstractParseTreeVisitor<TerminalNode>() {
         @Override
         public TerminalNode visitTerminal(TerminalNode node) {
            if (isTouchedByRange(node.getSymbol(), selectionOffset, selectionLength)) {
               return node;
            }
            return super.visitTerminal(node);
         }

         private boolean isTouchedByRange(Token token, int selectionOffset, int selectionLength) {
            final int nodeOffset = token.getStartIndex();
            if (nodeOffset >= selectionOffset && nodeOffset <= selectionOffset + selectionLength) {
               return true;
            }
            if (selectionOffset >= nodeOffset && selectionOffset <= nodeOffset + token.getText().length()) {
               return true;
            }
            return false;
         }

         @Override
         protected boolean shouldVisitNextChild(RuleNode node, TerminalNode currentResult) {
            return currentResult == null;
         }
      });

      return node;
   }

}
