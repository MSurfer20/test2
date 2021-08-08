package org.openapitools.api;

import org.openapitools.model.CodedError;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.NonExistingStreamError;
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

/**
 * Zulip REST API
 *
 * <p>Powerful open source group chat 
 *
 */
@Path("")
@Api(value = "/", description = "")
public interface StreamsApi  {

    /**
     * Archive a stream
     *
     * [Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; 
     *
     */
    @DELETE
    @Path("/streams/{stream_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Archive a stream", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public JsonSuccess archiveStream(@PathParam("stream_id") Integer streamId);

    /**
     * Create BigBlueButton video call
     *
     * Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
     *
     */
    @GET
    @Path("/calls/bigbluebutton/create")
    @Produces({ "application/json" })
    @ApiOperation(value = "Create BigBlueButton video call", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase createBigBlueButtonVideoCall();

    /**
     * Delete a topic
     *
     * Delete all messages in a topic.  &#x60;POST {{ api_url }}/v1/streams/{stream_id}/delete_topic&#x60;  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 
     *
     */
    @POST
    @Path("/streams/{stream_id}/delete_topic")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a topic", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Error.", response = JsonError.class) })
    public JsonSuccess deleteTopic(@PathParam("stream_id") Integer streamId, @QueryParam("topic_name") String topicName);

    /**
     * Get stream ID
     *
     * Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; 
     *
     */
    @GET
    @Path("/get_stream_id")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get stream ID", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    public JsonSuccessBase getStreamId(@QueryParam("stream") String stream);

    /**
     * Get topics in a stream
     *
     * Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; 
     *
     */
    @GET
    @Path("/users/me/{stream_id}/topics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get topics in a stream", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public JsonSuccessBase getStreamTopics(@PathParam("stream_id") Integer streamId);

    /**
     * Get all streams
     *
     * Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; 
     *
     */
    @GET
    @Path("/streams")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all streams", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    public JsonSuccessBase getStreams(@QueryParam("include_public") @DefaultValue("true")Boolean includePublic, @QueryParam("include_web_public") @DefaultValue("false")Boolean includeWebPublic, @QueryParam("include_subscribed") @DefaultValue("true")Boolean includeSubscribed, @QueryParam("include_all_active") @DefaultValue("false")Boolean includeAllActive, @QueryParam("include_default") @DefaultValue("false")Boolean includeDefault, @QueryParam("include_owner_subscribed") @DefaultValue("false")Boolean includeOwnerSubscribed);

    /**
     * Get the subscribers of a stream
     *
     * Get all users subscribed to a stream.  &#x60;Get {{ api_url }}/v1/streams/{stream_id}/members&#x60; 
     *
     */
    @GET
    @Path("/streams/{stream_id}/members")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get the subscribers of a stream", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public JsonSuccessBase getSubscribers(@PathParam("stream_id") Integer streamId);

    /**
     * Get subscription status
     *
     * Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). 
     *
     */
    @GET
    @Path("/users/{user_id}/subscriptions/{stream_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get subscription status", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = JsonSuccessBase.class) })
    public JsonSuccessBase getSubscriptionStatus(@PathParam("user_id") Integer userId, @PathParam("stream_id") Integer streamId);

    /**
     * Get subscribed streams
     *
     * Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; 
     *
     */
    @GET
    @Path("/users/me/subscriptions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get subscribed streams", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase getSubscriptions(@QueryParam("include_subscribers") @DefaultValue("false")Boolean includeSubscribers);

    /**
     * Topic muting
     *
     * This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; 
     *
     */
    @PATCH
    @Path("/users/me/subscriptions/muted_topics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Topic muting", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = OneOfobjectobject.class) })
    public JsonSuccess muteTopic(@QueryParam("topic") String topic, @QueryParam("op") String op, @QueryParam("stream") String stream, @QueryParam("stream_id") Integer streamId);

    /**
     * Subscribe to a stream
     *
     * Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below. 
     *
     */
    @POST
    @Path("/users/me/subscriptions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Subscribe to a stream", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = OneOfobjectobject.class),
        @ApiResponse(code = 400, message = "Success.", response = OneOfobjectobject.class) })
    public OneOfobjectobject subscribe(@QueryParam("subscriptions") List<Object> subscriptions, @QueryParam("principals") List<OneOfstringinteger> principals, @QueryParam("authorization_errors_fatal") @DefaultValue("true")Boolean authorizationErrorsFatal, @QueryParam("announce") @DefaultValue("false")Boolean announce, @QueryParam("invite_only") @DefaultValue("false")Boolean inviteOnly, @QueryParam("history_public_to_subscribers") Boolean historyPublicToSubscribers, @QueryParam("stream_post_policy") @DefaultValue("1")Integer streamPostPolicy, @QueryParam("message_retention_days") OneOfstringinteger messageRetentionDays);

    /**
     * Unsubscribe from a stream
     *
     * Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60; 
     *
     */
    @DELETE
    @Path("/users/me/subscriptions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Unsubscribe from a stream", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = NonExistingStreamError.class) })
    public JsonSuccessBase unsubscribe(@QueryParam("subscriptions") List<String> subscriptions, @QueryParam("principals") List<OneOfstringinteger> principals);

    /**
     * Update a stream
     *
     * Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; 
     *
     */
    @PATCH
    @Path("/streams/{stream_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a stream", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public JsonSuccess updateStream(@PathParam("stream_id") Integer streamId, @QueryParam("description") String description, @QueryParam("new_name") String newName, @QueryParam("is_private") Boolean isPrivate, @QueryParam("is_announcement_only") Boolean isAnnouncementOnly, @QueryParam("stream_post_policy") @DefaultValue("1")Integer streamPostPolicy, @QueryParam("history_public_to_subscribers") Boolean historyPublicToSubscribers, @QueryParam("message_retention_days") OneOfstringinteger messageRetentionDays);

    /**
     * Update subscription settings
     *
     * This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; 
     *
     */
    @POST
    @Path("/users/me/subscriptions/properties")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update subscription settings", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase updateSubscriptionSettings(@QueryParam("subscription_data") List<Object> subscriptionData);

    /**
     * Update subscriptions
     *
     * Update which streams you are are subscribed to. 
     *
     */
    @PATCH
    @Path("/users/me/subscriptions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update subscriptions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase updateSubscriptions(@QueryParam("delete") List<String> delete, @QueryParam("add") List<Object> add);
}

