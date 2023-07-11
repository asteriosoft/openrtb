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
 * This object contains any legal, governmental, or industry regulations that apply to the request.
 * The coppa flag signals whether or not the request falls under the United States Federal Trade Commission's
 * regulations for the United States Children's Online Privacy Protection Act ("COPPA").
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Regs {

    /**
     * Flag indicating if this request is subject to the COPPA regulations established by the USA FTC, where 0 = no,
     * 1 = yes.
     */
    private Integer coppa;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
