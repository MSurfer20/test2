package org.openapitools.api;

import org.openapitools.model.CodedError;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.OneOfstringinteger;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/streams")
@Api(description = "the streams API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-09T21:34:15.269802Z[Etc/UTC]")public class StreamsApi {

    @DELETE
    @Path("/{stream_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Archive a stream", notes = "[Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` ", response = JsonSuccess.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class)
    })
    public Response archiveStream(@PathParam("stream_id") @ApiParam("The ID of the stream to access. ") Integer streamId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{stream_id}/delete_topic")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a topic", notes = "Delete all messages in a topic.  `POST {{ api_url }}/v1/streams/{stream_id}/delete_topic`  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. ", response = JsonSuccess.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Error.", response = JsonError.class)
    })
    public Response deleteTopic(@PathParam("stream_id") @ApiParam("The ID of the stream to access. ") Integer streamId,@QueryParam("topic_name") @NotNull   @ApiParam("The name of the topic to delete. ")  String topicName) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get all streams", notes = "Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` ", response = JsonSuccessBase.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class)
    })
    public Response getStreams(@QueryParam("include_public")  @DefaultValue("true")  @ApiParam("Include all public streams. ")  Boolean includePublic,@QueryParam("include_web_public")  @DefaultValue("false")  @ApiParam("Include all web public streams. ")  Boolean includeWebPublic,@QueryParam("include_subscribed")  @DefaultValue("true")  @ApiParam("Include all streams that the user is subscribed to. ")  Boolean includeSubscribed,@QueryParam("include_all_active")  @DefaultValue("false")  @ApiParam("Include all active streams. The user must have administrative privileges to use this parameter. ")  Boolean includeAllActive,@QueryParam("include_default")  @DefaultValue("false")  @ApiParam("Include all default streams for the user&#39;s realm. ")  Boolean includeDefault,@QueryParam("include_owner_subscribed")  @DefaultValue("false")  @ApiParam("If the user is a bot, include all streams that the bot&#39;s owner is subscribed to. ")  Boolean includeOwnerSubscribed) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{stream_id}/members")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get the subscribers of a stream", notes = "Get all users subscribed to a stream.  `Get {{ api_url }}/v1/streams/{stream_id}/members` ", response = JsonSuccessBase.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class)
    })
    public Response getSubscribers(@PathParam("stream_id") @ApiParam("The ID of the stream to access. ") Integer streamId) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{stream_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a stream", notes = "Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` ", response = JsonSuccess.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class)
    })
    public Response updateStream(@PathParam("stream_id") @ApiParam("The ID of the stream to access. ") Integer streamId,@QueryParam("description")   @ApiParam("The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). ")  String description,@QueryParam("new_name")   @ApiParam("The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). ")  String newName,@QueryParam("is_private")   @ApiParam("Change whether the stream is a private stream. ")  Boolean isPrivate,@QueryParam("is_announcement_only")   @ApiParam("Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead. ")  Boolean isAnnouncementOnly,@QueryParam("stream_post_policy")  @DefaultValue("1")  @ApiParam("Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean. ")  Integer streamPostPolicy,@QueryParam("history_public_to_subscribers")   @ApiParam("Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. ")  Boolean historyPublicToSubscribers,@QueryParam("message_retention_days")   @ApiParam("Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). ")  OneOfstringinteger messageRetentionDays) {
        return Response.ok().entity("magic!").build();
    }
}
