package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.RestErrorHandlingApiService;
import org.openapitools.api.factories.RestErrorHandlingApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError;
import org.openapitools.model.OneOfRateLimitedError;
import org.openapitools.model.OneOfUserDeactivatedErrorRealmDeactivatedError;

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

@Path("/rest-error-handling")


@io.swagger.annotations.Api(description = "the rest-error-handling API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-10T11:44:46.274064Z[Etc/UTC]")
public class RestErrorHandlingApi  {
   private final RestErrorHandlingApiService delegate;

   public RestErrorHandlingApi(@Context ServletConfig servletContext) {
      RestErrorHandlingApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("RestErrorHandlingApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (RestErrorHandlingApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = RestErrorHandlingApiServiceFactory.getRestErrorHandlingApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Error handling", notes = "Common error to many endpoints ", response = Void.class, tags={ "real_time_events", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request. ", response = OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized. ", response = OneOfUserDeactivatedErrorRealmDeactivatedError.class),
        @io.swagger.annotations.ApiResponse(code = 429, message = "Rate limit exceeded. ", response = OneOfRateLimitedError.class)
    })
    public Response restErrorHandling(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.restErrorHandling(securityContext);
    }
}
