package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DefaultStreamGroup._

case class DefaultStreamGroup (
  /* Name of the default stream group.  */
  name: Option[String],
/* Description of the default stream group.  */
  description: Option[String],
/* id of the default stream group.  */
  id: Option[Integer],
/* Array containing details about the streams in the default stream group.  */
  streams: Option[List[BasicStream]])

object DefaultStreamGroup {
  import DateTimeCodecs._

  implicit val DefaultStreamGroupCodecJson: CodecJson[DefaultStreamGroup] = CodecJson.derive[DefaultStreamGroup]
  implicit val DefaultStreamGroupDecoder: EntityDecoder[DefaultStreamGroup] = jsonOf[DefaultStreamGroup]
  implicit val DefaultStreamGroupEncoder: EntityEncoder[DefaultStreamGroup] = jsonEncoderOf[DefaultStreamGroup]
}
