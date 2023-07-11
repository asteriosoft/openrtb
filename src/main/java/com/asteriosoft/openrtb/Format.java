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
 * This object represents an allowed size (i.e., height and width combination) for a banner impression.
 * These are typically used in an array for an impression where multiple sizes are permitted.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Format {

    /**
     * Width in device independent pixels (DIPS).
     */
    private Integer w;
    /**
     * Height in device independent pixels (DIPS).
     */
    private Integer h;

    /**
     * Relative width when expressing size as a ratio.
     */
    private Integer wratio;
    /**
     * Relative height when expressing size as a ratio.
     */
    private Integer hratio;
    /**
     * The minimum width in device independent pixels (DIPS) at which the ad will be displayed the size is expressed as a ratio.
     */
    private Integer wmin;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
