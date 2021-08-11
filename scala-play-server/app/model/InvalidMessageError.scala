package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for InvalidMessageError.
  * @param rawContent The raw content of the message. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class InvalidMessageError(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped,
  rawContent: Option[String]
)

object InvalidMessageError {
  implicit lazy val invalidMessageErrorJsonFormat: Format[InvalidMessageError] = Json.format[InvalidMessageError]
}

