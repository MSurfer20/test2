package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ApiKeyResponse.
  * @param apiKey The API key that can be used to authenticate as the requested user. 
  * @param email The email address of the user who owns the API key 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:42:55.656112Z[Etc/UTC]")
case class ApiKeyResponse(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped,
  apiKey: String,
  email: String
)

object ApiKeyResponse {
  implicit lazy val apiKeyResponseJsonFormat: Format[ApiKeyResponse] = Json.format[ApiKeyResponse]
}

