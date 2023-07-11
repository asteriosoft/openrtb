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
 * This object is associated with an impression as an array of metrics.  These metrics can offer insight into
 * the impression to assist with decisioning such as average recent viewability, click-through rate, etc.
 * Each metric is identified by its type, reports the value of the metric,
 * and optionally identifies the source or vendor measuring the value.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Metric {

    /**
     * Type of metric being presented using exchange curated string names which should be published to bidders a priori.
     */
    private String type;

    /**
     * Number representing the value of the metric. Probabilities must be in the range 0.0–1.0.
     */
    private Float value;

    /**
     * Source of the value using exchange curated string names which should be published to bidders a priori.
     * If the exchange itself is the source versus a third party, “EXCHANGE” is recommended.
     */
    private String vendor;

    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
