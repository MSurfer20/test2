package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType

/**
 * ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
 * @param result 
 * @param msg 
 * @param code 
 * @param varUnderscorename It contains the information about the missing parameter. 
 */
case class MissingArgumentErrorAllOf(result: Option[AnyType],
                msg: Option[AnyType],
                code: Option[AnyType],
                varUnderscorename: Option[String]
                )

object MissingArgumentErrorAllOf {
    /**
     * Creates the codec for converting MissingArgumentErrorAllOf from and to JSON.
     */
    implicit val decoder: Decoder[MissingArgumentErrorAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[MissingArgumentErrorAllOf] = deriveEncoder
}
