goog.provide('API.Client.GetMessages_allOf');

/**
 * @record
 */
API.Client.GetMessagesAllOf = function() {}

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.avatarUrl;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.client;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.content;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.contentType;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.displayRecipient;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.id;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.isMeMessage;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.reactions;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.recipientId;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.senderEmail;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.senderFullName;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.senderId;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.senderRealmStr;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.streamId;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.subject;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.topicLinks;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.submessages;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.timestamp;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.type;

/**
 * The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
 * @type {!Array<!string>}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.flags;

/**
 * The UNIX timestamp for when the message was last edited, in UTC seconds. 
 * @type {!number}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.lastEditTimestamp;

/**
 * Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
 * @type {!string}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.matchContent;

/**
 * Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
 * @type {!string}
 * @export
 */
API.Client.GetMessagesAllOf.prototype.matchSubject;

