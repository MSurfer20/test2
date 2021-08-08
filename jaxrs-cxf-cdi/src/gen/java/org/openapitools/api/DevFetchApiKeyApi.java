package org.openapitools.api;

import org.openapitools.model.ApiKeyResponse;
import org.openapitools.api.DevFetchApiKeyApiService;

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
@Path("/dev_fetch_api_key")
@RequestScoped

@Api(description = "the dev_fetch_api_key API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-08T21:19:56.888133Z[Etc/UTC]")

public class DevFetchApiKeyApi  {

  @Context SecurityContext securityContext;

  @Inject DevFetchApiKeyApiService delegate;


    @POST
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Fetch an API key (development only)", notes = "For easy testing of mobile apps and other clients and against Zulip development servers, we support fetching a Zulip API key for any user on the development server without authentication (so that they can implement analogues of the one-click login process available for Zulip development servers on the web).  **Note:** This endpoint is only available on Zulip development servers; for obvious security reasons it will always return an error in a Zulip production server.  `POST {{ api_url }}/v1/dev_fetch_api_key` ", response = ApiKeyResponse.class, tags={ "authentication" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = ApiKeyResponse.class) })
    public Response devFetchApiKey( @NotNull @ApiParam(value = "The email address for the user that owns the API key. ",required=true)  @QueryParam("username") String username) {
        return delegate.devFetchApiKey(username, securityContext);
    }
}
