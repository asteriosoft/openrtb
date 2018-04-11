package com.asteriosoft.openrtb.nativemarkup.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

/**
 * The video object to be used for all video elements supported in the Native Ad. 
 * This corresponds to the Video object of OpenRTB. Exchange implementers can impose their own specific restrictions. 
 * Here are the required attributes of the Video Object. For optional attributes please refer to OpenRTB.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VideoArg {
    /**
     * Content MIME types supported. Popular MIME types include, but are not limited to “video/x-mswmv” for Windows Media, 
     * and “video/x-flv” for Flash Video, or “video/mp4”. Note that native frequently does not support flash.
     * 
     * <p>Required
     */
    private List<String> mimes;
    
    /**
     * Minimum video ad duration in seconds
     * 
     * <p>Required
     */
    private Integer minduration;
    
    /**
     * Maximum video ad duration in seconds
     * 
     * <p>Required 
     */
    private Integer maxduration;
    
    /**
     * An array of video protocols the publisher can accept in the bid response. See OpenRTB Table ‘Video Bid Response Protocols’ for a list of possible values.
     * 
     * <p>Required 
     */
    private List<Integer> protocols;
}
