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

package com.asteriosoft.openrtb.nativemarkup.response;


import com.asteriosoft.openrtb.nativemarkup.DataType;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;

/**
 * \
 * Corresponds to the Data Object in the request, with the value filled in.  The Data Object is to be
 * used for all miscellaneous elements of the native unit such as Brand Name, Ratings, Review
 * Count, Stars, Downloads, Price count etc.  It is also generic for
 * future native elements not contemplated at the time of the writing of this document.
 */
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DataValue {
    /**
     * Type ID
     * <br>{@link DataType}
     *
     * <p>Optional
     */
    private Integer type;
    /**
     * The optional formatted string name of the data type to be displayed.
     * <p>Optional.
     * @deprecated Absent in Native 1.2
     */
    @Deprecated
    private String label;
    /**
     * Maximum length of the text in the element’s response.
     *
     * <p>Optional
     */
    private Integer len;
    /**
     * The formatted string of data to be displayed. Can contain a formatted value such as “5 stars”
     * or “$10” or “3.4 stars out of 5”.
     * <p>Required
     */
    private String value;

    private Map<String, Object> ext;

}
