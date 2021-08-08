package org.openapitools.api

import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class RealTimeApiTest {

    
    private val api: RealTimeApiController = RealTimeApiController()

    
    /**
    * 
    *
    * (Ignored) 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun realTimePostTest() {
        val eventTypes:kotlin.collections.List<kotlin.String>? = null
        val narrow:kotlin.collections.List<kotlin.collections.List<kotlin.String>>? = null
        val allPublicStreams:kotlin.Boolean? = null
        val response: ResponseEntity<Unit> = api.realTimePost(eventTypes!!, narrow!!, allPublicStreams!!)

        // TODO: test validations
    }
    
}
