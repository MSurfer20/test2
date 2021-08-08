package org.openapitools.api;

import org.openapitools.model.ApiKeyResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Zulip REST API
 *
 * <p>Powerful open source group chat 
 *
 */
@Path("")
@Api(value = "/", description = "")
public interface AuthenticationApi  {

    /**
     * Fetch an API key (development only)
     *
     * For easy testing of mobile apps and other clients and against Zulip development servers, we support fetching a Zulip API key for any user on the development server without authentication (so that they can implement analogues of the one-click login process available for Zulip development servers on the web).  **Note:** This endpoint is only available on Zulip development servers; for obvious security reasons it will always return an error in a Zulip production server.  &#x60;POST {{ api_url }}/v1/dev_fetch_api_key&#x60; 
     *
     */
    @POST
    @Path("/dev_fetch_api_key")
    @Produces({ "application/json" })
    @ApiOperation(value = "Fetch an API key (development only)", tags={ "authentication" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = ApiKeyResponse.class) })
    public ApiKeyResponse devFetchApiKey(@QueryParam("username") @NotNull  String username);

    /**
     * Fetch an API key (production)
     *
     * This API endpoint is used by clients such as the Zulip mobile and terminal apps to implement password-based authentication.  Given the user&#39;s Zulip login credentials, it returns a Zulip API key that the client can use to make requests requests as the user.  This endpoint is only useful for Zulip servers/organizations with EmailAuthBackend or LDAPAuthBackend enabled.  The Zulip mobile apps also support SSO/social authentication (GitHub auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead, the mobile apps reuse the web login flow passing the &#x60;mobile_flow_otp&#x60; in a webview, and the credentials are returned to the app (encrypted) via a redirect to a &#x60;zulip://&#x60; URL.  !!! warn \&quot;\&quot;     **Note:** If you signed up using passwordless authentication and     never had a password, you can [reset your password](/help/change-your-password).      See the [API keys](/api/api-keys) documentation for     more details on how to download API key manually.  In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html), see also [the unauthenticated variant](/api/dev-fetch-api-key). 
     *
     */
    @POST
    @Path("/fetch_api_key")
    @Produces({ "application/json" })
    @ApiOperation(value = "Fetch an API key (production)", tags={ "authentication" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Valid credentials the client can use to access the Zulip API.", response = ApiKeyResponse.class) })
    public ApiKeyResponse fetchApiKey(@QueryParam("username") @NotNull  String username, @QueryParam("password") @NotNull  String password);
}

