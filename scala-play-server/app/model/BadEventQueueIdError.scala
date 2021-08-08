package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BadEventQueueIdError.
  * @param queueId The string that identifies the invalid event queue. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:42:55.656112Z[Etc/UTC]")
case class BadEventQueueIdError(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped,
  code: Option[OasAnyTypeNotMapped],
  queueId: Option[String]
)

object BadEventQueueIdError {
  implicit lazy val badEventQueueIdErrorJsonFormat: Format[BadEventQueueIdError] = Json.format[BadEventQueueIdError]
}

