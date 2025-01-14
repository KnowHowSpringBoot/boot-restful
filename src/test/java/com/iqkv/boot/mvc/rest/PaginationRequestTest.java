/*
 * Copyright 2024 IQKV Team, and the original author or authors from the JHipster project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.iqkv.boot.mvc.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PaginationRequestTest {
  private PaginationRequest dto;

  @BeforeEach
  void setUp() {
    dto = new PaginationRequest();
  }

  @Test
  void pageShouldStoreCorrectValues() {
    assertEquals(0, dto.getPage());

    dto.setPage(100);

    assertEquals(100, dto.getPage());
  }

  @Test
  void sizeShouldStoreCorrectValues() {
    assertEquals(10, dto.getSize());

    dto.setSize(100);

    assertEquals(100, dto.getSize());
  }
}
