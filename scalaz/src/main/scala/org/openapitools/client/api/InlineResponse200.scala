package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InlineResponse200._

case class InlineResponse200 (
  /* Email of the bot user.  */
  botEmail: Option[String],
/* The full name of the bot user.  */
  botFullName: Option[String],
/* The message content, in raw Markdown format (not rendered to HTML).  */
  data: Option[String],
/* What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`.  */
  trigger: Option[String],
/* A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot.  */
  token: Option[String],
/* A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages).  */
  message: Option[MessagesBase])

object InlineResponse200 {
  import DateTimeCodecs._

  implicit val InlineResponse200CodecJson: CodecJson[InlineResponse200] = CodecJson.derive[InlineResponse200]
  implicit val InlineResponse200Decoder: EntityDecoder[InlineResponse200] = jsonOf[InlineResponse200]
  implicit val InlineResponse200Encoder: EntityEncoder[InlineResponse200] = jsonEncoderOf[InlineResponse200]
}
