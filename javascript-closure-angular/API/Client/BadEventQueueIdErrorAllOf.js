goog.provide('API.Client.BadEventQueueIdError_allOf');

/**
 * @record
 */
API.Client.BadEventQueueIdErrorAllOf = function() {}

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.BadEventQueueIdErrorAllOf.prototype.result;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.BadEventQueueIdErrorAllOf.prototype.msg;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.BadEventQueueIdErrorAllOf.prototype.code;

/**
 * The string that identifies the invalid event queue. 
 * @type {!string}
 * @export
 */
API.Client.BadEventQueueIdErrorAllOf.prototype.queueId;

