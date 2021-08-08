/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api

import java.text.SimpleDateFormat

import org.openapitools.client.model.CodedError
import org.openapitools.client.model.Draft
import org.openapitools.client.model.JsonError
import org.openapitools.client.model.JsonSuccess
import org.openapitools.client.{ApiInvoker, ApiException}

import collection.mutable
import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart
import com.wordnik.swagger.client._
import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._
import javax.ws.rs.core.Response.Status.Family

import java.net.URI
import java.io.File
import java.util.Date
import java.util.TimeZone
import javax.ws.rs.core.{MediaType, Response}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.collection.mutable.HashMap
import scala.util.{Failure, Success, Try}

import org.json4s._

class DraftsApi(
  val defBasePath: String = "https://example.zulipchat.com/api/v1",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new DraftsApiAsyncHelper(client, config)

  /**
   * Create drafts
   * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 
   *
   * @param drafts A JSON-encoded list of containing new draft objects.  (optional, default to new ListBuffer[Draft]() )
   * @return JsonSuccess
   */
  def createDrafts(drafts: Option[List[Draft]] = None): Option[JsonSuccess] = {
    val await = Try(Await.result(createDraftsAsync(drafts), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create drafts asynchronously
   * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 
   *
   * @param drafts A JSON-encoded list of containing new draft objects.  (optional, default to new ListBuffer[Draft]() )
   * @return Future(JsonSuccess)
   */
  def createDraftsAsync(drafts: Option[List[Draft]] = None): Future[JsonSuccess] = {
      helper.createDrafts(drafts)
  }

  /**
   * Delete a draft
   * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 
   *
   * @param draftId The ID of the draft you want to delete.  
   * @return JsonSuccess
   */
  def deleteDraft(draftId: Integer): Option[JsonSuccess] = {
    val await = Try(Await.result(deleteDraftAsync(draftId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete a draft asynchronously
   * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 
   *
   * @param draftId The ID of the draft you want to delete.  
   * @return Future(JsonSuccess)
   */
  def deleteDraftAsync(draftId: Integer): Future[JsonSuccess] = {
      helper.deleteDraft(draftId)
  }

  /**
   * Edit a draft
   * Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 
   *
   * @param draftId The ID of the draft to be edited.  
   * @param draft A JSON-encoded object containing a replacement draft object for this ID.  
   * @return JsonSuccess
   */
  def editDraft(draftId: Integer, draft: Draft): Option[JsonSuccess] = {
    val await = Try(Await.result(editDraftAsync(draftId, draft), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Edit a draft asynchronously
   * Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 
   *
   * @param draftId The ID of the draft to be edited.  
   * @param draft A JSON-encoded object containing a replacement draft object for this ID.  
   * @return Future(JsonSuccess)
   */
  def editDraftAsync(draftId: Integer, draft: Draft): Future[JsonSuccess] = {
      helper.editDraft(draftId, draft)
  }

  /**
   * Get drafts
   * Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 
   *
   * @return JsonSuccess
   */
  def getDrafts(): Option[JsonSuccess] = {
    val await = Try(Await.result(getDraftsAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get drafts asynchronously
   * Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 
   *
   * @return Future(JsonSuccess)
   */
  def getDraftsAsync(): Future[JsonSuccess] = {
      helper.getDrafts()
  }

}

class DraftsApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createDrafts(drafts: Option[List[Draft]] = None
    )(implicit reader: ClientResponseReader[JsonSuccess]): Future[JsonSuccess] = {
    // create path and map variables
    val path = (addFmt("/drafts"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    drafts match {
      case Some(param) => queryParams += "drafts" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      val status = Response.Status.fromStatusCode(resp.statusCode)
      status.getFamily match {
        case Family.SUCCESSFUL | Family.REDIRECTION | Family.INFORMATIONAL => process(reader.read(resp))
        case _ => throw new ApiException(resp.statusCode, resp.statusText)
      }
    }
  }

  def deleteDraft(draftId: Integer)(implicit reader: ClientResponseReader[JsonSuccess]): Future[JsonSuccess] = {
    // create path and map variables
    val path = (addFmt("/drafts/{draft_id}")
      replaceAll("\\{" + "draft_id" + "\\}", draftId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      val status = Response.Status.fromStatusCode(resp.statusCode)
      status.getFamily match {
        case Family.SUCCESSFUL | Family.REDIRECTION | Family.INFORMATIONAL => process(reader.read(resp))
        case _ => throw new ApiException(resp.statusCode, resp.statusText)
      }
    }
  }

  def editDraft(draftId: Integer,
    draft: Draft)(implicit reader: ClientResponseReader[JsonSuccess]): Future[JsonSuccess] = {
    // create path and map variables
    val path = (addFmt("/drafts/{draft_id}")
      replaceAll("\\{" + "draft_id" + "\\}", draftId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (draft == null) throw new Exception("Missing required parameter 'draft' when calling DraftsApi->editDraft")
    queryParams += "draft" -> draft.toString

    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      val status = Response.Status.fromStatusCode(resp.statusCode)
      status.getFamily match {
        case Family.SUCCESSFUL | Family.REDIRECTION | Family.INFORMATIONAL => process(reader.read(resp))
        case _ => throw new ApiException(resp.statusCode, resp.statusText)
      }
    }
  }

  def getDrafts()(implicit reader: ClientResponseReader[JsonSuccess]): Future[JsonSuccess] = {
    // create path and map variables
    val path = (addFmt("/drafts"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      val status = Response.Status.fromStatusCode(resp.statusCode)
      status.getFamily match {
        case Family.SUCCESSFUL | Family.REDIRECTION | Family.INFORMATIONAL => process(reader.read(resp))
        case _ => throw new ApiException(resp.statusCode, resp.statusText)
      }
    }
  }


}