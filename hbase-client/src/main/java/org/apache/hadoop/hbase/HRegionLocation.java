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
import org.apache.hadoop.hbase.util.Addressing;

/**
 * Data structure to hold HRegionInfo and the address for the hosting
 * HRegionServer.  Immutable.  Comparable, but we compare the 'location' only:
 * i.e. the hostname and port, and *not* the regioninfo.  This means two
 * instances are the same if they refer to the same 'location' (the same
 * hostname and port), though they may be carrying different regions.
 * 用于保存HRegionInfo的数据结构和托管HRegionServer的地址。
 * 不可改变的。
 * 可比，但我们只比较“位置”：即主机名和端口，*不是* regioninfo。
 * 这意味着如果它们引用相同的“位置”（相同的主机名和端口），则两个实例是相同的，尽管它们可能携带不同的区域。
 *
 * On a big cluster, each client will have thousands of instances of this object, often
 *  100 000 of them if not million. It's important to keep the object size as small
 *  as possible.
 *  在一个大型集群上，每个客户端将拥有该对象的数千个实例，如果不是百万个，通常会有10万个实例。
 * 保持对象尺寸尽可能小是很重要的
 *
 * <br>This interface has been marked InterfaceAudience.Public in 0.96 and 0.98.
 * 此接口已在0.96和0.98中标记为InterfaceAudience.Public
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public class HRegionLocation implements Comparable<HRegionLocation> {
  private final HRegionInfo regionInfo;
  private final ServerName serverName;
  private final long seqNum;

  public HRegionLocation(HRegionInfo regionInfo, ServerName serverName) {
    this(regionInfo, serverName, HConstants.NO_SEQNUM);
  }

  public HRegionLocation(HRegionInfo regionInfo, ServerName serverName, long seqNum) {
    this.regionInfo = regionInfo;
    this.serverName = serverName;
    this.seqNum = seqNum;
  }

  /**
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "region=" + (this.regionInfo == null ? "null" : this.regionInfo.getRegionNameAsString())
        + ", hostname=" + this.serverName + ", seqNum=" + seqNum;
  }

  /**
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null) {
      return false;
    }
    if (!(o instanceof HRegionLocation)) {
      return false;
    }
    return this.compareTo((HRegionLocation)o) == 0;
  }

  /**
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    if (serverName == null) {
      return System.identityHashCode(this);
    }
    return this.serverName.hashCode();
  }

  /** @return HRegionInfo */
  public HRegionInfo getRegionInfo(){
    return regionInfo;
  }

  public String getHostname() {
    return this.serverName.getHostname();
  }

  public int getPort() {
    return this.serverName.getPort();
  }

  public long getSeqNum() {
    return seqNum;
  }

  /**
   * @return String made of hostname and port formatted as per {@link Addressing#createHostAndPortStr(String, int)}
   */
  public String getHostnamePort() {
    return Addressing.createHostAndPortStr(this.getHostname(), this.getPort());
  }

  public ServerName getServerName() {
    return serverName;
  }

  @Override
  public int compareTo(HRegionLocation o) {
    if (serverName == null) {
      if (o.serverName != null) {
        return 1;
      }
      return 0;
    } else {
      return serverName.compareTo(o.getServerName());
    }
  }
}
