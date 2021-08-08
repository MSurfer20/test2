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

@Path("/fetch_api_key")
@Api(description = "the fetch_api_key API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-08T21:12:25.585041Z[Etc/UTC]")public class FetchApiKeyApi {

    @POST
    @Produces({ "application/json" })
    @ApiOperation(value = "Fetch an API key (production)", notes = "This API endpoint is used by clients such as the Zulip mobile and terminal apps to implement password-based authentication.  Given the user's Zulip login credentials, it returns a Zulip API key that the client can use to make requests requests as the user.  This endpoint is only useful for Zulip servers/organizations with EmailAuthBackend or LDAPAuthBackend enabled.  The Zulip mobile apps also support SSO/social authentication (GitHub auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead, the mobile apps reuse the web login flow passing the `mobile_flow_otp` in a webview, and the credentials are returned to the app (encrypted) via a redirect to a `zulip://` URL.  !!! warn \"\"     **Note:** If you signed up using passwordless authentication and     never had a password, you can [reset your password](/help/change-your-password).      See the [API keys](/api/api-keys) documentation for     more details on how to download API key manually.  In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html), see also [the unauthenticated variant](/api/dev-fetch-api-key). ", response = ApiKeyResponse.class, tags={ "authentication" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Valid credentials the client can use to access the Zulip API.", response = ApiKeyResponse.class)
    })
    public Response fetchApiKey(@QueryParam("username") @NotNull   @ApiParam("The username to be used for authentication (typically, the email address, but depending on configuration, it could be an LDAP username).  See the &#x60;require_email_format_usernames&#x60; parameter documented in [GET /server_settings](/api/get-server-settings) for details. ")  String username,@QueryParam("password") @NotNull   @ApiParam("The user&#39;s Zulip password (or LDAP password, if LDAP authentication is in use). ")  String password) {
        return Response.ok().entity("magic!").build();
    }
}
