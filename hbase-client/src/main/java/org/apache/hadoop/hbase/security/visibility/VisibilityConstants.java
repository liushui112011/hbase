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
package org.apache.hadoop.hbase.security.visibility;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.hbase.NamespaceDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.util.Bytes;

@InterfaceAudience.Private
public final class VisibilityConstants {

  /**
   * The string that is used as key in setting the Operation attributes for visibility labels
   */
  public static final String VISIBILITY_LABELS_ATTR_KEY = "VISIBILITY";

  /** Internal storage table for visibility labels */
  public static final TableName LABELS_TABLE_NAME = TableName.valueOf(
      NamespaceDescriptor.SYSTEM_NAMESPACE_NAME_STR, "labels");

  /** Family for the internal storage table for visibility labels */
  public static final byte[] LABELS_TABLE_FAMILY = Bytes.toBytes("f");

  /** Qualifier for the internal storage table for visibility labels */
  public static final byte[] LABEL_QUALIFIER = new byte[1];

  /**
   * Visibility serialization version format. It indicates the visibility labels
   * are sorted based on ordinal
   **/
  public static final byte VISIBILITY_SERIALIZATION_VERSION = 1;
  /** Byte representation of the visibility_serialization_version **/
  public static final byte[] SORTED_ORDINAL_SERIALIZATION_FORMAT =
      new byte[] { VISIBILITY_SERIALIZATION_VERSION };

  public static final String CHECK_AUTHS_FOR_MUTATION = 
      "hbase.security.visibility.mutations.checkauths";

}
