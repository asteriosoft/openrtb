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
 * This object is the private marketplace container for direct deals between buyers and sellers that
 * may pertain to this impression. The actual deals are represented as a collection of Deal objects.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Pmp {

    /**
     * Indicator of auction eligibility to seats named in the Direct Deals object, where 0 = all bids are accepted,
     * 1 = bids are restricted to the deals specified and the terms thereof.
     *
     * Default: 0
     */
    private Integer private_auction;
    /**
     * Array of Deal objects that convey the specific deals applicable to this impression.
     *
     * @see Deal
     */
    private List<Deal> deals;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
