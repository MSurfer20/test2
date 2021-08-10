package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.GetStreamIdApiService;
import org.openapitools.api.factories.GetStreamIdApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CodedError;
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

@Path("/get_stream_id")


@io.swagger.annotations.Api(description = "the get_stream_id API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-10T11:44:46.274064Z[Etc/UTC]")
public class GetStreamIdApi  {
   private final GetStreamIdApiService delegate;

   public GetStreamIdApi(@Context ServletConfig servletContext) {
      GetStreamIdApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("GetStreamIdApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (GetStreamIdApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = GetStreamIdApiServiceFactory.getGetStreamIdApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get stream ID", notes = "Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` ", response = JsonSuccessBase.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = CodedError.class)
    })
    public Response getStreamId(@ApiParam(value = "The name of the stream to access. ", required = true) @QueryParam("stream") @NotNull  String stream,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getStreamId(stream, securityContext);
    }
}
