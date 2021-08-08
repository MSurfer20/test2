package org.openapitools.api

import org.openapitools.model.JsonSuccess
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class MarkTopicAsReadApiTest {

    
    private val api: MarkTopicAsReadApiController = MarkTopicAsReadApiController()

    
    /**
    * Mark messages in a topic as read
    *
    * Mark all the unread messages in a topic as read. 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun markTopicAsReadTest() {
        val streamId:kotlin.Int? = null
        val topicName:kotlin.String? = null
        val response: ResponseEntity<JsonSuccess> = api.markTopicAsRead(streamId!!, topicName!!)

        // TODO: test validations
    }
    
}
