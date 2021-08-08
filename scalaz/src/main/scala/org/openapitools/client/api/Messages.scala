package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Messages._

case class Messages (
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
`type`: Option[AnyType])

object Messages {
  import DateTimeCodecs._

  implicit val MessagesCodecJson: CodecJson[Messages] = CodecJson.derive[Messages]
  implicit val MessagesDecoder: EntityDecoder[Messages] = jsonOf[Messages]
  implicit val MessagesEncoder: EntityEncoder[Messages] = jsonEncoderOf[Messages]
}
