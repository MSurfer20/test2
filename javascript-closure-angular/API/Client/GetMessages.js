goog.provide('API.Client.GetMessages');

/**
 * @record
 */
API.Client.GetMessages = function() {}

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessages.prototype.avatarUrl;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessages.prototype.client;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessages.prototype.content;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessages.prototype.contentType;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessages.prototype.displayRecipient;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessages.prototype.id;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessages.prototype.isMeMessage;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessages.prototype.reactions;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessages.prototype.recipientId;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessages.prototype.senderEmail;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessages.prototype.senderFullName;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessages.prototype.senderId;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessages.prototype.senderRealmStr;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessages.prototype.streamId;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessages.prototype.subject;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessages.prototype.topicLinks;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessages.prototype.submessages;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessages.prototype.timestamp;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.GetMessages.prototype.type;

/**
 * The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
 * @type {!Array<!string>}
 * @export
 */
API.Client.GetMessages.prototype.flags;

/**
 * The UNIX timestamp for when the message was last edited, in UTC seconds. 
 * @type {!number}
 * @export
 */
API.Client.GetMessages.prototype.lastEditTimestamp;

/**
 * Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
 * @type {!string}
 * @export
 */
API.Client.GetMessages.prototype.matchContent;

/**
 * Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
 * @type {!string}
 * @export
 */
API.Client.GetMessages.prototype.matchSubject;

