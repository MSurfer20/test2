package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for JsonSuccess.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class JsonSuccess(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped
)

object JsonSuccess {
  implicit lazy val jsonSuccessJsonFormat: Format[JsonSuccess] = Json.format[JsonSuccess]
}

