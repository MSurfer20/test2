package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import org.openapitools.models.BasicBotAllOf
import org.openapitools.models.BasicBotBase

/**
 * 
 * @param userUnderscoreid 
 * @param fullUnderscorename 
 * @param apiUnderscorekey 
 * @param defaultUnderscoresendingUnderscorestream 
 * @param defaultUnderscoreeventsUnderscoreregisterUnderscorestream 
 * @param defaultUnderscoreallUnderscorepublicUnderscorestreams 
 * @param avatarUnderscoreurl 
 * @param ownerUnderscoreid 
 * @param services 
 */
case class BasicBot(userUnderscoreid: Option[AnyType],
                fullUnderscorename: Option[AnyType],
                apiUnderscorekey: Option[AnyType],
                defaultUnderscoresendingUnderscorestream: Option[AnyType],
                defaultUnderscoreeventsUnderscoreregisterUnderscorestream: Option[AnyType],
                defaultUnderscoreallUnderscorepublicUnderscorestreams: Option[AnyType],
                avatarUnderscoreurl: Option[AnyType],
                ownerUnderscoreid: Option[AnyType],
                services: Option[AnyType]
                )

object BasicBot {
    /**
     * Creates the codec for converting BasicBot from and to JSON.
     */
    implicit val decoder: Decoder[BasicBot] = deriveDecoder
    implicit val encoder: ObjectEncoder[BasicBot] = deriveEncoder
}
