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

import java.util.List;
import java.util.Map;

/**
 * This object contains information known or derived about the human user of the device (i.e., the audience
 * for advertising). The user id is an exchange artifact and may be subject to rotation or other privacy
 * policies. However, this user ID must be stable long enough to serve reasonably as the basis for frequency
 * capping and retargeting.
 */
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class User {
    /**
     * Exchange-specific ID for the user. At least one of id or buyeruid is recommended.
     * Recommended attribute.
     */
    private String id;
    /**
     * Buyer-specific ID for the user as mapped by the exchange for the buyer. At least one of buyeruid
     * or id is recommended.
     * Recommended attribute.
     */
    private String buyeruid;
    /**
     * Year of birth as a 4-digit integer.
     */
    private Integer yob;
    /**
     * Gender, where "M" = male, "F" = female, "O" = known to be other (i.e., omitted is unknown).
     */
    private String gender;
    /**
     * Comma separated list of keywords, interests, or intent.
     */
    private String keywords;
    /**
     * Optional feature to pass bidder data that was set in the exchange's cookie. The string must be in
     * base85 cookie safe characters and be in any format. Proper JSON encoding must be used to include
     * "escaped" quotation marks.
     */
    private String customdata;
    /**
     * Location of the user's home base defined by a Geo object. This is not necessarily their current location.
     *
     * @see Geo
     */
    private Geo geo;
    /**
     * Additional user data. Each Data object represents a different data source.
     *
     * @see Data
     */
    private List<Data> data;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */

    private String consent;

    private List<Object> eids;

    private Map<String, Object> ext;
}
