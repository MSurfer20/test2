package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import org.openapitools.models.CodedError

/**
 * 
 * @param result 
 * @param msg 
 * @param code 
 */
case class RealmDeactivatedError(result: AnyType,
                msg: AnyType,
                code: Option[AnyType]
                )

object RealmDeactivatedError {
    /**
     * Creates the codec for converting RealmDeactivatedError from and to JSON.
     */
    implicit val decoder: Decoder[RealmDeactivatedError] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealmDeactivatedError] = deriveEncoder
}
