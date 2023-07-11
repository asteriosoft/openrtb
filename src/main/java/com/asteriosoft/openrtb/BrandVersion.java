package com.asteriosoft.openrtb;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class BrandVersion {

    /**
     * A brand identifier, for example, “Chrome” or “Windows”. The value may be
     * sourced from the User-Agent Client Hints headers, representing either the
     * user agent brand (from the Sec-CH-UA-Full-Version header) or the platform
     * brand (from the Sec-CH-UA-Platform header).
     */
    private String brand;

    /**
     * A sequence of version components, in descending hierarchical order (major,
     * minor, micro, ...)
     */
    private List<String> version;

    /**
     * Placeholder for vendor specific extensions to this object
     */
    private Map<String, Object> ext;

}
