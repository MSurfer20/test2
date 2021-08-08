package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.StreamsApiService;
import org.openapitools.api.factories.StreamsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CodedError;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
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

@Path("/streams")


@io.swagger.annotations.Api(description = "the streams API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T20:40:02.257444Z[Etc/UTC]")
public class StreamsApi  {
   private final StreamsApiService delegate;

   public StreamsApi(@Context ServletConfig servletContext) {
      StreamsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("StreamsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (StreamsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = StreamsApiServiceFactory.getStreamsApi();
      }

      this.delegate = delegate;
   }

    @DELETE
    @Path("/{stream_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Archive a stream", notes = "[Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` ", response = JsonSuccess.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonError.class)
    })
    public Response archiveStream(@ApiParam(value = "The ID of the stream to access. ", required = true) @PathParam("stream_id") @NotNull  Integer streamId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.archiveStream(streamId, securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all streams", notes = "Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` ", response = JsonSuccessBase.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = CodedError.class)
    })
    public Response getStreams(@ApiParam(value = "Include all public streams. ", defaultValue = "true") @DefaultValue("true") @QueryParam("include_public")  Boolean includePublic,@ApiParam(value = "Include all web public streams. ", defaultValue = "false") @DefaultValue("false") @QueryParam("include_web_public")  Boolean includeWebPublic,@ApiParam(value = "Include all streams that the user is subscribed to. ", defaultValue = "true") @DefaultValue("true") @QueryParam("include_subscribed")  Boolean includeSubscribed,@ApiParam(value = "Include all active streams. The user must have administrative privileges to use this parameter. ", defaultValue = "false") @DefaultValue("false") @QueryParam("include_all_active")  Boolean includeAllActive,@ApiParam(value = "Include all default streams for the user's realm. ", defaultValue = "false") @DefaultValue("false") @QueryParam("include_default")  Boolean includeDefault,@ApiParam(value = "If the user is a bot, include all streams that the bot's owner is subscribed to. ", defaultValue = "false") @DefaultValue("false") @QueryParam("include_owner_subscribed")  Boolean includeOwnerSubscribed,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getStreams(includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed, securityContext);
    }
    @PATCH
    @Path("/{stream_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update a stream", notes = "Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` ", response = JsonSuccess.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonError.class)
    })
    public Response updateStream(@ApiParam(value = "The ID of the stream to access. ", required = true) @PathParam("stream_id") @NotNull  Integer streamId,@ApiParam(value = "The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). ") @QueryParam("description")  String description,@ApiParam(value = "The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). ") @QueryParam("new_name")  String newName,@ApiParam(value = "Change whether the stream is a private stream. ") @QueryParam("is_private")  Boolean isPrivate,@ApiParam(value = "Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead. ") @QueryParam("is_announcement_only")  Boolean isAnnouncementOnly,@ApiParam(value = "Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. ", defaultValue = "1") @DefaultValue("1") @QueryParam("stream_post_policy")  Integer streamPostPolicy,@ApiParam(value = "Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. ") @QueryParam("history_public_to_subscribers")  Boolean historyPublicToSubscribers,@ApiParam(value = "Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). ") @QueryParam("message_retention_days") @Valid  OneOfstringinteger messageRetentionDays,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateStream(streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays, securityContext);
    }
}
