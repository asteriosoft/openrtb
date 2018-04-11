/**
 * BidResponse.java
 * <p>
 * Copyright 2015-2016 RhythmOne. All Rights Reserved.
 * <p>
 * This software is the proprietary information of RhythmOne.
 * Use is subject to license terms.
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
public class BidResponse {

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
