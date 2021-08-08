package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AnyType
import org.openapitools.models.CodedError
import java.io.File
import org.openapitools.models.InvalidMessageError
import org.openapitools.models.JsonSuccess
import org.openapitools.models.JsonSuccessBase
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

object MessagesApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        addReaction(da) :+:
        checkMessagesMatchNarrow(da) :+:
        deleteMessage(da) :+:
        getFileTemporaryUrl(da) :+:
        getMessageHistory(da) :+:
        getMessages(da) :+:
        getRawMessage(da) :+:
        markAllAsRead(da) :+:
        markStreamAsRead(da) :+:
        markTopicAsRead(da) :+:
        removeReaction(da) :+:
        renderMessage(da) :+:
        sendMessage(da) :+:
        updateMessage(da) :+:
        updateMessageFlags(da) :+:
        uploadFile(da)


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
        private def addReaction(da: DataAccessor): Endpoint[JsonSuccess] =
        post("messages" :: int :: "reactions" :: param("emoji_name") :: paramOption("emoji_code") :: paramOption("reaction_type")) { (messageId: Int, emojiName: String, emojiCode: Option[String], reactionType: Option[String]) =>
          da.Messages_addReaction(messageId, emojiName, emojiCode, reactionType) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AnyType
        */
        private def checkMessagesMatchNarrow(da: DataAccessor): Endpoint[AnyType] =
        get("messages" :: "matches_narrow" :: params("msg_ids") :: params("narrow")) { (msgIds: Seq[Int], narrow: Seq[Object]) =>
          da.Messages_checkMessagesMatchNarrow(msgIds, narrow) match {
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
        private def deleteMessage(da: DataAccessor): Endpoint[JsonSuccess] =
        delete("messages" :: int) { (messageId: Int) =>
          da.Messages_deleteMessage(messageId) match {
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
        private def getFileTemporaryUrl(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("user_uploads" :: int :: string) { (realmIdStr: Int, filename: String) =>
          da.Messages_getFileTemporaryUrl(realmIdStr, filename) match {
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
        private def getMessageHistory(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("messages" :: int :: "history") { (messageId: Int) =>
          da.Messages_getMessageHistory(messageId) match {
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
        private def getMessages(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("messages" :: param("num_before").map(_.toInt) :: param("num_after").map(_.toInt) :: paramOption("anchor").map(_.map(_.toOneOf<string,integer>)) :: params("narrow") :: paramOption("client_gravatar").map(_.map(_.toBoolean)) :: paramOption("apply_markdown").map(_.map(_.toBoolean)) :: paramOption("use_first_unread_anchor").map(_.map(_.toBoolean))) { (numBefore: Int, numAfter: Int, anchor: Option[OneOf<string,integer>], narrow: Seq[Object], clientGravatar: Option[Boolean], applyMarkdown: Option[Boolean], useFirstUnreadAnchor: Option[Boolean]) =>
          da.Messages_getMessages(numBefore, numAfter, anchor, narrow, clientGravatar, applyMarkdown, useFirstUnreadAnchor) match {
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
        private def getRawMessage(da: DataAccessor): Endpoint[JsonSuccessBase] =
        get("messages" :: int) { (messageId: Int) =>
          da.Messages_getRawMessage(messageId) match {
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
        private def markAllAsRead(da: DataAccessor): Endpoint[JsonSuccess] =
        post("mark_all_as_read") { () =>
          da.Messages_markAllAsRead() match {
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
        private def markStreamAsRead(da: DataAccessor): Endpoint[JsonSuccess] =
        post("mark_stream_as_read" :: param("stream_id").map(_.toInt)) { (streamId: Int) =>
          da.Messages_markStreamAsRead(streamId) match {
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
        private def markTopicAsRead(da: DataAccessor): Endpoint[JsonSuccess] =
        post("mark_topic_as_read" :: param("stream_id").map(_.toInt) :: param("topic_name")) { (streamId: Int, topicName: String) =>
          da.Messages_markTopicAsRead(streamId, topicName) match {
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
        private def removeReaction(da: DataAccessor): Endpoint[JsonSuccess] =
        delete("messages" :: int :: "reactions" :: paramOption("emoji_name") :: paramOption("emoji_code") :: paramOption("reaction_type")) { (messageId: Int, emojiName: Option[String], emojiCode: Option[String], reactionType: Option[String]) =>
          da.Messages_removeReaction(messageId, emojiName, emojiCode, reactionType) match {
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
        private def renderMessage(da: DataAccessor): Endpoint[JsonSuccessBase] =
        post("messages" :: "render" :: param("content")) { (content: String) =>
          da.Messages_renderMessage(content) match {
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
        private def sendMessage(da: DataAccessor): Endpoint[JsonSuccessBase] =
        post("messages" :: param("type") :: params("to") :: param("content") :: paramOption("topic") :: paramOption("queue_id") :: paramOption("local_id")) { (_type: String, to: Seq[Int], content: String, topic: Option[String], queueId: Option[String], localId: Option[String]) =>
          da.Messages_sendMessage(_type, to, content, topic, queueId, localId) match {
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
        private def updateMessage(da: DataAccessor): Endpoint[JsonSuccess] =
        patch("messages" :: int :: paramOption("topic") :: paramOption("propagate_mode") :: paramOption("send_notification_to_old_thread").map(_.map(_.toBoolean)) :: paramOption("send_notification_to_new_thread").map(_.map(_.toBoolean)) :: paramOption("content") :: paramOption("stream_id").map(_.map(_.toInt))) { (messageId: Int, topic: Option[String], propagateMode: Option[String], sendNotificationToOldThread: Option[Boolean], sendNotificationToNewThread: Option[Boolean], content: Option[String], streamId: Option[Int]) =>
          da.Messages_updateMessage(messageId, topic, propagateMode, sendNotificationToOldThread, sendNotificationToNewThread, content, streamId) match {
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
        private def updateMessageFlags(da: DataAccessor): Endpoint[JsonSuccessBase] =
        post("messages" :: "flags" :: params("messages") :: param("op") :: param("flag")) { (messages: Seq[Int], op: String, flag: String) =>
          da.Messages_updateMessageFlags(messages, op, flag) match {
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
        private def uploadFile(da: DataAccessor): Endpoint[JsonSuccessBase] =
        post("user_uploads" :: fileUpload("filename")) { (filename: FileUpload) =>
          da.Messages_uploadFile(filename) match {
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
      val file = Files.createTempFile("tmpMessagesApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
