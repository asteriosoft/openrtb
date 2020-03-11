package com.asteriosoft.openrtb.nativemarkup.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class EventTracker {

    /**
     * Type	of event to	track.
     *
     * <p>Required
     */
    private Integer event;
    /**
     * Type	of tracking requested.
     *
     * <p>Required
     */
    private Integer method;
    /**
     * The URL of the image or js.
     *
     * <p>Optional
     */
    private String url;
}
