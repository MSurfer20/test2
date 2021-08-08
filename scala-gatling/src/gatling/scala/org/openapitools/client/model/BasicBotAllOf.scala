
package org.openapitools.client.model


case class BasicBotAllOf (
    _userId: Option[AnyType],
    _fullName: Option[AnyType],
    _apiKey: Option[AnyType],
    _defaultSendingStream: Option[AnyType],
    _defaultEventsRegisterStream: Option[AnyType],
    _defaultAllPublicStreams: Option[AnyType],
    _avatarUrl: Option[AnyType],
    _ownerId: Option[AnyType],
    _services: Option[AnyType]
)
object BasicBotAllOf {
    def toStringBody(var_userId: Object, var_fullName: Object, var_apiKey: Object, var_defaultSendingStream: Object, var_defaultEventsRegisterStream: Object, var_defaultAllPublicStreams: Object, var_avatarUrl: Object, var_ownerId: Object, var_services: Object) =
        s"""
        | {
        | "userId":$var_userId,"fullName":$var_fullName,"apiKey":$var_apiKey,"defaultSendingStream":$var_defaultSendingStream,"defaultEventsRegisterStream":$var_defaultEventsRegisterStream,"defaultAllPublicStreams":$var_defaultAllPublicStreams,"avatarUrl":$var_avatarUrl,"ownerId":$var_ownerId,"services":$var_services
        | }
        """.stripMargin
}
