package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OneOfobjectobject;

@Canonical
class BasicBotBase {
    /* The user id of the bot.  */
    Integer userId
    /* The full name of the bot.  */
    String fullName
    /* The API key of the bot which it uses to make API requests.  */
    String apiKey
    /* The default sending stream of the bot. Null if the bot doesn't have a default sending stream.  */
    String defaultSendingStream
    /* The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream.  */
    String defaultEventsRegisterStream
    /* Whether the bot can send messages to all streams by default.  */
    Boolean defaultAllPublicStreams
    /* The URL of the bot's avatar.  */
    String avatarUrl
    /* The user id of the bot's owner.  Null if the bot has no owner.  */
    Integer ownerId
    /* The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.  */
    List<OneOfobjectobject> services = new ArrayList<OneOfobjectobject>()
}
