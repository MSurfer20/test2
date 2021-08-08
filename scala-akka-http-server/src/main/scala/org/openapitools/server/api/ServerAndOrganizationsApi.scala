package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.StringDirectives
import org.openapitools.server.MultipartDirectives
import org.openapitools.server.FileField
import org.openapitools.server.PartsAndFiles
import java.io.File
import org.openapitools.server.model.JsonSuccess
import org.openapitools.server.model.JsonSuccessBase
import scala.util.Try
import akka.http.scaladsl.server.MalformedRequestContentRejection
import akka.http.scaladsl.server.directives.FileInfo


class ServerAndOrganizationsApi(
    serverAndOrganizationsService: ServerAndOrganizationsApiService,
    serverAndOrganizationsMarshaller: ServerAndOrganizationsApiMarshaller
)  extends MultipartDirectives with StringDirectives {

  
  import serverAndOrganizationsMarshaller._

  lazy val route: Route =
    path("realm" / "playgrounds") { 
      post { 
        parameters("name".as[String], "pygments_language".as[String], "url_prefix".as[String]) { (name, pygmentsLanguage, urlPrefix) => 
            serverAndOrganizationsService.addCodePlayground(name = name, pygmentsLanguage = pygmentsLanguage, urlPrefix = urlPrefix)
        }
      }
    } ~
    path("realm" / "filters") { 
      post { 
        parameters("pattern".as[String], "url_format_string".as[String]) { (pattern, urlFormatString) => 
            serverAndOrganizationsService.addLinkifier(pattern = pattern, urlFormatString = urlFormatString)
        }
      }
    } ~
    path("realm" / "profile_fields") { 
      post { 
        parameters("name".as[String].?, "hint".as[String].?, "field_type".as[Int], "field_data".as[String].?) { (name, hint, fieldType, fieldData) => 
            serverAndOrganizationsService.createCustomProfileField(fieldType = fieldType, name = name, hint = hint, fieldData = fieldData)
        }
      }
    } ~
    path("realm" / "emoji") { 
      get {  
            serverAndOrganizationsService.getCustomEmoji()
      }
    } ~
    path("realm" / "profile_fields") { 
      get {  
            serverAndOrganizationsService.getCustomProfileFields()
      }
    } ~
    path("realm" / "linkifiers") { 
      get {  
            serverAndOrganizationsService.getLinkifiers()
      }
    } ~
    path("server_settings") { 
      get {  
            serverAndOrganizationsService.getServerSettings()
      }
    } ~
    path("realm" / "playgrounds" / IntNumber) { (playgroundId) => 
      delete {  
            serverAndOrganizationsService.removeCodePlayground(playgroundId = playgroundId)
      }
    } ~
    path("realm" / "filters" / IntNumber) { (filterId) => 
      delete {  
            serverAndOrganizationsService.removeLinkifier(filterId = filterId)
      }
    } ~
    path("realm" / "profile_fields") { 
      patch { 
        parameters("order".as[String]) { (order) => 
            serverAndOrganizationsService.reorderCustomProfileFields(order = order)
        }
      }
    } ~
    path("realm" / "filters" / IntNumber) { (filterId) => 
      patch { 
        parameters("pattern".as[String], "url_format_string".as[String]) { (pattern, urlFormatString) => 
            serverAndOrganizationsService.updateLinkifier(filterId = filterId, pattern = pattern, urlFormatString = urlFormatString)
        }
      }
    } ~
    path("realm" / "emoji" / Segment) { (emojiName) => 
      post {  
        formAndFiles(FileField("filename")) { partsAndFiles => 
          val _____ : Try[Route] = for {
            filename <- optToTry(partsAndFiles.files.get("filename"), s"File filename missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
              serverAndOrganizationsService.uploadCustomEmoji(emojiName = emojiName, filename = filename)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
      }
    }
}


trait ServerAndOrganizationsApiService {

  def addCodePlayground200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def addCodePlayground(name: String, pygmentsLanguage: String, urlPrefix: String)
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def addLinkifier200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def addLinkifier(pattern: String, urlFormatString: String)
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def createCustomProfileField200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def createCustomProfileField(fieldType: Int, name: Option[String], hint: Option[String], fieldData: Option[String])
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def getCustomEmoji200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def getCustomEmoji()
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def getCustomProfileFields200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def getCustomProfileFields()
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def getLinkifiers200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def getLinkifiers()
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def getServerSettings200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def getServerSettings()
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def removeCodePlayground200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   */
  def removeCodePlayground(playgroundId: Int)
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route

  def removeLinkifier200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   */
  def removeLinkifier(filterId: Int)
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route

  def reorderCustomProfileFields200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   */
  def reorderCustomProfileFields(order: String)
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route

  def updateLinkifier200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   */
  def updateLinkifier(filterId: Int, pattern: String, urlFormatString: String)
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route

  def uploadCustomEmoji200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   */
  def uploadCustomEmoji(emojiName: String, filename: (FileInfo, File))
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route

}

trait ServerAndOrganizationsApiMarshaller {


  implicit def toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]

  implicit def toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]

}

