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
public final class UID {

    /**
     * The identifier for the user.
     */
    private String id;

    /**
     * Type of user agent the ID is from. It is highly recommended to set this, as
     * many DSPs separate app-native IDs from browser-based IDs and require a type
     * value for ID resolution. Refer to List: Agent Types in AdCOM 1.0
     */
    private Integer atype;

    /**
     * Placeholder for vendor specific extensions to this object
     */
    private Map<String, Object> ext;

}
