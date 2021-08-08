package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

import org.openapitools.client.api.AnyType
import org.openapitools.client.api.CodedError
import java.io.File
import org.openapitools.client.api.InvalidMessageError
import org.openapitools.client.api.JsonSuccess
import org.openapitools.client.api.JsonSuccessBase
import org.openapitools.client.api.OneOfobjectobject
import org.openapitools.client.api.OneOfstringinteger

object MessagesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def addReaction(host: String, messageId: Integer, emojiName: String, emojiCode: String, reactionType: String)(implicit emojiNameQuery: QueryParam[String], emojiCodeQuery: QueryParam[String], reactionTypeQuery: QueryParam[String]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/messages/{message_id}/reactions".replaceAll("\\{" + "message_id" + "\\}",escape(messageId.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("emojiName", Some(emoji_nameQuery.toParamString(emoji_name))), ("emojiCode", Some(emoji_codeQuery.toParamString(emoji_code))), ("reactionType", Some(reaction_typeQuery.toParamString(reaction_type))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def checkMessagesMatchNarrow(host: String, msgIds: List[Integer] = List.empty[Integer] , narrow: List[Any] = List.empty[Any] )(implicit msgIdsQuery: QueryParam[List[Integer]], narrowQuery: QueryParam[List[Any]]): Task[AnyType] = {
    implicit val returnTypeDecoder: EntityDecoder[AnyType] = jsonOf[AnyType]

    val path = "/messages/matches_narrow"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("msgIds", Some(msg_idsQuery.toParamString(msg_ids))), ("narrow", Some(narrowQuery.toParamString(narrow))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AnyType](req)

    } yield resp
  }
  
  def deleteMessage(host: String, messageId: Integer): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/messages/{message_id}".replaceAll("\\{" + "message_id" + "\\}",escape(messageId.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def getFileTemporaryUrl(host: String, realmIdStr: Integer, filename: String): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/user_uploads/{realm_id_str}/{filename}".replaceAll("\\{" + "realm_id_str" + "\\}",escape(realmIdStr.toString)).replaceAll("\\{" + "filename" + "\\}",escape(filename.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getMessageHistory(host: String, messageId: Integer): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/messages/{message_id}/history".replaceAll("\\{" + "message_id" + "\\}",escape(messageId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getMessages(host: String, numBefore: Integer, numAfter: Integer, anchor: OneOfstringinteger, narrow: List[Any] = [], clientGravatar: Boolean = false, applyMarkdown: Boolean = true, useFirstUnreadAnchor: Boolean = false)(implicit anchorQuery: QueryParam[OneOfstringinteger], numBeforeQuery: QueryParam[Integer], numAfterQuery: QueryParam[Integer], narrowQuery: QueryParam[List[Any]], clientGravatarQuery: QueryParam[Boolean], applyMarkdownQuery: QueryParam[Boolean], useFirstUnreadAnchorQuery: QueryParam[Boolean]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/messages"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("anchor", Some(anchorQuery.toParamString(anchor))), ("numBefore", Some(num_beforeQuery.toParamString(num_before))), ("numAfter", Some(num_afterQuery.toParamString(num_after))), ("narrow", Some(narrowQuery.toParamString(narrow))), ("clientGravatar", Some(client_gravatarQuery.toParamString(client_gravatar))), ("applyMarkdown", Some(apply_markdownQuery.toParamString(apply_markdown))), ("useFirstUnreadAnchor", Some(use_first_unread_anchorQuery.toParamString(use_first_unread_anchor))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getRawMessage(host: String, messageId: Integer): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/messages/{message_id}".replaceAll("\\{" + "message_id" + "\\}",escape(messageId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def markAllAsRead(host: String): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/mark_all_as_read"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def markStreamAsRead(host: String, streamId: Integer)(implicit streamIdQuery: QueryParam[Integer]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/mark_stream_as_read"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("streamId", Some(stream_idQuery.toParamString(stream_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def markTopicAsRead(host: String, streamId: Integer, topicName: String)(implicit streamIdQuery: QueryParam[Integer], topicNameQuery: QueryParam[String]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/mark_topic_as_read"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("streamId", Some(stream_idQuery.toParamString(stream_id))), ("topicName", Some(topic_nameQuery.toParamString(topic_name))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def removeReaction(host: String, messageId: Integer, emojiName: String, emojiCode: String, reactionType: String)(implicit emojiNameQuery: QueryParam[String], emojiCodeQuery: QueryParam[String], reactionTypeQuery: QueryParam[String]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/messages/{message_id}/reactions".replaceAll("\\{" + "message_id" + "\\}",escape(messageId.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("emojiName", Some(emoji_nameQuery.toParamString(emoji_name))), ("emojiCode", Some(emoji_codeQuery.toParamString(emoji_code))), ("reactionType", Some(reaction_typeQuery.toParamString(reaction_type))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def renderMessage(host: String, content: String)(implicit contentQuery: QueryParam[String]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/messages/render"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("content", Some(contentQuery.toParamString(content))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def sendMessage(host: String, `type`: String, to: List[Integer] = List.empty[Integer] , content: String, topic: String, queueId: String, localId: String)(implicit `type`Query: QueryParam[String], toQuery: QueryParam[List[Integer]], contentQuery: QueryParam[String], topicQuery: QueryParam[String], queueIdQuery: QueryParam[String], localIdQuery: QueryParam[String]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/messages"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("`type`", Some(typeQuery.toParamString(type))), ("to", Some(toQuery.toParamString(to))), ("content", Some(contentQuery.toParamString(content))), ("topic", Some(topicQuery.toParamString(topic))), ("queueId", Some(queue_idQuery.toParamString(queue_id))), ("localId", Some(local_idQuery.toParamString(local_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def updateMessage(host: String, messageId: Integer, topic: String, propagateMode: String = change_one, sendNotificationToOldThread: Boolean = true, sendNotificationToNewThread: Boolean = true, content: String, streamId: Integer)(implicit topicQuery: QueryParam[String], propagateModeQuery: QueryParam[String], sendNotificationToOldThreadQuery: QueryParam[Boolean], sendNotificationToNewThreadQuery: QueryParam[Boolean], contentQuery: QueryParam[String], streamIdQuery: QueryParam[Integer]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/messages/{message_id}".replaceAll("\\{" + "message_id" + "\\}",escape(messageId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("topic", Some(topicQuery.toParamString(topic))), ("propagateMode", Some(propagate_modeQuery.toParamString(propagate_mode))), ("sendNotificationToOldThread", Some(send_notification_to_old_threadQuery.toParamString(send_notification_to_old_thread))), ("sendNotificationToNewThread", Some(send_notification_to_new_threadQuery.toParamString(send_notification_to_new_thread))), ("content", Some(contentQuery.toParamString(content))), ("streamId", Some(stream_idQuery.toParamString(stream_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def updateMessageFlags(host: String, messages: List[Integer] = List.empty[Integer] , op: String, flag: String)(implicit messagesQuery: QueryParam[List[Integer]], opQuery: QueryParam[String], flagQuery: QueryParam[String]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/messages/flags"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("messages", Some(messagesQuery.toParamString(messages))), ("op", Some(opQuery.toParamString(op))), ("flag", Some(flagQuery.toParamString(flag))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def uploadFile(host: String, filename: File): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/user_uploads"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
}

class HttpServiceMessagesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def addReaction(messageId: Integer, emojiName: String, emojiCode: String, reactionType: String)(implicit emojiNameQuery: QueryParam[String], emojiCodeQuery: QueryParam[String], reactionTypeQuery: QueryParam[String]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/messages/{message_id}/reactions".replaceAll("\\{" + "message_id" + "\\}",escape(messageId.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("emojiName", Some(emoji_nameQuery.toParamString(emoji_name))), ("emojiCode", Some(emoji_codeQuery.toParamString(emoji_code))), ("reactionType", Some(reaction_typeQuery.toParamString(reaction_type))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def checkMessagesMatchNarrow(msgIds: List[Integer] = List.empty[Integer] , narrow: List[Any] = List.empty[Any] )(implicit msgIdsQuery: QueryParam[List[Integer]], narrowQuery: QueryParam[List[Any]]): Task[AnyType] = {
    implicit val returnTypeDecoder: EntityDecoder[AnyType] = jsonOf[AnyType]

    val path = "/messages/matches_narrow"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("msgIds", Some(msg_idsQuery.toParamString(msg_ids))), ("narrow", Some(narrowQuery.toParamString(narrow))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AnyType](req)

    } yield resp
  }
  
  def deleteMessage(messageId: Integer): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/messages/{message_id}".replaceAll("\\{" + "message_id" + "\\}",escape(messageId.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def getFileTemporaryUrl(realmIdStr: Integer, filename: String): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/user_uploads/{realm_id_str}/{filename}".replaceAll("\\{" + "realm_id_str" + "\\}",escape(realmIdStr.toString)).replaceAll("\\{" + "filename" + "\\}",escape(filename.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getMessageHistory(messageId: Integer): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/messages/{message_id}/history".replaceAll("\\{" + "message_id" + "\\}",escape(messageId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getMessages(numBefore: Integer, numAfter: Integer, anchor: OneOfstringinteger, narrow: List[Any] = [], clientGravatar: Boolean = false, applyMarkdown: Boolean = true, useFirstUnreadAnchor: Boolean = false)(implicit anchorQuery: QueryParam[OneOfstringinteger], numBeforeQuery: QueryParam[Integer], numAfterQuery: QueryParam[Integer], narrowQuery: QueryParam[List[Any]], clientGravatarQuery: QueryParam[Boolean], applyMarkdownQuery: QueryParam[Boolean], useFirstUnreadAnchorQuery: QueryParam[Boolean]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/messages"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("anchor", Some(anchorQuery.toParamString(anchor))), ("numBefore", Some(num_beforeQuery.toParamString(num_before))), ("numAfter", Some(num_afterQuery.toParamString(num_after))), ("narrow", Some(narrowQuery.toParamString(narrow))), ("clientGravatar", Some(client_gravatarQuery.toParamString(client_gravatar))), ("applyMarkdown", Some(apply_markdownQuery.toParamString(apply_markdown))), ("useFirstUnreadAnchor", Some(use_first_unread_anchorQuery.toParamString(use_first_unread_anchor))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getRawMessage(messageId: Integer): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/messages/{message_id}".replaceAll("\\{" + "message_id" + "\\}",escape(messageId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def markAllAsRead(): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/mark_all_as_read"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def markStreamAsRead(streamId: Integer)(implicit streamIdQuery: QueryParam[Integer]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/mark_stream_as_read"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("streamId", Some(stream_idQuery.toParamString(stream_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def markTopicAsRead(streamId: Integer, topicName: String)(implicit streamIdQuery: QueryParam[Integer], topicNameQuery: QueryParam[String]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/mark_topic_as_read"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("streamId", Some(stream_idQuery.toParamString(stream_id))), ("topicName", Some(topic_nameQuery.toParamString(topic_name))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def removeReaction(messageId: Integer, emojiName: String, emojiCode: String, reactionType: String)(implicit emojiNameQuery: QueryParam[String], emojiCodeQuery: QueryParam[String], reactionTypeQuery: QueryParam[String]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/messages/{message_id}/reactions".replaceAll("\\{" + "message_id" + "\\}",escape(messageId.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("emojiName", Some(emoji_nameQuery.toParamString(emoji_name))), ("emojiCode", Some(emoji_codeQuery.toParamString(emoji_code))), ("reactionType", Some(reaction_typeQuery.toParamString(reaction_type))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def renderMessage(content: String)(implicit contentQuery: QueryParam[String]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/messages/render"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("content", Some(contentQuery.toParamString(content))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def sendMessage(`type`: String, to: List[Integer] = List.empty[Integer] , content: String, topic: String, queueId: String, localId: String)(implicit `type`Query: QueryParam[String], toQuery: QueryParam[List[Integer]], contentQuery: QueryParam[String], topicQuery: QueryParam[String], queueIdQuery: QueryParam[String], localIdQuery: QueryParam[String]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/messages"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("`type`", Some(typeQuery.toParamString(type))), ("to", Some(toQuery.toParamString(to))), ("content", Some(contentQuery.toParamString(content))), ("topic", Some(topicQuery.toParamString(topic))), ("queueId", Some(queue_idQuery.toParamString(queue_id))), ("localId", Some(local_idQuery.toParamString(local_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def updateMessage(messageId: Integer, topic: String, propagateMode: String = change_one, sendNotificationToOldThread: Boolean = true, sendNotificationToNewThread: Boolean = true, content: String, streamId: Integer)(implicit topicQuery: QueryParam[String], propagateModeQuery: QueryParam[String], sendNotificationToOldThreadQuery: QueryParam[Boolean], sendNotificationToNewThreadQuery: QueryParam[Boolean], contentQuery: QueryParam[String], streamIdQuery: QueryParam[Integer]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/messages/{message_id}".replaceAll("\\{" + "message_id" + "\\}",escape(messageId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("topic", Some(topicQuery.toParamString(topic))), ("propagateMode", Some(propagate_modeQuery.toParamString(propagate_mode))), ("sendNotificationToOldThread", Some(send_notification_to_old_threadQuery.toParamString(send_notification_to_old_thread))), ("sendNotificationToNewThread", Some(send_notification_to_new_threadQuery.toParamString(send_notification_to_new_thread))), ("content", Some(contentQuery.toParamString(content))), ("streamId", Some(stream_idQuery.toParamString(stream_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def updateMessageFlags(messages: List[Integer] = List.empty[Integer] , op: String, flag: String)(implicit messagesQuery: QueryParam[List[Integer]], opQuery: QueryParam[String], flagQuery: QueryParam[String]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/messages/flags"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("messages", Some(messagesQuery.toParamString(messages))), ("op", Some(opQuery.toParamString(op))), ("flag", Some(flagQuery.toParamString(flag))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def uploadFile(filename: File): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/user_uploads"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
}
