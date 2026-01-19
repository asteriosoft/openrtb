/*
 *
 *  * Copyright 2023 Asteriosoft Inc.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.asteriosoft.openrtb.nativemarkup.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * The video object to be used for all video elements supported in the Native Ad. 
 * This corresponds to the Video object of OpenRTB. Exchange implementers can impose their own specific restrictions. 
 * Here are the required attributes of the Video Object. For optional attributes please refer to OpenRTB.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class VideoArg {
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

    private Map<String, Object> ext;
}
