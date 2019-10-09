/**
 * Impression.java
 * <p>
 * Copyright 2017-2018 Asteriosoft. All Rights Reserved.
 * <p>
 * This software is the proprietary information of Asteriosoft.
 * Use is subject to license terms.
 */
package com.asteriosoft.openrtb;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * This object describes an ad placement or impression being auctioned. A single bid request can include multiple
 * Imp objects, a use case for which might be an exchange that supports selling all ad positions on a given page.
 * Each Imp object has a required ID so that bids can reference them individually.
 * <p>
 * The presence of Banner, Video, and/or Native objects subordinate to the Imp object indicates the type of impression
 * being offered. The publisher can choose one such type which is the typical case or mix them at their discretion.
 * However, any given bid for the impression must conform to one of the offered types.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Imp {

    public static final String DEFAULT_BIDFLOORCUR = "USD";
    @JsonIgnore
    private Integer hashCode;

    /**
     * A unique identifier for this impression within the context of the bid request
     * (typically, starts with 1 and increments.
     *
     * <b>Required attribute.</b>
     */
    private String id;

    /**
     * An array of Metric object (Section 3.2.5).
     */
    private List<Metric> metric;

    /**
     * A Banner object; required if this impression is offered as a banner ad opportunity.
     *
     * @see Banner
     */
    private Banner banner;
    /**
     * A Video object; required if this impression is offered as a video ad opportunity.
     *
     * @see Video
     */
    private Video video;
    /**
     * An Audio object; required if this impression is offered as an audio ad opportunity.
     *
     * @see Audio
     */
    private Audio audio;
    /**
     * A Native object; required if this impression is offered as a native ad opportunity.
     *
     * @see Native
     */
    @JsonProperty("native")
    private Native nnative;
    /**
     * A Pmp object containing any private marketplace deals in effect for this impression.
     *
     * @see Pmp
     */
    private Pmp pmp;
    /**
     * Name of ad mediation partner, SDK technology, or player responsible for rendering ad (typically video or mobile).
     * Used by some ad servers to customize ad code by partner. Recommended for video and/or apps.
     */
    private String displaymanager;
    /**
     * Version of ad mediation partner, SDK technology, or player responsible for rendering ad (typically video or
     * mobile). Used by some ad servers to customize ad code by partner. Recommended for video and/or apps.
     */
    private String displaymanagerver;
    /**
     * 1 = the ad is interstitial or full screen, 0 = not interstitial.
     * <p>
     * Default: 0
     */
    private Integer instl;
    /**
     * Identifier for specific ad placement or ad tag that was used to initiate the auction. This can be useful
     * for debugging of any issues, or for optimization by the buyer.
     */
    private String tagid;
    /**
     * Minimum bid for this impression expressed in CPM.
     * <p>
     * Default: 0
     */
    private BigDecimal bidfloor;
    /**
     * Currency specified using ISO-4217 alpha codes. This may be different from bid currency returned by
     * bidder if this is allowed by the exchange.
     * <p>
     * Default: USD
     */
    private String bidfloorcur;
    /**
     * Indicates the type of browser opened upon clicking the creative in an app, where 0 = embedded, 1 = native.
     * Note that the Safari View Controller in iOS 9.x devices is considered a native browser for purposes of this attribute.
     */
    private Integer clickbrowser;
    /**
     * Flag to indicate if the impression requires secure HTTPS URL creative assets and markup,
     * where 0 = non-secure, 1 = secure. If omitted, the secure state is unknown, but non-secure HTTP support
     * can be assumed.
     */
    private Integer secure;
    /**
     * Array of exchange-specific names of supported iframe busters.
     */
    private List<String> iframebuster;
    /**
     * Advisory as to the number of seconds that may elapse between the auction and the actual impression.
     */
    private Integer exp;
    /**
     * Placeholder for exchange-specific extensions to OpenRTB.
     */
    private Map<String, Object> ext;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.hashCode = null;
        this.id = id;
    }

    public List<Metric> getMetric() {
        return metric;
    }

    public void setMetric(List<Metric> metric) {
        this.hashCode = null;
        this.metric = metric;
    }

    public Banner getBanner() {
        return banner;
    }

    public void setBanner(Banner banner) {
        this.hashCode = null;
        this.banner = banner;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.hashCode = null;
        this.video = video;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.hashCode = null;
        this.audio = audio;
    }

    public Native getNnative() {
        return nnative;
    }

    public void setNnative(Native nnative) {
        this.hashCode = null;
        this.nnative = nnative;
    }

    public Pmp getPmp() {
        return pmp;
    }

    public void setPmp(Pmp pmp) {
        this.hashCode = null;
        this.pmp = pmp;
    }

    public String getDisplaymanager() {
        return displaymanager;
    }

    public void setDisplaymanager(String displaymanager) {
        this.hashCode = null;
        this.displaymanager = displaymanager;
    }

    public String getDisplaymanagerver() {
        return displaymanagerver;
    }

    public void setDisplaymanagerver(String displaymanagerver) {
        this.hashCode = null;
        this.displaymanagerver = displaymanagerver;
    }

    public Integer getInstl() {
        return instl;
    }

    public void setInstl(Integer instl) {
        this.hashCode = null;
        this.instl = instl;
    }

    public String getTagid() {
        return tagid;
    }

    public void setTagid(String tagid) {
        this.hashCode = null;
        this.tagid = tagid;
    }

    public BigDecimal getBidfloor() {
        return bidfloor;
    }

    public void setBidfloor(BigDecimal bidfloor) {
        this.hashCode = null;
        this.bidfloor = bidfloor;
    }

    public String getBidfloorcur() {
        return bidfloorcur;
    }

    public void setBidfloorcur(String bidfloorcur) {
        this.hashCode = null;
        this.bidfloorcur = bidfloorcur;
    }

    public Integer getClickbrowser() {
        return clickbrowser;
    }

    public void setClickbrowser(Integer clickbrowser) {
        this.hashCode = null;
        this.clickbrowser = clickbrowser;
    }

    public Integer getSecure() {
        return secure;
    }

    public void setSecure(Integer secure) {
        this.hashCode = null;
        this.secure = secure;
    }

    public List<String> getIframebuster() {
        return iframebuster;
    }

    public void setIframebuster(List<String> iframebuster) {
        this.hashCode = null;
        this.iframebuster = iframebuster;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.hashCode = null;
        this.exp = exp;
    }

    public Map<String, Object> getExt() {
        return ext;
    }

    public void setExt(Map<String, Object> ext) {
        this.hashCode = null;
        this.ext = ext;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Imp imp = (Imp) o;

        if (id != null ? !id.equals(imp.id) : imp.id != null) return false;
        if (metric != null ? !metric.equals(imp.metric) : imp.metric != null) return false;
        if (banner != null ? !banner.equals(imp.banner) : imp.banner != null) return false;
        if (video != null ? !video.equals(imp.video) : imp.video != null) return false;
        if (audio != null ? !audio.equals(imp.audio) : imp.audio != null) return false;
        if (nnative != null ? !nnative.equals(imp.nnative) : imp.nnative != null) return false;
        if (pmp != null ? !pmp.equals(imp.pmp) : imp.pmp != null) return false;
        if (displaymanager != null ? !displaymanager.equals(imp.displaymanager) : imp.displaymanager != null)
            return false;
        if (displaymanagerver != null ? !displaymanagerver.equals(imp.displaymanagerver) : imp.displaymanagerver != null)
            return false;
        if (instl != null ? !instl.equals(imp.instl) : imp.instl != null) return false;
        if (tagid != null ? !tagid.equals(imp.tagid) : imp.tagid != null) return false;
        if (bidfloor != null ? !bidfloor.equals(imp.bidfloor) : imp.bidfloor != null) return false;
        if (bidfloorcur != null ? !bidfloorcur.equals(imp.bidfloorcur) : imp.bidfloorcur != null) return false;
        if (clickbrowser != null ? !clickbrowser.equals(imp.clickbrowser) : imp.clickbrowser != null) return false;
        if (secure != null ? !secure.equals(imp.secure) : imp.secure != null) return false;
        if (iframebuster != null ? !iframebuster.equals(imp.iframebuster) : imp.iframebuster != null) return false;
        if (exp != null ? !exp.equals(imp.exp) : imp.exp != null) return false;
        return ext != null ? ext.equals(imp.ext) : imp.ext == null;
    }

    @Override
    public int hashCode() {
        if (hashCode == null) {
            int result = id != null ? id.hashCode() : 0;
            result = 31 * result + (metric != null ? metric.hashCode() : 0);
            result = 31 * result + (banner != null ? banner.hashCode() : 0);
            result = 31 * result + (video != null ? video.hashCode() : 0);
            result = 31 * result + (audio != null ? audio.hashCode() : 0);
            result = 31 * result + (nnative != null ? nnative.hashCode() : 0);
            result = 31 * result + (pmp != null ? pmp.hashCode() : 0);
            result = 31 * result + (displaymanager != null ? displaymanager.hashCode() : 0);
            result = 31 * result + (displaymanagerver != null ? displaymanagerver.hashCode() : 0);
            result = 31 * result + (instl != null ? instl.hashCode() : 0);
            result = 31 * result + (tagid != null ? tagid.hashCode() : 0);
            result = 31 * result + (bidfloor != null ? bidfloor.hashCode() : 0);
            result = 31 * result + (bidfloorcur != null ? bidfloorcur.hashCode() : 0);
            result = 31 * result + (clickbrowser != null ? clickbrowser.hashCode() : 0);
            result = 31 * result + (secure != null ? secure.hashCode() : 0);
            result = 31 * result + (iframebuster != null ? iframebuster.hashCode() : 0);
            result = 31 * result + (exp != null ? exp.hashCode() : 0);
            result = 31 * result + (ext != null ? ext.hashCode() : 0);
            hashCode = result;
        }
        return hashCode;
    }

    public Imp copy() {
        final Imp res = new Imp();
        res.setBanner(getBanner());
        res.setVideo(getVideo());
        res.setNnative(getNnative());
        res.setId(getId());
        res.setBidfloor(getBidfloor());
        res.setBidfloorcur(getBidfloorcur());
        res.setClickbrowser(getClickbrowser());
        res.setDisplaymanager(getDisplaymanager());
        res.setDisplaymanagerver(getDisplaymanagerver());
        res.setIframebuster(getIframebuster());
        res.setExp(getExp());
        res.setInstl(getInstl());
        res.setMetric(getMetric());
        res.setAudio(getAudio());
        res.setPmp(getPmp());
        res.setSecure(getSecure());
        res.setTagid(getTagid());
        res.hashCode = hashCode;
        return res;
    }
}
