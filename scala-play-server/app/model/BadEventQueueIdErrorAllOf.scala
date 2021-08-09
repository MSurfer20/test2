package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BadEventQueueIdError_allOf.
  * @param queueId The string that identifies the invalid event queue. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-09T21:37:15.417726Z[Etc/UTC]")
case class BadEventQueueIdErrorAllOf(
  result: Option[OasAnyTypeNotMapped],
  msg: Option[OasAnyTypeNotMapped],
  code: Option[OasAnyTypeNotMapped],
  queueId: Option[String]
)

object BadEventQueueIdErrorAllOf {
  implicit lazy val badEventQueueIdErrorAllOfJsonFormat: Format[BadEventQueueIdErrorAllOf] = Json.format[BadEventQueueIdErrorAllOf]
}

