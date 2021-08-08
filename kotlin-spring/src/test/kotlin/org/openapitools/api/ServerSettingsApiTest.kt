package org.openapitools.api

import org.openapitools.model.JsonSuccessBase
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class ServerSettingsApiTest {

    
    private val api: ServerSettingsApiController = ServerSettingsApiController()

    
    /**
    * Get server settings
    *
    * Fetch global settings for a Zulip server.  &#x60;GET {{ api_url }}/v1/server_settings&#x60;  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it&#39;s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getServerSettingsTest() {
        val response: ResponseEntity<JsonSuccessBase> = api.getServerSettings()

        // TODO: test validations
    }
    
}
