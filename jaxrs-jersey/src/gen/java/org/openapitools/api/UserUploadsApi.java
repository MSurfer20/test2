package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.UserUploadsApiService;
import org.openapitools.api.factories.UserUploadsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.JsonSuccessBase;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/user_uploads")


@io.swagger.annotations.Api(description = "the user_uploads API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-10T11:44:46.274064Z[Etc/UTC]")
public class UserUploadsApi  {
   private final UserUploadsApiService delegate;

   public UserUploadsApi(@Context ServletConfig servletContext) {
      UserUploadsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("UserUploadsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (UserUploadsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = UserUploadsApiServiceFactory.getUserUploadsApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/{realm_id_str}/{filename}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get public temporary URL", notes = "Get a temporary URL for access to the file that doesn't require authentication. ", response = JsonSuccessBase.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response getFileTemporaryUrl(@ApiParam(value = "The realm id. ", required = true) @PathParam("realm_id_str") @NotNull  Integer realmIdStr,@ApiParam(value = "Path to the URL. ", required = true) @PathParam("filename") @NotNull  String filename,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getFileTemporaryUrl(realmIdStr, filename, securityContext);
    }
    @POST
    
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Upload a file", notes = "Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message ", response = JsonSuccessBase.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response uploadFile(
 @FormDataParam("filename") FormDataBodyPart filenameBodypart ,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.uploadFile(filenameBodypart, securityContext);
    }
}
