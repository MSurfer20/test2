package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for InvalidMessageError.
  * @param rawContent The raw content of the message. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-09T21:37:15.417726Z[Etc/UTC]")
case class InvalidMessageError(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped,
  rawContent: Option[String]
)

object InvalidMessageError {
  implicit lazy val invalidMessageErrorJsonFormat: Format[InvalidMessageError] = Json.format[InvalidMessageError]
}

