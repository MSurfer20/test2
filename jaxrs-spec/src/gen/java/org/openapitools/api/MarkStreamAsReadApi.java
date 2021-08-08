package org.openapitools.api;

import org.openapitools.model.JsonSuccess;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/mark_stream_as_read")
@Api(description = "the mark_stream_as_read API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-08T21:12:21.729821Z[Etc/UTC]")public class MarkStreamAsReadApi {

    @POST
    @Produces({ "application/json" })
    @ApiOperation(value = "Mark messages in a stream as read", notes = "Mark all the unread messages in a stream as read. ", response = JsonSuccess.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class)
    })
    public Response markStreamAsRead(@QueryParam("stream_id") @NotNull   @ApiParam("The ID of the stream to access. ")  Integer streamId) {
        return Response.ok().entity("magic!").build();
    }
}
