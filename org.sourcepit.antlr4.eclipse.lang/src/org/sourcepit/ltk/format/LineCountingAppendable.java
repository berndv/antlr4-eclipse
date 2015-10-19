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

package org.sourcepit.ltk.format;

import java.io.Closeable;
import java.io.IOException;

public class LineCountingAppendable extends AbstractAppendable implements Appendable, Closeable, LineCounter {

   private final Appendable out;

   private int prevNewLines = 1;

   private int currentLineNumber = 1;

   private StringBuilder lineBuffer;

   public LineCountingAppendable(Appendable out) {
      this.out = out;
      this.lineBuffer = new StringBuilder();
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public int getCurrentLineNumber() {
      return currentLineNumber;
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public int getPrevNewLines() {
      return prevNewLines;
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public boolean isNewLine() {
      return prevNewLines > 0;
   }

   @Override
   public Appendable append(char c) throws IOException {
      lineBuffer.append(c);
      if (c == '\n') {
         final String lastLine = trimEnd(lineBuffer.toString()) + "\n";
         lineBuffer = new StringBuilder();
         out.append(lastLine);
         currentLineNumber++;
         prevNewLines++;
      }
      else {
         prevNewLines = 0;
      }
      return this;
   }

   @Override
   public void close() throws IOException {
      final String lastLine = trimEnd(lineBuffer.toString());
      lineBuffer = null;
      out.append(lastLine);
   }

   public static String trimEnd(String str) {
      int len = str.length();
      int st = 0;
      char[] val = str.toCharArray();
      while ((st < len) && (val[len - 1] <= ' ')) {
         len--;
      }
      return ((st > 0) || (len < val.length)) ? str.substring(st, len) : str;
   }


}
