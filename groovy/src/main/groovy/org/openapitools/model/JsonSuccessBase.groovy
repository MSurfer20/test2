package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.JsonResponseBase;
import org.openapitools.model.JsonSuccessBaseAllOf;

@Canonical
class JsonSuccessBase {
    
    String result
    
    String msg
}
