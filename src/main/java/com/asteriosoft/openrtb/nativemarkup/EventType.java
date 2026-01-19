package com.asteriosoft.openrtb.nativemarkup;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EventType {

    /// Impression
    IMPRESSION(1),
    /// Visible impression using MRC definition at 50% in view for 1 second
    VIEWABLE_MRC50(2),
    /// 100% in view for 1 second (i.e., GroupM standard)
    VIEWABLE_MRC100(3),
    /// Visible impression for video using MRC definition at 50% in view for 2 seconds
    VIEWABLE_VIDEO50(4),
    // 500+ exchange-specific
    ;
    private final int id;

    public boolean isEqual(Integer code) {
        if (code == null) return false;
        return id == code;
    }
}
