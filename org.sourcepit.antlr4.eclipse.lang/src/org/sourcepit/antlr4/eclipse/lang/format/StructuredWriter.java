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

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class StructuredWriter {

   private final Stack<Object> stack = new Stack<>();

   private List<Object> contents = new ArrayList<>();

   private Object getCurrent() {
      return stack.isEmpty() ? null : stack.peek();
   }

   public void startBlock(ParserRuleContext ctx) {
      endSpans();
      final Block block = new Block(ctx);
      stack.push(block);
      startBlockHeader(block);
   }

   private void startBlockHeader(Block block) {
      stack.push(new BlockHeader(block));
   }

   private void endBlockHeader() {
      final BlockHeader blockHeader = (BlockHeader) stack.pop();
      final Block block = (Block) stack.peek();
      block.header = blockHeader.getSpanables().isEmpty() ? null : blockHeader;
   }

   public void startBlockConent(ParserRuleContext ctx) {
      endSpans();
      endBlockHeader();
      stack.push(new BlockBody(ctx));
   }

   public void endBlockConent(ParserRuleContext ctx) {
      final BlockBody blockContent = (BlockBody) stack.pop();
      final Block block = (Block) stack.peek();
      block.body = blockContent.getBlockables().isEmpty() ? null : blockContent;
      startBlockFooter(block);
   }

   private void startBlockFooter(Block block) {
      stack.push(new BlockFooter(block));
   }

   private void endBlockFooter() {
      final BlockFooter blockFooter = (BlockFooter) stack.pop();
      final Block block = (Block) stack.peek();
      block.footer = blockFooter.getSpanables().isEmpty() ? null : blockFooter;
   }

   public void endBlock(ParserRuleContext ctx) {
      if (stack.peek() instanceof BlockHeader) { // empty block
         endBlockHeader();
      }
      else {
         endBlockFooter();
      }
      final Block block = (Block) stack.pop();
      if (block.header == null && block.footer == null && block.body == null) {
         return;
      }

      final Object parent = getCurrent();
      if (parent instanceof BlockBody) {
         ((BlockBody) parent).getBlockables().add(block);
      }
      else if (parent == null) {
         contents.add(block);
      }
      else {
         throw new IllegalStateException();
      }
   }

   public void startSpan(ParserRuleContext ctx) {
      stack.push(new Span(ctx));
   }

   public void endSpan(ParserRuleContext ctx) {
      if (getCurrent() instanceof Span) {
         endSpan((Span) stack.pop());
      }
   }

   private void endSpans() {
      Object oSpan = getCurrent();
      while (oSpan instanceof Span) {
         endSpan((Span) stack.pop());
         oSpan = getCurrent();
      }
   }

   private void endSpan(final Span span) {
      if (span.getSpanables().isEmpty()) {
         return;
      }
      final Object parent = getCurrent();
      if (parent == null) {
         contents.add(span);
      }
      else if (parent instanceof BlockBody) {
         ((BlockBody) parent).getBlockables().add(span);
      }
      else if (parent instanceof BlockHeader) {
         ((BlockHeader) parent).getSpanables().add(span);
      }
      else if (parent instanceof BlockFooter) {
         ((BlockFooter) parent).getSpanables().add(span);
      }
      else if (parent instanceof Span) {
         ((Span) parent).getSpanables().add(span);
      }
      else {
         throw new IllegalStateException();
      }
   }

   public void write(TerminalNode node) {
      final Object current = getCurrent();
      if (current instanceof Span) {
         ((Span) current).getSpanables().add(new Literal(node));
      }
      else if (current instanceof BlockHeader) {
         ((BlockHeader) current).getSpanables().add(new Literal(node));
      }
      else if (current instanceof BlockFooter) {
         ((BlockFooter) current).getSpanables().add(new Literal(node));
      }
      else if (current == null) {
         contents.add(new Literal(node));
      }
      else {
         throw new IllegalStateException();
      }

   }

   /**
    * @author Bernd Vogt <bernd.vogt@sourcepit.org>
    */
   public interface Blockable {
   }

   /**
    * @author Bernd Vogt <bernd.vogt@sourcepit.org>
    */
   public interface Spanable {
   }

   /**
    * @author Bernd Vogt <bernd.vogt@sourcepit.org>
    */
   public abstract static class AbstractFormatable {
      private final ParserRuleContext rule;

      public AbstractFormatable(ParserRuleContext rule) {
         this.rule = rule;
      }

      public ParserRuleContext getRule() {
         return rule;
      }

   }

   /**
    * @author Bernd Vogt <bernd.vogt@sourcepit.org>
    */
   public static class Block extends AbstractFormatable implements Blockable {

      private BlockFooter footer;

      private BlockHeader header;

      private BlockBody body;

      public Block(ParserRuleContext rule) {
         super(rule);
      }

      public BlockHeader getHeader() {
         return header;
      }

      public void setHeader(BlockHeader header) {
         this.header = header;
      }

      public BlockBody getBody() {
         return body;
      }

      public void setContent(BlockBody body) {
         this.body = body;
      }

      public BlockFooter getFooter() {
         return footer;
      }

      public void setFooter(BlockFooter footer) {
         this.footer = footer;
      }

      @Override
      public String toString() {
         final StringBuilder str = new StringBuilder();
         if (header != null) {
            str.append(header);
            str.append(" ");
         }
         if (body != null) {
            str.append(body);
            str.append(" ");
         }
         if (footer != null) {
            str.append(footer);
         }
         return str.toString();
      }
   }

   /**
    * @author Bernd Vogt <bernd.vogt@sourcepit.org>
    */
   public static class BlockHeader {
      private final Block block;
      private final List<Spanable> spanables = new ArrayList<>();

      public BlockHeader(Block block) {
         this.block = block;
      }

      public Block getBlock() {
         return block;
      }

      public List<Spanable> getSpanables() {
         return spanables;
      }

      @Override
      public String toString() {
         final StringBuilder str = new StringBuilder();
         if (spanables != null) {
            str.append(spanables);
         }
         return str.toString();
      }
   }

   /**
    * @author Bernd Vogt <bernd.vogt@sourcepit.org>
    */
   public static class BlockBody extends AbstractFormatable {

      private final List<Blockable> blockables = new ArrayList<>();

      public BlockBody(ParserRuleContext rule) {
         super(rule);
      }

      public List<Blockable> getBlockables() {
         return blockables;
      }

      @Override
      public String toString() {
         final StringBuilder str = new StringBuilder();
         if (blockables != null) {
            str.append(blockables);
         }
         return str.toString();
      }
   }

   /**
    * @author Bernd Vogt <bernd.vogt@sourcepit.org>
    */
   public static class BlockFooter {
      private final Block block;
      private final List<Spanable> literals = new ArrayList<>();

      public BlockFooter(Block block) {
         this.block = block;
      }

      public Block getBlock() {
         return block;
      }

      public List<Spanable> getSpanables() {
         return literals;
      }

      @Override
      public String toString() {
         final StringBuilder str = new StringBuilder();
         if (literals != null) {
            str.append(literals);
         }
         return str.toString();
      }
   }

   /**
    * @author Bernd Vogt <bernd.vogt@sourcepit.org>
    */
   public static class Span extends AbstractFormatable implements Blockable, Spanable {
      private final List<Spanable> literals = new ArrayList<>();

      public Span(ParserRuleContext rule) {
         super(rule);
      }

      public List<Spanable> getSpanables() {
         return literals;
      }

      @Override
      public String toString() {
         final StringBuilder str = new StringBuilder();
         if (literals != null) {
            str.append(literals);
         }
         return str.toString();
      }
   }

   /**
    * @author Bernd Vogt <bernd.vogt@sourcepit.org>
    */
   public static class Literal implements Spanable {
      private final TerminalNode terminalNode;

      public Literal(TerminalNode terminalNode) {
         this.terminalNode = terminalNode;
      }

      public TerminalNode getTerminalNode() {
         return terminalNode;
      }

      @Override
      public String toString() {
         return terminalNode.toString();
      }
   }
}
