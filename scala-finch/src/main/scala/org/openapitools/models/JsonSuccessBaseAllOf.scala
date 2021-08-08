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
case class JsonSuccessBaseAllOf(result: String,
                msg: String
                )

object JsonSuccessBaseAllOf {
    /**
     * Creates the codec for converting JsonSuccessBaseAllOf from and to JSON.
     */
    implicit val decoder: Decoder[JsonSuccessBaseAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[JsonSuccessBaseAllOf] = deriveEncoder
}
