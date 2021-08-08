package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BadEventQueueIdError
import model.JsObject
import model.JsonSuccess
import model.JsonSuccessBase
import model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError
import model.OneOfRateLimitedError
import model.OneOfUserDeactivatedErrorRealmDeactivatedError

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:15:31.623147Z[Etc/UTC]")
@Singleton
class RealTimeEventsApiController @Inject()(cc: ControllerComponents, api: RealTimeEventsApi) extends AbstractController(cc) {
  /**
    * DELETE /api/v1/events?queueId=[value]
    */
  def deleteQueue(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val queueId = request.getQueryString("queue_id")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("queue_id", "query string")
        }
      api.deleteQueue(queueId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/events?queueId=[value]&lastEventId=[value]&dontBlock=[value]
    */
  def getEvents(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val queueId = request.getQueryString("queue_id")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("queue_id", "query string")
        }
      val lastEventId = request.getQueryString("last_event_id")
        .map(value => value.toInt)
      val dontBlock = request.getQueryString("dont_block")
        .map(value => value.toBoolean)
      api.getEvents(queueId, lastEventId, dontBlock)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/real-time?eventTypes=[value]&narrow=[value]&allPublicStreams=[value]
    */
  def realTimePost(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val eventTypes = request.queryString.get("event_types")
        .map(_.toList)
      val narrow = request.queryString.get("narrow")
        .map(_.toList)
        .map(_.map(value => )
      val allPublicStreams = request.getQueryString("all_public_streams")
        .map(value => value.toBoolean)
      api.realTimePost(eventTypes, narrow, allPublicStreams)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/v1/register?applyMarkdown=[value]&clientGravatar=[value]&slimPresence=[value]&eventTypes=[value]&allPublicStreams=[value]&includeSubscribers=[value]&clientCapabilities=[value]&fetchEventTypes=[value]&narrow=[value]
    */
  def registerQueue(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val applyMarkdown = request.getQueryString("apply_markdown")
        .map(value => value.toBoolean)
      val clientGravatar = request.getQueryString("client_gravatar")
        .map(value => value.toBoolean)
      val slimPresence = request.getQueryString("slim_presence")
        .map(value => value.toBoolean)
      val eventTypes = request.queryString.get("event_types")
        .map(_.toList)
      val allPublicStreams = request.getQueryString("all_public_streams")
        .map(value => value.toBoolean)
      val includeSubscribers = request.getQueryString("include_subscribers")
        .map(value => value.toBoolean)
      val clientCapabilities = request.getQueryString("client_capabilities")
        .map(value => )
      val fetchEventTypes = request.queryString.get("fetch_event_types")
        .map(_.toList)
      val narrow = request.queryString.get("narrow")
        .map(_.toList)
        .map(_.map(value => )
      api.registerQueue(applyMarkdown, clientGravatar, slimPresence, eventTypes, allPublicStreams, includeSubscribers, clientCapabilities, fetchEventTypes, narrow)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/rest-error-handling
    */
  def restErrorHandling(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.restErrorHandling()
    }

    executeApi()
    Ok
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
