package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CodedError_allOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class CodedErrorAllOf(
  result: Option[OasAnyTypeNotMapped],
  msg: Option[OasAnyTypeNotMapped],
  code: Option[OasAnyTypeNotMapped]
)

object CodedErrorAllOf {
  implicit lazy val codedErrorAllOfJsonFormat: Format[CodedErrorAllOf] = Json.format[CodedErrorAllOf]
}

