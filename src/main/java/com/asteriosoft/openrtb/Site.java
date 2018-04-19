/**
 * Site.java
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
 * This object should be included if the ad supported content is a website as opposed to a non-browser application.
 * A bid request must not contain both a Site and an App object. At a minimum, it is useful to provide a site ID
 * or page URL, but this is not strictly required.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Site {
    /**
     * Exchange-specific site ID.
     *
     * Recommended attribiute.
     */
    protected String id;
    /**
     * Site name (may be aliased at the publisher's request).
     */
    protected String name;
    /**
     * Domain of the site (e.g., "mysite.foo.com").
     */
    protected String domain;
    /**
     * Array of IAB content categories of the site.
     */
    protected List<String> cat;
    /**
     * Array of IAB content categories that describe the current section of the site.
     */
    protected List<String> sectioncat;
    /**
     * Array of IAB content categories that describe the current page or view of the site.
     */
    protected List<String> pagecat;
    /**
     * Indicates if the app has a privacy policy, where 0 = no, 1 = yes.
     */
    protected Integer privacypolicy;
    /**
     * Details about the Publisher of the app.
     *
     * @see Publisher
     */
    protected Publisher publisher;
    /**
     * Details about the Content within the app.
     *
     * @see Content
     */
    protected Content content;
    /**
     * Comma separated list of keywords about the app.
     */
    protected String keywords;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    protected Map<String, Object> ext;
    /**
     * URL of the page where the impression will be shown.
     */
    private String page;
    /**
     * Referrer URL that caused navigation to the current page.
     */
    private String ref;
    /**
     * Search string that caused navigation to the current page.
     */
    private String search;
    /**
     * Mobile-optimized signal, where 0 = no, 1 = yes.
     */
    private Integer mobile;
}
