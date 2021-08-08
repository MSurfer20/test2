goog.provide('API.Client.JsonSuccessBase');

/**
 * @record
 */
API.Client.JsonSuccessBase = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.JsonSuccessBase.prototype.result;

/**
 * @type {!string}
 * @export
 */
API.Client.JsonSuccessBase.prototype.msg;

/** @enum {string} */
API.Client.JsonSuccessBase.ResultEnum = { 
  success: 'success',
}
