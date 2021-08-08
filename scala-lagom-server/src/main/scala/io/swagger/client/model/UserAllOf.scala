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

case class UserAllOf (
                  email: Option[AnyType],
                  isBot: Option[AnyType],
                  avatarUrl: Option[AnyType],
                  avatarVersion: Option[AnyType],
                  fullName: Option[AnyType],
                  isAdmin: Option[AnyType],
                  isOwner: Option[AnyType],
                  isBillingAdmin: Option[AnyType],
                  role: Option[AnyType],
                  botType: Option[AnyType],
                  userId: Option[AnyType],
                  botOwnerId: Option[AnyType],
                  isActive: Option[AnyType],
                  isGuest: Option[AnyType],
                  timezone: Option[AnyType],
                  dateJoined: Option[AnyType],
                  deliveryEmail: Option[AnyType],
                  profileData: Option[AnyType]
)

object UserAllOf {
implicit val format: Format[UserAllOf] = Json.format
}

