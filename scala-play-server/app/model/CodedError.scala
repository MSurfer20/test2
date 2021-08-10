package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CodedError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-10T11:47:30.086135Z[Etc/UTC]")
case class CodedError(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped,
  code: Option[OasAnyTypeNotMapped]
)

object CodedError {
  implicit lazy val codedErrorJsonFormat: Format[CodedError] = Json.format[CodedError]
}

