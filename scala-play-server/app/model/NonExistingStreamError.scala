package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NonExistingStreamError.
  * @param stream The name of the stream that could not be found. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class NonExistingStreamError(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped,
  code: Option[OasAnyTypeNotMapped],
  stream: Option[String]
)

object NonExistingStreamError {
  implicit lazy val nonExistingStreamErrorJsonFormat: Format[NonExistingStreamError] = Json.format[NonExistingStreamError]
}

