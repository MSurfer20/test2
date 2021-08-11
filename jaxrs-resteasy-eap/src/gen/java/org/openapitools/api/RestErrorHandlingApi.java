package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError;
import org.openapitools.model.OneOfRateLimitedError;
import org.openapitools.model.OneOfUserDeactivatedErrorRealmDeactivatedError;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/rest-error-handling")


@io.swagger.annotations.Api(description = "the rest-error-handling API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen")
public interface RestErrorHandlingApi  {
   
    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Error handling", notes = "Common error to many endpoints ", response = Void.class, tags={ "real_time_events", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request. ", response = OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized. ", response = OneOfUserDeactivatedErrorRealmDeactivatedError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Rate limit exceeded. ", response = OneOfRateLimitedError.class) })
    public Response restErrorHandling(@Context SecurityContext securityContext);
}
