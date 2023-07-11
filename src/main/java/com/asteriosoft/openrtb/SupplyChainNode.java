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
public final class SupplyChainNode {

    /**
     * The canonical domain name of the SSP, Exchange, Header
     * Wrapper, etc system that bidders connect to. This may be
     * the operational domain of the system, if that is different than
     * the parent corporate domain, to facilitate WHOIS and
     * reverse IP lookups to establish clear ownership of the
     * delegate system. This should be the same value as used to
     * identify sellers in an ads.txt file if one exists.
     * <b>Required attribute.</b>
     */
    private String asi;

    /**
     * The identifier associated with the seller or reseller account
     * within the advertising system. This must contain the same value
     * used in transactions (i.e. OpenRTB bid requests) in the field
     * specified by the SSP/exchange. Typically, in OpenRTB, this is
     * publisher.id. For OpenDirect it is typically the publisher’s
     * organization ID.Should be limited to 64 characters in length.
     * <b>Required attribute.</b>
     */
    private String sid;

    /**
     * The OpenRTB RequestId of the request as issued by this
     * seller.
     */
    private String rid;

    /**
     * The name of the company (the legal entity) that is paid for
     * inventory transacted under the given seller_ID. This value is
     * optional and should NOT be included if it exists in the
     * advertising system’s sellers.json file.
     */
    private String name;

    /**
     * The business domain name of the entity represented by this
     * node. This value is optional and should NOT be included if it
     * exists in the advertising system’s sellers.json file.
     */
    private String domain;

    /**
     * Indicates whether this node will be involved in the flow of
     * payment for the inventory. When set to 1, the advertising
     * system in the asi field pays the seller in the sid field, who is
     * responsible for paying the previous node in the chain. When
     * set to 0, this node is not involved in the flow of payment for
     * the inventory. For version 1.0 of SupplyChain, this property
     * should always be 1. Implementers should ensure that they
     * propagate this field onwards when constructing SupplyChain
     * objects in bid requests sent to a downstream advertising
     * system.
     */
    private Integer hp;

    /**
     * Placeholder for advertising-system specific extensions to this
     * object
     */
    private Map<String, Object> ext;

}
