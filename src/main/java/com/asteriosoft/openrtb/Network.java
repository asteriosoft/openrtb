package com.asteriosoft.openrtb;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Network {


    /**
     * A unique identifier assigned by the publisher. This may not be
     * a unique identifier across all supply sources.
     */
    private String id;

    /**
     * Network the content is on (e.g., a TV network like “ABC")
     */
    private String name;

    /**
     * The primary domain of the network (e.g. “abc.com” in the
     * case of the network ABC). It is recommended to include the
     * top private domain (PSL+1) for DSP targeting normalization
     * purposes.
     */
    private String domain;

    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;


}
