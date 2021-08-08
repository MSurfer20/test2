package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserDeactivatedError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:42:55.656112Z[Etc/UTC]")
case class UserDeactivatedError(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped,
  code: Option[OasAnyTypeNotMapped]
)

object UserDeactivatedError {
  implicit lazy val userDeactivatedErrorJsonFormat: Format[UserDeactivatedError] = Json.format[UserDeactivatedError]
}

