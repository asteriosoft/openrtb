/**
 * Geo.java
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
 * This object encapsulates various methods for specifying a geographic location. When subordinate to a Device object,
 * it indicates the location of the device which can also be interpreted as the user's current location. When
 * subordinate to a User object, it indicates the location of the user's home base (i.e., not necessarily
 * their current location).
 *
 * The lat/lon attributes should only be passed if they conform to the accuracy depicted in the
 * type attribute. For example, the centroid of a geographic region such as postal code should not be passed.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Geo {

    /**
     * Latitude from -90.0 to +90.0, where negative is south.
     */
    private Float lat;
    /**
     * Longitude from -180.0 to +180.0, where negative is west.
     */
    private Float lon;
    /**
     * Source of location data; recommended when passing lat/lon.
     */
    private Integer type;
    /**
     * Estimated location accuracy in meters; recommended when lat/lon are specified and derived
     * from a device's location services (i.e., type = 1). Note that this is the accuracy as reported from the device.
     * Consult OS specific documentation (e.g., Android, iOS) for exact interpretation.
     */
    private Integer accuracy;
    /**
     * Number of seconds since this geolocation fix was established. Note that devices may cache location
     * data across multiple fetches. Ideally, this value should be from the time the actual fix was taken.
     */
    private Integer lastfix;
    /**
     * Service or provider used to determine geolocation from IP address if applicable (i.e., type = 2).
     */
    private Integer ipservice;
    /**
     * Country code using ISO-3166-1-alpha-3.
     */
    private String country;
    /**
     * Region code using ISO-3166-2; 2-letter state code if USA.
     */
    private String region;
    /**
     * Region of a country using FIPS 10-4 notation. While OpenRTB supports this attribute, it has been
     * withdrawn by NIST in 2008.
     */
    private String regionfips104;
    /**
     * Google metro code; similar to but not exactly Nielsen DMAs. See Appendix A for a link to the codes.
     */
    private String metro;
    /**
     * City using United Nations Code for Trade & Transport Locations. See Appendix A for a link to the codes.
     */
    private String city;
    /**
     * Zip or postal code.
     */
    private String zip;
    /**
     * Local time as the number +/- of minutes from UTC.
     */
    private Integer utcoffset;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
