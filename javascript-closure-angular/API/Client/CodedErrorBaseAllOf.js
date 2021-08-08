goog.provide('API.Client.CodedErrorBase_allOf');

/**
 * @record
 */
API.Client.CodedErrorBaseAllOf = function() {}

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.CodedErrorBaseAllOf.prototype.result;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.CodedErrorBaseAllOf.prototype.msg;

/**
 * A string that identifies the error. 
 * @type {!string}
 * @export
 */
API.Client.CodedErrorBaseAllOf.prototype.code;

