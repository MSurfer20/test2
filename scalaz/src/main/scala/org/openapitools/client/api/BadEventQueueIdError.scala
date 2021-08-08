package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BadEventQueueIdError._

case class BadEventQueueIdError (
  result: AnyType,
msg: AnyType,
code: Option[AnyType],
/* The string that identifies the invalid event queue.  */
  queueId: Option[String])

object BadEventQueueIdError {
  import DateTimeCodecs._

  implicit val BadEventQueueIdErrorCodecJson: CodecJson[BadEventQueueIdError] = CodecJson.derive[BadEventQueueIdError]
  implicit val BadEventQueueIdErrorDecoder: EntityDecoder[BadEventQueueIdError] = jsonOf[BadEventQueueIdError]
  implicit val BadEventQueueIdErrorEncoder: EntityEncoder[BadEventQueueIdError] = jsonEncoderOf[BadEventQueueIdError]
}
