/*
 * (C) Copyright IBM Corp. 2024.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.ibm_key_protect_api.v2.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Deprecated.
 */
public class KeyWithPayloadAlgorithmMetadata extends GenericModel {

  /**
   * Deprecated.
   */
  public interface Mode {
    /** CBC_PAD. */
    String CBC_PAD = "CBC_PAD";
    /** Deprecated. */
    String DEPRECATED = "Deprecated";
  }

  protected String bitLength;
  protected String mode;

  protected KeyWithPayloadAlgorithmMetadata() { }

  /**
   * Gets the bitLength.
   *
   * Deprecated.
   *
   * @return the bitLength
   */
  public String getBitLength() {
    return bitLength;
  }

  /**
   * Gets the mode.
   *
   * Deprecated.
   *
   * @return the mode
   */
  public String getMode() {
    return mode;
  }
}

