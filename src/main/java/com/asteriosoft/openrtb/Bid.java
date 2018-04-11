/**
 * Bid.java
 * <p>
 * Copyright 2015-2016 RhythmOne. All Rights Reserved.
 * <p>
 * This software is the proprietary information of RhythmOne.
 * Use is subject to license terms.
 */
package com.asteriosoft.openrtb;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A SeatBid object contains one or more Bid objects, each of which relates to a specific impression in the
 * bid request via the impid attribute and constitutes an offer to buy that impression for a given price.
 *
 * For each bid, the nurl attribute contains the win notice URL. If the bidder wins the impression, the exchange
 * calls this notice URL to inform the bidder of the win and to convey certain information using substitution
 * macros such as the clearing price. The win notice return or the adm attribute can be used to serve markup.
 * In either case, the exchange will also apply the aforementioned substitution to any macros found in the markup.
 *
 * BEST PRACTICE: The essential function of the win notice is to inform a bidder that they won an auction.
 * It does not necessarily imply ad delivery, creative viewability, or billability. Exchanges are highly encouraged
 * to publish to their bidders their event triggers, billing policies, and any other meaning they attach to the win notice.
 *
 * Several other attribute are used for ad quality checks or enforcing publisher restrictions. These include
 * the advertiser domain via adomain, a non-cache-busted URL to an image representative of the content of the
 * campaign via iurl, an ID of the campaign and of the creative within the campaign via cid and crid respective,
 * an array of creative attribute via attr, and the dimensions via h and w. If the bid pertains to a private
 * marketplace deal, the dealid attribute is used to reference that agreement from the bid request.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Bid {

    /**
     * Bidder generated bid ID to assist with logging/tracking.
     *
     * <b>Required attribute.</b>
     */
    private String id;
    /**
     * ID of the Imp object in the related bid request.
     *
     * <b>Required attribute.</b>
     */
    private String impid;
    /**
     * Bid price expressed as CPM although the actual transaction is for a unit impression only. Note that
     * while the type indicates Float, integer math is highly recommended when handling currencies
     * (e.g., BigDecimal in Java).
     *
     * <b>Required attribute.</b>
     */
    private BigDecimal price;
    /**
     * Win notice URL called by the exchange if the bid wins; optional means of serving ad markup.
     */
    private String nurl;
    /**
     * Billing notice URL called by the exchange when a winning bid becomes billable based on exchange-specific
     * business policy (e.g., typically delivered, viewed, etc.).  Substitution macros (Section 4.4) may be included.
     */
    private String burl;
    /**
     * Loss notice URL called by the exchange when a bid is known to have been lost.
     * Substitution macros (Section 4.4) may be included.
     * Exchange-specific policy may preclude support for loss notices or the disclosure of winning clearing prices
     * resulting in ${AUCTION_PRICE} macros being removed (i.e., replaced with a zero-length string).
     */
    private String lurl;
    /**
     * Optional means of conveying ad markup in case the bid wins; supersedes the win notice if markup is
     * included in both.
     */
    private String adm;
    /**
     * ID of a preloaded ad to be served if the bid wins.
     */
    private String adid;
    /**
     * Advertiser domain for block list checking (e.g., "ford.com"). This can be an array of for the case of
     * rotating creatives. Exchanges can mandate that only one domain is allowed.
     */
    private List<String> adomain;
    /**
     * Bundle or package name (e.g., com.foo.mygame) of the app being advertised, if applicable; intended
     * to be a unique ID across exchanges.
     */
    private String bundle;
    /**
     * URL without cache-busting to an image that is representative of the content of the campaign for
     * ad quality/safety checking.
     */
    private String iurl;
    /**
     * Campaign ID to assist with ad quality checking; the collection of creatives for which iurl should
     * be representative.
     */
    private String cid;
    /**
     * Creative ID to assist with ad quality checking.
     */
    private String crid;
    /**
     * Tactic ID to enable buyers to label bids for reporting to the exchange the tactic through which their bid was submitted.
     * The specific usage and meaning of the tactic ID should be communicated between buyer and exchanges a priori.
     */
    private String tactic;
    /**
     * IAB content categories of the creative.
     */
    private List<String> cat;
    /**
     * Set of attributes describing the creative.
     */
    private List<Integer> attr;
    /**
     * API required by the markup if applicable.
     */
    private Integer api;
    /**
     * Video response protocol of the markup if applicable.
     */
    private Integer protocol;
    /**
     * Creative media rating per IQG guidelines.
     */
    private Integer qagmediarating;
    /**
     * Reference to the deal.id from the bid request if this bid pertains to a private marketplace direct deal.
     */
    private String dealid;
    /**
     * Width of the creative in pixels.
     */
    private Integer w;
    /**
     * Height of the creative in pixels.
     */
    private Integer h;
    /**
     * Relative width of the creative when expressing size as a ratio. Required for Flex Ads.
     */
    private Integer wratio;
    /**
     * Relative height of the creative when expressing size as a ratio. Required for Flex Ads.
     */
    private Integer hratio;
    /**
     * Advisory as to the number of seconds the bidder is willing to wait between the auction and the actual impression.
     */
    private Integer exp;
    /**
     * Placeholder for bidder-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;

    public void addExt(String key, Object value) {
        if (ext == null) {
            ext = new HashMap<>();
        }
        ext.put(key, value);
    }
}
