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
 * Used for ‘call to action’ assets, or other links from the Native ad.  This Object should be
 * associated to its peer object in the parent Asset Object or as the master link in the top level
 * Native Ad response object.  When that peer object is activated (c
 * licked) the action should take the user to the location of the link.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class LinkValue {
    /**
     * Landing URL of the clickable link.
     * <p>Required.
     */
    private String url;
    /**
     * List of third-party tracker URLs to be fired on click of the URL.
     * <p>Optional
     */
    private List<String> clicktrackers;
    /**
     * Fallback URL for deeplink. To be used if the URL given in url is not
     * supported by the device.
     * <p>Optional
     */
    private String fallback;
}
