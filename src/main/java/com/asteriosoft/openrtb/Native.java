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
package com.asteriosoft.openrtb;

import com.asteriosoft.openrtb.nativemarkup.request.NativeMarkupRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * This object represents a native type impression. Native ad units are intended to blend seamlessly into
 * the surrounding content (e.g., a sponsored Twitter or Facebook post). As such, the response must be
 * well-structured to afford the publisher fine-grained control over rendering.
 *
 * The Native Subcommittee has developed a companion specification to OpenRTB called the Dynamic Native Ads API.
 * It defines the request parameters and response markup structure of native ad units. This object provides
 * the means of transporting request parameters as an opaque string so that the specific parameters can evolve
 * separately under the auspices of the Dynamic Native Ads API. Similarly, the ad markup served will be
 * structured according to that specification.
 *
 * The presence of a Native as a subordinate of the Imp object indicates that this impression is offered
 * as a native type impression. At the publisher's discretion, that same impression may also be offered
 * as banner, video, and/or audio by also including as Imp subordinates objects of those types.
 * However, any given bid for the impression must conform to one of the offered types.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Native {

    /**
     * Request payload complying with the Native Ad Specification. May be String or NativeMarkupRequest object
     *
     * <b>Required attribute.</b>
     */
    private Object request;
    /**
     * <b>Optional</b>
     */
    private NativeMarkupRequest requestobj;
    /**
     * Version of the Dynamic Native Ads API to which request complies; highly recommended for efficient parsing.
     *
     * Recommended attribute.
     */
    private String ver;
    /**
     * List of supported API frameworks for this impression. If an API is not explicitly listed, it is assumed not to be supported.
     */
    private List<Integer> api;
    /**
     * Blocked creative attributes.
     */
    private List<Integer> battr;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
