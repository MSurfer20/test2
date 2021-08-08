goog.provide('API.Client.UserGroup');

/**
 * Object containing the user group's attributes. 
 * @record
 */
API.Client.UserGroup = function() {}

/**
 * The name of the user group. 
 * @type {!string}
 * @export
 */
API.Client.UserGroup.prototype.name;

/**
 * The description of the user group. 
 * @type {!string}
 * @export
 */
API.Client.UserGroup.prototype.description;

/**
 * Array containing the id of the users who are members of this user group. 
 * @type {!Array<!number>}
 * @export
 */
API.Client.UserGroup.prototype.members;

/**
 * The ID of the user group. 
 * @type {!number}
 * @export
 */
API.Client.UserGroup.prototype.id;

