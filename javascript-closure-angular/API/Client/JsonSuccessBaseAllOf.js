goog.provide('API.Client.JsonSuccessBase_allOf');

/**
 * @record
 */
API.Client.JsonSuccessBaseAllOf = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.JsonSuccessBaseAllOf.prototype.result;

/**
 * @type {!string}
 * @export
 */
API.Client.JsonSuccessBaseAllOf.prototype.msg;

/** @enum {string} */
API.Client.JsonSuccessBaseAllOf.ResultEnum = { 
  success: 'success',
}
