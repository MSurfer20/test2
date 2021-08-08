package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CodedErrorBase;
import org.openapitools.model.MissingArgumentErrorAllOf;

@Canonical
class MissingArgumentError {
    
    Object result = null
    
    Object msg = null
    
    Object code = null
    /* It contains the information about the missing parameter.  */
    String varName
}
