package com.asteriosoft.openrtb.nativemarkup.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Corresponds to the Image Object in the request.   The Image object to be used for all image
 * elements of the Native ad such as Icons, Main Image, etc.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImgValue {
    /**
     * Url to the image asset.
     * <p>Required.
     */
    private String url;
    /**
     * Width image
     * <p>Required.
     */
    private Integer w;
    /**
     * Height image.
     * <p>Required.
     */
    private Integer h;

}
