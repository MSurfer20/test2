goog.provide('API.Client.DefaultStreamGroup');

/**
 * Dictionary containing details of a default stream group. 
 * @record
 */
API.Client.DefaultStreamGroup = function() {}

/**
 * Name of the default stream group. 
 * @type {!string}
 * @export
 */
API.Client.DefaultStreamGroup.prototype.name;

/**
 * Description of the default stream group. 
 * @type {!string}
 * @export
 */
API.Client.DefaultStreamGroup.prototype.description;

/**
 * id of the default stream group. 
 * @type {!number}
 * @export
 */
API.Client.DefaultStreamGroup.prototype.id;

/**
 * Array containing details about the streams in the default stream group. 
 * @type {!Array<!API.Client.BasicStream>}
 * @export
 */
API.Client.DefaultStreamGroup.prototype.streams;

