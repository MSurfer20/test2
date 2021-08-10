package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for InvalidApiKeyError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-10T11:47:30.086135Z[Etc/UTC]")
case class InvalidApiKeyError(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped
)

object InvalidApiKeyError {
  implicit lazy val invalidApiKeyErrorJsonFormat: Format[InvalidApiKeyError] = Json.format[InvalidApiKeyError]
}

