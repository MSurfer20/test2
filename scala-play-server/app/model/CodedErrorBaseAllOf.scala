package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CodedErrorBase_allOf.
  * @param code A string that identifies the error. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:42:55.656112Z[Etc/UTC]")
case class CodedErrorBaseAllOf(
  result: Option[OasAnyTypeNotMapped],
  msg: Option[OasAnyTypeNotMapped],
  code: Option[String]
)

object CodedErrorBaseAllOf {
  implicit lazy val codedErrorBaseAllOfJsonFormat: Format[CodedErrorBaseAllOf] = Json.format[CodedErrorBaseAllOf]
}

