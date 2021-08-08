package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.FetchApiKeyApiService;
import org.openapitools.api.factories.FetchApiKeyApiServiceFactory;

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

@Path("/fetch_api_key")


@io.swagger.annotations.Api(description = "the fetch_api_key API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-08T21:19:24.930319Z[Etc/UTC]")
public class FetchApiKeyApi  {
   private final FetchApiKeyApiService delegate = FetchApiKeyApiServiceFactory.getFetchApiKeyApi();

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Fetch an API key (production)", notes = "This API endpoint is used by clients such as the Zulip mobile and terminal apps to implement password-based authentication.  Given the user's Zulip login credentials, it returns a Zulip API key that the client can use to make requests requests as the user.  This endpoint is only useful for Zulip servers/organizations with EmailAuthBackend or LDAPAuthBackend enabled.  The Zulip mobile apps also support SSO/social authentication (GitHub auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead, the mobile apps reuse the web login flow passing the `mobile_flow_otp` in a webview, and the credentials are returned to the app (encrypted) via a redirect to a `zulip://` URL.  !!! warn \"\"     **Note:** If you signed up using passwordless authentication and     never had a password, you can [reset your password](/help/change-your-password).      See the [API keys](/api/api-keys) documentation for     more details on how to download API key manually.  In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html), see also [the unauthenticated variant](/api/dev-fetch-api-key). ", response = ApiKeyResponse.class, tags={ "authentication", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Valid credentials the client can use to access the Zulip API.", response = ApiKeyResponse.class) })
    public Response fetchApiKey(@ApiParam(value = "The username to be used for authentication (typically, the email address, but depending on configuration, it could be an LDAP username).  See the `require_email_format_usernames` parameter documented in [GET /server_settings](/api/get-server-settings) for details. ",required=true) @QueryParam("username") String username
,@ApiParam(value = "The user's Zulip password (or LDAP password, if LDAP authentication is in use). ",required=true) @QueryParam("password") String password
)
    throws NotFoundException {
        return delegate.fetchApiKey(username,password);
    }
}
