package com.asteriosoft.openrtb.nativemarkup.request;

import com.asteriosoft.openrtb.nativemarkup.DataType;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The Data Object is to be used for all non-core elements of the native unit such as Brand Name,
 * Ratings, Review Count, Stars, Download count, descriptions etc. It is also generic for future 
 * native elements not contemplated at the time of the writing of this document. 
 */
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DataArg {
    /**
     * Type ID of the element supported by the publisher. The publisher can display this information in an appropriate format.
     * <br>{@link DataType}
     * 
     * <p>Required  
     */
    private Integer type;
    
    /**
     * Maximum length of the text in the element’s response.
     * 
     * <p>Optional
     */
    private Integer len;
}
