package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.MarkTopicAsReadApiService;
import org.openapitools.api.factories.MarkTopicAsReadApiServiceFactory;

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

@Path("/mark_topic_as_read")


@io.swagger.annotations.Api(description = "the mark_topic_as_read API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-09T21:34:02.517112Z[Etc/UTC]")
public class MarkTopicAsReadApi  {
   private final MarkTopicAsReadApiService delegate;

   public MarkTopicAsReadApi(@Context ServletConfig servletContext) {
      MarkTopicAsReadApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("MarkTopicAsReadApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (MarkTopicAsReadApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = MarkTopicAsReadApiServiceFactory.getMarkTopicAsReadApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Mark messages in a topic as read", notes = "Mark all the unread messages in a topic as read. ", response = JsonSuccess.class, tags={ "messages", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class)
    })
    public Response markTopicAsRead(@ApiParam(value = "The ID of the stream to access. ", required = true) @QueryParam("stream_id") @NotNull  Integer streamId,@ApiParam(value = "The name of the topic whose messages should be marked as read. ", required = true) @QueryParam("topic_name") @NotNull  String topicName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.markTopicAsRead(streamId, topicName, securityContext);
    }
}
