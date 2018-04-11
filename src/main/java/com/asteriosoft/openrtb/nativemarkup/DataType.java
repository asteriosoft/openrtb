package com.asteriosoft.openrtb.nativemarkup;

import java.util.HashMap;
import java.util.Map;

/**
 * Below is a list of common asset element types of native advertising at the time of writing this spec. 
 * This list is non-exhaustive and intended to be extended by the buyers and sellers as the format evolves.
 * An implementing exchange may not support all asset variants or introduce new ones unique to that system.
 */
public enum DataType {
    /**
     * Sponsored By message where response should contain the brand name of the sponsor.
     * 
     * <p>Text
     * <p>Required. Max 25 or longer.
     */
    sponsored(1),
    
    /**
     * Descriptive text associated with the product or service being advertised. 
     * Longer length of text in response may be truncated or ellipsed by the exchange.
     * 
     * <p>Text
     * <p>Recommended. Max 140 or longer.
     */
    desc(2),
    
    /**
     * Rating of the product being offered to the user. For example an app’s rating in an app store from 0-5.
     * 
     * <p>number formatted as string
     * <p>Optional. 0-5 integer formatted as string.
     */
    rating(3),
    
    /**
     * Number of social ratings or “likes” of the product being offered to the user.
     * 
     * <p>number formatted as string
     */
    likes(4),
    
    /**
     * Number downloads/installs of this product
     * 
     * <p>number formatted as string
     */
    downloads(5),
    
    /**
     * Price for product / app / in-app purchase. Value should include currency symbol in localised format.
     * 
     * <p>number formatted as string
     */
    price(6),
    
    /**
     * Sale price that can be used together with price to indicate a discounted price compared to a regular price.
     * Value should include currency symbol in localised format.
     * 
     * <p>number formatted as string
     */
    saleprice(7),
    
    /**
     * Phone number
     * 
     * <p>formatted string
     */
    phone(8),
    
    /**
     * Address
     * 
     * <p>text
     */
    address(9),
    
    /**
     * Additional descriptive text associated with the product or service being advertised
     * 
     * <p>text
     */
    desc2(10),
    
    /**
     * Display URL for the text ad. To be used when sponsoring entity doesn’t own the content. IE sponsored by BRAND on SITE (where SITE is transmitted in this field).
     * 
     * <p>text
     */
    displayurl(11),
    
    /**
     * CTA description - descriptive text describing a ‘call to action’ button for the destination URL.
     * 
     * <p>
     * <p>Optional. Max 15 or longer.
     */
    ctatext(12),
    ;
    
    private final int code;
    private DataType(int code) {
        this.code = code;
    }
    
    public int getCode() {
        return code;
    }
    
    private static final Map<Integer, DataType> map = new HashMap<>();
    static {
        for(DataType dt: values()) {
            map.put(dt.code, dt);
        }
    }
    
    public static DataType byCode(Integer id) {
        if (id == null) {
            return null;
        } else {
            return map.get(id);
        }
    }
}
