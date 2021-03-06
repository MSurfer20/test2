package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for JsonErrorBase_allOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class JsonErrorBaseAllOf(
  result: JsonErrorBaseAllOf.Result.Value,
  msg: String
)

object JsonErrorBaseAllOf {
  implicit lazy val jsonErrorBaseAllOfJsonFormat: Format[JsonErrorBaseAllOf] = Json.format[JsonErrorBaseAllOf]

  // noinspection TypeAnnotation
  object Result extends Enumeration {
    val Error = Value("error")

    type Result = Value
    implicit lazy val ResultJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

