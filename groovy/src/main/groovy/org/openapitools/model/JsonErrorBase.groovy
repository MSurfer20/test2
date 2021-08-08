package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.JsonErrorBaseAllOf;
import org.openapitools.model.JsonResponseBase;

@Canonical
class JsonErrorBase {
    
    String result
    
    String msg
}
