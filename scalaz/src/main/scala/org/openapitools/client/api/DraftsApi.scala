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
import org.openapitools.client.api.Draft
import org.openapitools.client.api.JsonError
import org.openapitools.client.api.JsonSuccess

object DraftsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def createDrafts(host: String, drafts: List[Draft] = List.empty[Draft] )(implicit draftsQuery: QueryParam[List[Draft]]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/drafts"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("drafts", Some(draftsQuery.toParamString(drafts))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def deleteDraft(host: String, draftId: Integer): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/drafts/{draft_id}".replaceAll("\\{" + "draft_id" + "\\}",escape(draftId.toString))
    
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
  
  def editDraft(host: String, draftId: Integer, draft: Draft)(implicit draftQuery: QueryParam[Draft]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/drafts/{draft_id}".replaceAll("\\{" + "draft_id" + "\\}",escape(draftId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("draft", Some(draftQuery.toParamString(draft))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def getDrafts(host: String): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/drafts"
    
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
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
}

class HttpServiceDraftsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def createDrafts(drafts: List[Draft] = List.empty[Draft] )(implicit draftsQuery: QueryParam[List[Draft]]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/drafts"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("drafts", Some(draftsQuery.toParamString(drafts))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def deleteDraft(draftId: Integer): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/drafts/{draft_id}".replaceAll("\\{" + "draft_id" + "\\}",escape(draftId.toString))
    
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
  
  def editDraft(draftId: Integer, draft: Draft)(implicit draftQuery: QueryParam[Draft]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/drafts/{draft_id}".replaceAll("\\{" + "draft_id" + "\\}",escape(draftId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("draft", Some(draftQuery.toParamString(draft))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def getDrafts(): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/drafts"
    
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
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
}
