package org.openapitools.api;

import org.openapitools.model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError;
import org.openapitools.model.OneOfRateLimitedError;
import org.openapitools.model.OneOfUserDeactivatedErrorRealmDeactivatedError;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/rest-error-handling")
@Api(description = "the rest-error-handling API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-08T20:40:13.248583Z[Etc/UTC]")public class RestErrorHandlingApi {

    @POST
    @Produces({ "application/json" })
    @ApiOperation(value = "Error handling", notes = "Common error to many endpoints ", response = Void.class, tags={ "real_time_events" })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Bad request. ", response = OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError.class),
        @ApiResponse(code = 401, message = "Unauthorized. ", response = OneOfUserDeactivatedErrorRealmDeactivatedError.class),
        @ApiResponse(code = 429, message = "Rate limit exceeded. ", response = OneOfRateLimitedError.class)
    })
    public Response restErrorHandling() {
        return Response.ok().entity("magic!").build();
    }
}
