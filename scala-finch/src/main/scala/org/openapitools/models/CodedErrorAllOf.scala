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
 */
case class CodedErrorAllOf(result: Option[AnyType],
                msg: Option[AnyType],
                code: Option[AnyType]
                )

object CodedErrorAllOf {
    /**
     * Creates the codec for converting CodedErrorAllOf from and to JSON.
     */
    implicit val decoder: Decoder[CodedErrorAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[CodedErrorAllOf] = deriveEncoder
}
