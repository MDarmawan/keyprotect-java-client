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

import com.ibm.cloud.ibm_key_protect_api.v2.model.InstancePolicyKeyCreateImportAccessPolicyDataAttributes;
import com.ibm.cloud.ibm_key_protect_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstancePolicyKeyCreateImportAccessPolicyDataAttributes model.
 */
public class InstancePolicyKeyCreateImportAccessPolicyDataAttributesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstancePolicyKeyCreateImportAccessPolicyDataAttributes() throws Throwable {
    InstancePolicyKeyCreateImportAccessPolicyDataAttributes instancePolicyKeyCreateImportAccessPolicyDataAttributesModel = new InstancePolicyKeyCreateImportAccessPolicyDataAttributes.Builder()
      .createRootKey(true)
      .createStandardKey(true)
      .importRootKey(true)
      .importStandardKey(true)
      .enforceToken(true)
      .build();
    assertEquals(instancePolicyKeyCreateImportAccessPolicyDataAttributesModel.createRootKey(), Boolean.valueOf(true));
    assertEquals(instancePolicyKeyCreateImportAccessPolicyDataAttributesModel.createStandardKey(), Boolean.valueOf(true));
    assertEquals(instancePolicyKeyCreateImportAccessPolicyDataAttributesModel.importRootKey(), Boolean.valueOf(true));
    assertEquals(instancePolicyKeyCreateImportAccessPolicyDataAttributesModel.importStandardKey(), Boolean.valueOf(true));
    assertEquals(instancePolicyKeyCreateImportAccessPolicyDataAttributesModel.enforceToken(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(instancePolicyKeyCreateImportAccessPolicyDataAttributesModel);

    InstancePolicyKeyCreateImportAccessPolicyDataAttributes instancePolicyKeyCreateImportAccessPolicyDataAttributesModelNew = TestUtilities.deserialize(json, InstancePolicyKeyCreateImportAccessPolicyDataAttributes.class);
    assertTrue(instancePolicyKeyCreateImportAccessPolicyDataAttributesModelNew instanceof InstancePolicyKeyCreateImportAccessPolicyDataAttributes);
    assertEquals(instancePolicyKeyCreateImportAccessPolicyDataAttributesModelNew.createRootKey(), Boolean.valueOf(true));
    assertEquals(instancePolicyKeyCreateImportAccessPolicyDataAttributesModelNew.createStandardKey(), Boolean.valueOf(true));
    assertEquals(instancePolicyKeyCreateImportAccessPolicyDataAttributesModelNew.importRootKey(), Boolean.valueOf(true));
    assertEquals(instancePolicyKeyCreateImportAccessPolicyDataAttributesModelNew.importStandardKey(), Boolean.valueOf(true));
    assertEquals(instancePolicyKeyCreateImportAccessPolicyDataAttributesModelNew.enforceToken(), Boolean.valueOf(true));
  }
}