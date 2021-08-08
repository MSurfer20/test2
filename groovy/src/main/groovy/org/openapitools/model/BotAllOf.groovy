package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class BotAllOf {
    
    Object userId = null
    
    Object fullName = null
    
    Object apiKey = null
    
    Object defaultSendingStream = null
    
    Object defaultEventsRegisterStream = null
    
    Object defaultAllPublicStreams = null
    
    Object avatarUrl = null
    
    Object ownerId = null
    
    Object services = null
    /* The email of the bot.  */
    String email
    /* An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot.  */
    Integer botType
    /* A boolean describing whether the user account has been deactivated.  */
    Boolean isActive
}
