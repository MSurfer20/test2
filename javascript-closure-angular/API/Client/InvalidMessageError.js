goog.provide('API.Client.InvalidMessageError');

/**
 * @record
 */
API.Client.InvalidMessageError = function() {}

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.InvalidMessageError.prototype.result;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.InvalidMessageError.prototype.msg;

/**
 * The raw content of the message. 
 * @type {!string}
 * @export
 */
API.Client.InvalidMessageError.prototype.rawContent;

