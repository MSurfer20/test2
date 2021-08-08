goog.provide('API.Client.MissingArgumentError_allOf');

/**
 * ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
 * @record
 */
API.Client.MissingArgumentErrorAllOf = function() {}

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.MissingArgumentErrorAllOf.prototype.result;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.MissingArgumentErrorAllOf.prototype.msg;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.MissingArgumentErrorAllOf.prototype.code;

/**
 * It contains the information about the missing parameter. 
 * @type {!string}
 * @export
 */
API.Client.MissingArgumentErrorAllOf.prototype.varName;

