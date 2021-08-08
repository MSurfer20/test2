package api

import model.CodedError
import model.JsObject
import model.JsonError
import model.JsonSuccess
import model.JsonSuccessBase
import model.NonExistingStreamError
import model.OneOfobjectobject
import model.OneOfstringinteger

/**
  * Provides a default implementation for [[StreamsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:15:24.853051Z[Etc/UTC]")
class StreamsApiImpl extends StreamsApi {
  /**
    * @inheritdoc
    */
  override def archiveStream(streamId: Int): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def createBigBlueButtonVideoCall(): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def deleteTopic(streamId: Int, topicName: String): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def getStreamId(stream: String): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def getStreamTopics(streamId: Int): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def getStreams(includePublic: Option[Boolean], includeWebPublic: Option[Boolean], includeSubscribed: Option[Boolean], includeAllActive: Option[Boolean], includeDefault: Option[Boolean], includeOwnerSubscribed: Option[Boolean]): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def getSubscribers(streamId: Int): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def getSubscriptionStatus(userId: Int, streamId: Int): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def getSubscriptions(includeSubscribers: Option[Boolean]): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def muteTopic(topic: String, op: String, stream: Option[String], streamId: Option[Int]): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def subscribe(subscriptions: List[JsObject], principals: Option[List[OneOfstringinteger]], authorizationErrorsFatal: Option[Boolean], announce: Option[Boolean], inviteOnly: Option[Boolean], historyPublicToSubscribers: Option[Boolean], streamPostPolicy: Option[Int], messageRetentionDays: Option[OneOfstringinteger]): OneOfobjectobject = {
    // TODO: Implement better logic

    null
  }

  /**
    * @inheritdoc
    */
  override def unsubscribe(subscriptions: List[String], principals: Option[List[OneOfstringinteger]]): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def updateStream(streamId: Int, description: Option[String], newName: Option[String], isPrivate: Option[Boolean], isAnnouncementOnly: Option[Boolean], streamPostPolicy: Option[Int], historyPublicToSubscribers: Option[Boolean], messageRetentionDays: Option[OneOfstringinteger]): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def updateSubscriptionSettings(subscriptionData: List[JsObject]): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def updateSubscriptions(delete: Option[List[String]], add: Option[List[JsObject]]): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }
}
