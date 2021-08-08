package org.openapitools.api

import org.openapitools.model.CodedError
import org.openapitools.model.JsonSuccessBase
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class GetStreamIdApiTest {

    
    private val api: GetStreamIdApiController = GetStreamIdApiController()

    
    /**
    * Get stream ID
    *
    * Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getStreamIdTest() {
        val stream:kotlin.String? = null
        val response: ResponseEntity<JsonSuccessBase> = api.getStreamId(stream!!)

        // TODO: test validations
    }
    
}
