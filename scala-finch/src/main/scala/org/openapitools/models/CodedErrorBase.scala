package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import org.openapitools.models.CodedErrorBaseAllOf
import org.openapitools.models.JsonErrorBase

/**
 * 
 * @param result 
 * @param msg 
 * @param code A string that identifies the error. 
 */
case class CodedErrorBase(result: AnyType,
                msg: AnyType,
                code: Option[String]
                )

object CodedErrorBase {
    /**
     * Creates the codec for converting CodedErrorBase from and to JSON.
     */
    implicit val decoder: Decoder[CodedErrorBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[CodedErrorBase] = deriveEncoder
}
