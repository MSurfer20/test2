package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MissingArgumentError.
  * @param varName It contains the information about the missing parameter. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:42:55.656112Z[Etc/UTC]")
case class MissingArgumentError(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped,
  code: Option[OasAnyTypeNotMapped],
  varName: Option[String]
)

object MissingArgumentError {
  implicit lazy val missingArgumentErrorJsonFormat: Format[MissingArgumentError] = Json.format[MissingArgumentError]
}

