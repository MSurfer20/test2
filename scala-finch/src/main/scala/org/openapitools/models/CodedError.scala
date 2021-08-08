package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import org.openapitools.models.CodedErrorAllOf
import org.openapitools.models.CodedErrorBase

/**
 * 
 * @param result 
 * @param msg 
 * @param code 
 */
case class CodedError(result: AnyType,
                msg: AnyType,
                code: Option[AnyType]
                )

object CodedError {
    /**
     * Creates the codec for converting CodedError from and to JSON.
     */
    implicit val decoder: Decoder[CodedError] = deriveDecoder
    implicit val encoder: ObjectEncoder[CodedError] = deriveEncoder
}
