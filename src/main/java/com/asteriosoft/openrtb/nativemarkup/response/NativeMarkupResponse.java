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

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

/**
 * The native object is the top level JSON object which identifies a native response
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class NativeMarkupResponse {
    
    public static final String VERSION = "1.2";
    
    /**
     * Version of the Native Markup version in use. Default 1.1
     * <p>Optional.
     */
    private String ver;

    /**
     * List of native ad’s assets.
     * <p>Required.
     */
    private List<AssetValue> assets;
    /**
     * Destination Link. This is default link object for the ad. Individual assets can also have a link object
     * which applies if the asset is activated(clicked). If the asset doesn’t have a link object, the
     * parent link object applies.
     * <p>Required.
     */
    private LinkValue link;
    /**
     * Array of impression tracking URLs, expected to return a 1x1 image or 204 response -
     * typically only passed when using 3rd party trackers.
     * <p>Optional.
     */
    private List<String> imptrackers;

    /**
     * Optional JavaScript impression tracker. This is a valid HTML, Javascript is already wrapped in <script> tags.
     * It should be executed at impression time where it can be supported.
     */
    private String jstracker;

    /**
     * Array of {@link EventTracker} to run	with the ad, in	response to	the
     * declared	supported methods in the request.
     * <p>Optional.
     */
    private List<EventTracker> eventtrackers;
}
