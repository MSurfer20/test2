
package org.openapitools.client.model


case class UserBase (
    /* The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else.  */
    _email: Option[String],
    /* A boolean specifying whether the user is a bot or full account.  */
    _isBot: Option[Boolean],
    /* URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion.  */
    _avatarUrl: Option[String],
    /* Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`.  */
    _avatarVersion: Option[Integer],
    /* Full name of the user or bot, used for all display purposes.  */
    _fullName: Option[String],
    /* A boolean specifying whether the user is an organization administrator.  */
    _isAdmin: Option[Boolean],
    /* A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8).  */
    _isOwner: Option[Boolean],
    /* A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73).  */
    _isBillingAdmin: Option[Boolean],
    /* [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59).  */
    _role: Option[Integer],
    /* An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot.  */
    _botType: Option[Integer],
    /* The unique ID of the user.  */
    _userId: Option[Integer],
    /* If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner.  */
    _botOwnerId: Option[Integer],
    /* A boolean specifying whether the user account has been deactivated.  */
    _isActive: Option[Boolean],
    /* A boolean specifying whether the user is a guest user.  */
    _isGuest: Option[Boolean],
    /* The time zone of the user.  */
    _timezone: Option[String],
    /* The time the user account was created.  */
    _dateJoined: Option[String],
    /* The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy.  */
    _deliveryEmail: Option[String],
    /* A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present.  */
    _profileData: Option[Map[String, Any]]
)
object UserBase {
    def toStringBody(var_email: Object, var_isBot: Object, var_avatarUrl: Object, var_avatarVersion: Object, var_fullName: Object, var_isAdmin: Object, var_isOwner: Object, var_isBillingAdmin: Object, var_role: Object, var_botType: Object, var_userId: Object, var_botOwnerId: Object, var_isActive: Object, var_isGuest: Object, var_timezone: Object, var_dateJoined: Object, var_deliveryEmail: Object, var_profileData: Object) =
        s"""
        | {
        | "email":$var_email,"isBot":$var_isBot,"avatarUrl":$var_avatarUrl,"avatarVersion":$var_avatarVersion,"fullName":$var_fullName,"isAdmin":$var_isAdmin,"isOwner":$var_isOwner,"isBillingAdmin":$var_isBillingAdmin,"role":$var_role,"botType":$var_botType,"userId":$var_userId,"botOwnerId":$var_botOwnerId,"isActive":$var_isActive,"isGuest":$var_isGuest,"timezone":$var_timezone,"dateJoined":$var_dateJoined,"deliveryEmail":$var_deliveryEmail,"profileData":$var_profileData
        | }
        """.stripMargin
}
