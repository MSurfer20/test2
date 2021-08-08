package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BasicBotAllOf;
import org.openapitools.model.BasicBotBase;

@Canonical
class BasicBot {
    
    Object userId = null
    
    Object fullName = null
    
    Object apiKey = null
    
    Object defaultSendingStream = null
    
    Object defaultEventsRegisterStream = null
    
    Object defaultAllPublicStreams = null
    
    Object avatarUrl = null
    
    Object ownerId = null
    
    Object services = null
}
