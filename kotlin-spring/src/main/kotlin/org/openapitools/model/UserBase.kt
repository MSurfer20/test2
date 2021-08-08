package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * A dictionary containing basic data on a given Zulip user. 
 * @param email The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. 
 * @param isBot A boolean specifying whether the user is a bot or full account. 
 * @param avatarUrl URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion. 
 * @param avatarVersion Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. 
 * @param fullName Full name of the user or bot, used for all display purposes. 
 * @param isAdmin A boolean specifying whether the user is an organization administrator. 
 * @param isOwner A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). 
 * @param isBillingAdmin A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). 
 * @param role [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
 * @param botType An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
 * @param userId The unique ID of the user. 
 * @param botOwnerId If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner. 
 * @param isActive A boolean specifying whether the user account has been deactivated. 
 * @param isGuest A boolean specifying whether the user is a guest user. 
 * @param timezone The time zone of the user. 
 * @param dateJoined The time the user account was created. 
 * @param deliveryEmail The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. 
 * @param profileData A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. 
 */
data class UserBase(

    @field:JsonProperty("email") val email: kotlin.String? = null,

    @field:JsonProperty("is_bot") val isBot: kotlin.Boolean? = null,

    @field:JsonProperty("avatar_url") val avatarUrl: kotlin.String? = null,

    @field:JsonProperty("avatar_version") val avatarVersion: kotlin.Int? = null,

    @field:JsonProperty("full_name") val fullName: kotlin.String? = null,

    @field:JsonProperty("is_admin") val isAdmin: kotlin.Boolean? = null,

    @field:JsonProperty("is_owner") val isOwner: kotlin.Boolean? = null,

    @field:JsonProperty("is_billing_admin") val isBillingAdmin: kotlin.Boolean? = null,

    @field:JsonProperty("role") val role: UserBase.Role? = null,

    @field:JsonProperty("bot_type") val botType: kotlin.Int? = null,

    @field:JsonProperty("user_id") val userId: kotlin.Int? = null,

    @field:JsonProperty("bot_owner_id") val botOwnerId: kotlin.Int? = null,

    @field:JsonProperty("is_active") val isActive: kotlin.Boolean? = null,

    @field:JsonProperty("is_guest") val isGuest: kotlin.Boolean? = null,

    @field:JsonProperty("timezone") val timezone: kotlin.String? = null,

    @field:JsonProperty("date_joined") val dateJoined: kotlin.String? = null,

    @field:JsonProperty("delivery_email") val deliveryEmail: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("profile_data") val profileData: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null
) {

    /**
    * [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
    * Values: _100,_200,_300,_400,_600
    */
    enum class Role(val value: kotlin.Int) {
    
        @JsonProperty(100) _100(100),
    
        @JsonProperty(200) _200(200),
    
        @JsonProperty(300) _300(300),
    
        @JsonProperty(400) _400(400),
    
        @JsonProperty(600) _600(600);
    
    }

}

