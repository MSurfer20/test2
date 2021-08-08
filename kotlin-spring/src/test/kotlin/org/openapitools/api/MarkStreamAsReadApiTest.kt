package org.openapitools.api

import org.openapitools.model.JsonSuccess
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class MarkStreamAsReadApiTest {

    
    private val api: MarkStreamAsReadApiController = MarkStreamAsReadApiController()

    
    /**
    * Mark messages in a stream as read
    *
    * Mark all the unread messages in a stream as read. 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun markStreamAsReadTest() {
        val streamId:kotlin.Int? = null
        val response: ResponseEntity<JsonSuccess> = api.markStreamAsRead(streamId!!)

        // TODO: test validations
    }
    
}
