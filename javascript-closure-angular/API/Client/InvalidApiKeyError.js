goog.provide('API.Client.InvalidApiKeyError');

/**
 * @record
 */
API.Client.InvalidApiKeyError = function() {}

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.InvalidApiKeyError.prototype.result;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.InvalidApiKeyError.prototype.msg;

