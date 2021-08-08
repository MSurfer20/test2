package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ApiKeyResponse._

case class ApiKeyResponse (
  result: AnyType,
msg: AnyType,
/* The API key that can be used to authenticate as the requested user.  */
  apiKey: String,
/* The email address of the user who owns the API key  */
  email: String)

object ApiKeyResponse {
  import DateTimeCodecs._

  implicit val ApiKeyResponseCodecJson: CodecJson[ApiKeyResponse] = CodecJson.derive[ApiKeyResponse]
  implicit val ApiKeyResponseDecoder: EntityDecoder[ApiKeyResponse] = jsonOf[ApiKeyResponse]
  implicit val ApiKeyResponseEncoder: EntityEncoder[ApiKeyResponse] = jsonEncoderOf[ApiKeyResponse]
}
