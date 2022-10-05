/**
 * App.java
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
 * This object should be included if the ad supported content is a non-browser application
 * (typically in mobile) as opposed to a website. A bid request must not contain both an App and a Site object.
 * At a minimum, it is useful to provide an App ID or bundle, but this is not strictly required.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class App {
    /**
     * Exchange-specific app ID.
     *
     * Recommended attribiute.
     */
    private String id;
    /**
     * App name (may be aliased at the publisher's request).
     */
    private String name;
    /**
     * Domain of the app (e.g., "mygame.foo.com").
     */
    private String domain;

    /**
     * App store URL for an installed app; for IQG 2.1 compliance.
     */
    private String storeUrl;

    /**
     * The taxonomy in use. Refer to the AdCOM list List: Category
     * Taxonomies for values.
     * Default: 1
     */
    private Integer cattax;

    /**
     * Array of IAB content categories of the app.
     */
    private List<String> cat;
    /**
     * Array of IAB content categories that describe the current section of the app.
     */
    private List<String> sectioncat;
    /**
     * Array of IAB content categories that describe the current page or view of the app.
     */
    private List<String> pagecat;
    /**
     * Indicates if the app has a privacy policy, where 0 = no, 1 = yes.
     */
    private Integer privacypolicy;
    /**
     * Details about the Publisher of the app.
     *
     * @see Publisher
     */
    private Publisher publisher;
    /**
     * Details about the Content within the app.
     *
     * @see Content
     */
    private Content content;
    /**
     * Comma separated list of keywords about the app.
     */
    private String keywords;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
    /**
     * Application bundle or package name (e.g., com.foo.mygame); intended to be a unique ID across exchanges.
     */
    private String bundle;
    /**
     * App store URL for an installed app; for QAG 1.5 compliance.
     */
    private String storeurl;
    /**
     * Application version.
     */
    private String ver;
    /**
     * 0 = app is free, 1 = the app is a paid version.
     */
    private Integer paid;
}
