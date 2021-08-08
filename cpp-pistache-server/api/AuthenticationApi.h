/**
* Zulip REST API
* Powerful open source group chat 
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * AuthenticationApi.h
 *
 * 
 */

#ifndef AuthenticationApi_H_
#define AuthenticationApi_H_


#include <pistache/http.h>
#include <pistache/router.h>
#include <pistache/http_headers.h>
#include <pistache/optional.h>

#include <utility>

#include "ApiKeyResponse.h"
#include <string>

namespace org::openapitools::server::api
{

class  AuthenticationApi {
public:
    explicit AuthenticationApi(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    virtual ~AuthenticationApi() = default;
    void init();

    static const std::string base;

private:
    void setupRoutes();

    void dev_fetch_api_key_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void fetch_api_key_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void authentication_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);

    const std::shared_ptr<Pistache::Rest::Router> router;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during Parameter parsing and validation.
    /// May be overriden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleParsingException(const std::exception& ex) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during processing of the request in handler functions.
    /// May be overriden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleOperationException(const std::exception& ex) const noexcept;

    /// <summary>
    /// Fetch an API key (development only)
    /// </summary>
    /// <remarks>
    /// For easy testing of mobile apps and other clients and against Zulip development servers, we support fetching a Zulip API key for any user on the development server without authentication (so that they can implement analogues of the one-click login process available for Zulip development servers on the web).  **Note:** This endpoint is only available on Zulip development servers; for obvious security reasons it will always return an error in a Zulip production server.  &#x60;POST {{ api_url }}/v1/dev_fetch_api_key&#x60; 
    /// </remarks>
    /// <param name="username">The email address for the user that owns the API key. </param>
    virtual void dev_fetch_api_key(const Pistache::Optional<std::string> &username, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Fetch an API key (production)
    /// </summary>
    /// <remarks>
    /// This API endpoint is used by clients such as the Zulip mobile and terminal apps to implement password-based authentication.  Given the user&#39;s Zulip login credentials, it returns a Zulip API key that the client can use to make requests requests as the user.  This endpoint is only useful for Zulip servers/organizations with EmailAuthBackend or LDAPAuthBackend enabled.  The Zulip mobile apps also support SSO/social authentication (GitHub auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead, the mobile apps reuse the web login flow passing the &#x60;mobile_flow_otp&#x60; in a webview, and the credentials are returned to the app (encrypted) via a redirect to a &#x60;zulip://&#x60; URL.  !!! warn \&quot;\&quot;     **Note:** If you signed up using passwordless authentication and     never had a password, you can [reset your password](/help/change-your-password).      See the [API keys](/api/api-keys) documentation for     more details on how to download API key manually.  In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html), see also [the unauthenticated variant](/api/dev-fetch-api-key). 
    /// </remarks>
    /// <param name="username">The username to be used for authentication (typically, the email address, but depending on configuration, it could be an LDAP username).  See the &#x60;require_email_format_usernames&#x60; parameter documented in [GET /server_settings](/api/get-server-settings) for details. </param>
    /// <param name="password">The user&#39;s Zulip password (or LDAP password, if LDAP authentication is in use). </param>
    virtual void fetch_api_key(const Pistache::Optional<std::string> &username, const Pistache::Optional<std::string> &password, Pistache::Http::ResponseWriter &response) = 0;

};

} // namespace org::openapitools::server::api

#endif /* AuthenticationApi_H_ */
