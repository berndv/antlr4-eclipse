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

package org.sourcepit.ltk.ast;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.StringWriter;

import org.junit.Test;

public class AstBuilderTest {

   @Test
   public void test() throws IOException {
      AstBuilder astBuilder = new AstBuilder(new LittleJParserDelegate());

      AstNode ast = astBuilder.build("package bar\n\n/** Hallo */\nclass Foo{}");
      assertNotNull(ast);

      StringWriter actual = new StringWriter();
      print(0, ast, actual);

      StringBuilder expected = new StringBuilder();
      expected.append("Rule [type=CompilationUnit]\n");
      expected.append("  Rule [type=PackageDeclaration]\n");
      expected.append(
         "    Terminal [type=TerminalType [sourceType=LittleJLexer, tokenType=1], offset=0, length=7, channel=0, token='package']\n");
      expected.append(
         "    Terminal [type=TerminalType [sourceType=LittleJLexer, tokenType=17], offset=7, length=1, channel=17, token=' ']\n");
      expected.append(
         "    Terminal [type=TerminalType [sourceType=LittleJLexer, tokenType=16], offset=8, length=3, channel=0, token='bar']\n");
      expected.append("  Rule [type=ClassDeclaration]\n");
      expected.append(
         "    Terminal [type=TerminalType [sourceType=LittleJLexer, tokenType=17], offset=11, length=2, channel=17, token='\\n\\n']\n");
      expected.append("    Rule [type=Comment, nestedLanguage=true]\n");
      expected.append("      Rule [type=DocComment]\n");
      expected.append(
         "        Terminal [type=TerminalType [sourceType=CommentLexer, tokenType=1], offset=13, length=4, channel=0, token='/** ']\n");
      expected.append("        Rule [type=CommentText]\n");
      expected.append(
         "          Terminal [type=TerminalType [sourceType=CommentLexer, tokenType=6], offset=17, length=5, channel=0, token='Hallo']\n");
      expected.append(
         "        Terminal [type=TerminalType [sourceType=CommentLexer, tokenType=8], offset=22, length=3, channel=0, token=' */']\n");
      expected.append(
         "    Terminal [type=TerminalType [sourceType=LittleJLexer, tokenType=17], offset=25, length=1, channel=17, token='\\n']\n");
      expected.append(
         "    Terminal [type=TerminalType [sourceType=LittleJLexer, tokenType=6], offset=26, length=5, channel=0, token='class']\n");
      expected.append(
         "    Terminal [type=TerminalType [sourceType=LittleJLexer, tokenType=17], offset=31, length=1, channel=17, token=' ']\n");
      expected.append(
         "    Terminal [type=TerminalType [sourceType=LittleJLexer, tokenType=16], offset=32, length=3, channel=0, token='Foo']\n");
      expected.append("    Rule [type=ClassBody]\n");
      expected.append(
         "      Terminal [type=TerminalType [sourceType=LittleJLexer, tokenType=7], offset=35, length=1, channel=0, token='{']\n");
      expected.append(
         "      Terminal [type=TerminalType [sourceType=LittleJLexer, tokenType=8], offset=36, length=1, channel=0, token='}']\n");
      expected.append(
         "  Terminal [type=TerminalType [sourceType=LittleJLexer, tokenType=-1], offset=37, length=5, channel=0, token='<EOF>']\n");

      assertEquals(expected.toString(), actual.toString());
   }

   private static void print(int depth, AstNode ast, Appendable a) throws IOException {
      for (int i = 0; i < depth; i++) {
         a.append("  ");
      }
      a.append(ast.toString());
      a.append("\n");
      for (AstNode child : ast.getChildren()) {
         print(depth + 1, child, a);
      }
   }
}
