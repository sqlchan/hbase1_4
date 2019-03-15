/**
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

import java.io.IOException;

import org.apache.hadoop.hbase.classification.InterfaceAudience;
import org.apache.hadoop.hbase.classification.InterfaceStability;

/**
 * Returned to the clients when their request was discarded due to server being overloaded.
 * 由于服务器过载而丢弃其请求时返回到客户端。
 * Clients should retry upon receiving it.  客户应在收到后重试。
 */
@SuppressWarnings("serial")
@InterfaceAudience.Public
@InterfaceStability.Evolving
public class CallDroppedException extends IOException {
  public CallDroppedException() {
    super();
  }

  // Absence of this constructor prevents proper unwrapping of
  // remote exception on the client side    缺少此构造函数会阻止在客户端正确展开远程异常
  public CallDroppedException(String message) {
    super(message);
  }
}