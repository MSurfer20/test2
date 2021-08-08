package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.JsObject
import model.JsonSuccess
import model.JsonSuccessBase
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:42:55.656112Z[Etc/UTC]")
@Singleton
class ServerAndOrganizationsApiController @Inject()(cc: ControllerComponents, api: ServerAndOrganizationsApi) extends AbstractController(cc) {
  /**
    * POST /api/v1/realm/playgrounds?name=[value]&pygmentsLanguage=[value]&urlPrefix=[value]
    */
  def addCodePlayground(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
      val pygmentsLanguage = request.getQueryString("pygments_language")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("pygments_language", "query string")
        }
      val urlPrefix = request.getQueryString("url_prefix")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("url_prefix", "query string")
        }
      api.addCodePlayground(name, pygmentsLanguage, urlPrefix)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/realm/filters?pattern=[value]&urlFormatString=[value]
    */
  def addLinkifier(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val pattern = request.getQueryString("pattern")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("pattern", "query string")
        }
      val urlFormatString = request.getQueryString("url_format_string")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("url_format_string", "query string")
        }
      api.addLinkifier(pattern, urlFormatString)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/realm/profile_fields?name=[value]&hint=[value]&fieldType=[value]&fieldData=[value]
    */
  def createCustomProfileField(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val name = request.getQueryString("name")
        
      val hint = request.getQueryString("hint")
        
      val fieldType = request.getQueryString("field_type")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("field_type", "query string")
        }
      val fieldData = request.getQueryString("field_data")
        .map(value => )
      api.createCustomProfileField(fieldType, name, hint, fieldData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/realm/emoji
    */
  def getCustomEmoji(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      api.getCustomEmoji()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/realm/profile_fields
    */
  def getCustomProfileFields(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      api.getCustomProfileFields()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/realm/linkifiers
    */
  def getLinkifiers(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      api.getLinkifiers()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/server_settings
    */
  def getServerSettings(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      api.getServerSettings()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/v1/realm/playgrounds/:playgroundId
    * @param playgroundId The ID of the playground that you want to remove. 
    */
  def removeCodePlayground(playgroundId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      api.removeCodePlayground(playgroundId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/v1/realm/filters/:filterId
    * @param filterId The ID of the linkifier that you want to remove. 
    */
  def removeLinkifier(filterId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      api.removeLinkifier(filterId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /api/v1/realm/profile_fields?order=[value]
    */
  def reorderCustomProfileFields(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val order = request.queryString.get("order")
        .map(_.toList)
        .map(_.map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("order", "query string")
        }
      api.reorderCustomProfileFields(order)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /api/v1/realm/filters/:filterId?pattern=[value]&urlFormatString=[value]
    * @param filterId The ID of the linkifier that you want to update. 
    */
  def updateLinkifier(filterId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val pattern = request.getQueryString("pattern")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("pattern", "query string")
        }
      val urlFormatString = request.getQueryString("url_format_string")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("url_format_string", "query string")
        }
      api.updateLinkifier(filterId, pattern, urlFormatString)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/realm/emoji/:emojiName
    * @param emojiName The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). 
    */
  def uploadCustomEmoji(emojiName: String): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val filename = request.body.asMultipartFormData.flatMap(_.file("filename").map(_.ref: TemporaryFile))
        
      api.uploadCustomEmoji(emojiName, filename)
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
