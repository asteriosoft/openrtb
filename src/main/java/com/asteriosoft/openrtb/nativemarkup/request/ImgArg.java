package com.asteriosoft.openrtb.nativemarkup.request;

import com.asteriosoft.openrtb.nativemarkup.ImgType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

/**
 * The Image object to be used for all image elements of the Native ad such as Icons, Main Image, etc
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImgArg {
    /**
     * Type ID of the image element supported by the publisher. The publisher can display this information in an appropriate format.
     * <br>{@link ImgType}
     * 
     * <p>Optional
     */
    private Integer type;
    
    /**
     * Width of the image in pixels.
     * 
     * <p>Optional
     */
    private Integer w;
    
    /**
     * The minimum requested width of the image in pixels. This option should be used for any rescaling of images by the client.
     * Either w or wmin should be transmitted. If only w is included, it should be considered an exact requirement.
     * 
     * <p>Recommended
     */
    private Integer wmin;

    /**
     * Height of the image in pixels.
     * 
     * <p>Optional
     */
    private Integer h;
    
    /**
     * The minimum requested height of the image in pixels. This option should be used for any rescaling of images by the client.
     * Either h or hmin should be transmitted. If only h is included, it should be considered an exact requirement.
     * 
     * <p>Recommended
     */
    private Integer hmin;
    
    /**
     * Whitelist of content MIME types supported. Popular MIME types include, but are not limited to “image/jpg” “image/gif”.
     * <br>If blank, assume all types are allowed
     * 
     *  <p>Optional
     */
    private List<String> mimes;
}
