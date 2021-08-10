package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.MarkAllAsReadApiService;
import org.openapitools.api.factories.MarkAllAsReadApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.JsonSuccess;

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

@Path("/mark_all_as_read")


@io.swagger.annotations.Api(description = "the mark_all_as_read API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-10T11:44:46.274064Z[Etc/UTC]")
public class MarkAllAsReadApi  {
   private final MarkAllAsReadApiService delegate;

   public MarkAllAsReadApi(@Context ServletConfig servletContext) {
      MarkAllAsReadApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("MarkAllAsReadApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (MarkAllAsReadApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = MarkAllAsReadApiServiceFactory.getMarkAllAsReadApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Mark all messages as read", notes = "Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` ", response = JsonSuccess.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class)
    })
    public Response markAllAsRead(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.markAllAsRead(securityContext);
    }
}
