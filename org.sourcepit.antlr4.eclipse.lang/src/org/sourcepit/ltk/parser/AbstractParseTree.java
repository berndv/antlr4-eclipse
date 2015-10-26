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

package org.sourcepit.ltk.parser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.Token;

public abstract class AbstractParseTree implements ParseTree {
   private final Rule parent;

   private final List<ParseTree> children;

   private final Terminal origin;

   private final List<Object> adapters = new ArrayList<>();

   public AbstractParseTree(Rule parent, List<ParseTree> children, Terminal origin) {
      this.parent = parent;
      this.children = Collections.unmodifiableList(children);
      this.origin = origin;
   }

   @SuppressWarnings("unchecked")
   @Override
   public <A> A getAdapter(Class<A> adapterType) {
      for (Object object : adapters) {
         if (adapterType.isAssignableFrom(object.getClass())) {
            return (A) adapterType;
         }
      }
      return null;
   }

   @Override
   public List<?> getAdapters() {
      return adapters;
   }

   @Override
   public boolean isRoot() {
      return parent == null;
   }

   @Override
   public Rule getParent() {
      return parent;
   }

   @Override
   public List<ParseTree> getChildren() {
      return children;
   }

   public List<ParseTree> getVisibleChildren() {
      final List<ParseTree> visibleChildren = new ArrayList<>();
      for (ParseTree child : getChildren()) {
         if (child.isRule() || ((Terminal) child).getChannel() == Token.DEFAULT_CHANNEL) {
            visibleChildren.add(child);
         }
      }
      return visibleChildren;
   }

   @Override
   public boolean isNestedLanguage() {
      return origin != null;
   }

   @Override
   public Terminal getOrigin() {
      return origin;
   }

}
