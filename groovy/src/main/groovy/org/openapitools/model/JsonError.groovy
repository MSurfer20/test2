package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.JsonErrorBase;
import org.openapitools.model.JsonSuccessAllOf;

@Canonical
class JsonError {
    
    Object result = null
    
    Object msg = null
}
