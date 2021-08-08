goog.provide('API.Client.JsonErrorBase_allOf');

/**
 * @record
 */
API.Client.JsonErrorBaseAllOf = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.JsonErrorBaseAllOf.prototype.result;

/**
 * @type {!string}
 * @export
 */
API.Client.JsonErrorBaseAllOf.prototype.msg;

/** @enum {string} */
API.Client.JsonErrorBaseAllOf.ResultEnum = { 
  error: 'error',
}
