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

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.StringWriter;

import org.junit.Test;

public class EOLNormalizerTest {

   @Test
   public void testLF() throws IOException {
      EOL eol = EOL.LF;

      StringWriter actual = new StringWriter();

      EOLNormalizer normalizer = new EOLNormalizer(actual, eol);
      normalizer.append("hal\r\nlo");

      assertEquals("hal\nlo", actual.toString());

      actual = new StringWriter();
      normalizer = new EOLNormalizer(actual, eol);
      normalizer.append("\r\n\r\n\r\n\r\n");
      assertEquals("\n\n\n\n", actual.toString());

      actual = new StringWriter();
      normalizer = new EOLNormalizer(actual, eol);
      normalizer.append("\r\r\r\r");
      assertEquals("\n\n\n\n", actual.toString());

      actual = new StringWriter();
      normalizer = new EOLNormalizer(actual, eol);
      normalizer.append("\n\n\n\n");
      assertEquals("\n\n\n\n", actual.toString());
   }

   @Test
   public void testCRLF() throws IOException {
      EOL eol = EOL.CRLF;

      StringWriter actual = new StringWriter();

      EOLNormalizer normalizer = new EOLNormalizer(actual, eol);
      normalizer.append("hal\r\nlo");

      assertEquals("hal\r\nlo", actual.toString());

      actual = new StringWriter();
      normalizer = new EOLNormalizer(actual, eol);
      normalizer.append("\r\n\r\n\r\n\r\n");
      assertEquals("\r\n\r\n\r\n\r\n", actual.toString());

      actual = new StringWriter();
      normalizer = new EOLNormalizer(actual, eol);
      normalizer.append("\r\r\r\r");
      assertEquals("\r\n\r\n\r\n\r\n", actual.toString());

      actual = new StringWriter();
      normalizer = new EOLNormalizer(actual, eol);
      normalizer.append("\n\n\n\n");
      assertEquals("\r\n\r\n\r\n\r\n", actual.toString());
   }

   @Test
   public void testCR() throws IOException {
      EOL eol = EOL.CR;

      StringWriter actual = new StringWriter();

      EOLNormalizer normalizer = new EOLNormalizer(actual, eol);
      normalizer.append("hal\r\nlo");

      assertEquals("hal\rlo", actual.toString());

      actual = new StringWriter();
      normalizer = new EOLNormalizer(actual, eol);
      normalizer.append("\r\n\r\n\r\n\r\n");
      assertEquals("\r\r\r\r", actual.toString());

      actual = new StringWriter();
      normalizer = new EOLNormalizer(actual, eol);
      normalizer.append("\r\r\r\r");
      assertEquals("\r\r\r\r", actual.toString());

      actual = new StringWriter();
      normalizer = new EOLNormalizer(actual, eol);
      normalizer.append("\n\n\n\n");
      assertEquals("\r\r\r\r", actual.toString());
   }

}
