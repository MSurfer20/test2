package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.CodedError
import org.openapitools.server.model.Draft
import org.openapitools.server.model.JsonError
import org.openapitools.server.model.JsonSuccess


class DraftsApi(
    draftsService: DraftsApiService,
    draftsMarshaller: DraftsApiMarshaller
) {

  
  import draftsMarshaller._

  lazy val route: Route =
    path("drafts") { 
      post { 
        parameters("drafts".as[String].?("new ListBuffer[Draft]() ")) { (drafts) => 
            draftsService.createDrafts(drafts = drafts)
        }
      }
    } ~
    path("drafts" / IntNumber) { (draftId) => 
      delete {  
            draftsService.deleteDraft(draftId = draftId)
      }
    } ~
    path("drafts" / IntNumber) { (draftId) => 
      patch { 
        parameters("draft".as[String]) { (draft) => 
            draftsService.editDraft(draftId = draftId, draft = draft)
        }
      }
    } ~
    path("drafts") { 
      get {  
            draftsService.getDrafts()
      }
    }
}


trait DraftsApiService {

  def createDrafts200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def createDrafts400(responseCodedError: CodedError)(implicit toEntityMarshallerCodedError: ToEntityMarshaller[CodedError]): Route =
    complete((400, responseCodedError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 400, Message: Bad request., DataType: CodedError
   */
  def createDrafts(drafts: String)
      (implicit toEntityMarshallerCodedError: ToEntityMarshaller[CodedError], toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route

  def deleteDraft200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def deleteDraft404(responseJsonError: JsonError)(implicit toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route =
    complete((404, responseJsonError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 404, Message: Not Found., DataType: JsonError
   */
  def deleteDraft(draftId: Int)
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess], toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route

  def editDraft200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def editDraft404(responseJsonError: JsonError)(implicit toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route =
    complete((404, responseJsonError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 404, Message: Not Found., DataType: JsonError
   */
  def editDraft(draftId: Int, draft: String)
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess], toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]): Route

  def getDrafts200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   */
  def getDrafts()
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route

}

trait DraftsApiMarshaller {


  implicit def toEntityMarshallerCodedError: ToEntityMarshaller[CodedError]

  implicit def toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]

  implicit def toEntityMarshallerJsonError: ToEntityMarshaller[JsonError]

}

