package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.BadEventQueueIdError
import org.openapitools.server.model.JsonSuccess
import org.openapitools.server.model.JsonSuccessBase
import org.openapitools.server.model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError
import org.openapitools.server.model.OneOfRateLimitedError
import org.openapitools.server.model.OneOfUserDeactivatedErrorRealmDeactivatedError


class RealTimeEventsApi(
    realTimeEventsService: RealTimeEventsApiService,
    realTimeEventsMarshaller: RealTimeEventsApiMarshaller
) {

  
  import realTimeEventsMarshaller._

  lazy val route: Route =
    path("events") { 
      delete { 
        parameters("queue_id".as[String]) { (queueId) => 
            realTimeEventsService.deleteQueue(queueId = queueId)
        }
      }
    } ~
    path("events") { 
      get { 
        parameters("queue_id".as[String], "last_event_id".as[Int].?, "dont_block".as[Boolean].?(false)) { (queueId, lastEventId, dontBlock) => 
            realTimeEventsService.getEvents(queueId = queueId, lastEventId = lastEventId, dontBlock = dontBlock)
        }
      }
    } ~
    path("real-time") { 
      post { 
        parameters("event_types".as[String].?("new ListBuffer[String]() "), "narrow".as[String].?("[]"), "all_public_streams".as[Boolean].?(false)) { (eventTypes, narrow, allPublicStreams) => 
            realTimeEventsService.realTimePost(eventTypes = eventTypes, narrow = narrow, allPublicStreams = allPublicStreams)
        }
      }
    } ~
    path("register") { 
      post { 
        parameters("apply_markdown".as[Boolean].?(false), "client_gravatar".as[Boolean].?(false), "slim_presence".as[Boolean].?(false), "event_types".as[String].?("new ListBuffer[String]() "), "all_public_streams".as[Boolean].?(false), "include_subscribers".as[Boolean].?(false), "client_capabilities".as[String].?, "fetch_event_types".as[String].?("new ListBuffer[String]() "), "narrow".as[String].?("[]")) { (applyMarkdown, clientGravatar, slimPresence, eventTypes, allPublicStreams, includeSubscribers, clientCapabilities, fetchEventTypes, narrow) => 
            realTimeEventsService.registerQueue(applyMarkdown = applyMarkdown, clientGravatar = clientGravatar, slimPresence = slimPresence, eventTypes = eventTypes, allPublicStreams = allPublicStreams, includeSubscribers = includeSubscribers, clientCapabilities = clientCapabilities, fetchEventTypes = fetchEventTypes, narrow = narrow)
        }
      }
    } ~
    path("rest-error-handling") { 
      post {  
            realTimeEventsService.restErrorHandling()
      }
    }
}


trait RealTimeEventsApiService {

  def deleteQueue200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def deleteQueue400(responseBadEventQueueIdError: BadEventQueueIdError)(implicit toEntityMarshallerBadEventQueueIdError: ToEntityMarshaller[BadEventQueueIdError]): Route =
    complete((400, responseBadEventQueueIdError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 400, Message: Bad request., DataType: BadEventQueueIdError
   */
  def deleteQueue(queueId: String)
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess], toEntityMarshallerBadEventQueueIdError: ToEntityMarshaller[BadEventQueueIdError]): Route

  def getEvents200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  def getEvents400(responseBadEventQueueIdError: BadEventQueueIdError)(implicit toEntityMarshallerBadEventQueueIdError: ToEntityMarshaller[BadEventQueueIdError]): Route =
    complete((400, responseBadEventQueueIdError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   * Code: 400, Message: Bad request., DataType: BadEventQueueIdError
   */
  def getEvents(queueId: String, lastEventId: Option[Int], dontBlock: Boolean)
      (implicit toEntityMarshallerBadEventQueueIdError: ToEntityMarshaller[BadEventQueueIdError], toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def realTimePost200: Route =
    complete((200, "Success"))
  /**
   * Code: 200, Message: Success
   */
  def realTimePost(eventTypes: String, narrow: String, allPublicStreams: Boolean): Route

  def registerQueue200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def registerQueue(applyMarkdown: Boolean, clientGravatar: Boolean, slimPresence: Boolean, eventTypes: String, allPublicStreams: Boolean, includeSubscribers: Boolean, clientCapabilities: Option[String], fetchEventTypes: String, narrow: String)
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def restErrorHandling400(responseOneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError: OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError)(implicit toEntityMarshallerOneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError: ToEntityMarshaller[OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError]): Route =
    complete((400, responseOneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError))
  def restErrorHandling401(responseOneOfUserDeactivatedErrorRealmDeactivatedError: OneOfUserDeactivatedErrorRealmDeactivatedError)(implicit toEntityMarshallerOneOfUserDeactivatedErrorRealmDeactivatedError: ToEntityMarshaller[OneOfUserDeactivatedErrorRealmDeactivatedError]): Route =
    complete((401, responseOneOfUserDeactivatedErrorRealmDeactivatedError))
  def restErrorHandling429(responseOneOfRateLimitedError: OneOfRateLimitedError)(implicit toEntityMarshallerOneOfRateLimitedError: ToEntityMarshaller[OneOfRateLimitedError]): Route =
    complete((429, responseOneOfRateLimitedError))
  /**
   * Code: 400, Message: Bad request. , DataType: OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError
   * Code: 401, Message: Unauthorized. , DataType: OneOfUserDeactivatedErrorRealmDeactivatedError
   * Code: 429, Message: Rate limit exceeded. , DataType: OneOfRateLimitedError
   */
  def restErrorHandling()
      (implicit toEntityMarshallerOneOfUserDeactivatedErrorRealmDeactivatedError: ToEntityMarshaller[OneOfUserDeactivatedErrorRealmDeactivatedError], toEntityMarshallerOneOfRateLimitedError: ToEntityMarshaller[OneOfRateLimitedError], toEntityMarshallerOneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError: ToEntityMarshaller[OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError]): Route

}

trait RealTimeEventsApiMarshaller {


  implicit def toEntityMarshallerOneOfUserDeactivatedErrorRealmDeactivatedError: ToEntityMarshaller[OneOfUserDeactivatedErrorRealmDeactivatedError]

  implicit def toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]

  implicit def toEntityMarshallerBadEventQueueIdError: ToEntityMarshaller[BadEventQueueIdError]

  implicit def toEntityMarshallerOneOfRateLimitedError: ToEntityMarshaller[OneOfRateLimitedError]

  implicit def toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]

  implicit def toEntityMarshallerOneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError: ToEntityMarshaller[OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError]

}

