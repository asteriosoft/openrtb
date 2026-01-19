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

import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class EventTracker {

    /**
     * Type of event to track. {@link com.asteriosoft.openrtb.nativemarkup.EventType}
     *
     * <p>Required
     */
    private Integer event;
    /**
     * Type of tracking requested. {@link com.asteriosoft.openrtb.nativemarkup.TrackingMethod}
     *
     * <p>Required
     */
    private Integer method;
    /**
     * The URL of the image or js.
     *
     * <p>Optional
     */
    private String url;

    /**
     * To be agreed individually with the exchange, an array of key:value objects for custom tracking,
     * for example the account number of the DSP with a tracking company. IE {“accountnumber”:”123”}.
     */
    private Map<String, String> customdata;

    /**
     * This object is a placeholder that may contain custom JSON agreed to by the parties to support flexibility beyond the
     * standard defined in this specification
     */
    private Map<String, Object> ext;
}
