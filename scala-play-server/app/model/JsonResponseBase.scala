package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for JsonResponseBase.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class JsonResponseBase(
  result: Option[String]
)

object JsonResponseBase {
  implicit lazy val jsonResponseBaseJsonFormat: Format[JsonResponseBase] = Json.format[JsonResponseBase]
}

