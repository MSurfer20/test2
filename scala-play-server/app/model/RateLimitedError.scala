package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RateLimitedError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class RateLimitedError(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped,
  code: Option[OasAnyTypeNotMapped]
)

object RateLimitedError {
  implicit lazy val rateLimitedErrorJsonFormat: Format[RateLimitedError] = Json.format[RateLimitedError]
}

