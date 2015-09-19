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
import org.antlr.v4.runtime.RecognitionException;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.texteditor.ITextEditor;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Lexer;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser;
import org.sourcepit.antlr4.eclipse.lang.format.SourceFormatter;
import org.sourcepit.antlr4.eclipse.lang.symbols.ANTLRv4ScopeBuildingListener;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class FormatSourceHandler extends AbstractHandler {

   @Override
   public Object execute(ExecutionEvent event) throws ExecutionException {

      final ITextEditor activeEditor = (ITextEditor) HandlerUtil.getActiveEditorChecked(event);

      final IDocument document = activeEditor.getDocumentProvider().getDocument(activeEditor.getEditorInput());

      final ANTLRInputStream input;
      try {
         input = new ANTLRInputStream(new DocumentRangeReader(document, 0, document.getLength()));
      }
      catch (IOException e) {
         throw new IllegalStateException(e);
      }
      final CommonTokenStream tokenStream = new CommonTokenStream(new ANTLRv4Lexer(input));
      final ANTLRv4Parser parser = new ANTLRv4Parser(tokenStream);
      final ANTLRv4ScopeBuildingListener scopeBuilder = new ANTLRv4ScopeBuildingListener();
      parser.addParseListener(scopeBuilder);
      try {
         new SourceFormatter().format(parser.grammarSpec(), tokenStream);
      }
      catch (RecognitionException e) {
         // TODO: git_user_name Auto-generated catch block
         e.printStackTrace();
      }
      catch (IOException e) {
         // TODO: git_user_name Auto-generated catch block
         e.printStackTrace();
      }
      return null;
   }


}
