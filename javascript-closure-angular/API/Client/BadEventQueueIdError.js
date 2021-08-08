goog.provide('API.Client.BadEventQueueIdError');

/**
 * @record
 */
API.Client.BadEventQueueIdError = function() {}

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.BadEventQueueIdError.prototype.result;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.BadEventQueueIdError.prototype.msg;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.BadEventQueueIdError.prototype.code;

/**
 * The string that identifies the invalid event queue. 
 * @type {!string}
 * @export
 */
API.Client.BadEventQueueIdError.prototype.queueId;

