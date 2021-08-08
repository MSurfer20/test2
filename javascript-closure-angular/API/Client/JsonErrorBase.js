goog.provide('API.Client.JsonErrorBase');

/**
 * @record
 */
API.Client.JsonErrorBase = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.JsonErrorBase.prototype.result;

/**
 * @type {!string}
 * @export
 */
API.Client.JsonErrorBase.prototype.msg;

/** @enum {string} */
API.Client.JsonErrorBase.ResultEnum = { 
  error: 'error',
}
