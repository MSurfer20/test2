
package org.openapitools.client.model


case class BasicBotBase (
    /* The user id of the bot.  */
    _userId: Option[Integer],
    /* The full name of the bot.  */
    _fullName: Option[String],
    /* The API key of the bot which it uses to make API requests.  */
    _apiKey: Option[String],
    /* The default sending stream of the bot. Null if the bot doesn't have a default sending stream.  */
    _defaultSendingStream: Option[String],
    /* The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream.  */
    _defaultEventsRegisterStream: Option[String],
    /* Whether the bot can send messages to all streams by default.  */
    _defaultAllPublicStreams: Option[Boolean],
    /* The URL of the bot's avatar.  */
    _avatarUrl: Option[String],
    /* The user id of the bot's owner.  Null if the bot has no owner.  */
    _ownerId: Option[Integer],
    /* The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.  */
    _services: Option[List[OneOfobjectobject]]
)
object BasicBotBase {
    def toStringBody(var_userId: Object, var_fullName: Object, var_apiKey: Object, var_defaultSendingStream: Object, var_defaultEventsRegisterStream: Object, var_defaultAllPublicStreams: Object, var_avatarUrl: Object, var_ownerId: Object, var_services: Object) =
        s"""
        | {
        | "userId":$var_userId,"fullName":$var_fullName,"apiKey":$var_apiKey,"defaultSendingStream":$var_defaultSendingStream,"defaultEventsRegisterStream":$var_defaultEventsRegisterStream,"defaultAllPublicStreams":$var_defaultAllPublicStreams,"avatarUrl":$var_avatarUrl,"ownerId":$var_ownerId,"services":$var_services
        | }
        """.stripMargin
}
