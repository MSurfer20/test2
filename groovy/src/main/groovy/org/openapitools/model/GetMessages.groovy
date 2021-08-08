package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.GetMessagesAllOf;
import org.openapitools.model.MessagesBase;

@Canonical
class GetMessages {
    
    Object avatarUrl = null
    
    Object client = null
    
    Object content = null
    
    Object contentType = null
    
    Object displayRecipient = null
    
    Object id = null
    
    Object isMeMessage = null
    
    Object reactions = null
    
    Object recipientId = null
    
    Object senderEmail = null
    
    Object senderFullName = null
    
    Object senderId = null
    
    Object senderRealmStr = null
    
    Object streamId = null
    
    Object subject = null
    
    Object topicLinks = null
    
    Object submessages = null
    
    Object timestamp = null
    
    Object type = null
    /* The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  */
    List<String> flags = new ArrayList<String>()
    /* The UNIX timestamp for when the message was last edited, in UTC seconds.  */
    Integer lastEditTimestamp
    /* Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  */
    String matchContent
    /* Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  */
    String matchSubject
}
