package org.openapitools.api

import org.openapitools.model.JsonSuccessBase
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class AttachmentsApiTest {

    
    private val api: AttachmentsApiController = AttachmentsApiController()

    
    /**
    * Get attachments
    *
    * Fetch metadata on files uploaded by the requesting user.  &#x60;GET {{ api_url }}/v1/attachments&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getAttachmentsTest() {
        val response: ResponseEntity<JsonSuccessBase> = api.getAttachments()

        // TODO: test validations
    }
    
}
