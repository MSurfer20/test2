package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetMessages._

case class GetMessages (
  avatarUrl: Option[AnyType],
client: Option[AnyType],
content: Option[AnyType],
`contentType`: Option[AnyType],
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
/* The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  */
  flags: Option[List[String]],
/* The UNIX timestamp for when the message was last edited, in UTC seconds.  */
  lastEditTimestamp: Option[Integer],
/* Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  */
  matchContent: Option[String],
/* Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  */
  matchSubject: Option[String])

object GetMessages {
  import DateTimeCodecs._

  implicit val GetMessagesCodecJson: CodecJson[GetMessages] = CodecJson.derive[GetMessages]
  implicit val GetMessagesDecoder: EntityDecoder[GetMessages] = jsonOf[GetMessages]
  implicit val GetMessagesEncoder: EntityEncoder[GetMessages] = jsonEncoderOf[GetMessages]
}
