goog.provide('API.Client.CodedErrorBase');

/**
 * @record
 */
API.Client.CodedErrorBase = function() {}

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.CodedErrorBase.prototype.result;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.CodedErrorBase.prototype.msg;

/**
 * A string that identifies the error. 
 * @type {!string}
 * @export
 */
API.Client.CodedErrorBase.prototype.code;

