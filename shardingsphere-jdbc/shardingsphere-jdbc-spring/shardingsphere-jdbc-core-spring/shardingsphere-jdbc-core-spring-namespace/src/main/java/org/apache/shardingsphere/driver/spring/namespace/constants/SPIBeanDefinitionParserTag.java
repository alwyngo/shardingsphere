/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.driver.spring.namespace.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * SPI parser tag constants.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class SPIBeanDefinitionParserTag {
    
    public static final String KEY_GENERATE_ALGORITHM_TAG = "key-generate-algorithm";
    
    public static final String KEY_GENERATE_ALGORITHM_TYPE_ATTRIBUTE = "type";
    
    public static final String KEY_GENERATE_ALGORITHM_PROPERTY_REF_ATTRIBUTE = "props-ref";

    public static final String SHARDING_ALGORITHM_TAG = "sharding-algorithm";

    public static final String SHARDING_ALGORITHM_TYPE_ATTRIBUTE = "type";

    public static final String SHARDING_ALGORITHM_PROPERTY_REF_ATTRIBUTE = "props-ref";
}
