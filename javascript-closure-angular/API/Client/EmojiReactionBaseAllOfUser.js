goog.provide('API.Client.EmojiReactionBase_allOf_user');

/**
 * Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. 
 * @record
 */
API.Client.EmojiReactionBaseAllOfUser = function() {}

/**
 * ID of the user. 
 * @type {!number}
 * @export
 */
API.Client.EmojiReactionBaseAllOfUser.prototype.id;

/**
 * Email of the user. 
 * @type {!string}
 * @export
 */
API.Client.EmojiReactionBaseAllOfUser.prototype.email;

/**
 * Full name of the user. 
 * @type {!string}
 * @export
 */
API.Client.EmojiReactionBaseAllOfUser.prototype.fullName;

/**
 * Whether the user is a mirror dummy. 
 * @type {!boolean}
 * @export
 */
API.Client.EmojiReactionBaseAllOfUser.prototype.isMirrorDummy;

