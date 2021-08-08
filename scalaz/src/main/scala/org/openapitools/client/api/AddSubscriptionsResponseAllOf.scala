package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AddSubscriptionsResponseAllOf._

case class AddSubscriptionsResponseAllOf (
  result: Option[AnyType],
msg: Option[AnyType],
/* A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  */
  subscribed: Option[Map[String, List[String]]],
/* A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  */
  alreadySubscribed: Option[Map[String, List[String]]],
/* A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`.  */
  unauthorized: Option[List[String]])

object AddSubscriptionsResponseAllOf {
  import DateTimeCodecs._

  implicit val AddSubscriptionsResponseAllOfCodecJson: CodecJson[AddSubscriptionsResponseAllOf] = CodecJson.derive[AddSubscriptionsResponseAllOf]
  implicit val AddSubscriptionsResponseAllOfDecoder: EntityDecoder[AddSubscriptionsResponseAllOf] = jsonOf[AddSubscriptionsResponseAllOf]
  implicit val AddSubscriptionsResponseAllOfEncoder: EntityEncoder[AddSubscriptionsResponseAllOf] = jsonEncoderOf[AddSubscriptionsResponseAllOf]
}
