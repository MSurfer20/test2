package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RealmDeactivatedError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:15:31.623147Z[Etc/UTC]")
case class RealmDeactivatedError(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped,
  code: Option[OasAnyTypeNotMapped]
)

object RealmDeactivatedError {
  implicit lazy val realmDeactivatedErrorJsonFormat: Format[RealmDeactivatedError] = Json.format[RealmDeactivatedError]
}

