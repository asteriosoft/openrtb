/**
 * Publisher.java
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
 * This object describes the publisher of the media in which the ad will be displayed.
 * The publisher is typically the seller in an OpenRTB transaction.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Publisher {

    /**
     * Exchange-specific publisher ID.
     */
    private String id;
    /**
     * Publisher name (may be aliased at the publisher's request).
     */
    private String name;
    /**
     * Array of IAB content categories that describe the publisher.
     */
    private List<String> cat;
    /**
     * Highest level domain of the publisher (e.g., "publisher.com").
     */
    private String domain;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
