goog.provide('API.Client.NonExistingStreamError');

/**
 * @record
 */
API.Client.NonExistingStreamError = function() {}

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.NonExistingStreamError.prototype.result;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.NonExistingStreamError.prototype.msg;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.NonExistingStreamError.prototype.code;

/**
 * The name of the stream that could not be found. 
 * @type {!string}
 * @export
 */
API.Client.NonExistingStreamError.prototype.stream;

