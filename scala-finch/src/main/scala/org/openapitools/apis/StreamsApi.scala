package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.CodedError
import org.openapitools.models.JsonError
import org.openapitools.models.JsonSuccess
import org.openapitools.models.JsonSuccessBase
import org.openapitools.models.NonExistingStreamError
import org.openapitools.models.OneOf&lt;object,object&gt;
import org.openapitools.models.OneOf&lt;string,integer&gt;
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

object StreamsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        archiveStream(da) :+:
        createBigBlueButtonVideoCall(da) :+:
        deleteTopic(da) :+:
        getStreamId(da) :+:
        getStreamTopics(da) :+:
        getStreams(da) :+:
        getSubscribers(da) :+:
        getSubscriptionStatus(da) :+:
        getSubscriptions(da) :+:
        muteTopic(da) :+:
        subscribe(da) :+:
        unsubscribe(da) :+:
        updateStream(da) :+:
        updateSubscriptionSettings(da) :+:
        updateSubscriptions(da)


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
        private def archiveStream(da: DataAccessor): Endpoint[JsonSuccess] =
        delete("streams" :: int) { (streamId: Int) =>
          da.Streams_archiveStream(streamId) match {
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
        private def createBigBlueButtonVideoCall(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("calls" :: "bigbluebutton" :: "create") { () =>
          da.Streams_createBigBlueButtonVideoCall() match {
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
        private def deleteTopic(da: DataAccessor): Endpoint[JsonSuccess] =
        post("streams" :: int :: "delete_topic" :: param("topic_name")) { (streamId: Int, topicName: String) =>
          da.Streams_deleteTopic(streamId, topicName) match {
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
        private def getStreamId(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("get_stream_id" :: param("stream")) { (stream: String) =>
          da.Streams_getStreamId(stream) match {
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
        private def getStreamTopics(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("users" :: "me" :: int :: "topics") { (streamId: Int) =>
          da.Streams_getStreamTopics(streamId) match {
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
        private def getStreams(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("streams" :: paramOption("include_public").map(_.map(_.toBoolean)) :: paramOption("include_web_public").map(_.map(_.toBoolean)) :: paramOption("include_subscribed").map(_.map(_.toBoolean)) :: paramOption("include_all_active").map(_.map(_.toBoolean)) :: paramOption("include_default").map(_.map(_.toBoolean)) :: paramOption("include_owner_subscribed").map(_.map(_.toBoolean))) { (includePublic: Option[Boolean], includeWebPublic: Option[Boolean], includeSubscribed: Option[Boolean], includeAllActive: Option[Boolean], includeDefault: Option[Boolean], includeOwnerSubscribed: Option[Boolean]) =>
          da.Streams_getStreams(includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed) match {
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
        private def getSubscribers(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("streams" :: int :: "members") { (streamId: Int) =>
          da.Streams_getSubscribers(streamId) match {
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
        private def getSubscriptionStatus(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("users" :: int :: "subscriptions" :: int) { (userId: Int, streamId: Int) =>
          da.Streams_getSubscriptionStatus(userId, streamId) match {
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
        private def getSubscriptions(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("users" :: "me" :: "subscriptions" :: paramOption("include_subscribers").map(_.map(_.toBoolean))) { (includeSubscribers: Option[Boolean]) =>
          da.Streams_getSubscriptions(includeSubscribers) match {
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
        private def muteTopic(da: DataAccessor): Endpoint[JsonSuccess] =
        patch("users" :: "me" :: "subscriptions" :: "muted_topics" :: param("topic") :: param("op") :: paramOption("stream") :: paramOption("stream_id").map(_.map(_.toInt))) { (topic: String, op: String, stream: Option[String], streamId: Option[Int]) =>
          da.Streams_muteTopic(topic, op, stream, streamId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a OneOf&lt;object,object&gt;
        */
        private def subscribe(da: DataAccessor): Endpoint[OneOf&lt;object,object&gt;] =
        post("users" :: "me" :: "subscriptions" :: params("subscriptions") :: params("principals") :: paramOption("authorization_errors_fatal").map(_.map(_.toBoolean)) :: paramOption("announce").map(_.map(_.toBoolean)) :: paramOption("invite_only").map(_.map(_.toBoolean)) :: paramOption("history_public_to_subscribers").map(_.map(_.toBoolean)) :: paramOption("stream_post_policy").map(_.map(_.toInt)) :: paramOption("message_retention_days").map(_.map(_.toOneOf<string,integer>))) { (subscriptions: Seq[Object], principals: Seq[OneOf<string,integer>], authorizationErrorsFatal: Option[Boolean], announce: Option[Boolean], inviteOnly: Option[Boolean], historyPublicToSubscribers: Option[Boolean], streamPostPolicy: Option[Int], messageRetentionDays: Option[OneOf<string,integer>]) =>
          da.Streams_subscribe(subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays) match {
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
        private def unsubscribe(da: DataAccessor): Endpoint[JsonSuccessBase] =
        delete("users" :: "me" :: "subscriptions" :: params("subscriptions") :: params("principals")) { (subscriptions: Seq[String], principals: Seq[OneOf<string,integer>]) =>
          da.Streams_unsubscribe(subscriptions, principals) match {
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
        private def updateStream(da: DataAccessor): Endpoint[JsonSuccess] =
        patch("streams" :: int :: paramOption("description") :: paramOption("new_name") :: paramOption("is_private").map(_.map(_.toBoolean)) :: paramOption("is_announcement_only").map(_.map(_.toBoolean)) :: paramOption("stream_post_policy").map(_.map(_.toInt)) :: paramOption("history_public_to_subscribers").map(_.map(_.toBoolean)) :: paramOption("message_retention_days").map(_.map(_.toOneOf<string,integer>))) { (streamId: Int, description: Option[String], newName: Option[String], isPrivate: Option[Boolean], isAnnouncementOnly: Option[Boolean], streamPostPolicy: Option[Int], historyPublicToSubscribers: Option[Boolean], messageRetentionDays: Option[OneOf<string,integer>]) =>
          da.Streams_updateStream(streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays) match {
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
        private def updateSubscriptionSettings(da: DataAccessor): Endpoint[JsonSuccessBase] =
        post("users" :: "me" :: "subscriptions" :: "properties" :: params("subscription_data")) { (subscriptionData: Seq[Object]) =>
          da.Streams_updateSubscriptionSettings(subscriptionData) match {
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
        private def updateSubscriptions(da: DataAccessor): Endpoint[JsonSuccessBase] =
        patch("users" :: "me" :: "subscriptions" :: params("delete") :: params("add")) { (delete: Seq[String], add: Seq[Object]) =>
          da.Streams_updateSubscriptions(delete, add) match {
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
      val file = Files.createTempFile("tmpStreamsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
