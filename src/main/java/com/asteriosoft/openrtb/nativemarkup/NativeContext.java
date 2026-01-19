package com.asteriosoft.openrtb.nativemarkup;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum NativeContext {
    /// Content-centric context such as newsfeed, article, image gallery, video gallery, or similar
    CONTENT(1),
    /// Social-centric context such as social network feed, email, chat, or similar
    SOCIAL(2),
    /// Product context such as product listings, details, recommendations, reviews, or similar.
    PRODUCT(3),
    // 500+ exchange-specific
    ;
    private final int id;

    public boolean isEqual(Integer code) {
        if (code == null) return false;
        return id == code;
    }
}
