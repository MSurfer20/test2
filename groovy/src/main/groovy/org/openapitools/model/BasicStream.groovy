package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BasicStreamAllOf;
import org.openapitools.model.BasicStreamBase;

@Canonical
class BasicStream {
    
    Object streamId = null
    
    Object name = null
    
    Object description = null
    
    Object dateCreated = null
    
    Object inviteOnly = null
    
    Object renderedDescription = null
    
    Object isWebPublic = null
    
    Object streamPostPolicy = null
    
    Object messageRetentionDays = null
    
    Object historyPublicToSubscribers = null
    
    Object firstMessageId = null
    
    Object isAnnouncementOnly = null
}
