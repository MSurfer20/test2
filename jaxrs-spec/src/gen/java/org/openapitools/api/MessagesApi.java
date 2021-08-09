package org.openapitools.api;

import org.openapitools.model.CodedError;
import org.openapitools.model.InvalidMessageError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.OneOfobjectobject;
import org.openapitools.model.OneOfstringinteger;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/messages")
@Api(description = "the messages API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-09T21:34:15.269802Z[Etc/UTC]")public class MessagesApi {

    @POST
    @Path("/{message_id}/reactions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Add an emoji reaction", notes = "Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` ", response = JsonSuccess.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class)
    })
    public Response addReaction(@PathParam("message_id") @ApiParam("The target message&#39;s ID. ") Integer messageId,@QueryParam("emoji_name") @NotNull   @ApiParam("The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name. ")  String emojiName,@QueryParam("emoji_code")   @ApiParam("A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji. ")  String emojiCode,@QueryParam("reaction_type")   @ApiParam("If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified. ")  String reactionType) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/matches_narrow")
    @Produces({ "application/json" })
    @ApiOperation(value = "Check if messages match a narrow", notes = "Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. ", response = Object.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = Object.class)
    })
    public Response checkMessagesMatchNarrow(@QueryParam("msg_ids") @NotNull   @ApiParam("List of IDs for the messages to check.")  List<Integer> msgIds,@QueryParam("narrow") @NotNull   @ApiParam("A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).")  List<Object> narrow) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{message_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a message", notes = "Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely ", response = JsonSuccess.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = OneOfobjectobject.class)
    })
    public Response deleteMessage(@PathParam("message_id") @ApiParam("The target message&#39;s ID. ") Integer messageId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{message_id}/history")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a message's edit history", notes = "Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history ", response = JsonSuccessBase.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = InvalidMessageError.class)
    })
    public Response getMessageHistory(@PathParam("message_id") @ApiParam("The target message&#39;s ID. ") Integer messageId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get messages", notes = "Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. ", response = JsonSuccessBase.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response getMessages(@QueryParam("num_before") @NotNull @Min(0)   @ApiParam("The number of messages with IDs less than the anchor to retrieve. ")  Integer numBefore,@QueryParam("num_after") @NotNull @Min(0)   @ApiParam("The number of messages with IDs greater than the anchor to retrieve. ")  Integer numAfter,@QueryParam("anchor")   @ApiParam("Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * &#x60;newest&#x60;: The most recent message. * &#x60;oldest&#x60;: The oldest message. * &#x60;first_unread&#x60;: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of &#x60;&#39;newest&#39;&#x60; and &#x60;&#39;oldest&#39;&#x60; are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   &#x60;first_unread&#x60; functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, &#x60;oldest&#x60; can be emulated with   &#x60;anchor&#x3D;0&#x60;, and &#x60;newest&#x60; with &#x60;anchor&#x3D;10000000000000000&#x60;   (that specific large value works around a bug in Zulip   2.1.x and older in the &#x60;found_newest&#x60; return value). ")  OneOfstringinteger anchor,@QueryParam("narrow")   @ApiParam("The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). ")  List<Object> narrow,@QueryParam("client_gravatar")  @DefaultValue("false")  @ApiParam("Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. ")  Boolean clientGravatar,@QueryParam("apply_markdown")  @DefaultValue("true")  @ApiParam("If &#x60;true&#x60;, message content is returned in the rendered HTML format. If &#x60;false&#x60;, message content is returned in the raw Markdown-format text that user entered. ")  Boolean applyMarkdown,@QueryParam("use_first_unread_anchor")  @DefaultValue("false")  @ApiParam("Legacy way to specify &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the &#x60;anchor&#x60;.  Mutually exclusive with &#x60;anchor&#x60;.  **Changes**: Deprecated in Zulip 3.0, replaced by &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; instead. ")  Boolean useFirstUnreadAnchor) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{message_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a message's raw Markdown", notes = "Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). ", response = JsonSuccessBase.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = InvalidMessageError.class)
    })
    public Response getRawMessage(@PathParam("message_id") @ApiParam("The target message&#39;s ID. ") Integer messageId) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{message_id}/reactions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove an emoji reaction", notes = "Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` ", response = JsonSuccess.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class)
    })
    public Response removeReaction(@PathParam("message_id") @ApiParam("The target message&#39;s ID. ") Integer messageId,@QueryParam("emoji_name")   @ApiParam("The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name. ")  String emojiName,@QueryParam("emoji_code")   @ApiParam("A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji. ")  String emojiCode,@QueryParam("reaction_type")   @ApiParam("If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified. ")  String reactionType) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/render")
    @Produces({ "application/json" })
    @ApiOperation(value = "Render message", notes = "Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` ", response = JsonSuccessBase.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response renderMessage(@QueryParam("content") @NotNull   @ApiParam("The content of the message. Maximum message size of 10000 bytes. ")  String content) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Produces({ "application/json" })
    @ApiOperation(value = "Send a message", notes = "Send a stream or a private message.  `POST {{ api_url }}/v1/messages` ", response = JsonSuccessBase.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = OneOfobjectobject.class)
    })
    public Response sendMessage(@QueryParam("type") @NotNull   @ApiParam("The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message. ")  String type,@QueryParam("to") @NotNull   @ApiParam("For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. ")  List<Integer> to,@QueryParam("content") @NotNull   @ApiParam("The content of the message. Maximum message size of 10000 bytes. ")  String content,@QueryParam("topic")   @ApiParam("The topic of the message. Only required for stream messages (&#x60;type&#x3D;\&quot;stream\&quot;&#x60;), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias. ")  String topic,@QueryParam("queue_id")   @ApiParam("For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, &#x60;local_id&#x60; is required.  If the message is successfully sent, the server will include &#x60;local_id&#x60; in the &#x60;message&#x60; event that the client with this &#x60;queue_id&#x60; will receive notifying it of the new message via [&#x60;GET /events&#x60;](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). ")  String queueId,@QueryParam("local_id")   @ApiParam("For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the &#x60;queue_id&#x60; description. ")  String localId) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{message_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Edit a message", notes = "Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion ", response = JsonSuccess.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class)
    })
    public Response updateMessage(@PathParam("message_id") @ApiParam("The target message&#39;s ID. ") Integer messageId,@QueryParam("topic")   @ApiParam("The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias. ")  String topic,@QueryParam("propagate_mode")  @DefaultValue("change_one")  @ApiParam("Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. ")  String propagateMode,@QueryParam("send_notification_to_old_thread")  @DefaultValue("true")  @ApiParam("Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). ")  Boolean sendNotificationToOldThread,@QueryParam("send_notification_to_new_thread")  @DefaultValue("true")  @ApiParam("Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). ")  Boolean sendNotificationToNewThread,@QueryParam("content")   @ApiParam("The content of the message. Maximum message size of 10000 bytes. ")  String content,@QueryParam("stream_id")   @ApiParam("The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. ")  Integer streamId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/flags")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update personal message flags", notes = "Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). ", response = JsonSuccessBase.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response updateMessageFlags(@QueryParam("messages") @NotNull   @ApiParam("An array containing the IDs of the target messages. ")  List<Integer> messages,@QueryParam("op") @NotNull   @ApiParam("Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it. ")  String op,@QueryParam("flag") @NotNull   @ApiParam("The flag that should be added/removed. ")  String flag) {
        return Response.ok().entity("magic!").build();
    }
}
