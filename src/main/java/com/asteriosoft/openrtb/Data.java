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

import java.util.List;
import java.util.Map;

/**
 * The data and segment objects together allow additional data about the user to be specified. This data
 * may be from multiple sources whether from the exchange itself or third party providers as specified by
 * the id field. A bid request can mix data objects from multiple providers. The specific data providers
 * in use should be published by the exchange a priori to its bidders.
 */
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Data {

    /**
     * Exchange-specific ID for the data provider.
     */
    private String id;
    /**
     * Exchange-specific name for the data provider.
     */
    private String name;
    /**
     * Array of Segment objects that contain the actual data values.
     *
     * @see Segment
     */
    private List<Segment> segment;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
