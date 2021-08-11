/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CodedError;
import java.io.File;
import com.prokarma.pkmst.model.InvalidMessageError;
import com.prokarma.pkmst.model.JsonSuccess;
import com.prokarma.pkmst.model.JsonSuccessBase;
import com.prokarma.pkmst.model.OneOfobjectobject;
import com.prokarma.pkmst.model.OneOfstringinteger;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
/**
 * Provides the info about api methods
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen")
@Api(value = "Messages", description = "the Messages API")
public interface MessagesApi {

    @ApiOperation(value = "Add an emoji reaction", notes = "Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` ", response = JsonSuccess.class, tags={ "messages", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    @PostMapping(
        value = "/messages/{message_id}/reactions",
        produces = { "application/json" }
    )
    ResponseEntity<JsonSuccess> addReaction(@ApiParam(value = "The target message's ID. ",required=true ) @PathVariable("message_id") Integer messageId,@ApiParam(value = "The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. ", required = true)  @RequestParam(value = "emoji_name", required = true) String emojiName,@ApiParam(value = "A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. ")  @RequestParam(value = "emoji_code", required = false) String emojiCode,@ApiParam(value = "If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. ")  @RequestParam(value = "reaction_type", required = false) String reactionType, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Check if messages match a narrow", notes = "Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. ", response = Object.class, tags={ "messages", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = Object.class) })
    @GetMapping(
        value = "/messages/matches_narrow",
        produces = { "application/json" }
    )
    ResponseEntity<Object> checkMessagesMatchNarrow(@ApiParam(value = "List of IDs for the messages to check.", required = true)  @RequestParam(value = "msg_ids", required = true) List<Integer> msgIds,@ApiParam(value = "A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).", required = true)  @RequestParam(value = "narrow", required = true) List<Object> narrow, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Delete a message", notes = "Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely ", response = JsonSuccess.class, tags={ "messages", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = OneOfobjectobject.class) })
    @DeleteMapping(
        value = "/messages/{message_id}",
        produces = { "application/json" }
    )
    ResponseEntity<JsonSuccess> deleteMessage(@ApiParam(value = "The target message's ID. ",required=true ) @PathVariable("message_id") Integer messageId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Get public temporary URL", notes = "Get a temporary URL for access to the file that doesn't require authentication. ", response = JsonSuccessBase.class, tags={ "messages", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    @GetMapping(
        value = "/user_uploads/{realm_id_str}/{filename}",
        produces = { "application/json" }
    )
    ResponseEntity<JsonSuccessBase> getFileTemporaryUrl(@ApiParam(value = "The realm id. ",required=true ) @PathVariable("realm_id_str") Integer realmIdStr,@ApiParam(value = "Path to the URL. ",required=true ) @PathVariable("filename") String filename, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Get a message's edit history", notes = "Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history ", response = JsonSuccessBase.class, tags={ "messages", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = InvalidMessageError.class) })
    @GetMapping(
        value = "/messages/{message_id}/history",
        produces = { "application/json" }
    )
    ResponseEntity<JsonSuccessBase> getMessageHistory(@ApiParam(value = "The target message's ID. ",required=true ) @PathVariable("message_id") Integer messageId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Get messages", notes = "Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. ", response = JsonSuccessBase.class, tags={ "messages", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    @GetMapping(
        value = "/messages",
        produces = { "application/json" }
    )
    ResponseEntity<JsonSuccessBase> getMessages(@ApiParam(value = "The number of messages with IDs less than the anchor to retrieve. ", required = true)  @RequestParam(value = "num_before", required = true) Integer numBefore,@ApiParam(value = "The number of messages with IDs greater than the anchor to retrieve. ", required = true)  @RequestParam(value = "num_after", required = true) Integer numAfter,@ApiParam(value = "Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * `newest`: The most recent message. * `oldest`: The oldest message. * `first_unread`: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of `'newest'` and `'oldest'` are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   `first_unread` functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, `oldest` can be emulated with   `anchor=0`, and `newest` with `anchor=10000000000000000`   (that specific large value works around a bug in Zulip   2.1.x and older in the `found_newest` return value). ")  @RequestParam(value = "anchor", required = false) OneOfstringinteger anchor,@ApiParam(value = "The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). ")  @RequestParam(value = "narrow", required = false) List<Object> narrow,@ApiParam(value = "Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. ", defaultValue = "false")  @RequestParam(value = "client_gravatar", required = false, defaultValue="false") Boolean clientGravatar,@ApiParam(value = "If `true`, message content is returned in the rendered HTML format. If `false`, message content is returned in the raw Markdown-format text that user entered. ", defaultValue = "true")  @RequestParam(value = "apply_markdown", required = false, defaultValue="true") Boolean applyMarkdown,@ApiParam(value = "Legacy way to specify `anchor=\"first_unread\"` in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the `anchor`.  Mutually exclusive with `anchor`.  **Changes**: Deprecated in Zulip 3.0, replaced by `anchor=\"first_unread\"` instead. ", defaultValue = "false")  @RequestParam(value = "use_first_unread_anchor", required = false, defaultValue="false") Boolean useFirstUnreadAnchor, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Get a message's raw Markdown", notes = "Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). ", response = JsonSuccessBase.class, tags={ "messages", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = InvalidMessageError.class) })
    @GetMapping(
        value = "/messages/{message_id}",
        produces = { "application/json" }
    )
    ResponseEntity<JsonSuccessBase> getRawMessage(@ApiParam(value = "The target message's ID. ",required=true ) @PathVariable("message_id") Integer messageId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Mark all messages as read", notes = "Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` ", response = JsonSuccess.class, tags={ "messages", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    @PostMapping(
        value = "/mark_all_as_read",
        produces = { "application/json" }
    )
    ResponseEntity<JsonSuccess> markAllAsRead( @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Mark messages in a stream as read", notes = "Mark all the unread messages in a stream as read. ", response = JsonSuccess.class, tags={ "messages", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    @PostMapping(
        value = "/mark_stream_as_read",
        produces = { "application/json" }
    )
    ResponseEntity<JsonSuccess> markStreamAsRead(@ApiParam(value = "The ID of the stream to access. ", required = true)  @RequestParam(value = "stream_id", required = true) Integer streamId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Mark messages in a topic as read", notes = "Mark all the unread messages in a topic as read. ", response = JsonSuccess.class, tags={ "messages", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    @PostMapping(
        value = "/mark_topic_as_read",
        produces = { "application/json" }
    )
    ResponseEntity<JsonSuccess> markTopicAsRead(@ApiParam(value = "The ID of the stream to access. ", required = true)  @RequestParam(value = "stream_id", required = true) Integer streamId,@ApiParam(value = "The name of the topic whose messages should be marked as read. ", required = true)  @RequestParam(value = "topic_name", required = true) String topicName, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Remove an emoji reaction", notes = "Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` ", response = JsonSuccess.class, tags={ "messages", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    @DeleteMapping(
        value = "/messages/{message_id}/reactions",
        produces = { "application/json" }
    )
    ResponseEntity<JsonSuccess> removeReaction(@ApiParam(value = "The target message's ID. ",required=true ) @PathVariable("message_id") Integer messageId,@ApiParam(value = "The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. ")  @RequestParam(value = "emoji_name", required = false) String emojiName,@ApiParam(value = "A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. ")  @RequestParam(value = "emoji_code", required = false) String emojiCode,@ApiParam(value = "If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. ")  @RequestParam(value = "reaction_type", required = false) String reactionType, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Render message", notes = "Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` ", response = JsonSuccessBase.class, tags={ "messages", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    @PostMapping(
        value = "/messages/render",
        produces = { "application/json" }
    )
    ResponseEntity<JsonSuccessBase> renderMessage(@ApiParam(value = "The content of the message. Maximum message size of 10000 bytes. ", required = true)  @RequestParam(value = "content", required = true) String content, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Send a message", notes = "Send a stream or a private message.  `POST {{ api_url }}/v1/messages` ", response = JsonSuccessBase.class, tags={ "messages", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = OneOfobjectobject.class) })
    @PostMapping(
        value = "/messages",
        produces = { "application/json" }
    )
    ResponseEntity<JsonSuccessBase> sendMessage(@ApiParam(value = "The type of message to be sent. `private` for a private message and `stream` for a stream message. ", required = true, allowableValues = "private, stream")  @RequestParam(value = "type", required = true) String type,@ApiParam(value = "For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. ", required = true)  @RequestParam(value = "to", required = true) List<Integer> to,@ApiParam(value = "The content of the message. Maximum message size of 10000 bytes. ", required = true)  @RequestParam(value = "content", required = true) String content,@ApiParam(value = "The topic of the message. Only required for stream messages (`type=\"stream\"`), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. ")  @RequestParam(value = "topic", required = false) String topic,@ApiParam(value = "For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, `local_id` is required.  If the message is successfully sent, the server will include `local_id` in the `message` event that the client with this `queue_id` will receive notifying it of the new message via [`GET /events`](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). ")  @RequestParam(value = "queue_id", required = false) String queueId,@ApiParam(value = "For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the `queue_id` description. ")  @RequestParam(value = "local_id", required = false) String localId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Edit a message", notes = "Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion ", response = JsonSuccess.class, tags={ "messages", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    @PatchMapping(
        value = "/messages/{message_id}",
        produces = { "application/json" }
    )
    ResponseEntity<JsonSuccess> updateMessage(@ApiParam(value = "The target message's ID. ",required=true ) @PathVariable("message_id") Integer messageId,@ApiParam(value = "The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. ")  @RequestParam(value = "topic", required = false) String topic,@ApiParam(value = "Which message(s) should be edited: just the one indicated in `message_id`, messages in the same topic that had been sent after this one, or all of them.  Only the default value of `change_one` is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. ", allowableValues = "change_one, change_later, change_all", defaultValue = "change_one")  @RequestParam(value = "propagate_mode", required = false, defaultValue="change_one") String propagateMode,@ApiParam(value = "Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). ", defaultValue = "true")  @RequestParam(value = "send_notification_to_old_thread", required = false, defaultValue="true") Boolean sendNotificationToOldThread,@ApiParam(value = "Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). ", defaultValue = "true")  @RequestParam(value = "send_notification_to_new_thread", required = false, defaultValue="true") Boolean sendNotificationToNewThread,@ApiParam(value = "The content of the message. Maximum message size of 10000 bytes. ")  @RequestParam(value = "content", required = false) String content,@ApiParam(value = "The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. ")  @RequestParam(value = "stream_id", required = false) Integer streamId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Update personal message flags", notes = "Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). ", response = JsonSuccessBase.class, tags={ "messages", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    @PostMapping(
        value = "/messages/flags",
        produces = { "application/json" }
    )
    ResponseEntity<JsonSuccessBase> updateMessageFlags(@ApiParam(value = "An array containing the IDs of the target messages. ", required = true)  @RequestParam(value = "messages", required = true) List<Integer> messages,@ApiParam(value = "Whether to `add` the flag or `remove` it. ", required = true, allowableValues = "add, remove")  @RequestParam(value = "op", required = true) String op,@ApiParam(value = "The flag that should be added/removed. ", required = true)  @RequestParam(value = "flag", required = true) String flag, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Upload a file", notes = "Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message ", response = JsonSuccessBase.class, tags={ "messages", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    @PostMapping(
        value = "/user_uploads",
        produces = { "application/json" },
        consumes = { "multipart/form-data" }
    )
    ResponseEntity<JsonSuccessBase> uploadFile(@ApiParam(value = "file detail")  @RequestPart("file") MultipartFile filename, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
