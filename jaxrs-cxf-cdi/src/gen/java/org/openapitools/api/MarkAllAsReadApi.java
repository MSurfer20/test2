package org.openapitools.api;

import org.openapitools.model.JsonSuccess;
import org.openapitools.api.MarkAllAsReadApiService;

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
@Path("/mark_all_as_read")
@RequestScoped

@Api(description = "the mark_all_as_read API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-10T11:44:42.621439Z[Etc/UTC]")

public class MarkAllAsReadApi  {

  @Context SecurityContext securityContext;

  @Inject MarkAllAsReadApiService delegate;


    @POST
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Mark all messages as read", notes = "Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` ", response = JsonSuccess.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response markAllAsRead() {
        return delegate.markAllAsRead(securityContext);
    }
}
