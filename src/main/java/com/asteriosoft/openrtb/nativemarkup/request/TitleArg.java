package com.asteriosoft.openrtb.nativemarkup.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * The Title object is to be used for title element of the Native ad.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TitleArg {
    /**
     * Maximum length of the text in the title element.
     * Recommended to be 25, 90, or 140.
     * 
     * <p>Required
     */
    private Integer len;
}
