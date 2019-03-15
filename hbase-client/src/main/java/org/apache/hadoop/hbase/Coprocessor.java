/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.hadoop.hbase;

import java.io.IOException;

import org.apache.hadoop.hbase.classification.InterfaceAudience;
import org.apache.hadoop.hbase.classification.InterfaceStability;

/**
 * Coprocessor interface.   协处理器接口。
 */
@InterfaceAudience.LimitedPrivate(HBaseInterfaceAudience.COPROC)
@InterfaceStability.Evolving
public interface Coprocessor {
  int VERSION = 1;

  /** Highest installation priority     最高安装优先级*/
  int PRIORITY_HIGHEST = 0;
  /** High (system) installation priority */
  int PRIORITY_SYSTEM = Integer.MAX_VALUE / 4;
  /** Default installation priority for user coprocessors 用户协处理器的默认安装优先级*/
  int PRIORITY_USER = Integer.MAX_VALUE / 2;
  /** Lowest installation priority */
  int PRIORITY_LOWEST = Integer.MAX_VALUE;

  /**
   * Lifecycle state of a given coprocessor instance.   给定协处理器实例的生命周期状态
   */
  enum State {
    UNINSTALLED,
    INSTALLED,
    STARTING,
    ACTIVE,
    STOPPING,
    STOPPED
  }

  // Interface
  void start(CoprocessorEnvironment env) throws IOException;

  void stop(CoprocessorEnvironment env) throws IOException;

}
