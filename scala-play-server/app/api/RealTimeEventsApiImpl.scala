package api

import model.BadEventQueueIdError
import model.JsObject
import model.JsonSuccess
import model.JsonSuccessBase
import model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError
import model.OneOfRateLimitedError
import model.OneOfUserDeactivatedErrorRealmDeactivatedError

/**
  * Provides a default implementation for [[RealTimeEventsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:45:49.166589Z[Etc/UTC]")
class RealTimeEventsApiImpl extends RealTimeEventsApi {
  /**
    * @inheritdoc
    */
  override def deleteQueue(queueId: String): JsonSuccess = {
    // TODO: Implement better logic

    JsonSuccess(null, null)
  }

  /**
    * @inheritdoc
    */
  override def getEvents(queueId: String, lastEventId: Option[Int], dontBlock: Option[Boolean]): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def realTimePost(eventTypes: Option[List[String]], narrow: Option[List[List[String]]], allPublicStreams: Option[Boolean]): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def registerQueue(applyMarkdown: Option[Boolean], clientGravatar: Option[Boolean], slimPresence: Option[Boolean], eventTypes: Option[List[String]], allPublicStreams: Option[Boolean], includeSubscribers: Option[Boolean], clientCapabilities: Option[JsObject], fetchEventTypes: Option[List[String]], narrow: Option[List[List[String]]]): JsonSuccessBase = {
    // TODO: Implement better logic

    JsonSuccessBase("", "")
  }

  /**
    * @inheritdoc
    */
  override def restErrorHandling(): Unit = {
    // TODO: Implement better logic

    
  }
}
