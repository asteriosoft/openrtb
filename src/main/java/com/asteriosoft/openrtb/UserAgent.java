package com.asteriosoft.openrtb;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAgent {

    /**
     * ach BrandVersion object (see Section 3.2.30) identifies a browser or similar
     * software component. Implementers should send brands and versions
     * derived from the Sec-CH-UA-Full-Version-List header*.
     * Recommended attribute.
     */
    private List<BrandVersion> browsers;

    /**
     * A BrandVersion object (see Section 3.2.30) that identifies the user agent’s
     * execution platform / OS. Implementers should send a brand derived from the
     * Sec-CH-UA-Platform header, and version derived from the Sec-CH-UA-
     * Platform-Version header *.
     * Recommended attribute.
     */
    private BrandVersion platform;

    /**
     * 1 if the agent prefers a “mobile” version of the content, if available, i.e.
     * optimized for small screens or touch input. 0 if the agent prefers the “desktop” or “full” content.
     * Implementers should derive this value from the Sec-CH-UA-Mobile header *.
     */
    private Integer mobile;

    /**
     * Device’s major binary architecture, e.g. “x86” or “arm”. Implementers should
     * retrieve this value from the Sec-CH-UA-Arch header*.
     */
    private String architecture;

    /**
     * Device’s bitness, e.g. “64” for 64-bit architecture. Implementers should
     * retrieve this value from the Sec-CH-UA-Bitness header*.
     */
    private String bitness;

    /**
     * Device model. Implementers should retrieve this value from the Sec-CH-UA-
     * Model header*.
     */
    private String model;

    /**
     * The source of data used to create this object, List: User-Agent Source in
     * AdCOM 1.0
     */
    private Integer source;

    /**
     * Placeholder for vendor specific extensions to this object
     */
    private Map<String, Object> ext;

}
