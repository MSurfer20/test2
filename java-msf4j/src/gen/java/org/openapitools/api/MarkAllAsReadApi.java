package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.MarkAllAsReadApiService;
import org.openapitools.api.factories.MarkAllAsReadApiServiceFactory;

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

@Path("/mark_all_as_read")


@io.swagger.annotations.Api(description = "the mark_all_as_read API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen")
public class MarkAllAsReadApi  {
   private final MarkAllAsReadApiService delegate = MarkAllAsReadApiServiceFactory.getMarkAllAsReadApi();

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Mark all messages as read", notes = "Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` ", response = JsonSuccess.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response markAllAsRead()
    throws NotFoundException {
        return delegate.markAllAsRead();
    }
}
