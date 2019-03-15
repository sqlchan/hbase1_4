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
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase;

import org.apache.hadoop.hbase.classification.InterfaceAudience;
import org.apache.hadoop.hbase.classification.InterfaceStability;

/**
 * Ways to keep cells marked for delete around.
 * 保持单元格标记为“删除”的方法
 */
/*
 * Don't change the TRUE/FALSE labels below, these have to be called
 * this way for backwards compatibility.
 * 不要更改下面的TRUE/FALSE标签，为了向后兼容，必须这样调用它们。
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public enum KeepDeletedCells {
  /** Deleted Cells are not retained.   删除的单元格不会保留*/
  FALSE,
  /**
   * Deleted Cells are retained until they are removed by other means
   * such TTL or VERSIONS.
   * If no TTL is specified or no new versions of delete cells are
   * written, they are retained forever.
   * 被删除的单元格将被保留，直到通过其他方法(如TTL或版本)删除它们为止。
   * 如果没有指定TTL或没有编写删除单元格的新版本，它们将永远保留
   */
  TRUE,
  /**
   * Deleted Cells are retained until the delete marker expires due to TTL.
   * This is useful when TTL is combined with MIN_VERSIONS and one
   * wants to keep a minimum number of versions around but at the same
   * time remove deleted cells after the TTL.
   * 被删除的单元格将保留到删除标记由于TTL而过期为止。当TTL与MIN_VERSIONS组合在一起时，
   * 如果希望保留最少的版本数，但同时删除TTL之后删除的单元格，那么这是非常有用的
   */
  TTL;
}
