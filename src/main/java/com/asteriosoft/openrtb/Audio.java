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

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * This object represents an audio type impression. Many of the fields are non-essential for minimally viable transactions,
 * but are included to offer fine control when needed. Audio in OpenRTB generally assumes compliance with the DAAST standard.
 * As such, the notion of companion ads is supported by optionally including an array of Banner objects that define these companion ads.
 *
 * The presence of a Audio as a subordinate of the Imp object indicates that this impression is offered as an audio type impression.
 * At the publisher's discretion, that same impression may also be offered as banner, video, and/or native by also including as Imp
 * subordinates objects of those types. However, any given bid for the impression must conform to one of the offered types.
 *
 * @see Banner
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Audio {

    /**
     * Content MIME types supported. Popular MIME types may include "video/x-ms-wmv" for Windows Media
     * and "video/x-flv" for Flash Video.
     *
     * <b>Required attribute.</b>
     */
    private List<String> mimes;
    /**
     * Minimum video ad duration in seconds.
     *
     * Recommended attribute.
     */
    private Integer minduration;
    /**
     * Maximum video ad duration in seconds.
     *
     * Recommended attribute.
     */
    private Integer maxduration;

    /**
     * Indicates the total amount of time that advertisers may fill for a
     * “dynamic” audio ad pod, or the dynamic portion of a “hybrid”
     * ad pod. This field is required only for the dynamic portion(s) of
     * audio ad pods. This field refers to the length of the entire ad
     * break, whereas minduration/maxduration/rqddurs are
     * constraints relating to the slots that make up the pod.
     * Recommended attribute.
     */
    private Integer poddur;

    /**
     * Array of supported video protocols. At least one supported protocol must be specified in either the protocol or protocols attribute.
     *
     * Recommended attribute.
     */
    private List<Integer> protocols;
    /**
     * Indicates the start delay in seconds for pre-roll, mid-roll, or post-roll ad placements.
     *
     * Recommended attribute.
     */
    private Integer startdelay;

    /**
     * Precise acceptable durations for audio creatives in seconds. This
     * field specifically targets the live audio/radio use case where
     * non-exact ad durations would result in undesirable ‘dead air’.
     * This field is mutually exclusive with minduration and
     * maxduration; if rqddurs is specified, minduration and
     * maxduration must not be specified and vice versa.
     */
    private List<Integer> rqddurs;

    /**
     * Unique identifier indicating that an impression opportunity
     * belongs to an audioad pod. If multiple impression opportunities
     * within a bid request share the same podid, this indicates that
     * those impression opportunities belong to the same audio ad
     * pod.
     */
    private String podid;

    /**
     * The sequence (position) of the audio ad pod within a
     * content stream. Refer to List: Pod Sequence in AdCOM 1.0
     * for guidance on the use of this field.
     * Default: 0
     */
    private Integer podseq;

    /**
     * If multiple ad impressions are offered in the same bid request, the sequence number will allow for
     * the coordinated delivery of multiple creatives.
     */
    @Deprecated
    private Integer sequence;

    /**
     * For audio ad pods, this value indicates that the seller can
     * guarantee delivery against the indicated sequence. Refer to
     * List: Slot Position in Pod in AdCOM 1.0 for guidance on the
     * use of this field.
     * Default: 0
     */
    private Integer slotinpod;

    /**
     * Minimum CPM per second. This is a price floor for the
     * “dynamic” portion of an audio ad pod, relative to the duration
     * of bids an advertiser may submit.
     */
    private Integer mincpmpersec;

    /**
     * Blocked creative attributes.
     */
    private List<Integer> battr;
    /**
     * Maximum extended ad duration if extension is allowed.
     * If blank or 0, extension is not allowed.
     * If -1, extension is allowed, and there is no time limit imposed.
     * If greater than 0, then the value represents the number of seconds of extended play supported beyond the maxduration value.
     */
    private Integer maxextended;
    /**
     * Minimum bit rate in Kbps.
     */
    private Integer minbitrate;
    /**
     * Maximum bit rate in Kbps.
     */
    private Integer maxbitrate;
    /**
     * Supported delivery methods (e.g., streaming, progressive). If none specified, assume all are supported.
     */
    private List<Integer> delivery;
    /**
     * Array of Banner objects if companion ads are available.
     *
     * @see Banner
     */
    private List<Banner> companionad;
    /**
     * List of supported API frameworks for this impression. If an API is not explicitly listed, it is assumed
     * not to be supported.
     */
    private List<Integer> api;
    /**
     * Supported VAST companion ad types. Recommended if companion Banner objects are included via the
     * companionad array.
     */
    private List<Integer> companiontype;
    /**
     * The maximum number of ads that can be played in an ad pod.
     */
    private Integer maxseq;
    /**
     * Type of audio feed.
     */
    private Integer feed;
    /**
     * Indicates if the ad is stitched with audio content or delivered independently, where 0 = no, 1 = yes.
     */
    private Integer stitched;
    /**
     * Volume normalization mode.
     */
    private Integer nvol;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
