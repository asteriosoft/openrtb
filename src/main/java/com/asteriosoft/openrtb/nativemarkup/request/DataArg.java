/*
 *
 *  * Copyright 2023 Asteriosoft Inc.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.asteriosoft.openrtb.nativemarkup.request;

import com.asteriosoft.openrtb.nativemarkup.DataType;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The Data Object is to be used for all non-core elements of the native unit such as Brand Name,
 * Ratings, Review Count, Stars, Download count, descriptions etc. It is also generic for future 
 * native elements not contemplated at the time of the writing of this document. 
 */
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DataArg {
    /**
     * Type ID of the element supported by the publisher. The publisher can display this information in an appropriate format.
     * <br>{@link DataType}
     * 
     * <p>Required
     */
    private Integer type;
    
    /**
     * Maximum length of the text in the element’s response.
     * 
     * <p>Optional
     */
    private Integer len;
}
