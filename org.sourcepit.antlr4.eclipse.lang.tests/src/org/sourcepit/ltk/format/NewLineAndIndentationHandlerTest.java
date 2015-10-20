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

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;

import org.junit.Test;

public class NewLineAndIndentationHandlerTest {

   @Test
   public void testNlIsIllegalInNlListener() throws Exception {
      final StringWriter out = new StringWriter();
      final NewLineAndIndentationHandler lca = new NewLineAndIndentationHandler(out, true);
      lca.addIndentation(new Indentation() {
         @Override
         public void indent(Appendable out) throws IOException {
            out.append('\n');
         }
      });

      try {
         lca.append("Foo\nBar");
         fail();
      }
      catch (IllegalStateException e) {
      }
      lca.close();
   }

   @Test
   public void testEmpty() throws Exception {
      final StringWriter out = new StringWriter();
      final NewLineAndIndentationHandler lca = new NewLineAndIndentationHandler(out, true);
      lca.close();
      assertEquals("", out.toString());
   }

   @Test
   public void testKeepIndentationOnEmptyLines() throws IOException {
      StringWriter out = new StringWriter();

      final NewLineAndIndentationHandler lca = new NewLineAndIndentationHandler(out, true);

      lca.addIndentation(new Indentation() {
         @Override
         public void indent(Appendable out) throws IOException {
            lca.append("    ");
         }
      });
      lca.append("Hallo \n \nwie gehts?");
      lca.close();

      assertEquals("Hallo\n    \n    wie gehts?", out.toString());
   }

   @Test
   public void testKillIndentationOnEmptyLines() throws IOException {
      final StringWriter out = new StringWriter();
      final NewLineAndIndentationHandler lca = new NewLineAndIndentationHandler(out, false);

      lca.addIndentation(new Indentation() {
         @Override
         public void indent(Appendable out) throws IOException {
            out.append("    ");
         }
      });
      lca.append("Hallo \n \nwie gehts?");
      lca.close();

      assertEquals("Hallo\n\n    wie gehts?", out.toString());
   }

   @Test
   public void testPrevNewLines() throws Exception {
      final StringWriter out = new StringWriter();
      final NewLineAndIndentationHandler lca = new NewLineAndIndentationHandler(out, false);

      assertEquals(1, lca.getCurrentLineNumber());
      assertEquals(1, lca.getPrevNewLines()); // we expect to start on a nl
      assertEquals(true, lca.isNewLine());

      lca.append('\n');

      assertEquals(2, lca.getCurrentLineNumber());
      assertEquals(2, lca.getPrevNewLines());
      assertEquals(true, lca.isNewLine());

      lca.append('\n');

      assertEquals(3, lca.getCurrentLineNumber());
      assertEquals(3, lca.getPrevNewLines());
      assertEquals(true, lca.isNewLine());

      lca.append(' ');

      assertEquals(3, lca.getCurrentLineNumber());
      assertEquals(0, lca.getPrevNewLines());
      assertEquals(false, lca.isNewLine());

      lca.append(" \n ");

      assertEquals(4, lca.getCurrentLineNumber());
      assertEquals(0, lca.getPrevNewLines());
      assertEquals(false, lca.isNewLine());

      lca.close();
   }

}
