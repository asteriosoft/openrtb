/**
 * Segment.java
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
 * Segment objects are essentially key-value pairs that convey specific units of data about the user. The parent
 * Data object is a collection of such values from a given data provider. The specific segment names and value
 * options must be published by the exchange a priori to its bidders.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Segment {

    /**
     * ID of the data segment specific to the data provider.
     */
    private String id;
    /**
     * Name of the data segment specific to the data provider.
     */
    private String name;
    /**
     * String representation of the data segment value.
     */
    private String value;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
