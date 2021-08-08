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

case class MissingArgumentErrorAllOf (
                  result: Option[AnyType],
                  msg: Option[AnyType],
                  code: Option[AnyType],
            /* It contains the information about the missing parameter.  */
                  varName: Option[String]
)

object MissingArgumentErrorAllOf {
implicit val format: Format[MissingArgumentErrorAllOf] = Json.format
}

