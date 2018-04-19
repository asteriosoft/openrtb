/**
 * Content.java
 * <p>
 * Copyright 2017-2018 Asteriosoft. All Rights Reserved.
 * <p>
 * This software is the proprietary information of Asteriosoft.
 * Use is subject to license terms.
 */
package com.asteriosoft.openrtb;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Map;

/**
 * This object describes the content in which the impression will appear, which may be syndicated or
 * non-syndicated content. This object may be useful when syndicated content contains impressions and
 * does not necessarily match the publisher's general content. The exchange might or might not have knowledge
 * of the page where the content is running, as a result of the syndication method. For example might be a video
 * impression embedded in an iframe on an unknown web property or device.
 */
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Content {

    /**
     * ID uniquely identifying the content.
     */
    private String id;
    /**
     * Episode number.
     */
    private Integer episode;
    /**
     * Content title.
     *
     * Video Examples: "Search Committee" (television), "A New Hope" (movie), or "Endgame" (made for web).
     *
     * Non-Video Example: "Why an Antarctic Glacier Is Melting So Quickly" (Time magazine article).
     */
    private String title;
    /**
     * Content series.
     *
     * Video Examples: "The Office" (television), "Star Wars" (movie), or "Arby 'N' The Chief" (made for web).
     *
     * Non-Video Example: "Ecocentric" (Time Magazine blog).
     */
    private String series;
    /**
     * Content season; typically for video content (e.g., "Season 3").
     */
    private String season;
    /**
     * Artist credited with the content.
     */
    private String artist;
    /**
     * Genre that best describes the content (e.g., rock, pop, etc).
     */
    private String genre;
    /**
     * Album to which the content belongs; typically for audio.
     */
    private String album;
    /**
     * International Standard Recording Code conforming to ISO-3901.
     */
    private String isrc;
    /**
     * Details about the content Producer.
     *
     * @see Producer
     */
    private Producer producer;
    /**
     * URL of the content, for buy-side contextualization or review.
     */
    private String url;
    /**
     * Array of IAB content categories that describe the content producer.
     */
    private List<String> cat;
    /**
     * Production quality.
     */
    private Integer prodq;
    /**
     * Video quality per IAB's classification.
     *
     * @deprecated Deprecated in favor of prodq.
     */
    @Deprecated
    private Integer videoquality;
    /**
     * Type of content (game, video, text, etc.).
     */
    private Integer context;
    /**
     * Content rating (e.g., MPAA).
     */
    private String contentrating;
    /**
     * User rating of the content (e.g., number of stars, likes, etc.).
     */
    private String userrating;
    /**
     * Media rating per QAG guidelines.
     */
    private Integer qagmediarating;
    /**
     * Comma separated list of keywords describing the content.
     */
    private String keywords;
    /**
     * 0 = not live, 1 = content is live (e.g., stream, live blog).
     */
    private Integer livestream;
    /**
     * 0 = indirect, 1 = direct.
     */
    private Integer sourcerelationship;
    /**
     * Length of content in seconds; appropriate for video or audio.
     */
    private Integer len;
    /**
     * Content language using ISO-639-1-alpha-2.
     */
    private String language;
    /**
     * Indicator of whether or not the content is embeddable (e.g., an embeddable video player), where 0 = no, 1 = yes.
     */
    private Integer embeddable;
    /**
     * Additional content data. Each Data object represents a different data source.
     */
    private List<Data> data;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;
}
