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

@Path("/mark_topic_as_read")
@Api(description = "the mark_topic_as_read API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-08T21:12:21.729821Z[Etc/UTC]")public class MarkTopicAsReadApi {

    @POST
    @Produces({ "application/json" })
    @ApiOperation(value = "Mark messages in a topic as read", notes = "Mark all the unread messages in a topic as read. ", response = JsonSuccess.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class)
    })
    public Response markTopicAsRead(@QueryParam("stream_id") @NotNull   @ApiParam("The ID of the stream to access. ")  Integer streamId,@QueryParam("topic_name") @NotNull   @ApiParam("The name of the topic whose messages should be marked as read. ")  String topicName) {
        return Response.ok().entity("magic!").build();
    }
}
