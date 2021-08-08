package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param result 
 * @param msg 
 */
case class JsonErrorBaseAllOf(result: String,
                msg: String
                )

object JsonErrorBaseAllOf {
    /**
     * Creates the codec for converting JsonErrorBaseAllOf from and to JSON.
     */
    implicit val decoder: Decoder[JsonErrorBaseAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[JsonErrorBaseAllOf] = deriveEncoder
}
