package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import org.openapitools.models.ApiKeyResponseAllOf
import org.openapitools.models.JsonSuccessBase

/**
 * 
 * @param result 
 * @param msg 
 * @param apiUnderscorekey The API key that can be used to authenticate as the requested user. 
 * @param email The email address of the user who owns the API key 
 */
case class ApiKeyResponse(result: AnyType,
                msg: AnyType,
                apiUnderscorekey: String,
                email: String
                )

object ApiKeyResponse {
    /**
     * Creates the codec for converting ApiKeyResponse from and to JSON.
     */
    implicit val decoder: Decoder[ApiKeyResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ApiKeyResponse] = deriveEncoder
}
