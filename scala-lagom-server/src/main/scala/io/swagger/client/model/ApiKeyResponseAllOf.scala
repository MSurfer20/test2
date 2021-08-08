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

case class ApiKeyResponseAllOf (
                  result: Option[AnyType],
                  msg: Option[AnyType],
            /* The API key that can be used to authenticate as the requested user.  */
                  apiKey: String,
            /* The email address of the user who owns the API key  */
                  email: String
)

object ApiKeyResponseAllOf {
implicit val format: Format[ApiKeyResponseAllOf] = Json.format
}
