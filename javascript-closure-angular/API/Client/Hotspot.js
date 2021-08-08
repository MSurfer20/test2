goog.provide('API.Client.Hotspot');

/**
 * Dictionary containing details of a single hotspot. 
 * @record
 */
API.Client.Hotspot = function() {}

/**
 * The delay after which the user should be shown the hotspot. 
 * @type {!number}
 * @export
 */
API.Client.Hotspot.prototype.delay;

/**
 * The name of the hotspot. 
 * @type {!string}
 * @export
 */
API.Client.Hotspot.prototype.name;

/**
 * The title of the hotspot, as will be displayed to the user. 
 * @type {!string}
 * @export
 */
API.Client.Hotspot.prototype.title;

/**
 * The description of the hotspot, as will be displayed to the user. 
 * @type {!string}
 * @export
 */
API.Client.Hotspot.prototype.description;

