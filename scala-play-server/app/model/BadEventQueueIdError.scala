package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BadEventQueueIdError.
  * @param queueId The string that identifies the invalid event queue. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class BadEventQueueIdError(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped,
  code: Option[OasAnyTypeNotMapped],
  queueId: Option[String]
)

object BadEventQueueIdError {
  implicit lazy val badEventQueueIdErrorJsonFormat: Format[BadEventQueueIdError] = Json.format[BadEventQueueIdError]
}

