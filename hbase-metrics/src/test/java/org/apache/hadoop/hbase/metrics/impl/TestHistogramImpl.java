/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.apache.hadoop.hbase.metrics.impl;

import static org.junit.Assert.assertEquals;


import org.apache.hadoop.hbase.metrics.Snapshot;
import org.apache.hadoop.hbase.testclassification.SmallTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Test case for {@link HistogramImpl}
 */
@Category(SmallTests.class)
public class TestHistogramImpl {

  @Test
  public void testUpdate() {
    HistogramImpl histogram = new HistogramImpl();

    assertEquals(0, histogram.getCount());

    histogram.update(0);
    assertEquals(1, histogram.getCount());

    histogram.update(10);
    assertEquals(2, histogram.getCount());

    histogram.update(20);
    histogram.update(30);

    assertEquals(4, histogram.getCount());
  }

  @Test
  public void testSnapshot() {
    HistogramImpl histogram = new HistogramImpl();
    for (int i = 0; i < 100; i++) {
      histogram.update(i);
    }

    Snapshot snapshot = histogram.snapshot();

    assertEquals(100, snapshot.getCount());
    assertEquals(50, snapshot.getMedian());
    assertEquals(49, snapshot.getMean());
    assertEquals(0, snapshot.getMin());
    assertEquals(99, snapshot.getMax());
    assertEquals(25, snapshot.get25thPercentile());
    assertEquals(75, snapshot.get75thPercentile());
    assertEquals(90, snapshot.get90thPercentile());
    assertEquals(95, snapshot.get95thPercentile());
    assertEquals(98, snapshot.get98thPercentile());
    assertEquals(99, snapshot.get99thPercentile());
    assertEquals(99, snapshot.get999thPercentile());

    assertEquals(51, snapshot.getCountAtOrBelow(50));

    // check that histogram is reset.
    assertEquals(100, histogram.getCount()); // count does not reset

    // put more data after reset
    for (int i = 100; i < 200; i++) {
      histogram.update(i);
    }

    assertEquals(200, histogram.getCount());

    snapshot = histogram.snapshot();
    assertEquals(100, snapshot.getCount()); // only 100 more events
    assertEquals(150, snapshot.getMedian());
    assertEquals(149, snapshot.getMean());
    assertEquals(100, snapshot.getMin());
    assertEquals(199, snapshot.getMax());
    assertEquals(125, snapshot.get25thPercentile());
    assertEquals(175, snapshot.get75thPercentile());
    assertEquals(190, snapshot.get90thPercentile());
    assertEquals(195, snapshot.get95thPercentile());
    assertEquals(198, snapshot.get98thPercentile());
    assertEquals(199, snapshot.get99thPercentile());
    assertEquals(199, snapshot.get999thPercentile());
  }
}
