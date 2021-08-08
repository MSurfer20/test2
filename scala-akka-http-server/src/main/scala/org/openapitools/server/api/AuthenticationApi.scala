package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.ApiKeyResponse


class AuthenticationApi(
    authenticationService: AuthenticationApiService,
    authenticationMarshaller: AuthenticationApiMarshaller
) {

  
  import authenticationMarshaller._

  lazy val route: Route =
    path("dev_fetch_api_key") { 
      post { 
        parameters("username".as[String]) { (username) => 
            authenticationService.devFetchApiKey(username = username)
        }
      }
    } ~
    path("fetch_api_key") { 
      post { 
        parameters("username".as[String], "password".as[String]) { (username, password) => 
            authenticationService.fetchApiKey(username = username, password = password)
        }
      }
    }
}


trait AuthenticationApiService {

  def devFetchApiKey200(responseApiKeyResponse: ApiKeyResponse)(implicit toEntityMarshallerApiKeyResponse: ToEntityMarshaller[ApiKeyResponse]): Route =
    complete((200, responseApiKeyResponse))
  /**
   * Code: 200, Message: Success., DataType: ApiKeyResponse
   */
  def devFetchApiKey(username: String)
      (implicit toEntityMarshallerApiKeyResponse: ToEntityMarshaller[ApiKeyResponse]): Route

  def fetchApiKey200(responseApiKeyResponse: ApiKeyResponse)(implicit toEntityMarshallerApiKeyResponse: ToEntityMarshaller[ApiKeyResponse]): Route =
    complete((200, responseApiKeyResponse))
  /**
   * Code: 200, Message: Valid credentials the client can use to access the Zulip API., DataType: ApiKeyResponse
   */
  def fetchApiKey(username: String, password: String)
      (implicit toEntityMarshallerApiKeyResponse: ToEntityMarshaller[ApiKeyResponse]): Route

}

trait AuthenticationApiMarshaller {


  implicit def toEntityMarshallerApiKeyResponse: ToEntityMarshaller[ApiKeyResponse]

}

