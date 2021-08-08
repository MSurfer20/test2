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

import org.openapitools.client.api.CodedError
import org.openapitools.client.api.JsonError
import org.openapitools.client.api.JsonSuccess
import org.openapitools.client.api.JsonSuccessBase
import org.openapitools.client.api.NonExistingStreamError
import org.openapitools.client.api.OneOfobjectobject
import org.openapitools.client.api.OneOfstringinteger

object StreamsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def archiveStream(host: String, streamId: Integer): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/streams/{stream_id}".replaceAll("\\{" + "stream_id" + "\\}",escape(streamId.toString))
    
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
  
  def createBigBlueButtonVideoCall(host: String): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/calls/bigbluebutton/create"
    
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
  
  def getStreamId(host: String, stream: String)(implicit streamQuery: QueryParam[String]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/get_stream_id"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("stream", Some(streamQuery.toParamString(stream))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getStreamTopics(host: String, streamId: Integer): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/me/{stream_id}/topics".replaceAll("\\{" + "stream_id" + "\\}",escape(streamId.toString))
    
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
  
  def getStreams(host: String, includePublic: Boolean = true, includeWebPublic: Boolean = false, includeSubscribed: Boolean = true, includeAllActive: Boolean = false, includeDefault: Boolean = false, includeOwnerSubscribed: Boolean = false)(implicit includePublicQuery: QueryParam[Boolean], includeWebPublicQuery: QueryParam[Boolean], includeSubscribedQuery: QueryParam[Boolean], includeAllActiveQuery: QueryParam[Boolean], includeDefaultQuery: QueryParam[Boolean], includeOwnerSubscribedQuery: QueryParam[Boolean]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/streams"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("includePublic", Some(include_publicQuery.toParamString(include_public))), ("includeWebPublic", Some(include_web_publicQuery.toParamString(include_web_public))), ("includeSubscribed", Some(include_subscribedQuery.toParamString(include_subscribed))), ("includeAllActive", Some(include_all_activeQuery.toParamString(include_all_active))), ("includeDefault", Some(include_defaultQuery.toParamString(include_default))), ("includeOwnerSubscribed", Some(include_owner_subscribedQuery.toParamString(include_owner_subscribed))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getSubscriptionStatus(host: String, userId: Integer, streamId: Integer): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/{user_id}/subscriptions/{stream_id}".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString)).replaceAll("\\{" + "stream_id" + "\\}",escape(streamId.toString))
    
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
  
  def getSubscriptions(host: String, includeSubscribers: Boolean = false)(implicit includeSubscribersQuery: QueryParam[Boolean]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/me/subscriptions"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("includeSubscribers", Some(include_subscribersQuery.toParamString(include_subscribers))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def muteTopic(host: String, topic: String, op: String, stream: String, streamId: Integer)(implicit streamQuery: QueryParam[String], streamIdQuery: QueryParam[Integer], topicQuery: QueryParam[String], opQuery: QueryParam[String]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/users/me/subscriptions/muted_topics"
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("stream", Some(streamQuery.toParamString(stream))), ("streamId", Some(stream_idQuery.toParamString(stream_id))), ("topic", Some(topicQuery.toParamString(topic))), ("op", Some(opQuery.toParamString(op))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def subscribe(host: String, subscriptions: List[Any] = List.empty[Any] , principals: List[OneOfstringinteger] = List.empty[OneOfstringinteger] , authorizationErrorsFatal: Boolean = true, announce: Boolean = false, inviteOnly: Boolean = false, historyPublicToSubscribers: Boolean, streamPostPolicy: Integer = 1, messageRetentionDays: OneOfstringinteger)(implicit subscriptionsQuery: QueryParam[List[Any]], principalsQuery: QueryParam[List[OneOfstringinteger]], authorizationErrorsFatalQuery: QueryParam[Boolean], announceQuery: QueryParam[Boolean], inviteOnlyQuery: QueryParam[Boolean], historyPublicToSubscribersQuery: QueryParam[Boolean], streamPostPolicyQuery: QueryParam[Integer], messageRetentionDaysQuery: QueryParam[OneOfstringinteger]): Task[OneOfobjectobject] = {
    implicit val returnTypeDecoder: EntityDecoder[OneOfobjectobject] = jsonOf[OneOfobjectobject]

    val path = "/users/me/subscriptions"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("subscriptions", Some(subscriptionsQuery.toParamString(subscriptions))), ("principals", Some(principalsQuery.toParamString(principals))), ("authorizationErrorsFatal", Some(authorization_errors_fatalQuery.toParamString(authorization_errors_fatal))), ("announce", Some(announceQuery.toParamString(announce))), ("inviteOnly", Some(invite_onlyQuery.toParamString(invite_only))), ("historyPublicToSubscribers", Some(history_public_to_subscribersQuery.toParamString(history_public_to_subscribers))), ("streamPostPolicy", Some(stream_post_policyQuery.toParamString(stream_post_policy))), ("messageRetentionDays", Some(message_retention_daysQuery.toParamString(message_retention_days))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[OneOfobjectobject](req)

    } yield resp
  }
  
  def unsubscribe(host: String, subscriptions: List[String] = List.empty[String] , principals: List[OneOfstringinteger] = List.empty[OneOfstringinteger] )(implicit subscriptionsQuery: QueryParam[List[String]], principalsQuery: QueryParam[List[OneOfstringinteger]]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/me/subscriptions"
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("subscriptions", Some(subscriptionsQuery.toParamString(subscriptions))), ("principals", Some(principalsQuery.toParamString(principals))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def updateStream(host: String, streamId: Integer, description: String, newName: String, isPrivate: Boolean, isAnnouncementOnly: Boolean, streamPostPolicy: Integer = 1, historyPublicToSubscribers: Boolean, messageRetentionDays: OneOfstringinteger)(implicit descriptionQuery: QueryParam[String], newNameQuery: QueryParam[String], isPrivateQuery: QueryParam[Boolean], isAnnouncementOnlyQuery: QueryParam[Boolean], streamPostPolicyQuery: QueryParam[Integer], historyPublicToSubscribersQuery: QueryParam[Boolean], messageRetentionDaysQuery: QueryParam[OneOfstringinteger]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/streams/{stream_id}".replaceAll("\\{" + "stream_id" + "\\}",escape(streamId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("description", Some(descriptionQuery.toParamString(description))), ("newName", Some(new_nameQuery.toParamString(new_name))), ("isPrivate", Some(is_privateQuery.toParamString(is_private))), ("isAnnouncementOnly", Some(is_announcement_onlyQuery.toParamString(is_announcement_only))), ("streamPostPolicy", Some(stream_post_policyQuery.toParamString(stream_post_policy))), ("historyPublicToSubscribers", Some(history_public_to_subscribersQuery.toParamString(history_public_to_subscribers))), ("messageRetentionDays", Some(message_retention_daysQuery.toParamString(message_retention_days))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def updateSubscriptionSettings(host: String, subscriptionData: List[Any] = List.empty[Any] )(implicit subscriptionDataQuery: QueryParam[List[Any]]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/me/subscriptions/properties"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("subscriptionData", Some(subscription_dataQuery.toParamString(subscription_data))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def updateSubscriptions(host: String, delete: List[String] = List.empty[String] , add: List[Any] = List.empty[Any] )(implicit deleteQuery: QueryParam[List[String]], addQuery: QueryParam[List[Any]]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/me/subscriptions"
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("delete", Some(deleteQuery.toParamString(delete))), ("add", Some(addQuery.toParamString(add))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
}

class HttpServiceStreamsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def archiveStream(streamId: Integer): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/streams/{stream_id}".replaceAll("\\{" + "stream_id" + "\\}",escape(streamId.toString))
    
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
  
  def createBigBlueButtonVideoCall(): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/calls/bigbluebutton/create"
    
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
  
  def getStreamId(stream: String)(implicit streamQuery: QueryParam[String]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/get_stream_id"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("stream", Some(streamQuery.toParamString(stream))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getStreamTopics(streamId: Integer): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/me/{stream_id}/topics".replaceAll("\\{" + "stream_id" + "\\}",escape(streamId.toString))
    
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
  
  def getStreams(includePublic: Boolean = true, includeWebPublic: Boolean = false, includeSubscribed: Boolean = true, includeAllActive: Boolean = false, includeDefault: Boolean = false, includeOwnerSubscribed: Boolean = false)(implicit includePublicQuery: QueryParam[Boolean], includeWebPublicQuery: QueryParam[Boolean], includeSubscribedQuery: QueryParam[Boolean], includeAllActiveQuery: QueryParam[Boolean], includeDefaultQuery: QueryParam[Boolean], includeOwnerSubscribedQuery: QueryParam[Boolean]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/streams"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("includePublic", Some(include_publicQuery.toParamString(include_public))), ("includeWebPublic", Some(include_web_publicQuery.toParamString(include_web_public))), ("includeSubscribed", Some(include_subscribedQuery.toParamString(include_subscribed))), ("includeAllActive", Some(include_all_activeQuery.toParamString(include_all_active))), ("includeDefault", Some(include_defaultQuery.toParamString(include_default))), ("includeOwnerSubscribed", Some(include_owner_subscribedQuery.toParamString(include_owner_subscribed))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getSubscriptionStatus(userId: Integer, streamId: Integer): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/{user_id}/subscriptions/{stream_id}".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString)).replaceAll("\\{" + "stream_id" + "\\}",escape(streamId.toString))
    
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
  
  def getSubscriptions(includeSubscribers: Boolean = false)(implicit includeSubscribersQuery: QueryParam[Boolean]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/me/subscriptions"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("includeSubscribers", Some(include_subscribersQuery.toParamString(include_subscribers))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def muteTopic(topic: String, op: String, stream: String, streamId: Integer)(implicit streamQuery: QueryParam[String], streamIdQuery: QueryParam[Integer], topicQuery: QueryParam[String], opQuery: QueryParam[String]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/users/me/subscriptions/muted_topics"
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("stream", Some(streamQuery.toParamString(stream))), ("streamId", Some(stream_idQuery.toParamString(stream_id))), ("topic", Some(topicQuery.toParamString(topic))), ("op", Some(opQuery.toParamString(op))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def subscribe(subscriptions: List[Any] = List.empty[Any] , principals: List[OneOfstringinteger] = List.empty[OneOfstringinteger] , authorizationErrorsFatal: Boolean = true, announce: Boolean = false, inviteOnly: Boolean = false, historyPublicToSubscribers: Boolean, streamPostPolicy: Integer = 1, messageRetentionDays: OneOfstringinteger)(implicit subscriptionsQuery: QueryParam[List[Any]], principalsQuery: QueryParam[List[OneOfstringinteger]], authorizationErrorsFatalQuery: QueryParam[Boolean], announceQuery: QueryParam[Boolean], inviteOnlyQuery: QueryParam[Boolean], historyPublicToSubscribersQuery: QueryParam[Boolean], streamPostPolicyQuery: QueryParam[Integer], messageRetentionDaysQuery: QueryParam[OneOfstringinteger]): Task[OneOfobjectobject] = {
    implicit val returnTypeDecoder: EntityDecoder[OneOfobjectobject] = jsonOf[OneOfobjectobject]

    val path = "/users/me/subscriptions"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("subscriptions", Some(subscriptionsQuery.toParamString(subscriptions))), ("principals", Some(principalsQuery.toParamString(principals))), ("authorizationErrorsFatal", Some(authorization_errors_fatalQuery.toParamString(authorization_errors_fatal))), ("announce", Some(announceQuery.toParamString(announce))), ("inviteOnly", Some(invite_onlyQuery.toParamString(invite_only))), ("historyPublicToSubscribers", Some(history_public_to_subscribersQuery.toParamString(history_public_to_subscribers))), ("streamPostPolicy", Some(stream_post_policyQuery.toParamString(stream_post_policy))), ("messageRetentionDays", Some(message_retention_daysQuery.toParamString(message_retention_days))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[OneOfobjectobject](req)

    } yield resp
  }
  
  def unsubscribe(subscriptions: List[String] = List.empty[String] , principals: List[OneOfstringinteger] = List.empty[OneOfstringinteger] )(implicit subscriptionsQuery: QueryParam[List[String]], principalsQuery: QueryParam[List[OneOfstringinteger]]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/me/subscriptions"
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("subscriptions", Some(subscriptionsQuery.toParamString(subscriptions))), ("principals", Some(principalsQuery.toParamString(principals))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def updateStream(streamId: Integer, description: String, newName: String, isPrivate: Boolean, isAnnouncementOnly: Boolean, streamPostPolicy: Integer = 1, historyPublicToSubscribers: Boolean, messageRetentionDays: OneOfstringinteger)(implicit descriptionQuery: QueryParam[String], newNameQuery: QueryParam[String], isPrivateQuery: QueryParam[Boolean], isAnnouncementOnlyQuery: QueryParam[Boolean], streamPostPolicyQuery: QueryParam[Integer], historyPublicToSubscribersQuery: QueryParam[Boolean], messageRetentionDaysQuery: QueryParam[OneOfstringinteger]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/streams/{stream_id}".replaceAll("\\{" + "stream_id" + "\\}",escape(streamId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("description", Some(descriptionQuery.toParamString(description))), ("newName", Some(new_nameQuery.toParamString(new_name))), ("isPrivate", Some(is_privateQuery.toParamString(is_private))), ("isAnnouncementOnly", Some(is_announcement_onlyQuery.toParamString(is_announcement_only))), ("streamPostPolicy", Some(stream_post_policyQuery.toParamString(stream_post_policy))), ("historyPublicToSubscribers", Some(history_public_to_subscribersQuery.toParamString(history_public_to_subscribers))), ("messageRetentionDays", Some(message_retention_daysQuery.toParamString(message_retention_days))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def updateSubscriptionSettings(subscriptionData: List[Any] = List.empty[Any] )(implicit subscriptionDataQuery: QueryParam[List[Any]]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/me/subscriptions/properties"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("subscriptionData", Some(subscription_dataQuery.toParamString(subscription_data))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def updateSubscriptions(delete: List[String] = List.empty[String] , add: List[Any] = List.empty[Any] )(implicit deleteQuery: QueryParam[List[String]], addQuery: QueryParam[List[Any]]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/users/me/subscriptions"
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("delete", Some(deleteQuery.toParamString(delete))), ("add", Some(addQuery.toParamString(add))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
}
