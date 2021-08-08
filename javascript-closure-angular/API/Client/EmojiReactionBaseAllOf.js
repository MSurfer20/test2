goog.provide('API.Client.EmojiReactionBase_allOf');

/**
 * @record
 */
API.Client.EmojiReactionBaseAllOf = function() {}

/**
 * The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
 * @type {!number}
 * @export
 */
API.Client.EmojiReactionBaseAllOf.prototype.userId;

/**
 * @type {!API.Client.EmojiReactionBase_allOf_user}
 * @export
 */
API.Client.EmojiReactionBaseAllOf.prototype.user;

