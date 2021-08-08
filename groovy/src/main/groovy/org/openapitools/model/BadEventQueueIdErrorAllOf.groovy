package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class BadEventQueueIdErrorAllOf {
    
    Object result = null
    
    Object msg = null
    
    Object code = null
    /* The string that identifies the invalid event queue.  */
    String queueId
}
