package com.asteriosoft.openrtb.nativemarkup;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum NativePlacement {
    /// In the feed of content - for example as an item inside the organic feed/grid/listing/carousel.
    IN_FEED(1),
    /// In the atomic unit of the content - IE in the article page or single image page
    ATOMIC_UNIT(2),
    /// Outside the core content - for example in the ads section on the right rail, as a banner-style placement near the content, etc.
    OUTSIDE_CONTENT(3),
    /// Recommendation widget, most commonly presented below the article content.
    RECOMMENDATION(4),
    // 500+ exchange-specific
    ;
    private final int id;

    public boolean isEqual(Integer code) {
        if (code == null) return false;
        return id == code;
    }
}
