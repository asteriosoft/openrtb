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
