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

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.rules.Token;

public class AntlrTokenScanner implements ITokenScanner {
   private IToken fDefaultReturnToken;
   private int fTokenOffset;

   private DocumentRangeReader reader;

   @Override
   public void setRange(final IDocument document, int offset, int length) {
      reader = new DocumentRangeReader(document, offset, length);
      if (fDefaultReturnToken == null) {
         fDefaultReturnToken = new Token(null);
      }
   }

   @Override
   public IToken nextToken() {
      fTokenOffset = reader.getOffset();
      // TODO read next token
      return fDefaultReturnToken;
   }

   @Override
   public int getTokenOffset() {
      return fTokenOffset;
   }

   @Override
   public int getTokenLength() {
      if (reader.getOffset() < reader.getRangeEnd()) {
         return reader.getOffset() - getTokenOffset();
      }
      return reader.getRangeEnd() - getTokenOffset();
   }


}
