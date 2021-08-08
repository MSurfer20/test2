package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.DevFetchApiKeyApiService;
import org.openapitools.api.factories.DevFetchApiKeyApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ApiKeyResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/dev_fetch_api_key")


@io.swagger.annotations.Api(description = "the dev_fetch_api_key API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-08T20:39:29.446170Z[Etc/UTC]")
public class DevFetchApiKeyApi  {
   private final DevFetchApiKeyApiService delegate = DevFetchApiKeyApiServiceFactory.getDevFetchApiKeyApi();

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Fetch an API key (development only)", notes = "For easy testing of mobile apps and other clients and against Zulip development servers, we support fetching a Zulip API key for any user on the development server without authentication (so that they can implement analogues of the one-click login process available for Zulip development servers on the web).  **Note:** This endpoint is only available on Zulip development servers; for obvious security reasons it will always return an error in a Zulip production server.  `POST {{ api_url }}/v1/dev_fetch_api_key` ", response = ApiKeyResponse.class, tags={ "authentication", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = ApiKeyResponse.class) })
    public Response devFetchApiKey(@ApiParam(value = "The email address for the user that owns the API key. ",required=true) @QueryParam("username") String username
)
    throws NotFoundException {
        return delegate.devFetchApiKey(username);
    }
}
