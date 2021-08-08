package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AttachmentsApiService;
import org.openapitools.api.factories.AttachmentsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

@Path("/attachments")


@io.swagger.annotations.Api(description = "the attachments API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:20:01.120158Z[Etc/UTC]")
public class AttachmentsApi  {
   private final AttachmentsApiService delegate;

   public AttachmentsApi(@Context ServletConfig servletContext) {
      AttachmentsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AttachmentsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AttachmentsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = AttachmentsApiServiceFactory.getAttachmentsApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get attachments", notes = "Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response getAttachments(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAttachments(securityContext);
    }
}
