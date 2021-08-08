package org.openapitools.api

import org.openapitools.model.InlineResponse200
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class ZulipOutgoingWebhookApiTest {

    
    private val api: ZulipOutgoingWebhookApiController = ZulipOutgoingWebhookApiController()

    
    /**
    * Outgoing webhooks
    *
    * Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun zulipOutgoingWebhooksTest() {
        val response: ResponseEntity<InlineResponse200> = api.zulipOutgoingWebhooks()

        // TODO: test validations
    }
    
}
