package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import java.io.File
import org.openapitools.models.JsonSuccess
import org.openapitools.models.JsonSuccessBase
import io.finch.circe._
import io.circe.generic.semiauto._
import com.twitter.concurrent.AsyncStream
import com.twitter.finagle.Service
import com.twitter.finagle.Http
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}
import com.twitter.util.Future
import com.twitter.io.Buf
import io.finch._, items._
import java.io.File
import java.nio.file.Files
import java.time._

object ServerAndOrganizationsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        addCodePlayground(da) :+:
        addLinkifier(da) :+:
        createCustomProfileField(da) :+:
        getCustomEmoji(da) :+:
        getCustomProfileFields(da) :+:
        getLinkifiers(da) :+:
        getServerSettings(da) :+:
        removeCodePlayground(da) :+:
        removeLinkifier(da) :+:
        reorderCustomProfileFields(da) :+:
        updateLinkifier(da) :+:
        uploadCustomEmoji(da)


    private def checkError(e: CommonError) = e match {
      case InvalidInput(_) => BadRequest(e)
      case MissingIdentifier(_) => BadRequest(e)
      case RecordNotFound(_) => NotFound(e)
      case _ => InternalServerError(e)
    }

    implicit class StringOps(s: String) {

      import java.time.format.DateTimeFormatter

      lazy val localformatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
      lazy val datetimeformatter: DateTimeFormatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

      def toLocalDateTime: LocalDateTime = LocalDateTime.parse(s,localformatter)
      def toZonedDateTime: ZonedDateTime = ZonedDateTime.parse(s, datetimeformatter)

    }

        /**
        * 
        * @return An endpoint representing a JsonSuccessBase
        */
        private def addCodePlayground(da: DataAccessor): Endpoint[JsonSuccessBase] =
        post("realm" :: "playgrounds" :: param("name") :: param("pygments_language") :: param("url_prefix")) { (name: String, pygmentsLanguage: String, urlPrefix: String) =>
          da.ServerAndOrganizations_addCodePlayground(name, pygmentsLanguage, urlPrefix) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccessBase
        */
        private def addLinkifier(da: DataAccessor): Endpoint[JsonSuccessBase] =
        post("realm" :: "filters" :: param("pattern") :: param("url_format_string")) { (pattern: String, urlFormatString: String) =>
          da.ServerAndOrganizations_addLinkifier(pattern, urlFormatString) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccessBase
        */
        private def createCustomProfileField(da: DataAccessor): Endpoint[JsonSuccessBase] =
        post("realm" :: "profile_fields" :: param("field_type").map(_.toInt) :: paramOption("name") :: paramOption("hint") :: paramOption("field_data").map(_.map(_.toObject))) { (fieldType: Int, name: Option[String], hint: Option[String], fieldData: Option[Object]) =>
          da.ServerAndOrganizations_createCustomProfileField(fieldType, name, hint, fieldData) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccessBase
        */
        private def getCustomEmoji(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("realm" :: "emoji") { () =>
          da.ServerAndOrganizations_getCustomEmoji() match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccessBase
        */
        private def getCustomProfileFields(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("realm" :: "profile_fields") { () =>
          da.ServerAndOrganizations_getCustomProfileFields() match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccessBase
        */
        private def getLinkifiers(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("realm" :: "linkifiers") { () =>
          da.ServerAndOrganizations_getLinkifiers() match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccessBase
        */
        private def getServerSettings(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("server_settings") { () =>
          da.ServerAndOrganizations_getServerSettings() match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccess
        */
        private def removeCodePlayground(da: DataAccessor): Endpoint[JsonSuccess] =
        delete("realm" :: "playgrounds" :: int) { (playgroundId: Int) =>
          da.ServerAndOrganizations_removeCodePlayground(playgroundId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccess
        */
        private def removeLinkifier(da: DataAccessor): Endpoint[JsonSuccess] =
        delete("realm" :: "filters" :: int) { (filterId: Int) =>
          da.ServerAndOrganizations_removeLinkifier(filterId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccess
        */
        private def reorderCustomProfileFields(da: DataAccessor): Endpoint[JsonSuccess] =
        patch("realm" :: "profile_fields" :: params("order")) { (order: Seq[Int]) =>
          da.ServerAndOrganizations_reorderCustomProfileFields(order) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccess
        */
        private def updateLinkifier(da: DataAccessor): Endpoint[JsonSuccess] =
        patch("realm" :: "filters" :: int :: param("pattern") :: param("url_format_string")) { (filterId: Int, pattern: String, urlFormatString: String) =>
          da.ServerAndOrganizations_updateLinkifier(filterId, pattern, urlFormatString) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a JsonSuccess
        */
        private def uploadCustomEmoji(da: DataAccessor): Endpoint[JsonSuccess] =
        post("realm" :: "emoji" :: string :: fileUpload("filename")) { (emojiName: String, filename: FileUpload) =>
          da.ServerAndOrganizations_uploadCustomEmoji(emojiName, filename) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }


    implicit private def fileUploadToFile(fileUpload: FileUpload) : File = {
      fileUpload match {
        case upload: InMemoryFileUpload =>
          bytesToFile(Buf.ByteArray.Owned.extract(upload.content))
        case upload: OnDiskFileUpload =>
          upload.content
        case _ => null
      }
    }

    private def bytesToFile(input: Array[Byte]): java.io.File = {
      val file = Files.createTempFile("tmpServerAndOrganizationsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
