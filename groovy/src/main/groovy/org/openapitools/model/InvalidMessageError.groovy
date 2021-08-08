package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.InvalidMessageErrorAllOf;
import org.openapitools.model.JsonSuccessBase;

@Canonical
class InvalidMessageError {
    
    Object result = null
    
    Object msg = null
    /* The raw content of the message.  */
    String rawContent
}
