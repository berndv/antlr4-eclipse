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
import java.io.Reader;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;

public class DocumentRangeReader extends Reader {
   final private IDocument document;
   final private int rangeEnd;
   private int offset;

   public DocumentRangeReader(final IDocument document, int offset, int length) {
      Assert.isLegal(document != null);
      final int documentLength = document.getLength();
      checkRange(offset, length, documentLength);
      this.document = document;
      this.offset = offset;
      this.rangeEnd = offset + length;
   }

   public int getOffset() {
      return offset;
   }

   public int getRangeEnd() {
      return rangeEnd;
   }

   /**
    * Checks that the given range is valid.
    * See https://bugs.eclipse.org/bugs/show_bug.cgi?id=69292
    *
    * @param offset the offset of the document range to scan
    * @param length the length of the document range to scan
    * @param documentLength the document's length
    * @since 3.3
    */
   private void checkRange(int offset, int length, int documentLength) {
      Assert.isLegal(offset > -1);
      Assert.isLegal(length > -1);
      Assert.isLegal(offset + length <= documentLength);
   }

   @Override
   public int read() {
      try {
         if (offset < rangeEnd) {
            try {
               return document.getChar(offset);
            }
            catch (BadLocationException e) {
            }
         }
         return -1;
      }
      finally {
         ++offset;
      }
   }

   @Override
   public int read(char[] cbuf, int off, int len) throws IOException {
      int i = 0;
      for (; i < len; i++) {
         final int c = read();
         if (c == -1) {
            break;
         }
         else {
            cbuf[off + i] = (char) c;
         }
      }
      return i == 0 ? -1 : i;
   }

   @Override
   public void close() throws IOException {
   }

}
