package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessagesAllOf._

case class MessagesAllOf (
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

object MessagesAllOf {
  import DateTimeCodecs._

  implicit val MessagesAllOfCodecJson: CodecJson[MessagesAllOf] = CodecJson.derive[MessagesAllOf]
  implicit val MessagesAllOfDecoder: EntityDecoder[MessagesAllOf] = jsonOf[MessagesAllOf]
  implicit val MessagesAllOfEncoder: EntityEncoder[MessagesAllOf] = jsonEncoderOf[MessagesAllOf]
}
