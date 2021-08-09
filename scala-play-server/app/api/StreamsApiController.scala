package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CodedError
import model.JsObject
import model.JsonError
import model.JsonSuccess
import model.JsonSuccessBase
import model.NonExistingStreamError
import model.OneOfobjectobject
import model.OneOfstringinteger

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-09T21:37:15.417726Z[Etc/UTC]")
@Singleton
class StreamsApiController @Inject()(cc: ControllerComponents, api: StreamsApi) extends AbstractController(cc) {
  /**
    * DELETE /api/v1/streams/:streamId
    * @param streamId The ID of the stream to access. 
    */
  def archiveStream(streamId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      api.archiveStream(streamId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/calls/bigbluebutton/create
    */
  def createBigBlueButtonVideoCall(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      api.createBigBlueButtonVideoCall()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/streams/:streamId/delete_topic?topicName=[value]
    * @param streamId The ID of the stream to access. 
    */
  def deleteTopic(streamId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val topicName = request.getQueryString("topic_name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("topic_name", "query string")
        }
      api.deleteTopic(streamId, topicName)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/get_stream_id?stream=[value]
    */
  def getStreamId(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val stream = request.getQueryString("stream")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("stream", "query string")
        }
      api.getStreamId(stream)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/users/me/:streamId/topics
    * @param streamId The ID of the stream to access. 
    */
  def getStreamTopics(streamId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      api.getStreamTopics(streamId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/streams?includePublic=[value]&includeWebPublic=[value]&includeSubscribed=[value]&includeAllActive=[value]&includeDefault=[value]&includeOwnerSubscribed=[value]
    */
  def getStreams(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val includePublic = request.getQueryString("include_public")
        .map(value => value.toBoolean)
      val includeWebPublic = request.getQueryString("include_web_public")
        .map(value => value.toBoolean)
      val includeSubscribed = request.getQueryString("include_subscribed")
        .map(value => value.toBoolean)
      val includeAllActive = request.getQueryString("include_all_active")
        .map(value => value.toBoolean)
      val includeDefault = request.getQueryString("include_default")
        .map(value => value.toBoolean)
      val includeOwnerSubscribed = request.getQueryString("include_owner_subscribed")
        .map(value => value.toBoolean)
      api.getStreams(includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/streams/:streamId/members
    * @param streamId The ID of the stream to access. 
    */
  def getSubscribers(streamId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      api.getSubscribers(streamId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/users/:userId/subscriptions/:streamId
    * @param userId The target user&#39;s ID. 
    * @param streamId The ID of the stream to access. 
    */
  def getSubscriptionStatus(userId: Int, streamId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      api.getSubscriptionStatus(userId, streamId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/users/me/subscriptions?includeSubscribers=[value]
    */
  def getSubscriptions(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val includeSubscribers = request.getQueryString("include_subscribers")
        .map(value => value.toBoolean)
      api.getSubscriptions(includeSubscribers)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /api/v1/users/me/subscriptions/muted_topics?stream=[value]&streamId=[value]&topic=[value]&op=[value]
    */
  def muteTopic(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val stream = request.getQueryString("stream")
        
      val streamId = request.getQueryString("stream_id")
        .map(value => value.toInt)
      val topic = request.getQueryString("topic")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("topic", "query string")
        }
      val op = request.getQueryString("op")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("op", "query string")
        }
      api.muteTopic(topic, op, stream, streamId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/users/me/subscriptions?subscriptions=[value]&principals=[value]&authorizationErrorsFatal=[value]&announce=[value]&inviteOnly=[value]&historyPublicToSubscribers=[value]&streamPostPolicy=[value]&messageRetentionDays=[value]
    */
  def subscribe(): Action[AnyContent] = Action { request =>
    def executeApi(): OneOfobjectobject = {
      val subscriptions = request.queryString.get("subscriptions")
        .map(_.toList)
        .map(_.map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("subscriptions", "query string")
        }
      val principals = request.queryString.get("principals")
        .map(_.toList)
        .map(_.map(value => )
      val authorizationErrorsFatal = request.getQueryString("authorization_errors_fatal")
        .map(value => value.toBoolean)
      val announce = request.getQueryString("announce")
        .map(value => value.toBoolean)
      val inviteOnly = request.getQueryString("invite_only")
        .map(value => value.toBoolean)
      val historyPublicToSubscribers = request.getQueryString("history_public_to_subscribers")
        .map(value => value.toBoolean)
      val streamPostPolicy = request.getQueryString("stream_post_policy")
        .map(value => value.toInt)
      val messageRetentionDays = request.getQueryString("message_retention_days")
        .map(value => )
      api.subscribe(subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/v1/users/me/subscriptions?subscriptions=[value]&principals=[value]
    */
  def unsubscribe(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val subscriptions = request.queryString.get("subscriptions")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("subscriptions", "query string")
        }
      val principals = request.queryString.get("principals")
        .map(_.toList)
        .map(_.map(value => )
      api.unsubscribe(subscriptions, principals)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /api/v1/streams/:streamId?description=[value]&newName=[value]&isPrivate=[value]&isAnnouncementOnly=[value]&streamPostPolicy=[value]&historyPublicToSubscribers=[value]&messageRetentionDays=[value]
    * @param streamId The ID of the stream to access. 
    */
  def updateStream(streamId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val description = request.getQueryString("description")
        
      val newName = request.getQueryString("new_name")
        
      val isPrivate = request.getQueryString("is_private")
        .map(value => value.toBoolean)
      val isAnnouncementOnly = request.getQueryString("is_announcement_only")
        .map(value => value.toBoolean)
      val streamPostPolicy = request.getQueryString("stream_post_policy")
        .map(value => value.toInt)
      val historyPublicToSubscribers = request.getQueryString("history_public_to_subscribers")
        .map(value => value.toBoolean)
      val messageRetentionDays = request.getQueryString("message_retention_days")
        .map(value => )
      api.updateStream(streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/users/me/subscriptions/properties?subscriptionData=[value]
    */
  def updateSubscriptionSettings(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val subscriptionData = request.queryString.get("subscription_data")
        .map(_.toList)
        .map(_.map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("subscription_data", "query string")
        }
      api.updateSubscriptionSettings(subscriptionData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /api/v1/users/me/subscriptions?delete=[value]&add=[value]
    */
  def updateSubscriptions(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val delete = request.queryString.get("delete")
        .map(_.toList)
      val add = request.queryString.get("add")
        .map(_.toList)
        .map(_.map(value => )
      api.updateSubscriptions(delete, add)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
