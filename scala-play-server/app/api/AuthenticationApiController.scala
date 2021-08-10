package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ApiKeyResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-10T11:47:30.086135Z[Etc/UTC]")
@Singleton
class AuthenticationApiController @Inject()(cc: ControllerComponents, api: AuthenticationApi) extends AbstractController(cc) {
  /**
    * POST /api/v1/dev_fetch_api_key?username=[value]
    */
  def devFetchApiKey(): Action[AnyContent] = Action { request =>
    def executeApi(): ApiKeyResponse = {
      val username = request.getQueryString("username")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("username", "query string")
        }
      api.devFetchApiKey(username)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/fetch_api_key?username=[value]&password=[value]
    */
  def fetchApiKey(): Action[AnyContent] = Action { request =>
    def executeApi(): ApiKeyResponse = {
      val username = request.getQueryString("username")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("username", "query string")
        }
      val password = request.getQueryString("password")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("password", "query string")
        }
      api.fetchApiKey(username, password)
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
