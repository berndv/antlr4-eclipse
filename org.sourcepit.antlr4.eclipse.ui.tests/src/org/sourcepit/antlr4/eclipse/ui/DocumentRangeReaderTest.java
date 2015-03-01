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

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.junit.Test;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class DocumentRangeReaderTest {

   @Test
   @SuppressWarnings("resource")
   public void testReadComplete() throws BadLocationException {

      IDocument document = mock(IDocument.class);
      when(document.getChar(0)).thenReturn('1');
      when(document.getChar(1)).thenReturn('2');
      when(document.getLength()).thenReturn(2);

      DocumentRangeReader r = new DocumentRangeReader(document, 0, 2);

      assertEquals('1', (char) r.read());
      assertEquals('2', (char) r.read());
      assertEquals(-1, r.read());
   }

   @Test
   @SuppressWarnings("resource")
   public void testReadRange() throws BadLocationException {

      IDocument document = mock(IDocument.class);
      when(document.getChar(0)).thenReturn('1');
      when(document.getChar(1)).thenReturn('2');
      when(document.getChar(2)).thenReturn('3');
      when(document.getChar(3)).thenReturn('4');
      when(document.getLength()).thenReturn(4);

      DocumentRangeReader r = new DocumentRangeReader(document, 1, 2);

      assertEquals('2', (char) r.read());
      assertEquals('3', (char) r.read());
      assertEquals(-1, r.read());
   }

   @Test
   @SuppressWarnings("resource")
   public void testBufferedReadComplete() throws BadLocationException, IOException {

      IDocument document = mock(IDocument.class);
      when(document.getChar(0)).thenReturn('1');
      when(document.getChar(1)).thenReturn('2');
      when(document.getLength()).thenReturn(2);

      DocumentRangeReader r = new DocumentRangeReader(document, 0, 2);

      char[] cbuf = new char[4];
      int len = r.read(cbuf, 0, 4);

      assertEquals(2, len);
      assertEquals('1', cbuf[0]);
      assertEquals('2', cbuf[1]);

      assertEquals(-1, r.read());
   }

   @Test
   @SuppressWarnings("resource")
   public void testBufferedReadRange() throws BadLocationException, IOException {

      IDocument document = mock(IDocument.class);
      when(document.getChar(0)).thenReturn('1');
      when(document.getChar(1)).thenReturn('2');
      when(document.getChar(2)).thenReturn('3');
      when(document.getChar(3)).thenReturn('4');
      when(document.getLength()).thenReturn(4);

      DocumentRangeReader r = new DocumentRangeReader(document, 1, 2);

      char[] cbuf = new char[4];
      int len = r.read(cbuf, 0, 4);

      assertEquals(2, len);
      assertEquals('2', cbuf[0]);
      assertEquals('3', cbuf[1]);

      assertEquals(-1, r.read());
   }
}
