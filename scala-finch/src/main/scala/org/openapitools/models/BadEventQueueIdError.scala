package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import org.openapitools.models.BadEventQueueIdErrorAllOf
import org.openapitools.models.CodedErrorBase

/**
 * 
 * @param result 
 * @param msg 
 * @param code 
 * @param queueUnderscoreid The string that identifies the invalid event queue. 
 */
case class BadEventQueueIdError(result: AnyType,
                msg: AnyType,
                code: Option[AnyType],
                queueUnderscoreid: Option[String]
                )

object BadEventQueueIdError {
    /**
     * Creates the codec for converting BadEventQueueIdError from and to JSON.
     */
    implicit val decoder: Decoder[BadEventQueueIdError] = deriveDecoder
    implicit val encoder: ObjectEncoder[BadEventQueueIdError] = deriveEncoder
}
