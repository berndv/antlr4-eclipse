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
import java.util.ArrayList;
import java.util.List;

public class LineCountingAppendable implements Appendable {

   private final Appendable target;

   int line = 0;

   List<NlListener> nlListener = new ArrayList<>();

   public LineCountingAppendable(Appendable target) {
      this.target = target;
   }

   @Override
   public Appendable append(CharSequence csq) throws IOException {
      return append(csq, 0, csq.length());
   }

   @Override
   public Appendable append(CharSequence csq, int start, int end) throws IOException {
      for (int i = start; i < end; i++) {
         append(csq.charAt(i));
      }
      return this;
   }

   boolean nl;

   @Override
   public Appendable append(char c) throws IOException {
      nl = false;
      target.append(c);
      if (c == '\n') {

         nl = true;

         line++;

         for (NlListener nll : nlListener) {
            nll.nl();
         }

      }
      return this;
   }

}