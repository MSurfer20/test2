package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CodedError_allOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:23:09.886767Z[Etc/UTC]")
case class CodedErrorAllOf(
  result: Option[OasAnyTypeNotMapped],
  msg: Option[OasAnyTypeNotMapped],
  code: Option[OasAnyTypeNotMapped]
)

object CodedErrorAllOf {
  implicit lazy val codedErrorAllOfJsonFormat: Format[CodedErrorAllOf] = Json.format[CodedErrorAllOf]
}

