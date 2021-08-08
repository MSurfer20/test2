package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CodedError
import model.InvalidMessageError
import model.JsObject
import model.JsonSuccess
import model.JsonSuccessBase
import model.OasAnyTypeNotMapped
import model.OneOfobjectobject
import model.OneOfstringinteger
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:15:31.623147Z[Etc/UTC]")
@Singleton
class MessagesApiController @Inject()(cc: ControllerComponents, api: MessagesApi) extends AbstractController(cc) {
  /**
    * POST /api/v1/messages/:messageId/reactions?emojiName=[value]&emojiCode=[value]&reactionType=[value]
    * @param messageId The target message&#39;s ID. 
    */
  def addReaction(messageId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val emojiName = request.getQueryString("emoji_name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("emoji_name", "query string")
        }
      val emojiCode = request.getQueryString("emoji_code")
        
      val reactionType = request.getQueryString("reaction_type")
        
      api.addReaction(messageId, emojiName, emojiCode, reactionType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/messages/matches_narrow?msgIds=[value]&narrow=[value]
    */
  def checkMessagesMatchNarrow(): Action[AnyContent] = Action { request =>
    def executeApi(): OasAnyTypeNotMapped = {
      val msgIds = request.queryString.get("msg_ids")
        .map(_.toList)
        .map(_.map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("msg_ids", "query string")
        }
      val narrow = request.queryString.get("narrow")
        .map(_.toList)
        .map(_.map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("narrow", "query string")
        }
      api.checkMessagesMatchNarrow(msgIds, narrow)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/v1/messages/:messageId
    * @param messageId The target message&#39;s ID. 
    */
  def deleteMessage(messageId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      api.deleteMessage(messageId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/user_uploads/:realmIdStr/:filename
    * @param realmIdStr The realm id. 
    * @param filename Path to the URL. 
    */
  def getFileTemporaryUrl(realmIdStr: Int, filename: String): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      api.getFileTemporaryUrl(realmIdStr, filename)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/messages/:messageId/history
    * @param messageId The target message&#39;s ID. 
    */
  def getMessageHistory(messageId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      api.getMessageHistory(messageId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/messages?anchor=[value]&numBefore=[value]&numAfter=[value]&narrow=[value]&clientGravatar=[value]&applyMarkdown=[value]&useFirstUnreadAnchor=[value]
    */
  def getMessages(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val anchor = request.getQueryString("anchor")
        .map(value => )
      val numBefore = request.getQueryString("num_before")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("num_before", "query string")
        }
      val numAfter = request.getQueryString("num_after")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("num_after", "query string")
        }
      val narrow = request.queryString.get("narrow")
        .map(_.toList)
        .map(_.map(value => )
      val clientGravatar = request.getQueryString("client_gravatar")
        .map(value => value.toBoolean)
      val applyMarkdown = request.getQueryString("apply_markdown")
        .map(value => value.toBoolean)
      val useFirstUnreadAnchor = request.getQueryString("use_first_unread_anchor")
        .map(value => value.toBoolean)
      api.getMessages(numBefore, numAfter, anchor, narrow, clientGravatar, applyMarkdown, useFirstUnreadAnchor)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v1/messages/:messageId
    * @param messageId The target message&#39;s ID. 
    */
  def getRawMessage(messageId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      api.getRawMessage(messageId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/mark_all_as_read
    */
  def markAllAsRead(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      api.markAllAsRead()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/mark_stream_as_read?streamId=[value]
    */
  def markStreamAsRead(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val streamId = request.getQueryString("stream_id")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("stream_id", "query string")
        }
      api.markStreamAsRead(streamId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/mark_topic_as_read?streamId=[value]&topicName=[value]
    */
  def markTopicAsRead(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val streamId = request.getQueryString("stream_id")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("stream_id", "query string")
        }
      val topicName = request.getQueryString("topic_name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("topic_name", "query string")
        }
      api.markTopicAsRead(streamId, topicName)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/v1/messages/:messageId/reactions?emojiName=[value]&emojiCode=[value]&reactionType=[value]
    * @param messageId The target message&#39;s ID. 
    */
  def removeReaction(messageId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val emojiName = request.getQueryString("emoji_name")
        
      val emojiCode = request.getQueryString("emoji_code")
        
      val reactionType = request.getQueryString("reaction_type")
        
      api.removeReaction(messageId, emojiName, emojiCode, reactionType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/messages/render?content=[value]
    */
  def renderMessage(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val content = request.getQueryString("content")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("content", "query string")
        }
      api.renderMessage(content)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/messages?`type`=[value]&to=[value]&content=[value]&topic=[value]&queueId=[value]&localId=[value]
    */
  def sendMessage(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val `type` = request.getQueryString("type")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("type", "query string")
        }
      val to = request.queryString.get("to")
        .map(_.toList)
        .map(_.map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("to", "query string")
        }
      val content = request.getQueryString("content")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("content", "query string")
        }
      val topic = request.getQueryString("topic")
        
      val queueId = request.getQueryString("queue_id")
        
      val localId = request.getQueryString("local_id")
        
      api.sendMessage(`type`, to, content, topic, queueId, localId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /api/v1/messages/:messageId?topic=[value]&propagateMode=[value]&sendNotificationToOldThread=[value]&sendNotificationToNewThread=[value]&content=[value]&streamId=[value]
    * @param messageId The target message&#39;s ID. 
    */
  def updateMessage(messageId: Int): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccess = {
      val topic = request.getQueryString("topic")
        
      val propagateMode = request.getQueryString("propagate_mode")
        
      val sendNotificationToOldThread = request.getQueryString("send_notification_to_old_thread")
        .map(value => value.toBoolean)
      val sendNotificationToNewThread = request.getQueryString("send_notification_to_new_thread")
        .map(value => value.toBoolean)
      val content = request.getQueryString("content")
        
      val streamId = request.getQueryString("stream_id")
        .map(value => value.toInt)
      api.updateMessage(messageId, topic, propagateMode, sendNotificationToOldThread, sendNotificationToNewThread, content, streamId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/messages/flags?messages=[value]&op=[value]&flag=[value]
    */
  def updateMessageFlags(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val messages = request.queryString.get("messages")
        .map(_.toList)
        .map(_.map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("messages", "query string")
        }
      val op = request.getQueryString("op")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("op", "query string")
        }
      val flag = request.getQueryString("flag")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("flag", "query string")
        }
      api.updateMessageFlags(messages, op, flag)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/v1/user_uploads
    */
  def uploadFile(): Action[AnyContent] = Action { request =>
    def executeApi(): JsonSuccessBase = {
      val filename = request.body.asMultipartFormData.flatMap(_.file("filename").map(_.ref: TemporaryFile))
        
      api.uploadFile(filename)
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
