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

import static org.sourcepit.antlr4.eclipse.lang.ParseNodeUtils.isRuleOfType;

import org.sourcepit.antlr4.eclipse.lang.CommentParser.BlockCommentContext;
import org.sourcepit.ltk.parser.ParseNode;

public class CommentRendererFactory implements RendererFactory {

   @Override
   public boolean isPartiallyRendered(ParseNode node) {
      return !isRuleOfType(node, BlockCommentContext.class);
   }


   @Override
   public Renderer createIndentationRenderer(ParseNode node) {
      return null;
   }

   @Override
   public Renderer createPreRenderer(ParseNode node) {
      return null;
   }

   @Override
   public Renderer createMainRenderer(ParseNode node) {
      if (isRuleOfType(node, BlockCommentContext.class)) {
         return new BlockCommentRenderer();
      }
      return null;
   }

   @Override
   public Renderer createPostRenderer(ParseNode node) {
      return null;
   }
}