package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for InvalidApiKeyError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class InvalidApiKeyError(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped
)

object InvalidApiKeyError {
  implicit lazy val invalidApiKeyErrorJsonFormat: Format[InvalidApiKeyError] = Json.format[InvalidApiKeyError]
}

