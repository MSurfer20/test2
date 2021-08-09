package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for JsonSuccess.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-09T21:37:15.417726Z[Etc/UTC]")
case class JsonSuccess(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped
)

object JsonSuccess {
  implicit lazy val jsonSuccessJsonFormat: Format[JsonSuccess] = Json.format[JsonSuccess]
}

