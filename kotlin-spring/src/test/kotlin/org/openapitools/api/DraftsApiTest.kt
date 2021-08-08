package org.openapitools.api

import org.openapitools.model.CodedError
import org.openapitools.model.Draft
import org.openapitools.model.JsonError
import org.openapitools.model.JsonSuccess
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class DraftsApiTest {

    
    private val api: DraftsApiController = DraftsApiController()

    
    /**
    * Create drafts
    *
    * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun createDraftsTest() {
        val drafts:kotlin.collections.List<Draft>? = null
        val response: ResponseEntity<JsonSuccess> = api.createDrafts(drafts!!)

        // TODO: test validations
    }
    
    /**
    * Delete a draft
    *
    * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun deleteDraftTest() {
        val draftId:kotlin.Int? = null
        val response: ResponseEntity<JsonSuccess> = api.deleteDraft(draftId!!)

        // TODO: test validations
    }
    
    /**
    * Edit a draft
    *
    * Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun editDraftTest() {
        val draftId:kotlin.Int? = null
        val draft:Draft? = null
        val response: ResponseEntity<JsonSuccess> = api.editDraft(draftId!!, draft!!)

        // TODO: test validations
    }
    
    /**
    * Get drafts
    *
    * Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getDraftsTest() {
        val response: ResponseEntity<JsonSuccess> = api.getDrafts()

        // TODO: test validations
    }
    
}
