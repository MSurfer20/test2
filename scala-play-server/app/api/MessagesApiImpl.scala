package api

import model.CodedError
import model.InvalidMessageError
import model.JsObject
import model.JsonSuccess
import model.JsonSuccessBase
import model.OasAnyTypeNotMapped
import model.OneOfobjectobject
import model.OneOfstringinteger
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[MessagesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-09T21:37:15.417726Z[Etc/UTC]")
class MessagesApiImpl extends MessagesApi {
  /**
    * @inheritdoc
    */
  override def addReaction(messageId: Int, emojiName: String, emojiCode: Option[String], reactionType: Option[String]): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def checkMessagesMatchNarrow(msgIds: List[Int], narrow: List[JsObject]): OasAnyTypeNotMapped = {
    // TODO: Implement better logic

    null
  }

  /**
    * @inheritdoc
    */
  override def deleteMessage(messageId: Int): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def getFileTemporaryUrl(realmIdStr: Int, filename: String): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def getMessageHistory(messageId: Int): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def getMessages(numBefore: Int, numAfter: Int, anchor: Option[OneOfstringinteger], narrow: Option[List[JsObject]], clientGravatar: Option[Boolean], applyMarkdown: Option[Boolean], useFirstUnreadAnchor: Option[Boolean]): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def getRawMessage(messageId: Int): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def markAllAsRead(): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def markStreamAsRead(streamId: Int): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def markTopicAsRead(streamId: Int, topicName: String): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def removeReaction(messageId: Int, emojiName: Option[String], emojiCode: Option[String], reactionType: Option[String]): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def renderMessage(content: String): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def sendMessage(`type`: String, to: List[Int], content: String, topic: Option[String], queueId: Option[String], localId: Option[String]): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def updateMessage(messageId: Int, topic: Option[String], propagateMode: Option[String], sendNotificationToOldThread: Option[Boolean], sendNotificationToNewThread: Option[Boolean], content: Option[String], streamId: Option[Int]): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def updateMessageFlags(messages: List[Int], op: String, flag: String): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def uploadFile(filename: Option[TemporaryFile]): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }
}
