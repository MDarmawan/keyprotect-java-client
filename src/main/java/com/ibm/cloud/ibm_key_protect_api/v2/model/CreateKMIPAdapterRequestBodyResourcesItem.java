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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * CreateKMIPAdapterRequestBodyResourcesItem.
 */
public class CreateKMIPAdapterRequestBodyResourcesItem extends GenericModel {

  /**
   * The profile of KMIP adapter to be created.
   */
  public interface Profile {
    /** native_1.0. */
    String NATIVE_1_0 = "native_1.0";
  }

  protected String name;
  protected String description;
  protected String profile;
  @SerializedName("profile_data")
  protected KMIPProfileDataBody profileData;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private String profile;
    private KMIPProfileDataBody profileData;

    /**
     * Instantiates a new Builder from an existing CreateKMIPAdapterRequestBodyResourcesItem instance.
     *
     * @param createKmipAdapterRequestBodyResourcesItem the instance to initialize the Builder with
     */
    private Builder(CreateKMIPAdapterRequestBodyResourcesItem createKmipAdapterRequestBodyResourcesItem) {
      this.name = createKmipAdapterRequestBodyResourcesItem.name;
      this.description = createKmipAdapterRequestBodyResourcesItem.description;
      this.profile = createKmipAdapterRequestBodyResourcesItem.profile;
      this.profileData = createKmipAdapterRequestBodyResourcesItem.profileData;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateKMIPAdapterRequestBodyResourcesItem.
     *
     * @return the new CreateKMIPAdapterRequestBodyResourcesItem instance
     */
    public CreateKMIPAdapterRequestBodyResourcesItem build() {
      return new CreateKMIPAdapterRequestBodyResourcesItem(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateKMIPAdapterRequestBodyResourcesItem builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateKMIPAdapterRequestBodyResourcesItem builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the CreateKMIPAdapterRequestBodyResourcesItem builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the profileData.
     *
     * @param profileData the profileData
     * @return the CreateKMIPAdapterRequestBodyResourcesItem builder
     */
    public Builder profileData(KMIPProfileDataBody profileData) {
      this.profileData = profileData;
      return this;
    }
  }

  protected CreateKMIPAdapterRequestBodyResourcesItem() { }

  protected CreateKMIPAdapterRequestBodyResourcesItem(Builder builder) {
    name = builder.name;
    description = builder.description;
    profile = builder.profile;
    profileData = builder.profileData;
  }

  /**
   * New builder.
   *
   * @return a CreateKMIPAdapterRequestBodyResourcesItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * A human-readable name of the KMIP adapter unique within the kms instance. If one is not specified, one will be
   * autogenerated of the format `kmip_adapter_&lt;timestamp&gt;_&lt;random_string&gt;`. To protect your privacy do not
   * use personal data, such as your name or location, as a name for your KMIP adapter. The name must be  alphanumeric
   * and cannot contain spaces or special characters other than `-` or `_`. The name cannot be a UUID and must not be a
   * Key Protect reserved name: `allowed_ip`, `certificate`, `certificates`,`key`,`keys`, `metadata`, `policy`,
   * `policies`, `registration`, `registrations`, `ring`, `rings`, `rotate`, `wrap`, `unwrap`, `rewrap`, `version`,
   * `versions`.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * The optional description of the KMIP adapter. The maximum length is 240 characters. To protect your privacy, do not
   * use personal data, such as your name or location, as a description for your KMIP adapter.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the profile.
   *
   * The profile of KMIP adapter to be created.
   *
   * @return the profile
   */
  public String profile() {
    return profile;
  }

  /**
   * Gets the profileData.
   *
   * The data specific to the KMIP Adapter profile. This is a required field for type `native_1.0`.
   *
   * @return the profileData
   */
  public KMIPProfileDataBody profileData() {
    return profileData;
  }
}
