goog.provide('API.Client.Bot_allOf');

/**
 * Object containing details of a bot. 
 * @record
 */
API.Client.BotAllOf = function() {}

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.BotAllOf.prototype.userId;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.BotAllOf.prototype.fullName;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.BotAllOf.prototype.apiKey;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.BotAllOf.prototype.defaultSendingStream;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.BotAllOf.prototype.defaultEventsRegisterStream;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.BotAllOf.prototype.defaultAllPublicStreams;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.BotAllOf.prototype.avatarUrl;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.BotAllOf.prototype.ownerId;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.BotAllOf.prototype.services;

/**
 * The email of the bot. 
 * @type {!string}
 * @export
 */
API.Client.BotAllOf.prototype.email;

/**
 * An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
 * @type {!number}
 * @export
 */
API.Client.BotAllOf.prototype.botType;

/**
 * A boolean describing whether the user account has been deactivated. 
 * @type {!boolean}
 * @export
 */
API.Client.BotAllOf.prototype.isActive;

