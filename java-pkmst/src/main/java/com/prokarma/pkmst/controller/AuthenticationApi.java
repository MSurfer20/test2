/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ApiKeyResponse;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
/**
 * Provides the info about api methods
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen")
@Api(value = "Authentication", description = "the Authentication API")
public interface AuthenticationApi {

    @ApiOperation(value = "Fetch an API key (development only)", notes = "For easy testing of mobile apps and other clients and against Zulip development servers, we support fetching a Zulip API key for any user on the development server without authentication (so that they can implement analogues of the one-click login process available for Zulip development servers on the web).  **Note:** This endpoint is only available on Zulip development servers; for obvious security reasons it will always return an error in a Zulip production server.  `POST {{ api_url }}/v1/dev_fetch_api_key` ", response = ApiKeyResponse.class, tags={ "authentication", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = ApiKeyResponse.class) })
    @PostMapping(
        value = "/dev_fetch_api_key",
        produces = { "application/json" }
    )
    ResponseEntity<ApiKeyResponse> devFetchApiKey(@ApiParam(value = "The email address for the user that owns the API key. ", required = true)  @RequestParam(value = "username", required = true) String username, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Fetch an API key (production)", notes = "This API endpoint is used by clients such as the Zulip mobile and terminal apps to implement password-based authentication.  Given the user's Zulip login credentials, it returns a Zulip API key that the client can use to make requests requests as the user.  This endpoint is only useful for Zulip servers/organizations with EmailAuthBackend or LDAPAuthBackend enabled.  The Zulip mobile apps also support SSO/social authentication (GitHub auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead, the mobile apps reuse the web login flow passing the `mobile_flow_otp` in a webview, and the credentials are returned to the app (encrypted) via a redirect to a `zulip://` URL.  !!! warn \"\"     **Note:** If you signed up using passwordless authentication and     never had a password, you can [reset your password](/help/change-your-password).      See the [API keys](/api/api-keys) documentation for     more details on how to download API key manually.  In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html), see also [the unauthenticated variant](/api/dev-fetch-api-key). ", response = ApiKeyResponse.class, tags={ "authentication", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Valid credentials the client can use to access the Zulip API.", response = ApiKeyResponse.class) })
    @PostMapping(
        value = "/fetch_api_key",
        produces = { "application/json" }
    )
    ResponseEntity<ApiKeyResponse> fetchApiKey(@ApiParam(value = "The username to be used for authentication (typically, the email address, but depending on configuration, it could be an LDAP username).  See the `require_email_format_usernames` parameter documented in [GET /server_settings](/api/get-server-settings) for details. ", required = true)  @RequestParam(value = "username", required = true) String username,@ApiParam(value = "The user's Zulip password (or LDAP password, if LDAP authentication is in use). ", required = true)  @RequestParam(value = "password", required = true) String password, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
