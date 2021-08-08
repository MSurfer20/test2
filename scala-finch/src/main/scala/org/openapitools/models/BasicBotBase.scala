package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OneOf&lt;object,object&gt;
import scala.collection.immutable.Seq

/**
 * 
 * @param userUnderscoreid The user id of the bot. 
 * @param fullUnderscorename The full name of the bot. 
 * @param apiUnderscorekey The API key of the bot which it uses to make API requests. 
 * @param defaultUnderscoresendingUnderscorestream The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
 * @param defaultUnderscoreeventsUnderscoreregisterUnderscorestream The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
 * @param defaultUnderscoreallUnderscorepublicUnderscorestreams Whether the bot can send messages to all streams by default. 
 * @param avatarUnderscoreurl The URL of the bot's avatar. 
 * @param ownerUnderscoreid The user id of the bot's owner.  Null if the bot has no owner. 
 * @param services The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
 */
case class BasicBotBase(userUnderscoreid: Option[Int],
                fullUnderscorename: Option[String],
                apiUnderscorekey: Option[String],
                defaultUnderscoresendingUnderscorestream: Option[String],
                defaultUnderscoreeventsUnderscoreregisterUnderscorestream: Option[String],
                defaultUnderscoreallUnderscorepublicUnderscorestreams: Option[Boolean],
                avatarUnderscoreurl: Option[String],
                ownerUnderscoreid: Option[Int],
                services: Option[Seq[OneOf<object,object>]]
                )

object BasicBotBase {
    /**
     * Creates the codec for converting BasicBotBase from and to JSON.
     */
    implicit val decoder: Decoder[BasicBotBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[BasicBotBase] = deriveEncoder
}
