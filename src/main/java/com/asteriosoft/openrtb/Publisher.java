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
 * This object describes the publisher of the media in which the ad will be displayed.
 * The publisher is typically the seller in an OpenRTB transaction.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Publisher {

    /**
     * Exchange-specific publisher ID.
     */
    private String id;
    /**
     * Publisher name (may be aliased at the publisher's request).
     */
    private String name;

    /**
     * The taxonomy in use. Refer to the AdCOM list List: Category
     * Taxonomies for values.
     * Default: 1
     */
    private Integer cattax;

    /**
     * Array of IAB content categories that describe the publisher.
     */
    private List<String> cat;
    /**
     * Highest level domain of the publisher (e.g., "publisher.com").
     */
    private String domain;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
