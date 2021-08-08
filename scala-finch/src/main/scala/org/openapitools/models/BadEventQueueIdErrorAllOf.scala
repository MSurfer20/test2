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
 * @param queueUnderscoreid The string that identifies the invalid event queue. 
 */
case class BadEventQueueIdErrorAllOf(result: Option[AnyType],
                msg: Option[AnyType],
                code: Option[AnyType],
                queueUnderscoreid: Option[String]
                )

object BadEventQueueIdErrorAllOf {
    /**
     * Creates the codec for converting BadEventQueueIdErrorAllOf from and to JSON.
     */
    implicit val decoder: Decoder[BadEventQueueIdErrorAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[BadEventQueueIdErrorAllOf] = deriveEncoder
}
