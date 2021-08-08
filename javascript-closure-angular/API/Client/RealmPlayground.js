goog.provide('API.Client.RealmPlayground');

/**
 * Object containing details about a realm playground. 
 * @record
 */
API.Client.RealmPlayground = function() {}

/**
 * The unique ID for the realm playground. 
 * @type {!number}
 * @export
 */
API.Client.RealmPlayground.prototype.id;

/**
 * The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
 * @type {!string}
 * @export
 */
API.Client.RealmPlayground.prototype.name;

/**
 * The name of the Pygments language lexer for that programming language. 
 * @type {!string}
 * @export
 */
API.Client.RealmPlayground.prototype.pygmentsLanguage;

/**
 * The url prefix for the playground. 
 * @type {!string}
 * @export
 */
API.Client.RealmPlayground.prototype.urlPrefix;

