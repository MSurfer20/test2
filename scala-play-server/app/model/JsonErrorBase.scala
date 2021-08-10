package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for JsonErrorBase.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-10T11:47:30.086135Z[Etc/UTC]")
case class JsonErrorBase(
  result: JsonErrorBase.Result.Value,
  msg: String
)

object JsonErrorBase {
  implicit lazy val jsonErrorBaseJsonFormat: Format[JsonErrorBase] = Json.format[JsonErrorBase]

  // noinspection TypeAnnotation
  object Result extends Enumeration {
    val Error = Value("error")

    type Result = Value
    implicit lazy val ResultJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

