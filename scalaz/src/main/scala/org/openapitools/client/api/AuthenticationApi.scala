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

import org.openapitools.client.api.ApiKeyResponse

object AuthenticationApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def devFetchApiKey(host: String, username: String)(implicit usernameQuery: QueryParam[String]): Task[ApiKeyResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ApiKeyResponse] = jsonOf[ApiKeyResponse]

    val path = "/dev_fetch_api_key"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("username", Some(usernameQuery.toParamString(username))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ApiKeyResponse](req)

    } yield resp
  }
  
  def fetchApiKey(host: String, username: String, password: String)(implicit usernameQuery: QueryParam[String], passwordQuery: QueryParam[String]): Task[ApiKeyResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ApiKeyResponse] = jsonOf[ApiKeyResponse]

    val path = "/fetch_api_key"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("username", Some(usernameQuery.toParamString(username))), ("password", Some(passwordQuery.toParamString(password))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ApiKeyResponse](req)

    } yield resp
  }
  
}

class HttpServiceAuthenticationApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def devFetchApiKey(username: String)(implicit usernameQuery: QueryParam[String]): Task[ApiKeyResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ApiKeyResponse] = jsonOf[ApiKeyResponse]

    val path = "/dev_fetch_api_key"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("username", Some(usernameQuery.toParamString(username))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ApiKeyResponse](req)

    } yield resp
  }
  
  def fetchApiKey(username: String, password: String)(implicit usernameQuery: QueryParam[String], passwordQuery: QueryParam[String]): Task[ApiKeyResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ApiKeyResponse] = jsonOf[ApiKeyResponse]

    val path = "/fetch_api_key"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("username", Some(usernameQuery.toParamString(username))), ("password", Some(passwordQuery.toParamString(password))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ApiKeyResponse](req)

    } yield resp
  }
  
}
