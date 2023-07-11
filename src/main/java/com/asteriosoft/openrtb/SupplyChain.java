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

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SupplyChain {

    /**
     * Flag indicating whether the chain contains all nodes involved
     * in the transaction leading back to the owner of the site, app
     * or other medium of the inventory, where 0 = no, 1 = yes.
     * <b>Required attribute.</b>
     */
    private Integer complete;

    /**
     * Array of SupplyChainNode objects in the order of the chain. In a
     * complete supply chain, the first node represents the initial advertising system and seller ID involved in the transaction, i.e.
     * the owner of the site, app, or other medium. In an incomplete
     * supply chain, it represents the first known node. The last node
     * represents the entity sending this bid request.
     * <b>Required attribute.</b>
     */
    private List<SupplyChainNode> nodes;

    /**
     * Version of the supply chain specification in use, in the format
     * of “major.minor”. For example, for version 1.0 of the spec,
     * use the string “1.0”.
     * <b>Required attribute.</b>
     */
    private String ver;

    /**
     * Placeholder for advertising-system specific extensions to this
     * object
     */
    Map<String, Object> ext;


}
