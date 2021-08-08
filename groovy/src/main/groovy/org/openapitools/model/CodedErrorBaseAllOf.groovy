package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CodedErrorBaseAllOf {
    
    Object result = null
    
    Object msg = null
    /* A string that identifies the error.  */
    String code
}
