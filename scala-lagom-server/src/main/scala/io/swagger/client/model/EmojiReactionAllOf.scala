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

case class EmojiReactionAllOf (
                  emojiCode: Option[AnyType],
                  emojiName: Option[AnyType],
                  reactionType: Option[AnyType],
                  userId: Option[AnyType],
                  user: Option[AnyType]
)

object EmojiReactionAllOf {
implicit val format: Format[EmojiReactionAllOf] = Json.format
}
