package org.openapitools.server.model


/**
 * A dictionary containing basic data on a given Zulip user. 
 *
 * @param email The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else.  for example: ''null''
 * @param isBot A boolean specifying whether the user is a bot or full account.  for example: ''null''
 * @param avatarUrl URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion.  for example: ''null''
 * @param avatarVersion Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`.  for example: ''null''
 * @param fullName Full name of the user or bot, used for all display purposes.  for example: ''null''
 * @param isAdmin A boolean specifying whether the user is an organization administrator.  for example: ''null''
 * @param isOwner A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8).  for example: ''null''
 * @param isBillingAdmin A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73).  for example: ''null''
 * @param role [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59).  for example: ''null''
 * @param botType An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot.  for example: ''null''
 * @param userId The unique ID of the user.  for example: ''null''
 * @param botOwnerId If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner.  for example: ''null''
 * @param isActive A boolean specifying whether the user account has been deactivated.  for example: ''null''
 * @param isGuest A boolean specifying whether the user is a guest user.  for example: ''null''
 * @param timezone The time zone of the user.  for example: ''null''
 * @param dateJoined The time the user account was created.  for example: ''null''
 * @param deliveryEmail The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy.  for example: ''null''
 * @param profileData A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present.  for example: ''null''
*/
final case class UserBase (
  email: Option[String],
  isBot: Option[Boolean],
  avatarUrl: Option[String],
  avatarVersion: Option[Int],
  fullName: Option[String],
  isAdmin: Option[Boolean],
  isOwner: Option[Boolean],
  isBillingAdmin: Option[Boolean],
  role: Option[Int],
  botType: Option[Int],
  userId: Option[Int],
  botOwnerId: Option[Int],
  isActive: Option[Boolean],
  isGuest: Option[Boolean],
  timezone: Option[String],
  dateJoined: Option[String],
  deliveryEmail: Option[String],
  profileData: Option[Map[String, Any]]
)

