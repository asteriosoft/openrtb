/**
 * Video.java
 * <p>
 * Copyright 2015-2016 RhythmOne. All Rights Reserved.
 * <p>
 * This software is the proprietary information of RhythmOne.
 * Use is subject to license terms.
 */
package com.asteriosoft.openrtb;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * This object represents an in-stream video impression. Many of the fields are non-essential for minimally
 * viable transactions, but are included to offer fine control when needed. Video in OpenRTB generally assumes
 * compliance with the VAST standard. As such, the notion of companion ads is supported by optionally including
 * an array of Banner objects that define these companion ads.
 *
 * The presence of a Video as a subordinate of the Imp object indicates that this impression is offered as
 * a video type impression. At the publisher's discretion, that same impression may also be offered as
 * banner, audio, and/or native by also including as Imp subordinates objects of those types. However,
 * any given bid for the impression must conform to one of the offered types.
 *
 * @see Banner
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Video {

    /**
     * Content MIME types supported. Popular MIME types may include "video/x-ms-wmv" for Windows Media
     * and "video/x-flv" for Flash Video.
     *
     * <b>Required attribute.</b>
     */
    private List<String> mimes;
    /**
     * Minimum video ad duration in seconds.
     *
     * Recommended attribute.
     */
    private Integer minduration;
    /**
     * Maximum video ad duration in seconds.
     *
     * Recommended attribute.
     */
    private Integer maxduration;
    /**
     * Array of supported video protocols. At least one supported protocol must be specified in either the protocol or protocols attribute.
     *
     * Recommended attribute.
     */
    private List<Integer> protocols;
    /**
     * NOTE: Deprecated in favor of protocols.
     * Supported video protocol. At least one supported protocol must be specified in either the protocol or protocols attribute.
     *
     * @deprecated Deprecated in favor of protocols.
     */
    @Deprecated
    private Integer protocol;
    /**
     * Width of the video player in device independent pixels (DIPS).
     *
     * Recommended attribute.
     */
    private Integer w;
    /**
     * Height of the video player in device independent pixels (DIPS).
     *
     * Recommended attribute.
     */
    private Integer h;
    /**
     * Indicates the start delay in seconds for pre-roll, mid-roll, or post-roll ad placements.
     *
     * Recommended attribute.
     */
    private Integer startdelay;
    /**
     * Placement type for the impression. Refer to List 5.9
     */
    private Integer placement;
    /**
     * Indicates if the impression must be linear, nonlinear, etc. If none specified, assume all are allowed.
     */
    private Integer linearity;
    /**
     * Indicates if the player will allow the video to be skipped, where 0 = no, 1 = yes.
     * If a bidder sends markup/creative that is itself skippable, the Bid object should include
     * the attr array with an element of 16 indicating skippable video.
     */
    private Integer skip;
    /**
     * Videos of total duration greater than this number of seconds can be skippable; only applicable if the ad is skippable.
     *
     * Default: 0
     */
    private Integer skipmin;
    /**
     * Number of seconds a video must play before skipping is enabled; only applicable if the ad is skippable.
     *
     * Default: 0
     */
    private Integer skipafter;
    /**
     * If multiple ad impressions are offered in the same bid request, the sequence number will allow for
     * the coordinated delivery of multiple creatives.
     */
    private Integer sequence;
    /**
     * Blocked creative attributes.
     */
    private List<Integer> battr;
    /**
     * Maximum extended video ad duration if extension is allowed. If blank or 0, extension is not allowed.
     * If -1, extension is allowed, and there is no time limit imposed. If greater than 0, then the value
     * represents the number of seconds of extended play supported beyond the maxduration value.
     */
    private Integer maxextended;
    /**
     * Minimum bit rate in Kbps. Exchange may set this dynamically or universally across their set of publishers.
     */
    private Integer minbitrate;
    /**
     * Maximum bit rate in Kbps. Exchange may set this dynamically or universally across their set of publishers.
     */
    private Integer maxbitrate;
    /**
     * Indicates if letter-boxing of 4:3 content into a 16:9 window is allowed, where 0 = no, 1 = yes.
     *
     * Default: 1
     */
    private Integer boxingallowed;
    /**
     * Allowed playback methods. If none specified, assume all are allowed.
     */
    private List<Integer> playbackmethod;
    /**
     * The event that causes playback to end. Refer to List 5.11.
     */
    private Integer playbackend;
    /**
     * Supported delivery methods (e.g., streaming, progressive). If none specified, assume all are supported.
     */
    private List<Integer> delivery;
    /**
     * Ad position on screen.
     */
    private Integer pos;
    /**
     * Array of Banner objects if companion ads are available.
     *
     * @see Banner
     */
    private List<Banner> companionad;
    /**
     * List of supported API frameworks for this impression. If an API is not explicitly listed, it is assumed
     * not to be supported.
     */
    private List<Integer> api;
    /**
     * Supported VAST companion ad types. Recommended if companion Banner objects are included via the
     * companionad array.
     */
    private List<Integer> companiontype;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
