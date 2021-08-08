package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import org.openapitools.models.JsonError

/**
 * 
 * @param result 
 * @param msg 
 */
case class InvalidApiKeyError(result: AnyType,
                msg: AnyType
                )

object InvalidApiKeyError {
    /**
     * Creates the codec for converting InvalidApiKeyError from and to JSON.
     */
    implicit val decoder: Decoder[InvalidApiKeyError] = deriveDecoder
    implicit val encoder: ObjectEncoder[InvalidApiKeyError] = deriveEncoder
}
