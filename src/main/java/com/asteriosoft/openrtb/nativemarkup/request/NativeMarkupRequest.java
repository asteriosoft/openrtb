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

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The Native Object defines the native advertising opportunity available for bid via this bidrequest. 
 * It will be included as a JSON-encoded string in the bid request’s imp.native field or as a direct JSON object, 
 * depending on the choice of the exchange. While OpenRTB 2.3/2.4 supports only JSON-encoded strings, many exchanges have implemented a formal object. 
 * Check with your integration docs.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class NativeMarkupRequest {
    /**
     * Version of the Native Markup version in use.
     * 
     * <p>Optional
     * <p>Default: 1.1
     */
    private String ver;
    
    /**
     * The context in which the ad appears. {@link com.asteriosoft.openrtb.nativemarkup.NativeContext}
     * 
     * <p>Recommended
     */
    private Integer context;
    
    /**
     * A more detailed context in which the ad appears {@link com.asteriosoft.openrtb.nativemarkup.NativeSubContext}
     * 
     * <p>Optional
     */
    private Integer contextsubtype;
    
    /**
     * The number of identical placements in this Layout {@link com.asteriosoft.openrtb.nativemarkup.NativePlacement}
     * 
     * <p>Recommended
     */
    private Integer plcmttype;
    
    /**
     * The number of identical placements in this Layout
     * 
     * <p>Optional
     * <p>Default: 1
     */
    private Integer plcmtcnt;

    /**
     * 0 for the first ad, 1 for the second ad, and so on. Note this would generally NOT be used in
     * combination with plcmtcnt - either you are auctioning multiple identical placements (in which case plcmtcnt>1, seq=0) or
     * you are holding separate auctions for distinct items in the feed (in which case plcmtcnt=1, seq=>=1)
     *
     * <p>Optional
     * <p>Default: 0
     */
   private Integer seq;
   
    /**
     * An array of Asset Objects.Any bid response must comply with the array of elements expressed in the bid request.
     * 
     * <p>Required
     */
    private List<AssetArg> assets;

    /**
     * Whether the supply source / impression supports returning an assetsurl instead of an asset object.
     * {@link com.asteriosoft.openrtb.nativemarkup.response.NativeMarkupResponse#assetsurl} <br/>
     * 0 or the absence of the field indicates no such support.
     */
    private Integer aurlsupport;

    /**
     * Whether the supply source / impression supports returning a dco url instead of an asset object.
     * {@link com.asteriosoft.openrtb.nativemarkup.response.NativeMarkupResponse#dcourl} <br/>
     * 0 or the absence of the field indicates no such support. Beta feature
     */
    private Integer durlsupport;

    /**
     * Specifies what type of event tracking is supported
     */
    private List<EventTrackerRequest> eventtrackers;

    /**
     * Set to 1 when the native ad supports buyer-specific privacy notice.
     * Set to 0 (or field absent) when the native ad doesn’t support custom privacy links or if support is unknown.
     */
    private Integer privacy;

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
