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

import com.asteriosoft.openrtb.nativemarkup.ImgType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * The Image object to be used for all image elements of the Native ad such as Icons, Main Image, etc
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ImgArg {
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

    private Map<String, Object> ext;
}
