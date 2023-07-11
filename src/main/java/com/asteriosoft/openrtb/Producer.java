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

import java.util.List;
import java.util.Map;

/**
 * This object defines the producer of the content in which the ad will be shown. This is particularly
 * useful when the content is syndicated and may be distributed through different publishers and thus
 * when the producer and publisher are not necessarily the same entity.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Producer {

    /**
     * Content producer or originator ID. Useful if content is syndicated and may be posted on a site using embed tags.
     */
    private String id;
    /**
     * Content producer or originator name (e.g., "Warner Bros").
     */
    private String name;
    /**
     * Array of IAB content categories that describe the content producer.
     */
    private List<String> cat;
    /**
     * Highest level domain of the content producer (e.g., "producer.com").
     */
    private String domain;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
