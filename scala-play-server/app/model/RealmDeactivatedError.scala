package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RealmDeactivatedError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class RealmDeactivatedError(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped,
  code: Option[OasAnyTypeNotMapped]
)

object RealmDeactivatedError {
  implicit lazy val realmDeactivatedErrorJsonFormat: Format[RealmDeactivatedError] = Json.format[RealmDeactivatedError]
}

