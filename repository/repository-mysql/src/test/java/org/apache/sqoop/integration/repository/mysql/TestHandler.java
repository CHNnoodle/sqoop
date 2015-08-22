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

package org.apache.sqoop.integration.repository.mysql;

import org.testng.annotations.Test;

/**
 * Test driver methods on MySql repository.
 */
@Test(groups = "mysql")
public class TestHandler extends MySqlTestCase {

  @Test
  public void testHasLatestRepositoryVersion() throws Exception {
    assertTrue(handler.isRepositorySuitableForUse(provider.getConnection()));
  }

  @Test
  public void testDoubleUpdate() throws Exception {
    handler.createOrUpgradeRepository(provider.getConnection());
    assertTrue(handler.isRepositorySuitableForUse(provider.getConnection()));
  }
}