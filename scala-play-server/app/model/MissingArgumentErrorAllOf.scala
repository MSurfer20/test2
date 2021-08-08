package model

import play.api.libs.json._

/**
  * ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
  * @param varName It contains the information about the missing parameter. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:15:31.623147Z[Etc/UTC]")
case class MissingArgumentErrorAllOf(
  result: Option[OasAnyTypeNotMapped],
  msg: Option[OasAnyTypeNotMapped],
  code: Option[OasAnyTypeNotMapped],
  varName: Option[String]
)

object MissingArgumentErrorAllOf {
  implicit lazy val missingArgumentErrorAllOfJsonFormat: Format[MissingArgumentErrorAllOf] = Json.format[MissingArgumentErrorAllOf]
}

