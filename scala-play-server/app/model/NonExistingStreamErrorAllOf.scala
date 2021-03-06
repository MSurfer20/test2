package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NonExistingStreamError_allOf.
  * @param stream The name of the stream that could not be found. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class NonExistingStreamErrorAllOf(
  result: Option[OasAnyTypeNotMapped],
  msg: Option[OasAnyTypeNotMapped],
  code: Option[OasAnyTypeNotMapped],
  stream: Option[String]
)

object NonExistingStreamErrorAllOf {
  implicit lazy val nonExistingStreamErrorAllOfJsonFormat: Format[NonExistingStreamErrorAllOf] = Json.format[NonExistingStreamErrorAllOf]
}

