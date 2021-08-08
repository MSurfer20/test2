package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CodedError;
import java.io.File;
import com.prokarma.pkmst.model.InvalidMessageError;
import com.prokarma.pkmst.model.JsonSuccess;
import com.prokarma.pkmst.model.JsonSuccessBase;
import com.prokarma.pkmst.model.OneOfobjectobject;
import com.prokarma.pkmst.model.OneOfstringinteger;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implemention
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2021-08-08T20:39:33.025212Z[Etc/UTC]")
@Controller
public class MessagesApiController implements MessagesApi {
    private final ObjectMapper objectMapper;
@Autowired
    public MessagesApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<JsonSuccess> addReaction(@ApiParam(value = "The target message's ID. ",required=true ) @PathVariable("message_id") Integer messageId,
        @ApiParam(value = "The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. ", required = true)  @RequestParam(value = "emoji_name", required = true) String emojiName,
        @ApiParam(value = "A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. ")  @RequestParam(value = "emoji_code", required = false) String emojiCode,
        @ApiParam(value = "If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. ")  @RequestParam(value = "reaction_type", required = false) String reactionType,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<Object> checkMessagesMatchNarrow(@ApiParam(value = "List of IDs for the messages to check.", required = true)  @RequestParam(value = "msg_ids", required = true) List<Integer> msgIds,
        @ApiParam(value = "A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).", required = true)  @RequestParam(value = "narrow", required = true) List<Object> narrow,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> deleteMessage(@ApiParam(value = "The target message's ID. ",required=true ) @PathVariable("message_id") Integer messageId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getFileTemporaryUrl(@ApiParam(value = "The realm id. ",required=true ) @PathVariable("realm_id_str") Integer realmIdStr,
        @ApiParam(value = "Path to the URL. ",required=true ) @PathVariable("filename") String filename,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getMessageHistory(@ApiParam(value = "The target message's ID. ",required=true ) @PathVariable("message_id") Integer messageId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getMessages(@ApiParam(value = "The number of messages with IDs less than the anchor to retrieve. ", required = true)  @RequestParam(value = "num_before", required = true) Integer numBefore,
        @ApiParam(value = "The number of messages with IDs greater than the anchor to retrieve. ", required = true)  @RequestParam(value = "num_after", required = true) Integer numAfter,
        @ApiParam(value = "Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * `newest`: The most recent message. * `oldest`: The oldest message. * `first_unread`: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of `'newest'` and `'oldest'` are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   `first_unread` functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, `oldest` can be emulated with   `anchor=0`, and `newest` with `anchor=10000000000000000`   (that specific large value works around a bug in Zulip   2.1.x and older in the `found_newest` return value). ")  @RequestParam(value = "anchor", required = false) OneOfstringinteger anchor,
        @ApiParam(value = "The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). ")  @RequestParam(value = "narrow", required = false) List<Object> narrow,
        @ApiParam(value = "Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. ", defaultValue = "false")  @RequestParam(value = "client_gravatar", required = false, defaultValue="false") Boolean clientGravatar,
        @ApiParam(value = "If `true`, message content is returned in the rendered HTML format. If `false`, message content is returned in the raw Markdown-format text that user entered. ", defaultValue = "true")  @RequestParam(value = "apply_markdown", required = false, defaultValue="true") Boolean applyMarkdown,
        @ApiParam(value = "Legacy way to specify `anchor=\"first_unread\"` in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the `anchor`.  Mutually exclusive with `anchor`.  **Changes**: Deprecated in Zulip 3.0, replaced by `anchor=\"first_unread\"` instead. ", defaultValue = "false")  @RequestParam(value = "use_first_unread_anchor", required = false, defaultValue="false") Boolean useFirstUnreadAnchor,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> getRawMessage(@ApiParam(value = "The target message's ID. ",required=true ) @PathVariable("message_id") Integer messageId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> markAllAsRead(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> markStreamAsRead(@ApiParam(value = "The ID of the stream to access. ", required = true)  @RequestParam(value = "stream_id", required = true) Integer streamId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> markTopicAsRead(@ApiParam(value = "The ID of the stream to access. ", required = true)  @RequestParam(value = "stream_id", required = true) Integer streamId,
        @ApiParam(value = "The name of the topic whose messages should be marked as read. ", required = true)  @RequestParam(value = "topic_name", required = true) String topicName,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> removeReaction(@ApiParam(value = "The target message's ID. ",required=true ) @PathVariable("message_id") Integer messageId,
        @ApiParam(value = "The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. ")  @RequestParam(value = "emoji_name", required = false) String emojiName,
        @ApiParam(value = "A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. ")  @RequestParam(value = "emoji_code", required = false) String emojiCode,
        @ApiParam(value = "If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. ")  @RequestParam(value = "reaction_type", required = false) String reactionType,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> renderMessage(@ApiParam(value = "The content of the message. Maximum message size of 10000 bytes. ", required = true)  @RequestParam(value = "content", required = true) String content,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> sendMessage(@ApiParam(value = "The type of message to be sent. `private` for a private message and `stream` for a stream message. ", required = true, allowableValues = "private, stream")  @RequestParam(value = "type", required = true) String type,
        @ApiParam(value = "For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. ", required = true)  @RequestParam(value = "to", required = true) List<Integer> to,
        @ApiParam(value = "The content of the message. Maximum message size of 10000 bytes. ", required = true)  @RequestParam(value = "content", required = true) String content,
        @ApiParam(value = "The topic of the message. Only required for stream messages (`type=\"stream\"`), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. ")  @RequestParam(value = "topic", required = false) String topic,
        @ApiParam(value = "For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, `local_id` is required.  If the message is successfully sent, the server will include `local_id` in the `message` event that the client with this `queue_id` will receive notifying it of the new message via [`GET /events`](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). ")  @RequestParam(value = "queue_id", required = false) String queueId,
        @ApiParam(value = "For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the `queue_id` description. ")  @RequestParam(value = "local_id", required = false) String localId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccess> updateMessage(@ApiParam(value = "The target message's ID. ",required=true ) @PathVariable("message_id") Integer messageId,
        @ApiParam(value = "The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. ")  @RequestParam(value = "topic", required = false) String topic,
        @ApiParam(value = "Which message(s) should be edited: just the one indicated in `message_id`, messages in the same topic that had been sent after this one, or all of them.  Only the default value of `change_one` is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. ", allowableValues = "change_one, change_later, change_all", defaultValue = "change_one")  @RequestParam(value = "propagate_mode", required = false, defaultValue="change_one") String propagateMode,
        @ApiParam(value = "Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). ", defaultValue = "true")  @RequestParam(value = "send_notification_to_old_thread", required = false, defaultValue="true") Boolean sendNotificationToOldThread,
        @ApiParam(value = "Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). ", defaultValue = "true")  @RequestParam(value = "send_notification_to_new_thread", required = false, defaultValue="true") Boolean sendNotificationToNewThread,
        @ApiParam(value = "The content of the message. Maximum message size of 10000 bytes. ")  @RequestParam(value = "content", required = false) String content,
        @ApiParam(value = "The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. ")  @RequestParam(value = "stream_id", required = false) Integer streamId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccess>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> updateMessageFlags(@ApiParam(value = "An array containing the IDs of the target messages. ", required = true)  @RequestParam(value = "messages", required = true) List<Integer> messages,
        @ApiParam(value = "Whether to `add` the flag or `remove` it. ", required = true, allowableValues = "add, remove")  @RequestParam(value = "op", required = true) String op,
        @ApiParam(value = "The flag that should be added/removed. ", required = true)  @RequestParam(value = "flag", required = true) String flag,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

    public ResponseEntity<JsonSuccessBase> uploadFile(@ApiParam(value = "file detail")  @RequestPart("file") MultipartFile filename,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<JsonSuccessBase>(HttpStatus.OK);
    }

}
