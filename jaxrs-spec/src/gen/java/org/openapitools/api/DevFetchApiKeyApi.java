package org.openapitools.api;

import org.openapitools.model.ApiKeyResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/dev_fetch_api_key")
@Api(description = "the dev_fetch_api_key API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-10T11:44:56.462938Z[Etc/UTC]")public class DevFetchApiKeyApi {

    @POST
    @Produces({ "application/json" })
    @ApiOperation(value = "Fetch an API key (development only)", notes = "For easy testing of mobile apps and other clients and against Zulip development servers, we support fetching a Zulip API key for any user on the development server without authentication (so that they can implement analogues of the one-click login process available for Zulip development servers on the web).  **Note:** This endpoint is only available on Zulip development servers; for obvious security reasons it will always return an error in a Zulip production server.  `POST {{ api_url }}/v1/dev_fetch_api_key` ", response = ApiKeyResponse.class, tags={ "authentication" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = ApiKeyResponse.class)
    })
    public Response devFetchApiKey(@QueryParam("username") @NotNull   @ApiParam("The email address for the user that owns the API key. ")  String username) {
        return Response.ok().entity("magic!").build();
    }
}
