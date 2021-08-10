package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserNotAuthorizedError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-10T11:47:30.086135Z[Etc/UTC]")
case class UserNotAuthorizedError(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped,
  code: Option[OasAnyTypeNotMapped]
)

object UserNotAuthorizedError {
  implicit lazy val userNotAuthorizedErrorJsonFormat: Format[UserNotAuthorizedError] = Json.format[UserNotAuthorizedError]
}

