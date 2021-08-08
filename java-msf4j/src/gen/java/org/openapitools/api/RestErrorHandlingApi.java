package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.RestErrorHandlingApiService;
import org.openapitools.api.factories.RestErrorHandlingApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError;
import org.openapitools.model.OneOfRateLimitedError;
import org.openapitools.model.OneOfUserDeactivatedErrorRealmDeactivatedError;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/rest-error-handling")


@io.swagger.annotations.Api(description = "the rest-error-handling API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-08T21:19:24.930319Z[Etc/UTC]")
public class RestErrorHandlingApi  {
   private final RestErrorHandlingApiService delegate = RestErrorHandlingApiServiceFactory.getRestErrorHandlingApi();

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Error handling", notes = "Common error to many endpoints ", response = Void.class, tags={ "real_time_events", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request. ", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized. ", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Rate limit exceeded. ", response = Void.class) })
    public Response restErrorHandling()
    throws NotFoundException {
        return delegate.restErrorHandling();
    }
}
