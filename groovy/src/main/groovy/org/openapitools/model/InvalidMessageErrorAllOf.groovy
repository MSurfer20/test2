package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class InvalidMessageErrorAllOf {
    
    Object result = null
    
    Object msg = null
    /* The raw content of the message.  */
    String rawContent
}
