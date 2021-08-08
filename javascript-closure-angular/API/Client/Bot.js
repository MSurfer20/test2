goog.provide('API.Client.Bot');

/**
 * @record
 */
API.Client.Bot = function() {}

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.Bot.prototype.userId;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.Bot.prototype.fullName;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.Bot.prototype.apiKey;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.Bot.prototype.defaultSendingStream;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.Bot.prototype.defaultEventsRegisterStream;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.Bot.prototype.defaultAllPublicStreams;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.Bot.prototype.avatarUrl;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.Bot.prototype.ownerId;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.Bot.prototype.services;

/**
 * The email of the bot. 
 * @type {!string}
 * @export
 */
API.Client.Bot.prototype.email;

/**
 * An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
 * @type {!number}
 * @export
 */
API.Client.Bot.prototype.botType;

/**
 * A boolean describing whether the user account has been deactivated. 
 * @type {!boolean}
 * @export
 */
API.Client.Bot.prototype.isActive;

