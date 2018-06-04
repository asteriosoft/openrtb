/**
 * Impression.java
 * <p>
 * Copyright 2017-2018 Asteriosoft. All Rights Reserved.
 * <p>
 * This software is the proprietary information of Asteriosoft.
 * Use is subject to license terms.
 */
package com.asteriosoft.openrtb;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * This object describes an ad placement or impression being auctioned. A single bid request can include multiple
 * Imp objects, a use case for which might be an exchange that supports selling all ad positions on a given page.
 * Each Imp object has a required ID so that bids can reference them individually.
 *
 * The presence of Banner, Video, and/or Native objects subordinate to the Imp object indicates the type of impression
 * being offered. The publisher can choose one such type which is the typical case or mix them at their discretion.
 * However, any given bid for the impression must conform to one of the offered types.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Imp {

    public static final String DEFAULT_BIDFLOORCUR = "USD";

    /**
     * A unique identifier for this impression within the context of the bid request
     * (typically, starts with 1 and increments.
     *
     * <b>Required attribute.</b>
     */
    private String id;

    /**
     * An array of Metric object (Section 3.2.5).
     */
    private List<Metric> metric;

    /**
     * A Banner object; required if this impression is offered as a banner ad opportunity.
     *
     * @see Banner
     */
    private Banner banner;
    /**
     * A Video object; required if this impression is offered as a video ad opportunity.
     *
     * @see Video
     */
    private Video video;
    /**
     * An Audio object; required if this impression is offered as an audio ad opportunity.
     *
     * @see Audio
     */
    private Audio audio;
    /**
     * A Native object; required if this impression is offered as a native ad opportunity.
     *
     * @see Native
     */
    @JsonProperty("native")
    private Native nnative;
    /**
     * A Pmp object containing any private marketplace deals in effect for this impression.
     *
     * @see Pmp
     */
    private Pmp pmp;
    /**
     * Name of ad mediation partner, SDK technology, or player responsible for rendering ad (typically video or mobile).
     * Used by some ad servers to customize ad code by partner. Recommended for video and/or apps.
     */
    private String displaymanager;
    /**
     * Version of ad mediation partner, SDK technology, or player responsible for rendering ad (typically video or
     * mobile). Used by some ad servers to customize ad code by partner. Recommended for video and/or apps.
     */
    private String displaymanagerver;
    /**
     * 1 = the ad is interstitial or full screen, 0 = not interstitial.
     *
     * Default: 0
     */
    private Integer instl;
    /**
     * Identifier for specific ad placement or ad tag that was used to initiate the auction. This can be useful
     * for debugging of any issues, or for optimization by the buyer.
     */
    private String tagid;
    /**
     * Minimum bid for this impression expressed in CPM.
     *
     * Default: 0
     */
    private BigDecimal bidfloor;
    /**
     * Currency specified using ISO-4217 alpha codes. This may be different from bid currency returned by
     * bidder if this is allowed by the exchange.
     *
     * Default: USD
     */
    private String bidfloorcur;
    /**
     * Indicates the type of browser opened upon clicking the creative in an app, where 0 = embedded, 1 = native.
     * Note that the Safari View Controller in iOS 9.x devices is considered a native browser for purposes of this attribute.
     */
    private Integer clickbrowser;
    /**
     * Flag to indicate if the impression requires secure HTTPS URL creative assets and markup,
     * where 0 = non-secure, 1 = secure. If omitted, the secure state is unknown, but non-secure HTTP support
     * can be assumed.
     */
    private Integer secure;
    /**
     * Array of exchange-specific names of supported iframe busters.
     */
    private List<String> iframebuster;
    /**
     * Advisory as to the number of seconds that may elapse between the auction and the actual impression.
     */
    private Integer exp;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
