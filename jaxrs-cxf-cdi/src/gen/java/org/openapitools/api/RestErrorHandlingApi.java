package org.openapitools.api;

import org.openapitools.model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError;
import org.openapitools.model.OneOfRateLimitedError;
import org.openapitools.model.OneOfUserDeactivatedErrorRealmDeactivatedError;
import org.openapitools.api.RestErrorHandlingApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/rest-error-handling")
@RequestScoped

@Api(description = "the rest-error-handling API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-08T21:12:08.985690Z[Etc/UTC]")

public class RestErrorHandlingApi  {

  @Context SecurityContext securityContext;

  @Inject RestErrorHandlingApiService delegate;


    @POST
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Error handling", notes = "Common error to many endpoints ", response = Void.class, tags={ "real_time_events" })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Bad request. ", response = OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError.class),
        @ApiResponse(code = 401, message = "Unauthorized. ", response = OneOfUserDeactivatedErrorRealmDeactivatedError.class),
        @ApiResponse(code = 429, message = "Rate limit exceeded. ", response = OneOfRateLimitedError.class) })
    public Response restErrorHandling() {
        return delegate.restErrorHandling(securityContext);
    }
}
