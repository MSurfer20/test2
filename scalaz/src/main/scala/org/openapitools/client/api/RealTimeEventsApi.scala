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

import org.openapitools.client.api.BadEventQueueIdError
import org.openapitools.client.api.JsonSuccess
import org.openapitools.client.api.JsonSuccessBase
import org.openapitools.client.api.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError
import org.openapitools.client.api.OneOfRateLimitedError
import org.openapitools.client.api.OneOfUserDeactivatedErrorRealmDeactivatedError

object RealTimeEventsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteQueue(host: String, queueId: String)(implicit queueIdQuery: QueryParam[String]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/events"
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("queueId", Some(queue_idQuery.toParamString(queue_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def getEvents(host: String, queueId: String, lastEventId: Integer, dontBlock: Boolean = false)(implicit queueIdQuery: QueryParam[String], lastEventIdQuery: QueryParam[Integer], dontBlockQuery: QueryParam[Boolean]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/events"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("queueId", Some(queue_idQuery.toParamString(queue_id))), ("lastEventId", Some(last_event_idQuery.toParamString(last_event_id))), ("dontBlock", Some(dont_blockQuery.toParamString(dont_block))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def realTimePost(host: String, eventTypes: List[String] = List.empty[String] , narrow: List[List[String]] = [], allPublicStreams: Boolean = false)(implicit eventTypesQuery: QueryParam[List[String]], narrowQuery: QueryParam[List[List[String]]], allPublicStreamsQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/real-time"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("eventTypes", Some(event_typesQuery.toParamString(event_types))), ("narrow", Some(narrowQuery.toParamString(narrow))), ("allPublicStreams", Some(all_public_streamsQuery.toParamString(all_public_streams))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def registerQueue(host: String, applyMarkdown: Boolean = false, clientGravatar: Boolean = false, slimPresence: Boolean = false, eventTypes: List[String] = List.empty[String] , allPublicStreams: Boolean = false, includeSubscribers: Boolean = false, clientCapabilities: Any, fetchEventTypes: List[String] = List.empty[String] , narrow: List[List[String]] = [])(implicit applyMarkdownQuery: QueryParam[Boolean], clientGravatarQuery: QueryParam[Boolean], slimPresenceQuery: QueryParam[Boolean], eventTypesQuery: QueryParam[List[String]], allPublicStreamsQuery: QueryParam[Boolean], includeSubscribersQuery: QueryParam[Boolean], clientCapabilitiesQuery: QueryParam[Any], fetchEventTypesQuery: QueryParam[List[String]], narrowQuery: QueryParam[List[List[String]]]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/register"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("applyMarkdown", Some(apply_markdownQuery.toParamString(apply_markdown))), ("clientGravatar", Some(client_gravatarQuery.toParamString(client_gravatar))), ("slimPresence", Some(slim_presenceQuery.toParamString(slim_presence))), ("eventTypes", Some(event_typesQuery.toParamString(event_types))), ("allPublicStreams", Some(all_public_streamsQuery.toParamString(all_public_streams))), ("includeSubscribers", Some(include_subscribersQuery.toParamString(include_subscribers))), ("clientCapabilities", Some(client_capabilitiesQuery.toParamString(client_capabilities))), ("fetchEventTypes", Some(fetch_event_typesQuery.toParamString(fetch_event_types))), ("narrow", Some(narrowQuery.toParamString(narrow))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def restErrorHandling(host: String): Task[Unit] = {
    val path = "/rest-error-handling"
    
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
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
}

class HttpServiceRealTimeEventsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteQueue(queueId: String)(implicit queueIdQuery: QueryParam[String]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/events"
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("queueId", Some(queue_idQuery.toParamString(queue_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def getEvents(queueId: String, lastEventId: Integer, dontBlock: Boolean = false)(implicit queueIdQuery: QueryParam[String], lastEventIdQuery: QueryParam[Integer], dontBlockQuery: QueryParam[Boolean]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/events"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("queueId", Some(queue_idQuery.toParamString(queue_id))), ("lastEventId", Some(last_event_idQuery.toParamString(last_event_id))), ("dontBlock", Some(dont_blockQuery.toParamString(dont_block))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def realTimePost(eventTypes: List[String] = List.empty[String] , narrow: List[List[String]] = [], allPublicStreams: Boolean = false)(implicit eventTypesQuery: QueryParam[List[String]], narrowQuery: QueryParam[List[List[String]]], allPublicStreamsQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/real-time"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("eventTypes", Some(event_typesQuery.toParamString(event_types))), ("narrow", Some(narrowQuery.toParamString(narrow))), ("allPublicStreams", Some(all_public_streamsQuery.toParamString(all_public_streams))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def registerQueue(applyMarkdown: Boolean = false, clientGravatar: Boolean = false, slimPresence: Boolean = false, eventTypes: List[String] = List.empty[String] , allPublicStreams: Boolean = false, includeSubscribers: Boolean = false, clientCapabilities: Any, fetchEventTypes: List[String] = List.empty[String] , narrow: List[List[String]] = [])(implicit applyMarkdownQuery: QueryParam[Boolean], clientGravatarQuery: QueryParam[Boolean], slimPresenceQuery: QueryParam[Boolean], eventTypesQuery: QueryParam[List[String]], allPublicStreamsQuery: QueryParam[Boolean], includeSubscribersQuery: QueryParam[Boolean], clientCapabilitiesQuery: QueryParam[Any], fetchEventTypesQuery: QueryParam[List[String]], narrowQuery: QueryParam[List[List[String]]]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/register"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("applyMarkdown", Some(apply_markdownQuery.toParamString(apply_markdown))), ("clientGravatar", Some(client_gravatarQuery.toParamString(client_gravatar))), ("slimPresence", Some(slim_presenceQuery.toParamString(slim_presence))), ("eventTypes", Some(event_typesQuery.toParamString(event_types))), ("allPublicStreams", Some(all_public_streamsQuery.toParamString(all_public_streams))), ("includeSubscribers", Some(include_subscribersQuery.toParamString(include_subscribers))), ("clientCapabilities", Some(client_capabilitiesQuery.toParamString(client_capabilities))), ("fetchEventTypes", Some(fetch_event_typesQuery.toParamString(fetch_event_types))), ("narrow", Some(narrowQuery.toParamString(narrow))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def restErrorHandling(): Task[Unit] = {
    val path = "/rest-error-handling"
    
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
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
}
