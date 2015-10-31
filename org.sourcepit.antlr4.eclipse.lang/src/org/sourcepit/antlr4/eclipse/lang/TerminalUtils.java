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

import org.sourcepit.ltk.parser.Terminal;
import org.sourcepit.ltk.parser.TokenUtils;

public final class TerminalUtils {
   private TerminalUtils() {
      super();
   }

   public static String getPreviousWs(Terminal terminal) {
      final StringBuilder ws = new StringBuilder();
      addPreviousWs(terminal, ws);
      return ws.toString();
   }

   private static void addPreviousWs(Terminal terminal, StringBuilder ws) {
      Terminal prev = terminal.getPrevious();
      if (prev != null && isWs(prev)) {
         addPreviousWs(prev, ws);
         ws.append(prev.getToken().getText());
      }
   }

   public static boolean isWs(Terminal prev) {
      return TokenUtils.isWs(prev.getToken());
   }
}
