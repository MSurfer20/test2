using System;
using Nancy;
using Nancy.ModelBinding;
using System.Collections.Generic;
using Sharpility.Base;
using Org.OpenAPITools._api_v1.Models;
using Org.OpenAPITools._api_v1.Utils;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Modules
{ 

    /// <summary>
    /// Module processing requests of Authentication domain.
    /// </summary>
    public sealed class AuthenticationModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public AuthenticationModule(AuthenticationService service) : base("/api/v1")
        { 
            Post["/dev_fetch_api_key"] = parameters =>
            {
                var username = Parameters.ValueOf<string>(parameters, Context.Request, "username", ParameterType.Query);
                Preconditions.IsNotNull(username, "Required parameter: 'username' is missing at 'DevFetchApiKey'");
                
                return service.DevFetchApiKey(Context, username);
            };

            Post["/fetch_api_key"] = parameters =>
            {
                var username = Parameters.ValueOf<string>(parameters, Context.Request, "username", ParameterType.Query);
                var password = Parameters.ValueOf<string>(parameters, Context.Request, "password", ParameterType.Query);
                Preconditions.IsNotNull(username, "Required parameter: 'username' is missing at 'FetchApiKey'");
                
                Preconditions.IsNotNull(password, "Required parameter: 'password' is missing at 'FetchApiKey'");
                
                return service.FetchApiKey(Context, username, password);
            };
        }
    }

    /// <summary>
    /// Service handling Authentication requests.
    /// </summary>
    public interface AuthenticationService
    {
        /// <summary>
        /// For easy testing of mobile apps and other clients and against Zulip development servers, we support fetching a Zulip API key for any user on the development server without authentication (so that they can implement analogues of the one-click login process available for Zulip development servers on the web).  **Note:** This endpoint is only available on Zulip development servers; for obvious security reasons it will always return an error in a Zulip production server.  &#x60;POST {{ api_url }}/v1/dev_fetch_api_key&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="username">The email address for the user that owns the API key. </param>
        /// <returns>ApiKeyResponse</returns>
        ApiKeyResponse DevFetchApiKey(NancyContext context, string username);

        /// <summary>
        /// This API endpoint is used by clients such as the Zulip mobile and terminal apps to implement password-based authentication.  Given the user&#39;s Zulip login credentials, it returns a Zulip API key that the client can use to make requests requests as the user.  This endpoint is only useful for Zulip servers/organizations with EmailAuthBackend or LDAPAuthBackend enabled.  The Zulip mobile apps also support SSO/social authentication (GitHub auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead, the mobile apps reuse the web login flow passing the &#x60;mobile_flow_otp&#x60; in a webview, and the credentials are returned to the app (encrypted) via a redirect to a &#x60;zulip://&#x60; URL.  !!! warn \&quot;\&quot;     **Note:** If you signed up using passwordless authentication and     never had a password, you can [reset your password](/help/change-your-password).      See the [API keys](/api/api-keys) documentation for     more details on how to download API key manually.  In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html), see also [the unauthenticated variant](/api/dev-fetch-api-key). 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="username">The username to be used for authentication (typically, the email address, but depending on configuration, it could be an LDAP username).  See the &#x60;require_email_format_usernames&#x60; parameter documented in [GET /server_settings](/api/get-server-settings) for details. </param>
        /// <param name="password">The user&#39;s Zulip password (or LDAP password, if LDAP authentication is in use). </param>
        /// <returns>ApiKeyResponse</returns>
        ApiKeyResponse FetchApiKey(NancyContext context, string username, string password);
    }

    /// <summary>
    /// Abstraction of AuthenticationService.
    /// </summary>
    public abstract class AbstractAuthenticationService: AuthenticationService
    {
        public virtual ApiKeyResponse DevFetchApiKey(NancyContext context, string username)
        {
            return DevFetchApiKey(username);
        }

        public virtual ApiKeyResponse FetchApiKey(NancyContext context, string username, string password)
        {
            return FetchApiKey(username, password);
        }

        protected abstract ApiKeyResponse DevFetchApiKey(string username);

        protected abstract ApiKeyResponse FetchApiKey(string username, string password);
    }

}
