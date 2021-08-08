package api

import model.JsObject
import model.JsonSuccess
import model.JsonSuccessBase
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[ServerAndOrganizationsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:23:09.886767Z[Etc/UTC]")
class ServerAndOrganizationsApiImpl extends ServerAndOrganizationsApi {
  /**
    * @inheritdoc
    */
  override def addCodePlayground(name: String, pygmentsLanguage: String, urlPrefix: String): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def addLinkifier(pattern: String, urlFormatString: String): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def createCustomProfileField(fieldType: Int, name: Option[String], hint: Option[String], fieldData: Option[JsObject]): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def getCustomEmoji(): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def getCustomProfileFields(): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def getLinkifiers(): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def getServerSettings(): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def removeCodePlayground(playgroundId: Int): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def removeLinkifier(filterId: Int): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def reorderCustomProfileFields(order: List[Int]): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def updateLinkifier(filterId: Int, pattern: String, urlFormatString: String): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def uploadCustomEmoji(emojiName: String, filename: Option[TemporaryFile]): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }
}
