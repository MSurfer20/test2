package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.MarkStreamAsReadApiService;
import org.openapitools.api.factories.MarkStreamAsReadApiServiceFactory;

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

@Path("/mark_stream_as_read")


@io.swagger.annotations.Api(description = "the mark_stream_as_read API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-08T21:11:29.842761Z[Etc/UTC]")
public class MarkStreamAsReadApi  {
   private final MarkStreamAsReadApiService delegate = MarkStreamAsReadApiServiceFactory.getMarkStreamAsReadApi();

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Mark messages in a stream as read", notes = "Mark all the unread messages in a stream as read. ", response = JsonSuccess.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response markStreamAsRead(@ApiParam(value = "The ID of the stream to access. ",required=true) @QueryParam("stream_id") Integer streamId
)
    throws NotFoundException {
        return delegate.markStreamAsRead(streamId);
    }
}
