package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.MessagesApiService;

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

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/messages")


@io.swagger.annotations.Api(description = "the messages API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-08T20:42:27.763537Z[Etc/UTC]")
public class MessagesApi  {

    @Inject MessagesApiService service;

    @POST
    @Path("/{message_id}/reactions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add an emoji reaction", notes = "Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` ", response = JsonSuccess.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    public Response addReaction( @PathParam("message_id") Integer messageId, @NotNull  @QueryParam("emoji_name") String emojiName,  @QueryParam("emoji_code") String emojiCode,  @QueryParam("reaction_type") String reactionType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addReaction(messageId,emojiName,emojiCode,reactionType,securityContext);
    }
    @GET
    @Path("/matches_narrow")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Check if messages match a narrow", notes = "Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. ", response = Object.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = Object.class) })
    public Response checkMessagesMatchNarrow( @NotNull  @QueryParam("msg_ids") List<Integer> msgIds, @NotNull  @QueryParam("narrow") List<Object> narrow,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.checkMessagesMatchNarrow(msgIds,narrow,securityContext);
    }
    @DELETE
    @Path("/{message_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a message", notes = "Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely ", response = JsonSuccess.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = OneOfobjectobject.class) })
    public Response deleteMessage( @PathParam("message_id") Integer messageId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteMessage(messageId,securityContext);
    }
    @GET
    @Path("/{message_id}/history")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a message's edit history", notes = "Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history ", response = JsonSuccessBase.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = InvalidMessageError.class) })
    public Response getMessageHistory( @PathParam("message_id") Integer messageId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getMessageHistory(messageId,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get messages", notes = "Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. ", response = JsonSuccessBase.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getMessages( @NotNull @Min(0)  @QueryParam("num_before") Integer numBefore, @NotNull @Min(0)  @QueryParam("num_after") Integer numAfter,  @QueryParam("anchor") OneOfstringinteger anchor,  @QueryParam("narrow") List<Object> narrow,  @DefaultValue("false") @QueryParam("client_gravatar") Boolean clientGravatar,  @DefaultValue("true") @QueryParam("apply_markdown") Boolean applyMarkdown,  @DefaultValue("false") @QueryParam("use_first_unread_anchor") Boolean useFirstUnreadAnchor,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getMessages(numBefore,numAfter,anchor,narrow,clientGravatar,applyMarkdown,useFirstUnreadAnchor,securityContext);
    }
    @GET
    @Path("/{message_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a message's raw Markdown", notes = "Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). ", response = JsonSuccessBase.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = InvalidMessageError.class) })
    public Response getRawMessage( @PathParam("message_id") Integer messageId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRawMessage(messageId,securityContext);
    }
    @DELETE
    @Path("/{message_id}/reactions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Remove an emoji reaction", notes = "Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` ", response = JsonSuccess.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    public Response removeReaction( @PathParam("message_id") Integer messageId,  @QueryParam("emoji_name") String emojiName,  @QueryParam("emoji_code") String emojiCode,  @QueryParam("reaction_type") String reactionType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeReaction(messageId,emojiName,emojiCode,reactionType,securityContext);
    }
    @POST
    @Path("/render")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Render message", notes = "Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` ", response = JsonSuccessBase.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response renderMessage( @NotNull  @QueryParam("content") String content,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.renderMessage(content,securityContext);
    }
    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Send a message", notes = "Send a stream or a private message.  `POST {{ api_url }}/v1/messages` ", response = JsonSuccessBase.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = OneOfobjectobject.class) })
    public Response sendMessage( @NotNull , allowableValues="private, stream" @QueryParam("type") String type, @NotNull  @QueryParam("to") List<Integer> to, @NotNull  @QueryParam("content") String content,  @QueryParam("topic") String topic,  @QueryParam("queue_id") String queueId,  @QueryParam("local_id") String localId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.sendMessage(type,to,content,topic,queueId,localId,securityContext);
    }
    @PATCH
    @Path("/{message_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Edit a message", notes = "Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion ", response = JsonSuccess.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    public Response updateMessage( @PathParam("message_id") Integer messageId,  @QueryParam("topic") String topic, , allowableValues="change_one, change_later, change_all" @DefaultValue("change_one") @QueryParam("propagate_mode") String propagateMode,  @DefaultValue("true") @QueryParam("send_notification_to_old_thread") Boolean sendNotificationToOldThread,  @DefaultValue("true") @QueryParam("send_notification_to_new_thread") Boolean sendNotificationToNewThread,  @QueryParam("content") String content,  @QueryParam("stream_id") Integer streamId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateMessage(messageId,topic,propagateMode,sendNotificationToOldThread,sendNotificationToNewThread,content,streamId,securityContext);
    }
    @POST
    @Path("/flags")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update personal message flags", notes = "Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). ", response = JsonSuccessBase.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response updateMessageFlags( @NotNull  @QueryParam("messages") List<Integer> messages, @NotNull , allowableValues="add, remove" @QueryParam("op") String op, @NotNull  @QueryParam("flag") String flag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateMessageFlags(messages,op,flag,securityContext);
    }
}
