package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CodedError
import model.Draft
import model.JsonError
import model.JsonSuccess

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-10T11:47:30.086135Z[Etc/UTC]")
@Singleton
class DraftsApiController @Inject()(cc: ControllerComponents, api: DraftsApi) extends AbstractController(cc) {
  /**
    * POST /api/v1/drafts?drafts=[value]
    */
  def createDrafts(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val drafts = request.queryString.get("drafts")
        .map(_.toList)
        .map(_.map(value => )
      api.createDrafts(drafts)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/v1/drafts/:draftId
    * @param draftId The ID of the draft you want to delete. 
    */
  def deleteDraft(draftId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      api.deleteDraft(draftId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /api/v1/drafts/:draftId?draft=[value]
    * @param draftId The ID of the draft to be edited. 
    */
  def editDraft(draftId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val draft = request.getQueryString("draft")
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("draft", "query string")
        }
      api.editDraft(draftId, draft)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/drafts
    */
  def getDrafts(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      api.getDrafts()
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
