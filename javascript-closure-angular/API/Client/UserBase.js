goog.provide('API.Client.UserBase');

/**
 * A dictionary containing basic data on a given Zulip user. 
 * @record
 */
API.Client.UserBase = function() {}

/**
 * The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. 
 * @type {!string}
 * @export
 */
API.Client.UserBase.prototype.email;

/**
 * A boolean specifying whether the user is a bot or full account. 
 * @type {!boolean}
 * @export
 */
API.Client.UserBase.prototype.isBot;

/**
 * URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion. 
 * @type {!string}
 * @export
 */
API.Client.UserBase.prototype.avatarUrl;

/**
 * Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. 
 * @type {!number}
 * @export
 */
API.Client.UserBase.prototype.avatarVersion;

/**
 * Full name of the user or bot, used for all display purposes. 
 * @type {!string}
 * @export
 */
API.Client.UserBase.prototype.fullName;

/**
 * A boolean specifying whether the user is an organization administrator. 
 * @type {!boolean}
 * @export
 */
API.Client.UserBase.prototype.isAdmin;

/**
 * A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). 
 * @type {!boolean}
 * @export
 */
API.Client.UserBase.prototype.isOwner;

/**
 * A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). 
 * @type {!boolean}
 * @export
 */
API.Client.UserBase.prototype.isBillingAdmin;

/**
 * [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
 * @type {!number}
 * @export
 */
API.Client.UserBase.prototype.role;

/**
 * An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
 * @type {!number}
 * @export
 */
API.Client.UserBase.prototype.botType;

/**
 * The unique ID of the user. 
 * @type {!number}
 * @export
 */
API.Client.UserBase.prototype.userId;

/**
 * If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner. 
 * @type {!number}
 * @export
 */
API.Client.UserBase.prototype.botOwnerId;

/**
 * A boolean specifying whether the user account has been deactivated. 
 * @type {!boolean}
 * @export
 */
API.Client.UserBase.prototype.isActive;

/**
 * A boolean specifying whether the user is a guest user. 
 * @type {!boolean}
 * @export
 */
API.Client.UserBase.prototype.isGuest;

/**
 * The time zone of the user. 
 * @type {!string}
 * @export
 */
API.Client.UserBase.prototype.timezone;

/**
 * The time the user account was created. 
 * @type {!string}
 * @export
 */
API.Client.UserBase.prototype.dateJoined;

/**
 * The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. 
 * @type {!string}
 * @export
 */
API.Client.UserBase.prototype.deliveryEmail;

/**
 * A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. 
 * @type {!Object<!string, API.Client.Object>}
 * @export
 */
API.Client.UserBase.prototype.profileData;

/** @enum {string} */
API.Client.UserBase.RoleEnum = { 
  100: '100',
  200: '200',
  300: '300',
  400: '400',
  600: '600',
}
