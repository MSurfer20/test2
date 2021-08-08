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

import { RequestFile } from './models';

export class AttachmentsMessages {
    /**
    * Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. 
    */
    'dateSent'?: number;
    /**
    * The unique message ID.  Messages should always be displayed sorted by ID. 
    */
    'id'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "dateSent",
            "baseName": "date_sent",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return AttachmentsMessages.attributeTypeMap;
    }
}

