package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BadEventQueueIdErrorAllOf;
import org.openapitools.model.CodedErrorBase;

@Canonical
class BadEventQueueIdError {
    
    Object result = null
    
    Object msg = null
    
    Object code = null
    /* The string that identifies the invalid event queue.  */
    String queueId
}
