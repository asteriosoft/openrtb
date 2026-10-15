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
 * This object constitutes a specific deal that was struck a priori between a buyer and a seller. Its presence
 * with the Pmp collection indicates that this impression is available under the terms of that deal.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Deal {

    /**
     * A unique identifier for the direct deal.
     *
     * <b>Required attribute.</b>
     */
    private String id;
    /**
     * Minimum bid for this impression expressed in CPM.
     *
     * Default: 0
     */
    private Float bidfloor;
    /**
     * Currency specified using ISO-4217 alpha codes. This may be different from bid currency returned by bidder
     * if this is allowed by the exchange.
     *
     * Default: USD
     */
    private String bidfloorcur;
    /**
     * Optional override of the overall auction type of the bid request, where
     * 1 = First Price, 2 = Second Price Plus, 3 = the value passed in bidfloor is the agreed upon deal price.
     * Additional auction types can be defined by the exchange.
     */
    private Integer at;
    /**
     * Indicates that the deal is of type guaranteed and the bidder must bid on the deal, where
     * 0 = not a guaranteed deal, 1 = guaranteed deal.
     */
    private Integer guar;
    /**
     * Whitelist of buyer seats allowed to bid on this deal. Seat IDs must be communicated between bidders and
     * the exchange a priori. Omission implies no seat restrictions.
     */
    private List<String> wseat;
    /**
     * Array of advertiser domains (e.g., advertiser.com) allowed to bid on this deal. Omission implies no
     * advertiser restrictions.
     */
    private List<String> wadomain;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
