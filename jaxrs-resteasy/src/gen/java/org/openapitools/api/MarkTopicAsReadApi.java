package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.MarkTopicAsReadApiService;

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

@Path("/mark_topic_as_read")


@io.swagger.annotations.Api(description = "the mark_topic_as_read API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-08T21:12:17.400215Z[Etc/UTC]")
public class MarkTopicAsReadApi  {

    @Inject MarkTopicAsReadApiService service;

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Mark messages in a topic as read", notes = "Mark all the unread messages in a topic as read. ", response = JsonSuccess.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response markTopicAsRead( @NotNull  @QueryParam("stream_id") Integer streamId, @NotNull  @QueryParam("topic_name") String topicName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.markTopicAsRead(streamId,topicName,securityContext);
    }
}
