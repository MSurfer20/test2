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
 * @param apiUnderscorekey The API key that can be used to authenticate as the requested user. 
 * @param email The email address of the user who owns the API key 
 */
case class ApiKeyResponseAllOf(result: Option[AnyType],
                msg: Option[AnyType],
                apiUnderscorekey: String,
                email: String
                )

object ApiKeyResponseAllOf {
    /**
     * Creates the codec for converting ApiKeyResponseAllOf from and to JSON.
     */
    implicit val decoder: Decoder[ApiKeyResponseAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[ApiKeyResponseAllOf] = deriveEncoder
}
