/**
* Zulip REST API
* Powerful open source group chat 
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.EmojiReaction
import org.openapitools.server.models.MessagesBaseTopicLinks
import org.openapitools.server.models.OneOfLessThanStringCommaArrayGreaterThan

/**
 * Object containing details of the message. 
 * @param avatarUrl The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. 
 * @param client A Zulip \"client\" string, describing what Zulip client sent the message. 
 * @param content The content/body of the message. 
 * @param contentType The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. 
 * @param displayRecipient Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
 * @param id The unique message ID.  Messages should always be displayed sorted by ID. 
 * @param isMeMessage Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
 * @param reactions Data on any reactions to the message. 
 * @param recipientId A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
 * @param senderEmail The Zulip display email address of the message's sender. 
 * @param senderFullName The full name of the message's sender. 
 * @param senderId The user ID of the message's sender. 
 * @param senderRealmStr A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. 
 * @param streamId Only present for stream messages; the ID of the stream. 
 * @param subject The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. 
 * @param topicLinks Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. 
 * @param submessages Data used for certain experimental Zulip integrations. 
 * @param timestamp The UNIX timestamp for when the message was sent, in UTC seconds. 
 * @param type The type of the message: `stream` or `private`. 
 */
data class MessagesBase (
    /* The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user.  */
    val avatarUrl: kotlin.String? = null,
    /* A Zulip \"client\" string, describing what Zulip client sent the message.  */
    val client: kotlin.String? = null,
    /* The content/body of the message.  */
    val content: kotlin.String? = null,
    /* The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set.  */
    val contentType: kotlin.String? = null,
    /* Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message.  */
    val displayRecipient: OneOfLessThanStringCommaArrayGreaterThan? = null,
    /* The unique message ID.  Messages should always be displayed sorted by ID.  */
    val id: kotlin.Int? = null,
    /* Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages  */
    val isMeMessage: kotlin.Boolean? = null,
    /* Data on any reactions to the message.  */
    val reactions: kotlin.Array<EmojiReaction>? = null,
    /* A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing.  */
    val recipientId: kotlin.Int? = null,
    /* The Zulip display email address of the message's sender.  */
    val senderEmail: kotlin.String? = null,
    /* The full name of the message's sender.  */
    val senderFullName: kotlin.String? = null,
    /* The user ID of the message's sender.  */
    val senderId: kotlin.Int? = null,
    /* A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`.  */
    val senderRealmStr: kotlin.String? = null,
    /* Only present for stream messages; the ID of the stream.  */
    val streamId: kotlin.Int? = null,
    /* The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change.  */
    val subject: kotlin.String? = null,
    /* Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers.  */
    val topicLinks: kotlin.Array<MessagesBaseTopicLinks>? = null,
    /* Data used for certain experimental Zulip integrations.  */
    val submessages: kotlin.Array<kotlin.String>? = null,
    /* The UNIX timestamp for when the message was sent, in UTC seconds.  */
    val timestamp: kotlin.Int? = null,
    /* The type of the message: `stream` or `private`.  */
    val type: kotlin.String? = null
) 
