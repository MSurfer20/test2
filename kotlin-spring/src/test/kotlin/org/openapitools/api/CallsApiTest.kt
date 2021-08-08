package org.openapitools.api

import org.openapitools.model.JsonSuccessBase
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class CallsApiTest {

    
    private val api: CallsApiController = CallsApiController()

    
    /**
    * Create BigBlueButton video call
    *
    * Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun createBigBlueButtonVideoCallTest() {
        val response: ResponseEntity<JsonSuccessBase> = api.createBigBlueButtonVideoCall()

        // TODO: test validations
    }
    
}
