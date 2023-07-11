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

/**
 * This object describes the nature and behavior of the entity that is the source of the bid request upstream
 * from the exchange.  The primary purpose of this object is to define post-auction or upstream decisioning
 * when the exchange itself does not control the final decision.  A common example of this is header bidding,
 * but it can also apply to upstream server entities such as another RTB exchange, a mediation platform,
 * or an ad server combines direct campaigns with 3rd party demand in decisioning.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Source {

    /**
     * Entity responsible for the final impression sale decision, where 0 = exchange, 1 = upstream source.
     */
    private Integer fd;
    /**
     * Transaction ID that must be common across all participants in this bid request (e.g., potentially multiple exchanges).
     */
    private String tid;
    /**
     * Payment ID chain string containing embedded syntax described in the TAG Payment ID Protocol v1.0.
     */
    private String pchain;
    /**
     * Placeholder for exchange - specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
