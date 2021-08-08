goog.provide('API.Client.AddSubscriptionsResponse_allOf');

/**
 * @record
 */
API.Client.AddSubscriptionsResponseAllOf = function() {}

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.AddSubscriptionsResponseAllOf.prototype.result;

/**
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.AddSubscriptionsResponseAllOf.prototype.msg;

/**
 * A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
 * @type {!Object<!string, Array<!string>>}
 * @export
 */
API.Client.AddSubscriptionsResponseAllOf.prototype.subscribed;

/**
 * A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
 * @type {!Object<!string, Array<!string>>}
 * @export
 */
API.Client.AddSubscriptionsResponseAllOf.prototype.alreadySubscribed;

/**
 * A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.AddSubscriptionsResponseAllOf.prototype.unauthorized;

