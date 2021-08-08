package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Hotspot._

case class Hotspot (
  /* The delay after which the user should be shown the hotspot.  */
  delay: Option[BigDecimal],
/* The name of the hotspot.  */
  name: Option[String],
/* The title of the hotspot, as will be displayed to the user.  */
  title: Option[String],
/* The description of the hotspot, as will be displayed to the user.  */
  description: Option[String])

object Hotspot {
  import DateTimeCodecs._

  implicit val HotspotCodecJson: CodecJson[Hotspot] = CodecJson.derive[Hotspot]
  implicit val HotspotDecoder: EntityDecoder[Hotspot] = jsonOf[Hotspot]
  implicit val HotspotEncoder: EntityEncoder[Hotspot] = jsonEncoderOf[Hotspot]
}
