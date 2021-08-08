goog.provide('API.Client.RealmEmoji');

/**
 * `{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: 
 * @record
 */
API.Client.RealmEmoji = function() {}

/**
 * The ID for this emoji, same as the object's key. 
 * @type {!string}
 * @export
 */
API.Client.RealmEmoji.prototype.id;

/**
 * The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
 * @type {!string}
 * @export
 */
API.Client.RealmEmoji.prototype.name;

/**
 * The path relative to the organization's URL where the emoji's image can be found. 
 * @type {!string}
 * @export
 */
API.Client.RealmEmoji.prototype.sourceUrl;

/**
 * Whether the emoji has been deactivated or not. 
 * @type {!boolean}
 * @export
 */
API.Client.RealmEmoji.prototype.deactivated;

/**
 * The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
 * @type {!number}
 * @export
 */
API.Client.RealmEmoji.prototype.authorId;

