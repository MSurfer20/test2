
package org.openapitools.client.model


case class Bot (
    _userId: Option[AnyType],
    _fullName: Option[AnyType],
    _apiKey: Option[AnyType],
    _defaultSendingStream: Option[AnyType],
    _defaultEventsRegisterStream: Option[AnyType],
    _defaultAllPublicStreams: Option[AnyType],
    _avatarUrl: Option[AnyType],
    _ownerId: Option[AnyType],
    _services: Option[AnyType],
    /* The email of the bot.  */
    _email: Option[String],
    /* An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot.  */
    _botType: Option[Integer],
    /* A boolean describing whether the user account has been deactivated.  */
    _isActive: Option[Boolean]
)
object Bot {
    def toStringBody(var_userId: Object, var_fullName: Object, var_apiKey: Object, var_defaultSendingStream: Object, var_defaultEventsRegisterStream: Object, var_defaultAllPublicStreams: Object, var_avatarUrl: Object, var_ownerId: Object, var_services: Object, var_email: Object, var_botType: Object, var_isActive: Object) =
        s"""
        | {
        | "userId":$var_userId,"fullName":$var_fullName,"apiKey":$var_apiKey,"defaultSendingStream":$var_defaultSendingStream,"defaultEventsRegisterStream":$var_defaultEventsRegisterStream,"defaultAllPublicStreams":$var_defaultAllPublicStreams,"avatarUrl":$var_avatarUrl,"ownerId":$var_ownerId,"services":$var_services,"email":$var_email,"botType":$var_botType,"isActive":$var_isActive
        | }
        """.stripMargin
}
