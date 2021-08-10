package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for JsonSuccessBase.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-10T11:47:30.086135Z[Etc/UTC]")
case class JsonSuccessBase(
  result: JsonSuccessBase.Result.Value,
  msg: String
)

object JsonSuccessBase {
  implicit lazy val jsonSuccessBaseJsonFormat: Format[JsonSuccessBase] = Json.format[JsonSuccessBase]

  // noinspection TypeAnnotation
  object Result extends Enumeration {
    val Success = Value("success")

    type Result = Value
    implicit lazy val ResultJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

