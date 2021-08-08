package org.openapitools.api;

import org.openapitools.model.CodedError;
import java.io.File;
import org.openapitools.model.InvalidMessageError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.OneOfobjectobject;
import org.openapitools.model.OneOfstringinteger;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Zulip REST API
 *
 * <p>Powerful open source group chat 
 *
 */
@Path("")
@Api(value = "/", description = "")
public interface MessagesApi  {

    /**
     * Add an emoji reaction
     *
     * Add an [emoji reaction](/help/emoji-reactions) to a message.  &#x60;POST {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
     *
     */
    @POST
    @Path("/messages/{message_id}/reactions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Add an emoji reaction", tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    public JsonSuccess addReaction(@PathParam("message_id") Integer messageId, @QueryParam("emoji_name") @NotNull  String emojiName, @QueryParam("emoji_code")  String emojiCode, @QueryParam("reaction_type")  String reactionType);

    /**
     * Check if messages match a narrow
     *
     * Check whether a set of messages match a [narrow](/api/construct-narrow).  &#x60;GET {{ api_url }}/v1/messages/matches_narrow&#x60;  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the &#x60;match_subject&#x60; and &#x60;match_content&#x60; objects is designed to match those of &#x60;GET /messages&#x60;, so that a client can splice these fields into a &#x60;message&#x60; object received from &#x60;GET /events&#x60; and end up with an extended message object identical to how a &#x60;GET /messages&#x60; for the current narrow would have returned the message. 
     *
     */
    @GET
    @Path("/messages/matches_narrow")
    @Produces({ "application/json" })
    @ApiOperation(value = "Check if messages match a narrow", tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = Object.class) })
    public Object checkMessagesMatchNarrow(@QueryParam("msg_ids") @NotNull  List<Integer> msgIds, @QueryParam("narrow") @NotNull  List<Object> narrow);

    /**
     * Delete a message
     *
     * Permanently delete a message.  &#x60;DELETE {{ api_url }}/v1/messages/{msg_id}&#x60;  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
     *
     */
    @DELETE
    @Path("/messages/{message_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a message", tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = OneOfobjectobject.class) })
    public JsonSuccess deleteMessage(@PathParam("message_id") Integer messageId);

    /**
     * Get public temporary URL
     *
     * Get a temporary URL for access to the file that doesn&#39;t require authentication. 
     *
     */
    @GET
    @Path("/user_uploads/{realm_id_str}/{filename}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get public temporary URL", tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase getFileTemporaryUrl(@PathParam("realm_id_str") Integer realmIdStr, @PathParam("filename") String filename);

    /**
     * Get a message&#39;s edit history
     *
     * Fetch the message edit history of a previously edited message.  &#x60;GET {{ api_url }}/v1/messages/{message_id}/history&#x60;  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
     *
     */
    @GET
    @Path("/messages/{message_id}/history")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a message's edit history", tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = InvalidMessageError.class) })
    public JsonSuccessBase getMessageHistory(@PathParam("message_id") Integer messageId);

    /**
     * Get messages
     *
     * Fetch message history from a Zulip server.  &#x60;GET {{ api_url }}/v1/messages&#x60;  This &#x60;GET /api/v1/messages&#x60; endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip&#39;s powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user&#39;s message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an &#x60;anchor&#x60; message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the &#x60;num_before&#x60; and &#x60;num_after&#x60; limits.  We recommend using &#x60;num_before &lt;&#x3D; 1000&#x60; and &#x60;num_after &lt;&#x3D; 1000&#x60; to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
     *
     */
    @GET
    @Path("/messages")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get messages", tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase getMessages(@QueryParam("num_before") @NotNull @Min(0)  Integer numBefore, @QueryParam("num_after") @NotNull @Min(0)  Integer numAfter, @QueryParam("anchor")  OneOfstringinteger anchor, @QueryParam("narrow")  List<Object> narrow, @QueryParam("client_gravatar")  @DefaultValue("false") Boolean clientGravatar, @QueryParam("apply_markdown")  @DefaultValue("true") Boolean applyMarkdown, @QueryParam("use_first_unread_anchor")  @DefaultValue("false") Boolean useFirstUnreadAnchor);

    /**
     * Get a message&#39;s raw Markdown
     *
     * Get the raw content of a message.  &#x60;GET {{ api_url }}/v1/messages/{msg_id}&#x60;  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message&#39;s raw Markdown (e.g. for pre-filling a message-editing UI). 
     *
     */
    @GET
    @Path("/messages/{message_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a message's raw Markdown", tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = InvalidMessageError.class) })
    public JsonSuccessBase getRawMessage(@PathParam("message_id") Integer messageId);

    /**
     * Mark all messages as read
     *
     * Marks all of the current user&#39;s unread messages as read.  &#x60;POST {{ api_url }}/v1/mark_all_as_read&#x60; 
     *
     */
    @POST
    @Path("/mark_all_as_read")
    @Produces({ "application/json" })
    @ApiOperation(value = "Mark all messages as read", tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public JsonSuccess markAllAsRead();

    /**
     * Mark messages in a stream as read
     *
     * Mark all the unread messages in a stream as read. 
     *
     */
    @POST
    @Path("/mark_stream_as_read")
    @Produces({ "application/json" })
    @ApiOperation(value = "Mark messages in a stream as read", tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public JsonSuccess markStreamAsRead(@QueryParam("stream_id") @NotNull  Integer streamId);

    /**
     * Mark messages in a topic as read
     *
     * Mark all the unread messages in a topic as read. 
     *
     */
    @POST
    @Path("/mark_topic_as_read")
    @Produces({ "application/json" })
    @ApiOperation(value = "Mark messages in a topic as read", tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public JsonSuccess markTopicAsRead(@QueryParam("stream_id") @NotNull  Integer streamId, @QueryParam("topic_name") @NotNull  String topicName);

    /**
     * Remove an emoji reaction
     *
     * Remove an [emoji reaction](/help/emoji-reactions) from a message.  &#x60;DELETE {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
     *
     */
    @DELETE
    @Path("/messages/{message_id}/reactions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Remove an emoji reaction", tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    public JsonSuccess removeReaction(@PathParam("message_id") Integer messageId, @QueryParam("emoji_name")  String emojiName, @QueryParam("emoji_code")  String emojiCode, @QueryParam("reaction_type")  String reactionType);

    /**
     * Render message
     *
     * Render a message to HTML.  &#x60;POST {{ api_url }}/v1/messages/render&#x60; 
     *
     */
    @POST
    @Path("/messages/render")
    @Produces({ "application/json" })
    @ApiOperation(value = "Render message", tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase renderMessage(@QueryParam("content") @NotNull  String content);

    /**
     * Send a message
     *
     * Send a stream or a private message.  &#x60;POST {{ api_url }}/v1/messages&#x60; 
     *
     */
    @POST
    @Path("/messages")
    @Produces({ "application/json" })
    @ApiOperation(value = "Send a message", tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = OneOfobjectobject.class) })
    public JsonSuccessBase sendMessage(@QueryParam("type") @NotNull  String type, @QueryParam("to") @NotNull  List<Integer> to, @QueryParam("content") @NotNull  String content, @QueryParam("topic")  String topic, @QueryParam("queue_id")  String queueId, @QueryParam("local_id")  String localId);

    /**
     * Edit a message
     *
     * Edit/update the content or topic of a message.  &#x60;PATCH {{ api_url }}/v1/messages/{msg_id}&#x60;  &#x60;{msg_id}&#x60; in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to &#x60;✔ {original_topic}&#x60;.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
     *
     */
    @PATCH
    @Path("/messages/{message_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Edit a message", tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    public JsonSuccess updateMessage(@PathParam("message_id") Integer messageId, @QueryParam("topic")  String topic, @QueryParam("propagate_mode")  @DefaultValue("change_one") String propagateMode, @QueryParam("send_notification_to_old_thread")  @DefaultValue("true") Boolean sendNotificationToOldThread, @QueryParam("send_notification_to_new_thread")  @DefaultValue("true") Boolean sendNotificationToNewThread, @QueryParam("content")  String content, @QueryParam("stream_id")  Integer streamId);

    /**
     * Update personal message flags
     *
     * Add or remove personal message flags like &#x60;read&#x60; and &#x60;starred&#x60; on a collection of message IDs.  &#x60;POST {{ api_url }}/v1/messages/flags&#x60;  For updating the &#x60;read&#x60; flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
     *
     */
    @POST
    @Path("/messages/flags")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update personal message flags", tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase updateMessageFlags(@QueryParam("messages") @NotNull  List<Integer> messages, @QueryParam("op") @NotNull  String op, @QueryParam("flag") @NotNull  String flag);

    /**
     * Upload a file
     *
     * Upload a single file and get the corresponding URI.  &#x60;POST {{ api_url }}/v1/user_uploads&#x60;  Initially, only you will be able to access the link.  To share the uploaded file, you&#39;ll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
     *
     */
    @POST
    @Path("/user_uploads")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Upload a file", tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase uploadFile( @Multipart(value = "filename" , required = false) Attachment filenameDetail);
}

