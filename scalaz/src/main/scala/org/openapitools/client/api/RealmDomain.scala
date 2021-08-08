package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealmDomain._

case class RealmDomain (
  /* The new allowed domain.  */
  domain: Option[String],
/* Whether subdomains are allowed for this domain.  */
  allowSubdomains: Option[Boolean])

object RealmDomain {
  import DateTimeCodecs._

  implicit val RealmDomainCodecJson: CodecJson[RealmDomain] = CodecJson.derive[RealmDomain]
  implicit val RealmDomainDecoder: EntityDecoder[RealmDomain] = jsonOf[RealmDomain]
  implicit val RealmDomainEncoder: EntityEncoder[RealmDomain] = jsonEncoderOf[RealmDomain]
}
