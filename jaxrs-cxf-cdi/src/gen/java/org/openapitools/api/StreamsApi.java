package org.openapitools.api;

import org.openapitools.model.CodedError;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.OneOfstringinteger;
import org.openapitools.api.StreamsApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/streams")
@RequestScoped

@Api(description = "the streams API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-08T21:12:04.371582Z[Etc/UTC]")

public class StreamsApi  {

  @Context SecurityContext securityContext;

  @Inject StreamsApiService delegate;


    @DELETE
    @Path("/{stream_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Archive a stream", notes = "[Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` ", response = JsonSuccess.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public Response archiveStream(@ApiParam(value = "The ID of the stream to access. ",required=true) @PathParam("stream_id") Integer streamId) {
        return delegate.archiveStream(streamId, securityContext);
    }

    @POST
    @Path("/{stream_id}/delete_topic")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a topic", notes = "Delete all messages in a topic.  `POST {{ api_url }}/v1/streams/{stream_id}/delete_topic`  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. ", response = JsonSuccess.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Error.", response = JsonError.class) })
    public Response deleteTopic(@ApiParam(value = "The ID of the stream to access. ",required=true) @PathParam("stream_id") Integer streamId,  @NotNull @ApiParam(value = "The name of the topic to delete. ",required=true)  @QueryParam("topic_name") String topicName) {
        return delegate.deleteTopic(streamId, topicName, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all streams", notes = "Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` ", response = JsonSuccessBase.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    public Response getStreams(@ApiParam(value = "Include all public streams. ", defaultValue="true") @DefaultValue("true")  @QueryParam("include_public") Boolean includePublic, @ApiParam(value = "Include all web public streams. ", defaultValue="false") @DefaultValue("false")  @QueryParam("include_web_public") Boolean includeWebPublic, @ApiParam(value = "Include all streams that the user is subscribed to. ", defaultValue="true") @DefaultValue("true")  @QueryParam("include_subscribed") Boolean includeSubscribed, @ApiParam(value = "Include all active streams. The user must have administrative privileges to use this parameter. ", defaultValue="false") @DefaultValue("false")  @QueryParam("include_all_active") Boolean includeAllActive, @ApiParam(value = "Include all default streams for the user's realm. ", defaultValue="false") @DefaultValue("false")  @QueryParam("include_default") Boolean includeDefault, @ApiParam(value = "If the user is a bot, include all streams that the bot's owner is subscribed to. ", defaultValue="false") @DefaultValue("false")  @QueryParam("include_owner_subscribed") Boolean includeOwnerSubscribed) {
        return delegate.getStreams(includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed, securityContext);
    }

    @GET
    @Path("/{stream_id}/members")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get the subscribers of a stream", notes = "Get all users subscribed to a stream.  `Get {{ api_url }}/v1/streams/{stream_id}/members` ", response = JsonSuccessBase.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public Response getSubscribers(@ApiParam(value = "The ID of the stream to access. ",required=true) @PathParam("stream_id") Integer streamId) {
        return delegate.getSubscribers(streamId, securityContext);
    }

    @PATCH
    @Path("/{stream_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a stream", notes = "Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` ", response = JsonSuccess.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public Response updateStream(@ApiParam(value = "The ID of the stream to access. ",required=true) @PathParam("stream_id") Integer streamId, @ApiParam(value = "The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). ")  @QueryParam("description") String description, @ApiParam(value = "The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). ")  @QueryParam("new_name") String newName, @ApiParam(value = "Change whether the stream is a private stream. ")  @QueryParam("is_private") Boolean isPrivate, @ApiParam(value = "Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead. ")  @QueryParam("is_announcement_only") Boolean isAnnouncementOnly, @ApiParam(value = "Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. ", defaultValue="1") @DefaultValue("1")  @QueryParam("stream_post_policy") Integer streamPostPolicy, @ApiParam(value = "Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. ")  @QueryParam("history_public_to_subscribers") Boolean historyPublicToSubscribers, @ApiParam(value = "Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). ")  @QueryParam("message_retention_days") OneOfstringinteger messageRetentionDays) {
        return delegate.updateStream(streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays, securityContext);
    }
}
