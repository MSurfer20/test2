package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class NonExistingStreamErrorAllOf {
    
    Object result = null
    
    Object msg = null
    
    Object code = null
    /* The name of the stream that could not be found.  */
    String stream
}
