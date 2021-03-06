package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for JsonSuccessBase_allOf.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class JsonSuccessBaseAllOf(
  result: JsonSuccessBaseAllOf.Result.Value,
  msg: String
)

object JsonSuccessBaseAllOf {
  implicit lazy val jsonSuccessBaseAllOfJsonFormat: Format[JsonSuccessBaseAllOf] = Json.format[JsonSuccessBaseAllOf]

  // noinspection TypeAnnotation
  object Result extends Enumeration {
    val Success = Value("success")

    type Result = Value
    implicit lazy val ResultJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

