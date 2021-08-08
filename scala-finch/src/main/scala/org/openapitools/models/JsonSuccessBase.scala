package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.JsonResponseBase
import org.openapitools.models.JsonSuccessBaseAllOf

/**
 * 
 * @param result 
 * @param msg 
 */
case class JsonSuccessBase(result: String,
                msg: String
                )

object JsonSuccessBase {
    /**
     * Creates the codec for converting JsonSuccessBase from and to JSON.
     */
    implicit val decoder: Decoder[JsonSuccessBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[JsonSuccessBase] = deriveEncoder
}
