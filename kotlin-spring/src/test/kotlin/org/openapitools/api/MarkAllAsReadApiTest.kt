package org.openapitools.api

import org.openapitools.model.JsonSuccess
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class MarkAllAsReadApiTest {

    
    private val api: MarkAllAsReadApiController = MarkAllAsReadApiController()

    
    /**
    * Mark all messages as read
    *
    * Marks all of the current user&#39;s unread messages as read.  &#x60;POST {{ api_url }}/v1/mark_all_as_read&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun markAllAsReadTest() {
        val response: ResponseEntity<JsonSuccess> = api.markAllAsRead()

        // TODO: test validations
    }
    
}
