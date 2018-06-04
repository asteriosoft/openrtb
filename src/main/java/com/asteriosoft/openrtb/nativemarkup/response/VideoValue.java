package com.asteriosoft.openrtb.nativemarkup.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Corresponds to the Video Object in the request, yet containing a value of a conforming  VAST
 * tag as a value.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class VideoValue {
    /**
     * Vast xml.
     * <p>Required.
     */
    private String vasttag;
}
