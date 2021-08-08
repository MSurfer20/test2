
package org.openapitools.client.model


case class GetMessagesAllOf (
    _avatarUrl: Option[AnyType],
    _client: Option[AnyType],
    _content: Option[AnyType],
    _contentType: Option[AnyType],
    _displayRecipient: Option[AnyType],
    _id: Option[AnyType],
    _isMeMessage: Option[AnyType],
    _reactions: Option[AnyType],
    _recipientId: Option[AnyType],
    _senderEmail: Option[AnyType],
    _senderFullName: Option[AnyType],
    _senderId: Option[AnyType],
    _senderRealmStr: Option[AnyType],
    _streamId: Option[AnyType],
    _subject: Option[AnyType],
    _topicLinks: Option[AnyType],
    _submessages: Option[AnyType],
    _timestamp: Option[AnyType],
    _type: Option[AnyType],
    /* The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  */
    _flags: Option[List[String]],
    /* The UNIX timestamp for when the message was last edited, in UTC seconds.  */
    _lastEditTimestamp: Option[Integer],
    /* Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  */
    _matchContent: Option[String],
    /* Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  */
    _matchSubject: Option[String]
)
object GetMessagesAllOf {
    def toStringBody(var_avatarUrl: Object, var_client: Object, var_content: Object, var_contentType: Object, var_displayRecipient: Object, var_id: Object, var_isMeMessage: Object, var_reactions: Object, var_recipientId: Object, var_senderEmail: Object, var_senderFullName: Object, var_senderId: Object, var_senderRealmStr: Object, var_streamId: Object, var_subject: Object, var_topicLinks: Object, var_submessages: Object, var_timestamp: Object, var_type: Object, var_flags: Object, var_lastEditTimestamp: Object, var_matchContent: Object, var_matchSubject: Object) =
        s"""
        | {
        | "avatarUrl":$var_avatarUrl,"client":$var_client,"content":$var_content,"contentType":$var_contentType,"displayRecipient":$var_displayRecipient,"id":$var_id,"isMeMessage":$var_isMeMessage,"reactions":$var_reactions,"recipientId":$var_recipientId,"senderEmail":$var_senderEmail,"senderFullName":$var_senderFullName,"senderId":$var_senderId,"senderRealmStr":$var_senderRealmStr,"streamId":$var_streamId,"subject":$var_subject,"topicLinks":$var_topicLinks,"submessages":$var_submessages,"timestamp":$var_timestamp,"type":$var_type,"flags":$var_flags,"lastEditTimestamp":$var_lastEditTimestamp,"matchContent":$var_matchContent,"matchSubject":$var_matchSubject
        | }
        """.stripMargin
}
