package com.asteriosoft.openrtb.nativemarkup;

import java.util.HashMap;
import java.util.Map;

/**
 * Below is a list of common image asset element types of native advertising at the time of writing this spec. 
 * This list is non-exhaustive and intended to be extended by the buyers and sellers as the format evolves. 
 * An implementing exchange may not support all asset variants or may introduce new ones unique to that system.
 */
public enum ImgType {
    /**
     * Icon image.
     *  
     * <p>Optional.
     * 
     * <br>max height: at least 50
     * <br>aspect ratio: 1:1
     */
    Icon(1),
    
    /**
     * Logo image for the brand/app.
     * 
     * <p>Deprecated 
     */
    Logo(2),
    
    /**
     * Main Image. Large image preview for the ad.
     * 
     * <p> At least one of 2 size variants required:
     * <br>
     * <br>Small Variant:
     * <br>max height: at least 200
     * <br>max width: at least 200, 267, or 382
     * <br>aspect ratio: 1:1, 4:3, or 1.91:1
     * <br>
     * <br>Large Variant:
     * <br>max height: at least 627
     * <br>max width: at least 627, 836, or 1198
     * <br>aspect ratio: 1:1, 4:3, or 1.91:1    
     */
    Main(3),
    ;
    
    private final int code;
    private ImgType(int code) {
        this.code = code;
    }
    
    public int getCode() {
        return code;
    }
    
    private static final Map<Integer, ImgType> map = new HashMap<>();
    static {
        for(ImgType it: values()) {
            map.put(it.code, it);
        }
    }
    
    public static ImgType byCode(Integer id) {
        if (id == null) {
            return null;
        } else {
            return map.get(id);
        }
    }
}
