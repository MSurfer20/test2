goog.provide('API.Client.Presence');

/**
 * `{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. 
 * @record
 */
API.Client.Presence = function() {}

/**
 * The client's platform name. 
 * @type {!string}
 * @export
 */
API.Client.Presence.prototype.client;

/**
 * The status of the user on this client. It is either `idle` or `active`. 
 * @type {!string}
 * @export
 */
API.Client.Presence.prototype.status;

/**
 * The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. 
 * @type {!number}
 * @export
 */
API.Client.Presence.prototype.timestamp;

/**
 * Whether the client is capable of showing mobile/push notifications to the user. 
 * @type {!boolean}
 * @export
 */
API.Client.Presence.prototype.pushable;

/** @enum {string} */
API.Client.Presence.StatusEnum = { 
  idle: 'idle',
  active: 'active',
}
