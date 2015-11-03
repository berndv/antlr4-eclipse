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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;

public final class ParserUtils {
   private ParserUtils() {
      super();
   }


   @SuppressWarnings("unchecked")
   public static <T extends ParserRuleContext> T parse(final Parser parser, Class<T> ruleType) {
      final StringBuilder sb = new StringBuilder();
      char[] chars = ruleType.getSimpleName().toCharArray();
      for (int i = 0; i < chars.length - "Context".length(); i++) {
         char c = chars[i];
         if (i == 0) {
            sb.append(Character.toLowerCase(c));
         }
         else {
            sb.append(c);
         }
      }

      final Method method;
      try {
         method = parser.getClass().getMethod(sb.toString());
      }
      catch (NoSuchMethodException | SecurityException e) {
         throw new IllegalStateException(e);
      }

      final T parseTree;
      try {
         parseTree = (T) method.invoke(parser);
      }
      catch (IllegalAccessException e) {
         throw new IllegalStateException(e);
      }
      catch (InvocationTargetException e) {
         final Throwable targetException = e.getTargetException();
         if (targetException instanceof RecognitionException) {
            throw (RecognitionException) targetException;
         }
         throw new IllegalStateException(targetException);
      }
      return parseTree;
   }
}
