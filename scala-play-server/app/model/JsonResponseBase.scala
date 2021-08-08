package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for JsonResponseBase.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:15:31.623147Z[Etc/UTC]")
case class JsonResponseBase(
  result: Option[String]
)

object JsonResponseBase {
  implicit lazy val jsonResponseBaseJsonFormat: Format[JsonResponseBase] = Json.format[JsonResponseBase]
}

