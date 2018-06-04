package com.asteriosoft.openrtb.nativemarkup.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Corresponds to the Title Object in the request, with the value filled in.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TitleValue {
    /**
     * The text associated with the text element.
     * <p>Required.
     */
    private String text;
}
