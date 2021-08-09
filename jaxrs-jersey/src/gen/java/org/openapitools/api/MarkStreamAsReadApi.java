package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.MarkStreamAsReadApiService;
import org.openapitools.api.factories.MarkStreamAsReadApiServiceFactory;

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

@Path("/mark_stream_as_read")


@io.swagger.annotations.Api(description = "the mark_stream_as_read API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-09T21:34:02.517112Z[Etc/UTC]")
public class MarkStreamAsReadApi  {
   private final MarkStreamAsReadApiService delegate;

   public MarkStreamAsReadApi(@Context ServletConfig servletContext) {
      MarkStreamAsReadApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("MarkStreamAsReadApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (MarkStreamAsReadApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = MarkStreamAsReadApiServiceFactory.getMarkStreamAsReadApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Mark messages in a stream as read", notes = "Mark all the unread messages in a stream as read. ", response = JsonSuccess.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class)
    })
    public Response markStreamAsRead(@ApiParam(value = "The ID of the stream to access. ", required = true) @QueryParam("stream_id") @NotNull  Integer streamId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.markStreamAsRead(streamId, securityContext);
    }
}
