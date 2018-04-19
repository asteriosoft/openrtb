/**
 * Deal.java
 * <p>
 * Copyright 2017-2018 Asteriosoft. All Rights Reserved.
 * <p>
 * This software is the proprietary information of Asteriosoft.
 * Use is subject to license terms.
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
public class Deal {

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
     * Optional override of the overall auction type of the bid request, where 1 = First Price, 2 = Second Price Plus,
     * 3 = the value passed in bidfloor is the agreed upon deal price. Additional auction types can be defined
     * by the exchange.
     */
    private Integer at;
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
