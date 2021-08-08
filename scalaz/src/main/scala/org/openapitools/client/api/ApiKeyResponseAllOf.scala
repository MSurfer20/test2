package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ApiKeyResponseAllOf._

case class ApiKeyResponseAllOf (
  result: Option[AnyType],
msg: Option[AnyType],
/* The API key that can be used to authenticate as the requested user.  */
  apiKey: String,
/* The email address of the user who owns the API key  */
  email: String)

object ApiKeyResponseAllOf {
  import DateTimeCodecs._

  implicit val ApiKeyResponseAllOfCodecJson: CodecJson[ApiKeyResponseAllOf] = CodecJson.derive[ApiKeyResponseAllOf]
  implicit val ApiKeyResponseAllOfDecoder: EntityDecoder[ApiKeyResponseAllOf] = jsonOf[ApiKeyResponseAllOf]
  implicit val ApiKeyResponseAllOfEncoder: EntityEncoder[ApiKeyResponseAllOf] = jsonEncoderOf[ApiKeyResponseAllOf]
}
