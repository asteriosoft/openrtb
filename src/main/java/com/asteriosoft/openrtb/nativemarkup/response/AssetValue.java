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

/**
 * Corresponds to the Asset Object in the request.  The main container object for each asset
 * requested or supported by Exchange on behalf of the rendering client.  Any object that is
 * required is to be flagged as such.  Only one of the {title,img,video,data} objects should be
 * present in each object.  All others should be null/absent.  The id is to be unique within the
 * AssetObject array so that the response can be aligned.
 */
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AssetValue {
    /**
     * Unique asset ID, assigned by exchange, must match one of the asset IDs in request.
     * <p>Required.
     */
    private Integer id;
    
    /**
     * If asset is required value is 1. Default is 0.
     * <p>Optional.
     */
    private Integer required;
    
    /**
     * Title object for title assets.
     * <p>Recommended.
     */
    private TitleValue title;
    
    /**
     * Image object for image assets.
     * <p>Recommended.
     */
    private ImgValue img;
    
    /**
     * Video object for video assets. 
     * Note that in-stream (ie preroll, etc) video ads are not part of Native.  Native ads may contain a video as the ad creative itself.
     * <p>Optional.
     */
    private VideoValue video;
    
    /**
     * Data object for brand name, description, ratings, prices etc.
     * <p>Recommended.
     */
    private DataValue data;
    /**
     * Link object for call to actions.
     * <p>Optional.
     */
    private LinkValue link;
}
