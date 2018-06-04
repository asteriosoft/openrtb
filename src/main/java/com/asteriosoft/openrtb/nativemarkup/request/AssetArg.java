package com.asteriosoft.openrtb.nativemarkup.request;


import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The main container object for each asset requested or supported by Exchange on behalf of the rendering client. 
 * Any object that is required is to be flagged as such. Only one of the {title,img,video,data} objects should be present in each object. 
 * All others should be null/absent.The id is to be unique within the AssetObject array so that the response can be aligned.
 * To be more explicit, it is the ID of each asset object that maps the response to the request. 
 * So if a request for a title object is sent with id 1, then the response containing the title should have an id of 1.
 */
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AssetArg {
    
    /**
     * Unique asset ID, assigned by exchange. Typically a counter for the array.
     * 
     * <p>Required
     */
    private Integer id;
    
    /**
     * Set to 1 if asset is required (exchange will not accept a bid without it)
     * 
     * <p>Optional
     * <p>Default: 0
     */
    private Integer required;
    
    /**
     * Title object for title assets.
     * 
     * <p>Recommended
     */
    private TitleArg title;
    
    /**
     * Image object for image assets.
     * 
     * <p>Recommended
     */
    private ImgArg img;
    
    /**
     * Video object for video assets. 
     * Note that in-stream (ie preroll, etc) video ads are not part of Native.  Native ads may contain a video as the ad creative itself.
     * 
     * <p>Optional
     */
    private VideoArg video;
    
    /**
     * Data object for brand name, description, ratings, prices etc.
     * 
     * <p>Recommended
     */
    private DataArg data;

}
