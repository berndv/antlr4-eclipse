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

import java.util.Map;

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
import org.sourcepit.antlr4.eclipse.lang.AntlrParserDelegate;
import org.sourcepit.antlr4.eclipse.lang.symbols.GrammarSymbolBuilder;
import org.sourcepit.antlr4.eclipse.lang.symbols.LexerRuleSymbol;
import org.sourcepit.antlr4.eclipse.lang.symbols.ParserRuleSymbol;
import org.sourcepit.antlr4.eclipse.lang.symbols.Scope;
import org.sourcepit.antlr4.eclipse.lang.symbols.Symbol;
import org.sourcepit.ltk.ast.AstBuilder;
import org.sourcepit.ltk.ast.AstNode;
import org.sourcepit.ltk.ast.AstVisitor;
import org.sourcepit.ltk.ast.Rule;
import org.sourcepit.ltk.ast.Terminal;

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

      final AstNode ast = new AstBuilder(new AntlrParserDelegate()).build(document.get());

      final GrammarSymbolBuilder visitor = new GrammarSymbolBuilder();
      ast.accept(visitor);

      final Map<AstNode, Scope<?>> nodeToScopeMap = visitor.getNodeToScopeMap();

      final Terminal node = findFirstNodeTouchedByRange(ast, selectionOffset, selectionLength);
      if (node != null) {
         final Symbol declaration = findDeclaration(node, nodeToScopeMap);
         if (declaration != null) {
            final ITextSelection textSelection = toTextSelection(declaration);
            selectionProvider.setSelection(textSelection);
         }
      }
      return null;
   }

   static ITextSelection toTextSelection(Symbol declaration) {
      final AstNode name = declaration.getName();
      if (name instanceof Terminal) {
         final Terminal nameNode = (Terminal) name;
         final int offset = nameNode.getOffset();
         final int length = nameNode.getLength();
         return new TextSelection(offset, length);
      }
      throw new IllegalStateException();
   }

   private static Symbol findDeclaration(Terminal node, Map<AstNode, Scope<?>> nodeToScopeMap) {
      final Scope<?> scope = findScope(node, nodeToScopeMap);
      if (node.getType().is(ANTLRv4Lexer.class, ANTLRv4Lexer.RULE_REF)) {
         return scope.resolve(node.getToken(), ParserRuleSymbol.class);
      }
      if (node.getType().is(ANTLRv4Lexer.class, ANTLRv4Lexer.TOKEN_REF)) {
         return scope.resolve(node.getToken(), LexerRuleSymbol.class);
      }
      return null;
   }

   private static Scope<?> findScope(AstNode node, Map<AstNode, Scope<?>> nodeToScopeMap) {
      Scope<?> scope = nodeToScopeMap.get(node);
      if (scope == null) {
         final AstNode parent = node.getParent();
         if (parent != null) {
            scope = findScope(parent, nodeToScopeMap);
         }
      }
      return scope;
   }

   private static Terminal findFirstNodeTouchedByRange(final AstNode root, final int selectionOffset,
      final int selectionLength) {
      final Terminal[] res = new Terminal[1];
      root.accept(new AstVisitor() {
         @Override
         public boolean enter(Rule rule) {
            return true;
         }

         @Override
         public boolean visit(Terminal terminal) {
            if (isTouchedByRange(terminal, selectionOffset, selectionLength)) {
               res[0] = terminal;
               return false;
            }
            return true;
         }

         private boolean isTouchedByRange(Terminal token, int selectionOffset, int selectionLength) {
            final int nodeOffset = token.getOffset();
            if (nodeOffset >= selectionOffset && nodeOffset <= selectionOffset + selectionLength) {
               return true;
            }
            if (selectionOffset >= nodeOffset && selectionOffset <= nodeOffset + token.getLength()) {
               return true;
            }
            return false;
         }

         @Override
         public void leave(Rule rule) {
         }
      });
      return res[0];
   }

}
