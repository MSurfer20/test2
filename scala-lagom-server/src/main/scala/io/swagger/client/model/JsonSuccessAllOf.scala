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

case class JsonSuccessAllOf (
                  result: Option[AnyType],
                  msg: Option[AnyType]
)

object JsonSuccessAllOf {
implicit val format: Format[JsonSuccessAllOf] = Json.format
}

