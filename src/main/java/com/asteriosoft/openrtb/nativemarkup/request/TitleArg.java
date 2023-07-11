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

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * The Title object is to be used for title element of the Native ad.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TitleArg {
    /**
     * Maximum length of the text in the title element.
     * Recommended to be 25, 90, or 140.
     * 
     * <p>Required
     */
    private Integer len;
}
