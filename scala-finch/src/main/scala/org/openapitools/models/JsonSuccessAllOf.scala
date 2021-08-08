package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType

/**
 * 
 * @param result 
 * @param msg 
 */
case class JsonSuccessAllOf(result: Option[AnyType],
                msg: Option[AnyType]
                )

object JsonSuccessAllOf {
    /**
     * Creates the codec for converting JsonSuccessAllOf from and to JSON.
     */
    implicit val decoder: Decoder[JsonSuccessAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[JsonSuccessAllOf] = deriveEncoder
}
