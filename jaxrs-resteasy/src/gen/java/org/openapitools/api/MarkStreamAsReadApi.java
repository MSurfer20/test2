package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.MarkStreamAsReadApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.JsonSuccess;

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

@Path("/mark_stream_as_read")


@io.swagger.annotations.Api(description = "the mark_stream_as_read API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen")
public class MarkStreamAsReadApi  {

    @Inject MarkStreamAsReadApiService service;

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Mark messages in a stream as read", notes = "Mark all the unread messages in a stream as read. ", response = JsonSuccess.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response markStreamAsRead( @NotNull  @QueryParam("stream_id") Integer streamId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.markStreamAsRead(streamId,securityContext);
    }
}
