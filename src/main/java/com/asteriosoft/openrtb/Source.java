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
