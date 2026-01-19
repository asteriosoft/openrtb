package com.asteriosoft.openrtb.nativemarkup;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TrackingMethod {
    /// Image-pixel tracking - URL provided will be inserted as a 1x1 pixel at the time of the event.
    PIXEL(1),
    /// Javascript-based tracking - URL provided will be inserted as a js tag at the time of the event.
    JS(2),
    // 500+ exchange-specific
    ;
    private final int id;

    public boolean isEqual(Integer code) {
        if (code == null) return false;
        return id == code;
    }
}
