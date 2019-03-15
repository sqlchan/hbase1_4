/**
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

package org.apache.hadoop.hbase;

import org.apache.hadoop.hbase.classification.InterfaceAudience;
import org.apache.hadoop.hbase.classification.InterfaceStability;

/**
 * Exception thrown when the result needs to be chunked on the server side.
 * It signals that retries should happen right away and not count against the number of
 * retries because some of the multi was a success.
 * 当结果需要在服务器端分块时引发异常。
 * 它表示重试应该立即发生，而不是计算重试的数量，因为其中一些重试是成功的。
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public class MultiActionResultTooLarge extends RetryImmediatelyException {
  public MultiActionResultTooLarge(String s) {
    super(s);
  }
}
