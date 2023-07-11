/*
 *
 *  * Copyright 2023 Asteriosoft Inc.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */
package com.asteriosoft.openrtb;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Map;

/**
 * Segment objects are essentially key-value pairs that convey specific units of data about the user. The parent
 * Data object is a collection of such values from a given data provider. The specific segment names and value
 * options must be published by the exchange a priori to its bidders.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Segment {

    /**
     * ID of the data segment specific to the data provider.
     */
    private String id;
    /**
     * Name of the data segment specific to the data provider.
     */
    private String name;
    /**
     * String representation of the data segment value.
     */
    private String value;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
