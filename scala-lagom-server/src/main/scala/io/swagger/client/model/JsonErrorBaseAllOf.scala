/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.swagger.client.model
import play.api.libs.json._

case class JsonErrorBaseAllOf (
                  result:  Option[JsonErrorBaseAllOfResultEnum.JsonErrorBaseAllOfResultEnum],
                  msg: String
)

object JsonErrorBaseAllOf {
implicit val format: Format[JsonErrorBaseAllOf] = Json.format
}

object JsonErrorBaseAllOfResultEnum extends Enumeration {
  val   error = Value
  type JsonErrorBaseAllOfResultEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[JsonErrorBaseAllOfResultEnum.type])
}
