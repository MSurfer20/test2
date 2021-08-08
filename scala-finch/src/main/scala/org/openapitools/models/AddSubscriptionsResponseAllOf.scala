package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import scala.collection.immutable.Seq

/**
 * 
 * @param result 
 * @param msg 
 * @param subscribed A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
 * @param alreadyUnderscoresubscribed A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
 * @param unauthorized A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
 */
case class AddSubscriptionsResponseAllOf(result: Option[AnyType],
                msg: Option[AnyType],
                subscribed: Option[Map[String, Seq[String]]],
                alreadyUnderscoresubscribed: Option[Map[String, Seq[String]]],
                unauthorized: Option[Seq[String]]
                )

object AddSubscriptionsResponseAllOf {
    /**
     * Creates the codec for converting AddSubscriptionsResponseAllOf from and to JSON.
     */
    implicit val decoder: Decoder[AddSubscriptionsResponseAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[AddSubscriptionsResponseAllOf] = deriveEncoder
}
