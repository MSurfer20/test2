package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.JsonErrorBaseAllOf
import org.openapitools.models.JsonResponseBase

/**
 * 
 * @param result 
 * @param msg 
 */
case class JsonErrorBase(result: String,
                msg: String
                )

object JsonErrorBase {
    /**
     * Creates the codec for converting JsonErrorBase from and to JSON.
     */
    implicit val decoder: Decoder[JsonErrorBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[JsonErrorBase] = deriveEncoder
}
