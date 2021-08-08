package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CodedErrorBaseAllOf;
import org.openapitools.model.JsonErrorBase;

@Canonical
class CodedErrorBase {
    
    Object result = null
    
    Object msg = null
    /* A string that identifies the error.  */
    String code
}
