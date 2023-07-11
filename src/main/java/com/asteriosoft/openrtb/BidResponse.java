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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * This object is the top-level bid response object (i.e., the unnamed outer JSON object). The id attribute is
 * a reflection of the bid request ID for logging purposes. Similarly, bidid is an optional response tracking ID
 * for bidders. If specified, it can be included in the subsequent win notice call if the bidder wins. At least one
 * seatbid object is required, which contains at least one bid for an impression. Other attributes are optional.
 *
 * To express a "no-bid", the options are to return an empty response with HTTP 204. Alternately if the bidder wishes
 * to convey to the exchange a reason for not bidding, just a BidResponse object is returned with a reason code
 * in the nbr attribute.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class BidResponse {

    /**
     * ID of the bid request to which this is a response.
     *
     * <b>Required attribute.</b>
     */
    private String id;
    /**
     * Array of seatbid objects; 1+ required if a bid is to be made.
     */
    private List<SeatBid> seatbid;
    /**
     * Bidder generated response ID to assist with logging/tracking.
     */
    private String bidid;
    /**
     * Bid currency using ISO-4217 alpha codes.
     *
     * Default: USD
     */
    private String cur;
    /**
     * Optional feature to allow a bidder to set data in the exchange's cookie. The string must be in base85
     * cookie safe characters and be in any format. Proper JSON encoding must be used to include
     * "escaped" quotation marks.
     */
    private String customdata;
    /**
     * Reason for not bidding.
     */
    private Integer nbr;
    /**
     * Placeholder for bidder-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;

    public void addSeatBid(SeatBid seatBid) {
        if (this.seatbid == null) {
            this.seatbid = new ArrayList<>();
        }
        this.seatbid.add(seatBid);
    }
}
