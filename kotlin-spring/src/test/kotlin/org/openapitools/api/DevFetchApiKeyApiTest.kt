package org.openapitools.api

import org.openapitools.model.ApiKeyResponse
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class DevFetchApiKeyApiTest {

    
    private val api: DevFetchApiKeyApiController = DevFetchApiKeyApiController()

    
    /**
    * Fetch an API key (development only)
    *
    * For easy testing of mobile apps and other clients and against Zulip development servers, we support fetching a Zulip API key for any user on the development server without authentication (so that they can implement analogues of the one-click login process available for Zulip development servers on the web).  **Note:** This endpoint is only available on Zulip development servers; for obvious security reasons it will always return an error in a Zulip production server.  &#x60;POST {{ api_url }}/v1/dev_fetch_api_key&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun devFetchApiKeyTest() {
        val username:kotlin.String? = null
        val response: ResponseEntity<ApiKeyResponse> = api.devFetchApiKey(username!!)

        // TODO: test validations
    }
    
}
