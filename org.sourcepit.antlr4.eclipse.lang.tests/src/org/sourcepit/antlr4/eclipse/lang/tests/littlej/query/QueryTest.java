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

package org.sourcepit.antlr4.eclipse.lang.tests.littlej.query;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class QueryTest {

   @Test
   public void testQuerySegment() {
      final Query query = Query.parse("/CompilationUnit/ClassBody");
      final List<QuerySegment> segments = query.getSegments();
      assertEquals(2, segments.size());
      assertEquals("CompilationUnit", segments.get(0).getName());
      assertEquals("ClassBody", segments.get(1).getName());
   }

   @Test
   public void testQuerySegmentQuery() {
      final Query query = Query.parse("/hans/foo[@symbol = 'hallo \\'schnucki\\' \\\\hui']/bar");
      final List<QuerySegment> segments = query.getSegments();
      assertEquals(3, segments.size());
      assertEquals("hans", segments.get(0).getName());

      QuerySegment segment = segments.get(1);
      assertEquals("foo", segment.getName());
      QuerySegmentQuery segmentQuery = segment.getExpression();
      assertEquals("symbol", segmentQuery.getType());
      assertEquals("hallo 'schnucki' \\hui", segmentQuery.getExpression());

      assertEquals("bar", segments.get(2).getName());
   }
}
