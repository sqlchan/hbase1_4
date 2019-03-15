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
import org.apache.hadoop.hbase.exceptions.HBaseException;

/**
 * Thrown by operations requiring coordination state access or manipulation
 * when internal error within coordination engine (or other internal implementation) occurs.
 * 在协调引擎（或其他内部实现）内发生内部错误时，需要协调状态访问或操作的操作引发
 */
@InterfaceAudience.Private
@SuppressWarnings("serial")
public class CoordinatedStateException extends HBaseException {
  public CoordinatedStateException() {
    super();
  }

  public CoordinatedStateException(final String message) {
    super(message);
  }

  public CoordinatedStateException(final String message, final Throwable t) {
    super(message, t);
  }

  public CoordinatedStateException(final Throwable t) {
    super(t);
  }
}
