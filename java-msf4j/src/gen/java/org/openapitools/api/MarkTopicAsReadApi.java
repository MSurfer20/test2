package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.MarkTopicAsReadApiService;
import org.openapitools.api.factories.MarkTopicAsReadApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.JsonSuccess;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/mark_topic_as_read")


@io.swagger.annotations.Api(description = "the mark_topic_as_read API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-08T21:19:24.930319Z[Etc/UTC]")
public class MarkTopicAsReadApi  {
   private final MarkTopicAsReadApiService delegate = MarkTopicAsReadApiServiceFactory.getMarkTopicAsReadApi();

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Mark messages in a topic as read", notes = "Mark all the unread messages in a topic as read. ", response = JsonSuccess.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response markTopicAsRead(@ApiParam(value = "The ID of the stream to access. ",required=true) @QueryParam("stream_id") Integer streamId
,@ApiParam(value = "The name of the topic whose messages should be marked as read. ",required=true) @QueryParam("topic_name") String topicName
)
    throws NotFoundException {
        return delegate.markTopicAsRead(streamId,topicName);
    }
}
