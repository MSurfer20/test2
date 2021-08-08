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

case class AddSubscriptionsResponse (
                  result: AnyType,
                  msg: AnyType,
            /* A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  */
                  subscribed: Option[Map[String, Seq[String]]],
            /* A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  */
                  alreadySubscribed: Option[Map[String, Seq[String]]],
            /* A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`.  */
                  unauthorized: Option[Seq[String]]
)

object AddSubscriptionsResponse {
implicit val format: Format[AddSubscriptionsResponse] = Json.format
}
