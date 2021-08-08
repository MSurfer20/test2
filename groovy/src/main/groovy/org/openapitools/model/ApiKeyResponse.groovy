package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ApiKeyResponseAllOf;
import org.openapitools.model.JsonSuccessBase;

@Canonical
class ApiKeyResponse {
    
    Object result = null
    
    Object msg = null
    /* The API key that can be used to authenticate as the requested user.  */
    String apiKey
    /* The email address of the user who owns the API key  */
    String email
}
