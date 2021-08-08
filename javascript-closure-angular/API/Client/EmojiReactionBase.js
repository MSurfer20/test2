goog.provide('API.Client.EmojiReactionBase');

/**
 * @record
 */
API.Client.EmojiReactionBase = function() {}

/**
 * A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint. 
 * @type {!string}
 * @export
 */
API.Client.EmojiReactionBase.prototype.emojiCode;

/**
 * Name of the emoji. 
 * @type {!string}
 * @export
 */
API.Client.EmojiReactionBase.prototype.emojiName;

/**
 * One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
 * @type {!string}
 * @export
 */
API.Client.EmojiReactionBase.prototype.reactionType;

/**
 * The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
 * @type {!number}
 * @export
 */
API.Client.EmojiReactionBase.prototype.userId;

/**
 * @type {!API.Client.EmojiReactionBase_user}
 * @export
 */
API.Client.EmojiReactionBase.prototype.user;

