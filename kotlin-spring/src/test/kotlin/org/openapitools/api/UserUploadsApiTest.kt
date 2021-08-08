package org.openapitools.api

import org.openapitools.model.JsonSuccessBase
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class UserUploadsApiTest {

    
    private val api: UserUploadsApiController = UserUploadsApiController()

    
    /**
    * Get public temporary URL
    *
    * Get a temporary URL for access to the file that doesn&#39;t require authentication. 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getFileTemporaryUrlTest() {
        val realmIdStr:kotlin.Int? = null
        val filename:kotlin.String? = null
        val response: ResponseEntity<JsonSuccessBase> = api.getFileTemporaryUrl(realmIdStr!!, filename!!)

        // TODO: test validations
    }
    
    /**
    * Upload a file
    *
    * Upload a single file and get the corresponding URI.  &#x60;POST {{ api_url }}/v1/user_uploads&#x60;  Initially, only you will be able to access the link.  To share the uploaded file, you&#39;ll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun uploadFileTest() {
        val filename:org.springframework.core.io.Resource? = null
        val response: ResponseEntity<JsonSuccessBase> = api.uploadFile(filename!!)

        // TODO: test validations
    }
    
}
