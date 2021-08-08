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
 * @param code 
 * @param stream The name of the stream that could not be found. 
 */
case class NonExistingStreamErrorAllOf(result: Option[AnyType],
                msg: Option[AnyType],
                code: Option[AnyType],
                stream: Option[String]
                )

object NonExistingStreamErrorAllOf {
    /**
     * Creates the codec for converting NonExistingStreamErrorAllOf from and to JSON.
     */
    implicit val decoder: Decoder[NonExistingStreamErrorAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[NonExistingStreamErrorAllOf] = deriveEncoder
}
