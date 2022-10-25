/**
 * Device.java
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
 * This object provides information pertaining to the device through which the user is interacting. Device
 * information includes its hardware, platform, location, and carrier data. The device can refer to a
 * mobile handset, a desktop computer, set top box, or other digital device.
 *
 * <b>BEST PRACTICE</b>: There are currently no prominent open source lists for device makes, models, operating systems,
 * or carriers. Exchanges typically use commercial products or other proprietary lists for these attributes.
 * Until suitable open standards are available, exchanges are highly encouraged to publish lists of their device
 * make, model, operating system, and carrier values to bidders.
 *
 * <b>BEST PRACTICE</b>: Proper device IP detection in mobile is not straightforward. Typically it involves starting
 * at the left of the x-forwarded-for header, skipping private carrier networks (e.g., 10.x.x.x or 192.x.x.x),
 * and possibly scanning for known carrier IP ranges. Exchanges are urged to research and implement this feature
 * carefully when presenting device IP values to bidders.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Device {

    /**
     * Browser user agent string.
     *
     * Recommended attribute.
     */
    private String ua;
    /**
     * Location of the device assumed to be the user's current location defined by a Geo object.
     *
     * Recommended attribute.
     *
     * @see Geo
     */
    private Geo geo;
    /**
     * Standard "Do Not Track" flag as set in the header by the browser, where 0 = tracking is unrestricted,
     * 1 = do not track.
     *
     * Recommended attribute.
     */
    private Integer dnt;
    /**
     * "Limit Ad Tracking" signal commercially endorsed (e.g., iOS, Android), where 0 = tracking is unrestricted,
     * 1 = tracking must be limited per commercial guidelines.
     *
     * Recommended attribute.
     */
    private Integer lmt;

    /**
     * Structured user agent information defined by a UserAgent
     * object (see Section 3.2.29). If both ‘ua’ and ‘sua’ are present in
     * the bid request, ‘sua’ should be considered the more accurate
     * representation of the device attributes. This is because the ‘ua’
     * may contain a frozen or reduced user agent string.
     */
    private UserAgent sua;

    /**
     * IPv4 address closest to device.
     *
     * Recommended attribute.
     */
    private String ip;
    /**
     * IP address closest to device as IPv6.
     */
    private String ipv6;
    /**
     * The general type of device.
     */
    private Integer devicetype;
    /**
     * Device make (e.g., "Apple").
     */
    private String make;
    /**
     * Device model (e.g., "iPhone").
     */
    private String model;
    /**
     * Device operating system (e.g., "iOS").
     */
    private String os;
    /**
     * Device operating system version (e.g., "3.1.2").
     */
    private String osv;
    /**
     * Hardware version of the device (e.g., "5S" for iPhone 5S).
     */
    private String hwv;
    /**
     * Physical height of the screen in pixels.
     */
    private Integer h;
    /**
     * Physical width of the screen in pixels.
     */
    private Integer w;
    /**
     * Screen size as pixels per linear inch.
     */
    private Integer ppi;
    /**
     * The ratio of physical pixels to device independent pixels.
     */
    private Float pxratio;
    /**
     * Support for JavaScript, where 0 = no, 1 = yes.
     */
    private Integer js;
    /**
     * Indicates if the geolocation API will be available to JavaScript code running in the banner, where 0 = no, 1 = yes.
     */
    private Integer geofetch;
    /**
     * Version of Flash supported by the browser.
     */
    private String flashver;
    /**
     * Browser language using ISO-639-1-alpha-2.
     */
    private String language;
    /**
     * Carrier or ISP (e.g., "VERIZON"). "WIFI" is often used in mobile to indicate high bandwidth (e.g.,
     * video friendly vs. cellular).
     */
    private String carrier;
    /**
     * Mobile carrier as the concatenated MCC-MNC code (e.g., “310-005” identifies Verizon Wireless CDMA in the USA).
     * Refer to https://en.wikipedia.org/wiki/Mobile_country_code for further examples.
     * Note that the dash between the MCC and MNC parts is required to remove parsing ambiguity.
     */
    private String mccmnc;
    /**
     * Network connection type.
     */
    private Integer connectiontype;
    /**
     * ID sanctioned for advertiser use in the clear (i.e., not hashed).
     */
    private String ifa;
    /**
     * Hardware device ID (e.g., IMEI); hashed via SHA1.
     */
    private String didsha1;
    /**
     * Hardware device ID (e.g., IMEI); hashed via MD5.
     */
    private String didmd5;
    /**
     * Platform device ID (e.g., Android ID); hashed via SHA1.
     */
    private String dpidsha1;
    /**
     * Platform device ID (e.g., Android ID); hashed via MD5.
     */
    private String dpidmd5;
    /**
     * MAC address of the device; hashed via SHA1.
     */
    private String macsha1;
    /**
     * MAC address of the device; hashed via MD5.
     */
    private String macmd5;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
