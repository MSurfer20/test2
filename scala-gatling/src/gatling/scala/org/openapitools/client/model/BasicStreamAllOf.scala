
package org.openapitools.client.model


case class BasicStreamAllOf (
    _streamId: Option[AnyType],
    _name: Option[AnyType],
    _description: Option[AnyType],
    _dateCreated: Option[AnyType],
    _inviteOnly: Option[AnyType],
    _renderedDescription: Option[AnyType],
    _isWebPublic: Option[AnyType],
    _streamPostPolicy: Option[AnyType],
    _messageRetentionDays: Option[AnyType],
    _historyPublicToSubscribers: Option[AnyType],
    _firstMessageId: Option[AnyType],
    _isAnnouncementOnly: Option[AnyType]
)
object BasicStreamAllOf {
    def toStringBody(var_streamId: Object, var_name: Object, var_description: Object, var_dateCreated: Object, var_inviteOnly: Object, var_renderedDescription: Object, var_isWebPublic: Object, var_streamPostPolicy: Object, var_messageRetentionDays: Object, var_historyPublicToSubscribers: Object, var_firstMessageId: Object, var_isAnnouncementOnly: Object) =
        s"""
        | {
        | "streamId":$var_streamId,"name":$var_name,"description":$var_description,"dateCreated":$var_dateCreated,"inviteOnly":$var_inviteOnly,"renderedDescription":$var_renderedDescription,"isWebPublic":$var_isWebPublic,"streamPostPolicy":$var_streamPostPolicy,"messageRetentionDays":$var_messageRetentionDays,"historyPublicToSubscribers":$var_historyPublicToSubscribers,"firstMessageId":$var_firstMessageId,"isAnnouncementOnly":$var_isAnnouncementOnly
        | }
        """.stripMargin
}
