/**
 * Producer.java
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
 * This object defines the producer of the content in which the ad will be shown. This is particularly
 * useful when the content is syndicated and may be distributed through different publishers and thus
 * when the producer and publisher are not necessarily the same entity.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Producer {

    /**
     * Content producer or originator ID. Useful if content is syndicated and may be posted on a site using embed tags.
     */
    private String id;
    /**
     * Content producer or originator name (e.g., "Warner Bros").
     */
    private String name;

    /**
     * The taxonomy in use. Refer to the AdCOM list List: Category
     * Taxonomies for values.
     * Default: 1
     */
    private Integer cattax;

    /**
     * Array of IAB content categories that describe the content producer.
     */
    private List<String> cat;
    /**
     * Highest level domain of the content producer (e.g., "producer.com").
     */
    private String domain;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
