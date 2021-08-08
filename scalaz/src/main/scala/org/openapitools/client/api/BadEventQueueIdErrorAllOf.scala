package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BadEventQueueIdErrorAllOf._

case class BadEventQueueIdErrorAllOf (
  result: Option[AnyType],
msg: Option[AnyType],
code: Option[AnyType],
/* The string that identifies the invalid event queue.  */
  queueId: Option[String])

object BadEventQueueIdErrorAllOf {
  import DateTimeCodecs._

  implicit val BadEventQueueIdErrorAllOfCodecJson: CodecJson[BadEventQueueIdErrorAllOf] = CodecJson.derive[BadEventQueueIdErrorAllOf]
  implicit val BadEventQueueIdErrorAllOfDecoder: EntityDecoder[BadEventQueueIdErrorAllOf] = jsonOf[BadEventQueueIdErrorAllOf]
  implicit val BadEventQueueIdErrorAllOfEncoder: EntityEncoder[BadEventQueueIdErrorAllOf] = jsonEncoderOf[BadEventQueueIdErrorAllOf]
}
