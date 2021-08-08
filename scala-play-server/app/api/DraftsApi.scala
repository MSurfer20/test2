package api

import play.api.libs.json._
import model.CodedError
import model.Draft
import model.JsonError
import model.JsonSuccess

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:23:09.886767Z[Etc/UTC]")
trait DraftsApi {
  /**
    * Create drafts
    * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 
    * @param drafts A JSON-encoded list of containing new draft objects. 
    */
  def createDrafts(drafts: Option[List[Draft]]): JsonSuccess

  /**
    * Delete a draft
    * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 
    * @param draftId The ID of the draft you want to delete. 
    */
  def deleteDraft(draftId: Int): JsonSuccess

  /**
    * Edit a draft
    * Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 
    * @param draftId The ID of the draft to be edited. 
    * @param draft A JSON-encoded object containing a replacement draft object for this ID. 
    */
  def editDraft(draftId: Int, draft: Draft): JsonSuccess

  /**
    * Get drafts
    * Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 
    */
  def getDrafts(): JsonSuccess
}
