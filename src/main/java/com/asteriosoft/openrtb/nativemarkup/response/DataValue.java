package com.asteriosoft.openrtb.nativemarkup.response;


import com.asteriosoft.openrtb.nativemarkup.DataType;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * \
 * Corresponds to the Data Object in the request, with the value filled in.  The Data Object is to be
 * used for all miscellaneous elements of the native unit such as Brand Name, Ratings, Review
 * Count, Stars, Downloads, Price count etc.  It is also generic for
 * future native elements not contemplated at the time of the writing of this document.
 */
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DataValue {
    /**
     * Type ID
     * <br>{@link DataType}
     *
     * <p>Optional
     */
    private Integer type;
    /**
     * The optional formatted string name of the data type to be displayed.
     * <p>Optional.
     */
    private String label;
    /**
     * Maximum length of the text in the element’s response.
     *
     * <p>Optional
     */
    private Integer len;
    /**
     * The formatted string of data to be displayed. Can contain a formatted value such as “5 stars”
     * or “$10” or “3.4 stars out of 5”.
     * <p>Required
     */
    private String value;

}
