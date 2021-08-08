package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessagesBaseTopicLinks._

case class MessagesBaseTopicLinks (
  /* The original link text present in the topic.  */
  text: Option[String],
/* The expanded target url which the link points to.  */
  url: Option[String])

object MessagesBaseTopicLinks {
  import DateTimeCodecs._

  implicit val MessagesBaseTopicLinksCodecJson: CodecJson[MessagesBaseTopicLinks] = CodecJson.derive[MessagesBaseTopicLinks]
  implicit val MessagesBaseTopicLinksDecoder: EntityDecoder[MessagesBaseTopicLinks] = jsonOf[MessagesBaseTopicLinks]
  implicit val MessagesBaseTopicLinksEncoder: EntityEncoder[MessagesBaseTopicLinks] = jsonEncoderOf[MessagesBaseTopicLinks]
}
