/**
 * Pmp.java
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
 * This object is the private marketplace container for direct deals between buyers and sellers that
 * may pertain to this impression. The actual deals are represented as a collection of Deal objects.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pmp {

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
