package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ApiKeyResponse_allOf.
  * @param apiKey The API key that can be used to authenticate as the requested user. 
  * @param email The email address of the user who owns the API key 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-09T21:37:15.417726Z[Etc/UTC]")
case class ApiKeyResponseAllOf(
  result: Option[OasAnyTypeNotMapped],
  msg: Option[OasAnyTypeNotMapped],
  apiKey: String,
  email: String
)

object ApiKeyResponseAllOf {
  implicit lazy val apiKeyResponseAllOfJsonFormat: Format[ApiKeyResponseAllOf] = Json.format[ApiKeyResponseAllOf]
}

