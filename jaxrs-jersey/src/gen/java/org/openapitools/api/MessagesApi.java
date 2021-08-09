package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.MessagesApiService;
import org.openapitools.api.factories.MessagesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CodedError;
import org.openapitools.model.InvalidMessageError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.OneOfobjectobject;
import org.openapitools.model.OneOfstringinteger;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/messages")


@io.swagger.annotations.Api(description = "the messages API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-09T21:34:02.517112Z[Etc/UTC]")
public class MessagesApi  {
   private final MessagesApiService delegate;

   public MessagesApi(@Context ServletConfig servletContext) {
      MessagesApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("MessagesApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (MessagesApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = MessagesApiServiceFactory.getMessagesApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/{message_id}/reactions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add an emoji reaction", notes = "Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` ", response = JsonSuccess.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = CodedError.class)
    })
    public Response addReaction(@ApiParam(value = "The target message's ID. ", required = true) @PathParam("message_id") @NotNull  Integer messageId,@ApiParam(value = "The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. ", required = true) @QueryParam("emoji_name") @NotNull  String emojiName,@ApiParam(value = "A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. ") @QueryParam("emoji_code")  String emojiCode,@ApiParam(value = "If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. ") @QueryParam("reaction_type")  String reactionType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addReaction(messageId, emojiName, emojiCode, reactionType, securityContext);
    }
    @GET
    @Path("/matches_narrow")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Check if messages match a narrow", notes = "Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. ", response = Object.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = Object.class)
    })
    public Response checkMessagesMatchNarrow(@ApiParam(value = "List of IDs for the messages to check.", required = true) @QueryParam("msg_ids") @NotNull @Valid  List<Integer> msgIds,@ApiParam(value = "A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).", required = true) @QueryParam("narrow") @NotNull @Valid  List<Object> narrow,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.checkMessagesMatchNarrow(msgIds, narrow, securityContext);
    }
    @DELETE
    @Path("/{message_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a message", notes = "Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely ", response = JsonSuccess.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = OneOfobjectobject.class)
    })
    public Response deleteMessage(@ApiParam(value = "The target message's ID. ", required = true) @PathParam("message_id") @NotNull  Integer messageId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteMessage(messageId, securityContext);
    }
    @GET
    @Path("/{message_id}/history")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a message's edit history", notes = "Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history ", response = JsonSuccessBase.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = InvalidMessageError.class)
    })
    public Response getMessageHistory(@ApiParam(value = "The target message's ID. ", required = true) @PathParam("message_id") @NotNull  Integer messageId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getMessageHistory(messageId, securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get messages", notes = "Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. ", response = JsonSuccessBase.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response getMessages(@ApiParam(value = "The number of messages with IDs less than the anchor to retrieve. ", required = true) @QueryParam("num_before") @NotNull  @Min(0) Integer numBefore,@ApiParam(value = "The number of messages with IDs greater than the anchor to retrieve. ", required = true) @QueryParam("num_after") @NotNull  @Min(0) Integer numAfter,@ApiParam(value = "Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * `newest`: The most recent message. * `oldest`: The oldest message. * `first_unread`: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of `'newest'` and `'oldest'` are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   `first_unread` functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, `oldest` can be emulated with   `anchor=0`, and `newest` with `anchor=10000000000000000`   (that specific large value works around a bug in Zulip   2.1.x and older in the `found_newest` return value). ") @QueryParam("anchor") @Valid  OneOfstringinteger anchor,@ApiParam(value = "The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). ") @QueryParam("narrow") @Valid  List<Object> narrow,@ApiParam(value = "Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. ", defaultValue = "false") @DefaultValue("false") @QueryParam("client_gravatar")  Boolean clientGravatar,@ApiParam(value = "If `true`, message content is returned in the rendered HTML format. If `false`, message content is returned in the raw Markdown-format text that user entered. ", defaultValue = "true") @DefaultValue("true") @QueryParam("apply_markdown")  Boolean applyMarkdown,@ApiParam(value = "Legacy way to specify `anchor=\"first_unread\"` in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the `anchor`.  Mutually exclusive with `anchor`.  **Changes**: Deprecated in Zulip 3.0, replaced by `anchor=\"first_unread\"` instead. ", defaultValue = "false") @DefaultValue("false") @QueryParam("use_first_unread_anchor")  Boolean useFirstUnreadAnchor,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getMessages(numBefore, numAfter, anchor, narrow, clientGravatar, applyMarkdown, useFirstUnreadAnchor, securityContext);
    }
    @GET
    @Path("/{message_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a message's raw Markdown", notes = "Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). ", response = JsonSuccessBase.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = InvalidMessageError.class)
    })
    public Response getRawMessage(@ApiParam(value = "The target message's ID. ", required = true) @PathParam("message_id") @NotNull  Integer messageId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRawMessage(messageId, securityContext);
    }
    @DELETE
    @Path("/{message_id}/reactions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Remove an emoji reaction", notes = "Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` ", response = JsonSuccess.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = CodedError.class)
    })
    public Response removeReaction(@ApiParam(value = "The target message's ID. ", required = true) @PathParam("message_id") @NotNull  Integer messageId,@ApiParam(value = "The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. ") @QueryParam("emoji_name")  String emojiName,@ApiParam(value = "A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. ") @QueryParam("emoji_code")  String emojiCode,@ApiParam(value = "If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. ") @QueryParam("reaction_type")  String reactionType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.removeReaction(messageId, emojiName, emojiCode, reactionType, securityContext);
    }
    @POST
    @Path("/render")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Render message", notes = "Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` ", response = JsonSuccessBase.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response renderMessage(@ApiParam(value = "The content of the message. Maximum message size of 10000 bytes. ", required = true) @QueryParam("content") @NotNull  String content,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.renderMessage(content, securityContext);
    }
    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Send a message", notes = "Send a stream or a private message.  `POST {{ api_url }}/v1/messages` ", response = JsonSuccessBase.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = OneOfobjectobject.class)
    })
    public Response sendMessage(@ApiParam(value = "The type of message to be sent. `private` for a private message and `stream` for a stream message. ", required = true, allowableValues="private, stream") @QueryParam("type") @NotNull  String type,@ApiParam(value = "For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. ", required = true) @QueryParam("to") @NotNull @Valid  List<Integer> to,@ApiParam(value = "The content of the message. Maximum message size of 10000 bytes. ", required = true) @QueryParam("content") @NotNull  String content,@ApiParam(value = "The topic of the message. Only required for stream messages (`type=\"stream\"`), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. ") @QueryParam("topic")  String topic,@ApiParam(value = "For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, `local_id` is required.  If the message is successfully sent, the server will include `local_id` in the `message` event that the client with this `queue_id` will receive notifying it of the new message via [`GET /events`](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). ") @QueryParam("queue_id")  String queueId,@ApiParam(value = "For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the `queue_id` description. ") @QueryParam("local_id")  String localId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sendMessage(type, to, content, topic, queueId, localId, securityContext);
    }
    @PATCH
    @Path("/{message_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Edit a message", notes = "Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion ", response = JsonSuccess.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = CodedError.class)
    })
    public Response updateMessage(@ApiParam(value = "The target message's ID. ", required = true) @PathParam("message_id") @NotNull  Integer messageId,@ApiParam(value = "The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. ") @QueryParam("topic")  String topic,@ApiParam(value = "Which message(s) should be edited: just the one indicated in `message_id`, messages in the same topic that had been sent after this one, or all of them.  Only the default value of `change_one` is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. ", allowableValues="change_one, change_later, change_all", defaultValue = "change_one") @DefaultValue("change_one") @QueryParam("propagate_mode")  String propagateMode,@ApiParam(value = "Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). ", defaultValue = "true") @DefaultValue("true") @QueryParam("send_notification_to_old_thread")  Boolean sendNotificationToOldThread,@ApiParam(value = "Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). ", defaultValue = "true") @DefaultValue("true") @QueryParam("send_notification_to_new_thread")  Boolean sendNotificationToNewThread,@ApiParam(value = "The content of the message. Maximum message size of 10000 bytes. ") @QueryParam("content")  String content,@ApiParam(value = "The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. ") @QueryParam("stream_id")  Integer streamId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateMessage(messageId, topic, propagateMode, sendNotificationToOldThread, sendNotificationToNewThread, content, streamId, securityContext);
    }
    @POST
    @Path("/flags")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update personal message flags", notes = "Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). ", response = JsonSuccessBase.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response updateMessageFlags(@ApiParam(value = "An array containing the IDs of the target messages. ", required = true) @QueryParam("messages") @NotNull @Valid  List<Integer> messages,@ApiParam(value = "Whether to `add` the flag or `remove` it. ", required = true, allowableValues="add, remove") @QueryParam("op") @NotNull  String op,@ApiParam(value = "The flag that should be added/removed. ", required = true) @QueryParam("flag") @NotNull  String flag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateMessageFlags(messages, op, flag, securityContext);
    }
}
