package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import org.openapitools.models.MessagesAllOf
import org.openapitools.models.MessagesBase

/**
 * 
 * @param avatarUnderscoreurl 
 * @param client 
 * @param content 
 * @param contentUnderscoretype 
 * @param displayUnderscorerecipient 
 * @param id 
 * @param isUnderscoremeUnderscoremessage 
 * @param reactions 
 * @param recipientUnderscoreid 
 * @param senderUnderscoreemail 
 * @param senderUnderscorefullUnderscorename 
 * @param senderUnderscoreid 
 * @param senderUnderscorerealmUnderscorestr 
 * @param streamUnderscoreid 
 * @param subject 
 * @param topicUnderscorelinks 
 * @param submessages 
 * @param timestamp 
 * @param _type 
 */
case class Messages(avatarUnderscoreurl: Option[AnyType],
                client: Option[AnyType],
                content: Option[AnyType],
                contentUnderscoretype: Option[AnyType],
                displayUnderscorerecipient: Option[AnyType],
                id: Option[AnyType],
                isUnderscoremeUnderscoremessage: Option[AnyType],
                reactions: Option[AnyType],
                recipientUnderscoreid: Option[AnyType],
                senderUnderscoreemail: Option[AnyType],
                senderUnderscorefullUnderscorename: Option[AnyType],
                senderUnderscoreid: Option[AnyType],
                senderUnderscorerealmUnderscorestr: Option[AnyType],
                streamUnderscoreid: Option[AnyType],
                subject: Option[AnyType],
                topicUnderscorelinks: Option[AnyType],
                submessages: Option[AnyType],
                timestamp: Option[AnyType],
                _type: Option[AnyType]
                )

object Messages {
    /**
     * Creates the codec for converting Messages from and to JSON.
     */
    implicit val decoder: Decoder[Messages] = deriveDecoder
    implicit val encoder: ObjectEncoder[Messages] = deriveEncoder
}
