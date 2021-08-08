package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import org.openapitools.models.InvalidMessageErrorAllOf
import org.openapitools.models.JsonSuccessBase

/**
 * 
 * @param result 
 * @param msg 
 * @param rawUnderscorecontent The raw content of the message. 
 */
case class InvalidMessageError(result: AnyType,
                msg: AnyType,
                rawUnderscorecontent: Option[String]
                )

object InvalidMessageError {
    /**
     * Creates the codec for converting InvalidMessageError from and to JSON.
     */
    implicit val decoder: Decoder[InvalidMessageError] = deriveDecoder
    implicit val encoder: ObjectEncoder[InvalidMessageError] = deriveEncoder
}
