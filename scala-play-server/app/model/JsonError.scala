package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for JsonError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class JsonError(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped
)

object JsonError {
  implicit lazy val jsonErrorJsonFormat: Format[JsonError] = Json.format[JsonError]
}

