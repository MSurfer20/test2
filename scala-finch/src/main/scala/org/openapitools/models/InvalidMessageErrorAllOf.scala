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
 * @param rawUnderscorecontent The raw content of the message. 
 */
case class InvalidMessageErrorAllOf(result: Option[AnyType],
                msg: Option[AnyType],
                rawUnderscorecontent: Option[String]
                )

object InvalidMessageErrorAllOf {
    /**
     * Creates the codec for converting InvalidMessageErrorAllOf from and to JSON.
     */
    implicit val decoder: Decoder[InvalidMessageErrorAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[InvalidMessageErrorAllOf] = deriveEncoder
}
