goog.provide('API.Client.Attachments');

/**
 * Dictionary containing details of a file uploaded by a user. 
 * @record
 */
API.Client.Attachments = function() {}

/**
 * The unique ID for the attachment. 
 * @type {!number}
 * @export
 */
API.Client.Attachments.prototype.id;

/**
 * Name of the uploaded file. 
 * @type {!string}
 * @export
 */
API.Client.Attachments.prototype.name;

/**
 * A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. 
 * @type {!string}
 * @export
 */
API.Client.Attachments.prototype.pathId;

/**
 * Size of the file in bytes. 
 * @type {!number}
 * @export
 */
API.Client.Attachments.prototype.size;

/**
 * Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
 * @type {!number}
 * @export
 */
API.Client.Attachments.prototype.createTime;

/**
 * Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
 * @type {!Array<!API.Client.Attachments_messages>}
 * @export
 */
API.Client.Attachments.prototype.messages;

