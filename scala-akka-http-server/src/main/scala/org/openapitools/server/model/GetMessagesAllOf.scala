package org.openapitools.server.model


/**
 * @param avatarUrl  for example: ''null''
 * @param client  for example: ''null''
 * @param content  for example: ''null''
 * @param contentType  for example: ''null''
 * @param displayRecipient  for example: ''null''
 * @param id  for example: ''null''
 * @param isMeMessage  for example: ''null''
 * @param reactions  for example: ''null''
 * @param recipientId  for example: ''null''
 * @param senderEmail  for example: ''null''
 * @param senderFullName  for example: ''null''
 * @param senderId  for example: ''null''
 * @param senderRealmStr  for example: ''null''
 * @param streamId  for example: ''null''
 * @param subject  for example: ''null''
 * @param topicLinks  for example: ''null''
 * @param submessages  for example: ''null''
 * @param timestamp  for example: ''null''
 * @param `type`  for example: ''null''
 * @param flags The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  for example: ''null''
 * @param lastEditTimestamp The UNIX timestamp for when the message was last edited, in UTC seconds.  for example: ''null''
 * @param matchContent Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  for example: ''null''
 * @param matchSubject Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  for example: ''null''
*/
final case class GetMessagesAllOf (
  avatarUrl: Option[AnyType],
  client: Option[AnyType],
  content: Option[AnyType],
  contentType: Option[AnyType],
  displayRecipient: Option[AnyType],
  id: Option[AnyType],
  isMeMessage: Option[AnyType],
  reactions: Option[AnyType],
  recipientId: Option[AnyType],
  senderEmail: Option[AnyType],
  senderFullName: Option[AnyType],
  senderId: Option[AnyType],
  senderRealmStr: Option[AnyType],
  streamId: Option[AnyType],
  subject: Option[AnyType],
  topicLinks: Option[AnyType],
  submessages: Option[AnyType],
  timestamp: Option[AnyType],
  `type`: Option[AnyType],
  flags: Option[Seq[String]],
  lastEditTimestamp: Option[Int],
  matchContent: Option[String],
  matchSubject: Option[String]
)

