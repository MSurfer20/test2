package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import org.openapitools.models.CodedError

/**
 * 
 * @param result 
 * @param msg 
 * @param code 
 */
case class UserDeactivatedError(result: AnyType,
                msg: AnyType,
                code: Option[AnyType]
                )

object UserDeactivatedError {
    /**
     * Creates the codec for converting UserDeactivatedError from and to JSON.
     */
    implicit val decoder: Decoder[UserDeactivatedError] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserDeactivatedError] = deriveEncoder
}
