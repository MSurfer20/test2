goog.provide('API.Client.Draft');

/**
 * A dictionary for representing a message draft. 
 * @record
 */
API.Client.Draft = function() {}

/**
 * The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
 * @type {!number}
 * @export
 */
API.Client.Draft.prototype.id;

/**
 * The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
 * @type {!string}
 * @export
 */
API.Client.Draft.prototype.type;

/**
 * An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
 * @type {!Array<!number>}
 * @export
 */
API.Client.Draft.prototype.to;

/**
 * For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
 * @type {!string}
 * @export
 */
API.Client.Draft.prototype.topic;

/**
 * The body of the draft. Should not contain null bytes. 
 * @type {!string}
 * @export
 */
API.Client.Draft.prototype.content;

/**
 * A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
 * @type {!number}
 * @export
 */
API.Client.Draft.prototype.timestamp;

/** @enum {string} */
API.Client.Draft.TypeEnum = { 
  : '',
  stream: 'stream',
  private: 'private',
}
