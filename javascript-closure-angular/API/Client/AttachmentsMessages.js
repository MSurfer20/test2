goog.provide('API.Client.Attachments_messages');

/**
 * @record
 */
API.Client.AttachmentsMessages = function() {}

/**
 * Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. 
 * @type {!number}
 * @export
 */
API.Client.AttachmentsMessages.prototype.dateSent;

/**
 * The unique message ID.  Messages should always be displayed sorted by ID. 
 * @type {!number}
 * @export
 */
API.Client.AttachmentsMessages.prototype.id;

