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

import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.sourcepit.antlr4.eclipse.lang.CommentLexer;
import org.sourcepit.antlr4.eclipse.lang.CommentParser;
import org.sourcepit.antlr4.eclipse.lang.CommentParser.CommentContext;
import org.sourcepit.ltk.format.CompositeSpan;
import org.sourcepit.ltk.format.ParseTreeToSpanTransformer;
import org.sourcepit.ltk.format.Span;
import org.sourcepit.ltk.format.SpanBuildingParseTreeListener.ParseResult;
import org.sourcepit.ltk.format.TokenSpan;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class SourceFormatter {

   public void format(ParserRuleContext ast, BufferedTokenStream tokenStream) throws IOException {

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


      format(span, w, new Stack<>());

      System.out.println(w);

   }

   private void format(Span span, Appendable a, Stack<Renderer> parentRenderers) throws IOException {
      final Renderer renderer = createRenderer(span);
      renderer.render(span, a);
      parentRenderers.push(renderer);
      for (Span children : getChildren(span)) {
         format(children, a, parentRenderers);
      }
      parentRenderers.pop();
   }

   private Renderer createRenderer(Span span) {
      return new Renderer() {
         @Override
         public void render(Span span, Appendable a) throws IOException {
            if (span instanceof TokenSpan) {
               TokenSpan ts = ((TokenSpan) span);
               List<Token> tokens = ts.tokens;
               int lastIdx = tokens.size() - 1;
               if (lastIdx > -1) {
                  for (int i = 0; i < lastIdx; i++) {
                     a.append(tokens.get(i).getText());
                     a.append(' ');
                  }
                  a.append(tokens.get(lastIdx).getText());
               }
            }
         }
      };
   }

   private static Collection<Span> getChildren(Span span) {
      if (span instanceof CompositeSpan) {
         return ((CompositeSpan) span).spans;
      }
      return Collections.emptyList();
   }


}
