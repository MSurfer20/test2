// tslint:disable
/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import {
    AttachmentsMessages,
    AttachmentsMessagesFromJSON,
    AttachmentsMessagesToJSON,
} from './';

/**
 * Dictionary containing details of a file uploaded by a user. 
 * @export
 * @interface Attachments
 */
export interface Attachments  {
    /**
     * The unique ID for the attachment. 
     * @type {number}
     * @memberof Attachments
     */
    id?: number;
    /**
     * Name of the uploaded file. 
     * @type {string}
     * @memberof Attachments
     */
    name?: string;
    /**
     * A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. 
     * @type {string}
     * @memberof Attachments
     */
    pathId?: string;
    /**
     * Size of the file in bytes. 
     * @type {number}
     * @memberof Attachments
     */
    size?: number;
    /**
     * Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
     * @type {number}
     * @memberof Attachments
     */
    createTime?: number;
    /**
     * Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
     * @type {Array<AttachmentsMessages>}
     * @memberof Attachments
     */
    messages?: Array<AttachmentsMessages>;
}

export function AttachmentsFromJSON(json: any): Attachments {
    return {
        'id': !exists(json, 'id') ? undefined : json['id'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'pathId': !exists(json, 'path_id') ? undefined : json['path_id'],
        'size': !exists(json, 'size') ? undefined : json['size'],
        'createTime': !exists(json, 'create_time') ? undefined : json['create_time'],
        'messages': !exists(json, 'messages') ? undefined : (json['messages'] as Array<any>).map(AttachmentsMessagesFromJSON),
    };
}

export function AttachmentsToJSON(value?: Attachments): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'id': value.id,
        'name': value.name,
        'path_id': value.pathId,
        'size': value.size,
        'create_time': value.createTime,
        'messages': value.messages === undefined ? undefined : (value.messages as Array<any>).map(AttachmentsMessagesToJSON),
    };
}


