package org.openapitools.api;

import org.openapitools.model.JsonSuccess;
import org.openapitools.api.MarkTopicAsReadApiService;

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
@Path("/mark_topic_as_read")
@RequestScoped

@Api(description = "the mark_topic_as_read API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-08T21:12:08.985690Z[Etc/UTC]")

public class MarkTopicAsReadApi  {

  @Context SecurityContext securityContext;

  @Inject MarkTopicAsReadApiService delegate;


    @POST
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Mark messages in a topic as read", notes = "Mark all the unread messages in a topic as read. ", response = JsonSuccess.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response markTopicAsRead( @NotNull @ApiParam(value = "The ID of the stream to access. ",required=true)  @QueryParam("stream_id") Integer streamId,  @NotNull @ApiParam(value = "The name of the topic whose messages should be marked as read. ",required=true)  @QueryParam("topic_name") String topicName) {
        return delegate.markTopicAsRead(streamId, topicName, securityContext);
    }
}
