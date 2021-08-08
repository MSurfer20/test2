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
import org.openapitools.server.model.AnyType
import org.openapitools.server.model.CodedError
import java.io.File
import org.openapitools.server.model.InvalidMessageError
import org.openapitools.server.model.JsonSuccess
import org.openapitools.server.model.JsonSuccessBase
import org.openapitools.server.model.OneOfobjectobject
import org.openapitools.server.model.OneOfstringinteger
import scala.util.Try
import akka.http.scaladsl.server.MalformedRequestContentRejection
import akka.http.scaladsl.server.directives.FileInfo


class MessagesApi(
    messagesService: MessagesApiService,
    messagesMarshaller: MessagesApiMarshaller
)  extends MultipartDirectives with StringDirectives {

  
  import messagesMarshaller._

  lazy val route: Route =
    path("messages" / IntNumber / "reactions") { (messageId) => 
      post { 
        parameters("emoji_name".as[String], "emoji_code".as[String].?, "reaction_type".as[String].?) { (emojiName, emojiCode, reactionType) => 
            messagesService.addReaction(messageId = messageId, emojiName = emojiName, emojiCode = emojiCode, reactionType = reactionType)
        }
      }
    } ~
    path("messages" / "matches_narrow") { 
      get { 
        parameters("msg_ids".as[String], "narrow".as[String]) { (msgIds, narrow) => 
            messagesService.checkMessagesMatchNarrow(msgIds = msgIds, narrow = narrow)
        }
      }
    } ~
    path("messages" / IntNumber) { (messageId) => 
      delete {  
            messagesService.deleteMessage(messageId = messageId)
      }
    } ~
    path("user_uploads" / IntNumber / Segment) { (realmIdStr, filename) => 
      get {  
            messagesService.getFileTemporaryUrl(realmIdStr = realmIdStr, filename = filename)
      }
    } ~
    path("messages" / IntNumber / "history") { (messageId) => 
      get {  
            messagesService.getMessageHistory(messageId = messageId)
      }
    } ~
    path("messages") { 
      get { 
        parameters("anchor".as[String].?, "num_before".as[Int], "num_after".as[Int], "narrow".as[String].?("[]"), "client_gravatar".as[Boolean].?(false), "apply_markdown".as[Boolean].?(true), "use_first_unread_anchor".as[Boolean].?(false)) { (anchor, numBefore, numAfter, narrow, clientGravatar, applyMarkdown, useFirstUnreadAnchor) => 
            messagesService.getMessages(numBefore = numBefore, numAfter = numAfter, anchor = anchor, narrow = narrow, clientGravatar = clientGravatar, applyMarkdown = applyMarkdown, useFirstUnreadAnchor = useFirstUnreadAnchor)
        }
      }
    } ~
    path("messages" / IntNumber) { (messageId) => 
      get {  
            messagesService.getRawMessage(messageId = messageId)
      }
    } ~
    path("mark_all_as_read") { 
      post {  
            messagesService.markAllAsRead()
      }
    } ~
    path("mark_stream_as_read") { 
      post { 
        parameters("stream_id".as[Int]) { (streamId) => 
            messagesService.markStreamAsRead(streamId = streamId)
        }
      }
    } ~
    path("mark_topic_as_read") { 
      post { 
        parameters("stream_id".as[Int], "topic_name".as[String]) { (streamId, topicName) => 
            messagesService.markTopicAsRead(streamId = streamId, topicName = topicName)
        }
      }
    } ~
    path("messages" / IntNumber / "reactions") { (messageId) => 
      delete { 
        parameters("emoji_name".as[String].?, "emoji_code".as[String].?, "reaction_type".as[String].?) { (emojiName, emojiCode, reactionType) => 
            messagesService.removeReaction(messageId = messageId, emojiName = emojiName, emojiCode = emojiCode, reactionType = reactionType)
        }
      }
    } ~
    path("messages" / "render") { 
      post { 
        parameters("content".as[String]) { (content) => 
            messagesService.renderMessage(content = content)
        }
      }
    } ~
    path("messages") { 
      post { 
        parameters("type".as[String], "to".as[String], "content".as[String], "topic".as[String].?, "queue_id".as[String].?, "local_id".as[String].?) { (`type`, to, content, topic, queueId, localId) => 
            messagesService.sendMessage(`type` = `type`, to = to, content = content, topic = topic, queueId = queueId, localId = localId)
        }
      }
    } ~
    path("messages" / IntNumber) { (messageId) => 
      patch { 
        parameters("topic".as[String].?, "propagate_mode".as[String].?("change_one"), "send_notification_to_old_thread".as[Boolean].?(true), "send_notification_to_new_thread".as[Boolean].?(true), "content".as[String].?, "stream_id".as[Int].?) { (topic, propagateMode, sendNotificationToOldThread, sendNotificationToNewThread, content, streamId) => 
            messagesService.updateMessage(messageId = messageId, topic = topic, propagateMode = propagateMode, sendNotificationToOldThread = sendNotificationToOldThread, sendNotificationToNewThread = sendNotificationToNewThread, content = content, streamId = streamId)
        }
      }
    } ~
    path("messages" / "flags") { 
      post { 
        parameters("messages".as[String], "op".as[String], "flag".as[String]) { (messages, op, flag) => 
            messagesService.updateMessageFlags(messages = messages, op = op, flag = flag)
        }
      }
    } ~
    path("user_uploads") { 
      post {  
        formAndFiles(FileField("filename")) { partsAndFiles => 
          val _____ : Try[Route] = for {
            filename <- optToTry(partsAndFiles.files.get("filename"), s"File filename missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
              messagesService.uploadFile(filename = filename)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
      }
    }
}


trait MessagesApiService {

  def addReaction200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def addReaction400(responseCodedError: CodedError)(implicit toEntityMarshallerCodedError: ToEntityMarshaller[CodedError]): Route =
    complete((400, responseCodedError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 400, Message: Bad request., DataType: CodedError
   */
  def addReaction(messageId: Int, emojiName: String, emojiCode: Option[String], reactionType: Option[String])
      (implicit toEntityMarshallerCodedError: ToEntityMarshaller[CodedError], toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route

  def checkMessagesMatchNarrow200(responseAnyType: AnyType)(implicit toEntityMarshallerAnyType: ToEntityMarshaller[AnyType]): Route =
    complete((200, responseAnyType))
  /**
   * Code: 200, Message: Success., DataType: AnyType
   */
  def checkMessagesMatchNarrow(msgIds: String, narrow: String)
      (implicit toEntityMarshallerAnyType: ToEntityMarshaller[AnyType]): Route

  def deleteMessage200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def deleteMessage400(responseOneOfobjectobject: OneOfobjectobject)(implicit toEntityMarshallerOneOfobjectobject: ToEntityMarshaller[OneOfobjectobject]): Route =
    complete((400, responseOneOfobjectobject))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 400, Message: Bad request., DataType: OneOfobjectobject
   */
  def deleteMessage(messageId: Int)
      (implicit toEntityMarshallerOneOfobjectobject: ToEntityMarshaller[OneOfobjectobject], toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route

  def getFileTemporaryUrl200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def getFileTemporaryUrl(realmIdStr: Int, filename: String)
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def getMessageHistory200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  def getMessageHistory400(responseInvalidMessageError: InvalidMessageError)(implicit toEntityMarshallerInvalidMessageError: ToEntityMarshaller[InvalidMessageError]): Route =
    complete((400, responseInvalidMessageError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   * Code: 400, Message: Bad request., DataType: InvalidMessageError
   */
  def getMessageHistory(messageId: Int)
      (implicit toEntityMarshallerInvalidMessageError: ToEntityMarshaller[InvalidMessageError], toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def getMessages200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def getMessages(numBefore: Int, numAfter: Int, anchor: Option[String], narrow: String, clientGravatar: Boolean, applyMarkdown: Boolean, useFirstUnreadAnchor: Boolean)
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def getRawMessage200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  def getRawMessage400(responseInvalidMessageError: InvalidMessageError)(implicit toEntityMarshallerInvalidMessageError: ToEntityMarshaller[InvalidMessageError]): Route =
    complete((400, responseInvalidMessageError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   * Code: 400, Message: Bad request., DataType: InvalidMessageError
   */
  def getRawMessage(messageId: Int)
      (implicit toEntityMarshallerInvalidMessageError: ToEntityMarshaller[InvalidMessageError], toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def markAllAsRead200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   */
  def markAllAsRead()
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route

  def markStreamAsRead200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   */
  def markStreamAsRead(streamId: Int)
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route

  def markTopicAsRead200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   */
  def markTopicAsRead(streamId: Int, topicName: String)
      (implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route

  def removeReaction200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def removeReaction400(responseCodedError: CodedError)(implicit toEntityMarshallerCodedError: ToEntityMarshaller[CodedError]): Route =
    complete((400, responseCodedError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 400, Message: Bad request., DataType: CodedError
   */
  def removeReaction(messageId: Int, emojiName: Option[String], emojiCode: Option[String], reactionType: Option[String])
      (implicit toEntityMarshallerCodedError: ToEntityMarshaller[CodedError], toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route

  def renderMessage200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def renderMessage(content: String)
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def sendMessage200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  def sendMessage400(responseOneOfobjectobject: OneOfobjectobject)(implicit toEntityMarshallerOneOfobjectobject: ToEntityMarshaller[OneOfobjectobject]): Route =
    complete((400, responseOneOfobjectobject))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   * Code: 400, Message: Bad request., DataType: OneOfobjectobject
   */
  def sendMessage(`type`: String, to: String, content: String, topic: Option[String], queueId: Option[String], localId: Option[String])
      (implicit toEntityMarshallerOneOfobjectobject: ToEntityMarshaller[OneOfobjectobject], toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def updateMessage200(responseJsonSuccess: JsonSuccess)(implicit toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route =
    complete((200, responseJsonSuccess))
  def updateMessage400(responseCodedError: CodedError)(implicit toEntityMarshallerCodedError: ToEntityMarshaller[CodedError]): Route =
    complete((400, responseCodedError))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccess
   * Code: 400, Message: Bad request., DataType: CodedError
   */
  def updateMessage(messageId: Int, topic: Option[String], propagateMode: String, sendNotificationToOldThread: Boolean, sendNotificationToNewThread: Boolean, content: Option[String], streamId: Option[Int])
      (implicit toEntityMarshallerCodedError: ToEntityMarshaller[CodedError], toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]): Route

  def updateMessageFlags200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def updateMessageFlags(messages: String, op: String, flag: String)
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

  def uploadFile200(responseJsonSuccessBase: JsonSuccessBase)(implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route =
    complete((200, responseJsonSuccessBase))
  /**
   * Code: 200, Message: Success., DataType: JsonSuccessBase
   */
  def uploadFile(filename: (FileInfo, File))
      (implicit toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]): Route

}

trait MessagesApiMarshaller {


  implicit def toEntityMarshallerOneOfobjectobject: ToEntityMarshaller[OneOfobjectobject]

  implicit def toEntityMarshallerCodedError: ToEntityMarshaller[CodedError]

  implicit def toEntityMarshallerInvalidMessageError: ToEntityMarshaller[InvalidMessageError]

  implicit def toEntityMarshallerJsonSuccess: ToEntityMarshaller[JsonSuccess]

  implicit def toEntityMarshallerAnyType: ToEntityMarshaller[AnyType]

  implicit def toEntityMarshallerJsonSuccessBase: ToEntityMarshaller[JsonSuccessBase]

}

