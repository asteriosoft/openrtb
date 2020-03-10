package com.asteriosoft.openrtb;

import com.asteriosoft.openrtb.nativemarkup.response.NativeMarkupResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdmObject {
    @JsonProperty("native")
    private final NativeMarkupResponse nnative;
}
