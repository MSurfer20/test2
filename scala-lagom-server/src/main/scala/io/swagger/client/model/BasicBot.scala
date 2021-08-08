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

case class BasicBot (
                  userId: Option[AnyType],
                  fullName: Option[AnyType],
                  apiKey: Option[AnyType],
                  defaultSendingStream: Option[AnyType],
                  defaultEventsRegisterStream: Option[AnyType],
                  defaultAllPublicStreams: Option[AnyType],
                  avatarUrl: Option[AnyType],
                  ownerId: Option[AnyType],
                  services: Option[AnyType]
)

object BasicBot {
implicit val format: Format[BasicBot] = Json.format
}

