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

package com.asteriosoft.openrtb.nativemarkup.response;


import com.asteriosoft.openrtb.nativemarkup.ImgType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Corresponds to the Image Object in the request.   The Image object to be used for all image
 * elements of the Native ad such as Icons, Main Image, etc.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ImgValue {
    /**
     * Type ID
     * <br>{@link ImgType}
     *
     * <p>Optional
     */
    private Integer type;
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
