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

package org.sourcepit.antlr4.astpath;
public class Segment {
   private String name;
   private Index index;

   private Segment next;

   public String getName() {
      return name;
   }

   public void setName(String segmentName) {
      this.name = segmentName;
   }

   public Index getIndex() {
      return index;
   }

   public void setIndex(Index index) {
      this.index = index;
   }

   public Segment getNext() {
      return next;
   }

   public void setNext(Segment next) {
      this.next = next;
   }

   @Override
   public String toString() {
      final StringBuilder builder = new StringBuilder();
      builder.append("Segment [name=");
      builder.append(name);
      builder.append(", index=");
      builder.append(index);
      builder.append(", next=");
      builder.append(next);
      builder.append("]");
      return builder.toString();
   }


}
