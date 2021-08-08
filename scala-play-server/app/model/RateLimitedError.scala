package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RateLimitedError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:15:24.853051Z[Etc/UTC]")
case class RateLimitedError(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped,
  code: Option[OasAnyTypeNotMapped]
)

object RateLimitedError {
  implicit lazy val rateLimitedErrorJsonFormat: Format[RateLimitedError] = Json.format[RateLimitedError]
}

