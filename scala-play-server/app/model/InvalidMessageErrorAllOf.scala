package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for InvalidMessageError_allOf.
  * @param rawContent The raw content of the message. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class InvalidMessageErrorAllOf(
  result: Option[OasAnyTypeNotMapped],
  msg: Option[OasAnyTypeNotMapped],
  rawContent: Option[String]
)

object InvalidMessageErrorAllOf {
  implicit lazy val invalidMessageErrorAllOfJsonFormat: Format[InvalidMessageErrorAllOf] = Json.format[InvalidMessageErrorAllOf]
}

