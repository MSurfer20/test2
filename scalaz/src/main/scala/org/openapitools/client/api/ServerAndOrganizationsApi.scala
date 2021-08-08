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

import java.io.File
import org.openapitools.client.api.JsonSuccess
import org.openapitools.client.api.JsonSuccessBase

object ServerAndOrganizationsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def addCodePlayground(host: String, name: String, pygmentsLanguage: String, urlPrefix: String)(implicit nameQuery: QueryParam[String], pygmentsLanguageQuery: QueryParam[String], urlPrefixQuery: QueryParam[String]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/realm/playgrounds"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("name", Some(nameQuery.toParamString(name))), ("pygmentsLanguage", Some(pygments_languageQuery.toParamString(pygments_language))), ("urlPrefix", Some(url_prefixQuery.toParamString(url_prefix))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def addLinkifier(host: String, pattern: String, urlFormatString: String)(implicit patternQuery: QueryParam[String], urlFormatStringQuery: QueryParam[String]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/realm/filters"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pattern", Some(patternQuery.toParamString(pattern))), ("urlFormatString", Some(url_format_stringQuery.toParamString(url_format_string))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def createCustomProfileField(host: String, fieldType: Integer, name: String, hint: String, fieldData: Any)(implicit nameQuery: QueryParam[String], hintQuery: QueryParam[String], fieldTypeQuery: QueryParam[Integer], fieldDataQuery: QueryParam[Any]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/realm/profile_fields"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("name", Some(nameQuery.toParamString(name))), ("hint", Some(hintQuery.toParamString(hint))), ("fieldType", Some(field_typeQuery.toParamString(field_type))), ("fieldData", Some(field_dataQuery.toParamString(field_data))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getCustomEmoji(host: String): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/realm/emoji"
    
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
  
  def getCustomProfileFields(host: String): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/realm/profile_fields"
    
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
  
  def getLinkifiers(host: String): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/realm/linkifiers"
    
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
  
  def getServerSettings(host: String): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/server_settings"
    
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
  
  def removeCodePlayground(host: String, playgroundId: Integer): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/realm/playgrounds/{playground_id}".replaceAll("\\{" + "playground_id" + "\\}",escape(playgroundId.toString))
    
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
  
  def removeLinkifier(host: String, filterId: Integer): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/realm/filters/{filter_id}".replaceAll("\\{" + "filter_id" + "\\}",escape(filterId.toString))
    
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
  
  def reorderCustomProfileFields(host: String, order: List[Integer] = List.empty[Integer] )(implicit orderQuery: QueryParam[List[Integer]]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/realm/profile_fields"
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("order", Some(orderQuery.toParamString(order))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def updateLinkifier(host: String, filterId: Integer, pattern: String, urlFormatString: String)(implicit patternQuery: QueryParam[String], urlFormatStringQuery: QueryParam[String]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/realm/filters/{filter_id}".replaceAll("\\{" + "filter_id" + "\\}",escape(filterId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pattern", Some(patternQuery.toParamString(pattern))), ("urlFormatString", Some(url_format_stringQuery.toParamString(url_format_string))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def uploadCustomEmoji(host: String, emojiName: String, filename: File): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/realm/emoji/{emoji_name}".replaceAll("\\{" + "emoji_name" + "\\}",escape(emojiName.toString))
    
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
  
}

class HttpServiceServerAndOrganizationsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def addCodePlayground(name: String, pygmentsLanguage: String, urlPrefix: String)(implicit nameQuery: QueryParam[String], pygmentsLanguageQuery: QueryParam[String], urlPrefixQuery: QueryParam[String]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/realm/playgrounds"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("name", Some(nameQuery.toParamString(name))), ("pygmentsLanguage", Some(pygments_languageQuery.toParamString(pygments_language))), ("urlPrefix", Some(url_prefixQuery.toParamString(url_prefix))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def addLinkifier(pattern: String, urlFormatString: String)(implicit patternQuery: QueryParam[String], urlFormatStringQuery: QueryParam[String]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/realm/filters"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pattern", Some(patternQuery.toParamString(pattern))), ("urlFormatString", Some(url_format_stringQuery.toParamString(url_format_string))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def createCustomProfileField(fieldType: Integer, name: String, hint: String, fieldData: Any)(implicit nameQuery: QueryParam[String], hintQuery: QueryParam[String], fieldTypeQuery: QueryParam[Integer], fieldDataQuery: QueryParam[Any]): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/realm/profile_fields"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("name", Some(nameQuery.toParamString(name))), ("hint", Some(hintQuery.toParamString(hint))), ("fieldType", Some(field_typeQuery.toParamString(field_type))), ("fieldData", Some(field_dataQuery.toParamString(field_data))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccessBase](req)

    } yield resp
  }
  
  def getCustomEmoji(): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/realm/emoji"
    
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
  
  def getCustomProfileFields(): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/realm/profile_fields"
    
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
  
  def getLinkifiers(): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/realm/linkifiers"
    
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
  
  def getServerSettings(): Task[JsonSuccessBase] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccessBase] = jsonOf[JsonSuccessBase]

    val path = "/server_settings"
    
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
  
  def removeCodePlayground(playgroundId: Integer): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/realm/playgrounds/{playground_id}".replaceAll("\\{" + "playground_id" + "\\}",escape(playgroundId.toString))
    
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
  
  def removeLinkifier(filterId: Integer): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/realm/filters/{filter_id}".replaceAll("\\{" + "filter_id" + "\\}",escape(filterId.toString))
    
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
  
  def reorderCustomProfileFields(order: List[Integer] = List.empty[Integer] )(implicit orderQuery: QueryParam[List[Integer]]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/realm/profile_fields"
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("order", Some(orderQuery.toParamString(order))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def updateLinkifier(filterId: Integer, pattern: String, urlFormatString: String)(implicit patternQuery: QueryParam[String], urlFormatStringQuery: QueryParam[String]): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/realm/filters/{filter_id}".replaceAll("\\{" + "filter_id" + "\\}",escape(filterId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pattern", Some(patternQuery.toParamString(pattern))), ("urlFormatString", Some(url_format_stringQuery.toParamString(url_format_string))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[JsonSuccess](req)

    } yield resp
  }
  
  def uploadCustomEmoji(emojiName: String, filename: File): Task[JsonSuccess] = {
    implicit val returnTypeDecoder: EntityDecoder[JsonSuccess] = jsonOf[JsonSuccess]

    val path = "/realm/emoji/{emoji_name}".replaceAll("\\{" + "emoji_name" + "\\}",escape(emojiName.toString))
    
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
  
}
