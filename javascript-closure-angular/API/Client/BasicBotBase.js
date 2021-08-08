goog.provide('API.Client.BasicBotBase');

/**
 * @record
 */
API.Client.BasicBotBase = function() {}

/**
 * The user id of the bot. 
 * @type {!number}
 * @export
 */
API.Client.BasicBotBase.prototype.userId;

/**
 * The full name of the bot. 
 * @type {!string}
 * @export
 */
API.Client.BasicBotBase.prototype.fullName;

/**
 * The API key of the bot which it uses to make API requests. 
 * @type {!string}
 * @export
 */
API.Client.BasicBotBase.prototype.apiKey;

/**
 * The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
 * @type {!string}
 * @export
 */
API.Client.BasicBotBase.prototype.defaultSendingStream;

/**
 * The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
 * @type {!string}
 * @export
 */
API.Client.BasicBotBase.prototype.defaultEventsRegisterStream;

/**
 * Whether the bot can send messages to all streams by default. 
 * @type {!boolean}
 * @export
 */
API.Client.BasicBotBase.prototype.defaultAllPublicStreams;

/**
 * The URL of the bot's avatar. 
 * @type {!string}
 * @export
 */
API.Client.BasicBotBase.prototype.avatarUrl;

/**
 * The user id of the bot's owner.  Null if the bot has no owner. 
 * @type {!number}
 * @export
 */
API.Client.BasicBotBase.prototype.ownerId;

/**
 * The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
 * @type {!Array<!API.Client.oneOf<object,object>>}
 * @export
 */
API.Client.BasicBotBase.prototype.services;

