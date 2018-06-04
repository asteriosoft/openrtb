/**
 * SeatBid.java
 * <p>
 * Copyright 2017-2018 Asteriosoft. All Rights Reserved.
 * <p>
 * This software is the proprietary information of Asteriosoft.
 * Use is subject to license terms.
 */
package com.asteriosoft.openrtb;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * A bid response can contain multiple SeatBid objects, each on behalf of a different bidder seat and
 * each containing one or more individual bids. If multiple impressions are presented in the request, the
 * group attribute can be used to specify if a seat is willing to accept any impressions that it can win
 * (default) or if it is only interested in winning any if it can win them all as a group.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SeatBid {

    /**
     * Array of 1+ Bid objects (Section 4.2.3) each related to an impression. Multiple bids can relate to the
     * same impression.
     *
     * <b>Required attribute.</b>
     */
    private List<Bid> bid;
    /**
     * ID of the bidder seat on whose behalf this bid is made.
     */
    private String seat;
    /**
     * 0 = impressions can be won individually; 1 = impressions must be won or lost as a group.
     *
     * Default: 0
     */
    private Integer group;
    /**
     * Placeholder for bidder-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;

    public void addBid(Bid bid) {
        if (this.bid == null) {
            this.bid = new ArrayList<>();
        }
        this.bid.add(bid);
    }
}
