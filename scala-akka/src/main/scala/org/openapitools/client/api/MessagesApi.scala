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
package org.openapitools.client.api

import org.openapitools.client.model.AnyType
import org.openapitools.client.model.CodedError
import java.io.File
import org.openapitools.client.model.InvalidMessageError
import org.openapitools.client.model.JsonSuccess
import org.openapitools.client.model.JsonSuccessBase
import org.openapitools.client.model.OneOfobjectobject
import org.openapitools.client.model.OneOfstringinteger
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object MessagesApi {

  def apply(baseUrl: String = "https://example.zulipchat.com/api/v1") = new MessagesApi(baseUrl)
}

class MessagesApi(baseUrl: String) {
  
  /**
   * Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccess (Success.)
   *   code 400 : CodedError (Bad request.)
   * 
   * @param messageId The target message's ID. 
   * @param emojiName The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
   * @param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. 
   * @param reactionType If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. 
   */
  def addReaction(messageId: Int, emojiName: String, emojiCode: Option[String] = None, reactionType: Option[String] = None): ApiRequest[JsonSuccess] =
    ApiRequest[JsonSuccess](ApiMethods.POST, baseUrl, "/messages/{message_id}/reactions", "application/json")
      .withQueryParam("emoji_name", emojiName)
      .withQueryParam("emoji_code", emojiCode)
      .withQueryParam("reaction_type", reactionType)
      .withPathParam("message_id", messageId)
      .withSuccessResponse[JsonSuccess](200)
      .withErrorResponse[CodedError](400)
      

  /**
   * Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 
   * 
   * Expected answers:
   *   code 200 : AnyType (Success.)
   * 
   * @param msgIds List of IDs for the messages to check.
   * @param narrow A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).
   */
  def checkMessagesMatchNarrow(msgIds: Seq[Int], narrow: Seq[Any]): ApiRequest[AnyType] =
    ApiRequest[AnyType](ApiMethods.GET, baseUrl, "/messages/matches_narrow", "application/json")
      .withQueryParam("msg_ids", ArrayValues(msgIds, MULTI))
      .withQueryParam("narrow", ArrayValues(narrow, MULTI))
      .withSuccessResponse[AnyType](200)
      

  /**
   * Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
   * 
   * Expected answers:
   *   code 200 : JsonSuccess (Success.)
   *   code 400 : OneOfobjectobject (Bad request.)
   * 
   * @param messageId The target message's ID. 
   */
  def deleteMessage(messageId: Int): ApiRequest[JsonSuccess] =
    ApiRequest[JsonSuccess](ApiMethods.DELETE, baseUrl, "/messages/{message_id}", "application/json")
      .withPathParam("message_id", messageId)
      .withSuccessResponse[JsonSuccess](200)
      .withErrorResponse[OneOfobjectobject](400)
      

  /**
   * Get a temporary URL for access to the file that doesn't require authentication. 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   * 
   * @param realmIdStr The realm id. 
   * @param filename Path to the URL. 
   */
  def getFileTemporaryUrl(realmIdStr: Int, filename: String): ApiRequest[JsonSuccessBase] =
    ApiRequest[JsonSuccessBase](ApiMethods.GET, baseUrl, "/user_uploads/{realm_id_str}/{filename}", "application/json")
      .withPathParam("realm_id_str", realmIdStr)
      .withPathParam("filename", filename)
      .withSuccessResponse[JsonSuccessBase](200)
      

  /**
   * Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   *   code 400 : InvalidMessageError (Bad request.)
   * 
   * @param messageId The target message's ID. 
   */
  def getMessageHistory(messageId: Int): ApiRequest[JsonSuccessBase] =
    ApiRequest[JsonSuccessBase](ApiMethods.GET, baseUrl, "/messages/{message_id}/history", "application/json")
      .withPathParam("message_id", messageId)
      .withSuccessResponse[JsonSuccessBase](200)
      .withErrorResponse[InvalidMessageError](400)
      

  /**
   * Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   * 
   * @param numBefore The number of messages with IDs less than the anchor to retrieve. 
   * @param numAfter The number of messages with IDs greater than the anchor to retrieve. 
   * @param anchor Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * `newest`: The most recent message. * `oldest`: The oldest message. * `first_unread`: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of `'newest'` and `'oldest'` are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   `first_unread` functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, `oldest` can be emulated with   `anchor=0`, and `newest` with `anchor=10000000000000000`   (that specific large value works around a bug in Zulip   2.1.x and older in the `found_newest` return value). 
   * @param narrow The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). 
   * @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
   * @param applyMarkdown If `true`, message content is returned in the rendered HTML format. If `false`, message content is returned in the raw Markdown-format text that user entered. 
   * @param useFirstUnreadAnchor Legacy way to specify `anchor=\"first_unread\"` in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the `anchor`.  Mutually exclusive with `anchor`.  **Changes**: Deprecated in Zulip 3.0, replaced by `anchor=\"first_unread\"` instead. 
   */
  def getMessages(numBefore: Int, numAfter: Int, anchor: Option[OneOfstringinteger] = None, narrow: Seq[Any], clientGravatar: Option[Boolean] = None, applyMarkdown: Option[Boolean] = None, useFirstUnreadAnchor: Option[Boolean] = None): ApiRequest[JsonSuccessBase] =
    ApiRequest[JsonSuccessBase](ApiMethods.GET, baseUrl, "/messages", "application/json")
      .withQueryParam("anchor", anchor)
      .withQueryParam("num_before", numBefore)
      .withQueryParam("num_after", numAfter)
      .withQueryParam("narrow", ArrayValues(narrow, MULTI))
      .withQueryParam("client_gravatar", clientGravatar)
      .withQueryParam("apply_markdown", applyMarkdown)
      .withQueryParam("use_first_unread_anchor", useFirstUnreadAnchor)
      .withSuccessResponse[JsonSuccessBase](200)
      

  /**
   * Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   *   code 400 : InvalidMessageError (Bad request.)
   * 
   * @param messageId The target message's ID. 
   */
  def getRawMessage(messageId: Int): ApiRequest[JsonSuccessBase] =
    ApiRequest[JsonSuccessBase](ApiMethods.GET, baseUrl, "/messages/{message_id}", "application/json")
      .withPathParam("message_id", messageId)
      .withSuccessResponse[JsonSuccessBase](200)
      .withErrorResponse[InvalidMessageError](400)
      

  /**
   * Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccess (Success.)
   */
  def markAllAsRead(): ApiRequest[JsonSuccess] =
    ApiRequest[JsonSuccess](ApiMethods.POST, baseUrl, "/mark_all_as_read", "application/json")
      .withSuccessResponse[JsonSuccess](200)
      

  /**
   * Mark all the unread messages in a stream as read. 
   * 
   * Expected answers:
   *   code 200 : JsonSuccess (Success.)
   * 
   * @param streamId The ID of the stream to access. 
   */
  def markStreamAsRead(streamId: Int): ApiRequest[JsonSuccess] =
    ApiRequest[JsonSuccess](ApiMethods.POST, baseUrl, "/mark_stream_as_read", "application/json")
      .withQueryParam("stream_id", streamId)
      .withSuccessResponse[JsonSuccess](200)
      

  /**
   * Mark all the unread messages in a topic as read. 
   * 
   * Expected answers:
   *   code 200 : JsonSuccess (Success.)
   * 
   * @param streamId The ID of the stream to access. 
   * @param topicName The name of the topic whose messages should be marked as read. 
   */
  def markTopicAsRead(streamId: Int, topicName: String): ApiRequest[JsonSuccess] =
    ApiRequest[JsonSuccess](ApiMethods.POST, baseUrl, "/mark_topic_as_read", "application/json")
      .withQueryParam("stream_id", streamId)
      .withQueryParam("topic_name", topicName)
      .withSuccessResponse[JsonSuccess](200)
      

  /**
   * Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccess (Success.)
   *   code 400 : CodedError (Bad request.)
   * 
   * @param messageId The target message's ID. 
   * @param emojiName The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
   * @param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. 
   * @param reactionType If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. 
   */
  def removeReaction(messageId: Int, emojiName: Option[String] = None, emojiCode: Option[String] = None, reactionType: Option[String] = None): ApiRequest[JsonSuccess] =
    ApiRequest[JsonSuccess](ApiMethods.DELETE, baseUrl, "/messages/{message_id}/reactions", "application/json")
      .withQueryParam("emoji_name", emojiName)
      .withQueryParam("emoji_code", emojiCode)
      .withQueryParam("reaction_type", reactionType)
      .withPathParam("message_id", messageId)
      .withSuccessResponse[JsonSuccess](200)
      .withErrorResponse[CodedError](400)
      

  /**
   * Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   * 
   * @param content The content of the message. Maximum message size of 10000 bytes. 
   */
  def renderMessage(content: String): ApiRequest[JsonSuccessBase] =
    ApiRequest[JsonSuccessBase](ApiMethods.POST, baseUrl, "/messages/render", "application/json")
      .withQueryParam("content", content)
      .withSuccessResponse[JsonSuccessBase](200)
      

  /**
   * Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   *   code 400 : OneOfobjectobject (Bad request.)
   * 
   * @param `type` The type of message to be sent. `private` for a private message and `stream` for a stream message. 
   * @param to For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. 
   * @param content The content of the message. Maximum message size of 10000 bytes. 
   * @param topic The topic of the message. Only required for stream messages (`type=\"stream\"`), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. 
   * @param queueId For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, `local_id` is required.  If the message is successfully sent, the server will include `local_id` in the `message` event that the client with this `queue_id` will receive notifying it of the new message via [`GET /events`](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). 
   * @param localId For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the `queue_id` description. 
   */
  def sendMessage(`type`: String, to: Seq[Int], content: String, topic: Option[String] = None, queueId: Option[String] = None, localId: Option[String] = None): ApiRequest[JsonSuccessBase] =
    ApiRequest[JsonSuccessBase](ApiMethods.POST, baseUrl, "/messages", "application/json")
      .withQueryParam("type", `type`)
      .withQueryParam("to", ArrayValues(to, MULTI))
      .withQueryParam("content", content)
      .withQueryParam("topic", topic)
      .withQueryParam("queue_id", queueId)
      .withQueryParam("local_id", localId)
      .withSuccessResponse[JsonSuccessBase](200)
      .withErrorResponse[OneOfobjectobject](400)
      

  /**
   * Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
   * 
   * Expected answers:
   *   code 200 : JsonSuccess (Success.)
   *   code 400 : CodedError (Bad request.)
   * 
   * @param messageId The target message's ID. 
   * @param topic The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. 
   * @param propagateMode Which message(s) should be edited: just the one indicated in `message_id`, messages in the same topic that had been sent after this one, or all of them.  Only the default value of `change_one` is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. 
   * @param sendNotificationToOldThread Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). 
   * @param sendNotificationToNewThread Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). 
   * @param content The content of the message. Maximum message size of 10000 bytes. 
   * @param streamId The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. 
   */
  def updateMessage(messageId: Int, topic: Option[String] = None, propagateMode: Option[String] = None, sendNotificationToOldThread: Option[Boolean] = None, sendNotificationToNewThread: Option[Boolean] = None, content: Option[String] = None, streamId: Option[Int] = None): ApiRequest[JsonSuccess] =
    ApiRequest[JsonSuccess](ApiMethods.PATCH, baseUrl, "/messages/{message_id}", "application/json")
      .withQueryParam("topic", topic)
      .withQueryParam("propagate_mode", propagateMode)
      .withQueryParam("send_notification_to_old_thread", sendNotificationToOldThread)
      .withQueryParam("send_notification_to_new_thread", sendNotificationToNewThread)
      .withQueryParam("content", content)
      .withQueryParam("stream_id", streamId)
      .withPathParam("message_id", messageId)
      .withSuccessResponse[JsonSuccess](200)
      .withErrorResponse[CodedError](400)
      

  /**
   * Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   * 
   * @param messages An array containing the IDs of the target messages. 
   * @param op Whether to `add` the flag or `remove` it. 
   * @param flag The flag that should be added/removed. 
   */
  def updateMessageFlags(messages: Seq[Int], op: String, flag: String): ApiRequest[JsonSuccessBase] =
    ApiRequest[JsonSuccessBase](ApiMethods.POST, baseUrl, "/messages/flags", "application/json")
      .withQueryParam("messages", ArrayValues(messages, MULTI))
      .withQueryParam("op", op)
      .withQueryParam("flag", flag)
      .withSuccessResponse[JsonSuccessBase](200)
      

  /**
   * Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
   * 
   * Expected answers:
   *   code 200 : JsonSuccessBase (Success.)
   * 
   * @param filename 
   */
  def uploadFile(filename: Option[File] = None): ApiRequest[JsonSuccessBase] =
    ApiRequest[JsonSuccessBase](ApiMethods.POST, baseUrl, "/user_uploads", "multipart/form-data")
      .withFormParam("filename", filename)
      .withSuccessResponse[JsonSuccessBase](200)
      



}

