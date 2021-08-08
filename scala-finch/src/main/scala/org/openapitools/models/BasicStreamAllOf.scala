package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType

/**
 * 
 * @param streamUnderscoreid 
 * @param name 
 * @param description 
 * @param dateUnderscorecreated 
 * @param inviteUnderscoreonly 
 * @param renderedUnderscoredescription 
 * @param isUnderscorewebUnderscorepublic 
 * @param streamUnderscorepostUnderscorepolicy 
 * @param messageUnderscoreretentionUnderscoredays 
 * @param historyUnderscorepublicUnderscoretoUnderscoresubscribers 
 * @param firstUnderscoremessageUnderscoreid 
 * @param isUnderscoreannouncementUnderscoreonly 
 */
case class BasicStreamAllOf(streamUnderscoreid: Option[AnyType],
                name: Option[AnyType],
                description: Option[AnyType],
                dateUnderscorecreated: Option[AnyType],
                inviteUnderscoreonly: Option[AnyType],
                renderedUnderscoredescription: Option[AnyType],
                isUnderscorewebUnderscorepublic: Option[AnyType],
                streamUnderscorepostUnderscorepolicy: Option[AnyType],
                messageUnderscoreretentionUnderscoredays: Option[AnyType],
                historyUnderscorepublicUnderscoretoUnderscoresubscribers: Option[AnyType],
                firstUnderscoremessageUnderscoreid: Option[AnyType],
                isUnderscoreannouncementUnderscoreonly: Option[AnyType]
                )

object BasicStreamAllOf {
    /**
     * Creates the codec for converting BasicStreamAllOf from and to JSON.
     */
    implicit val decoder: Decoder[BasicStreamAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[BasicStreamAllOf] = deriveEncoder
}
