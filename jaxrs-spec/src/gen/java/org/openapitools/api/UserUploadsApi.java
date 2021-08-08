package org.openapitools.api;

import java.io.File;
import org.openapitools.model.JsonSuccessBase;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/user_uploads")
@Api(description = "the user_uploads API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-08T21:12:21.729821Z[Etc/UTC]")public class UserUploadsApi {

    @GET
    @Path("/{realm_id_str}/{filename}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get public temporary URL", notes = "Get a temporary URL for access to the file that doesn't require authentication. ", response = JsonSuccessBase.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response getFileTemporaryUrl(@PathParam("realm_id_str") @ApiParam("The realm id. ") Integer realmIdStr,@PathParam("filename") @ApiParam("Path to the URL. ") String filename) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Upload a file", notes = "Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message ", response = JsonSuccessBase.class, tags={ "messages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response uploadFile( @FormParam(value = "filename") InputStream filenameInputStream) {
        return Response.ok().entity("magic!").build();
    }
}
