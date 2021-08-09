package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RealmDeactivatedError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-09T21:37:15.417726Z[Etc/UTC]")
case class RealmDeactivatedError(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped,
  code: Option[OasAnyTypeNotMapped]
)

object RealmDeactivatedError {
  implicit lazy val realmDeactivatedErrorJsonFormat: Format[RealmDeactivatedError] = Json.format[RealmDeactivatedError]
}

