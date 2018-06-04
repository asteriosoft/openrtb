/**
 * Banner.java
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
 * This object represents the most general type of impression. Although the term "banner" may have very
 * specific meaning in other contexts, here it can be many things including a simple static image,
 * an expandable ad unit, or even in-banner video (refer to the Video object for the more generalized
 * and full featured video ad units). An array of Banner objects can also appear within the Video
 * to describe optional companion ads defined in the VAST specification.
 *
 * The presence of a Banner as a subordinate of the Imp object indicates that this impression is offered
 * as a banner type impression. At the publisher's discretion, that same impression may also be offered
 * as video, audio, and/or native by also including as Imp subordinates objects of those types.
 * However, any given bid for the impression must conform to one of the offered types.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Banner {

    /**
     * Width in device independent pixels (DIPS). If no format objects are specified,
     * this is an exact width requirement. Otherwise it is a preferred width.
     *
     * Recommended attribute.
     */
    private Integer w;
    /**
     * Height in device independent pixels (DIPS). If no format objects are specified,
     * this is an exact height requirement. Otherwise it is a preferred height.
     *
     * Recommended attribute.
     */
    private Integer h;
    /**
     * Array of Format objects representing the banner sizes permitted. If none are specified,
     * then use of the h and w attributes is highly recommended.
     */
    private List<Format> format;
    /**
     * Maximum width of the impression in pixels. If included along with a w value then w should be interpreted
     * as a recommended or preferred width.
     *
     * @deprecated Deprecated in favor of the format array.
     */
    @Deprecated
    private Integer wmax;
    /**
     * Maximum height of the impression in pixels. If included along with an h value then h should be interpreted
     * as a recommended or preferred height.
     *
     * @deprecated Deprecated in favor of the format array.
     */
    @Deprecated
    private Integer hmax;
    /**
     * Minimum width of the impression in pixels. If included along with a w value then w should be interpreted
     * as a recommended or preferred width.
     *
     * @deprecated Deprecated in favor of the format array.
     */
    @Deprecated
    private Integer wmin;
    /**
     * Minimum height of the impression in pixels. If included along with an h value then h should be interpreted
     * as a recommended or preferred height.
     *
     * @deprecated Deprecated in favor of the format array.
     */
    @Deprecated
    private Integer hmin;
    /**
     * Unique identifier for this banner object. Recommended when Banner objects are used with a Video object
     * to represent an array of companion ads. Values usually start at 1 and increase with each object;
     * should be unique within an impression.
     *
     * @see Video
     */
    private String id;
    /**
     * Blocked banner ad types.
     */
    private List<Integer> btype;
    /**
     * Blocked creative attributes.
     */
    private List<Integer> battr;
    /**
     * Ad position on screen.
     */
    private Integer pos;
    /**
     * Content MIME types supported. Popular MIME types may include "application/x-shockwave-flash",
     * "image/jpg", and "image/gif".
     */
    private List<String> mimes;
    /**
     * Indicates if the banner is in the top frame as opposed to an iframe, where 0 = no, 1 = yes.
     */
    private Integer topframe;
    /**
     * Directions in which the banner may expand.
     */
    private List<Integer> expdir;
    /**
     * List of supported API frameworks for this impression. If an API is not explicitly listed,
     * it is assumed not to be supported.
     */
    private List<Integer> api;

    /**
     * Relevant only for Banner objects used with a Video object (Section 3.2.7) in an array of companion ads.
     * Indicates the companion banner rendering mode relative to the associated video, where 0 = concurrent, 1 = end-card.
     */
    private Integer vcm;

    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
