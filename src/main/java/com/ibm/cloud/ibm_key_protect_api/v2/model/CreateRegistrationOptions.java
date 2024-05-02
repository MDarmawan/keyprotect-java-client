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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createRegistration options.
 */
public class CreateRegistrationOptions extends GenericModel {

  protected String id;
  protected String urlEncodedResourceCrn;
  protected String bluemixInstance;
  protected CollectionMetadata metadata;
  protected List<CreateRegistrationResourceBody> resources;
  protected String correlationId;
  protected String xKmsKeyRing;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String urlEncodedResourceCrn;
    private String bluemixInstance;
    private CollectionMetadata metadata;
    private List<CreateRegistrationResourceBody> resources;
    private String correlationId;
    private String xKmsKeyRing;

    /**
     * Instantiates a new Builder from an existing CreateRegistrationOptions instance.
     *
     * @param createRegistrationOptions the instance to initialize the Builder with
     */
    private Builder(CreateRegistrationOptions createRegistrationOptions) {
      this.id = createRegistrationOptions.id;
      this.urlEncodedResourceCrn = createRegistrationOptions.urlEncodedResourceCrn;
      this.bluemixInstance = createRegistrationOptions.bluemixInstance;
      this.metadata = createRegistrationOptions.metadata;
      this.resources = createRegistrationOptions.resources;
      this.correlationId = createRegistrationOptions.correlationId;
      this.xKmsKeyRing = createRegistrationOptions.xKmsKeyRing;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param urlEncodedResourceCrn the urlEncodedResourceCrn
     * @param bluemixInstance the bluemixInstance
     */
    public Builder(String id, String urlEncodedResourceCrn, String bluemixInstance) {
      this.id = id;
      this.urlEncodedResourceCrn = urlEncodedResourceCrn;
      this.bluemixInstance = bluemixInstance;
    }

    /**
     * Builds a CreateRegistrationOptions.
     *
     * @return the new CreateRegistrationOptions instance
     */
    public CreateRegistrationOptions build() {
      return new CreateRegistrationOptions(this);
    }

    /**
     * Adds an resources to resources.
     *
     * @param resources the new resources
     * @return the CreateRegistrationOptions builder
     */
    public Builder addResources(CreateRegistrationResourceBody resources) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(resources,
        "resources cannot be null");
      if (this.resources == null) {
        this.resources = new ArrayList<CreateRegistrationResourceBody>();
      }
      this.resources.add(resources);
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateRegistrationOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the urlEncodedResourceCrn.
     *
     * @param urlEncodedResourceCrn the urlEncodedResourceCrn
     * @return the CreateRegistrationOptions builder
     */
    public Builder urlEncodedResourceCrn(String urlEncodedResourceCrn) {
      this.urlEncodedResourceCrn = urlEncodedResourceCrn;
      return this;
    }

    /**
     * Set the bluemixInstance.
     *
     * @param bluemixInstance the bluemixInstance
     * @return the CreateRegistrationOptions builder
     */
    public Builder bluemixInstance(String bluemixInstance) {
      this.bluemixInstance = bluemixInstance;
      return this;
    }

    /**
     * Set the metadata.
     *
     * @param metadata the metadata
     * @return the CreateRegistrationOptions builder
     */
    public Builder metadata(CollectionMetadata metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set the resources.
     * Existing resources will be replaced.
     *
     * @param resources the resources
     * @return the CreateRegistrationOptions builder
     */
    public Builder resources(List<CreateRegistrationResourceBody> resources) {
      this.resources = resources;
      return this;
    }

    /**
     * Set the correlationId.
     *
     * @param correlationId the correlationId
     * @return the CreateRegistrationOptions builder
     */
    public Builder correlationId(String correlationId) {
      this.correlationId = correlationId;
      return this;
    }

    /**
     * Set the xKmsKeyRing.
     *
     * @param xKmsKeyRing the xKmsKeyRing
     * @return the CreateRegistrationOptions builder
     */
    public Builder xKmsKeyRing(String xKmsKeyRing) {
      this.xKmsKeyRing = xKmsKeyRing;
      return this;
    }
  }

  protected CreateRegistrationOptions() { }

  protected CreateRegistrationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.urlEncodedResourceCrn,
      "urlEncodedResourceCrn cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bluemixInstance,
      "bluemixInstance cannot be null");
    id = builder.id;
    urlEncodedResourceCrn = builder.urlEncodedResourceCrn;
    bluemixInstance = builder.bluemixInstance;
    metadata = builder.metadata;
    resources = builder.resources;
    correlationId = builder.correlationId;
    xKmsKeyRing = builder.xKmsKeyRing;
  }

  /**
   * New builder.
   *
   * @return a CreateRegistrationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The v4 UUID or alias that uniquely identifies the key.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the urlEncodedResourceCrn.
   *
   * The URL encoded [Cloud Resource Name](/docs/account?topic=account-crn) (CRN) that uniquely identifies the cloud
   * resource. At minimum, provide a CRN that includes the `service-instance` segment.
   *
   * @return the urlEncodedResourceCrn
   */
  public String urlEncodedResourceCrn() {
    return urlEncodedResourceCrn;
  }

  /**
   * Gets the bluemixInstance.
   *
   * The IBM Cloud instance ID that identifies your Key Protect service instance.
   *
   * @return the bluemixInstance
   */
  public String bluemixInstance() {
    return bluemixInstance;
  }

  /**
   * Gets the metadata.
   *
   * The metadata that describes the resource array.
   *
   * @return the metadata
   */
  public CollectionMetadata metadata() {
    return metadata;
  }

  /**
   * Gets the resources.
   *
   * A collection of resources.
   *
   * @return the resources
   */
  public List<CreateRegistrationResourceBody> resources() {
    return resources;
  }

  /**
   * Gets the correlationId.
   *
   * The v4 UUID used to correlate and track transactions.
   *
   * @return the correlationId
   */
  public String correlationId() {
    return correlationId;
  }

  /**
   * Gets the xKmsKeyRing.
   *
   * The ID of the key ring that the specified key is a part of. When the  header is not specified, Key Protect will
   * perform a key ring lookup. For  a more optimized request, specify the key ring on every call. The key ring ID of
   * keys that are created without an `X-Kms-Key-Ring` header is: `default`.
   *
   * @return the xKmsKeyRing
   */
  public String xKmsKeyRing() {
    return xKmsKeyRing;
  }
}
