package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * A dictionary containing basic data on a given Zulip user. 
 * @param email The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. 
 * @param isUnderscorebot A boolean specifying whether the user is a bot or full account. 
 * @param avatarUnderscoreurl URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion. 
 * @param avatarUnderscoreversion Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. 
 * @param fullUnderscorename Full name of the user or bot, used for all display purposes. 
 * @param isUnderscoreadmin A boolean specifying whether the user is an organization administrator. 
 * @param isUnderscoreowner A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). 
 * @param isUnderscorebillingUnderscoreadmin A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). 
 * @param role [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
 * @param botUnderscoretype An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
 * @param userUnderscoreid The unique ID of the user. 
 * @param botUnderscoreownerUnderscoreid If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner. 
 * @param isUnderscoreactive A boolean specifying whether the user account has been deactivated. 
 * @param isUnderscoreguest A boolean specifying whether the user is a guest user. 
 * @param timezone The time zone of the user. 
 * @param dateUnderscorejoined The time the user account was created. 
 * @param deliveryUnderscoreemail The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. 
 * @param profileUnderscoredata A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. 
 */
case class UserBase(email: Option[String],
                isUnderscorebot: Option[Boolean],
                avatarUnderscoreurl: Option[String],
                avatarUnderscoreversion: Option[Int],
                fullUnderscorename: Option[String],
                isUnderscoreadmin: Option[Boolean],
                isUnderscoreowner: Option[Boolean],
                isUnderscorebillingUnderscoreadmin: Option[Boolean],
                role: Option[Int],
                botUnderscoretype: Option[Int],
                userUnderscoreid: Option[Int],
                botUnderscoreownerUnderscoreid: Option[Int],
                isUnderscoreactive: Option[Boolean],
                isUnderscoreguest: Option[Boolean],
                timezone: Option[String],
                dateUnderscorejoined: Option[String],
                deliveryUnderscoreemail: Option[String],
                profileUnderscoredata: Option[Map[String, Object]]
                )

object UserBase {
    /**
     * Creates the codec for converting UserBase from and to JSON.
     */
    implicit val decoder: Decoder[UserBase] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserBase] = deriveEncoder
}
