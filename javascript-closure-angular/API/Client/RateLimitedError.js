goog.provide('API.Client.RateLimitedError');

/**
 * @record
 */
API.Client.RateLimitedError = function() {}

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.RateLimitedError.prototype.result;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.RateLimitedError.prototype.msg;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.RateLimitedError.prototype.code;

