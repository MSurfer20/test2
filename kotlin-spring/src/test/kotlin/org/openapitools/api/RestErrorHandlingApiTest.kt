package org.openapitools.api

import org.openapitools.model.OneOfLessThanInvalidApiKeyErrorCommaMissingArgumentErrorCommaUserNotAuthorizedErrorGreaterThan
import org.openapitools.model.OneOfLessThanRateLimitedErrorGreaterThan
import org.openapitools.model.OneOfLessThanUserDeactivatedErrorCommaRealmDeactivatedErrorGreaterThan
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class RestErrorHandlingApiTest {

    
    private val api: RestErrorHandlingApiController = RestErrorHandlingApiController()

    
    /**
    * Error handling
    *
    * Common error to many endpoints 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun restErrorHandlingTest() {
        val response: ResponseEntity<Unit> = api.restErrorHandling()

        // TODO: test validations
    }
    
}
