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

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Corresponds to the Title Object in the request, with the value filled in.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TitleValue {
    /**
     * The text associated with the text element.
     * <p>Required.
     */
    private String text;
    /**
     * Maximum length of the text in the element’s response.
     *
     * <p>Optional
     */
    private Integer len;
}
