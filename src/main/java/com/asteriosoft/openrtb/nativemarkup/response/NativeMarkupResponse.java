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

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     * URL of an alternate source for the assets object.
     * The expected response is a JSON object mirroring the assets object in the bid response, subject to certain
     * requirements as specified in the individual objects. Where present, overrides the asset object in the response.
     */
    private String assetsurl;
    /**
     * URL where a dynamic creative specification may be found for populating this ad, per the Dynamic Content Ads Specification.
     * Note this is a beta option as the interpretation of the Dynamic Content Ads
     */
    private String dcourl;
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
     * Array of {@link EventTracker} to run with the ad, in response to the declared supported methods in the request.
     * <p>Optional.
     */
    private List<EventTracker> eventtrackers;

    /**
     * If support was indicated in the request, URL of a page informing the user about the buyer’s targeting activity.
     * <p>Optional.
     */
    private String privacy;
    /**
     * This object is a placeholder that may contain custom JSON agreed to by the parties to support flexibility beyond the
     * standard defined in this specification
     */
    private Map<String, Object> ext;

    @JsonIgnore
    private Map<String, Object> nonOpenRtbFields;

    @JsonAnySetter
    public void addNonOpenRtbField(String key, Object value) {
        if (nonOpenRtbFields == null) {
            nonOpenRtbFields = new HashMap<>();
        }
        nonOpenRtbFields.put(key, value);
    }

    @JsonAnyGetter
    public Map<String, Object> getNonOpenRtbFields() {
        return nonOpenRtbFields;
    }
}
