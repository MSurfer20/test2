package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.InlineResponse200

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:45:49.166589Z[Etc/UTC]")
@Singleton
class WebhooksApiController @Inject()(cc: ControllerComponents, api: WebhooksApi) extends AbstractController(cc) {
  /**
    * POST /api/v1/zulip-outgoing-webhook
    */
  def zulipOutgoingWebhooks(): Action[AnyContent] = Action { request =>
    def executeApi(): InlineResponse200 = {
      api.zulipOutgoingWebhooks()
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
