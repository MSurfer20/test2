goog.provide('API.Client.MissingArgumentError');

/**
 * @record
 */
API.Client.MissingArgumentError = function() {}

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.MissingArgumentError.prototype.result;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.MissingArgumentError.prototype.msg;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.MissingArgumentError.prototype.code;

/**
 * It contains the information about the missing parameter. 
 * @type {!string}
 * @export
 */
API.Client.MissingArgumentError.prototype.varName;

