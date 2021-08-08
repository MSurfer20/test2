package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.StreamsApiService;

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

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/streams")


@io.swagger.annotations.Api(description = "the streams API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-08T20:42:27.763537Z[Etc/UTC]")
public class StreamsApi  {

    @Inject StreamsApiService service;

    @DELETE
    @Path("/{stream_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Archive a stream", notes = "[Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` ", response = JsonSuccess.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public Response archiveStream( @PathParam("stream_id") Integer streamId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.archiveStream(streamId,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all streams", notes = "Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` ", response = JsonSuccessBase.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    public Response getStreams(  @DefaultValue("true") @QueryParam("include_public") Boolean includePublic,  @DefaultValue("false") @QueryParam("include_web_public") Boolean includeWebPublic,  @DefaultValue("true") @QueryParam("include_subscribed") Boolean includeSubscribed,  @DefaultValue("false") @QueryParam("include_all_active") Boolean includeAllActive,  @DefaultValue("false") @QueryParam("include_default") Boolean includeDefault,  @DefaultValue("false") @QueryParam("include_owner_subscribed") Boolean includeOwnerSubscribed,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getStreams(includePublic,includeWebPublic,includeSubscribed,includeAllActive,includeDefault,includeOwnerSubscribed,securityContext);
    }
    @PATCH
    @Path("/{stream_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update a stream", notes = "Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` ", response = JsonSuccess.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonError.class) })
    public Response updateStream( @PathParam("stream_id") Integer streamId,  @QueryParam("description") String description,  @QueryParam("new_name") String newName,  @QueryParam("is_private") Boolean isPrivate,  @QueryParam("is_announcement_only") Boolean isAnnouncementOnly,  @DefaultValue("1") @QueryParam("stream_post_policy") Integer streamPostPolicy,  @QueryParam("history_public_to_subscribers") Boolean historyPublicToSubscribers,  @QueryParam("message_retention_days") OneOfstringinteger messageRetentionDays,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateStream(streamId,description,newName,isPrivate,isAnnouncementOnly,streamPostPolicy,historyPublicToSubscribers,messageRetentionDays,securityContext);
    }
}
