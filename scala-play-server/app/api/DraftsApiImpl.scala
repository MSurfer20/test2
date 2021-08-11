package api

import model.CodedError
import model.Draft
import model.JsonError
import model.JsonSuccess

/**
  * Provides a default implementation for [[DraftsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
class DraftsApiImpl extends DraftsApi {
  /**
    * @inheritdoc
    */
  override def createDrafts(drafts: Option[List[Draft]]): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def deleteDraft(draftId: Int): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def editDraft(draftId: Int, draft: Draft): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def getDrafts(): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }
}
