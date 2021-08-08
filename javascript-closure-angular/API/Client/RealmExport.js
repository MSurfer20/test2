goog.provide('API.Client.RealmExport');

/**
 * Object containing details about a realm export. 
 * @record
 */
API.Client.RealmExport = function() {}

/**
 * The id of the export. 
 * @type {!number}
 * @export
 */
API.Client.RealmExport.prototype.id;

/**
 * The id of the user who did the export. 
 * @type {!number}
 * @export
 */
API.Client.RealmExport.prototype.actingUserId;

/**
 * The UNIX timestamp of when the export was made. 
 * @type {!number}
 * @export
 */
API.Client.RealmExport.prototype.exportTime;

/**
 * The timestamp of when the export was deleted. Null if it wasn't. 
 * @type {!number}
 * @export
 */
API.Client.RealmExport.prototype.deletedTimestamp;

/**
 * The timestamp of when the export failed. Null if it didn't. 
 * @type {!number}
 * @export
 */
API.Client.RealmExport.prototype.failedTimestamp;

/**
 * The URL of the export. `null` if there's no URL. 
 * @type {!string}
 * @export
 */
API.Client.RealmExport.prototype.exportUrl;

/**
 * Whether the export is pending or not. 
 * @type {!boolean}
 * @export
 */
API.Client.RealmExport.prototype.pending;

