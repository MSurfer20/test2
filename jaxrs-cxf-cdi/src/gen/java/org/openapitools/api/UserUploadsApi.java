package org.openapitools.api;

import java.io.File;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.api.UserUploadsApiService;

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
@Path("/user_uploads")
@RequestScoped

@Api(description = "the user_uploads API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-09T21:33:58.385931Z[Etc/UTC]")

public class UserUploadsApi  {

  @Context SecurityContext securityContext;

  @Inject UserUploadsApiService delegate;


    @GET
    @Path("/{realm_id_str}/{filename}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get public temporary URL", notes = "Get a temporary URL for access to the file that doesn't require authentication. ", response = JsonSuccessBase.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getFileTemporaryUrl(@ApiParam(value = "The realm id. ",required=true) @PathParam("realm_id_str") Integer realmIdStr, @ApiParam(value = "Path to the URL. ",required=true) @PathParam("filename") String filename) {
        return delegate.getFileTemporaryUrl(realmIdStr, filename, securityContext);
    }

    @POST
    
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Upload a file", notes = "Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message ", response = JsonSuccessBase.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response uploadFile( @Multipart(value = "filename", required = false) InputStream filenameInputStream, @Multipart(value = "filename" , required = false) Attachment filenameDetail) {
        return delegate.uploadFile(filenameInputStream, filenameDetail, securityContext);
    }
}
