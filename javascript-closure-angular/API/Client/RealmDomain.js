goog.provide('API.Client.RealmDomain');

/**
 * Object containing details of the newly added domain. 
 * @record
 */
API.Client.RealmDomain = function() {}

/**
 * The new allowed domain. 
 * @type {!string}
 * @export
 */
API.Client.RealmDomain.prototype.domain;

/**
 * Whether subdomains are allowed for this domain. 
 * @type {!boolean}
 * @export
 */
API.Client.RealmDomain.prototype.allowSubdomains;

