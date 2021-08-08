package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessagesBase;

@Canonical
class InlineResponse200 {
    /* Email of the bot user.  */
    String botEmail
    /* The full name of the bot user.  */
    String botFullName
    /* The message content, in raw Markdown format (not rendered to HTML).  */
    String data
    /* What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`.  */
    String trigger
    /* A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot.  */
    String token
    /* A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages).  */
    MessagesBase message
}
