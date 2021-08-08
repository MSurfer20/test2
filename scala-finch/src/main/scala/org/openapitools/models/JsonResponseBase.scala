package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param result 
 */
case class JsonResponseBase(result: Option[String]
                )

object JsonResponseBase {
    /**
     * Creates the codec for converting JsonResponseBase from and to JSON.
     */
    implicit val decoder: Decoder[JsonResponseBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[JsonResponseBase] = deriveEncoder
}
