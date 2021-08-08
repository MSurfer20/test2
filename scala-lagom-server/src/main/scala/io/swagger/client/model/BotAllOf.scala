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

case class BotAllOf (
                  userId: Option[AnyType],
                  fullName: Option[AnyType],
                  apiKey: Option[AnyType],
                  defaultSendingStream: Option[AnyType],
                  defaultEventsRegisterStream: Option[AnyType],
                  defaultAllPublicStreams: Option[AnyType],
                  avatarUrl: Option[AnyType],
                  ownerId: Option[AnyType],
                  services: Option[AnyType],
            /* The email of the bot.  */
                  email: Option[String],
            /* An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot.  */
                  botType: Option[Int],
            /* A boolean describing whether the user account has been deactivated.  */
                  isActive: Option[Boolean]
)

object BotAllOf {
implicit val format: Format[BotAllOf] = Json.format
}

