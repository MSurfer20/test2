package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for JsonErrorBase_allOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:42:55.656112Z[Etc/UTC]")
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

