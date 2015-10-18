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

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTree;

public class ParseTreeIterable implements Iterable<ParseTree> {

   private static class ChildrenIterator implements Iterator<ParseTree> {
      private ParseTree tree;

      private int idx = -1;

      public ChildrenIterator(ParseTree tree) {
         this.tree = tree;
      }

      @Override
      public boolean hasNext() {
         return tree.getChildCount() > idx + 1;
      }

      @Override
      public ParseTree next() {
         idx++;
         return tree.getChild(idx);
      }

      @Override
      public void remove() {
         throw new UnsupportedOperationException();
      }
   }

   private static class ParseTreeIterator implements Iterator<ParseTree> {
      private Stack<Iterator<ParseTree>> stack = new Stack<>();

      public ParseTreeIterator(ParseTree tree) {
         stack.push(Collections.singleton(tree).iterator());
      }

      @Override
      public boolean hasNext() {
         if (stack.isEmpty()) {
            return false;
         }
         Iterator<ParseTree> current = stack.peek();
         while (!current.hasNext()) {
            stack.pop();
            if (stack.isEmpty()) {
               return false;
            }
            current = stack.peek();
         }
         return current.hasNext();
      }

      @Override
      public ParseTree next() {
         if (hasNext()) {
            final ParseTree next = stack.peek().next();
            stack.push(new ChildrenIterator(next));
            return next;
         }
         return null;
      }

      @Override
      public void remove() {
         throw new UnsupportedOperationException();
      }
   }

   private ParseTree tree;


   public ParseTreeIterable(ParseTree tree) {
      this.tree = tree;
   }

   @Override
   public Iterator<ParseTree> iterator() {
      return new ParseTreeIterator(tree);
   }

}
