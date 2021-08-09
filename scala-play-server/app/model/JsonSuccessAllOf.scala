package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for JsonSuccess_allOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-09T21:37:15.417726Z[Etc/UTC]")
case class JsonSuccessAllOf(
  result: Option[OasAnyTypeNotMapped],
  msg: Option[OasAnyTypeNotMapped]
)

object JsonSuccessAllOf {
  implicit lazy val jsonSuccessAllOfJsonFormat: Format[JsonSuccessAllOf] = Json.format[JsonSuccessAllOf]
}

