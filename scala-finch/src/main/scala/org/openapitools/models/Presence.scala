package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * `{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. 
 * @param client The client's platform name. 
 * @param status The status of the user on this client. It is either `idle` or `active`. 
 * @param timestamp The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. 
 * @param pushable Whether the client is capable of showing mobile/push notifications to the user. 
 */
case class Presence(client: Option[String],
                status: Option[String],
                timestamp: Option[Int],
                pushable: Option[Boolean]
                )

object Presence {
    /**
     * Creates the codec for converting Presence from and to JSON.
     */
    implicit val decoder: Decoder[Presence] = deriveDecoder
    implicit val encoder: ObjectEncoder[Presence] = deriveEncoder
}
