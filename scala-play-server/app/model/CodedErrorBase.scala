package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CodedErrorBase.
  * @param code A string that identifies the error. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:42:55.656112Z[Etc/UTC]")
case class CodedErrorBase(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped,
  code: Option[String]
)

object CodedErrorBase {
  implicit lazy val codedErrorBaseJsonFormat: Format[CodedErrorBase] = Json.format[CodedErrorBase]
}

