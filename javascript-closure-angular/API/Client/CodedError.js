goog.provide('API.Client.CodedError');

/**
 * @record
 */
API.Client.CodedError = function() {}

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.CodedError.prototype.result;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.CodedError.prototype.msg;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.CodedError.prototype.code;

