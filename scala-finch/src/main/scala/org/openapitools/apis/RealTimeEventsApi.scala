package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.BadEventQueueIdError
import org.openapitools.models.JsonSuccess
import org.openapitools.models.JsonSuccessBase
import org.openapitools.models.OneOf&lt;InvalidApiKeyError,MissingArgumentError,UserNotAuthorizedError&gt;
import org.openapitools.models.OneOf&lt;RateLimitedError&gt;
import org.openapitools.models.OneOf&lt;UserDeactivatedError,RealmDeactivatedError&gt;
import scala.collection.immutable.Seq
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

object RealTimeEventsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        deleteQueue(da) :+:
        getEvents(da) :+:
        realTimePost(da) :+:
        registerQueue(da) :+:
        restErrorHandling(da)


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
        * @return An endpoint representing a JsonSuccess
        */
        private def deleteQueue(da: DataAccessor): Endpoint[JsonSuccess] =
        delete("events" :: param("queue_id")) { (queueId: String) =>
          da.RealTimeEvents_deleteQueue(queueId) match {
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
        private def getEvents(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("events" :: param("queue_id") :: paramOption("last_event_id").map(_.map(_.toInt)) :: paramOption("dont_block").map(_.map(_.toBoolean))) { (queueId: String, lastEventId: Option[Int], dontBlock: Option[Boolean]) =>
          da.RealTimeEvents_getEvents(queueId, lastEventId, dontBlock) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Unit
        */
        private def realTimePost(da: DataAccessor): Endpoint[Unit] =
        post("real-time" :: params("event_types") :: params("narrow") :: paramOption("all_public_streams").map(_.map(_.toBoolean))) { (eventTypes: Seq[String], narrow: Seq[Seq[String]], allPublicStreams: Option[Boolean]) =>
          da.RealTimeEvents_realTimePost(eventTypes, narrow, allPublicStreams) match {
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
        private def registerQueue(da: DataAccessor): Endpoint[JsonSuccessBase] =
        post("register" :: paramOption("apply_markdown").map(_.map(_.toBoolean)) :: paramOption("client_gravatar").map(_.map(_.toBoolean)) :: paramOption("slim_presence").map(_.map(_.toBoolean)) :: params("event_types") :: paramOption("all_public_streams").map(_.map(_.toBoolean)) :: paramOption("include_subscribers").map(_.map(_.toBoolean)) :: paramOption("client_capabilities").map(_.map(_.toObject)) :: params("fetch_event_types") :: params("narrow")) { (applyMarkdown: Option[Boolean], clientGravatar: Option[Boolean], slimPresence: Option[Boolean], eventTypes: Seq[String], allPublicStreams: Option[Boolean], includeSubscribers: Option[Boolean], clientCapabilities: Option[Object], fetchEventTypes: Seq[String], narrow: Seq[Seq[String]]) =>
          da.RealTimeEvents_registerQueue(applyMarkdown, clientGravatar, slimPresence, eventTypes, allPublicStreams, includeSubscribers, clientCapabilities, fetchEventTypes, narrow) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Unit
        */
        private def restErrorHandling(da: DataAccessor): Endpoint[Unit] =
        post("rest-error-handling") { () =>
          da.RealTimeEvents_restErrorHandling() match {
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
      val file = Files.createTempFile("tmpRealTimeEventsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
