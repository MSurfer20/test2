package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType
import org.openapitools.models.GetMessagesAllOf
import org.openapitools.models.MessagesBase
import scala.collection.immutable.Seq

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
 * @param flags The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
 * @param lastUnderscoreeditUnderscoretimestamp The UNIX timestamp for when the message was last edited, in UTC seconds. 
 * @param matchUnderscorecontent Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
 * @param matchUnderscoresubject Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
 */
case class GetMessages(avatarUnderscoreurl: Option[AnyType],
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
                _type: Option[AnyType],
                flags: Option[Seq[String]],
                lastUnderscoreeditUnderscoretimestamp: Option[Int],
                matchUnderscorecontent: Option[String],
                matchUnderscoresubject: Option[String]
                )

object GetMessages {
    /**
     * Creates the codec for converting GetMessages from and to JSON.
     */
    implicit val decoder: Decoder[GetMessages] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetMessages] = deriveEncoder
}
