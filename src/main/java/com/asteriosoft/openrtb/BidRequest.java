/**
 * BidRequest.java
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
 * The top-level bid request object contains a globally unique bid request or auction ID. This id attribute
 * is required as is at least one impression object. Other attributes in this top-level object establish rules and
 * restrictions that apply to all impressions being offered.
 * <p>
 * There are also several subordinate objects that provide detailed data to potential buyers. Among these are
 * the Site and App objects, which describe the type of published media in which the impression(s) appear. These
 * objects are highly recommended, but only one applies to a given bid request depending on whether the media
 * is browser-based web content or a non-browser application, respectively.
 */

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BidRequest {

    /**
     * Unique ID of the bid request, provided by the exchange.
     * <p>
     * <b>Required attribute.</b>
     */
    private String id;
    /**
     * Array of Imp objects representing the impressions offered. At least 1 Imp object is required.
     * <p>
     * <b>Required attribute.</b>
     *
     * @see Imp
     */
    private List<Imp> imp;
    /**
     * Details via a Site object about the publisher's website. Only applicable and recommended for
     * websites.
     * <p>
     * Recommended attribute.
     *
     * @see Site
     */
    private Site site;
    /**
     * Details via an App object about the publisher's app (i.e., non-browser applications). Only applicable and
     * recommended for apps.
     * <p>
     * Recommended attribute.
     *
     * @see App
     */
    private App app;
    /**
     * Details via a Device object about the user's device to which the impression will be delivered.
     * <p>
     * Recommended attribute.
     *
     * @see Device
     */
    private Device device;
    /**
     * Details via a User object about the human user of the device; the advertising audience.
     * <p>
     * Recommended attribute.
     *
     * @see User
     */
    private User user;
    /**
     * Indicator of test mode in which auctions are not billable, where 0 = live mode, 1 = test mode.
     * <p>
     * Default: 0
     */
    private Integer test;
    /**
     * Auction type, where 1 = First Price, 2 = Second Price Plus. Exchange-specific auction types can be defined
     * using values greater than 500.
     * <p>
     * Default: 2
     */
    private Integer at;
    /**
     * Maximum time in milliseconds to submit a bid to avoid timeout. This value is commonly communicated offline.
     */
    private Integer tmax;
    /**
     * Whitelist of buyer seats (e.g., advertisers, agencies) allowed to bid on this impression.
     * IDs of seats and knowledge of the buyer's customers to which they refer must be coordinated
     * between bidders and the exchange a priori. Omission implies no seat restrictions.
     */
    private List<String> wseat;
    /**
     * Block list of buyer seats (e.g., advertisers, agencies) restricted from bid ding on this impression.
     * IDs of seats and knowledge of the buyer’s customers to which they refer must be coordinated between bidders
     * and the exchange a priori.  At most, only one of wseat and bseat should be used in the same request.
     * Omission of both implies no seat restrictions.
     */
    private List<String> bseat;
    /**
     * Flag to indicate if Exchange can verify that the impressions offered represent all of the impressions available
     * in context (e.g., all on the web page, all video spots such as pre/mid/post roll) to support road-blocking.
     * 0 = no or unknown, 1 = yes, the impressions offered represent all that are available.
     * <p>
     * Default: 0
     */
    private Integer allimps;
    /**
     * Array of allowed currencies for bids on this bid request using ISO-4217 alpha codes. Recommended only if
     * the exchange accepts multiple currencies.
     */
    private List<String> cur;
    /**
     * White list of languages for creatives using ISO-639-1-alpha-2. Omission implies no specific restrictions,
     * but buyers would be advised to consider language attribute in the Device and/or Content objects if available.
     */
    private List<String> wlang;
    /**
     * Blocked advertiser categories using the IAB content categories.
     */
    private List<String> bcat;
    /**
     * Block list of advertisers by their domains (e.g., "ford.com").
     */
    private List<String> badv;
    /**
     * Block list of applications by their platform-specific exchange-independent application identifiers.
     * On Android, these should be bundle or package names (e.g., com.foo.mygame). On iOS, these are numeric IDs.
     */
    private List<String> bapp;
    /**
     * A Source object (Section 3.2.2) that provides data about the inventory source and which entity makes the final decision.
     */
    private Source source;
    /**
     * A Regs object that specifies any industry, legal, or governmental regulations in force for this request.
     *
     * @see Regs
     */
    private Regs regs;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
