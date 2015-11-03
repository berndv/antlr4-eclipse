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

import static java.lang.Character.isWhitespace;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NewLineAndIndentationHandler extends AbstractAppendable
   implements
      Appendable,
      Closeable,
      LineCounter,
      IndentationHandler {

   private final StringBuilder buff = new StringBuilder();

   private final List<Indentation> indentations = new ArrayList<>();

   private final Appendable out;

   private final boolean keepIndentationOnEmptyLines;

   private int prevNewLines = 1;

   private int currentLineNumber = 1;

   private char currentChar;

   private int flushStartIdx = 0;

   private int lastCharOnLine = 0;

   private boolean declineNL;

   public NewLineAndIndentationHandler(Appendable out, boolean keepIndentationOnEmptyLines) {
      this.out = out;
      this.keepIndentationOnEmptyLines = keepIndentationOnEmptyLines;
   }

   public void addIndentation(Indentation indentation) {
      indentations.add(indentation);
   }

   public void removeIndentation(Indentation indentation) {
      indentations.remove(indentation);
   }

   @Override
   public int getCurrentLineNumber() {
      return currentLineNumber;
   }

   @Override
   public int getPrevNewLines() {
      return prevNewLines;
   }

   @Override
   public boolean isNewLine() {
      return prevNewLines > 0;
   }

   @Override
   public boolean isPrevCharWs() {
      return isNewLine() || isWhitespace(currentChar);
   }

   @Override
   public Appendable append(char c) throws IOException {
      currentChar = c;
      if (c == '\n') {

         if (declineNL) {
            throw new IllegalStateException("NL not allowed while invoking indentations.");
         }

         currentLineNumber++;
         prevNewLines++;

         if (lastCharOnLine + 1 < buff.length()) {
            buff.delete(lastCharOnLine + 1, buff.length());
         }
         buff.append('\n');

         flush();

         lastCharOnLine = buff.length() - 1;

         declineNL = true;
         try {
            for (Indentation indentation : indentations) {
               indentation.indent(this);
            }
         }
         finally {
            declineNL = false;
         }

         if (keepIndentationOnEmptyLines) {
            lastCharOnLine = buff.length() - 1; // mark after ident
         }
      }
      else {
         prevNewLines = 0;
         buff.append(c);

         if (!Character.isWhitespace(c)) {
            lastCharOnLine = buff.length() - 1; // mark last non ws char
         }
      }
      return this;
   }

   @Override
   public void close() throws IOException {
      flush();
   }

   private void flush() throws IOException {
      final char[] dst = new char[buff.length() - flushStartIdx];
      buff.getChars(flushStartIdx, buff.length(), dst, 0);
      for (char d : dst) {
         out.append(d);
      }
      flushStartIdx = buff.length();
   }
}
