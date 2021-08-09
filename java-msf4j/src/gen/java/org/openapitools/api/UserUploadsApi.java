package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.UserUploadsApiService;
import org.openapitools.api.factories.UserUploadsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.JsonSuccessBase;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/user_uploads")


@io.swagger.annotations.Api(description = "the user_uploads API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-09T21:33:26.116785Z[Etc/UTC]")
public class UserUploadsApi  {
   private final UserUploadsApiService delegate = UserUploadsApiServiceFactory.getUserUploadsApi();

    @GET
    @Path("/{realm_id_str}/{filename}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get public temporary URL", notes = "Get a temporary URL for access to the file that doesn't require authentication. ", response = JsonSuccessBase.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getFileTemporaryUrl(@ApiParam(value = "The realm id. ",required=true) @PathParam("realm_id_str") Integer realmIdStr
,@ApiParam(value = "Path to the URL. ",required=true) @PathParam("filename") String filename
)
    throws NotFoundException {
        return delegate.getFileTemporaryUrl(realmIdStr,filename);
    }
    @POST
    
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Upload a file", notes = "Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message ", response = JsonSuccessBase.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response uploadFile(
            @FormDataParam("filename") InputStream filenameInputStream,
            @FormDataParam("filename") FileInfo filenameDetail
)
    throws NotFoundException {
        return delegate.uploadFile(filenameInputStream, filenameDetail);
    }
}
