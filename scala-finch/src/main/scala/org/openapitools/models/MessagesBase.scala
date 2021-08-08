package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.EmojiReaction
import org.openapitools.models.MessagesBaseTopicLinks
import org.openapitools.models.OneOf&lt;string,array&gt;
import scala.collection.immutable.Seq

/**
 * Object containing details of the message. 
 * @param avatarUnderscoreurl The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. 
 * @param client A Zulip \"client\" string, describing what Zulip client sent the message. 
 * @param content The content/body of the message. 
 * @param contentUnderscoretype The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. 
 * @param displayUnderscorerecipient Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
 * @param id The unique message ID.  Messages should always be displayed sorted by ID. 
 * @param isUnderscoremeUnderscoremessage Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
 * @param reactions Data on any reactions to the message. 
 * @param recipientUnderscoreid A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
 * @param senderUnderscoreemail The Zulip display email address of the message's sender. 
 * @param senderUnderscorefullUnderscorename The full name of the message's sender. 
 * @param senderUnderscoreid The user ID of the message's sender. 
 * @param senderUnderscorerealmUnderscorestr A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. 
 * @param streamUnderscoreid Only present for stream messages; the ID of the stream. 
 * @param subject The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. 
 * @param topicUnderscorelinks Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. 
 * @param submessages Data used for certain experimental Zulip integrations. 
 * @param timestamp The UNIX timestamp for when the message was sent, in UTC seconds. 
 * @param _type The type of the message: `stream` or `private`. 
 */
case class MessagesBase(avatarUnderscoreurl: Option[String],
                client: Option[String],
                content: Option[String],
                contentUnderscoretype: Option[String],
                displayUnderscorerecipient: Option[OneOf<string,array>],
                id: Option[Int],
                isUnderscoremeUnderscoremessage: Option[Boolean],
                reactions: Option[Seq[EmojiReaction]],
                recipientUnderscoreid: Option[Int],
                senderUnderscoreemail: Option[String],
                senderUnderscorefullUnderscorename: Option[String],
                senderUnderscoreid: Option[Int],
                senderUnderscorerealmUnderscorestr: Option[String],
                streamUnderscoreid: Option[Int],
                subject: Option[String],
                topicUnderscorelinks: Option[Seq[MessagesBaseTopicLinks]],
                submessages: Option[Seq[String]],
                timestamp: Option[Int],
                _type: Option[String]
                )

object MessagesBase {
    /**
     * Creates the codec for converting MessagesBase from and to JSON.
     */
    implicit val decoder: Decoder[MessagesBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessagesBase] = deriveEncoder
}
