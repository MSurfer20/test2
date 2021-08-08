package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.JsonSuccessBase;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

@Path("/user_uploads")


@io.swagger.annotations.Api(description = "the user_uploads API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2021-08-08T21:12:21.563950Z[Etc/UTC]")
public interface UserUploadsApi  {
   
    @GET
    @Path("/{realm_id_str}/{filename}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get public temporary URL", notes = "Get a temporary URL for access to the file that doesn't require authentication. ", response = JsonSuccessBase.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getFileTemporaryUrl( @PathParam("realm_id_str") Integer realmIdStr, @PathParam("filename") String filename,@Context SecurityContext securityContext);
    @POST
    
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Upload a file", notes = "Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message ", response = JsonSuccessBase.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response uploadFile(MultipartFormDataInput input,@Context SecurityContext securityContext);
}
