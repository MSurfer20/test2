goog.provide('API.Client.ApiKeyResponse_allOf');

/**
 * @record
 */
API.Client.ApiKeyResponseAllOf = function() {}

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.ApiKeyResponseAllOf.prototype.result;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.ApiKeyResponseAllOf.prototype.msg;

/**
 * The API key that can be used to authenticate as the requested user. 
 * @type {!string}
 * @export
 */
API.Client.ApiKeyResponseAllOf.prototype.apiKey;

/**
 * The email address of the user who owns the API key 
 * @type {!string}
 * @export
 */
API.Client.ApiKeyResponseAllOf.prototype.email;

