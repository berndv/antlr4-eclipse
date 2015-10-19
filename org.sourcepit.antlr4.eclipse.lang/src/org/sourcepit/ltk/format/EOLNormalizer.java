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

import java.io.IOException;

public class EOLNormalizer extends AbstractAppendable implements Appendable {
   private final Appendable out;

   private final char[] eol;

   public EOLNormalizer(Appendable out, EOL eol) {
      this.out = out;
      this.eol = eol.asChars();
   }

   private boolean skipNextLF = false;

   @Override
   public EOLNormalizer append(char c) throws IOException {
      if (skipNextLF && c == '\n') {
         skipNextLF = false;
      }
      else {
         skipNextLF = c == '\r';
         if (c == '\n' || c == '\r') {
            for (int i = 0; i < eol.length; i++) {
               out.append(eol[i]);
            }
         }
         else {
            out.append(c);
         }
      }
      return this;
   }
}
