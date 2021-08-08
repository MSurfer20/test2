package org.openapitools.api;

import org.openapitools.model.JsonSuccessBase;
import org.openapitools.api.AttachmentsApiService;

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
@Path("/attachments")
@RequestScoped

@Api(description = "the attachments API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-08T21:19:56.888133Z[Etc/UTC]")

public class AttachmentsApi  {

  @Context SecurityContext securityContext;

  @Inject AttachmentsApiService delegate;


    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get attachments", notes = "Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` ", response = JsonSuccessBase.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getAttachments() {
        return delegate.getAttachments(securityContext);
    }
}
