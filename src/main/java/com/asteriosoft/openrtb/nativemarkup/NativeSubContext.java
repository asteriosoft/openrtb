package com.asteriosoft.openrtb.nativemarkup;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum NativeSubContext {
    /// General or mixed content.
    GENERAL_CONTENT(10),
    /// Primarily article content (which of course could include images, etc as part of the article)
    ARTICLE(11),
    /// Primarily video content
    VIDEO(12),
    /// Primarily audio content
    AUDIO(13),
    /// Primarily image content
    IMAGE(14),
    /// User-generated content - forums, comments, etc
    USER_GENERATED(15),

    /// General social content such as a general social network
    GENERAL_SOCIAL(20),
    /// Primarily email content
    EMAIL(21),
    /// Primarily chat/IM content
    CHAT(22),

    /// Content focused on selling products, whether digital or physical
    SELLING_PRODUCT(30),
    /// Application store/marketplace
    APP_STORE(31),
    /// Product reviews site primarily (which may sell product secondarily)
    PRODUCT_REVIEW(32),

    // 500+ exchange-specific
    ;
    private final int id;

    public boolean isEqual(Integer code) {
        if (code == null) return false;
        return id == code;
    }
}
