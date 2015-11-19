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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.texteditor.ITextEditor;
import org.sourcepit.antlr4.eclipse.lang.AntlrParserDelegate;
import org.sourcepit.antlr4.eclipse.lang.format.AntlrRendererFactory;
import org.sourcepit.ltk.antlr4.ANTLRv4Parser.GrammarSpecContext;
import org.sourcepit.ltk.format.EOL;
import org.sourcepit.ltk.format.SourceFormatter;
import org.sourcepit.ltk.parser.ParseNode;
import org.sourcepit.ltk.parser.ParseTreeBuilder;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class FormatSourceHandler extends AbstractHandler {

   @Override
   public Object execute(ExecutionEvent event) throws ExecutionException {

      final ITextEditor activeEditor = (ITextEditor) HandlerUtil.getActiveEditorChecked(event);

      final IDocument document = activeEditor.getDocumentProvider().getDocument(activeEditor.getEditorInput());

      try {
         final ParseNode tree = new ParseTreeBuilder(new AntlrParserDelegate()).build(document.get(),
            GrammarSpecContext.class);
         final StringBuilder out = new StringBuilder();
         new SourceFormatter(new AntlrRendererFactory()).format(tree, out, EOL.system());
         document.set(out.toString());
      }
      catch (IOException e) {
         // TODO: git_user_name Auto-generated catch block
         e.printStackTrace();
      }

      return null;
   }


}
