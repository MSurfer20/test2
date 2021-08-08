package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import org.openapitools.models.JsonErrorBase
import org.openapitools.models.JsonSuccessAllOf

/**
 * 
 * @param result 
 * @param msg 
 */
case class JsonError(result: AnyType,
                msg: AnyType
                )

object JsonError {
    /**
     * Creates the codec for converting JsonError from and to JSON.
     */
    implicit val decoder: Decoder[JsonError] = deriveDecoder
    implicit val encoder: ObjectEncoder[JsonError] = deriveEncoder
}
