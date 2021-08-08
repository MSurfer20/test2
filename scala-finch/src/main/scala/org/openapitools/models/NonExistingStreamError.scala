package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import org.openapitools.models.CodedErrorBase
import org.openapitools.models.NonExistingStreamErrorAllOf

/**
 * 
 * @param result 
 * @param msg 
 * @param code 
 * @param stream The name of the stream that could not be found. 
 */
case class NonExistingStreamError(result: AnyType,
                msg: AnyType,
                code: Option[AnyType],
                stream: Option[String]
                )

object NonExistingStreamError {
    /**
     * Creates the codec for converting NonExistingStreamError from and to JSON.
     */
    implicit val decoder: Decoder[NonExistingStreamError] = deriveDecoder
    implicit val encoder: ObjectEncoder[NonExistingStreamError] = deriveEncoder
}
