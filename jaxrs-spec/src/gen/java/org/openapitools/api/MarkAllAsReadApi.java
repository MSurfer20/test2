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

@Path("/mark_all_as_read")
@Api(description = "the mark_all_as_read API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-08T20:40:13.248583Z[Etc/UTC]")public class MarkAllAsReadApi {

    @POST
    @Produces({ "application/json" })
    @ApiOperation(value = "Mark all messages as read", notes = "Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` ", response = JsonSuccess.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class)
    })
    public Response markAllAsRead() {
        return Response.ok().entity("magic!").build();
    }
}
