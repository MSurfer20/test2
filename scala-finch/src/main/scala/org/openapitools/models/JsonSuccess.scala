package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import org.openapitools.models.JsonSuccessAllOf
import org.openapitools.models.JsonSuccessBase

/**
 * 
 * @param result 
 * @param msg 
 */
case class JsonSuccess(result: AnyType,
                msg: AnyType
                )

object JsonSuccess {
    /**
     * Creates the codec for converting JsonSuccess from and to JSON.
     */
    implicit val decoder: Decoder[JsonSuccess] = deriveDecoder
    implicit val encoder: ObjectEncoder[JsonSuccess] = deriveEncoder
}
