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
import org.apache.hadoop.hbase.HBaseIOException;

/**
 * This exception is thrown by the master when a region server was shut down and
 * restarted so fast that the master still hasn't processed the server shutdown
 * of the first instance, or when master is initializing and client call admin
 * operations, or when an operation is performed on a region server that is still starting.
 * 这个异常的主人当地区服务器被关闭并重新启动太快,主人还没有处理第一个实例的服务器关闭,
 * 或者当主人是初始化和客户端调用管理操作,或者当一个地区服务器上执行一个操作,仍然是开始。
 */
@SuppressWarnings("serial")
@InterfaceAudience.Public
@InterfaceStability.Stable
public class PleaseHoldException extends HBaseIOException {
  public PleaseHoldException(String message) {
    super(message);
  }

  public PleaseHoldException(String message, Throwable cause) {
    super(message, cause);
  }

  public PleaseHoldException(Throwable cause) {
    super(cause);
  }
}
