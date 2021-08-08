package org.openapitools.api

import org.openapitools.model.ApiKeyResponse
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class FetchApiKeyApiTest {

    
    private val api: FetchApiKeyApiController = FetchApiKeyApiController()

    
    /**
    * Fetch an API key (production)
    *
    * This API endpoint is used by clients such as the Zulip mobile and terminal apps to implement password-based authentication.  Given the user&#39;s Zulip login credentials, it returns a Zulip API key that the client can use to make requests requests as the user.  This endpoint is only useful for Zulip servers/organizations with EmailAuthBackend or LDAPAuthBackend enabled.  The Zulip mobile apps also support SSO/social authentication (GitHub auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead, the mobile apps reuse the web login flow passing the &#x60;mobile_flow_otp&#x60; in a webview, and the credentials are returned to the app (encrypted) via a redirect to a &#x60;zulip://&#x60; URL.  !!! warn \&quot;\&quot;     **Note:** If you signed up using passwordless authentication and     never had a password, you can [reset your password](/help/change-your-password).      See the [API keys](/api/api-keys) documentation for     more details on how to download API key manually.  In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html), see also [the unauthenticated variant](/api/dev-fetch-api-key). 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun fetchApiKeyTest() {
        val username:kotlin.String? = null
        val password:kotlin.String? = null
        val response: ResponseEntity<ApiKeyResponse> = api.fetchApiKey(username!!, password!!)

        // TODO: test validations
    }
    
}
