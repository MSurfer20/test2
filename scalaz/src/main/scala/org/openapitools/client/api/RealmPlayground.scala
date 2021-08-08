package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealmPlayground._

case class RealmPlayground (
  /* The unique ID for the realm playground.  */
  id: Option[Integer],
/* The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49).  */
  name: Option[String],
/* The name of the Pygments language lexer for that programming language.  */
  pygmentsLanguage: Option[String],
/* The url prefix for the playground.  */
  urlPrefix: Option[String])

object RealmPlayground {
  import DateTimeCodecs._

  implicit val RealmPlaygroundCodecJson: CodecJson[RealmPlayground] = CodecJson.derive[RealmPlayground]
  implicit val RealmPlaygroundDecoder: EntityDecoder[RealmPlayground] = jsonOf[RealmPlayground]
  implicit val RealmPlaygroundEncoder: EntityEncoder[RealmPlayground] = jsonEncoderOf[RealmPlayground]
}
