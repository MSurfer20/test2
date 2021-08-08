package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import org.openapitools.models.CodedErrorBase
import org.openapitools.models.MissingArgumentErrorAllOf

/**
 * 
 * @param result 
 * @param msg 
 * @param code 
 * @param varUnderscorename It contains the information about the missing parameter. 
 */
case class MissingArgumentError(result: AnyType,
                msg: AnyType,
                code: Option[AnyType],
                varUnderscorename: Option[String]
                )

object MissingArgumentError {
    /**
     * Creates the codec for converting MissingArgumentError from and to JSON.
     */
    implicit val decoder: Decoder[MissingArgumentError] = deriveDecoder
    implicit val encoder: ObjectEncoder[MissingArgumentError] = deriveEncoder
}
