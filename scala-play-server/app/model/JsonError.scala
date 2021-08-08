package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for JsonError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:45:49.166589Z[Etc/UTC]")
case class JsonError(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped
)

object JsonError {
  implicit lazy val jsonErrorJsonFormat: Format[JsonError] = Json.format[JsonError]
}

