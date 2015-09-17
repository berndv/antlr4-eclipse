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

package org.sourcepit.antlr4.eclipse.lang.format;

import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Collections;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.LabeledAltContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.RuleBlockContext;
import org.sourcepit.antlr4.eclipse.lang.ANTLRv4Parser.RuleSpecContext;
import org.sourcepit.antlr4.eclipse.lang.CommentLexer;
import org.sourcepit.antlr4.eclipse.lang.CommentParser;
import org.sourcepit.antlr4.eclipse.lang.CommentParser.CommentContext;
import org.sourcepit.ltk.format.CompositeSpan;
import org.sourcepit.ltk.format.ParseTreeToSpanTransformer;
import org.sourcepit.ltk.format.Span;
import org.sourcepit.ltk.format.SpanBuildingParseTreeListener.ParseResult;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class SourceFormatter {

   public void format(ParserRuleContext ast, BufferedTokenStream tokenStream) {

      final Span span = new ParseTreeToSpanTransformer() {
         @Override
         protected ParseResult parseHiddenToken(Token hiddenToken) {
            switch (hiddenToken.getType()) {
               case CommentLexer.BLOCK_COMMENT :
               case CommentLexer.LINE_COMMENT :
                  final CommonTokenStream tokenStream = new CommonTokenStream(
                     new CommentLexer(new ANTLRInputStream(hiddenToken.getText())));
                  final CommentContext comment = new CommentParser(tokenStream).comment();
                  final ParseResult result = new ParseResult();
                  result.tokenStream = tokenStream;
                  result.node = comment;
                  return result;
               default :
                  return null;
            }
         }
      }.transform(tokenStream, ast);

      StringWriter w = new StringWriter();


      format(span, w);

      System.out.println(w);

   }

   private void format(Span span, Writer w) {
      
      for (Span children : getChildren(span)) {

      }
   }

   private static Collection<Span> getChildren(Span span) {
      if (span instanceof CompositeSpan) {
         return ((CompositeSpan) span).spans;
      }
      return Collections.emptyList();
   }


}
