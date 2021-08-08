/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */


package org.openapitools.server.api

import org.openapitools.server.model.CodedError
import org.openapitools.server.model.Draft
import org.openapitools.server.model.JsonError
import org.openapitools.server.model.JsonSuccess

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class DraftsApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "DraftsApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val createDraftsOperation = (apiOperation[JsonSuccess]("createDrafts")
    summary "Create drafts"
    parameters(queryParam[List[Draft]]("drafts").description("").optional.defaultValue(List.empty[Draft] ))
  )

  post("/drafts", operation(createDraftsOperation)) {
        val draftsString = params.getAs[String]("drafts")
    val drafts = if("multi" == "default" || "multi" == "csv") {
      draftsString match {
        case Some(str) => str.split(",").toSeq
        case None => Seq()
      }
    } else
      Seq()

    //println("drafts: " + drafts)
  }

  

  val deleteDraftOperation = (apiOperation[JsonSuccess]("deleteDraft")
    summary "Delete a draft"
    parameters(pathParam[Int]("draftId").description(""))
  )

  delete("/drafts/:draft_id", operation(deleteDraftOperation)) {
    val draftId = params.getOrElse("draftId", halt(400))
    //println("draftId: " + draftId)
  }

  

  val editDraftOperation = (apiOperation[JsonSuccess]("editDraft")
    summary "Edit a draft"
    parameters(pathParam[Int]("draftId").description(""), queryParam[Draft]("draft").description(""))
  )

  patch("/drafts/:draft_id", operation(editDraftOperation)) {
    val draftId = params.getOrElse("draftId", halt(400))
    //println("draftId: " + draftId)
            val draft = params.getAs[Draft]("draft")

    //println("draft: " + draft)
  }

  

  val getDraftsOperation = (apiOperation[JsonSuccess]("getDrafts")
    summary "Get drafts"
    parameters()
  )

  get("/drafts", operation(getDraftsOperation)) {
  }

}
