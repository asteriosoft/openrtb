package com.asteriosoft.openrtb;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Channel {

    /**
     * A unique identifier assigned by the publisher. This may not be
     * a unique identifier across all supply sources.v
     */
    private String id;

    /**
     * Channel the content is on (e.g., a local channel like "WABC-TV")
     */
    private String name;

    /**
     * The primary domain of the channel (e.g. “abc7ny.com” in the
     * case of the local channel WABC-TV). It is recommended to
     * include the top private domain (PSL+1) for DSP targeting
     * normalization purposes.
     */
    private String domain;

    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;

}
