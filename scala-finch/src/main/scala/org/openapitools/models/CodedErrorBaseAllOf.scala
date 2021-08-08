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
 * @param code A string that identifies the error. 
 */
case class CodedErrorBaseAllOf(result: Option[AnyType],
                msg: Option[AnyType],
                code: Option[String]
                )

object CodedErrorBaseAllOf {
    /**
     * Creates the codec for converting CodedErrorBaseAllOf from and to JSON.
     */
    implicit val decoder: Decoder[CodedErrorBaseAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[CodedErrorBaseAllOf] = deriveEncoder
}
