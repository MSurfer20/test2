package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import org.openapitools.models.BasicBotBase
import org.openapitools.models.BotAllOf

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
 * @param email The email of the bot. 
 * @param botUnderscoretype An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
 * @param isUnderscoreactive A boolean describing whether the user account has been deactivated. 
 */
case class Bot(userUnderscoreid: Option[AnyType],
                fullUnderscorename: Option[AnyType],
                apiUnderscorekey: Option[AnyType],
                defaultUnderscoresendingUnderscorestream: Option[AnyType],
                defaultUnderscoreeventsUnderscoreregisterUnderscorestream: Option[AnyType],
                defaultUnderscoreallUnderscorepublicUnderscorestreams: Option[AnyType],
                avatarUnderscoreurl: Option[AnyType],
                ownerUnderscoreid: Option[AnyType],
                services: Option[AnyType],
                email: Option[String],
                botUnderscoretype: Option[Int],
                isUnderscoreactive: Option[Boolean]
                )

object Bot {
    /**
     * Creates the codec for converting Bot from and to JSON.
     */
    implicit val decoder: Decoder[Bot] = deriveDecoder
    implicit val encoder: ObjectEncoder[Bot] = deriveEncoder
}
