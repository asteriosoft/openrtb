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

import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Channel {

    /**
     * A unique identifier assigned by the publisher. This may not be
     * a unique identifier across all supply sources.v
     */
    private String id;

    /**
     * Channel the content is on (e.g., a local channel like "WABC-TV")
     */
    private String name;

    /**
     * The primary domain of the channel (e.g. “abc7ny.com” in the
     * case of the local channel WABC-TV). It is recommended to
     * include the top private domain (PSL+1) for DSP targeting
     * normalization purposes.
     */
    private String domain;

    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;

}
