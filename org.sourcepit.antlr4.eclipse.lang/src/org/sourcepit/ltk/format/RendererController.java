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

import java.util.Stack;

import org.sourcepit.ltk.parser.ParseNode;

public class RendererController {

   private final Stack<Context> context = new Stack<>();

   private final RendererFactory factory;

   public RendererController(RendererFactory factory) {
      this.factory = factory;
   }

   private static class Context {
      public Renderer indent;
      public Renderer pre;
      public Renderer main;
      public Renderer post;
   }

   public boolean enter(ParseNode node) {
      final Context ctx = new Context();
      ctx.indent = factory.createIndentationRenderer(node);
      ctx.pre = factory.createPreRenderer(node);
      ctx.main = factory.createMainRenderer(node);
      ctx.post = factory.createPostRenderer(node);
      context.push(ctx);
      return factory.isPartiallyRendered(node);
   }

   public Renderer getIndentationRenderer(ParseNode node) {
      return context.peek().indent;
   }

   public Renderer getPreRenderer(ParseNode node) {
      return context.peek().pre;
   }

   public Renderer getMainRenderer(ParseNode node) {
      return context.peek().main;
   }

   public Renderer getPostRenderer(ParseNode node) {
      return context.peek().post;
   }

   public void leave(ParseNode node) {
      context.pop();
   }
}