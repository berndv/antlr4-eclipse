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

import org.antlr.v4.runtime.RecognitionException;
import org.junit.Test;
import org.sourcepit.antlr4.eclipse.lang.AntlrHarness;
import org.sourcepit.antlr4.eclipse.lang.AntlrHarness.ParseRes;

public class FormatterTest {

   private final RendererSelector selector = new ANTLRv4RendererSelector();

   @Test
   public void test() throws RecognitionException, IOException {

      String grammar = "grammar Foo; foo: FOO; Foo: \"Bar\";";

      ParseRes res = AntlrHarness.parse(grammar);

      StringWriter appendable = new StringWriter();
      new Formatter(selector).format(80, res.tree, res.tokenStream, appendable);
      System.out.println(appendable);

   }

   @Test
   public void test2() throws RecognitionException, IOException {

      String grammar = "grammar Foo; foo: ( a | b | c | d);";

      ParseRes res = AntlrHarness.parse(grammar);

      StringWriter appendable = new StringWriter();
      new Formatter(selector).format(4, res.tree, res.tokenStream, appendable);
      System.out.println(appendable);

   }

   @Test
   public void testHidden() throws Exception {
      String grammar = "/* Hallo */ grammar Foo;";
      ParseRes res = AntlrHarness.parse(grammar);
      StringWriter appendable = new StringWriter();
      new Formatter(selector).format(4, res.tree, res.tokenStream, appendable);
      System.out.println(appendable);
   }

}
