package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.CodedError
import org.openapitools.server.model.JsonError
import org.openapitools.server.model.JsonSuccess
import org.openapitools.server.model.JsonSuccessBase
import org.openapitools.server.model.NonExistingStreamError
import org.openapitools.server.model.OneOfobjectobject
import org.openapitools.server.model.OneOfstringinteger


class StreamsApi(
    streamsService: StreamsApiService,
    streamsMarshaller: StreamsApiMarshaller
) {

  
  import streamsMarshaller._

  lazy val route: Route =
    path("streams" / IntNumber) { (streamId) => 
      delete {  
            streamsService.archiveStream(streamId = streamId)
      }
    } ~
    path("calls" / "bigbluebutton" / "create") { 
      get {  
            streamsService.createBigBlueButtonVideoCall()
      }
    } ~
    path("streams" / IntNumber / "delete_topic") { (streamId) => 
      post { 
        parameters("topic_name".as[String]) { (topicName) => 
            streamsService.deleteTopic(streamId = streamId, topicName = topicName)
        }
      }
    } ~
    path("get_stream_id") { 
      get { 
        parameters("stream".as[String]) { (stream) => 
            streamsService.getStreamId(stream = stream)
        }
      }
    } ~
    path("users" / "me" / IntNumber / "topics") { (streamId) => 
      get {  
            streamsService.getStreamTopics(streamId = streamId)
      }
    } ~
    path("streams") { 
      get { 
        parameters("include_public".as[Boolean].?(true), "include_web_public".as[Boolean].?(false), "include_subscribed".as[Boolean].?(true), "include_all_active".as[Boolean].?(false), "include_default".as[Boolean].?(false), "include_owner_subscribed".as[Boolean].?(false)) { (includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed) => 
            streamsService.getStreams(includePublic = includePublic, includeWebPublic = includeWebPublic, includeSubscribed = includeSubscribed, includeAllActive = includeAllActive, includeDefault = includeDefault, includeOwnerSubscribed = includeOwnerSubscribed)
        }
      }
    } ~
    path("streams" / IntNumber / "members") { (streamId) => 
      get {  
            streamsService.getSubscribers(streamId = streamId)
      }
    } ~
    path("users" / IntNumber / "subscriptions" / IntNumber) { (userId, streamId) => 
      get {  
            streamsService.getSubscriptionStatus(userId = userId, streamId = streamId)
      }
    } ~
    path("users" / "me" / "subscriptions") { 
      get { 
        parameters("include_subscribers".as[Boolean].?(false)) { (includeSubscribers) => 
            streamsService.getSubscriptions(includeSubscribers = includeSubscribers)
        }
      }
    } ~
    path("users" / "me" / "subscriptions" / "muted_topics") { 
      patch { 
        parameters("stream".as[String].?, "stream_id".as[Int].?, "topic".as[String], "op".as[String]) { (stream, streamId, topic, op) => 
            streamsService.muteTopic(topic = topic, op = op, stream = stream, streamId = streamId)
        }
      }
    } ~
    path("users" / "me" / "subscriptions") { 
      post { 
        parameters("subscriptions".as[String], "principals".as[String].?("new ListBuffer[OneOfstringinteger]() "), "authorization_errors_fatal".as[Boolean].?(true), "announce".as[Boolean].?(false), "invite_only".as[Boolean].?(false), "history_public_to_subscribers".as[Boolean].?, "stream_post_policy".as[Int].?(1), "message_retention_days".as[String].?) { (subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays) => 
            streamsService.subscribe(subscriptions = subscriptions, principals = principals, authorizationErrorsFatal = authorizationErrorsFatal, announce = announce, inviteOnly = inviteOnly, historyPublicToSubscribers = historyPublicToSubscribers, streamPostPolicy = streamPostPolicy, messageRetentionDays = messageRetentionDays)
        }
      }
    } ~
    path("users" / "me" / "subscriptions") { 
      delete { 
        parameters("subscriptions".as[String], "principals".as[String].?("new ListBuffer[OneOfstringinteger]() ")) { (subscriptions, principals) => 
            streamsService.unsubscribe(subscriptions = subscriptions, principals = principals)
        }
      }
    } ~
    path("streams" / IntNumber) { (streamId) => 
      patch { 
        parameters("description".as[String].?, "new_name".as[String].?, "is_private".as[Boolean].?, "is_announcement_only".as[Boolean].?, "stream_post_policy".as[Int].?(1), "history_public_to_subscribers".as[Boolean].?, "message_retention_days".as[String].?) { (description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays) => 
            streamsService.updateStream(streamId = streamId, description = description, newName = newName, isPrivate = isPrivate, isAnnouncementOnly = isAnnouncementOnly, streamPostPolicy = streamPostPolicy, historyPublicToSubscribers = historyPublicToSubscribers, messageRetentionDays = messageRetentionDays)
        }
      }
    } ~
    path("users" / "me" / "subscriptions" / "properties") { 
      post { 
        parameters("subscription_data".as[String]) { (subscriptionData) => 
            streamsService.updateSubscriptionSettings(subscriptionData = subscriptionData)
        }
      }
    } ~
    path("users" / "me" / "subscriptions") { 
      patch { 
        parameters("delete".as[String].?("new ListBuffer[String]() "), "add".as[String].?("new ListBuffer[Any]() ")) { (delete, add) => 
            streamsService.updateSubscriptions(delete = delete, add = add)
        }
      }
    }
}


trait StreamsApiService {

  def archiveStream200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def archiveStream400(responseJsonError: JsonError)(implicit toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route =
    complete((400, responseJsonError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 400, Message: Bad request., DataType: JsonError
   */
  def archiveStream(streamId: Int)
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess], toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route

  def createBigBlueButtonVideoCall200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def createBigBlueButtonVideoCall()
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def deleteTopic200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def deleteTopic400(responseJsonError: JsonError)(implicit toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route =
    complete((400, responseJsonError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 400, Message: Error., DataType: JsonError
   */
  def deleteTopic(streamId: Int, topicName: String)
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess], toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route

  def getStreamId200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  def getStreamId400(responseCodedError: CodedError)(implicit toEntityMarshallerCodedError: ToEntityMarshaller[CodedError]): Route =
    complete((400, responseCodedError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   * Code: 400, Message: Bad request., DataType: CodedError
   */
  def getStreamId(stream: String)
      (implicit toEntityMarshallerCodedError: ToEntityMarshaller[CodedError], toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def getStreamTopics200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  def getStreamTopics400(responseJsonError: JsonError)(implicit toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route =
    complete((400, responseJsonError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   * Code: 400, Message: Bad request., DataType: JsonError
   */
  def getStreamTopics(streamId: Int)
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase], toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route

  def getStreams200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  def getStreams400(responseCodedError: CodedError)(implicit toEntityMarshallerCodedError: ToEntityMarshaller[CodedError]): Route =
    complete((400, responseCodedError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   * Code: 400, Message: Bad request., DataType: CodedError
   */
  def getStreams(includePublic: Boolean, includeWebPublic: Boolean, includeSubscribed: Boolean, includeAllActive: Boolean, includeDefault: Boolean, includeOwnerSubscribed: Boolean)
      (implicit toEntityMarshallerCodedError: ToEntityMarshaller[CodedError], toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def getSubscribers200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  def getSubscribers400(responseJsonError: JsonError)(implicit toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route =
    complete((400, responseJsonError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   * Code: 400, Message: Bad request., DataType: JsonError
   */
  def getSubscribers(streamId: Int)
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase], toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route

  def getSubscriptionStatus200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success, DataType: JsonSuccessBase
   */
  def getSubscriptionStatus(userId: Int, streamId: Int)
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def getSubscriptions200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def getSubscriptions(includeSubscribers: Boolean)
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def muteTopic200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def muteTopic400(responseOneOfobjectobject: OneOfobjectobject)(implicit toEntityMarshallerOneOfobjectobject: ToEntityMarshaller[OneOfobjectobject]): Route =
    complete((400, responseOneOfobjectobject))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 400, Message: Bad request., DataType: OneOfobjectobject
   */
  def muteTopic(topic: String, op: String, stream: Option[String], streamId: Option[Int])
      (implicit toEntityMarshallerOneOfobjectobject: ToEntityMarshaller[OneOfobjectobject], toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route

  def subscribe200(responseOneOfobjectobject: OneOfobjectobject)(implicit toEntityMarshallerOneOfobjectobject: ToEntityMarshaller[OneOfobjectobject]): Route =
    complete((200, responseOneOfobjectobject))
  def subscribe400(responseOneOfobjectobject: OneOfobjectobject)(implicit toEntityMarshallerOneOfobjectobject: ToEntityMarshaller[OneOfobjectobject]): Route =
    complete((400, responseOneOfobjectobject))
  /**
   * Code: 200, Message: Success., DataType: OneOfobjectobject
   * Code: 400, Message: Success., DataType: OneOfobjectobject
   */
  def subscribe(subscriptions: String, principals: String, authorizationErrorsFatal: Boolean, announce: Boolean, inviteOnly: Boolean, historyPublicToSubscribers: Option[Boolean], streamPostPolicy: Int, messageRetentionDays: Option[String])
      (implicit toEntityMarshallerOneOfobjectobject: ToEntityMarshaller[OneOfobjectobject]): Route

  def unsubscribe200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  def unsubscribe400(responseNonExistingStreamError: NonExistingStreamError)(implicit toEntityMarshallerNonExistingStreamError: ToEntityMarshaller[NonExistingStreamError]): Route =
    complete((400, responseNonExistingStreamError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   * Code: 400, Message: Bad request., DataType: NonExistingStreamError
   */
  def unsubscribe(subscriptions: String, principals: String)
      (implicit toEntityMarshallerNonExistingStreamError: ToEntityMarshaller[NonExistingStreamError], toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def updateStream200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def updateStream400(responseJsonError: JsonError)(implicit toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route =
    complete((400, responseJsonError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 400, Message: Bad request., DataType: JsonError
   */
  def updateStream(streamId: Int, description: Option[String], newName: Option[String], isPrivate: Option[Boolean], isAnnouncementOnly: Option[Boolean], streamPostPolicy: Int, historyPublicToSubscribers: Option[Boolean], messageRetentionDays: Option[String])
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess], toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route

  def updateSubscriptionSettings200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def updateSubscriptionSettings(subscriptionData: String)
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def updateSubscriptions200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def updateSubscriptions(delete: String, add: String)
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

}

trait StreamsApiMarshaller {


  implicit def toEntityMarshallerNonExistingStreamError: ToEntityMarshaller[NonExistingStreamError]

  implicit def toEntityMarshallerOneOfobjectobject: ToEntityMarshaller[OneOfobjectobject]

  implicit def toEntityMarshallerCodedError: ToEntityMarshaller[CodedError]

  implicit def toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]

  implicit def toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]

  implicit def toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]

}

