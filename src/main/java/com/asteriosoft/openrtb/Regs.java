/**
 * Regs.java
 * <p>
 * Copyright 2017-2018 Asteriosoft. All Rights Reserved.
 * <p>
 * This software is the proprietary information of Asteriosoft.
 * Use is subject to license terms.
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
     * Flag that indicates whether or not the request is subject to
     * GDPR regulations 0 = No, 1 = Yes, omission indicates
     * Unknown. Refer to Section 7.5 for more information.
     */
    private Integer gdpr;

    /**
     * Communicates signals regarding consumer privacy under US
     * privacy regulation. See US Privacy String specifications. Refer
     * to Section 7.5 for more information.
     */
    private Integer us_privacy;

    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
