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

package org.sourcepit.antlr4.eclipse.lang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;

public final class TokenUtils {
   private TokenUtils() {
      super();
   }

   public static List<Token> getHiddenTokensToRight(BufferedTokenStream ts, int idx) {
      if (idx == -1) {
         final List<Token> res = new ArrayList<>();
         for (int i = 0; i < ts.size(); i++) {
            final Token t = ts.get(i);
            if (t.getChannel() == Token.DEFAULT_CHANNEL) {
               break;
            }
            res.add(t);
         }
         return res;
      }
      else {
         final List<Token> res = ts.getHiddenTokensToRight(idx);
         return res == null ? Collections.<Token> emptyList() : res;
      }
   }
}
