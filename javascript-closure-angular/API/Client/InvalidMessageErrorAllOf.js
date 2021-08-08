goog.provide('API.Client.InvalidMessageError_allOf');

/**
 * @record
 */
API.Client.InvalidMessageErrorAllOf = function() {}

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.InvalidMessageErrorAllOf.prototype.result;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.InvalidMessageErrorAllOf.prototype.msg;

/**
 * The raw content of the message. 
 * @type {!string}
 * @export
 */
API.Client.InvalidMessageErrorAllOf.prototype.rawContent;

