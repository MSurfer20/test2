goog.provide('API.Client.ApiKeyResponse');

/**
 * @record
 */
API.Client.ApiKeyResponse = function() {}

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.ApiKeyResponse.prototype.result;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.ApiKeyResponse.prototype.msg;

/**
 * The API key that can be used to authenticate as the requested user. 
 * @type {!string}
 * @export
 */
API.Client.ApiKeyResponse.prototype.apiKey;

/**
 * The email address of the user who owns the API key 
 * @type {!string}
 * @export
 */
API.Client.ApiKeyResponse.prototype.email;

